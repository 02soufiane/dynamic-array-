import java.util.Arrays;


public class Stack{
    String[] array;
    int size;
    int top;

    public Stack(int size){
        this.size=size;
        array= new String[size];
        top=0;
    }

    public void put(String element){
        if(top>=array.length){
            resize(element);
        }else {
            array[top++]=element;
        }
    }

    public int getSize() {
        return size;
    }

    public void resize(String element){
        array=Arrays.copyOf(array,size*2);
        size = array.length;
        array[top++]=element;
    }


    public static void main(String[] args){
        Stack test = new Stack(4);
        test.put("h1");
        test.put("h2");
        test.put("h3");
        test.put("h4");
        System.out.println(test.getSize());
        test.put("h5");
        System.out.println(test.getSize());
    }

}
