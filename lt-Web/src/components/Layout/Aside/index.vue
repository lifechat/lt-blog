<template>
  <div class="aside-info-main">
    <el-avatar :size="120" :src="info.avatar" />
    <div class="info-name">{{ info.name }}</div>
    <router-link v-for="item in routerList" :class="routePath == item.path ? 'router-select' : ''" :to="item.path">
      <div>{{ item.label }}</div>
    </router-link>
  </div>
</template>
  
<script setup lang="ts">
// import { defineAsyncComponent, watch } from 'vue';
import { useRoute } from 'vue-router'
const route = useRoute();
// 当前page路由
const routePath = route.path
const info = {
  avatar: '',
  name: '乐菲'
}
// 导航
const routerList = [
  {label: '首页', path: '/index'},
  {label: '关于我', path: '/about'},
  {label: '专业技能', path: '/index'},
  {label: '经验经历', path: '/index'},
  {label: '项目体验', path: '/index'},
  {label: '联系我', path: '/contact'},
  {label: '留言/意见反馈', path: '/index'},
]
</script>
  
<style lang="scss" scoped>
.aside-info-main {
  position: relative;
  width: 100%;
  background-color: #fff;
  box-shadow: 0 0 1rem var(--box-bg-shadow);
  animation: slideUpIn 1s;
  text-align: center;
  font-weight: 700;
  height: 100vh;
  line-height: 2.5rem;
  padding-top: 3rem;
  .router-select{
    color: var(--color-red);
  }

  .info-name {
    font-size: 1.5rem;
    margin-bottom: 2rem;
  }
}
</style>