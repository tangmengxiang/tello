package com.zhkj.control.control;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.zhkj.control.send.UDPSendModel;
import com.zhkj.view.CommandView;

/**
 * �ɻ�������������
 * @author i am ok
 *
 */
public class UDPFlightControlImpl {
	public static void main(String[] args) throws Exception {
		//Scanner input = new Scanner(System.in);
		String chioce = null;
		//������ʽ����command����
		new UDPSendModel().startTelloSDK();
		//new UDPSendModel().dataFromTello();
		while(true){
			chioce = new CommandView().commandView();//��ȡ��������
			//chioce = input.nextLine();//ѡ���������
			if(chioce == null){
				JOptionPane.showMessageDialog(null,"�˳�ϵͳ�ɹ���");
				System.exit(0);
			}else{
				new UDPFlightControl(chioce).udpFlightControl();//���Ͳ�������
			}
		}
	}
}

