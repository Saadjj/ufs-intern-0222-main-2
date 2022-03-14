package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.TestData;
import ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCreateOperationRq;

public class SrvCreateOperationRqTest extends AsFsAdapterTest {

    private TestData testData;

    @Before
    public void setUp() {
        testData = new TestData();
    }

    @Test
    public void testSrvCreateOperationRq() {
        SrvCreateOperationRq request = SrvCreateOperationRqAdapter.requestCreateOperation(testData.getOperation());
        assertHeaderInfo(request.getHeaderInfo());
        Assert.assertNotNull(request.getSrvCreateOperationRqMessage());
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getOperatorId(), TestData.OPERATOR_ID);
        Assert.assertEquals(request.getSrvCreateOperationRqMessage().getWorkPlaceUId(), TestData.WORK_PLACE_UID);
        Assert.assertEquals(
            request.getSrvCreateOperationRqMessage().getOperationType(), OperTypeLabel.FROM_CARD_WITHDRAW);
    }
}