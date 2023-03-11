/*
 * package DAO; import java.util.List; import java.util.Optional;
 * 
 * import org.hibernate.Session; import org.hibernate.SessionFactory; import
 * org.hibernate.query.Query; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.domain.Example; import
 * org.springframework.data.domain.Page; import
 * org.springframework.data.domain.Pageable; import
 * org.springframework.data.domain.Sort; import
 * org.springframework.stereotype.Repository; import Model.Student;
 * 
 * @Repository public class Student_DAO_Imp implements Student_DAO{
 * 
 * @Autowired private SessionFactory sessionFactory;
 * 
 * @Override public boolean saveStudent(Student student) { boolean status=false;
 * try { sessionFactory.getCurrentSession().save(student); status=true; } catch
 * (Exception e) { e.printStackTrace(); } return status; }
 * 
 * @Override public List<Student> getStudents() { Session currentSession =
 * sessionFactory.getCurrentSession(); Query<Student>
 * query=currentSession.createQuery("from Student", Student.class);
 * List<Student> list=query.getResultList(); return list; }
 * 
 * @Override public boolean deleteStudent(Student student) { boolean
 * status=false; try { sessionFactory.getCurrentSession().delete(student);
 * status=true; } catch (Exception e) { e.printStackTrace(); } return status; }
 * 
 * @Override public List<Student> getStudentByID(Student student) { Session
 * currentSession = sessionFactory.getCurrentSession(); Query<Student>
 * query=currentSession.createQuery("from Student where student_id=:student_id",
 * Student.class); query.setParameter("student_id", student.getStudent_id());
 * List<Student> list=query.getResultList(); return list; }
 * 
 * @Override public boolean updateStudent(Student student) { boolean
 * status=false; try { sessionFactory.getCurrentSession().update(student);
 * status=true; } catch (Exception e) { e.printStackTrace(); } return status; }
 * 
 * @Override public List<Student> findAll() { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public List<Student> findAll(Sort sort) { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public List<Student> findAllById(Iterable<ID> ids) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public <S extends Student> List<S> saveAll(Iterable<S> entities) {
 * // TODO Auto-generated method stub return null; }
 * 
 * @Override public void flush() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends Student> S saveAndFlush(S entity) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public void deleteInBatch(Iterable<Student> entities) { // TODO
 * Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public Student getOne(ID id) { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public <S extends Student> List<S> findAll(Example<S> example) { //
 * TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends Student> List<S> findAll(Example<S> example, Sort
 * sort) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public Page<Student> findAll(Pageable pageable) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public <S extends Student> S save(S entity) { // TODO
 * Auto-generated method stub return null; }
 * 
 * @Override public Optional<Student> findById(ID id) { // TODO Auto-generated
 * method stub return Optional.empty(); }
 * 
 * @Override public boolean existsById(ID id) { // TODO Auto-generated method
 * stub return false; }
 * 
 * @Override public long count() { // TODO Auto-generated method stub return 0;
 * }
 * 
 * @Override public void deleteById(ID id) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void delete(Student entity) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void deleteAll(Iterable<? extends Student> entities) { //
 * TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void deleteAll() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public <S extends Student> Optional<S> findOne(Example<S> example)
 * { // TODO Auto-generated method stub return Optional.empty(); }
 * 
 * @Override public <S extends Student> Page<S> findAll(Example<S> example,
 * Pageable pageable) { // TODO Auto-generated method stub return null; }
 * 
 * @Override public <S extends Student> long count(Example<S> example) { // TODO
 * Auto-generated method stub return 0; }
 * 
 * @Override public <S extends Student> boolean exists(Example<S> example) { //
 * TODO Auto-generated method stub return false; }
 * 
 * 
 * 
 * }
 */