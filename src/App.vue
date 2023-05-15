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
  /* 화면 전체 높이를 사용 */
  display: flex;
  /* 자식 요소들을 수직으로 배치 */
  flex-direction: column;
  /* 자식 요소들을 수직으로 배치 */
  justify-content: flex-start;
  /* 자식 요소를 수직 방향으로 정렬 */
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






