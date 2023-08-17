<template>

    <Provider>
        
        <div class="app-wrapper">
            <Header />
            <main class="main-wrapper">
              <router-view ></router-view >
            </main>
            <Footer />
        </div>  
    </Provider>
    <!-- 音乐播放器 -->
    
    <Player />
</template>
<script setup lang="ts">
import { defineAsyncComponent } from 'vue';

  //引入组件
  const Header = defineAsyncComponent(() => import('@/components/Layout/Header/index.vue'))
  const Footer = defineAsyncComponent(() => import('@/components/Layout/Footer/index.vue'))
  const Player = defineAsyncComponent(() => import('@/components/zw-player/player.vue'))
</script>
<style lang="less" scoped></style>
