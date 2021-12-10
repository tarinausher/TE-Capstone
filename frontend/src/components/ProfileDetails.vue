<template>
    <div>
        <h1>Name: {{ profile.firstName }} {{ profile.lastName }}</h1>
        <p>Cohort: {{ profile.cohortId }}</p>
        <p>About: {{ profile.summary }}</p>
    <!--Will require technologies, soft skills, contact pref. -->
    </div> 
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "profile-details",
    props: {
        'studentId': Number
    },
    data() {
        return {
            profile: {
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