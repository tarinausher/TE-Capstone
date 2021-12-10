import axios from 'axios';

export default {

  getStudentProfile(id) {
      return axios.get(`/student/${id}`)
  },

  listAllStudents() {
      return axios.get('/student')
  }
}