package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.common.OperationTypeCode;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

import static ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel.TO_CARD_DEPOSIT;
import static ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel.FROM_CARD_WITHDRAW;

public class SrvCreateOperationRqTest extends AsFsAdapterTest{




    private static final String workPlace_UID="125";
    private static final String OPERATOR_ID="129";

    private SrvCreateOperationRq request;
    private Operation operation=new Operation();



    @Before
    public void setUp() {
        request = new SrvCreateOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCreateOperationRqMessage(new SrvCreateOperationRq.SrvCreateOperationRqMessage());
        request.getSrvCreateOperationRqMessage().setOperatorId(OPERATOR_ID);
        request.getSrvCreateOperationRqMessage().setWorkPlaceUId(workPlace_UID);
        request.getSrvCreateOperationRqMessage().setOperationType(TO_CARD_DEPOSIT);
                request.getSrvCreateOperationRqMessage().setOperationType(ConvectorsAsFs.operTypeLabel(OperationTypeCode.FROM_CARD_WITHDRAW));
        operation.setOperatorId(OPERATOR_ID);
        operation.setWorkPlaceUId(workPlace_UID);
        operation.setTypeCode(OperationTypeCode.FROM_CARD_WITHDRAW);


    }

    @Test
    public void testSrvCreateOperationRq() {
        SrvCreateOperationRq request = SrvCreateOperationRqAdapter.requestCreateOperation(operation);
        assertHeaderInfo(request.getHeaderInfo());
        Assert.assertNotNull(request.getSrvCreateOperationRqMessage());
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getOperatorId(),OPERATOR_ID);
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getWorkPlaceUId(),workPlace_UID);
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getOperationType(),FROM_CARD_WITHDRAW);

    }
}
