package DataStrucure.Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    Heap(){
        list=new ArrayList<>();
    }

    private void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);

    }

    private  int parent(int index){

        return (index-1)/2;
    }

    private int left(int index){

        return index*2 +1;
    }
    private int right(int index){

        return index*2 +2;
    }

    private void insert(T value){
        list.add(value);
        upheap(list.size()-1);

    }

    private void upheap(int index){

        int p=parent(index);

        if(list.get(index).compareTo(list.get(p))<0){
            swap(index,p);
            upheap(index);
        }

    }

    private T remove(){
        T item=list.get(0);
        T last=list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0,last);
            downheap( 0);
        }
        return  item;
    }
    private T downheap(int index){

    }
}
