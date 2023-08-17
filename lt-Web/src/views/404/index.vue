<template>
    <div class="page-header">
      <h1 class="page-title">页面不存在</h1>
      <img class="page-cover" src="https://www.dmoe.cc/random.php" style="max-width: 100%; max-height: 100%;">
      <Waves></Waves>
    </div>
    <div class="bg">
      <div class="page-container">
        <div class="notfound">Σ( ° △ °|||)︴404！何も見えない</div>
      </div>
    </div>
  </template>
  
  <script setup lang="ts">
import {onMounted} from 'vue'
  

  const getBgUrl = async () => {
  
  }
  onMounted(()=>{
    getBgUrl()
  })
  </script>
  
  <style scoped>
  .notfound {
    width: 18.75rem;
    height: 22.625rem;
    background: url("../../assets/images/404.gif") no-repeat bottom;
    text-align: center;
    margin: 6.25rem auto;
  }
  </style>