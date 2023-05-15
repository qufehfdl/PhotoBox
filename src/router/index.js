import { createRouter, createWebHistory } from 'vue-router'
import MainContent from '../views/MainContent.vue'
const routes = [
  {
    path: '/',
    name: 'home',
    component: MainContent
  },
  {
    path: '/mypage',
    name: 'mypage', 
    component: () => import('../components/LoginView.vue')
  },
  {
    path: '/join',
    name: 'join', 
    component: () => import('../components/JoinView.vue')
  },
  {
    path: '/login',
    name: 'login', 
    component: () => import('../components/LoginView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
