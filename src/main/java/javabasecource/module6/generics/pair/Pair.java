package javabasecource.module6.generics.pair;

/**
 * Created by andrew on 23.01.17.
 */
class Pair<T, V> {
    private T first;
    private V second;
    private Pair(T first, V second){
        this.first = first;
        this.second = second;
    }
    public static<T, V> Pair of(T first, V second){
        return new Pair(first, second);
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
        return second != null ? second.equals(pair.second) : pair.second == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
