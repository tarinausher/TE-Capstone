<template>
   <div id="about">
<br>
   <img id="project-logo" src="@/assets/img/image.png" alt="build-a-student-workshop logo" />
    <p>Thank you for visiting our Tech Elevator capstone project. </p>
    <ul>This project was developed by:
        <li>Daniel May</li>
        <li>Joseph Griffith</li>
        <li>Joshua Littles</li>
        <li>Mary King</li>
        <li>Tarina Usher</li>
        </ul>
    </div>
</template>

<script>
export default {
    name: "about"

}
</script>

<style>
#project-logo {
    width: 400px;
    height: 400px;
    border: none;
    border-radius: 20%;
  justify-content: center;
}

#about {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: center;
  font-size: 1.8em;
  margin-top: 0.15em;
  margin-bottom: 0.15em;
  color: #000000;
    
}

#about ul {
    list-style-type: none;
}
</style>