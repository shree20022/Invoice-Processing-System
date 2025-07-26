package com.InvoiceSystem.server.services;
import com.InvoiceSystem.server.model.invoice;
import java.util.List;

public interface InvoiceService {

    public invoice  addInvoice(invoice invoice);


    public List<invoice> getInvoices();

    public  invoice deleteInvoice(long id);

}
