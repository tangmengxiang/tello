package com.zhkj.control.accpet;

import javax.swing.JOptionPane;

/**
 * ����������״̬
 * @author i am ok
 *
 */
public class TelloStatusAccept {
	String info = null;
	
	public TelloStatusAccept(String info){
		this.info = info;
	}
	public void telloStatusAccpet(){
		
		String telloFlgitHight = info.substring(info.indexOf(";h:")+3,info.indexOf(";bat"));
		String telloBat =  info.substring(info.indexOf(";bat")+5,info.indexOf(";baro"));
		System.out.println( "tello���и߶�:" + telloFlgitHight + "cm");
		System.out.println("telloʣ�����:" + telloBat + "%");
		
	}
	
}
