<template>
  <div id='main'>
      <h2>Education</h2>
      <br>
        <div class='degrees' v-for="degree in degrees" v-bind:key="degree.id">
          <div class='delete-degree'>
            <button v-on:click="deleteDegree">x</button> <!-- nonfunctional at this time --> 
          </div>
            <div class="degree-info">
            <p><strong>Level: </strong>{{ degree.level }}</p>
            <p><strong>Institution: </strong>{{ degree.institution}}</p>
            <p><strong>Subject Area: </strong>{{ degree.subjectArea }}</p>
            <p><strong>Date Completed: </strong>{{ degree.dateCompleted }}</p>
         </div>

          
        </div>

  </div>
</template>

<script>
import profileService from "../services/ProfileService";


export default {
    name: "degree-list",
    data() {
        return {
            degrees: []
        }
    },
    methods: {
        retrieveDegrees() {
            profileService.getDegrees(this.$route.params.id).then( (response) => {
                this.degrees = response.data;
            });
        },
        deleteDegree() {
          if (confirm("Are you sure you want to delete this? This action cannot be undone.")) {
            profileService.deleteDegree(this.degree.degreeId).then(response => {
            if (response.status === 200) {
              alert("Degree successfully deleted");
            }
          })
          }
        }
    },
    created() {
        this.retrieveDegrees();
    }
}
</script>

<style>
#main {
  justify-content:space-evenly;
}

h2 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 2em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 5px;
  border-radius: 5%;
}

.degrees {
    border-radius: 15px ;
    border-bottom: black;
    border-style: solid;
    border-width: medium;
}

.delete-degree{
    float: right;
}

.students {
  border-radius: 5%;
}

h2 {
  font-size: 1.8em;
}

h2, p {
  font-family: Geneva, Tahoma, sans-serif;
}

.projects {
  border-radius: 5%;
}

a {
  float: center;
  /* background-color: #90ffeb; */
}
</style>