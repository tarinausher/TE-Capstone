import axios from 'axios';

export default {

  getStudent(id) {
    return axios.get(`/student/${id}`)
  },

  listStudents() {
    return axios.get('/student')
  },

  getDegrees(id) {
    return axios.get(`/student/${id}/degrees`)
  },

  getExperiences(id) {
    return axios.get(`/student/${id}/experiences`)
  },

  getProjects(id) {
    return axios.get(`/student/${id}/projects`)
  },

  addDegree(degree) {
    return axios.post('/degree', degree)
  },

  addExperience(id) {   
    return axios
     .create(id.experience)
     .then (response => {
        if (response.status === 201) {
          this.$router.push("/student/:id");
        }
      })
     .catch(error => {
        console.error(error);
      });
  },

  addProject(id) { 
      return axios
       .create(id.project)
       .then (response => {
          if (response.status === 201) {
            this.$router.push("/student/:id");
          }
        })
       .catch(error => {
          console.error(error);
      });
  }

  // updateDegree(id) { PUT },

  // updateExperience(id) { PUT },

  // updateProject(id) { PUT },

  // deleteDegree(id) { DELETE },

  // deleteExperience(id) { DELETE },

  // deleteProject(id) { DELETE },
  
  // updateProfile(id) {
  // WILL BE USED TO CONNECT TO THE PROFILE UPDATE ENDPOINT
  // }

}