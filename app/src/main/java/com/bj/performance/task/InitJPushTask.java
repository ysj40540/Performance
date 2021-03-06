package com.bj.performance.task;

import com.bj.performance.alpha.task.ITask;
import com.bj.performance.alpha.task.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lybj
 * @date: 2020/5/13
 * @Description:
 */
public class InitJPushTask extends Task {

    @Override
    public List<Class<? extends ITask>> dependentArr() {
        List<Class<? extends ITask>> tasks = new ArrayList<>();
        tasks.add(InitShareTask.class);
        return tasks;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1500);
            System.out.println("InitJPushTask运行完毕，它所在的线程是："+Thread.currentThread().getName());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
