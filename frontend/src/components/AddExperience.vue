<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Experience</button>

    <form v-show="showForm" id="formAddExperience">
        <div class="field">
            <label for="industry">Industry: </label>
            <input type="text" name="industry" v-model="experience.industry" />
        </div>
        <div class="field">
            <label for="title">Institution: </label>
            <input type="text" name="title" v-model="experience.title" />
        </div>
        <div class="field">
            <label for="organization">Organization: </label>
            <input type="text" name="organization" v-model="experience.organization" />
        </div>
        <div class="field">
            <label for="dateStarted">Date Started: </label>
            <input type="date" name="dateStarted" v-model="experience.dateStarted" />
        </div>
        <div class="field">
            <label for="dateEnded">Date Ended: </label>
            <input type="date" name="dateEnded" v-model="experience.dateEnded" />
        </div>
        <div class="field">
            <label for="description">Description: </label>
            <input type="text" name="description" v-model="experience.description" />
        </div> 
        <button type="submit" class="btn save" v-on:click="saveExperience">Save Experience</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>

  </div>
</template>

<script>
import profileService from '../services/ProfileService'

export default {
    name: "add-experience",
    data() {
        return {
            showForm: false,
            experience: {
                id: null,
                industry: '',
                title: '',
                organization: '',
                dateStarted: '',
                dateEnded: '',
                description: ''
            }
        }
    },
    methods: {
        saveExperience() {
            profileService.addExperience(this.experience).then(response => {
                if (response.status === 201) {
                    this.experience = {
                        id: null,
                        industry: '',
                        title: '',
                        organization: '',
                        dateStarted: '',
                        dateEnded: '',
                        description: ''
                    };                   
                }
            })
        },
        resetForm() {
            this.experience = {};
            this.showForm = false;
        }
    }


}
</script>

<style>

</style>