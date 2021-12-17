<template>
  <div id='main'>
      <h2>Professional Experience</h2>
      <br>
        <div class='experience' v-for="experience in experiences" v-bind:key="experience.id">
            <p><strong>Industry:</strong> {{ experience.industry }}</p>
            <p><strong>Title:</strong> {{ experience.title}}</p>
            <p><strong>Organization:</strong> {{ experience.organization }}</p>
            <p><strong>Date Started: </strong>{{ experience.dateStarted }}</p>
            <p><strong>Date Ended:</strong> {{ experience.dateEnded }}</p>
            <p><strong>Description:</strong> {{ experience.description }}</p>            
        </div>
        <div class="buttons">
        <add-experience />
        </div>
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

.buttons {
  display: inline-block;
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