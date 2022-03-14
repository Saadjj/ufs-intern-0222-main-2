package ru.philit.ufs.model.converter.esb.as_fs;

import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvUpdOperationRqAdapter extends AsFsAdapter {

    private static void map(Operation operation, SrvUpdOperationRq.SrvUpdOperationRqMessage message) {
        message.setOperationId(operation.getOperationId());
        message.setCashOrderId(operation.getCashOrderId());
        message.setOperationNum(operation.getOperationNum());
        message.setOperationStatus(ConvectorsAsFs.operationStatus(operation.getStatus()));
        message.setOperationType(ConvectorsAsFs.operTypeLabel(operation.getTypeCode()));
        message.setWorkPlaceUId(operation.getWorkPlaceUId());
        message.setOperatorId(operation.getOperatorId());
        message.setRepId(operation.getRepId());
        message.setSenderAccountTypeId(operation.getSenderAccountTypeId());
        message.setSenderAccountCurrencyType(operation.getSenderAccountCurrencyType());
        message.setSenderBank(operation.getSenderBank());
        message.setSenderBankBIC(operation.getSenderBankBIC());
        message.setSenderAccountId(operation.getSenderAccountId());
        message.setAmount(operation.getAmount());
        message.setRecipientAccountTypeId(operation.getRecipientAccountTypeId());
        message.setRecipientAccountCurrencyType(operation.getRecipientAccountCurrencyType());
        message.setRecipientBank(operation.getRecipientBank());
        message.setRecipientBankBIC(operation.getRecipientBankBIC());
        message.setRecipientAccountId(operation.getRecipientAccountId());
        message.setCurrencyType(operation.getCurrencyType());
    }

    /**
     * Возвращает объект запроса на обновление операции.
     */
    public static SrvUpdOperationRq requestUpdOperation(Operation operation) {
        SrvUpdOperationRq request = new SrvUpdOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvUpdOperationRqMessage(new SrvUpdOperationRq.SrvUpdOperationRqMessage());
        map(operation, request.getSrvUpdOperationRqMessage());
        return request;
    }
}
