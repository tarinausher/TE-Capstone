<template>
  <div class="home">
    <h1>Home</h1>
    <p>You must be authenticated to see this</p>
<!-- what i added is under this comment -->
    
    <div class= "search">
    <section id="banner">
     <input type="search" value="search"/> <input type="submit" value="submit"> <input type="submit" value="Browse Roster" />
    </section>
    </div>

     <div>
     <section id="left">
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

  <div>
    <section id="center">
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

  </div>

  

</template>

<script>
export default {
  name: "home"
};
</script>

<style>

#banner {
  grid-area: header;
}

section#left {
  grid-area: left-panel;
}

#center {
  grid-area: center-panel;
}


.home {
  display: grid;
  grid-template-columns: 2fr 2fr 2fr 2fr 2fr;
  grid-template-areas: 
  "";
}
</style>