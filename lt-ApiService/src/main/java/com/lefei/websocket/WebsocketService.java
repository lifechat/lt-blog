//package com.lefei.websocket;
//
//
//import cn.hutool.core.date.DateUtil;
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
//import com.lefei.Utils.IpUtils;
//import com.lefei.entity.ChatRecord;
//import com.lefei.mapper.ChatRecordMapper;
//import com.lefei.model.dto.ChatRecordDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.http.client.utils.DateUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.websocket.*;
//import javax.websocket.server.HandshakeRequest;
//import javax.websocket.server.ServerEndpoint;
//import javax.websocket.server.ServerEndpointConfig;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.atomic.AtomicInteger;
//
///**
// * WebSocket服务
// **/
//
//
//
//@Slf4j
//@Component
//@ServerEndpoint(value = "/websocket",configurator = WebsocketService.ChatConfigurator.class)
//public class WebsocketService {
//    private static ChatRecordMapper chatRecordMapper;
//
//    @Autowired
//    public void setChatRecordDao(ChatRecordMapper chatRecordMapper){
//        WebsocketService.chatRecordMapper = chatRecordMapper;
//    }
//
//    /**
//     * 在线人数
//     */
//    private static final AtomicInteger ONLINE_NUM = new AtomicInteger();
//
//    /**
//     * 用户session
//     */
//    private static final ConcurrentHashMap<String, Session> WS_CONNECTIONS = new ConcurrentHashMap<>();
//
//    /**
//     * 获取客户端真实ip
//     */
//    public static class ChatConfigurator extends ServerEndpointConfig.Configurator {
//
//        public static final String IP = "X-Real-IP";
//
//        @Override
//        public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response) {
//            try {
//                String ipAddress = request.getHeaders().get(IP.toLowerCase()).get(0);
//                config.getUserProperties().put(IP, ipAddress);
//            } catch (Exception e) {
//                config.getUserProperties().put(IP, "未知ip");
//            }
//        }
//    }
//
//    /**
//     * 更新在线人数
//     */
////    private void updateOnlineCount() {
////        // 获取当前在线人数
////        WebsocketMessageDTO messageDTO = WebsocketMessageDTO.builder()
////                .type(ONLINE_COUNT.getType())
////                .data(ONLINE_NUM)
////                .build();
////        // 广播消息
////        broadcastMessage(JSON.toJSONString(messageDTO));
////    }
//    /**
//     * 加载历史聊天记录
//     *
//     * @param ipAddress ip地址
//     * @return 历史聊天记录
//     */
//    private ChatRecordDTO getChatRecordList(String ipAddress){
//        // 获取聊天历史记录
//        List<ChatRecord> chatRecordList = chatRecordMapper.selectList(new LambdaQueryWrapper<ChatRecord>()
//                .ge(ChatRecord::getCreateTime, DateUtil.offsetDay(new Date(), -1)));
//
//        return ChatRecordDTO.builder()
//                .chatRecordList(chatRecordList)
//                .ipAddress(ipAddress)
//                .ipSource(IpUtils.getIpSource(ipAddress))
//                .build();
//
//    }
//}
