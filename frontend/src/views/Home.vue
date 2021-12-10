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

#center-left {
  grid-area: center-left;
}

#center-right {
  grid-area: center-right;
}

.header{
  grid-area: header;
}

.search {
  grid-area: search;
}

.home {
  display: grid;
  grid-template-areas: "header header search search search"
                      "section-left . center-left center-right ."
                      "section-left . center-left center-right ."
                      ". . . . .";
  grid-template-columns: 2fr 2fr 2fr 2fr 2fr;
  grid-template-rows: 1fr 2fr 2fr 2fr;

  
}


</style>
