/// <reference types="vite/client" />



/**
 *后台服务的环境类型
 * - dev: 后台开发环境
 * - test: 后台测试环境
 * - prod: 后台生产环境
 */
 type ServiceEnvType = 'dev' | 'test' | 'prod';

 /** 后台服务的环境配置 */




interface ImportMeta {
    readonly env: ImportMetaEnv;
}