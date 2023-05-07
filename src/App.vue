<template>
  <div class="container">
    <div class="top">
      <TopView></TopView>
    </div>
    <div class="main">
      <router-view></router-view>
    </div>
    <div class="bottom">
      하단 내용
    </div>
  </div>
</template>

<script>
import TopView from "./views/TopView.vue";
export default {
  components: {
    TopView
  },
  data() {
    return {};
  },
  methods: {},
  computed: {},
  mounted() { },
  created() { }
};
</script>

<style>
.container {
  height: 100vh; /* 화면 전체 높이를 사용 */
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.top {
  background-color: aquamarine;
}

.main {
  flex-grow: 1; 
  display: flex;
  justify-content: center;
  align-items: center;
}

.bottom {
  background-color: rgb(98, 198, 238);
}
</style>






