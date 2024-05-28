import java.time.LocalDate;

public class MaintainRequest {
    public static void main(String[] args) {
        RequestProduct lowPriority = new LowPriorityRequest();
        lowPriority.processRequest();

        RequestProduct mediumPriority = new MediumPriorityRequest();
        mediumPriority.processRequest();

        RequestProduct highPriority = new HighPriorityRequest();
        highPriority.processRequest();
    }
}

class Request {
    String priority;
    LocalDate expireDate;
    String status;

    public Request(String priority, LocalDate expireDate, String status) {
        this.priority = priority;
        this.expireDate = expireDate;
        this.status = status;
    }
}

interface RequestProduct {
    void setPriority();

    void setStatus();

    void setExpire();

    void processRequest();
}

class LowPriorityRequest implements RequestProduct {
    private Request request;

    public LowPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Ignore";
    }

    @Override
    public void setStatus() {
        this.request.status = "Done";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = LocalDate.now();
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request denied");
        System.out.println("");
    }
}

class MediumPriorityRequest implements RequestProduct {
    private Request request;

    public MediumPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Medium";
    }

    @Override
    public void setStatus() {
        this.request.status = "Accepted";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = LocalDate.now().plusMonths(1);
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Request accepted, estimated completion date is " + this.request.expireDate);
        System.out.println("");

    }
}

class HighPriorityRequest implements RequestProduct {
    private Request request;

    public HighPriorityRequest() {
        this.request = new Request("", null, "");
    }

    @Override
    public void setPriority() {
        this.request.priority = "Emergency";
    }

    @Override
    public void setStatus() {
        this.request.status = "Accept";
    }

    @Override
    public void setExpire() {
        this.request.expireDate = LocalDate.now();
    }

    @Override
    public void processRequest() {
        setPriority();
        setStatus();
        setExpire();
        System.out.println("Emergency request, our Administrator will contact you immediately !");
        System.out.println("");

    }
}
