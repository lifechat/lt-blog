<template>
  <div class="bg">
    <div class="page-container">
      <h2 class="title">基本信息</h2>
      <div class="my-info">
        <div class="cell" v-for="item in info" :key="item.label">{{ item.label }}: {{ item.value }}</div>
      </div>
    </div>
  </div>
</template>
  
<script setup lang="ts">
import { onMounted } from 'vue'

const info = [
  { label: 'Age', value: '22 Years' },
  { label: 'Birthday', value: '2001-11-06' },
  { label: 'Address', value: '广东省东莞市' },
  { label: 'E-mail', value: '1244792012@qq.com' },
  { label: 'Phone', value: '15914173575' },
  { label: 'Occupation', value: 'web前端开发' },
]
const getBgUrl = async () => {

}
onMounted(() => {
  getBgUrl()
})
</script>
  
<style scoped></style>