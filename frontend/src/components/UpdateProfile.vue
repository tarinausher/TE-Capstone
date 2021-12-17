<template>
<div>
    <button v-on:click.prevent="showForm = true" v-show="showForm === false">Update Profile</button>
    <button v-on:click.prevent="showForm = false" v-show="showForm === true">Save</button>
</div>
</template>

<script>
export default {
    name: "update-profile",
    data() {
        return {
            showForm: false
        }
    },
}
</script>

<style>

</style>