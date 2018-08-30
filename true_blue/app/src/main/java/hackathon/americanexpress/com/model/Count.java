package hackathon.americanexpress.com.model;

/**
 * Ugly class
 */
public class Count {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

     public static int addCount(int x){
        return count += x;
    }
}
