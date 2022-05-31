class RecursiveEven 
{
	public static void even(int n)
	{
		if(n<15) {
		System.out.print(n+" ");
		even(n+2);
		}
	}

	public static void main(String[] args) {
		even(0);
	}
}