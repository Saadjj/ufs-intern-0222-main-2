package ru.philit.ufs.model.converter.esb.as_fs.Mappers;

import org.mapstruct.factory.Mappers;
import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public interface SrvGetOperationRqMessageMapper {
    SrvGetOperationRqMessageMapper INSTANCE = Mappers.getMapper(SrvGetOperationRqMessageMapper.class);

    SrvGetOperationRq.SrvGetOperationRqMessage toMessage(Operation operation);
}

