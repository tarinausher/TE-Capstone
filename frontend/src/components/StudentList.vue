<template>
  <div id='main'>
    <h1>Bootcamp Students</h1>
      <div class='students' v-for="student in students" v-bind:key="student.id" >    
          
          <p>Student Name: {{student.firstName}}&nbsp;{{student.lastName}}</p>
          <p>Cohort: {{student.cohortId}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>
          <p>Portfolio Projects: TODO: BY TITLE <!-- will likely need a separate component for this--></p>
          
          <router-link v-bind:to="{ name: 'student-profile', params: { id: student.userId }}">
          <button>View Profile</button>
          </router-link>
          <br />
      </div>
      <br />
    </div>
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
      retrieveStudents() {
        profileService.listStudents().then( (response) => {
          this.students = response.data;
        });
      }
    },
    created() {
      this.retrieveStudents();
    }
   
};

</script>

<style>

</style>