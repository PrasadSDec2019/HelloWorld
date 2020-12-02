class Calculator{
	
	int z;
	
	public static void main(String args[]){	
	Calculator cal=new Calculator();
	cal.add(10,20);
	cal.sub(10,20);
	cal.mul(10,20);
	cal.div(10,20);
	System.out.println("Value of Z:"+cal.z);

	}

	void add(int x,int y){
		 z=x+y;
		System.out.println("Add:"+z);
	}

	void sub(int x,int y){
		z=x-y;
		System.out.println("sub:"+z);
	}
	void mul(int x,int y){
		z=x*y;
		System.out.println("mul:"+z);
	}
	void div(int x,int y){
		z=y/x;
		System.out.println("div:"+z);
	}

}