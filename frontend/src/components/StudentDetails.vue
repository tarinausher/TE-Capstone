<template>
  <div id='main'>
      <div class='student-profile' v-bind:key="student.userId">   
          <h1>{{student.firstName}}&nbsp;{{student.lastName}}</h1>
          <p>Cohort: {{student.cohortId}}</p>
          <p>About: {{student.summary}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>
          <p>Education: TODO: IMPLEMENT DEGREE SPECIFIC COMPONENT TO POPULATE DEGREE DATA</p>
          <p>Professional Experience: TODO: IMPLEMENT EXPERIENCE SPECIFIC COMPONENT TO POPULATE DEGREE DATA</p>
          
          <h2>Porfolio</h2>
          <p>Portfolio Projects: TODO: IMPLEMENT PROJECT PORTFOLIO SPECIFIC COMPONENT</p>
          <p>Probably some links, maybe the github external api, tbd</p>
      </div>
    </div>
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "student-profile",
    data() {
        return {
            student: {
                firstName: '',
                lastName: '',
                cohortId: null
            }
        }
    },
    methods: {
        retrieveStudent() {
            profileService.getStudent(this.$route.params.id).then( (response) => {
                this.student = response.data;
            });
        }
    },
    created() {
        this.retrieveStudent();
    }
}
</script>

<style>

</style>