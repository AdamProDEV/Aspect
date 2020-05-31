package com.adamprodev.aspects;

import com.adamprodev.Step;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectStep {

//    @Around("execution(* com.adamprodev.steps.Steps.*(..))")
//    public void around(ProceedingJoinPoint joinPoint) {
//        System.out.print("Before ");
//        System.out.print(joinPoint.getSignature().getName() + " called with ");
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        System.out.println(((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(Step.class).value());
//    }

    @Before("execution(* *(..)) && @annotation(com.adamprodev.Step)")
    public void before(JoinPoint joinPoint) {
        System.out.print("Before ");
        System.out.print(joinPoint.getSignature().getName() + " called with ");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println(((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(Step.class).value());
    }


//    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//    @Around("execution(* *(..)) && @annotation(com.adamprodev.Step)")
//    public Object logMethods(ProceedingJoinPoint jp) throws Throwable {
//
//        System.out.println("HERE");
//
//        String methodName = jp.getSignature().getName();
//        logRequest(jp);
//
//        long startTime = new Date().getTime();
//        Object result = jp.proceed(jp.getArgs());
//        long endTime = new Date().getTime();
//
//        System.out.println("\nResponse time: " + (endTime - startTime) + "ms");
//        System.out.println("<- " + methodName + " Response: \n" + gson.toJson(result) + "\n");
//
//        return result;
//    }
//
//    private void logRequest(ProceedingJoinPoint jp) {
//        String serviceName = ((MethodSignature) jp.getSignature()).getMethod()
//                .getAnnotation(Step.class).value();
//        System.out.println(serviceName + " CALL:");
//        String[] argNames = ((MethodSignature) jp.getSignature()).getParameterNames();
//        Object[] values = jp.getArgs();
//        Map<String, Object> params = new HashMap<String, Object>();
//        if (argNames.length != 0) {
//            for (int i = 0; i < argNames.length; i++) {
//                params.put(argNames[i], values[i]);
//            }
//        }
//
//        System.out.println("-> " + jp.getSignature().getName() + " Request");
//        if (!params.isEmpty()) System.out.println(gson.toJson(params));
//    }
}
