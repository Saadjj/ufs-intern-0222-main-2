package ru.philit.ufs.model.converter.esb.as_fs;


import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq.SrvCommitOperationRqMessage;
import ru.philit.ufs.model.entity.oper.Operation;


public class SrvCommitOperationRqAdapter extends AsFsAdapter {

    private static void map(Operation operation, SrvCommitOperationRqMessage message) {
        message.setOperationId(operation.getOperationId());
    }


    /**
     * Возвращает объект запроса на сохранение операции.
     */
    public static SrvCommitOperationRq requestCommitOperation(Operation operation) {
        SrvCommitOperationRq request = new SrvCommitOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCommitOperationRqMessage(new SrvCommitOperationRqMessage());
        map(operation, request.getSrvCommitOperationRqMessage());
        return request;
    }


}




