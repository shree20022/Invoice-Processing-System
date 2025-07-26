package com.InvoiceSystem.server.controller;
import com.InvoiceSystem.server.model.invoice;
import com.InvoiceSystem.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
public class InvoiceController {
@Autowired
    InvoiceService invoiceService;

    @PostMapping ("/invoice")
    public invoice addInvoice(@RequestBody invoice invoice){
return this.invoiceService.addInvoice(invoice);
    }
    @GetMapping("/invoice")
    public List<invoice> getInvoices(){
        return this.invoiceService.getInvoices();
    }

    @DeleteMapping("/invoice/{invoiceid}")
    public invoice deleteInvoice(@PathVariable String invoiceid){
       return this.invoiceService.deleteInvoice(Long.parseLong(invoiceid));
    }
}
