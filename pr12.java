class Sort {
    public static void main(String[] args) {
        int a[] = {11, 2, 1, 5, 0, 22, 9};  // The array to be sorted

        // Compare each element with every other element
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    // Swap a[i] and a[j]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Array sorted in ascending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

