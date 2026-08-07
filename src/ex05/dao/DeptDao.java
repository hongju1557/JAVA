package ex05.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ex05.dto.DeptDto;
import ex05.util.DBUtil;

public class DeptDao {
    //접근제한자 반환타입 이름 (매개변수 타입 매개변수 이름) {}
    public List<DeptDto> findAll(){
        List<DeptDto> list = new ArrayList<>();
        String sql = "SELECT * FROM DEPT";

        //1.데이터베이스 연결
        try (            
            Connection con = DBUtil.getConnection();
            Statement stmt = con.createStatement();
            //결과집합을 받아올때 사용
            //select(조회) -결과집합 
            //insert, update, delete - 숫자를 반환(몇건이 처리 되었는지)
            

            ResultSet rs = stmt.executeQuery(sql);){

            while (rs.next()){
                //데이터를 꺼내서 변수에 저장하고 객체를 만들어준다
                String deptId = rs.getString(1);
                String deptTitle = rs.getString("dept_titile");
                String locationId = rs.getString(3);

                list.add(new DeptDto(deptId, deptTitle, locationId));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //2.쿼리 질의
        //3.질의 결과를 객체에 담아주기
        // => 계층간 데이터 이동
        // controller = service = dao(mapper)

        return list;
    }
}
