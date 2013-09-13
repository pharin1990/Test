public class GreetingAdv{
	public static void main(String[] args) {
		if (args.length >= 3){
			double height = Double.parseDouble(args[2]);
			System.out.printf("Hello %s. So you are %s years old and your height is %.2f meters", args[0], args[1], height);
		}else{
			System.out.println("Please enter your name, age and height in that order");
		}
	}
}