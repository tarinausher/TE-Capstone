<template>
  <div id='main'>
      <h2>Portfolio</h2>
      <br>
        <div class='projects' v-for="project in projects" v-bind:key="project.id">
          <div class='delete-project'>
            <button v-on:click="deleteProject">x</button> <!-- nonfunctional at this time --> 
          </div>
            <p><strong>Title:</strong> {{ project.title }}</p>
            <p><strong>Description:</strong> {{ project.description }}</p>
            <p><strong>Technologies: </strong>{{ project.technologies }}</p>
            <p><a :href="project.link"><strong>Link to Project</strong></a></p>
            <br>
            <br>    
        </div>


  </div>

</template>

<script>
import profileService from "../services/ProfileService";

export default {
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
        },
        deleteProject() {
          if (confirm("Are you sure you want to delete this? This action cannot be undone.")) {
            profileService.deleteDegree(this.project.projectId).then(response => {
            if (response.status === 200) {
              alert("Project successfully deleted");
            }
          })
          }
        }
    },
    created() {
        this.retrieveProjects();
    }
}
</script>

<style>
.projects {
    border-radius: 15px ;
    border-bottom: black;
    border-style: solid;
    border-width: medium;
}

.delete-project {
    float: right;
}

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