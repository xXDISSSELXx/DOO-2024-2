package co.edu.uco.crosscutting.helpers;

public class NumericHelper {
	

	    public static <T extends Number & Comparable<T>> boolean isLessThan(T a, T b) {
	        return a.compareTo(b) < 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isGreaterThan(T a, T b) {
	        return a.compareTo(b) > 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isEqualTo(T a, T b) {
	        return a.compareTo(b) == 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isNotEqualTo(T a, T b) {
	        return a.compareTo(b) != 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isLessOrEqualTo(T a, T b) {
	        return a.compareTo(b) <= 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isGreaterOrEqualTo(T a, T b) {
	        return a.compareTo(b) >= 0;
	    }

	    public static <T extends Number & Comparable<T>> boolean isInRange(T number, T left, T right, boolean includeLeft, boolean includeRight) {
	        boolean greaterThanLeft = includeLeft ? isGreaterOrEqualTo(number, left) : isGreaterThan(number, left);
	        boolean lessThanRight = includeRight ? isLessOrEqualTo(number, right) : isLessThan(number, right);
	        return greaterThanLeft && lessThanRight;
	    }

	    public static <T extends Number & Comparable<T>> boolean isPositive(T number) {
	        return isGreaterThan(number, (T) new Integer(0));
	    }

	    public static <T extends Number & Comparable<T>> boolean isNegative(T number) {
	        return isLessThan(number, (T) new Integer(0));
	    }

}



