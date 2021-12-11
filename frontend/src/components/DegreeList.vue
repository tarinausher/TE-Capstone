<template>
  <div id='main'>
      <h2>Education</h2>
        <div class='degrees' v-for="degree in degrees" v-bind:key="degree.id">
            <p>Level: {{ degree.level }}</p>
            <p>Institution: {{ degree.institution}}</p>
            <p>Subject Area: {{ degree.subjectArea }}</p>
            <p>Date Completed: {{ degree.dateCompleted }}</p>
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
        }
    },
    created() {
        this.retrieveDegrees();
    }
}
</script>

<style>

</style>