<template>
  <div class="page-container">
    <el-card class="box-card">
      <div v-for="o in 4" :key="o" class="text item">{{ 'List item ' + o }}</div>
    </el-card>
  </div>
</template>
  
<script setup lang="ts">
import { onMounted } from 'vue'


const getBgUrl = async () => {

}
onMounted(() => {
  getBgUrl()
})
</script>
  
<style scoped></style>