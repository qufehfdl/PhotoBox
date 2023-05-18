<template>
  <div>
    <div>
      <input type="text">
    </div>
    <div>
      <input type="password">
    </div>

    <div>
      <button class="btn btn-primary" type="button" @click="login">로그인</button>
    </div>
    <button type="button" class="btn btn-secondary" @click="$router.push({ name: 'join' })">회원가입</button>
    <button type="button" class="btn btn-secondary">ID 찾기</button>
    <button type="button" class="btn btn-secondary">Password 찾기</button>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      id: '',
      password: '',
    }
  },
  props: {

  },
  methods: {
    login() {
      const id = this.$refs.id.value;
      const password = this.$refs.password.value;
      axios.post('/root/login', {
        user_id: id,
        user_password: password,
      })
        .then(response => {
          this.$store.commit('SET_SESSION', response.data);
          this.$router.push("/");
        })
        .catch(error => {
          console.log(error);
        });
    },
  },
}
</script>

<style scoped>
.form-floating {
  margin-top: 20px;
}

button {
  margin-top: 20px;
  margin-right: 20px;
}
</style>