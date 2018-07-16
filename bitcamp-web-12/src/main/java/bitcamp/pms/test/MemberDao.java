package bitcamp.pms.test;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {

    @Override
    public String toString() {
        return "MemberDao [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    
}
