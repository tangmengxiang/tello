package com.zhkj.control.control;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.zhkj.control.send.UDPSendModel;
import com.zhkj.view.CommandView;

/**
 * 飞机操作启动程序
 * @author i am ok
 *
 */
public class UDPFlightControlImpl {
	public static void main(String[] args) throws Exception {
		//Scanner input = new Scanner(System.in);
		String chioce = null;
		//匿名方式发送command命令
		new UDPSendModel().startTelloSDK();
		//new UDPSendModel().dataFromTello();
		while(true){
			chioce = new CommandView().commandView();//获取操作命令
			//chioce = input.nextLine();//选择操作命令
			if(chioce == null){
				JOptionPane.showMessageDialog(null,"退出系统成功！");
				System.exit(0);
			}else{
				new UDPFlightControl(chioce).udpFlightControl();//发送操作命令
			}
		}
	}
}

