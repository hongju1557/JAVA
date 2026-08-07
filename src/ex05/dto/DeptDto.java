package ex05.dto;

import lombok.*;

//테이블에서 조회된 값을 담기 위해 필드를 선언한다

//lombok 라이브러리를 사용하면 어노테이션(@)을 이용해서
//set,get 생성자 등을 자동으로 만들 수 있다
//setter, getter
@Data

//매개변수생성자
@AllArgsConstructor
//기본생성자
@NoArgsConstructor
public class DeptDto {
    private String deptId;
    private String deptCode;
    private String locationId;
}
