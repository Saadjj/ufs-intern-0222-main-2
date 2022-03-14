package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.TestData;
import ru.philit.ufs.model.entity.esb.as_fs.OpStatusType;
import ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel;
import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;

public class SrvUpdOperationRqTest extends AsFsAdapterTest {

  private TestData testData;

  @Before
  public void setUp() {
    testData = new TestData();
  }

  @Test
  public void testSrvUpdOperationRq() {
    SrvUpdOperationRq request = SrvUpdOperationRqAdapter.requestUpdOperation(testData.getOperation());
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvUpdOperationRqMessage());
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationStatus(), OpStatusType.NEW);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationType(), OperTypeLabel.FROM_CARD_WITHDRAW);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationId(), TestData.OPERATION_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getCashOrderId(), TestData.CASH_ORDER_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationNum(), TestData.OPERATION_NUM);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getWorkPlaceUId(), TestData.WORK_PLACE_UID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperatorId(), TestData.OPERATOR_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRepId(), TestData.REP_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountTypeId(), TestData.SENDER_ACCOUNT_TYPE_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountCurrencyType(), TestData.SENDER_ACCOUNT_CURRENCY_TYPE);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderBank(), TestData.SENDER_BANK);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderBankBIC(), TestData.SENDER_BANK_BIC);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountId(), TestData.SENDER_ACCOUNT_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getAmount(), TestData.AMOUNT);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountTypeId(), TestData.RECIPIENT_ACCOUNT_TYPE_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountCurrencyType(), TestData.RECIPIENT_ACCOUNT_CURRENCY_TYPE);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientBank(), TestData.RECIPIENT_BANK);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientBankBIC(), TestData.RECIPIENT_BANK_BIC);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountId(), TestData.RECIPIENT_ACCOUNT_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getCurrencyType(), TestData.CURRENCY_TYPE);
  }
}
