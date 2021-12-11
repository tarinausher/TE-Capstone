import axios from 'axios';

export default {

  getStudent(id) {
      return axios.get(`/student/${id}`)
  },

  listStudents() {
      return axios.get('/student')
  }
}