package ru.philit.ufs.model.entity.oper;

import lombok.Getter;
import lombok.Setter;
import ru.philit.ufs.model.entity.common.ExternalEntity;

import javax.xml.datatype.XMLGregorianCalendar;

@Setter
@Getter
public class SrvGetOperationRqEntity extends ExternalEntity {
    private String operationId;
    private XMLGregorianCalendar createdFrom;
    private XMLGregorianCalendar createdTo;
}
