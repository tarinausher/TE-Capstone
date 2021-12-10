<template>
    <div>
        <h1 v-bind:key="student.firstName">Name: {{ student.firstName }} {{ student.lastName }}</h1>
        <p>Cohort: {{ student.cohortId }}</p>
        <p>About: {{ student.summary }}</p>
        <p>Tech Skills: {{ student.technologies }}</p>
        <p>Soft Skills: {{ student.softSkills }}</p>
        <p>Portfolio</p>

    <!--Will require technologies, soft skills, contact pref. -->
    </div> 
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "profile-details",
    props: ['students'],
    data() {
        return {
            student: {
                id: null,
                firstName: '',
                lastName: '',
                cohortId: '',
                summary: '',
                technologies: '',
                softSkills: '',
                contactPreferences: '',
                isPublished: false
            }
        };
    },

    created() {
        profileService.get(this.$route.params.id).then((response) => {
            this.profile = response.data;
        })
    }
}
</script>

<style>

</style>