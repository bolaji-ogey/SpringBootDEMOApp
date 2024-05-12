/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.springboot.demoapp.dao;

import i.ogeyingbo.springbooy.demoapp.data.model.Student;
import java.util.List;
import java.util.Map;
import java.util.Optional;

//import  org.springframework.beans.factory.annotation.Repository; 
import  org.springframework.beans.factory.annotation.Autowired; 
import  org.springframework.jdbc.core.simple.JdbcClient;
import  org.springframework.stereotype.Repository;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */


@Repository
public class JDBCClientDao {
    
    @Autowired
    private JdbcClient jdbcClient;
    
  
    List<Student> getStudentsOfGradeStateAndGenderWithPositionalParams(int grade, String state, String gender) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
            + " where grade = ? and state = ? and gender = ?";
    return jdbcClient.sql(sql)
      .param(grade)
      .param(state)
      .param(gender)
      .query(new StudentRowMapper()).list();
}
    
 
    /***
    @Test
void givenJdbcClient_whenQueryWithPositionalParams_thenSuccess() {
    List<Student> students = studentDao.getStudentsOfGradeStateAndGenderWithPositionalParams(1, "New York", "Male");
    assertEquals(6, students.size());
}
***/


Student getStudentsOfGradeStateAndGenderWithParamsInVarargs(int grade, String state, String gender) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
      + " where grade = ? and state = ? and gender = ? limit 1";
    return jdbcClient.sql(sql)
      .params(grade, state, gender)
      .query(new StudentRowMapper()).single();
}



Optional<Student> getStudentsOfGradeStateAndGenderWithParamsInList(List params) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
      + " where grade = ? and state = ? and gender = ? limit 1";
    return jdbcClient.sql(sql)
      .params(params)
      .query(new StudentRowMapper()).optional();
}


/**
int getCountOfStudentsOfGradeStateAndGenderWithNamedParam(int grade, String state, String gender) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
      + " where grade = :grade and state = :state and gender = :gender";
    RowCountCallbackHandler countCallbackHandler = new RowCountCallbackHandler();
    jdbcClient.sql(sql)
      .param("grade", grade)
      .param("state", state)
      .param("gender", gender)
      .query(countCallbackHandler);
    return countCallbackHandler.getRowCount();
}

**/


List<Student> getStudentsOfGradeStateAndGenderWithParamIndex(int grade, String state, String gender) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
      + " where grade = ? and state = ? and gender = ?";
    return jdbcClient.sql(sql)
      .param(1, grade)
      .param(2, state)
      .param(3, gender)
     // .query(new StudentResultExtractor());
      .query(new StudentRowMapper()).list();
}


List<Student> getStudentsOfGradeStateAndGenderWithParamMap(Map<String, ?> paramMap) {
    String sql = "select student_id, student_name, age, grade, gender, state from student"
      + " where grade = :grade and state = :state and gender = :gender";
    return jdbcClient.sql(sql)
      .params(paramMap)
      .query(new StudentRowMapper()).list();
}

 

    
}
