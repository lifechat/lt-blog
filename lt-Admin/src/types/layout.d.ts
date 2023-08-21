// aside
declare type AsideState = {
	menuList: RouteRecordRaw[];
	clientWidth: number;
};

// columnsAside
declare type ColumnsAsideState<T = any> = {
	columnsAsideList: T[];
	liIndex: number;
	liOldIndex: null | number;
	liHoverIndex: null | number;
	liOldPath: null | string;
	difference: number;
	routeSplit: string[];
};

// navBars tagsView
declare type TagsViewState<T = any> = {
	routeActive: string | T;
	routePath: string | unknown;
	dropdown: {
		x: string | number;
		y: string | number;
	};
	sortable: T;
	tagsRefsIndex: number;
	tagsViewList: T[];
	tagsViewRoutesList: T[];
};

// navBars parent
declare type ParentViewState<T = any> = {
	refreshRouterViewKey: string;
	keepAliveNameList: string[];
};
// 路由缓存列表
declare interface KeepAliveNamesState {
	keepAliveNames: string[];
	cachedViews: string[];
}