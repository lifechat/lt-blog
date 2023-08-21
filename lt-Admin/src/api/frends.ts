
// import { request } from "../utils/http";

// /**
//  * 删除友链
//  * @param data 友链id集合
//  */
// // 用户登录
// export const handleRquestLogin = (data:Ilogin) => {
//     return request.post({
//         url: '/login',
//         data,
//       })
// }

// /**
//  * 查看友链列表
//  * @param params 查询条件
//  * @returns 友链列表
//  */
// export function getFriendList(params: FriendQuery): AxiosPromise<Result<PageResult<Friend[]>>> {
//     return request({
//       url: "/api/friend/list",
//       method: "get",
//       params,
//     });
// }



// /**
//  * 删除友链
//  * @param data 友链id集合
//  */
// export function deleteFriend(data: number[]): AxiosPromise<Result<null>> {
//     return request({
//       url: "/admin/friend/delete",
//       method: "delete",
//       data,
//     });
//   }

// /**
//  * 修改友链
//  * @param data 友链信息
//  */
// export function updateFriend(data: FriendForm): AxiosPromise<Result<null>> {
//     return request({
//       url: "/admin/friend/update",
//       method: "put",
//       data,
//     });
//   }