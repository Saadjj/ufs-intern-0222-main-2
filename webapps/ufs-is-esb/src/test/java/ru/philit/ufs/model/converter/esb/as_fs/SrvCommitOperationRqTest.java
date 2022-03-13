package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvCommitOperationRqTest extends AsFsAdapterTest{

    private static final String OPERATION_ID="123";

    private SrvCommitOperationRq request;
    private Operation operation=new Operation();


    @Before
    public void setUp() {
        request = new SrvCommitOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvCommitOperationRqMessage(new SrvCommitOperationRq.SrvCommitOperationRqMessage());
        request.getSrvCommitOperationRqMessage().setOperationId(OPERATION_ID);
        operation.setOperationId(OPERATION_ID);
    }

    @Test
    public void testSrvCommitOperationRq() {
        SrvCommitOperationRq request = SrvCommitOperationRqAdapter.requestCommitOperation(operation);
        assertHeaderInfo(request.getHeaderInfo());
        Assert.assertNotNull(request.getSrvCommitOperationRqMessage());
        Assert.assertEquals(request.getSrvCommitOperationRqMessage().getOperationId(), OPERATION_ID);
    }
}
