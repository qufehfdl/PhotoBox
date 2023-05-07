<template>
  <div>
    <div class="form-floating mb-3">
      <input type="text" class="form-control" id="floatingInput" ref="id">
      <label for="floatingInput">ID</label>
    </div>
    <div class="form-floating" >
      <input type="password" class="form-control" id="floatingPassword" ref="password">
      <label for="floatingPassword">Password</label>
    </div>
    
    <div class="d-grid gap-2  mx-auto">
  <button class="btn btn-primary" type="button" @click="login">로그인</button>
</div>
    <button type="button" class="btn btn-secondary">회원가입</button>
    <button type="button" class="btn btn-secondary">ID 찾기</button>
    <button type="button" class="btn btn-secondary">Password 찾기</button>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      login_succeess:false,
      id: '',
      password: '',
    }
  },
  methods: {
    login() {
      const id = this.$refs.id.value;
      const password = this.$refs.password.value;
      
      axios.get(`/root/login?user_id=${id}&user_password=${password}`)
        .then(response => {
          this.login_succeess = response.data;
          if(this.login_succeess == true){
          this.$router.push('/');
        }else{
          this.$router.push('/mypage');
        }
        })
        .catch(error => {
          console.log(error);
        });
    },
  },
}
</script>

<style scoped>
.form-floating{
  margin-top: 20px;
}
button{
  margin-top: 20px;
  margin-right: 20px;
}
</style>