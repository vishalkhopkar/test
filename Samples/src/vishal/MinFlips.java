package vishal;

public class MinFlips {

	public static void main(String[] args) {
		int[] array = {0, 1, 1, 0, 0, 0, 0, 1, 0};
		int noOfGroups1 = 0, noOfGroups0 = 0;
		int contiguousGrpLen = 1;
		for(int i = 1; i < array.length; i++) {
			if(array[i] == array[i - 1]) {
				
				contiguousGrpLen++;
			}
			else {
				if(array[i - 1] == 1) {
					
					noOfGroups1++;
					System.out.println("i = "+i+" IN NO OF 1 GROUPS "+noOfGroups1);
				}
				else {
					noOfGroups0++;
				}
				System.out.println("i = "+i+" contig grp len "+contiguousGrpLen);
				contiguousGrpLen = 1;
			}
		}
		if(array[array.length - 1] == 1) {
			noOfGroups1++;
		}
		else {
			noOfGroups0++;
		}
		System.out.println("NO OF 0 GROUPS "+noOfGroups0);
		System.out.println("NO OF 1 GROUPS "+noOfGroups1);
	}

}
