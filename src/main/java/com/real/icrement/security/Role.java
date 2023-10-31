/*
 * package com.real.icrement.security;
 * 
 * import org.springframework.security.core.GrantedAuthority;
 * 
 * import jakarta.persistence.Column; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="security_role") public class Role implements GrantedAuthority {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * @Column(name = "role_name") private String roleName;
 * 
 * @Column(name = "description") private String description;
 * 
 * @Override public String getAuthority() { // TODO Auto-generated method stub
 * return roleName; }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getRoleName() { return roleName; }
 * 
 * public void setRoleName(String roleName) { this.roleName = roleName; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * }
 */