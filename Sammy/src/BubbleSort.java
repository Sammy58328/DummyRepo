import java.io.BufferedReader;
import java.io.InputStreamReader;

class Arraymax
{
int m[]=new int[5];
void input() throws Exception
	{
	int i;
	System.out.println("Enter 5 numbers:");
	for(i=0;i<5;i++) {
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	m[i]=Integer.parseInt(reader.readLine());
	}
	}
void findmax()
	{
int j,k,t;
for(j=0;j<5;j++)
	{
	for(k=1;k<(5-j);k++)
		{
		if(m[k-1]>m[k])
			{
			t=m[k-1];
			m[k-1]=m[k];
			m[k]=t;
			}
		}
	}
System.out.println("The maximum number of given data is :"+m[4]);
	}
}

class BubbleSort
{
public static void main(String args[]) throws Exception
	{
	Arraymax z=new Arraymax();
	z.input();
	z.findmax();
	}
}


