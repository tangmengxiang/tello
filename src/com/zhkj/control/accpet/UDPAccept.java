package com.zhkj.control.accpet;

/**
 * ����״̬����
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import com.zhkj.control.thread.UDP4;

public class UDPAccept {

//	public String telloStatus() throws Exception, Exception {
//		// ����udp���񣬲��Ҽ���һ���˿�
//		DatagramSocket socket = new DatagramSocket(8890, InetAddress.getByName("0.0.0.0"));
//		// DatagramSocket socket = new DatagramSocket(80);
//		// ׼���յ����ݰ����ڴ������
//		while (true) {
//			byte[] buf = new byte[1024];
//			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 1024
//			// ����udp�ķ����������
//			socket.receive(dp);// receive��һ����Ϸ�����û�н��յ����ݰ�֮ǰ��һֱ�ȴ�������ʵ���Ͼ��Ǵ洢����byte�Լ���������ȥ��
//			// JOptionPane.showMessageDialog(null, new
//			// String(buf,0,dp.getLength()));
//			UDP4 U4 = new UDP4(dp);
//			U4.start();
//			return null;
//		}
//
//		
//
//	}

	public static void main(String[] args) throws Exception {
		// ����udp���񣬲��Ҽ���һ���˿�
		DatagramSocket socket = new DatagramSocket(8890, InetAddress.getByName("0.0.0.0"));
		// DatagramSocket socket = new DatagramSocket(80);
		// ׼���յ����ݰ����ڴ������
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 1024
			// ����udp�ķ����������
			socket.receive(dp);// receive��һ����Ϸ�����û�н��յ����ݰ�֮ǰ��һֱ�ȴ�������ʵ���Ͼ��Ǵ洢����byte�Լ���������ȥ��
			// JOptionPane.showMessageDialog(null, new
			// String(buf,0,dp.getLength()));
			UDP4 U4 = new UDP4(dp);
			U4.start();
		}

	}

}
