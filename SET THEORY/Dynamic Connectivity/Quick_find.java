public class QuickFindUF
{
	private int[] id;

	public QuickFindUF(int N)
	{
		//initialize the integer array
		id = new int [N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}
	//check if connected
	public boolean connected(int p, int q)
	{ return id[p] == id[q]; }

	
	public void union(int p, int q)
	{
		int pid = id[p];
		int qid = id[q];
		for (int i=0; i < id.length; i++)
			if (id[i] == pid) id[i] = qid;
	}
}