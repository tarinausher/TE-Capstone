<template>
  <div id='main'>
    <article class="card">
      <div  v-for="student in students" v-bind:key="student.id" >    
          <div class="student">
           <img src="https://via.placeholder.com/120" alt="placeholder">
            
          <p>Student Name: {{student.firstName}}&nbsp;{{student.lastName}}<br>
          Cohort: {{student.cohortId}}<br>
          Technical Skills: {{student.technologies}}<br>
          Soft Skills: {{student.softSkills}}</p>

          <router-link v-bind:to="{ name: 'student-profile', params: { id: student.userId }}">
          <button>View Profile</button>
          </router-link>
          <br>
          <br>
          <br> 
          </div>
      </div>
    </article>
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

.card {
  grid-area: card;
}

.student {
  border-radius: 15px ;
  background-color: #e6e4e4;
  justify-content: center;
}

article {
  /* display: inline-flex; */
  /* flex-direction: row; */
  display: grid;
  grid-template-areas: 
    "card card card"
    "card card card"
    "card card card";
  grid-template-columns: 2fr 2fr 2fr;
  grid-template-rows: 2fr 2fr 2fr ;
  
}

a {
  float: left;
  /* background-color: #90ffeb; */
}
</style>