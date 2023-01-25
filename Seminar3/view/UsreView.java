package Seminar3.view;

import java.util.List;

import Seminar3.data.User;

public abstract class UsreView {

   public void showTheBest(List<User> userList) {
      User user = findTheBest(userList);
      System.out.println(user);

   }

   protected abstract User findTheBest(List<User> userList);

}
