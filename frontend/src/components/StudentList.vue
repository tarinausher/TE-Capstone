<template>
  <table>
    <thead>
      <tr>
        <th>&nbsp;</th>
        <th>Student Name</th>
        <th>Cohort ID</th>
        <button v-on:click="viewProfile(student.id)">Why wont this work</button>
      </tr>
    </thead>
    <tbody>
      <tr v-for="student in students" :key="student.id" v-on:click="viewProfile(student.id)">
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
        viewProfile(id) {
            this.$router.push(`/student/${id}`);
        },
        getStudents() {
            profileService.list().then(response => {
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