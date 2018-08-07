package builder;


public class Email {

    private String to;
    private String cc;
    private String subject;
    private String body;
    private int priority;
    private Boolean attachment;

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public int getPriority() {
        return priority;
    }

    public Boolean getAttachment() {
        return attachment;
    }

    private Email(Builder builder) {
        this.to = builder.to;
        this.cc = builder.cc;
        this.subject = builder.subject;
        this.body = builder.body;
        this.priority = builder.priority;
        this.attachment = builder.attachment;
    }

    static class Builder {
        private String to = "a";
        private String cc = "b";
        private String subject = "c";
        private String body = "d";
        private int priority = 5;
        private Boolean attachment = true;

        public Builder(String to, String subject) {
            this.to = to;
            this.subject = subject;
        }

        public Builder setCc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder setAttachment(Boolean attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build (){
            return new Email(this);
        }
    }
}
