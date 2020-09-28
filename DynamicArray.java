private Object[] arr;
private int size;

private final int DEFAULT_CAPACITY = 10;
private final double SCALING_FACTOR = 1.5;

public DynamicArray() {
    this.arr = new Object[DEFAULT_CAPACITY];
    this.size = 0;
}

public DynamicArray(int initialCapacity) {
    this.arr = new Object[initialCapacity > 0 ? initialCapacity : DEFAULT_CAPACITY];
    this.size = 0;
}
