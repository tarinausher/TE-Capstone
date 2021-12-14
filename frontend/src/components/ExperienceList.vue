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

        <add-experience />
  </div>

</template>

<script>
import profileService from "../services/ProfileService";
import AddExperience from './AddExperience.vue';

export default {
  components: { AddExperience },
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
#main {
  justify-content:space-evenly;
}

.experience {
    border-radius: 15px ;
    border-bottom: black;
    border-style: solid;
    border-width: medium;
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

.experience {
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