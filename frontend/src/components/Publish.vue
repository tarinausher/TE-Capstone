..<template>
  <button @click="changePrivacy(this.user.id)">
      {{ this.user.isPublished === 'false' ? 'Publish' : 'Hide' }}
  </button>
  <!-- Straight up, I have no idea if this needs to be it's own component
       I just want to plug this here so that when we get to it we have
       something to reference We had a HW problem surrounding changing the
       current status of a variable which I ripped straight from for this thingy. -->
</template>

<script>
import profileService from "../services/ProfileService";

export default {
    name: "publishButton",
    data(){},
    methods: {
        changePrivacy(){
          profileService.publish().then( (response) => {
            this.students = response.data;
          });
        }
    }
}

</script>

<style>

</style>