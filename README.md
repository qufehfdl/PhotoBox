# SPA/PWA 커뮤니티
src<br>
├── api          // 서버 통신 로직<br>
├── assets      // 이미지 , 폰트 등 정적 파일<br>
├── components // 컴포넌트 파일<br>
├── router    // 라우터 파일<br>
├── store    // Vuex 스토어 파일<br>
└── views   // 페이지 파일<br>

# 헤맸던 로직

  <h3>🎅 vue-session</h3>
  
    을 사용하고 싶었지만 vue3에서는 전통적인 세션 관리 라이브러리가 공식적으로 지원되지 않는다고 한다 
    그래서 sessionStorage 와 vuex를 사용해서 세션기능을 구현하였다
  
  <h3>🎅 이 프로젝트에서는 아니지만 하이브리드 앱과 모바일 웹 구분하는것!<h3>
  
    일반 웹브라우저와 모바일 환경을 구분하는 것은 쉬웠지만
    하이브리드 앱은 내부적으로 WebView를 사용하여 웹을 표시하기 때문에
    모바일 웹과 유사한 User-Agent 문자열을 가지고 있었다
    그래서 헤더에서 오는 User-Agent를 가지고는 구분하기 어려웠다
    찾은 해결책은 하이브리드 앱은 사용하는 기기의 
    네이티브 기능에 접근할 때 특정 플러그인을 사용한다는 것을 알았다
    ( 카메라 액세스, 파일 시스템 접근, 네트워크 통신, 푸시 알림 등 )
    모바일 웹(핸드폰 브라우저)에서는 카메라 기능을 제외했고
    하이브리드 앱에서만 카메라 기능을 사용할 수 있는 것을 활용해서 구분했다

  
# 만들면서 공부해보자

😊 this <hr>

    마운트 영역에서 this가 바인딩되는 이유는 Vue 컴포넌트 인스턴스가 생성되고 
    해당 인스턴스가 마운트되기 전에 Vue에 의해 this가 해당 인스턴스로 설정되기 때문
    
    methods 내에서 정의한 함수에서는 this가 해당 Vue 인스턴스를 가리키지 않고
    함수 자체의 스코프 내에서 정의된 값이기 때문에 일반적으로 this를 변수에 할당하고
    해당 변수를 참조하여 인스턴스의 속성과 메소드에 접근해야한다
    
    화살표 함수를 사용하면 일반 함수와 달리 자신만의 this를 생성하지 않고
    상위 스코프의 this를 가져오기 때문에 this를 인스턴스로 바인딩할 필요가 없다
    따라서 화살표 함수를 사용하면 methods 영역에서도 this를 인스턴스로 바인딩할 수 있다

😊computed 와 method 속성의 차이 <hr>

    computed는 캐시된 계산 속성
    computed는 모델 데이터의 변경을 감지하고
    computed를 이용하면 캐시에 저장되므로 매번 연산을 반복하지 않아도 된다

    methods는 필요할 때마다 호출하여 실행
    methods는 Vue 인스턴스의 모든 데이터에 접근할 수 있으므로 다양한 로직을 수행할 수 있다
    클릭 이벤트나 사용자 입력에 대한 응답과 같은 일반적인 기능은 methods를 이용하여 처리할 수 있다

😊 바인딩 <hr>

    v-bind:~ 는 :~ 로 줄일 수 있다
    양방향데이터바인딩은 v-model로 한다

😊자식 컴포넌트가 부모 컴포넌트에게 이벤트요청 하는 법 <hr>

    <button id="test" @click="$emit('close')">X</button> #자식 $emit(작명, 전달할자료)
    <router-view @close="toggle = false"></router-view>  #부모 <자식컴포넌트 @작명="받으면할일">
    아래 메서드 영역에서 만든다면 this.$emit() !!

