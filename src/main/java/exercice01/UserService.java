package exercice01;

public class UserService {
    private  UserRepository userRepository ;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository ;
    }
    public User getUserById(long id){
        return this.userRepository.findUserById(id);
    }
}
