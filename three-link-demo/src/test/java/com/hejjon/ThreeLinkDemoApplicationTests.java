package com.hejjon;

import com.hejjon.entity.XCity;
import com.hejjon.entity.XCounty;
import com.hejjon.entity.XProvince;
import com.hejjon.repository.IXCityDao;
import com.hejjon.repository.IXCountyDao;
import com.hejjon.repository.IXProvinceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class ThreeLinkDemoApplicationTests {

    @Autowired
    private IXProvinceDao ixProvinceDao;

    @Autowired
    private IXCityDao ixCityDao;

    @Autowired
    private IXCountyDao ixCountyDao;


    @Test
    void contextLoads() {

        XProvince x1 = new XProvince("wrwlrkqrlqw12312", "山东");
        XProvince x2 = new XProvince("agwegsdgesgsg352", "四川");
        XProvince x3 = new XProvince("adgasgasgasgg463", "湖北");
        XProvince x4 = new XProvince("asgasgasfasfasq3", "山西");
        XProvince x5 = new XProvince("sgsgdsw53ssgsdgf", "广东");
        ixProvinceDao.save(x1);
        ixProvinceDao.save(x2);
        ixProvinceDao.save(x3);
        ixProvinceDao.save(x4);
        ixProvinceDao.save(x5);
    }

    @Test
    void test2() {

        XCity c1 = new XCity("arawrharahfa123", "济南", "wrwlrkqrlqw12312");
        XCity c2 = new XCity("afsfafasfazf232", "青岛", "wrwlrkqrlqw12312");

        XCity c3 = new XCity("qweqwqwrqwrqw23", "成都", "agwegsdgesgsg352");
        XCity c4 = new XCity("asfafaffsdfsdf2", "广元", "agwegsdgesgsg352");

        XCity c5 = new XCity("ffwFWfagaaasfa2", "武汉", "adgasgasgasgg463");
        XCity c6 = new XCity("af9rafhsghfa123", "黄冈", "adgasgasgasgg463");

        XCity c7 = new XCity("sdgsdgsdg34tw33", "太原", "asgasgasfasfasq3");
        XCity c8 = new XCity("swetwewe334sds2", "运城", "asgasgasfasfasq3");

        XCity c9 = new XCity("123wadasdsaf23a", "广州", "sgsgdsw53ssgsdgf");
        XCity c10 = new XCity("124asfafasddg21", "佛山", "sgsgdsw53ssgsdgf");

        ixCityDao.save(c1);
        ixCityDao.save(c2);
        ixCityDao.save(c3);
        ixCityDao.save(c4);
        ixCityDao.save(c5);
        ixCityDao.save(c6);
        ixCityDao.save(c7);
        ixCityDao.save(c8);
        ixCityDao.save(c9);
        ixCityDao.save(c10);
    }


    @Test
    void test3() {
        XCounty c1 = new XCounty("asfcvhgghg21", "市中区", "arawrharahfa123");

        XCounty c2 = new XCounty("asfa23asfas0", "崂山区", "afsfafasfazf232");

        XCounty c3 = new XCounty("aafwqq23afa2", "双流区", "qweqwqwrqwrqw23");

        XCounty c4 = new XCounty("asda242as232", "利州区", "asfafaffsdfsdf2");

        XCounty c5 = new XCounty("234afafaf2dd", "洪山区", "ffwFWfagaaasfa2");

        XCounty c6 = new XCounty("afasf4534sdd", "蕲春县", "af9rafhsghfa123");

        XCounty c7 = new XCounty("fafasfa232fa", "迎泽区", "sdgsdgsdg34tw33");

        XCounty c8 = new XCounty("asfas23asf1a", "夏县", "swetwewe334sds2");

        XCounty c9 = new XCounty("afafasfna32e", "黄埔区", "123wadasdsaf23a");

        XCounty c10 = new XCounty("asasf2af212", "南海区", "124asfafasddg21");


        ixCountyDao.save(c1);
        ixCountyDao.save(c2);
        ixCountyDao.save(c3);
        ixCountyDao.save(c4);
        ixCountyDao.save(c5);
        ixCountyDao.save(c6);
        ixCountyDao.save(c7);
        ixCountyDao.save(c8);
        ixCountyDao.save(c9);
        ixCountyDao.save(c10);

    }


}
