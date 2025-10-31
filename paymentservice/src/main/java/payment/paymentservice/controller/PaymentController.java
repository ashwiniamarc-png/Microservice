package payment.paymentservice.controller;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import payment.paymentservice.model.PaymentDTO;
import payment.paymentservice.model.PaymentStatus;
import payment.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	@Autowired
	private final PaymentService paymentService;
    private final List<PaymentDTO> payments = new ArrayList<>();
    
    
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    // ✅ 1️⃣ Create Payment
//    @PostMapping
//    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO dto) {
//        PaymentDTO created = paymentService.createPayment(dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(created);
//    }

    @PostMapping
    public ResponseEntity<PaymentDTO> placePayment(@RequestBody PaymentDTO dto) {
    	
    	System.out.println("In payment service");
    	
    	System.out.println("In Order Amount "+dto.getAmount());
    	System.out.println("In Order Mode "+dto.getPaymentMethod());
        dto.setId((long) (payments.size() + 1));
        dto.setCreatedAt(Instant.now());

        // Simulate payment success or failure
        if (dto.getAmount().compareTo(new BigDecimal("3000")) <= 0) {
            dto.setStatus(PaymentStatus.SUCCESS);
        } else {
            dto.setStatus(PaymentStatus.FAILED);
        }

        payments.add(dto);
        System.out.println("End payment service");
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
    
    
    
    // ✅ 2️⃣ Get Payment by ID
    
    @GetMapping("/{id}")
    public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable Long id) {
        return ResponseEntity.ok(paymentService.getPaymentById(id));
    }

    // ✅ 3️⃣ Get All Payments
    @GetMapping
    public ResponseEntity<List<PaymentDTO>> listPayments() {
        return ResponseEntity.ok(paymentService.listPayments());
    }

    // ✅ 4️⃣ Update Payment Status
    @PutMapping("/{id}/status")
    public ResponseEntity<PaymentDTO> updatePaymentStatus(@PathVariable Long id,
                                                          @RequestParam("status") PaymentStatus status) {
        return ResponseEntity.ok(paymentService.updatePaymentStatus(id, status));
    }

    // ✅ 5️⃣ Delete/Cancel Payment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelPayment(@PathVariable Long id) {
        paymentService.cancelPayment(id);
        return ResponseEntity.noContent().build();
    }
}
