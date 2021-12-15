<template>
      <button v-on:click.prevent="showForm = true" v-show="showForm === false">Update Profile</button>
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