<template>
  <div id='main'>
      <div class='student-profile' v-for="student in students" v-bind:key="student.id">    
          <p>Student Name: {{student.firstName}}&nbsp;{{student.lastName}}</p>
          <p>Cohort ID: {{student.cohortId}}</p>
          <p>About: {{student.summary}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>
          <p>Degrees: TODO <!-- will likely need a separate component for this--></p>
          <p>Experiences: TODO <!-- will likely need a separate component for this--></p>
          <p>Portfolio Projects: TODO <!-- will likely need a separate component for this--></p>
          <br />
      </div>
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