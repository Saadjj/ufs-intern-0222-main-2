package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import ru.philit.ufs.model.converter.ConverterBaseTest;
import ru.philit.ufs.model.converter.esb.pprb.PprbAdapter;
import ru.philit.ufs.model.entity.common.ExternalEntity;
import ru.philit.ufs.model.entity.esb.as_fs.HeaderInfoType;

public class AsFsAdapterBaseTest extends ConverterBaseTest {

    protected static HeaderInfoType headerInfo() {
        return AsFsAdapter.headerInfo();
    }

    protected static HeaderInfoType headerInfo(String rqUid) {
        HeaderInfoType headerInfo = AsFsAdapter.headerInfo();
        headerInfo.setRqUID(rqUid);
        return headerInfo;
    }

    protected static void assertHeaderInfo(HeaderInfoType headerInfo) {
        Assert.assertNotNull(headerInfo);
        Assert.assertNotNull(headerInfo.getRqUID());
        Assert.assertNotNull(headerInfo.getRqTm());
        Assert.assertEquals(headerInfo.getSpName(), AsFsAdapter.REQUEST_SYSTEM);
        Assert.assertEquals(headerInfo.getSystemId(), AsFsAdapter.RESPONSE_SYSTEM);
    }

    protected static void assertHeaderInfo(ExternalEntity externalEntity) {
        Assert.assertNotNull(externalEntity.getReceiveDate());
        Assert.assertNotNull(externalEntity.getRequestUid());
    }

    protected static void assertHeaderInfo(ExternalEntity externalEntity, String rqUid) {
        Assert.assertNotNull(externalEntity.getReceiveDate());
        Assert.assertEquals(externalEntity.getRequestUid(), rqUid);
    }
}
