<template>
    <div class="layout-navbars-container">
		<BreadcrumbIndex />
		<TagsView  />
	</div>
</template>

<script setup lang="ts" name="layoutNavBars">
import { defineAsyncComponent } from 'vue';
// 引入组件
const BreadcrumbIndex = defineAsyncComponent(() => import('@/layout/navBar/topBar/index.vue'));
const TagsView = defineAsyncComponent(() => import('@/layout/navBar/tagsView/tagsView.vue'));
</script>
