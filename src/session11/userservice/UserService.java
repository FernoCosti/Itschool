package session11_abstraction.userservice;

public interface UserService {

    /**
     * Creates a user
     *
     * @param userDTO
     */
    void createUser(UserDTO userDTO);

    /**
     * @param id
     * @return
     */
    UserDTO findUserById(long id);

    void deleteUser(long id);
}