<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Project</button>

    <form v-bind:userId="userId" v-show="showForm" id="formAddProject">
        <div class="field">
            <label for="title">Title: </label>
            <input type="text" name="title" v-model="project.title" />
        </div>
        <div class="field">
            <label for="description">Description: </label>
            <input type="text" name="description" v-model="project.description" />
        </div>
        <div class="field">
            <label for="technologies">Technologies: </label>
            <input type="text" name="technologies" v-model="project.technologies" />
        </div>
        <div class="field">
            <label for="link">Link: </label>
            <input type="text" name="link" v-model="project.link" />
        </div>
        <button type="submit" class="btn save" v-on:click="saveProject">Save Project</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>


  </div>
</template>

<script>
import profileService from '../services/ProfileService'
// import userId from '../components/StudentDetails'


export default {
    name: "add-project",
    props: {
        userId: Number
    },
    data() {
        return {
            showForm: false,
            project: {
                userId: this.userId,
                title: '',
                description: '',
                technologies: '',
                link: ''
            }
        }
    },
    methods: {
        saveProject() {
            profileService.addProject(this.project).then(response => {
                if (response.status === 201) {
                    this.project = {
                        id: null,
                        title: '',
                        description: '',
                        technologies: '',
                        link: ''                        
                    }
                }
            })
        }
    }


}
</script>

<style>

</style>