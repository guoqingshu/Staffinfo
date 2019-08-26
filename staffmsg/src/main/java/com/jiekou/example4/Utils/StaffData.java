package com.jiekou.example4.Utils;

import com.jiekou.example4.Pojo.Staff;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StaffData {

    private static Map<Integer, Staff> staff=new HashMap<Integer, Staff>();

    static {
        staff.put(10010,new Staff(10010,"张三 ","武汉技术开发部"));
        staff.put(10011,new Staff(10011,"李四 ","华南技术开发部"));
        staff.put(10012,new Staff(10012,"王五 ","华东技术开发部"));
        staff.put(10013,new Staff(10013,"赵六 ","西南技术开发部"));
    }

    public Staff selectByusercode(int usercode){
        return staff.get(usercode);
    }

}
