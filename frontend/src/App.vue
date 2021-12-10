<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'student-list'}">All Students</router-link>
    </div>
    <div id="body"></div>
    <router-view />
  </div>
</template>

<script>
export default {};
</script>

<style>
body {
  background-size: cover;
  background-attachment: fixed;
  background-color: rgba(0, 89, 255, 0.445); /* For browsers that do not support gradients */
  background-image: linear-gradient(#012a4a, #b5179d);
}
</style>