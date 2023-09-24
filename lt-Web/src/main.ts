import "@/assets/fonts/font.css";
import '@/style/app.scss'
import "@/assets/iconfont/iconfont.css"
import { createApp } from 'vue'
import App from './App.vue'
import {setupRouter} from "../src/router";
import ElementPlus from 'element-plus';
import * as ElementPlusIconsVue from '@element-plus/icons-vue'


async function setupApp(){
    const app = createApp(App);
    for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
        app.component(key, component)
    }
    setupRouter(app);
    app.use(ElementPlus);
    app.mount('#app');

}
setupApp();
