package Document;

public interface DocumentBuilder {
    DocumentBuilder setDocumentName(String name);
    DocumentBuilder setDocumentType(String type);
    DocumentBuilder setContent(String content);
    DocumentBuilder setExtension(String extension);
    DocumentBuilder setEncryption(boolean encryption);
    Document BuildDoc();
}

