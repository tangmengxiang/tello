package com.zhkj.control.control;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.zhkj.control.send.UDPSendModel;
/***
 * �ɻ��������Ʋ�
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
	 * ����ָ��
	 */
	public void udpFlightControl() throws Exception{
		switch (chioce) {
		case "1":
			UDPSendModel Us1 = new UDPSendModel("takeoff");
			Us1.UDPSendCommand();
			JOptionPane.showMessageDialog(null, "��ɳɹ�");
			break;
		case "2":
			UDPSendModel Us2 = new UDPSendModel("land");
			Us2.UDPSendCommand();
			JOptionPane.showMessageDialog(null, "����ɹ�");
			break;
		case "3":
			hight = (String)JOptionPane.showInputDialog(null, "���������Ϸɵľ���(20cm-500cm֮��),Ĭ��ֵ20��","tello����������ϵͳ", JOptionPane.WARNING_MESSAGE,null,null, "20");
			//System.out.print("���������Ϸɵľ���(20cm-500cm֮��)��");
			//hight = new Scanner(System.in).nextLine();
			int i = Integer.valueOf(hight);//���ַ���ת��Ϊ�����Ա�Ƚ�
			if(i<20 || i > 500){
				JOptionPane.showMessageDialog(null, "������ľ��������˶Ժ���������");
				//System.out.println("������ľ��������˶Ժ���������");
				break;
			}else{
				String upX = "up" + " " + hight;
				//System.out.println(upX);
				UDPSendModel Us3 = new UDPSendModel(upX);
				Us3.UDPSendCommand();
				break;
			}
		case "4":
			JOptionPane.showMessageDialog(null, "�����ٻ���");
			System.exit(0);
		default:
			break;
	}
	}
}
