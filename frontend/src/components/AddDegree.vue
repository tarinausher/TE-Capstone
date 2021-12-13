<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Degree</button>

    <form v-on:submit.prevent="saveDegree" v-show="showForm" id="formAddNewDegree">
        <div class="field">
            <label for="level">Level: </label>
            <input type="text" name="level" v-model="newDegree.level" />
        </div>
        <div class="field">
            <label for="institution">Institution: </label>
            <input type="text" name="institution" v-model="newDegree.institution" />
        </div>
        <div class="field">
            <label for="subjectArea">Subject Area: </label>
            <input type="text" name="subjectArea" v-model="newDegree.subjectArea" />
        </div>
        <div class="field">
            <label for="dateCompleted">Date Completed: </label>
            <input type="date" name="dateCompleted" v-model="newDegree.dateCompleted" />
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
            newDegree: {
                id: null,
                level: "",
                institution: "",
                subjectArea: "",
                dateCompleted: ""
            }
        }
    },
    methods: {
        saveDegree() {
            this.degrees.unshift(this.newDegree);
            this.resetForm();
        },
        resetForm() {
            this.newDegree = {};
            this.showForm = false;
        }
    }


}
</script>

<style>

</style>