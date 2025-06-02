package crpt_api_auth_test.dto;

public class DocDTO {

    public String id;
    public String message;

    public DocDTO() {
    }

    public DocDTO(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
