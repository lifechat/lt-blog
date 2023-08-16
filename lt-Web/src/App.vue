<template>
    <router-view />
    <!-- 音乐播放器 -->
    
    <Player />
</template>
<script setup lang="ts">
import { defineAsyncComponent } from 'vue';

  //引入组件
  const Player = defineAsyncComponent(() => import('@/components/zw-player/player.vue'))

</script>
<style lang="less" scoped></style>
