package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DesignHashSet {
    private final int MAX_VALUE = 1000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parentList;  //these are the buckets

    public DesignHashSet(){
        parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++){
            parentList.add(null);
        }
    }

    private void add(int key){
         int index = key % ARRAY_SIZE;
         List<Integer> childList = parentList.get(index);
         if (childList == null){
             List<Integer> list = new LinkedList<>();
             list.add(key);
             parentList.set(index,list);
         }else{
             if (!childList.contains(key)){
                 childList.add(key);
             }
         }
    }

    private void remove(int key){
            int index = key % ARRAY_SIZE;
            List<Integer> childList = parentList.get(index);
            if (childList != null){
                childList.remove(Integer.valueOf(key)); //Integer.valueOf because i want to remove the value
            }
    }

    public boolean contains(int key){
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList.contains(key) && childList != null;

    }


}
