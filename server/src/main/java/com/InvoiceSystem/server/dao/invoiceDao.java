package com.InvoiceSystem.server.dao;

import com.InvoiceSystem.server.model.invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface invoiceDao extends JpaRepository<invoice,Long> {
}
