<template>
  <div id='main'>
      <div class='student-profile' >   
          <p>{{ student}}</p> 
          <p>Student Name: {{student.firstName}}&nbsp;{{student.lastName}}</p>
          <p>Cohort: {{student.cohortId}}</p>
      </div>
    </div>
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "student-profile",
    data() {
        return {
            student: {
                firstName: '',
                lastName: '',
                cohortId: null
            }
        }
    },
    methods: {
        retrieveStudent() {
            profileService.getStudent(this.$route.params.id).then( (response) => {
                this.student = response.data;
            });
        }
    },
    created() {
        this.retrieveStudent();
    }
}
</script>

<style>

</style>