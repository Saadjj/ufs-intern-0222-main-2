package ru.philit.ufs.model.converter.esb.as_fs;

import ru.philit.ufs.model.entity.common.OperationTypeCode;
import ru.philit.ufs.model.entity.esb.as_fs.OpStatusType;
import ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel;
import ru.philit.ufs.model.entity.oper.OperationStatus;

public class ConvectorsAsFs {

    public static OpStatusType operationStatus(OperationStatus statusType) {
        return (statusType != null) ? OpStatusType.fromValue(statusType.code()) : null;
    }

    public static OperTypeLabel operTypeLabel(OperationTypeCode operationTypeCode) {
        OperTypeLabel operLabel = null;
        return (operationTypeCode != null) ? OperTypeLabel.fromValue(operationTypeCode.code()) : null;
     /*   if( operationTypeCode != null){
            operLabel=OperTypeLabel.fromValue(operationTypeCode.code());
        } else {operationTypeCode=null;}
        return operLabel;

        }*/
    }
}
