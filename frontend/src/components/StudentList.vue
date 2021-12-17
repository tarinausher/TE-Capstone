<template>
  <div id="main">
    <article class="card">
      <div  v-for="student in students" v-bind:key="student.id" >    
          <div class="student">
           <img v-bind:src="require('../assets/img/' + student.userId + '.jpg')" alt="placeholder" />
          <h3>{{student.firstName}}&nbsp;{{student.lastName}}</h3>
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
#main {
  text-indent: 1em;
  justify-content:space-evenly;
}

h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: right;
  font-size: 2em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 10px;
  border-radius: 5%;

}

img {
  height: 150px;
  width: 150px;
  border: 5px#deacff solid;
  border-radius: 50%;
  justify-content: center;
}

h3 {
  font-size: 1.5em;
}

h3, p {
  font-family: Geneva, Tahoma, sans-serif;
}

.card {
  grid-area: card;
}

.student {
  border-radius: 15px ;
  background-color: linear-gradient(#a4e5ff, #ffffffa6);
  justify-content: center;
  border-style: outset;
  border-color: #deacff;
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