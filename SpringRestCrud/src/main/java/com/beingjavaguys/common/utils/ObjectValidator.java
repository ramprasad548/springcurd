/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: ObjectValidator.java
 ********************************************************************
 *
 *  Ver   	  Date              Author             Description
 *  ==== 	 ========          ============       ==================
 *  1.0  	  Apr 28, 2015      KulaSekhar           Created
/ ********************************************************************/
package com.beingjavaguys.common.utils;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Provides utility methods used to validate conditions.
 */
public class ObjectValidator {
	/**
	 * This class should not be instantiated.
	 */
	private ObjectValidator() {
	}

	/**
	 * Returns <code>true</code> if the <code>Object</code> is <code>null</code>
	 * or the <code>toString()</code> method of the object returns an empty
	 * string.
	 * 
	 * @param obj
	 *            the object to be tested on.
	 * @return <code>true</code> if the <code>Object</code> is <code>null</code>
	 *         or the <code>toString()</code> method of the object returns an
	 *         empty string.
	 */
	public static boolean isEmpty(Object obj) {
		return (obj == null);
	}

	/**
	 * Returns <code>true</code> if the <code>Object</code> is <code>null</code>
	 * or the <code>toString()</code> method of the object returns an empty
	 * string.
	 * 
	 * @param obj
	 *            the object to be tested on.
	 * @return <code>true</code> if the <code>Object</code> is <code>null</code>
	 *         or the <code>toString()</code> method of the object returns an
	 *         empty string.
	 */
	public static boolean isNull(Object obj) {
		return (obj == null);
	}
	/**
	 * Returns <code>true</code> if the <code>strArray</code> is
	 * <code>null</code> or empty.
	 * 
	 * @param strArray
	 *            the string array to be tested on.
	 * @return <code>true</code> if the <code>strArray</code> is
	 *         <code>null</code> or empty. Otherwise returns <code>false</code>.
	 */
	public static boolean isEmpty(String[] strArray) {
		return ((strArray == null) || (strArray.length == 0));
	}

	/**
	 * Returns <code>true</code> if the <code>intArray</code> is
	 * <code>null</code> or has length of 0.
	 * 
	 * @param intArray
	 *            the integer array to be tested on.
	 * @return <code>true</code> if the <code>intArray</code> is
	 *         <code>null</code> or has length of 0. Otherwise returns
	 *         <code>false</code>.
	 */
	public static boolean isEmpty(int[] intArray) {
		return ((intArray == null) || (intArray.length == 0));
	}

	/**
	 * Returns <code>true</code> if the <code>String</code> is <code>null</code>
	 * , an empty string, or contains only empty spaces.
	 * 
	 * @param str
	 *            the string to be tested on.
	 * @return <code>true</code> if the <code>String</code> is <code>null</code>
	 *         , an empty string, or contains only empty spaces. Otherwise
	 *         returns <code>false</code>.
	 */

	public static boolean isEmpty(String str) {
		return ((str == null) || (str.trim().length() == 0));
	}

	/**
	 * Returns <code>true</code> if the <code>StringBuffer</code> is
	 * <code>null</code>, represents an empty string or an string with only
	 * empty spaces.
	 * 
	 * @param sb
	 *            the StringBuffer to be tested on.
	 * @return <code>true</code> if the <code>StringBuffer</code> is
	 *         <code>null</code> or contains an empty string or an string with
	 *         only empty spaces. Otherwise returns <code>false</code>.
	 */

	public static boolean isEmpty(StringBuffer sb) {
		return ((sb == null) || isEmpty(sb.toString()));
	}

	/**
	 * Returns <code>true</code> if the <code>Collection</code> is
	 * <code>null</code> or empty.
	 * 
	 * @param collection
	 *            the <code>Collection</code> to be tested on.
	 * @return <code>true</code> if the <code>Collection</code> is
	 *         <code>null</code> or empty. Otherwise returns <code>false</code>.
	 */
	public static boolean isEmpty(Collection collection) {
		return ((collection == null) || (collection.isEmpty()));
	}

	/**
	 * Returns <code>true</code> if the <code>Map</code> is <code>null</code> or
	 * empty.
	 * 
	 * @param map
	 *            the <code>Map</code> to be tested on.
	 * @return <code>true</code> if the <code>Map</code> is <code>null</code> or
	 *         empty. Otherwise returns <code>false</code>.
	 */
	public static boolean isEmpty(Map map) {
		return ((map == null) || map.isEmpty());
	}

