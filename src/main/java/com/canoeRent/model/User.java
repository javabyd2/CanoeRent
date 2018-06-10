package com.canoeRent.model;

public class User {

    /**
     * This class is responsible for handling user data.
     */

    @Entity
    @Table(name = "users")

    public class User implements BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String name;

        @Column(unique = true)
        private String surname;

        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private Long creationTs;


        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return this.email;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Long getCreationTs() {
            return creationTs;
        }

        public void setCreationTs(Long creationTs) {
            this.creationTs = creationTs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
