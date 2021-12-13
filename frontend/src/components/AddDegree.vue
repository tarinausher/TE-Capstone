<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Degree</button>

    <form v-on:submit.prevent="saveDegree" v-show="showForm" id="formAddDegree">
        <div class="field">
            <label for="level">Level: </label>
            <input type="text" name="level" v-model="degree.level" />
        </div>
        <div class="field">
            <label for="institution">Institution: </label>
            <input type="text" name="institution" v-model="degree.institution" />
        </div>
        <div class="field">
            <label for="subjectArea">Subject Area: </label>
            <input type="text" name="subjectArea" v-model="degree.subjectArea" />
        </div>
        <div class="field">
            <label for="dateCompleted">Date Completed: </label>
            <input type="date" name="dateCompleted" v-model="degree.dateCompleted" />
        </div>
        <button type="submit" class="btn save">Save Degree</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>
  </div>
</template>

<script>
export default {
    name: "add-degree",
    data() {
        return {
            showForm: false,
            degree: {
                userId: null,
                level: "",
                institution: "",
                subjectArea: "",
                dateCompleted: ""
            }
        }
    },
    methods: {
        saveDegree() {
            
        }
    }



}
</script>

<style>

</style>