package ru.philit.ufs.model.converter.esb.as_fs;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.converter.ConverterBaseTest;
import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvGetOperationRqTest extends AsFsAdapterTest {
  //
  private static final String OPERATION_ID = "30b7c486-1dc2-4ed7-8b53-a81dc7af5b65";

  private final Operation operation = new Operation();
  private final Date createFrom = ConverterBaseTest.date(2017, 5, 4, 0, 0);
  private final Date createdTo = ConverterBaseTest.date(2017, 7, 4, 0, 0);

  private static final XMLGregorianCalendar xmlCreatedFrom = ConverterBaseTest.xmlCalendar(2017, 5, 4, 0, 0);
  private static final XMLGregorianCalendar xmlCreatedTo = ConverterBaseTest.xmlCalendar(2017, 7, 4, 0, 0);

  @Before
  public void setUp() {
    operation.setOperationId(OPERATION_ID);
    operation.setCreatedFrom(createFrom);
    operation.setCreatedTo(createdTo);
  }

  @Test
  public void testSrvGetOperationRq() {
    SrvGetOperationRq request = SrvGetOperationRqAdapter.requestGetOperation(operation);
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvGetOperationRqMessage());
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getOperationId(), OPERATION_ID);
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getCreatedFrom(), xmlCreatedFrom);
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getCreatedTo(), xmlCreatedTo);
  }
}
