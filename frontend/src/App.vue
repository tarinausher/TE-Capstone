<template>
  <div id="app">
    <div id="nav">
      <ul>
        <li><router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;</li>
        <li><router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>&nbsp;|&nbsp;</li>
        <li><router-link v-bind:to="{ name: 'student-list'}" v-if="$store.state.token != ''">All Students</router-link></li>
      </ul>
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
  background-image: linear-gradient(#62b0ec, #d694cc); 
}

#nav {
  position: relative;
  margin: 1em;
  overflow: hidden;
}

#nav ul {
  display: flex;
  flex-direction: row;
  justify-content: flex-start;
  list-style-type: none;
}

#nav li{
  display: flex;
  justify-content: flex-start;
  text-align: left;
}
</style>