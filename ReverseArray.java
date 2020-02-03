import java.util.*;
class ReverseArray
{
	 void reverse(int a[],int n)
	{
		int []b= new int[n];
		int j=n;
		for(int i=0;i<=n;i++)
		{
			b[i]=a[j-i];
			j--;
		}
		System.out.println("reversed array is f:");
		for(int i=0;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void rev(int a[],int n)
	{
		int l=n/2;
		int temp;
		for(int i=0;i<=l;i++)
		{
			temp=a[i];
			a[i]=a[n-i];
			a[n-i]=temp;

		}
		for(int k=0;k<=n;k++)
			System.out.println(a[k]);
	}
	void printarray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int array[]={10,20,30,40,50,60};
		ReverseArray eg = new ReverseArray();
		eg.printarray(array,array.length);
		eg.reverse(array,array.length);

	}
}