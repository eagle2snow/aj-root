package com.gm.api.websocket;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息发送器
 * 
 * @author ying
 *
 */
@Component
public class WebSokectSender {

	static Logger logger = Logger.getLogger(WebSokectSender.class.getName());

	@Autowired
	private SimpMessagingTemplate template;

	/**
	 * 多对一发消息 <br>
	 * 
	 * @param message
	 */
	public void sendToAppMember(Map<String, Object> map) {
		try {
			Object toId = map.get("to");
			logger.info("发给：" + toId);
			template.convertAndSend("/queue/sendToMember/" + toId, map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * app 发送pc后台登录认证（允许登录/禁止登录）
	 * 
	 * @param map
	 */
	public void appSendAuthToAdminPc(String toId, Integer enable) {
		try {
			logger.info("发给：" + toId + "@" + enable);
			Map<String, Object> map = new HashMap<>();
			map.put("enable", enable);
			template.convertAndSend("/msg/sendToPc/" + toId, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 扫描二维码后
	 * 
	 * @param toId
	 * @param enable
	 */
	public void appSendScanQrEvtToAdminPc(String toId) {
		try {
			Map<String, Object> map = new HashMap<>();

			template.convertAndSend("/msg/sendToPc/ScanQrEvt/" + toId, map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
