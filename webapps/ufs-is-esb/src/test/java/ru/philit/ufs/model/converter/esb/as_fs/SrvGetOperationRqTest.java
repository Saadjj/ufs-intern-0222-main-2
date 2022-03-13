package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.esb.as_fs.SrvCommitOperationRq;
import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

import javax.xml.datatype.XMLGregorianCalendar;

public class SrvGetOperationRqTest extends AsFsAdapterTest{
//
   private static final String OPERATION_ID="129";
//    private static final XMLGregorianCalendar createdFrom1=;
//    private static final XMLGregorianCalendar createdTo1=;

    private SrvGetOperationRq request;
    private Operation operation=new Operation();


    @Before
    public void setUp() {
        request = new SrvGetOperationRq();
        request.setHeaderInfo(headerInfo());
        request.setSrvGetOperationRqMessage(new SrvGetOperationRq.SrvGetOperationRqMessage());
        request.getSrvGetOperationRqMessage().setOperationId(OPERATION_ID);
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

