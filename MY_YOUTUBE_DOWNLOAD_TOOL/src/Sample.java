/* *
 * Copyright (c) 1992-2013 Cisco Systems, Inc and/or its affiliates. All rights reserved.
 * Cisco PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Last Modified By   : $Author$
 * Modified Time      : $Date$
 * File Version       : $Revision$
 * File Path          : $URL$
 */

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception  {
		System.out.print("a");
		System.out.print("\n\r");
		
	}
	public static void main2(String[] args) throws Exception  {
		System.out.print('\b');
		System.out.print("DOWNLOAD: 10");
        System.out.print("\r                    \r");
        System.out.flush();
        Thread.sleep(100);
        System.out.print("DOWNLOAD: 11");

/*
	  float f = 80989f;
	  int i = (int)(f/100);
	  System.out.println(i);*/
	}
	
	public static void main1(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
            if (i % 20 == 0) {
                System.out.print("\r                    \r");
            }
            System.out.flush();
            Thread.sleep(100);
        }
    }

}
