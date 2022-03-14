package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.TestData;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;

public class SrvCommitOperationRqTest extends AsFsAdapterTest{

    private TestData testData;

    @Before
    public void setUp() {
        testData = new TestData();
    }

    @Test
    public void testSrvCommitOperationRq() {
        SrvCommitOperationRq request = SrvCommitOperationRqAdapter.requestCommitOperation(testData.getOperation());
        assertHeaderInfo(request.getHeaderInfo());
        Assert.assertNotNull(request.getSrvCommitOperationRqMessage());
        Assert.assertEquals(request.getSrvCommitOperationRqMessage().getOperationId(), TestData.OPERATION_ID);
    }
}
