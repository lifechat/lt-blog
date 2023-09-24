<template>
    <!-- 联系我 -->
    <div class="view-content">
      <!-- 联系方式 -->
      <div class="contactInfo">
        <h3>联系方式</h3>
        <div class="contact-address">
          <p class="address-url" v-for="item in contactAddress" :key="item.url">
          {{ item.label }}：<a :href="item.url" target="_blank">{{ item.url }}</a>
          </p>
        </div>
        <div class="item" v-for="item in contactInfo" :key="item.icon">
          <div :class="['iconfont', item.icon]"></div>
          <div class="content">
            <div class="label">{{ item.label }}</div>
            <div class="text">{{ item.value }}</div>
          </div>
        </div>
      </div>
      <!-- 微信 -->
      <div class="contact-wx">
        <h3>扫码添加微信</h3>
        <img class="wx-img" src="@/assets/images/wx.jpg" alt="">
      </div>
    </div>
</template>
    
<script setup lang="ts">
import { reactive } from 'vue'

// 地址
const contactAddress = [
  {label: '主页地址', url: 'https://www.lefeifei.com'},
  {label: 'Gitee地址', url: 'https://gitee.com/tanglefei1106'},
  {label: 'Github地址', url: 'https://github.com/Tfeifei'},
]

// 联系方式
interface contactInfo {
  label: string;
  icon: string;
  value: string;
}
const contactInfo = reactive<contactInfo[]>([
  { label: '电话', icon: 'icon-shoujihao', value: '176-7380-5262' },
  { label: '邮箱', icon: 'icon-youxiang1', value: '1244792012@qq.com' },
  { label: 'QQ', icon: 'icon-qq', value: '1244792012' }
])
</script>
    
<style lang="scss" scoped>
.view-content {
  display: flex;
  justify-content: center;
}

.contactInfo,
.contact-wx {
  width: 50%;
}

.contactInfo {
  .contact-address{
    padding-bottom: 2rem;
    a{
      color: var(--color-red);
    }
  }

  .item {
    display: flex;
    align-items: center;
    margin-bottom: 2rem;

    .iconfont {
      font-size: 1.5rem;
      width: 4rem;
      height: 4rem;
      display: flex;
      justify-content: center;
      align-items: center;
      border-right: 1px solid #ccc;
    }

    .content {
      padding-left: 1rem;

      .text {
        font-size: 1rem;
        font-weight: 700;
      }
    }
  }
}

.contact-wx {
  .wx-img {
    width: 20rem;
  }
}

@media (max-width: 991px) {
  .view-content {
    flex-wrap: wrap;
  }

  .contactInfo,
  .contact-wx {
    width: 100%;

    .wx-img {
      width: 100%;
    }
  }
}
</style>