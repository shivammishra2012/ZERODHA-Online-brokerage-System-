package controller;

public class Admin extends Account{
    @Override
    public boolean resetPassword() {
        return false;
    }
}
