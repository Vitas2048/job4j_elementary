package ru.job4j.ex;

public class UserStore {

    @SuppressWarnings("checkstyle:SimplifyBooleanExpression")
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean rsl = false;
        User loguser = null;
        for (User user : users) {
            if (user.getUsername() == login) {
                rsl = true;
                loguser = user;
                break;
            }
            if (!rsl) {
                throw new UserNotFoundException("not found");
            }
        }
        return loguser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) && (user.getUsername().length() < 3)) {
            throw new UserInvalidException("User is invalid");
        }
        return true;
    }

    public static void main(String[] args) {

        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
        }
        } catch (UserInvalidException en) {
            en.printStackTrace();
        } catch (UserNotFoundException ea) {
            ea.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}