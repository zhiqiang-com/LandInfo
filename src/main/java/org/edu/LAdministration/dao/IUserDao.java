package org.edu.LAdministration.dao;

import  org.edu.LAdministration.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    User selectUser(long id);

}
