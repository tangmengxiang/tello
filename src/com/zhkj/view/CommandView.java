package com.zhkj.view;

import javax.swing.JOptionPane;

/**
 * �ɻ�����ָ����ͼ��
 * @author i am ok
 *
 */
public class CommandView {
	
	/**
	 * ���вٿ�ָ�������ʾ����
	 * @return
	 */
	public String commandView(){
//		System.out.println("��ѡ����Ҫ���еĲ���");
//		System.out.println("1,takeoff����ɡ���");
//		System.out.println("2,land�����䣩��");
//		System.out.println("3,up(���Ϸ�)");
//		System.out.println("4,�˳�ϵͳ��");
//		System.out.print("����������ѡ��");
//
		

		String str = "1,takeoff����ɡ���\n";
		str += "2,land�����䣩��\n";
		str += "3,up(���Ϸ�)\n";
		str += "4,�˳�ϵͳ��\n";
		str += "��ѡ����Ҫ���еĲ���\n";
		Object objResult = JOptionPane.showInputDialog(null, str, "tello����������ϵͳ", JOptionPane.WARNING_MESSAGE, null,
				new String[] { "1", "2", "3", "4" }, "Ĭ��ֵ");
		// System.out.println((String)objResult);
		return (String) objResult;
	}
}
