package server;


import action_request_response.*;
import actions.*;

public class ActionFactory {
    public Actions getAction(ActionRequest request) {
        Commands command = request.getCommand();
        switch (command){
            case LOGIN:
                return new CheckLogin(request);
            case CREATEUSER:
                return new CreateOwner(request);
            case OWNERINFO:
                return new OwnerInfo(request);
            case WITHDRAWAL:
                return new Withdrawal(request);
            case DEPOSIT:
                return new Deposit(request);
            case DISPLAYWITHDRAWALRECORD:
                return new DisplayWithdrawalRecord(request);
            case DISPLAYDEPOSITRECCORD:
                return new DisplayDepositRecord(request);
            case CREATESAVINGS:
                return new CreateSaving(request);
            case CREATEBOND:
                return new CreateBond(request);
            case UPDATEDEPOSITABLE:
                return new UpdateDepositable(request);
            case VIEWINVESTMENTS:
                return new ViewInvestments(request);
            case CASHOUT:
                return new CashOut(request);
        }
        if (request instanceof LoginRequest) {
            return new CheckLogin((LoginRequest) request);
        } else if (request instanceof CreateUserRequest) {
            return new CreateOwner((CreateUserRequest) request);
        } else if (request instanceof OwnerInfoRequest) {
            return new OwnerInfo((OwnerInfoRequest) request);
        } else if (request instanceof WithdrawalRequest) {
            return new Withdrawal((WithdrawalRequest) request);
        } else if (request instanceof DisplayWithdrawalRecordRequest) {
            return new DisplayWithdrawalRecord((DisplayWithdrawalRecordRequest) request);
        } else if (request instanceof DepositRequest) {
            return new Deposit((DepositRequest) request);
        } else if (request instanceof DisplayDepositRecordRequest) {
            return new DisplayDepositRecord((DisplayDepositRecordRequest) request);
        } else if (request instanceof UpdateDepositableRequest) {
            return new UpdateDepositable((UpdateDepositableRequest) request);
        } else if (request instanceof ViewInvestmentsRequest) {
            return new ViewInvestments((ViewInvestmentsRequest) request);
        } else if (request instanceof CashOutRequest) {
            return new CashOut((CashOutRequest) request);
        } else if (request instanceof CreateBondRequest) {
            return new CreateBond((CreateBondRequest) request);
        } else if (request instanceof CreateSavingRequest) {
            return new CreateSaving((CreateSavingRequest) request);
        } else if (request instanceof DepositSavingRequest) {
            return new ChangeBalanceSaving((DepositSavingRequest) request);
        } else if (request instanceof StoreDataInJsonRequest) {
            return new StoreDataJson((StoreDataInJsonRequest) request);
        } else {
            return null;
        }
    }
}
