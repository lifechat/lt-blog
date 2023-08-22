import {createRouter, createWebHistory} from 'vue-router';
import { App } from 'vue';

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: "/",
            name: 'home',
            component: () => import('@/views/home/index.vue')
        },
        {
            name: "about",
            path: "/about",
            component: () => import("@/views/about/index.vue"),
            meta: {
              title: "个人简介",
            },
        },
        {
            name: "friend",
            path: "/friend",
            component: () => import("@/views/friend/index.vue"),
            meta: {
              title: "友链",
            },
        },
        {
            name: "message",
            path: "/message",
            component: () => import("@/views/message/index.vue"),
            meta: {
              title: "留言板",
            },
        },
        {
            path: '/:pathMatch(.*)',
            name: 'error404',
            component:() => import('../views/404/index.vue')
        },
       
    ],
    
})


/** setup vue router. - [安装vue路由] */
export async function setupRouter(app: App) {
    app.use(router);
    // createRouterGuard(router);
    await router.isReady();
  }
  