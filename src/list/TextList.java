package list;

public class TextList {
    public static void main(String[] args) {

        FixedSizedList<String> stdNames = new FixedSizedList<String>();

        stdNames.add("John");
        System.out.println(stdNames.size());
        stdNames.add("Sam");
        System.out.println(stdNames.size());
        stdNames.add(2,"Philip Peters");
        System.out.println(stdNames.size());
        System.out.println(stdNames.swap(0,1));
        System.out.println(stdNames.countWordsAtIndex(2));
        System.out.println(stdNames.remove(0));
        System.out.println(stdNames.get(0));


    }
}
