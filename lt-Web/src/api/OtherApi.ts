import axios from "axios";

// 获取短句
export const getLineword = () => {
  return axios.get("https://v1.hitokoto.cn");
}
//获取歌词
export const getWords = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/lyric?id=${id}`);
};
//获取歌曲详情
export const getMusicInfo = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/song/detail?ids=${id}`);
};
//获取歌曲url
export const getMusicUrl = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/song/url?id=${id}`);
};
//获取热门歌曲
export const getHotMusic = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/playlist/detail?id=${id}`);
};
//获取搜索建议
export const getSearchSuggest = (key:any) => {
  return axios.post(`https://n.xlz122.cn/api/search/suggest?keywords=${key}`);
};
//获取歌曲热门评论
export const getHotTalk = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/comment/music?id=${id}&limit=3`);
};

