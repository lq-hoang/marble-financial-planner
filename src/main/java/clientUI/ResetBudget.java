package clientUI;

import action_request_response.ActionRequest;
import action_request_response.Commands;
import action_request_response.ResetBudgetResponse;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ResetBudget extends SendReceive{
    public ResetBudget(ObjectOutputStream outbound, ObjectInputStream inbound) {
        super(outbound, inbound);
    }
    public void resetBudget(String username){
        ActionRequest request = new ActionRequest(username, Commands.RESETBUDGET, new ArrayList<>());
        sendReceiveObject(request);
        if (response != null) {
            System.out.println(((ResetBudgetResponse) response).getResult());
        }
    }
}
