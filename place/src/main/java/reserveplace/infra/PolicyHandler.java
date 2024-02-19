package reserveplace.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import reserveplace.config.kafka.KafkaProcessor;
import reserveplace.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AccommodationRepository accommodationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationPlaced'"
    )
    public void wheneverReservationPlaced_ReserveSaga(
        @Payload ReservationPlaced reservationPlaced
    ) {
        ReservationPlaced event = reservationPlaced;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + reservationPlaced + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentApproved'"
    )
    public void wheneverPaymentApproved_ReserveSaga(
        @Payload PaymentApproved paymentApproved
    ) {
        PaymentApproved event = paymentApproved;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + paymentApproved + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationConfirmed'"
    )
    public void wheneverReservationConfirmed_ReserveSaga(
        @Payload ReservationConfirmed reservationConfirmed
    ) {
        ReservationConfirmed event = reservationConfirmed;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + reservationConfirmed + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationStatusChanged'"
    )
    public void wheneverReservationStatusChanged_ReserveSaga(
        @Payload ReservationStatusChanged reservationStatusChanged
    ) {
        ReservationStatusChanged event = reservationStatusChanged;
        System.out.println(
            "\n\n##### listener ReserveSaga : " +
            reservationStatusChanged +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationCanceled'"
    )
    public void wheneverReservationCanceled_ReserveSaga(
        @Payload ReservationCanceled reservationCanceled
    ) {
        ReservationCanceled event = reservationCanceled;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + reservationCanceled + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCancelApproved'"
    )
    public void wheneverPaymentCancelApproved_ReserveSaga(
        @Payload PaymentCancelApproved paymentCancelApproved
    ) {
        PaymentCancelApproved event = paymentCancelApproved;
        System.out.println(
            "\n\n##### listener ReserveSaga : " + paymentCancelApproved + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReservationCancelConfirmed'"
    )
    public void wheneverReservationCancelConfirmed_ReserveSaga(
        @Payload ReservationCancelConfirmed reservationCancelConfirmed
    ) {
        ReservationCancelConfirmed event = reservationCancelConfirmed;
        System.out.println(
            "\n\n##### listener ReserveSaga : " +
            reservationCancelConfirmed +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
