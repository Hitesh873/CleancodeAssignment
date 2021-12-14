public class FindingMinimumMaximumElement {
    static class C {

        int MinimumElement, MaximumElement;
    }

    static C MiniMaxElement(int arr[], int NumberOfElements ) {
        C Refrence = new C();
        int value;

        if (NumberOfElements == 1) {
            Refrence.MaximumElement = arr[0];
            Refrence.MinimumElement = arr[0];
            return Refrence;
        }

        if (arr[0] > arr[1]) {
            Refrence.MaximumElement = arr[0];
            Refrence.MinimumElement = arr[1];
        } else {
            Refrence.MaximumElement = arr[1];
            Refrence.MinimumElement = arr[0];
        }

        for ( value= 2; value < NumberOfElements; value++) {
            if (arr[value] > Refrence.MaximumElement) {
                Refrence.MaximumElement = arr[value];
            } else if (arr[value] < Refrence.MinimumElement) {
                Refrence.MinimumElement = arr[value];
            }
        }

        return Refrence;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int NumberOfElements = 6;
        C Refrence = MiniMaxElement(arr, NumberOfElements);
        System.out.printf("\na is %d", Refrence.MinimumElement);
        System.out.printf("\nb is %d", Refrence.MaximumElement);
    }
}

