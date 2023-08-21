import Cookies from 'js-cookie'

const TokenKey = 'Admin-Token'
// token前缀
export const token_prefix = 'juliy ';
/**
 *  获取token
 */
export function getToken() {
  return Cookies.get(TokenKey)
}

/**
 * 设置token
 * @param token
 */
export function setToken(token: string) {
  return Cookies.set(TokenKey, token)
}

/**
 * 移除token
 */
export function removeToken() {
  return Cookies.remove(TokenKey)
}