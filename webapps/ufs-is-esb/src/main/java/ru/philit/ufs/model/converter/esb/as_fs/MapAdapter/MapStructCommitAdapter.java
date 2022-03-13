package ru.philit.ufs.model.converter.esb.as_fs.MapAdapter;

import ru.philit.ufs.model.converter.esb.as_fs.AsFsAdapter;
import ru.philit.ufs.model.converter.esb.as_fs.Mappers.SrvCommitOperationRqMessageMapper;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class MapStructCommitAdapter extends AsFsAdapter {


    /**
     * Возвращает объект запроса на сохранение операции.
     */
    public static SrvCommitOperationRq requestCommitOperation(Operation operation) {
        SrvCommitOperationRq request = new SrvCommitOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCommitOperationRqMessage(SrvCommitOperationRqMessageMapper.INSTANCE.toMessage(operation));
        return request;
    }
}
