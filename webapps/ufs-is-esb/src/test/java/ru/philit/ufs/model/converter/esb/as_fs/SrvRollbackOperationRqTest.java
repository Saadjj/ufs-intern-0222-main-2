package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.esb.as_fs.SrvRollbackOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;

public class SrvRollbackOperationRqTest extends AsFsAdapterTest {

  private static final String ROLLBACK_REASON = "Отмена операции пользователем";
  private static final String OPERATION_ID = "3c149bdb-bc98-4345-92cc-93d9a4dde94b";

  private final Operation operation = new Operation();

  @Before
  public void setUp() {
    operation.setOperationId(OPERATION_ID);
    operation.setRollbackReason(ROLLBACK_REASON);
  }

  @Test
  public void testSrvRollbackOperationRq() {
    SrvRollbackOperationRq request = SrvRollbackOperationRqAdapter.requestRollbackOperation(operation);
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvRollbackOperationRqMessage());
    Assert.assertEquals(request.getSrvRollbackOperationRqMessage().getOperationId(), OPERATION_ID);
    Assert.assertEquals(
        request.getSrvRollbackOperationRqMessage().getRollbackReason(), ROLLBACK_REASON);
  }
}
