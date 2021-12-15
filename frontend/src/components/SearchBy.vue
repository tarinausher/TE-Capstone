<template>
    <div id="title">
    <h3>Search By:</h3>
    
    <form action="#">
        <label for="cohort">Cohort Number:</label>
          <select name="cohort">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
          </select>
        <input type="submit" value="Submit" />
    </form>

    <form action="#">
        <label for="technologies">Technologies:</label>
          <select name="technologies" >
            <option value="Java">Java</option>
            <option value=".NET">.NET</option>
            <option value="SQL">SQL</option>
            <option value="Vue">Vue</option>
            <option value="SpringBoot">Spring Boot</option>
            <option value="JUnit">JUnit</option>
            <option value="Agile">Agile</option>
            <option value="Python">Python</option>
            <option value="Selenium">Selenium</option>
            <option value="React">React</option>
            <option value="Angular">Angular</option>
            <option value="JavaScript">JavaScript</option>
            <option value="CSS">CSS</option>
            <option value="HTML">HTML</option>
          </select>
        <input type="submit" value="Submit" />
    </form>

    <form action="#">
        <label for="degrees">Degree:</label>
          <select name="degrees" >
            <option value="GED">GED</option>
            <option value="high-school">High School</option>
            <option value="certificate">Certificate</option>
            <option value="associates">Associates</option>
            <option value="bachelors">Bachelors</option>
            <option value="masters">Masters</option>
            <option value="phd">PhD</option>
          </select>
        <input type="submit" value="Submit" />
    </form>


    <form action="#">
        <label for="industry">Industry:</label>
          <select name="industry" >
            <option value="Healthcare">Health Care</option>
            <option value="Administration">Administration</option>
            <option value="Retail">Retail</option>
            <option value="Hospitality">Hospitality</option>
            <option value="IT">Information Technology</option>
            <option value="Finance">Finance</option>
            <option value="Sales">Sales</option>
          </select>
        <input type="submit" value="Submit" />
    </form>
    </div>
</template>

<script>
export default {

}
</script>

<style>
#title {
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    font-size: 8px;
}
</style>