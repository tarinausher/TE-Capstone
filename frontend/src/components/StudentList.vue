<template>
  <div id='main'>
    <h1>Bootcamp Students</h1>
    <br>
    <br>
      <div class='students' v-for="student in students" v-bind:key="student.id" >    
          
          <h3>{{student.firstName}}&nbsp;{{student.lastName}}</h3>
          <p>Cohort: {{student.cohortId}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>

          <router-link v-bind:to="{ name: 'student-profile', params: { id: student.userId }}">
          <button>View Profile</button>
          </router-link>
          <br>

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
#main {
  text-indent: 1em;
  justify-content:space-evenly;
}

h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 2em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 10px;
  border-radius: 5%;
}

h3 {
  font-size: 1.5em;
}

h3, p {
  font-family: Geneva, Tahoma, sans-serif;
  margin: 5px 0px 5px 0px;
}
</style>