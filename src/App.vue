<template>
  <div class="container">
    <div class="top">
      <TopView></TopView>
    </div>
    <div class="main">
      <router-view></router-view>
    </div>
  </div>
  <h4>안녕{{ session.user_id }}{{ session.user_login }}</h4>
</template>
<script>
import TopView from "./views/TopView.vue";
export default {
  components: {
    TopView
  },
  data() {
    return {

    };
  },
  methods: {},
  computed: {
    session() {
      return this.$store.getters.getSession;
    }
  },
  mounted() { },
  created() { }
};
</script>
<style>
.container {
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
}

.top {
  width: 100%;
  height: 15%;
}

.main {
  width: 100%;
  height: 85%;
}
</style>






