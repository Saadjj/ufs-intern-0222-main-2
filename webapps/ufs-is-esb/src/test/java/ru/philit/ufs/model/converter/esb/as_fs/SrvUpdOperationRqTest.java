package ru.philit.ufs.model.converter.esb.as_fs;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.philit.ufs.model.entity.common.OperationTypeCode;
import ru.philit.ufs.model.entity.esb.as_fs.OpStatusType;
import ru.philit.ufs.model.entity.esb.as_fs.OperTypeLabel;
import ru.philit.ufs.model.entity.esb.as_fs.SrvUpdOperationRq;
import ru.philit.ufs.model.entity.oper.Operation;
import ru.philit.ufs.model.entity.oper.OperationStatus;

public class SrvUpdOperationRqTest extends AsFsAdapterTest {

  private static final String OPERATION_ID = "66170732-1c50-494c-87f3-71e6dca41322";
  private static final String CASH_ORDER_ID = "3c149bdb-bc98-4345-92cc-93d9a4dde94b";
  private static final String OPERATION_NUM = "1";
  private static final String WORK_PLACE_UID = "be460e02-c137-4a50-aae1-510d91a634f1";
  private static final String OPERATOR_ID = "30b7c486-1dc2-4ed7-8b53-a81dc7af5b65";
  private static final String REP_ID = "397f12ce-d11e-44c5-ad37-0e68d0de8d64";
  private static final String SENDER_ACCOUNT_TYPE_ID = "19554e5a-b3bc-490a-9c0e-20ce5e2fb20d";
  private static final String SENDER_ACCOUNT_CURRENCY_TYPE = "дол";
  private static final String SENDER_BANK = "Идеал-Банк";
  private static final String SENDER_BANK_BIC = "Идеал-Банк BIC";
  private static final String SENDER_ACCOUNT_ID = "Идеал-Банк BIC";
  private static final BigDecimal AMOUNT = new BigDecimal("250");
  private static final String RECIPIENT_ACCOUNT_TYPE_ID = "bec13a61-860f-4616-803e-90c516519249";
  private static final String RECIPIENT_ACCOUNT_CURRENCY_TYPE = "руб";
  private static final String RECIPIENT_BANK = "Пром-Инвест-Банк";
  private static final String RECIPIENT_BANK_BIC = "Пром-Инвест-Банк BIC";
  private static final String RECIPIENT_ACCOUNT_ID = "d9bb88c7-de00-49ac-b480-28e83976b7f4";
  private static final String CURRENCY_TYPE = "евро";

  private final Operation operation = new Operation();

  @Before
  public void setUp() {
    operation.setStatus(OperationStatus.NEW);
    operation.setTypeCode(OperationTypeCode.FROM_CARD_WITHDRAW);
    operation.setOperationId(OPERATION_ID);
    operation.setCashOrderId(CASH_ORDER_ID);
    operation.setOperationNum(OPERATION_NUM);
    operation.setWorkPlaceUId(WORK_PLACE_UID);
    operation.setOperatorId(OPERATOR_ID);
    operation.setRepId(REP_ID);
    operation.setSenderAccountTypeId(SENDER_ACCOUNT_TYPE_ID);
    operation.setSenderAccountCurrencyType(SENDER_ACCOUNT_CURRENCY_TYPE);
    operation.setSenderBank(SENDER_BANK);
    operation.setSenderBankBIC(SENDER_BANK_BIC);
    operation.setSenderAccountId(SENDER_ACCOUNT_ID);
    operation.setAmount(AMOUNT);
    operation.setRecipientAccountTypeId(RECIPIENT_ACCOUNT_TYPE_ID);
    operation.setRecipientAccountCurrencyType(RECIPIENT_ACCOUNT_CURRENCY_TYPE);
    operation.setRecipientBank(RECIPIENT_BANK);
    operation.setRecipientBankBIC(RECIPIENT_BANK_BIC);
    operation.setRecipientAccountId(RECIPIENT_ACCOUNT_ID);
    operation.setCurrencyType(CURRENCY_TYPE);
  }

  @Test
  public void testSrvUpdOperationRq() {
    SrvUpdOperationRq request = SrvUpdOperationRqAdapter.requestUpdOperation(operation);
    assertHeaderInfo(request.getHeaderInfo());
    Assert.assertNotNull(request.getSrvUpdOperationRqMessage());
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationStatus(), OpStatusType.NEW);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationType(), OperTypeLabel.FROM_CARD_WITHDRAW);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationId(), OPERATION_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getCashOrderId(), CASH_ORDER_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperationNum(), OPERATION_NUM);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getWorkPlaceUId(), WORK_PLACE_UID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getOperatorId(), OPERATOR_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRepId(), REP_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountTypeId(), SENDER_ACCOUNT_TYPE_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountCurrencyType(), SENDER_ACCOUNT_CURRENCY_TYPE);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderBank(), SENDER_BANK);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderBankBIC(), SENDER_BANK_BIC);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getSenderAccountId(), SENDER_ACCOUNT_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getAmount(), AMOUNT);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountTypeId(), RECIPIENT_ACCOUNT_TYPE_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountCurrencyType(), RECIPIENT_ACCOUNT_CURRENCY_TYPE);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientBank(), RECIPIENT_BANK);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientBankBIC(), RECIPIENT_BANK_BIC);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getRecipientAccountId(), RECIPIENT_ACCOUNT_ID);
    Assert.assertEquals(request.getSrvUpdOperationRqMessage().getCurrencyType(), CURRENCY_TYPE);
  }
}
