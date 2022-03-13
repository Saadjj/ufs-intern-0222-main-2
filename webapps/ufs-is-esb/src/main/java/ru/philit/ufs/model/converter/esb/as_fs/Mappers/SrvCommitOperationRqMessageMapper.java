package ru.philit.ufs.model.converter.esb.as_fs.Mappers;

import org.mapstruct.factory.Mappers;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public interface SrvCommitOperationRqMessageMapper {
    SrvCommitOperationRqMessageMapper INSTANCE = Mappers.getMapper(SrvCommitOperationRqMessageMapper.class);

    SrvCommitOperationRq.SrvCommitOperationRqMessage toMessage(Operation operation);
}

