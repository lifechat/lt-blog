<template>
  
    <div class="page-header">
      <h1 class="page-title">{{ route.meta.title }}</h1>
      <img class="page-cover" src="https://www.dmoe.cc/random.php" style="max-width: 100%; max-height: 100%;">
      <Waves></Waves>
    </div>
  </template>
    
  <script setup lang="ts">
//   import { defineAsyncComponent } from 'vue'
  import { useRoute } from 'vue-router'
  const route = useRoute();
  
  </script>
    
  <style lang="scss" scoped>
  
  </style>