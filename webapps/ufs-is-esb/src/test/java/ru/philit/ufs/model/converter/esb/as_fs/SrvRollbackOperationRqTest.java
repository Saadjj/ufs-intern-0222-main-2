package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.TestData;
import ru.philit.ufs.model.entity.esb.as_fs.SrvRollbackOperationRq;

public class SrvRollbackOperationRqTest extends AsFsAdapterTest {

  private TestData testData;

  @Before
  public void setUp() {
    testData = new TestData();
  }

  @Test
  public void testSrvRollbackOperationRq() {
    SrvRollbackOperationRq request = SrvRollbackOperationRqAdapter.requestRollbackOperation(testData.getOperation());
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvRollbackOperationRqMessage());
    Assert.assertEquals(request.getSrvRollbackOperationRqMessage().getOperationId(), TestData.OPERATION_ID);
    Assert.assertEquals(
        request.getSrvRollbackOperationRqMessage().getRollbackReason(), TestData.ROLLBACK_REASON);
  }
}
