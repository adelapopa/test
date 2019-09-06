package com.company;

public class Main {

    public static void main(String[] args) {
	byte byteVariable = 119;
	short shortVariable = 199;
	int intVariable = 28;
	long longVariable = 5000L + 10L *(byteVariable + shortVariable + intVariable);
	System.out.println(longVariable);

	short shortTotal = (short) (1000 + 10 * (byteVariable + shortVariable + intVariable));
	byte byteTotal = (byte) (1000 + 10 * (byteVariable + shortVariable + intVariable));
	int total = 1000 + 10* (byteVariable + shortVariable + intVariable);

		System.out.println(shortTotal); // 4460
		System.out.println(byteTotal); // 108
		System.out.println(total); // 4460
    }
}
