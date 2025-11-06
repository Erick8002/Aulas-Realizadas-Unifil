package quickSort;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.preencherVetor();
        quickSort.quickSort(0, quickSort.vetor.length-1);
        quickSort.exibirVetor();
    }
}
