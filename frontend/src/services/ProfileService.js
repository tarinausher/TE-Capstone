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

  addExperience(experience) { 
    return axios.post('/experience', experience)
   },

  addProject(project) { 
    return axios.post('/project', project)
   },

   addStudent(student) {
     return axios.post('/student', student)
   },

  // updateDegree(id) { PUT },

  // updateExperience(id) { PUT },

  // updateProject(id) { PUT },

  deleteDegree(degreeId) {
    return axios.delete(`/degree/${degreeId}`)    
   },

  deleteExperience(experienceId) {
    return axios.delete(`/experience/${experienceId}`)    
   },

  deleteProject(projectId) {
    return axios.delete(`/experience/${projectId}`)    
  },
  
  // updateProfile(id) {
  // WILL BE USED TO CONNECT TO THE PROFILE UPDATE ENDPOINT
  // }

}