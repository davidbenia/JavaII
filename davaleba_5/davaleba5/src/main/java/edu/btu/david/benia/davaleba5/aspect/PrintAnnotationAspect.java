package edu.btu.david.benia.davaleba5.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(edu.btu.david.benia.davaleba5.aspect.Println) && args(x, y)")
    public void advice(int x, int y)
    {

        System.out.format("გადაცემული არგუმენტები [%d, %d]", x, y);
    }
}