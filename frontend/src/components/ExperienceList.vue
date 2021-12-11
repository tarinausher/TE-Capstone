<template>
  <div id='main'>
      <h2>Professional Experience</h2>
        <div class='experience' v-for="experience in experiences" v-bind:key="experience.id">
            <p>Industry: {{ experience.industry }}</p>
            <p>Title: {{ experience.title}}</p>
            <p>Organization: {{ experience.organization }}</p>
            <p>Date Started: {{ experience.dateStarted }}</p>
            <p>Date Ended: {{ experience.dateEnded }}</p>
            <p>Description: {{ experience.description }}</p>            
        </div>
  </div>

</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "experience-list",
    data() {
        return {
            experiences: []
        }
    },
    methods: {
        retrieveExperiences() {
            profileService.getExperiences(this.$route.params.id).then( (response) => {
                this.experiences = response.data;
            });
        }
    },
    created() {
        this.retrieveExperiences();
    }
}
</script>

<style>

</style>