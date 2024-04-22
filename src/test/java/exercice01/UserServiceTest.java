package exercice01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class UserServiceTest {

    @org.junit.jupiter.api.Test
    void getUserById() {
        
        UserRepository userRepositoryMock = mock(UserRepository.class);

        // Créer un utilisateur
        User user = new User(1, "nom prenom");

        // Définir le comportement du mock pour la méthode findUserById
        when(userRepositoryMock.findUserById(1)).thenReturn(user);

        UserService userService = new UserService(userRepositoryMock);

        User result = userService.getUserById(1);

        verify(userRepositoryMock).findUserById(1);

        
        assertEquals(user, result);
    }
}
