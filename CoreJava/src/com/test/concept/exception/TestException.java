package com.test.concept.exception;

public class TestException {

	public static void main(String[] args) {
		
		
        Integer a = 20, b = 10;

        Integer c = 200, d = 100;

        try{

            System.out.println("block 1");

            if(a<b)

                throw new Exception();

             System.out.println("block 2");

        }catch(Exception e){
        	
        	System.out.println("Gotttt the Exception ");

        }

        try{

            System.out.println("block 3");

            if(c>d)

                throw new Exception();

            System.out.println("block 4");

        }catch(Exception e){

        }

 

	}

}
