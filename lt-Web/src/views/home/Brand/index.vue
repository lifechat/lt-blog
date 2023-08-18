<template>
    <div class="brand-container">
      <div class="brand">
        <!-- 头像 -->
        <img class="author-avatar" src="http://rzfvim6dg.hn-bkt.clouddn.com/avatar.jpg?e=1692159372&token=1HkpHK3ahL25jsAghWO1ERPaUvhzW9hFmLvXWR6J:sDVue_IQfWzKennI-MGneGez0Gs=" alt="">
        <!-- 标题 -->
        <p class="artboard">Codesharing</p>
        <!-- 打字机 -->
        <div class="title">
          {{ obj.output }}
          <span class="easy-typed-cursor">|</span>
        </div>
      </div>
      <!-- 波浪 -->
      <Waves></Waves>
      <!-- 向下按钮 -->
      <div class="arrow-down" @click="scrollDown">
        <el-icon size="32px"><ArrowDownBold   /></el-icon>
      </div>
    </div>
  </template>
  
  <script setup lang="ts">
//   import useStore from "@/store";
import {onMounted,reactive} from 'vue'
import EasyTyper from 'easy-typer-js'
// 引入组件

// 定义变量
const obj = reactive({
    output: "",
    isEnd: false,
    speed: 100,
    singleBack: false,
    sleep: 0,
    type: "normal",
    backSpeed: 100,
    sentencePause: false,
});


//功能方法
//   const { blog } = useStore();
  const scrollDown = () => {
    window.scrollTo({
      behavior: "smooth",
      top: document.documentElement.clientHeight,
    });
  };
  const handleRquestWord = () => {
  fetch("https://v1.hitokoto.cn")
    .then((res) => {
      return res.json();
    })
    .then(({ hitokoto }) => {
      console.log(hitokoto)
      new EasyTyper(
        obj,
        hitokoto,
        () => { },
        () => { }
      );
    });
};
  onMounted(() => {
    handleRquestWord();
  });
  </script>
  
  <style lang="scss" scoped>
  @import "@/style/mixins.scss";
  
  .brand-container {

    @include flex;
    flex-direction: column;
    position: relative;
    width: 100%;
    height: 100vh;
    min-height: 10rem;
    color: var(--header-text-color);
  }
  

  .brand {
    @include flex;
    flex-direction: column;
    position: fixed;
    z-index: -1;
  
    .artboard {
      font-family: "Fredericka the Great", Mulish, -apple-system, "PingFang SC", "Microsoft YaHei",
        sans-serif;
      font-size: 3.5em;
      line-height: 1.2;
      animation: titleScale 1s;
    }
    .author-avatar {
      display: block;
      max-width: 10rem;
      margin: 0 auto;
      padding: 0.125rem;
      box-shadow: 0 0 1rem 0.625rem var(--body-bg-shadow);
      border: 0.0625rem solid var(--body-bg-shadow);
      border-radius: 50%;
      animation: 1000ms ease-in-out 0ms 1 normal forwards running blur;
      &:hover {
          -webkit-animation: author-shake 1s;
          animation: 1000ms ease 0ms 1 normal none running author-shake;
      }
    }
    .title {
      letter-spacing: 0.1em;
    }
  }
  
  .easy-typed-cursor {
    margin-left: 0.625rem;
    opacity: 1;
    -webkit-animation: blink 0.7s infinite;
    -moz-animation: blink 0.7s infinite;
    animation: blink 0.7s infinite;
  }
  
  .arrow-down {
    position: absolute;
    bottom: 70px;
    -webkit-animation: arrow-shake 1.5s ease-out infinite;
    animation: arrow-shake 1.5s ease-out infinite;
    cursor: pointer;
    z-index: 8;
  }
  
  @media (max-width: 767px) {
    .brand-container {
      padding: 3rem 0.5rem 0;
    }
  }
  
  @media (min-width: 760px) {
    .title {
      font-size: 1.5rem;
    }
  }
  
  @keyframes arrow-shake {
    0% {
      opacity: 1;
      transform: translateY(0);
    }
  
    30% {
      opacity: 0.5;
      transform: translateY(25px);
    }
  
    100% {
      opacity: 1;
      transform: translateY(0);
    }
  }
  
  @keyframes blink {
    0% {
      opacity: 0;
    }
  
    100% {
      opacity: 1;
    }
  }
  </style>
  