/*
 * _12_Str_method
 **
 strings are start from 0 as a base index 

    * Strings methods

    1. str.length() --> Returns length of string str
    2. str.tolowerCase() --> Returns new string which has all lower case char
    3. str.toUpperCase() --> Returns new string which has all upper case char
    4. str.isBlank() --> Returns bool value true for blank and false for contains
    5. str.indent(n) --> Returns string with pre space indent where n is the spaces numbers
    6. str.trim() --> Returns a new string with no extra spaces ; but it does not remove spaces between tow char in string
    7. str.substring(int start) --> Returns a substring form start to the end [index starts from 0] aani start index la pan include karen
    8. str.substring(int start, int end) --> Returns a substring from start index to the end index ....Start index included and end is excluded.
    9. str.replace(o, n) --> replace old key to new key where o is old & n is new [character representation]
    10. str.replace("target", "replacement") --> replace word by word ; replace target with replacement
    11. str.concat(str2) --> concat str with new str2 eg. str = "Kunal" , str2 = " Dhongade" output will be... Kunal Dhongade
    12. str.startsWith("Hello") --> returns true if str starts with string "Hello"
    
 */
public class _12_Str_method {

  public static void main(String[] args) {
    //             01234
    String name = "KunaL";
    String str = " Dhongade";

    String lowerCaseName = name.toLowerCase();
    System.out.println(lowerCaseName);

    int value = name.length();
    System.out.println(value);

    String upperCase = name.toUpperCase();
    System.out.println(upperCase);

    boolean isBlank = name.isBlank();
    System.out.println(isBlank);

    String indentString = name.indent(1);
    System.out.print(indentString);

    String unTrimString = "        this is unTrimed     string     ";
    System.out.println(unTrimString);

    String trimedString = unTrimString.trim();
    System.out.println(trimedString);

    System.out.println(name.substring(4));
    System.out.println(unTrimString.substring(16));

    System.out.println(name.substring(1, 4));

    System.out.println(name.replace('K', 'b'));

    System.out.println(name.concat(str));

    String str1 = "I am bad boy!";
    System.out.println(str1.replace("bad", "good"));

    System.out.println(str1.startsWith("I am"));
    System.out.println(str1.startsWith("prefix"));
    System.out.println(str1.endsWith("boy!"));
    System.out.println(str1.charAt(4));
  }
}
