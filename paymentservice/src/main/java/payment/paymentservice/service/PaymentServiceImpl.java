package payment.paymentservice.service;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import payment.paymentservice.model.PaymentDTO;
import payment.paymentservice.model.PaymentStatus;

	@Service
	public class PaymentServiceImpl implements PaymentService {

	    private final List<PaymentDTO> payments = new ArrayList<>();

	    public PaymentServiceImpl() {
	        // Hardcoded sample data
	        payments.add(new PaymentDTO(1L, 101L, "CREDIT_CARD", new BigDecimal("2500.00"), PaymentStatus.SUCCESS, Instant.now()));
	        payments.add(new PaymentDTO(2L, 102L, "UPI", new BigDecimal("1800.50"), PaymentStatus.PENDING, Instant.now()));
	        payments.add(new PaymentDTO(3L, 103L, "NET_BANKING", new BigDecimal("4999.99"), PaymentStatus.FAILED, Instant.now()));
	    }

	    @Override
	    public PaymentDTO createPayment(PaymentDTO dto) {
	    	System.out.println("Order payment Done ");
	        dto.setId((long) (payments.size() + 1));
	        dto.setCreatedAt(Instant.now());
	        payments.add(dto);
	        return dto;
	    }

	    @Override
	    public PaymentDTO getPaymentById(Long id) {
	        return payments.stream()
	                .filter(p -> p.getId().equals(id))
	                .findFirst()
	                .orElseThrow(() -> new RuntimeException("Payment not found: " + id));
	    }

	    @Override
	    public List<PaymentDTO> listPayments() {
	        return payments;
	    }

	    @Override
	    public PaymentDTO updatePaymentStatus(Long id, PaymentStatus status) {
	        PaymentDTO payment = getPaymentById(id);
	        payment.setStatus(status);
	        return payment;
	    }

	    @Override
	    public void cancelPayment(Long id) {
	        PaymentDTO payment = getPaymentById(id);
	        payment.setStatus(PaymentStatus.CANCELLED);
	    }
	}

