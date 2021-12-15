<template>
  <div id='main'>
      <h2>Education</h2>
      <br>
        <div class='degrees' v-for="degree in degrees" v-bind:key="degree.id">
            <p>Level: {{ degree.level }}</p>
            <p>Institution: {{ degree.institution}}</p>
            <p>Subject Area: {{ degree.subjectArea }}</p>
            <p>Date Completed: {{ degree.dateCompleted }}</p>
        </div>
        <div class='add-degree'>
          <add-degree />
        </div>
        <div class='delete-degree'>
        </div>
  </div>
</template>

<script>
import profileService from "../services/ProfileService";
import AddDegree from './AddDegree.vue';

export default {
  components: { AddDegree },
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