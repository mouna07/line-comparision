class lineComparision{
	public static void main(String args[]){
		System.out.println("Welocome to the line comparision computation problem ");
		int x1=2;
		int x2=6;
		int y1=3;
		int y2=9;
		int x3=5;
		int x4=7;
		int y3=9;
		int y4=8;
		double length1=0;
		double length2=0;
		double x=Math.pow((x1-x2),2);
		double y=Math.pow((y1-y2),2);
		double p=Math.pow((x3-x4),2);
		double q=Math.pow((y4-y3),2);
		length1=Math.sqrt(x+y);
		length2=Math.sqrt(p+q);
		System.out.println("length of the line 2: "+length2);
		System.out.println("length of the line 1: "+length1);
		if(length1==length2)
			System.out.println("2 lines are equal");
		else if(length1 > length2)
			System.out.println("line 1 is greater than line 2");
		else
			System.out.println("line 2 is greater than line 1");

	}
}
