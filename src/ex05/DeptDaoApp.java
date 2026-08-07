package ex05;

import java.util.List;

import ex05.dao.DeptDao;
import ex05.dto.DeptDto;

public class DeptDaoApp {
public static void main(String[] args) {
    //DeptDto deptDto = new DeptDto("D1", "총무부", "L1");

    //toString 메서드 재정의
    //System.out.println(deptDto);

    DeptDao dao = new DeptDao();

    List<DeptDto> list = dao.findAll();
}
}
