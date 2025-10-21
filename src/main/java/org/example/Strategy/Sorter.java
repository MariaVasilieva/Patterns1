package org.example.Strategy;

public class Sorter {
    private SortingStrategy sortingStrategy;
    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public void sort(int[] array) {
        sortingStrategy.sort(array);
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
}
