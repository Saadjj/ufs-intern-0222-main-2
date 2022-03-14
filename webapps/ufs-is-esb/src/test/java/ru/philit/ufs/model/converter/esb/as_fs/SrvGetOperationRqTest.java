package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.TestData;
import ru.philit.ufs.model.entity.esb.as_fs.SrvGetOperationRq;

public class SrvGetOperationRqTest extends AsFsAdapterTest {
  private TestData testData;

  @Before
  public void setUp() {
    testData = new TestData();
  }

  @Test
  public void testSrvGetOperationRq() {
    SrvGetOperationRq request = SrvGetOperationRqAdapter.requestGetOperation(testData.getOperation());
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvGetOperationRqMessage());
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getOperationId(), TestData.OPERATION_ID);
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getCreatedFrom(), TestData.XML_CREATED_FROM);
    Assert.assertEquals(request.getSrvGetOperationRqMessage().getCreatedTo(), TestData.XML_CREATED_TO);
  }
}
