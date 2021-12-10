<template>
  <div class="home">
    <div class="header">
        <h1>Student Profile Builder</h1>
      <p>You must be authenticated to see this</p>
      
  <!-- what i added is under this comment -->
    </div> 
    <div class="search">
      <section id="banner">
        <input type="search" value="search"/> <input type="submit" value="submit"> <input type="submit" value="Invite +" />
      </section>
    </div>
    
  
    
  <div class="left-panel">
     <section id="left-panel">
       <nav>
         <menu>
           <img src="https://via.placeholder.com/120" alt="placeholder">
           <li class="left-menu">
             <a href='#'> Profile Views </a>
           </li>

           <li>
             <a href='#'> Upload Photo </a>
           </li>

           <li>
             <a href='#'> Upload Portfolio </a>
           </li>

           <li>
             <a href='#'> View Profile </a>
           </li>
         </menu>
       </nav>
     </section>
   </div>


  <div class="center-right">
    <section id="center-right">
      
      <article id="student-profiles">
        <img src="https://via.placeholder.com/120" alt="placeholder">
           <li class="center-panel">
             <a href='#'> Bio </a>
           </li>

           <li>
             <a href='#'> Career experience </a>
           </li>

           <li>
             <a href='#'> Educational Background </a>
           </li>

           <li>
             <a href='#'> Soft Skills </a>
           </li>

           <li>
             <a href='#'> Contact Preferences </a>
           </li>

           <li>
             <a href='#'> Interests  </a>
           </li>

           <li>
             <a href='#'> View Full Profile </a>
           </li>

           
      </article>

    </section>
  </div>

  <div class="center-left">
    <section id="center-left">
      <article id="employer-profiles">
        <img src="https://via.placeholder.com/120" alt="placeholder">
           <li class="center-panel">
             <a href='#'> Bio </a>
           </li>

           <li>
             <a href='#'> Career experience </a>
           </li>

           <li>
             <a href='#'> Educational Background </a>
           </li>

           <li>
             <a href='#'> Soft Skills </a>
           </li>

           <li>
             <a href='#'> Contact Preferences </a>
           </li>

           <li>
             <a href='#'> Interests  </a>
           </li>

           <li>
             <a href='#'> View Full Profile </a>
           </li>
      </article>
    </section>
    
  </div>
  </div>
  

  
</template>

<script>

export default {
  name: "home"
};
</script>

<style>
#section-left {
  grid-area: section-left;
}

.center-left {
  border-radius: 15px ;
  border: 5px solid #aaaaaa;
  background-color: #e6e4e4;
  grid-area: center-left;
}

.center-right {
  border-radius: 15px ;
  border: 5px solid #aaaaaa;
  background-color: #e6e4e4;
  grid-area: center-right;
}

nav {
  list-style-type: none;
}

.header {
  grid-area: header;
}

.search {
  grid-area: search;
}

.home {
  display: grid;
  grid-template-areas: 
      "header header search search search"
      "section-left . center-left center-right . "
      "section-left . center-left center-right . "
      ". . . . .";
  grid-template-columns: 2fr 2fr 2fr 2fr 2fr;
  grid-template-rows: 1fr 2fr 2fr 1fr;
}

input[type="text"],
input[type="search"] {
  width: 50%;
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
  padding: 6px;
  border-radius: 5%;
}

div.header p {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  text-align: left;
  font-size: 1em;
  margin-top: 0.5em;
  margin-bottom: 0.15em;
  color: #0099ff;
}

label {
  color: #08ffd1;
  font-size: 17px;
}

a {
  float: left;
  background-color: #90ffeb;
}

</style>
