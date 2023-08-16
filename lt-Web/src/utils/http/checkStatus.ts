import { ElNotification } from 'element-plus'

// const codeMessage: Record<number, string> = {
//   400: '发出的请求有错误，服务器没有进行创建或修改数据的操作。',
//   401: '登录信息失效，请重新登录',
//   403: '用户得到授权，但是访问是被禁止的。',
//   404: '发出的请求针对的是不存在的记录，服务器没有进行操作。',
//   406: '请求的格式不可得。',
//   410: '请求的资源被永久删除，且不会再得到的。',
//   422: '当创建一个对象时，发生一个验证错误。',
//   500: '服务器发生错误，请检查服务器。',
//   502: '网关错误。',
//   503: '服务不可用，服务器暂时过载或维护。',
//   504: '网关超时。',
// }

const showErrorNotification = (status: number, message: string) => {
  ElNotification.error({
    title: 'Error',
    message: `请求出错 ${status},${message}`,
    type: 'error',
  })
}

/**
 *
 * @param response
 */
export function checkStatus(response: any): void {
  const { status, data } = response
  switch (status) {
    case 401:
    case 403: {
      showErrorNotification(status, data?.message)
    }
  }
}
