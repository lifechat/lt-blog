import { defineConfig,loadEnv} from 'vite'
import vue from '@vitejs/plugin-vue'
import { resolve } from 'path'
import AutoImport from 'unplugin-auto-import/vite'
import { ElementPlusResolver } from 'unplugin-vue-components/resolvers'
import Components from 'unplugin-vue-components/vite'


function pathResolve(dir: string) {
  return resolve(process.cwd(), '.', dir)
}


export default defineConfig( configEnv => {
  const viteEnv = loadEnv(configEnv.mode, process.cwd()) as any;

  return {
    base:viteEnv.VITE_BASE_URL,
    resolve: {
      alias: [
        {
          find: '@',
          replacement: pathResolve('src') + '/',
        },
      ],
    },
    plugins: [vue(),
      AutoImport({
        resolvers: [ElementPlusResolver()],
      }),
      Components({
        resolvers: [ElementPlusResolver()],
      }),
    ],
  }
})
