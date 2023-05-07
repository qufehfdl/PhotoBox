<template>
  <nav class="navbar bg-body-tertiary fixed-top">
    <div class="container-fluid">
      <a class="navbar-brand" @click="$router.push({ name: 'home' })"><i class="bi bi-box-fill"></i> 사진상자</a>
      <form class="d-flex mt-3" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
      <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar"
        aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
        <div class="offcanvas-header">
          <h5 class="offcanvas-title" id="offcanvasNavbarLabel"><i class="bi bi-box-fill"></i> 사진상자</h5>
          <span>
            <h3><i class="bi bi-person-add" @click="$router.push({ name: 'mypage' })"></i></h3>
          </span>
          <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
        </div>
        <div class="offcanvas-body">
          <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#" @click="$router.push({ name: 'mypage' })">마이페이지</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                작품
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">하루 한 컷</a></li>
                <li><a class="dropdown-item" href="#">인물</a></li>
                <li><a class="dropdown-item" href="#">감성</a></li>
                <li><a class="dropdown-item" href="#">동물</a></li>
                <li><a class="dropdown-item" href="#">자연</a></li>
                <li><a class="dropdown-item" href="#">음식</a></li>
                <li><a class="dropdown-item" href="#">천체</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                게시판
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">자유게시판</a></li>
                <li><a class="dropdown-item" href="#">질문&답변</a></li>
                <li><a class="dropdown-item" href="#">카메라 후기</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                같이찍어요
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">서울</a></li>
                <li><a class="dropdown-item" href="#">경기</a></li>
                <li><a class="dropdown-item" href="#">인천</a></li>
                <li><a class="dropdown-item" href="#">강원</a></li>
                <li><a class="dropdown-item" href="#">충북</a></li>
                <li><a class="dropdown-item" href="#">충남</a></li>
                <li><a class="dropdown-item" href="#">전북</a></li>
                <li><a class="dropdown-item" href="#">전남</a></li>
                <li><a class="dropdown-item" href="#">경북</a></li>
                <li><a class="dropdown-item" href="#">경남</a></li>
                <li><a class="dropdown-item" href="#">제주</a></li>
              </ul>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                공지사항
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">공지사항</a></li>
                <li><a class="dropdown-item" href="#">드리는 말씀</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  components: {
  },
  data() {
    return {};
  },
  computed: {},
  mounted() {
  },
  methods: {
  },
  created() { }
}
</script>
<style>
.navbar {
  background-color: rgb(228, 203, 203);
  border-radius: 20px;
}

.offcanvas-header {
  background-color: rgb(228, 203, 203);
  /* 색상 코드를 바꾸세요 */
  border-radius: 20px;
}

.offcanvas-header span {
  display: flex;
  align-items: center;
}

.offcanvas-header span h3 {
  margin-left: 180px;
  /* 필요한 만큼의 마진 값을 지정해주세요. */
}

</style>