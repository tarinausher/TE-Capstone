<template>
  <div id='main'>
      <h2>Portfolio</h2>
        <div class='projects' v-for="project in projects" v-bind:key="project.id">
            <p>Title: {{ project.title }}</p>
            <p>Description: {{ project.description }}</p>
            <p>Technologies: {{ project.technologies }}</p>
            <!--Will need to include Individual vs Group-->
            <p>Link to Project: {{ project.link }}</p> 
            <!--Will need to adjust link to project above -->       
        </div>
      <add-project />
  </div>

</template>

<script>
import profileService from "../services/ProfileService";
import AddProject from './AddProject.vue';

export default {
    components: { AddProject },
    name: "project-list",
    data() {
        return {
            projects: []
        }
    },
    methods: {
        retrieveProjects() {
            profileService.getProjects(this.$route.params.id).then( (response) => {
                this.projects = response.data;
            });
        }
    },
    created() {
        this.retrieveProjects();
    }
}
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