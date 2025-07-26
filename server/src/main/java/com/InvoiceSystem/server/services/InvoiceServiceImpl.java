package com.InvoiceSystem.server.services;

import com.InvoiceSystem.server.dao.invoiceDao;
import com.InvoiceSystem.server.model.invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    invoiceDao invoiceDao;


    @Override
    public invoice addInvoice(invoice invoice) {
        invoiceDao.save(invoice);
        return invoice;
    }
    @Override
    public List<invoice> getInvoices(){
     return invoiceDao.findAll();

    }

    @Override
    public invoice deleteInvoice(long id) {
        invoice invoice = invoiceDao.findById(id).get();
        invoiceDao.delete(invoice);
        return invoice;
    }

}
