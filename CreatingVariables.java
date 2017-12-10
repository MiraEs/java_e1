public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, shoes;
		double seconds, e, checking, height;
		String firstName, lastName, title, middleName, nickName;

		x = 10;
		y = 400;
		age = 39; 
		shoes = 43849;

		seconds = 4.71;
		e = 2.7139782738472;
		checking = 1.89;
		height = 5.5;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr";
		middleName = "James";
		nickName = "Cool guy";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( firstName + " 's nickName is " + nickName + "." );
		System.out.println( nickName + " often enjoys wearing " + shoes + " shoes, because of his " + height + " stature.");
	}
}