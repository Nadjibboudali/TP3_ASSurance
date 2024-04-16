package org.example;

public class UserService {
    private final UserRepository userRepository;

    // Constructeur prenant UserRepository comme paramètre
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour récupérer un utilisateur par son ID
    public UserService getUserById(long id) {
        return userRepository.findUserById(id); // Supposons que UserRepository a une méthode findById
    }
}
