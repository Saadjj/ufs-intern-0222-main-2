package ru.philit.ufs.model.converter.esb.as_fs;

import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;
import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvGetOperationRqAdapter extends AsFsAdapter{

    private static  void map(Operation operation, SrvGetOperationRq.SrvGetOperationRqMessage message){
        message.setOperationId(operation.getOperationId());
        message.setCreatedFrom(operation.getCreatedFrom());
        message.setCreatedTo(operation.getCreatedFrom());
    }
    /**
     * Возвращает объект запроса на получение операции.
     */
    public static SrvGetOperationRq requestGetOperation(Operation operation) {
        SrvGetOperationRq request = new SrvGetOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvGetOperationRqMessage(new SrvGetOperationRq.SrvGetOperationRqMessage());
        map(operation, request.getSrvGetOperationRqMessage());
        return request;
    }


}
