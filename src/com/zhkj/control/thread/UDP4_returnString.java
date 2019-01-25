package com.zhkj.control.thread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JOptionPane;

public class UDP4_returnString extends Thread{
	DatagramPacket packet = null;
	
	public UDP4_returnString(DatagramPacket packet){
		this.packet = packet;
	}
	
	@Override
	public void run() {
		byte[] ans = new byte[packet.getLength()];
		System.arraycopy(packet.getData(), 0, ans, 0, packet.getLength());//		源数组.	源数组中的起始位置。目标数组。目标数据中的起始位置。要复制的数组元素的数量。
		String info = new String(ans,0,packet.getLength());//要解码成字符的字节,要解码的第一个字节的索引,要解码的字节数的长度
		System.out.println(info);
	}
}
