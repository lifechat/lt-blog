

<template>
    <div class="imgs" :style="{'background-image': 'url(' + bgUrl + ')'}" ></div>
    <Brand />
</template>
<script setup lang="ts">
import { defineAsyncComponent,ref } from 'vue';

// 声明变量
const bgUrl = ref<string>('https://www.dmoe.cc/random.php')
//引入组件
const Brand = defineAsyncComponent(() => import('@/views/home/Brand/index.vue'))

</script>
<style lang="scss" scoped>
@import "@/style/mixins.scss";
.imgs {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100vh;
  z-index: -9;
  background-color: #363636;
  background-repeat: no-repeat;
  overflow: hidden;
  background-size: cover
}
</style>
