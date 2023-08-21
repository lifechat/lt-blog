import { request } from "../utils/http";


interface Ilogin{
    username:string
    password:string
}


// 用户登录
export const handleRquestLogin = (data:Ilogin) => {
    return request.post({
        url: '/login',
        data,
      })
}

// 用户退出
export const handlelogOut = () => {
    return request.get({
        url:'/logout'
    })
}