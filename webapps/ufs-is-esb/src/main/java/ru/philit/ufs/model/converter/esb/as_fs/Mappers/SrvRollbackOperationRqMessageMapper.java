package ru.philit.ufs.model.converter.esb.as_fs.Mappers;

import org.mapstruct.factory.Mappers;
import ru.philit.ufs.model.entity.esb.as_fs.SrvRollbackOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public interface SrvRollbackOperationRqMessageMapper {
    SrvRollbackOperationRqMessageMapper INSTANCE = Mappers.getMapper(SrvRollbackOperationRqMessageMapper.class);

    SrvRollbackOperationRq.SrvRollbackOperationRqMessage toMessage(Operation operation);
}


