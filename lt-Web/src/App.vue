<template>
  <div class="app-box">
    <div class="app-aside">
      <Aside />
    </div>
    <Provider>
      <div class="app-wrapper">
        <main class="main-wrapper">
          <div class="view-box">
            <div class="page-header">
              <h1 class="page-title">{{ route.meta.title }}</h1>
              <img class="page-cover" src="https://www.dmoe.cc/random.php" style="max-width: 100%; max-height: 100%;">
              <Waves></Waves>
            </div>
            <router-view v-slot="{ Component, route }">
              <keep-alive>
                <component :is="Component" :key="route.path" />
              </keep-alive>
            </router-view>
          </div>

        </main>
        <!-- <Footer /> -->
      </div>
    </Provider>

  </div>

  <!-- 音乐播放器 -->
  <!-- <Player /> -->
</template>
<script setup lang="ts">
import { defineAsyncComponent } from 'vue';
import { useRoute } from 'vue-router'
const route = useRoute();
//引入组件
// const Header = defineAsyncComponent(() => import('@/components/Layout/Header/index.vue'))
const Aside = defineAsyncComponent(() => import('@/components/Layout/Aside/index.vue'))
// const Footer = defineAsyncComponent(() => import('@/components/Layout/Footer/index.vue'))
// const Player = defineAsyncComponent(() => import('@/components/zw-player/player.vue'))
</script>
<style lang="scss" scoped>
.app-aside {
  position: fixed;
  left: 0;
  top: 0;
  width: 20vw;
}

.app-wrapper {
  position: relative;
  width: calc(80vw - 3rem);
  margin-left: 1.5rem;
  left: 20vw;
}

.view-box {
  background-color: #fff;
  box-shadow: 0 0 1rem var(--box-bg-shadow);
  margin: 1rem auto;
  width: 100%;
}

.view-content {
  padding: 1rem 2rem;
}

@media (max-width: 991px) {
  .app-aside {
    display: none;
  }

  .app-wrapper {
    position: relative;
    width: 100vw;
    left: 0;
    margin-left: 0;
  }

  .view-box {
    margin: auto;
  }
}
</style>
