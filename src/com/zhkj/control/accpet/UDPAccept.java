package com.zhkj.control.accpet;

/**
 * 接受状态方法
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
//		// 建立udp服务，并且监听一个端口
//		DatagramSocket socket = new DatagramSocket(8890, InetAddress.getByName("0.0.0.0"));
//		// DatagramSocket socket = new DatagramSocket(80);
//		// 准备空的数据包用于存放数据
//		while (true) {
//			byte[] buf = new byte[1024];
//			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 1024
//			// 调用udp的服务接受数据
//			socket.receive(dp);// receive是一个阻断方法，没有接收到数据包之前会一直等待。数据实际上就是存储到了byte自己的数组中去了
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
		// 建立udp服务，并且监听一个端口
		DatagramSocket socket = new DatagramSocket(8890, InetAddress.getByName("0.0.0.0"));
		// DatagramSocket socket = new DatagramSocket(80);
		// 准备空的数据包用于存放数据
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);// 1024
			// 调用udp的服务接受数据
			socket.receive(dp);// receive是一个阻断方法，没有接收到数据包之前会一直等待。数据实际上就是存储到了byte自己的数组中去了
			// JOptionPane.showMessageDialog(null, new
			// String(buf,0,dp.getLength()));
			UDP4 U4 = new UDP4(dp);
			U4.start();
		}

	}

}
