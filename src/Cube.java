public class Cube {
	
	public static void main(String args[]) {
		int val = 2;
		if(args.length > 0) {
			val = Integer.valueOf(args[0]);
		}
		System.out.println(cube(val));
	}
	
	public static int cube(int x) {
		return x * x * x;
	}
}