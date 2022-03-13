package ru.philit.ufs.model.converter.esb.as_fs.MapAdapter;

import ru.philit.ufs.model.converter.esb.as_fs.AsFsAdapter;
import ru.philit.ufs.model.converter.esb.as_fs.Mappers.SrvRollbackOperationRqMessageMapper;
import ru.philit.ufs.model.entity.esb.as_fs.SrvRollbackOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class MapStructRollbackOperationAdapter extends AsFsAdapter {

    public static SrvRollbackOperationRq requestRollbackOperation(Operation operation) {
        SrvRollbackOperationRq request = new SrvRollbackOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvRollbackOperationRqMessage(SrvRollbackOperationRqMessageMapper.INSTANCE.toMessage(operation));
        return request;
    }


}
