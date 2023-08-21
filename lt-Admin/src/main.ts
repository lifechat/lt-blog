import { createApp } from 'vue'
import App from './App.vue'
import * as ElementPlusIconsVue from "@element-plus/icons-vue";
import router from '@/router';
import '@/theme/index.scss';
import SvgIcon from "@/components/SvgIcon.vue";
import other from './utils/other';
import pinia from '@/store/index';

const app = createApp(App);


other.elSvg(app);

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component);
}
app.component("svg-icon", SvgIcon);
app.use(router)
app.use(pinia)
app.mount('#app')
