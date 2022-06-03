public class DynamicArray {

    public int array[];

    public DynamicArray(int length){

        array = new int[length];
    }

    public void add(int element){

        if (array.length == 0){
            array = new int[1];
            array[0] = element;
            return;
        }

        if (array[array.length - 1] != 0) {
            doubleLength();
        }

        for (int i = 0; i < array.length; i++){

            if (array[i] == 0){
                array[i] = element;
                return;
            }
        }
    }

    public void addAt(int element, int index){

        if (array == null && index == 0){
            array = new int[1];
            array[0] = element;
            return;
        }

        if (array == null){
            array = new int[index + 1];
            array[index] = element;
            return;
        }

        if (index >= array.length){
            doubleLength();
            addAt(element, index);
        }

        for (int i = 0; i < array.length; i++){

            if (i == index){
                array[i] = element;
            }
        }
    }

    public void remove(){

        int tempArray[] = array;

        array = new int[array.length - 1];

        for (int i = 0; i < array.length; i++){

            array[i] = tempArray[i];
        }
    }

    public void removeAtWithPosition(int index){

        int tempArray[] = array;

        if (index == array.length - 1) {
            array = new int[array.length - 1];
            return;
        }
        for (int i = 0; i + 1 < array.length; i++){

            if (i >= index){
                array[i] = array[i + 1];
            }
        }
    }

    public void removeAt(int index){

        for (int i = 0; i < array.length; i++){

            if (i == index){
                array[i] = 0;
            }
        }
    }

    public void fillWithRand(int minIndex, int maxIndex, int minValue, int maxValue){

        if (array == null){
            array = new int[1];
            array[0] = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        }

        if (maxIndex >= array.length){

            doubleLength();
            fillWithRand(minIndex, maxIndex, minValue, maxValue);
        }

        for(int i = minIndex; i < array.length; i++){

            array[i] = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        }
    }

    public void print(){

        for (int i = 0; i < array.length; i++){

                System.out.print(array[i] + "   ");
        }
    }

    void doubleLength(){

        int tempArray[] = array;
        int tempLength = array.length;

        array = new int[array.length * 2];

        for (int i = 0; i < tempLength; i++){

            array[i] = tempArray[i];
        }
    }
}
