package app.proxy;

/**
 * IUserController
 *
 * @author roy
 * @version 1.0.0
 *
 */
public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);

}
