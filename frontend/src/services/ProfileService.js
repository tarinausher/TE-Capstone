import axios from 'axios';

export default {

  get(id) {
      return axios.get(`/student/${id}`)
  },

  list() {
      return axios.get('/student')
  }
}