package cs2003_1;

public class Foo2 {
	
	public void crazyArray(int[] vals){
		int[] newVals = { 1, 7, 6, 1, 3 };
		vals[0] -= vals[0] - newVals[3];
		vals[3] = vals[2] + vals[1] - newVals[4];
		vals[2] -= vals[0] *2;
		vals = newVals;
		vals[1] -= vals[2];
		newVals[2] *= 3 + vals[3];
		vals[1] -= 14 + vals[2];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo2 foo = new Foo2();
		int[] values = {0 ,1 ,3, 1};
		
		foo.crazyArray(values);
		
		for (int n:values){
			System.out.println(values[n]);
			//System.out.printf("%4d\n", values[0] - values[n]);
		}

	}

}
