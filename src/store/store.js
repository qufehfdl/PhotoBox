import {createStore} from 'vuex';


const store = createStore({
  state: {
    session: {
      user_id: '',
      user_name: '',
      user_login: false
    }
  },
  mutations: {
    SET_SESSION(state, session) {
      state.session = session;
    }
  },
  getters: {
    getSession(state) {
      return state.session;
    }
  }
});

export default store;