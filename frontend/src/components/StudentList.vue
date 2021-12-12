<template>
  <div id='main'>
    <h1>Bootcamp Students</h1>
    <div class="card">
      <div class='profile.container' v-for="student in students" v-bind:key="student.id" >    
    <br>
    <br>
      <div class='students' v-for="student in students" v-bind:key="student.id" >    
          
          <h2>{{student.firstName}}&nbsp;{{student.lastName}}</h2>
          <p>Cohort: {{student.cohortId}}</p>
          <p>Technical Skills: {{student.technologies}}</p>
          <p>Soft Skills: {{student.softSkills}}</p>

          <router-link v-bind:to="{ name: 'student-profile', params: { id: student.userId }}">
          <button>View Profile</button>
          </router-link>
          <br>
          <br>
          <br> 

      </div>
      </div>
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
button {
  background-color: #deacff;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 15px;
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

#main {
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

.students {
  border-radius: 5%;
}

h2 {
  font-size: 1.5em;
}

h2, p {
  font-family: Geneva, Tahoma, sans-serif;
}

a {
  float: left;
  background-color: #90ffeb;
}
</style>