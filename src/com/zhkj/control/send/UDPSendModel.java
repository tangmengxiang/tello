package com.zhkj.control.send;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.zhkj.control.thread.UDP4;

/**
 * �ɻ�����ģ�Ͳ�
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
	 * ����ָ��ͷ���
	 * @throws Exception
	 */
	public void UDPSendCommand() throws Exception{
		DatagramSocket datagramSocket = new DatagramSocket();
//		//׼�����ݣ������ݷ�װ�����ݰ���
//		String send = "";
		//������һ�����ݰ�
		DatagramPacket packet = new DatagramPacket(send.getBytes(), send.length(), InetAddress.getByName("192.168.10.1"), 8889);
		//DatagramPacket packet = new DatagramPacket(send.getBytes(), send.length(), InetAddress.getLocalHost(), 80);
		datagramSocket.send(packet);
		//System.out.println("�ɹ�����" + send + "����");
		datagramSocket.close();	
	}
	/**
	 * ����������SDKģʽ
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
