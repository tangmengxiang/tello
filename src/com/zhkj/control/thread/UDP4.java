package com.zhkj.control.thread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

import com.zhkj.control.accpet.TelloStatusAccept;

public class UDP4 extends Thread{
	DatagramPacket packet = null;
	
	public UDP4(DatagramPacket packet){
		this.packet = packet;
	}
	
	@Override
	public void run() {
		byte[] ans = new byte[packet.getLength()];
		System.arraycopy(packet.getData(), 0, ans, 0, packet.getLength());//Դ���顣Դ�����е���ʼλ�á�Ŀ�����顣Ŀ�������е���ʼλ�á�Ҫ���Ƶ�����Ԫ�ص�������
		String info = new String(ans,0,packet.getLength());//Ҫ������ַ����ֽ�,Ҫ����ĵ�һ���ֽڵ�����,Ҫ������ֽ����ĳ���
		new TelloStatusAccept(info).telloStatusAccpet(); //���������״̬
	}
}
