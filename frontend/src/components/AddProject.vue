<template>
  <div class="main">
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Add New Project</button>

    <form v-on:submit.prevent="saveProject" v-show="showForm" id="formAddNewProject">
        <div class="field">
            <label for="title">Title: </label>
            <input type="text" name="title" v-model="newProject.title" />
        </div>
        <div class="field">
            <label for="description">Description: </label>
            <input type="text" name="description" v-model="newProject.description" />
        </div>
        <div class="field">
            <label for="technologies">Technologies: </label>
            <input type="text" name="technologies" v-model="newProject.technologies" />
        </div>
        <div class="field">
            <label for="link">Link: </label>
            <input type="text" name="link" v-model="newProject.link" />
        </div>
        <button type="submit" class="btn save">Save Project</button>
        <button type="reset" class="btn reset" v-on:click.prevent="showForm = false">Cancel</button>
    </form>
  </div>
</template>

<script>
export default {
    name: "add-project",
    data() {
        return {
            showForm: false,
            newProject: {
                id: null,
                title: "",
                description: "",
                technologies: "",
                link: ""
            }
        }
    },
    methods: {
        saveProject() {
            this.projects.unshift(this.newProject);
            this.resetForm();
        },
        resetForm() {
            this.newProject = {};
            this.showForm = false;
        }
    }


}
</script>

<style>

</style>