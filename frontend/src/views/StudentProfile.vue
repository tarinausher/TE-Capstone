<template>
    <div>
    <student-details />
  </div>
</template>

<script>
import StudentDetails from '../components/StudentDetails.vue'

export default {
  components: { StudentDetails }

}
</script>

<style>
button {
  background-color: #deacff;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  font-size: 15px;
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

#main {
  justify-content:space-evenly;
}

h2 {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 1.8em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #0099ff;

  background-image: linear-gradient(#a4e5ff, #ffffffa6);
  display: inline;
  padding: 5px;
  border-radius: 5%;
}

.students {
  border-radius: 5%;
}

p {
  font-family: Geneva, Tahoma, sans-serif;
}

.projects {
  border-radius: 5%;
}
</style>