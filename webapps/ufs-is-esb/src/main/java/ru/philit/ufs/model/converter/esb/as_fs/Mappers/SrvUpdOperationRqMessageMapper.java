package ru.philit.ufs.model.converter.esb.as_fs.Mappers;

import org.mapstruct.factory.Mappers;
import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public interface SrvUpdOperationRqMessageMapper {
    SrvUpdOperationRqMessageMapper INSTANCE = Mappers.getMapper(SrvUpdOperationRqMessageMapper.class);

    SrvUpdOperationRq.SrvUpdOperationRqMessage toMessage(Operation operation);
}


