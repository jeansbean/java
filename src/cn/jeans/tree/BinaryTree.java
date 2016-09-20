package cn.jeans.tree;
/*
 * ���������������������������������������������ֵ��С�ڸ��ڵ��ֵ����������ֵ�����ڸ��ڵ��ֵ
 */
public class BinaryTree {
	 
	int data;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public void insert(BinaryTree root,int data){
		if(data>root.data){
			if(root.right==null){
				root.right = new BinaryTree(data);
			}else{
				this.right.insert(root.right, data);
			}
		}else if(data<root.data){
			if(root.left==null){
				root.left = new BinaryTree(data);
			}else{
				this.left.insert(root.left,data);
			}
		}else{
			return;
		}
	}
}
	