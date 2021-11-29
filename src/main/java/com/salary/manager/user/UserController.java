
  package com.salary.manager.user;
  
  import java.util.List; 
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.web.bind.annotation.DeleteMapping; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.PathVariable; 
  import org.springframework.web.bind.annotation.RestController;
  
  @RestController public class UserController {
  
  // @Autowired // private AuthenticationManager authenticationManager;
  
  @Autowired 
  private UserService userService;
  
  @GetMapping("/hello") public String hello() {
  
  return "hello world"; }

/*
 * @PostMapping("/user/register") public ResponseEntity<?> saveUser(@RequestBody
 * User user) throws Exception { return
 * ResponseEntity.ok(userService.save(user)); }
 */
/*
 * @PutMapping("/user") public ResponseEntity<?> editUser(@RequestBody User
 * user) throws Exception { return ResponseEntity.ok(userService.save(user)); }
 */
  
  @GetMapping("/user/{username}") 
  public User getByUserName(@PathVariable String username)
  { 
	  return userService.getUserByUsername(username); 
  }
  
  @GetMapping("/users") 
  public List<User> getUsers()
  { 
	  return userService.loadUsers(); 
  }
  
  @DeleteMapping("/user/delete/{user}") 
  public List<User>deleteUser(@PathVariable User user)
  { 
	  userService.delete(user); 
	  return userService.loadUsers(); 
  }
  
  @DeleteMapping("/user/{id}") 
  public List<User> deleteUser(@PathVariable int id)
  {
	  userService.deleteById(id); return userService.loadUsers(); 
  }
  
	/*
	 * @PostMapping("/user/add-roles") public Optional<User> userRole(@RequestBody
	 * User user){ return userService.addUserAndRoles(user); }
	 */
  
  }
 