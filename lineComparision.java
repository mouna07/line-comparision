class lineComparision{
	public static void main(String args[]){
		System.out.println("Welocome to the line comparision computation problem ");
		int x1=2;
		int x2=6;
		int y1=3;
		int y2=9;
		double length=0;
		double line1=Math.pow((x1-x2),2);
		double line2=Math.pow((y1-y2),2);
		length=Math.sqrt(line1+line2);
		System.out.println("length of the line: "+length);


	}
}
