class swaparray
{
	public static void main(String[] args) 
	{
		int array[]={1,2,3,4,5,6,7,8,9};
		System.out.println("\nOriginal array is: ");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+" ");
		}
		int last=array.length-1;
		int temp=array[last];
		array[last]=array[0];
		array[0]=temp;
		System.out.println("\nafter swap array is:");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+" ");
		}

	}
}