package actions;

import entity.Account;
import entity.Owner;

import java.util.HashMap;

public class ViewAccounts extends Actions {
    private final Owner owner;

    public ViewAccounts(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return this.owner;
    }

    /**
     * This method returns the owners accounts.
     *
     * @return return all the owners accounts.
     */
    public HashMap<Integer, Account> displayAccountsInfo() {
        return this.owner.getAccounts();
    }
}
