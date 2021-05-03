package com.rt.q4;

public class A extends Thread
{
	Thread t;
    String name;
    int priority;

    A(int priority,String name)
    {
        this.name=name;
        this.priority=priority;
        t=new Thread(this,name);
        System.out.println("New Thread "+t);
        t.start();
    }
    
    @Override
    public void run()
    {
            int p=t.getPriority();
            try
            {
                if(p==4 || p==5)
                    t.sleep(2000);
                else
                    System.out.println(t.currentThread()+"is alive?"+t.isAlive());
                
                while(t.isAlive())
                    System.out.println("Long lasting thread:"+t.getName());
          
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted...!");
            }
    }

}
