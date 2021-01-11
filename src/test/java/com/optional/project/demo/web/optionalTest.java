package com.optional.project.demo.web;


import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class optionalTest {

    //of : null 값을 입력받으면 nullpointer 에러
    @Test
    public void of메소드_테스트(){
        String name="hgstudy_";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[hgstudy_]",opt.toString());
    }

    @Test
    public void of메소드_NullPointer에러(){
        String name= null;
        Optional<String> opt = Optional.of(name);
    }

    //ofNullable : 일반 객체뿐만 아니라 null값까지 입력으로 받를 수 있다
    @Test
    public void ofNullable_테스트(){
        String name = "hgstudy_";
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional[hgstudy_]",opt.toString());
    }

    @Test
    public void ofNullable_Null_테스트(){
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty",opt.toString());
    }

    // isPresent : Optional이 보유한 값이 null인지 아닌지 확인할 수 있다.
    @Test
    public void isPresnet_테스트(){
        Optional<String> opt = Optional.of("hgstudy_");
        assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        assertFalse(opt.isPresent());
    }

}
