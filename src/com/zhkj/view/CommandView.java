package com.zhkj.view;

import javax.swing.JOptionPane;

/**
 * 飞机操作指令视图层
 * @author i am ok
 *
 */
public class CommandView {
	
	/**
	 * 飞行操控指令界面显示方法
	 * @return
	 */
	public String commandView(){
//		System.out.println("请选择您要进行的操作");
//		System.out.println("1,takeoff（起飞。）");
//		System.out.println("2,land（降落）。");
//		System.out.println("3,up(向上飞)");
//		System.out.println("4,退出系统。");
//		System.out.print("请输入您的选择：");
//
		

		String str = "1,takeoff（起飞。）\n";
		str += "2,land（降落）。\n";
		str += "3,up(向上飞)\n";
		str += "4,退出系统。\n";
		str += "请选择您要进行的操作\n";
		Object objResult = JOptionPane.showInputDialog(null, str, "tello飞行器操作系统", JOptionPane.WARNING_MESSAGE, null,
				new String[] { "1", "2", "3", "4" }, "默认值");
		// System.out.println((String)objResult);
		return (String) objResult;
	}
}
