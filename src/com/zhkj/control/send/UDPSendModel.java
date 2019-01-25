package com.zhkj.control.send;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.zhkj.control.thread.UDP4;

/**
 * 飞机操作模型层
 * @author i am ok
 *
 */

public class UDPSendModel {
	
	private String send = null;
	
	
	public UDPSendModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UDPSendModel(String send) {
		this.send = send;
	}
	/**
	 * 操作指令发送方法
	 * @throws Exception
	 */
	public void UDPSendCommand() throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket();
//		//准备数据，把数据封装到数据包中
//		String send = "";
		//创建了一个数据包
		DatagramPacket packet = new DatagramPacket(send.getBytes(), send.length(), InetAddress.getByName("192.168.10.1"), 8889);
		//DatagramPacket packet = new DatagramPacket(send.getBytes(), send.length(), InetAddress.getLocalHost(), 80);
		datagramSocket.send(packet);
		//System.out.println("成功发送" + send + "请求");
		datagramSocket.close();	
	}
	/**
	 * 开启特洛伊SDK模式
	 */
	public void startTelloSDK(){
		UDPSendModel Us = new UDPSendModel("command");
		try {
			Us.UDPSendCommand();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
