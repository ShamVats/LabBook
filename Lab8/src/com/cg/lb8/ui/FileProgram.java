package com.cg.lb8.ui;

import com.cg.lb8.thread.CopyDataThread;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copy=new CopyDataThread("","destination.txt");
		copy.start();
	}

}
