package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.common.OperationTypeCode;
import ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvCreateOperationRqTest extends AsFsAdapterTest {

    private static final String WORK_PLACE_UID = "66170732-1c50-494c-87f3-71e6dca41322";
    private static final String OPERATOR_ID = "3c149bdb-bc98-4345-92cc-93d9a4dde94b";

    private final Operation operation = new Operation();

    @Before
    public void setUp() {
        operation.setOperatorId(OPERATOR_ID);
        operation.setWorkPlaceUId(WORK_PLACE_UID);
        operation.setTypeCode(OperationTypeCode.FROM_CARD_WITHDRAW);
    }

    @Test
    public void testSrvCreateOperationRq() {
        SrvCreateOperationRq request = SrvCreateOperationRqAdapter.requestCreateOperation(operation);
        assertHeaderInfo(request.getHeaderInfo());
        Assert.assertNotNull(request.getSrvCreateOperationRqMessage());
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getOperatorId(), OPERATOR_ID);
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getWorkPlaceUId(), WORK_PLACE_UID);
        Assert.assertEquals(
            request.getSrvCreateOperationRqMessage().getOperationType(), OperTypeLabel.FROM_CARD_WITHDRAW);
    }
}