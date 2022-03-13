package ru.philit.ufs.model.converter.esb.as_fs;

import org.junit.Assert;
import org.junit.Test;
import ru.philit.ufs.model.converter.esb.multi.MultiAdapter;
import ru.philit.ufs.model.entity.common.ExternalEntity;
import ru.philit.ufs.model.entity.esb.as_fs.HeaderInfoType;

public class AsFsAdapterTest extends AsFsAdapterBaseTest{

    @Test
    public void testHeaderInfo() {
        HeaderInfoType headerInfo = AsFsAdapter.headerInfo();
        assertHeaderInfo(headerInfo);
    }

    @Test
    public void testMultiAdapter() {
        ExternalEntity externalEntity = MultiAdapter.convert(headerInfo());
        Assert.assertNull(externalEntity);
    }
}