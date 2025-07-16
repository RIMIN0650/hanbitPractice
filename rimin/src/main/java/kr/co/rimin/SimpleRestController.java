package kr.co.rimin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

//    @RequestMapping("/")
//    public String hello(){
//        return "Hello";
//    }
//
//    @RequestMapping("/bye")
//    public String bye(){
//        return "Bye";
//    }

    // 만약 동일한 경로로 2개의 @RequestMapping을 만들면
    // Ambiguous mapping이라는 에러 메세지가 나오면서 애플리케이션이 종료된다.
    // 동일한 경로로 2개의 컨트롤러를 등록하면 어떤 경로로 연결할지 모호하기 때문.

    @RequestMapping("/")
    public String hello(){
        return "Hello <strong>Backend</strong>";
    }
    // HTML로 작성한 코드도 출력 화면에 반영되는 것을 확인 가능.


}
