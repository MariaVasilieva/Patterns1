package org.example.builder;

public class Document {
    private String title;
    private String author;
    private String content;
    private String date;
    private boolean isPublic;
    public Document(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.date = builder.date;
        this.isPublic = builder.isPublic;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                ", isPublic=" + isPublic +
                '}';
    }
    public static class Builder {
        private String title;
        private String author;
        private String content;
        private String date;
        private boolean isPublic;
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }
        public Builder setContent(String content) {
            this.content = content;
            return this;
        }
        public Builder setDate(String date) {
            this.date = date;
            return this;
        }
        public Builder setPublic(boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Document build() {
            return new Document(this);
        }
    }
}
