<template>
  <div id='main'>
      <div class='student-info' v-bind:key="student.userId">   
          <h1>{{student.firstName}}&nbsp;{{student.lastName}}</h1>
          <p>Cohort: {{student.cohortId}}</p>
          <p>About: {{student.summary}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>
          <degree-list />
          <experience-list />
          <portfolio-detail />
      </div>
    </div>
</template>

<script>
import profileService from "../services/ProfileService";
import DegreeList from './DegreeList.vue';
import ExperienceList from './ExperienceList.vue';

export default {
  components: { DegreeList, ExperienceList },
  name: "student-profile",
  data() {
      return {
          student: {}
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