package com.zhkj.control.control;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.zhkj.control.send.UDPSendModel;
/***
 * 飞机操作控制层
 * @author i am ok
 *
 */
public class UDPFlightControl {
	
	//Scanner input = new Scanner(System.in);
	
	private String chioce = null;
	private String hight = null;
	public UDPFlightControl() {
		
	}

	public UDPFlightControl(String chioce) {
			this.chioce = chioce;
		}
	
	/*
	 * 发送指令
	 */
	public void udpFlightControl() throws Exception{
		switch (chioce) {
		case "1":
			UDPSendModel Us1 = new UDPSendModel("takeoff");
			Us1.UDPSendCommand();
			JOptionPane.showMessageDialog(null, "起飞成功");
			break;
		case "2":
			UDPSendModel Us2 = new UDPSendModel("land");
			Us2.UDPSendCommand();
			JOptionPane.showMessageDialog(null, "降落成功");
			break;
		case "3":
			hight = (String)JOptionPane.showInputDialog(null, "请输入向上飞的距离(20cm-500cm之间),默认值20：","tello飞行器操作系统", JOptionPane.WARNING_MESSAGE,null,null, "20");
			//System.out.print("请输入向上飞的距离(20cm-500cm之间)：");
			//hight = new Scanner(System.in).nextLine();
			int i = Integer.valueOf(hight);//将字符串转化为数字以便比较
			if(i<20 || i > 500){
				JOptionPane.showMessageDialog(null, "您输入的距离错误，请核对后重新输入");
				//System.out.println("您输入的距离错误，请核对后重新输入");
				break;
			}else{
				String upX = "up" + " " + hight;
				//System.out.println(upX);
				UDPSendModel Us3 = new UDPSendModel(upX);
				Us3.UDPSendCommand();
				break;
			}
		case "4":
			JOptionPane.showMessageDialog(null, "主人再会啦");
			System.exit(0);
		default:
			break;
	}
	}
}
