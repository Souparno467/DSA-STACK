import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder



class Student {
    private String name;
    private int id;
    private String email;
}
