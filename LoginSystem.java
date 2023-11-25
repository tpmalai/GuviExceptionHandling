package GuviJavaCollections;

public class LoginSystem {
    public void login(String enteredPassword) throws IncorrectPasswordException {
        String correctPassword = "secret";

        if (!enteredPassword.equals(correctPassword)) {
            throw new IncorrectPasswordException("Incorrect password. Please try again.");
        } else {
            // Login successful
            System.out.println("Login successful!");
        }
    }

    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        try {
            loginSystem.login("wrongpassword");
        } catch (IncorrectPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

