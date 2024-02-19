<template>

    <v-data-table
        :headers="headers"
        :items="reservationStatusInquiry"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ReservationStatusInquiryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            reservationStatusInquiry : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/reservationStatusInquiries'))

            temp.data._embedded.reservationStatusInquiries.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.reservationStatusInquiry = temp.data._embedded.reservationStatusInquiries;
        },
        methods: {
        }
    }
</script>

