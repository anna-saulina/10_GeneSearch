public class Main {
    public static void main(String args[]) {

        System.out.println("Геномная последовательность:");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n");

        for (int q = 1; q < arr.length; q++) {
            for (int w = arr.length - 1; w >= q; w--) {
                if (arr[w - 1] > arr[w]) {
                    int tmp = arr[w - 1];
                    arr[w - 1] = arr[w];
                    arr[w] = tmp;
                }
            }
        }

        System.out.println("SORTED:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n");
    }
}
