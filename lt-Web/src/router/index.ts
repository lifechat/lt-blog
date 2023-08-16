import {createRouter, createWebHistory} from 'vue-router';
import { App } from 'vue';

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/:pathMatch(.*)',
            name: 'error404',
            component:() => import('../views/404/index.vue')
        },
        {
            path: "/",
            name: 'home',
            component: () => import('../views/home/index.vue')
          },
    ],
    
})


/** setup vue router. - [安装vue路由] */
export async function setupRouter(app: App) {
    app.use(router);
    // createRouterGuard(router);
    await router.isReady();
  }
  