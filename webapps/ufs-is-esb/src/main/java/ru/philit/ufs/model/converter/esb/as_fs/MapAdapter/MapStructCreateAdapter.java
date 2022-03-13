package ru.philit.ufs.model.converter.esb.as_fs.MapAdapter;

import ru.philit.ufs.model.converter.esb.as_fs.AsFsAdapter;
import ru.philit.ufs.model.converter.esb.as_fs.Mappers.SrvCreateOperationRqMessageMapper;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class MapStructCreateAdapter extends AsFsAdapter {


    public static SrvCreateOperationRq requestCreateOperation(Operation operation) {
        SrvCreateOperationRq request = new SrvCreateOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCreateOperationRqMessage(SrvCreateOperationRqMessageMapper.INSTANCE.toMessage(operation));
        return request;
    }
}
