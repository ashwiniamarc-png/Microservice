package payment.paymentservice.service;

	import java.util.List;

import payment.paymentservice.model.PaymentDTO;
import payment.paymentservice.model.PaymentStatus;

	public interface PaymentService {
	    PaymentDTO createPayment(PaymentDTO dto);
	    PaymentDTO getPaymentById(Long id);
	    List<PaymentDTO> listPayments();
	    PaymentDTO updatePaymentStatus(Long id, PaymentStatus status);
	    void cancelPayment(Long id);
	}
