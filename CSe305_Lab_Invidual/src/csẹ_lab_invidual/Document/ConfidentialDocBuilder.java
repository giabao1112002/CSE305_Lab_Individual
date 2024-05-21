package Document;

public class ConfidentialDocBuilder implements DocumentBuilder {
    private String name;
    private String type;
    private String content;
    private String extension;
    private boolean encryption;


    @Override
    public DocumentBuilder setDocumentName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public DocumentBuilder setDocumentType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public DocumentBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public DocumentBuilder setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public DocumentBuilder setEncryption(boolean encryption) {
        this.encryption = encryption;
        return this;
    }


    @Override
    public Document BuildDoc() {
        return new Document(name, type, content, extension, encryption);
    }
}
