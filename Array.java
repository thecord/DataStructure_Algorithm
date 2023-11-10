

public class Array { 

	private int[] items;
	private int count
	public Array(int length) {
        items = new int[length];
        
    }
    public void insert(int item) {
        // if the array is full resize
	 if (items.length == count) {
		 int new_items[] = new int[count * 2];
		 for (int i = 0; i < items.length; i++)
			 new_items[i] = items[i];
		 	items = new_items;
	}
	items[count] = item;
	count++;
    }
    public void removeAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		count--;
	}
    public int indexOf(int item) {
		for (int i = 0; i < count; i++ )
			if (items[i] == item)
				return i;
		return -1;
	}    
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }    
}                        
