<template>
  <div id="register" class="text-center">
    <form class="form-register" @submit.prevent="register">
      <br />
      <br />
      <br />
      <br />
      <h1 class="h3 mb-3 font-weight-normal">Create Account</h1>
      <br />
      <br />
      <br />
      <br />
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        {{ registrationErrorMsg }}
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
      <label for="password" class="sr-only">Confirm Password: </label>
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      <br />
      <label for="email" class="sr-only">Email: </label>
      <!-- added start-->
      <input
        type="email"
        id="email"
        class="form-control"
        placeholder="Email"
        v-model="user.email"
        required
      />
      <!-- added end -->
      <br />
      <br />
      <br />
      <br />
      <router-link :to="{ name: 'login' }">Have an account?</router-link>
      <br />
      <br />
      <br />
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
    </form>
  </div>
</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "register",
  data() {
    return {
      user: {
        username: "",
        email: "", //added
        password: "",
        confirmPassword: "",
        role: "user",
        isValidated: false
      },
      registrationErrors: false,
      registrationErrorMsg: "There were problems registering this user.",
    };
  },
  methods: {
    register() {
      if (this.user.password != this.user.confirmPassword) {
        this.registrationErrors = true;
        this.registrationErrorMsg = "Password & Confirm Password do not match.";
      } else {
        authService
          .register(this.user)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push({
                path: "/login",
                query: { registration: "success" },
              });
            }
          })
          .catch((error) => {
            const response = error.response;
            this.registrationErrors = true;
            if (response.status === 400) {
              this.registrationErrorMsg = "Bad Request: Validation Errors";
            }
          });
      }
    },
    clearErrors() {
      this.registrationErrors = false;
      this.registrationErrorMsg = "There were problems registering this user.";
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
  /* color: #08ffd1; */
  font-size: 17px;
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

#confirmPassword {
  color: black;
  background-image: linear-gradient(#90ffeb, #ffffff);
  width: 300px;
  height: 30px;
  border: none;
  border-radius: 3px;
  padding-left: 8px;
}

#email {
  color: black;
  background-image: linear-gradient(#90ffeb, #ffffff);
  width: 300px;
  height: 30px;
  border: none;
  border-radius: 3px;
  padding-left: 8px;
}

a {
  float: left;
  /* background-color: #90ffeb; */
}
</style>