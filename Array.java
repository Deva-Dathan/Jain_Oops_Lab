import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int[] arr = new int[3];

        for (int k = 0; k < 3; k++) {
            arr[k] = -1;
        }

        int choice = 0;
        int x, y, z;
        int val;

        int index = 0;

        while (true) {
            System.out.print(
                    "\nEnter 1 for adding element. \nEnter 2 for updating element. \nEnter 3 for deleting element. \nEnter 4 to display the array. \nEnter 5 to exit\n\n\n");
            choice = ob.nextInt();
            System.out.print("\n\n");

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter the element you want to add : ");
                        x = ob.nextInt();
                        arr[index++] = x;
                        break;

                    } catch (Exception e) {
                        System.out.print("\n\n\nERROR:- Array Index out of bond\n\n\n");
                        break;
                    } finally {
                        System.out.println("Operation Performed!");
                    }

                case 2:
                    try {
                        System.out.println("Enter the index of array you want to update");
                        y = ob.nextInt();
                        System.out.print("Enter the number you want to divide it with");
                        z = ob.nextInt();
                        val = arr[y] / z;
                        arr[y] = val;
                        break;

                    } catch (Exception e) {
                        System.out.print("\n\n\nERROR:- Trying to divide by zero\n\n\n");
                        break;
                    } finally {
                        System.out.println("Operation Performed!");
                    }

                case 3:
                    try {
                        System.out.println("Enter the index of array you want to delete");
                        y = ob.nextInt();
                        arr[y] = -1;
                        System.out.println("Element Deleted!");
                        break;
                    } catch (Exception e) {
                        System.out.print("\n\n\nERROR:- Array Index out of bond\n\n\n");
                        break;
                    } finally {
                        System.out.println("Operation Performed!");
                    }

                case 4:
                    System.out.println("The array is: ");
                    for (int j = 0; j < arr.length; j++) {
                        System.out.println(arr[j]);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

            }
        }

    }
}