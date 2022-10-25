package service;

import model.PostList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostListService {
    Map<Integer, PostList> map = new HashMap<>();
    private int generation = 0;

    public boolean add(PostList lenta) {
        boolean flag = map.containsValue(lenta);
        if (!flag) {
            map.put(generation++, lenta);
            return true;
        }
        return false;
    }

    public boolean edit(PostList lenta, PostList lenta1) {
        if (map.containsKey(lenta)) {
            map.put(generation++, lenta1);
            return true;
        }
        return false;
    }

    public boolean share(PostList lenta, String name) {
     lenta.setPostName(name);
     map.put(generation++,lenta);
     return true;
    }

    public void showPost(boolean f){
        boolean ff=true;
        Collection<PostList> keys = map.values();
        for (PostList lenta : keys) {
             if (lenta != null){
                 if (f==ff) {
                     System.out.println(lenta);
          }}}}


    public boolean delete(PostList lenta){
        PostList flag = map.remove(lenta);
        return flag != null;
    }

}
