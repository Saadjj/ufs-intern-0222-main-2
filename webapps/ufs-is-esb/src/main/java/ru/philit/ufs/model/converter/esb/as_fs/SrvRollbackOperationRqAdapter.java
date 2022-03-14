package ru.philit.ufs.model.converter.esb.as_fs;

import ru.philit.ufs.model.entity.esb.as_fs.SrvRollbackOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvRollbackOperationRqAdapter extends AsFsAdapter{

    private static void map(Operation operation, SrvRollbackOperationRq.SrvRollbackOperationRqMessage message) {
        message.setOperationId(operation.getOperationId());
        message.setRollbackReason(operation.getRollbackReason());

    }

    /**
     * Возвращает объект запроса на откат операции.
     */
    public static SrvRollbackOperationRq requestRollbackOperation(Operation operation) {
        SrvRollbackOperationRq request = new SrvRollbackOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvRollbackOperationRqMessage(new SrvRollbackOperationRq.SrvRollbackOperationRqMessage());
        map(operation, request.getSrvRollbackOperationRqMessage());
        return request;
    }

}
