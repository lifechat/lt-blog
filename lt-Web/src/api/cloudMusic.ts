import axios from "axios";


//获取歌曲url
export const getMusicUrl = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/song/url?id=${id}`);
};
//获取热门歌曲
export const getHotMusic = (id:any) => {
  return axios.post(`https://n.xlz122.cn/api/playlist/detail?id=${id}`);
};


