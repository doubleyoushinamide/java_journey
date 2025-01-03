import com.sun.jdi.InvalidTypeException;

public class GetNames {
    private String surName;
    private String firstName;
    private String middleName;

    public String getSurName() throws InvalidTypeException {
        Bio bio = new Bio();
        String[] name = bio.getCandidateName().toUpperCase().split(" ");
        return name[0];
    }
    public String getFirstName() throws InvalidTypeException {
        Bio bio = new Bio();
        String[] name = bio.getCandidateName().toUpperCase().split(" ");
        return name[1];
    }
    public String getMiddleName() throws InvalidTypeException {
        Bio bio = new Bio();
        String[] name = bio.getCandidateName().toUpperCase().split(" ");
        return name[2];
    }
}
