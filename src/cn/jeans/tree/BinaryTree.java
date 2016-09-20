package cn.jeans.tree;
/*
 * 二叉排序树（二叉查找树、二叉搜索树）：左子树的值均小于根节点的值，右子树的值均大于根节点的值
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
	