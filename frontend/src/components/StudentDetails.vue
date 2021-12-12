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
import PortfolioDetail from './PortfolioDetail.vue'

export default {
  name: "student-profile",
  components: { DegreeList, ExperienceList, PortfolioDetail },
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
button {
  background-color: #deacff;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 20px;
  color: #000000;
  display: inline-block;
  width: auto;
  height: auto;
  white-space: normal;
  text-align: center;
  padding: 10px;
  border-radius: 20%;
}

button:hover {
  opacity: 0.8;
}

h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 4em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 20px;
  border-radius: 5%;
}

div.header p {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: left;
  font-size: 1em;
  margin-top: 0.5em;
  margin-bottom: 0.15em;
  color: #0099ff;
}

label {
  color: #0099ff;
  font-size: 17px;
  background-image: linear-gradient(#a4e5ff, #ffffffa6);
}

.student-info{
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: left;
  font-size: 1em;
  margin-top: 0.5em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  padding: 10px;
  border-radius: 5%;
}

.students {
  color: #0099ff;
  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  background-size: auto;
}

a {
  float: left;
  /* background-color: #90ffeb; */
}
</style>