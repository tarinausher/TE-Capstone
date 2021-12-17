<template>
  <div id="app">
    <div id="menu">
    <div id="header">
      <h1>Build-a-Student-Workshop</h1>
    </div>
    <div id="nav">
      <ul>
        <li v-if="$store.state.token != ''"><router-link v-bind:to="{ name: 'home' }" v-if="$store.state.token != ''">Home</router-link>&nbsp;|&nbsp;</li>
        <li v-if="$store.state.token != ''"><router-link v-bind:to="{ name: 'about' }" v-if="$store.state.token != ''">About</router-link>&nbsp;|&nbsp;</li>
        <li v-if="$store.state.token != ''"><router-link :to="{ name: 'register' }" v-if="$store.state.token != ''">Register User</router-link>&nbsp;|&nbsp;</li>
        <!-- <li v-if="$store.state.token != ''"><router-link v-bind:to="{ name: 'update-profile' }" v-if="$store.state.token != ''">Update Profile</router-link>&nbsp;|&nbsp;</li> -->
        <li v-if="$store.state.token != ''"><router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link></li>
      </ul>
    </div>
    </div>
    <div id="body"></div>
    <router-view />
  </div>
</template>

<script>
export default {};
</script>

<style>
img {
  width:200px;
}

body {
  background-size: cover;
  background-attachment: fixed;
  background-color: rgba(0, 89, 255, 0.445); /* For browsers that do not support gradients */
  background-image: linear-gradient(#62b0ec, #d694cc); 
}

#menu {
  display: inline-flex;
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
  float: center;
  font-family: Verdana, Geneva, Tahoma, sans-serif;

}
</style>