<template>
  <table>
    <thead>
      <tr>
        <th>&nbsp;</th>
        <th>Student Name</th>
        <th>Cohort ID</th>
        <button v-on:click="viewProfile(student.userId)">Why wont this work</button>
      </tr>
    </thead>
    <tbody>
      <tr v-for="student in students" :key="student.userId" v-on:click="viewProfile(student.userId)">
        <td class="name">{{ student.firstName }} ???? {{ student.lastName }}</td>
        
      </tr>
    </tbody>
  </table>
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "student-list",
    data() {
        return {
            students: []
        };
    },
    methods: { 
        getStudentProfile(id) {
            this.$router.push(`/student/${id}`);
        },
        getStudents() {
            profileService.listAllStudents().then(response => {
                this.$store.commit("SET_STUDENT_LIST", response.data);
            });
        }
    },
    created() {
       this.getStudents();
    }
};

</script>

<style>

</style>