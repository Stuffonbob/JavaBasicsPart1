public class Q9 {
    public static void main(String[] args) {

        String[] array = {"john", "michael", "chris", "jessica", "john", "drew", "lonzo", "drew", "john"};

        System.out.println("Print out of every incident where there is a name that duplicates in the array: ");

        for (String name : array) {

            int counter = 0;

            for (int j = 0; j < array.length; j++) {

                String comparison = array[j];

                if (name.equals(comparison)) {
                    counter++;
                    if (counter == 2) {
                        System.out.println(name);
                    }
                }
            }
        }
    }
}

