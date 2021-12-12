
<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <br />
      <br />
      <br />
      <br />
    
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <br />
      <br />
      <br />
      <br />

      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid username and password!
      </div>
      <br />
      <br />

      <div
        class="alert alert-success"
        role="alert"
        v-if="this.$route.query.registration"
      >
        Thank you for registering, please sign in.
      </div>
      <label for="username" class="sr-only">Username: </label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <br />

      <label for="password" class="sr-only">Password: </label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <br />
      <br />
      <br />
      <br />
      <router-link :to="{ name: 'register' }">Need an account?</router-link>
      <br />
      <br />
      <br />
      <button type="submit">Sign in</button>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>


<style scoped>
input[type="text"],
input[type="password"] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  background-color: #ffffff;
  box-sizing: border-box;
  text-align: left;
}

button {
  background-color: #deacff;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 20px;
  color: #000000;
  display: inline-block;
  width: auto;
  height: auto;
  white-space: normal;
  text-align: center;
  padding: 10px;
  border-radius: 20%;
}

button:hover {
  opacity: 0.8;
}

h1 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 2em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 20px;
  border-radius: 5%;
}

label {
  color: #0099ff;
  font-size: 17px;
  background-image: linear-gradient(#a4e5ff, #ffffffa6);
}
#username {
  color: black;
  background-image: linear-gradient(#90ffeb, #ffffff);
  width: 300px;
  height: 30px;
  border: none;
  border-radius: 3px;
  padding-left: 8px;
}

#password {
  color: black;
  background-image: linear-gradient(#90ffeb, #ffffff);
  width: 300px;
  height: 30px;
  border: none;
  border-radius: 3px;
  padding-left: 8px;
}

#login {
  width: 100%;
  height: 30px;
  border: none;
  border-radius: 17px;
  padding-left: 7px;
  color: rgb(128, 128, 255);
  position: relative;
  padding-top: 1%;
  padding: 0 20px 0 0;
}

a {
  float: left;
  /* background-color: #90ffeb; */
}
</style>
