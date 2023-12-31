package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
   List<User> getAllUsers();

   void saveUser(User user);

   void deleteById(int id);

   User findById(int id);

}