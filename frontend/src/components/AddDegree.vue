<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Degree</button>

    <form v-bind:userId="userId" v-show="showForm" id="formAddDegree" >
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

        <button type="submit" class="btn save" v-on:click="saveDegree">Save Degree</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>


  </div>
</template>

<script>
import profileService from '../services/ProfileService'
import userId from '../components/StudentDetails'

export default {
    
    name: "add-degree",
    props: {
        userId: Number
    },
    data() {
        return {
            showForm: false,
            degree: {
                userId: this.userId,
                level: '',
                institution: '',
                subjectArea: '',
                dateCompleted: ''
            }
        }
    },
    methods: {
        saveDegree() {
            profileService.addDegree(this.degree).then(response => {
                if (response.status === 201) { // 201 = "Created"
                this.degree = { 
                    userId: this.userId,
                    level: '',
                    institution: '',
                    subjectArea: '',
                    dateCompleted: ''
                };
            }
         })
        
        },
        getId() {
            this.degree.userId = userId;
        }
    }



}
</script>

<style>

</style>