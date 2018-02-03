package Test;

public class MergeTwoBinaryTrees617_v2 {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		if (t1 == null)
			return t2;

		TreeNode p = new TreeNode(1);
		p.left = t1;
		getmergeTrees(t1, t2, true, p);
		return t1;
	}

	public void getmergeTrees(TreeNode t1, TreeNode t2, boolean isLeft, TreeNode p) {

		if (t1 == null && t2 == null)
			return;

		if (t1 == null && t2 != null) {

			if (isLeft)
				p.left = t2;
			else
				p.right = t2;
			return;
		}

		if (t1 != null && t2 == null) {
			return;
		}

		t1.val = t1.val + t2.val;
		getmergeTrees(t1.left, t2.left, true, t1);
		getmergeTrees(t1.right, t2.right, false, t1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
