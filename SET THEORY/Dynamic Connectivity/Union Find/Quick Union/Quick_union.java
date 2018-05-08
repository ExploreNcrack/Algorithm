public class QuickUnionUF
{
	private int[] id;

	public QuickUnionUF(int N)
	{
		//initialization
		id = new int[N];
		//each array index content is its index itself
		for (int i=0 ; i<N ; i++) id[i] = i;
	}

	private int root(int i)
	{
		//using the property that the root has its only index as content to bottom up to the root
		while (i != id[i]) i = id[i];
		//return root index
		return i;
	}


	public boolean connected(int p, int q)
	{
		//check if they are connected by checking if they have the same root
		return root(p) == root(q)
	}

	public void union(int p, int q)
	{	
		//merge by setting p's root as the q's root so they now have the same root
		int i = root(p);
		int j = root(q);
		id[i] = id[j];
	}
}
