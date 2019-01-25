package com.zhkj.control.accpet;

import javax.swing.JOptionPane;

/**
 * 接受特洛伊状态
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
		System.out.println( "tello飞行高度:" + telloFlgitHight + "cm");
		System.out.println("tello剩余电量:" + telloBat + "%");
		
	}
	
}
