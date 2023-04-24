package com.practice.behavioral;

public class Proxy {
	
	
	
	public static void main(String[] args) 
	  {
	    RealObject proxy = new RealObjectProxy();
	    proxy.doSomething();
	  }

}


interface RealObject 
{
  public void doSomething();
}

class RealObjectImpl implements RealObject {
	 
	  @Override
	  public void doSomething() {
	    System.out.println("Performing work in real object");
	  }
	 
	}


class RealObjectProxy extends RealObjectImpl 
{
  @Override
  public void doSomething() 
  {
    //Perform additional logic and security
    //Even we can block the operation execution
    System.out.println("Delegating work on real object");
    super.doSomething();
  }
}
