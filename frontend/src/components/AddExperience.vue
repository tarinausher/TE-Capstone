<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Experience</button>

    <form v-on:submit.prevent="saveExperience" v-show="showForm" id="formAddNewExperience">
        <div class="field">
            <label for="industry">Industry: </label>
            <input type="text" name="industry" v-model="newExperience.industry" />
        </div>
        <div class="field">
            <label for="title">Institution: </label>
            <input type="text" name="title" v-model="newExperience.title" />
        </div>
        <div class="field">
            <label for="organization">Organization: </label>
            <input type="text" name="organization" v-model="newExperience.organization" />
        </div>
        <div class="field">
            <label for="dateStarted">Date Started: </label>
            <input type="date" name="dateStarted" v-model="newExperience.dateStarted" />
        </div>
        <div class="field">
            <label for="dateEnded">Date Ended: </label>
            <input type="date" name="dateEnded" v-model="newExperience.dateEnded" />
        </div>
        <div class="field">
            <label for="description">Descrition: </label>
            <input type="text" name="description" v-model="newExperience.description" />
        </div> <!--May need to change description input to textarea-->
        <button type="submit" class="btn save">Save Experience</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>
  </div>
</template>

<script>
export default {
    name: "add-experience",
    data() {
        return {
            showForm: false,
            newExperience: {
                id: null,
                industry: "",
                title: "",
                organization: "",
                dateStarted: "",
                dateEnded: "",
                description: ""
            }
        }
    },
    methods: {
        saveExperience() {
            this.experiences.unshift(this.newExperience);
            this.resetForm();
        },
        resetForm() {
            this.newExperience = {};
            this.showForm = false;
        }
    }


}
</script>

<style>

</style>