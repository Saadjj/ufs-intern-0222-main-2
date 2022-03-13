package ru.philit.ufs.model.converter.esb.as_fs.MapAdapter;

import ru.philit.ufs.model.converter.esb.as_fs.AsFsAdapter;
import ru.philit.ufs.model.converter.esb.as_fs.Mappers.SrvGetOperationRqMessageMapper;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class MapStructGetOperationAdapter extends AsFsAdapter {

    public static SrvGetOperationRq requestGetOperation(Operation operation) {
        SrvGetOperationRq request = new SrvGetOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvGetOperationRqMessage(SrvGetOperationRqMessageMapper.INSTANCE.toMessage(operation));
        return request;
    }

}
