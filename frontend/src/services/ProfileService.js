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

  addDegree(id) {
    return axios.post('/degree')
  }

  // addExperience(id) { POST },

  // addProject(id) { POST },

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