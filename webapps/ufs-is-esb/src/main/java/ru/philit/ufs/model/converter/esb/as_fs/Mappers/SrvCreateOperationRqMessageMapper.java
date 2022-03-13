package ru.philit.ufs.model.converter.esb.as_fs.Mappers;

import org.mapstruct.factory.Mappers;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public interface SrvCreateOperationRqMessageMapper {
    SrvCreateOperationRqMessageMapper INSTANCE = Mappers.getMapper(SrvCreateOperationRqMessageMapper.class);

    SrvCreateOperationRq.SrvCreateOperationRqMessage toMessage(Operation operation);
}

