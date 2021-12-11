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
  }


}