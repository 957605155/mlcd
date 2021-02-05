package com.hp.common.tk;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;


/**
 * tk条件工具封装
 */

public class ConditionUtil {

    private ConditionUtil(){}


    public static Condition buildCondition(Class<?> clazz, List<?> list){
        return new Condition() {
            /**
             * test
             * @throws InterruptedException
             */
            @Override
            public void await() throws InterruptedException {

            }

            /**
             * test
             * @throws InterruptedException
             */
            @Override
            public void awaitUninterruptibly() {

            }

            @Override
            public long awaitNanos(long nanosTimeout) throws InterruptedException {
                return 0;
            }

            @Override
            public boolean await(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public boolean awaitUntil(Date deadline) throws InterruptedException {
                return false;
            }

            @Override
            public void signal() {

            }

            @Override
            public void signalAll() {

            }
        };
    }
}
