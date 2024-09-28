package co.edu.uco.crosscutting.helpers;

public class ObjectHelper {

	private ObjectHelper() {
		
	}
	public static <O> boolean isNull(final O object) {
		return object == null;
		
	}
}
