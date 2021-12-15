<template>
  <div id='main'>
      <div class='student-info' v-bind:key="student.userId">   
        <br>
          <h1>{{student.firstName}}&nbsp;{{student.lastName}}</h1>
          <div class="update-button"> 
            <update-profile/>
          </div>
          <p>Cohort: {{student.cohortId}}</p>
          <p>About: {{student.summary}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>
          <br>
          <degree-list />
          <br>
          <experience-list />
          <br>
          <portfolio-detail />
      </div>
    </div>
</template>
 
<script>
import profileService from "../services/ProfileService";
import DegreeList from './DegreeList.vue';
import ExperienceList from './ExperienceList.vue';
import PortfolioDetail from './PortfolioDetail.vue'
import UpdateProfile from './UpdateProfile.vue';
 
export default {
  name: "student-profile",
  components: { DegreeList, ExperienceList, PortfolioDetail, UpdateProfile },
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
h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 4em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;
}
 
.update-button {
  float: right;
}

.students, .student-info {
  color: #0099ff;
  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  background-size: auto;
}
</style>
