package ru.philit.ufs.model.converter.esb.as_fs.MapAdapter;

import ru.philit.ufs.model.converter.esb.as_fs.AsFsAdapter;
import ru.philit.ufs.model.converter.esb.as_fs.Mappers.SrvUpdOperationRqMessageMapper;
import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class MapStructUpdOperationAdapter extends AsFsAdapter {

    public static SrvUpdOperationRq requestUpdOperation(Operation operation) {
        SrvUpdOperationRq request = new SrvUpdOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvUpdOperationRqMessage(SrvUpdOperationRqMessageMapper.INSTANCE.toMessage(operation));
        return request;
    }
}
