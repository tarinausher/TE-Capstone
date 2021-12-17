<template>
  <div id='main'>
      <div class='student-info' v-bind:key="student.userId">   
        <br>
           <img v-bind:src="require('../assets/img/' + student.userId + '.jpg')" alt="placeholder" />
          <br>
          <h1>{{student.firstName}}&nbsp;{{student.lastName}}</h1>
          <h3><a href="https://github.com/"> GitHub </a> <a href="https://linkedin.com/">LinkedIn</a></h3>

          <div class="update-button"> 
            <update-profile/>
          </div>
          <div class="publish">
            <button>Publish</button>
          </div>

          <br>
          <br>
          <p><strong>Cohort: </strong>{{student.cohortId}}</p>
          <p><strong>About: </strong>{{student.summary}}</p>
          <p><strong>Technical Skills: </strong>{{student.technologies}}</p>
          <p><strong>Soft Skills: </strong>{{student.softSkills}}</p>
          <br>

          <degree-list />
          <add-degree :userId='student.userId' />
          <br>
          <experience-list />
          <add-experience :userId='student.userId' />
          <br>
          <portfolio-detail />
          <add-project :userId='this.student.userId' />
      </div>

    </div>
</template>
 
<script>
import profileService from "../services/ProfileService";
import DegreeList from './DegreeList.vue';
import ExperienceList from './ExperienceList.vue';
import PortfolioDetail from './PortfolioDetail.vue'
import UpdateProfile from './UpdateProfile.vue';
import AddDegree from './AddDegree.vue'
import AddExperience from './AddExperience.vue';
import AddProject from './AddProject.vue';
 
export default {
  name: "student-profile",
  components: { DegreeList, ExperienceList, PortfolioDetail, UpdateProfile, AddDegree, AddExperience, AddProject },
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
 
.update-button, .publish {
  float: right;
}

.students, .student-info {
  color: #0099ff;
  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  background-size: auto;
  
}
</style>