	/**
	 * Returns <code>true</code> if the <code>List</code> of <code>String</code>
	 * is <code>null</code> or empty or all the <code>String</code> elements are
	 * empty.
	 * 
	 * @param strList
	 *            the string <code>List</code> to be tested on.
	 * @return <code>true</code> if the <code>List</code> of <code>String</code>
	 *         is <code>null</code> or empty or all the <code>String</code>
	 *         elements are empty. Otherwise returns <code>false</code>.
	 * @throws java.lang.ClassCastException
	 *             if an element in the list is not a <code>String</code> object
	 *             (optional).
	 */
	public static boolean isAllEmpty(List strList) {
		String element;
		if ((strList == null) || (strList.size() == 0))
			return true;

		for (int i = 0; i < strList.size(); i++) {
			element = strList.get(i).toString();
			if (!isEmpty(element)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns <code>true</code> if the integer value of the given
	 * <code>Integer</code> is less than 0 or if <code>null</code> is passed in.
	 * 
	 * @param integer
	 *            the <code>Integer</code> to be tested on.
	 * @return <code>true</code> if the integer value of the given
	 *         <code>Integer</code> is less than 0 or if <code>null</code> is
	 *         passed in.
	 */
	public static boolean isNegative(Integer integer) {
		return ((integer == null) || (integer.intValue() < 0));
	}

	/**
	 * Returns <code>true</code> if the given string can be parsed into an
	 * integer.
	 * 
	 * @param str
	 *            the <code>String</code> to be tested on.
	 * @return Returns <code>true</code> if the given string can be parsed into
	 *         an integer. Returns <code>false</code> otherwise, or if the
	 *         string is null or empty.
	 */
	public static boolean isInt(String str) {
		if ((str != null) && (str.length() != 0)) {
			try {
				Integer.parseInt(str);
			} catch (NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Returns <code>true</code> if the given string can be parsed into an
	 * integer or if it is <code>null</code> or empty.
	 * 
	 * @param str
	 *            the <code>String</code> to be tested on.
	 * @return Returns <code>true</code> if the given string can be parsed into
	 *         an integer or if it is <code>null</code> or empty. Otherwise,
	 *         returns <code>false</code>.
	 */
	public static boolean isNullableInt(String str) {
		if ((str != null) && (str.length() != 0)) {
			try {
				Integer.parseInt(str);
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns <code>true</code> if the given string can be parsed into a float.
	 * 
	 * @param str
	 *            the <code>String</code> to be tested on.
	 * @return Returns <code>true</code> if the given string can be parsed into
	 *         a float. Returns <code>false</code> otherwise, or if the string
	 *         is null or empty.
	 */
	public static boolean isFloat(String str) {
		if (str == null) {
			return false;
		}

		try {
			Float.parseFloat(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * Return {@code true} if a given {@code String} can be parsed to a {@code
	 * Number} with NumberFormat.parse().
	 * 
	 * This method will ignore leading and trailing spaces, but is a little more
	 * strict Then the NumberFormat.parse() function. Where as
	 * NumberFormat.parse() will return a number if there is a valid number,
	 * then some invalid data, this method will return false if there is any
	 * left over characters in the string after conversion.
	 * 
	 * Example: {@code NumberFormat.parse("1a") = 1} {@code isNumber("1a") =
	 * false}
	 * 
	 * @param str
	 *            Value to check.
	 * @return True if the input can be parsed with NumberFormat.parse().
	 */
	public static boolean isNumber(String str) {
		if (str == null) {
			return false;
		}
		final String s = str.trim();
		if (s.length() == 0) {
			return false;
		}
		ParsePosition pp = new ParsePosition(0);
		Number n = NumberFormat.getNumberInstance().parse(s, pp);
		return (n != null) && (s.length() == pp.getIndex()); // Make sure the
																// whole string
																// was parsed.
	}

	/**
	 * Returns <code>true</code> if the given string can be parsed into a
	 * nonnegative integers.
	 * 
	 * @param str
	 *            the <code>String</code> to be tested on.
	 * @return Returns <code>true</code> if the given string can be parsed into
	 *         a nonnegative integers. Returns <code>false</code> otherwise, or
	 *         if the string is null or empty.
	 */
	public static boolean isPositiveInt(String str) {
		if (str == null) {
			return false;
		}
		try {
			int num = Integer.parseInt(str);
			return num >= 0;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * Returns <code>true</code> if the given string can be parsed into a float
	 * or if it is <code>null</code> or empty.
	 * 
	 * @param str
	 *            the <code>String</code> to be tested on.
	 * @return Returns <code>true</code> if the given string can be parsed into
	 *         a float or if it is <code>null</code> or empty. Otherwise,
	 *         returns <code>false</code>.
	 */
	public static boolean isNullableFloat(String str) {
		if ((str != null) && (str.length() != 0)) {
			try {
				Float.parseFloat(str);
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns <code>true</code> if the given objects are mutually inclusive.
	 * That is, returns true if either both objects are present or both objects
	 * are not present.
	 * 
	 * @param obj1
	 *            the first <code>Object</code> to be tested on.
	 * @param obj2
	 *            the second <code>Object</code> to be tested on.
	 * @return Returns <code>true</code> if the given objects are mutually
	 *         inclusive. That is, returns true if either both objects are
	 *         present or both objects are not present.
	 */
	public static boolean areMutuallyInclusive(Object obj1, Object obj2) {
		// if not(both absent or both present) then false
		if (!((isEmpty(obj1) && isEmpty(obj2)) || (!isEmpty(obj1) && !isEmpty(obj2)))) {
			return false;
		}
		return true;
	}

	/**
	 * Returns <code>true</code> if the given objects are equal. It returns
	 * exactly what <code>obj1.equals(obj2)</code> returns. Also returns
	 * <code>true</code> if both objects are <code>null</code>.
	 * 
	 * @param obj1
	 *            the first <code>Object</code> to be tested on.
	 * @param obj2
	 *            the second <code>Object</code> to be tested on.
	 * @return Returns <code>true</code> if the given objects are equal. It
	 *         returns exactly what <code>obj1.equals(obj2)</code> returns. Also
	 *         returns <code>true</code> if both objects are <code>null</code>.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public static boolean areEqual(Object obj1, Object obj2) {
		if (obj1 == null || obj2 == null) {
			return ((obj1 == null ? "" : obj1) == (obj2 == null ? "" : obj2));
		} else {
			return obj1.equals(obj2);
		}
	}

	/**
	 * Returns <code>true</code> if the given lists contain the same elements in
	 * the same order. It returns exactly what <code>list1.equals(list2)</code>
	 * returns. Also returns <code>true</code> if both lists are
	 * <code>null</code> or empty.
	 * 
	 * @param list1
	 *            the first <code>List</code> to be tested on.
	 * @param list2
	 *            the second <code>List</code> to be tested on.
	 * @return Returns <code>true</code> if the given lists contain the same
	 *         elements in the same order. It returns exactly what
	 *         <code>list1.equals(list2)</code> returns. Also returns
	 *         <code>true</code> if both lists are <code>null</code> or empty.
	 * 
	 * @see java.util.List#equals(java.lang.Object)
	 */
	public static boolean areEqual(List list1, List list2) {
		if (ObjectValidator.isEmpty(list1) && ObjectValidator.isEmpty(list2)) {
			return true;
		} else if (!ObjectValidator.isEmpty(list1) && !ObjectValidator.isEmpty(list2)) {
			int length1 = list1.size();
			int length2 = list2.size();
			if (length1 != length2) {
				return false;
			} else {
				for (int i = 0; i < length1; i++) {
					Object obj1 = list1.get(i);
					Object obj2 = list2.get(i);

					if (obj1 instanceof java.util.List) {
						if (!(obj2 instanceof java.util.List)) {
							return false;
						} else {
							if (!areEqual((List) obj1, (List) obj2)) {
								return false;
							}
						}
					} else {
						if (!areEqual(obj1, obj2)) {
							return false;
						}
					}
				}
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns <code>true</code> if the given maps represent the same mappings.
	 * It returns exactly what <code>map1.equals(map2)</code> returns. Also
	 * returns <code>true</code> if both maps are <code>null</code> or empty.
	 * 
	 * @param map1
	 *            the first <code>Map</code> to be tested on.
	 * @param map2
	 *            the second <code>Map</code> to be tested on.
	 * @return Returns <code>true</code> if the given maps represent the same
	 *         mappings. It returns exactly what <code>map1.equals(map2)</code>
	 *         returns. Also returns <code>true</code> if both maps are
	 *         <code>null</code> or empty.
	 * 
	 * @see java.util.Map#equals(java.lang.Object)
	 */
	public static boolean areEqual(Map map1, Map map2) {
		if (ObjectValidator.isEmpty(map1) && ObjectValidator.isEmpty(map2)) {
			return true;
		} else {
			if (!ObjectValidator.isEmpty(map1)) {
				return map1.equals(map2);
			} else {
				return map2.equals(map1);
			}
		}
	}
}
