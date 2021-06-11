package vishal;

public class MaxWidthBT {
	
	public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	public static class LevelInfo{
	    public int min;
	    public int max;
	    public int width;
	    LevelInfo(){
	        min = Integer.MAX_VALUE;
	        max = Integer.MIN_VALUE;
	        width = 0;
	    }
	}
	private static int maxWidth = 1;
    private static LevelInfo[] levelList = new LevelInfo[3000];
    
    private static void recursiveCall(TreeNode node, boolean direction, int level, int code){
        // direction is false for left, true for right
        
        // get the levelinfo for this level
        LevelInfo lvlInfo = levelList[level];
        if(lvlInfo == null){
            lvlInfo = new LevelInfo();
            lvlInfo.min = code;
            lvlInfo.max = code;
            lvlInfo.width = 1;
            levelList[level] = lvlInfo;
        }
        else{
            // lvlinfo already exists, so this is not the first node at this level
            if(code > lvlInfo.max){
                lvlInfo.max = code;
            }
            else if(code < lvlInfo.min){
                // this code should not be called in an ideal scenario
                lvlInfo.min = code;
            }
            lvlInfo.width = lvlInfo.max - lvlInfo.min + 1;
            if(lvlInfo.width > maxWidth){
                maxWidth = lvlInfo.width;
            }
        }
        
        // call for children
        if(node.left != null)
            recursiveCall(node.left, false, level + 1, code << 1);
        if(node.right != null)
            recursiveCall(node.right, true, level + 1, code << 1 + 1);
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if(root.left != null)
            recursiveCall(root.left, false, 1, 0);
        if(root.right != null)
            recursiveCall(root.right, true, 1, 1);
        
        return maxWidth;
    }
	public static void main(String[] args) {
		
		
	}

}
