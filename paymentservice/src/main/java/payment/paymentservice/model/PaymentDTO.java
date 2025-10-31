package payment.paymentservice.model;


import java.math.BigDecimal;
import java.time.Instant;

public class PaymentDTO {
    private Long id;
    private Long orderId;
    private String paymentMethod;
    private BigDecimal amount;
    private PaymentStatus status;
    private Instant createdAt;

    public PaymentDTO() {}

    public PaymentDTO(Long id, Long orderId, String paymentMethod,
                      BigDecimal amount, PaymentStatus status, Instant createdAt) {
        this.id = id;
        this.orderId = orderId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public PaymentStatus getStatus() { return status; }
    public void setStatus(PaymentStatus status) { this.status = status; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
