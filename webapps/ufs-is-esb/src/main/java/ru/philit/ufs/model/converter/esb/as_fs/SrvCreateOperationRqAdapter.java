package ru.philit.ufs.model.converter.esb.as_fs;

import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;


public class SrvCreateOperationRqAdapter extends AsFsAdapter{


    private static void map(Operation operation, SrvCreateOperationRq.SrvCreateOperationRqMessage message) {
        message.setOperationType(ConvectorsAsFs.operTypeLabel(operation.getTypeCode()));
        message.setOperatorId(operation.getOperatorId());
        message.setWorkPlaceUId(operation.getWorkPlaceUId());

    }
    /**
     * Возвращает объект запроса на создание операции.
     */
    public static SrvCreateOperationRq requestCreateOperation(Operation operation) {
        SrvCreateOperationRq request = new SrvCreateOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCreateOperationRqMessage(new SrvCreateOperationRq.SrvCreateOperationRqMessage());
        map(operation, request.getSrvCreateOperationRqMessage());
        return request;
    }

}
