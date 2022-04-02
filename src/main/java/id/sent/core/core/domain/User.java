package id.sent.core.core.domain;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString
public class User {
    private Identity id;
    private String name;
    private String email;
    private String password;

    public static User newInstance(String name, String email, String password) {
        return new User(
                Identity.nothing(),
                name,
                email,
                password
        );
    }
}
