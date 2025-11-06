package mergeSort;

public class Main{
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.preencherVetor();
        mergeSort.mergeSort(0, mergeSort.vetor.length-1);
        mergeSort.exibirVetor();
    }
}
