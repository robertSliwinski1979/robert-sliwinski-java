package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskList;
import com.kodilla.hibernate.task.dao.TaskListDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION = "Test: Homework 17.2";
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {

        //Given
        TaskList taskList = new TaskList("Name of the first list", "Description of the first list");

        //When
        taskListDao.save(taskList);
        String name = taskList.getListName();

        List<TaskList> readName = taskListDao.findByListName("Name of the first list");
        assertEquals(name, readName.get(0).getListName());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);

    }
}
