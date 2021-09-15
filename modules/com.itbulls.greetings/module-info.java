module com.itbulls.greetings {
    exports com.itbulls.greetings;
    provides com.itbulls.greetings.ServiceStatusLogger with com.itbulls.greetings.DefaultServiceStatusLogger;
}