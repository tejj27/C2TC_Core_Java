package MultiThreading;

public class Example extends Thread {
int st;
String msg;

public Example(String msg,int st) {
	this.st = st;
	this.msg = msg;
		}
@Override
public void run() {
	for (int i=1;i<=10;i++)
		{
			try
			  {
				Thread.sleep(st);
			  }
			catch(Exception e)
			{
	}
		System.out.println(msg + i);
		}
		}
		}