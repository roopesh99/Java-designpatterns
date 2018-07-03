package org.com.Executor;

import java.text.NumberFormat;

public class Memory1 {
public static void main(String[] args) {
	Runtime runtime = Runtime.getRuntime();

	//NumberFormat format = NumberFormat.getInstance();

	//StringBuilder sb = new StringBuilder();
	long maxMemory = runtime.maxMemory();
	long allocatedMemory = runtime.totalMemory();
	long freeMemory = runtime.freeMemory();

	/* sb.append("free memory: " + format.format(freeMemory / 1024) + "<br/>");
	sb.append("allocated memory: " + format.format(allocatedMemory / 1024) + "<br/>");
	sb.append("max memory: " + format.format(maxMemory / 1024) + "<br/>");
	sb.append("total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / 1024) + "<br/>");
	System.out.println(" "+sb); */
	
	System.out.println( "free memory: "+((freeMemory/1024)/1024));
	System.out.println( "Allocated Memory: "+((allocatedMemory/1024)/1024));
	System.out.println( "max Memory: "+((maxMemory/1024)/1024));
}
}
