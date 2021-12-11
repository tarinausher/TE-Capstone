<template>
  <div id='main'>
      <h2>Portfolio</h2>
        <div class='projects' v-for="project in projects" v-bind:key="project.id">
            <p>Title: {{ project.title }}</p>
            <p>Description: {{ project.description }}</p>
            <p>Technologies: {{ project.technologies }}</p>
            <p>Link to Project: {{ project.link }}</p>        
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
        }
    },
    created() {
        this.retrieveProjects();
    }
}
</script>

<style>

</style>