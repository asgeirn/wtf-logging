package no.twingine.logging;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class WtfLevelConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        switch (event.getLevel().levelInt) {
        case Level.ERROR_INT:
            return "OMG";
        case Level.WARN_INT:
            return "WTF";
        case Level.INFO_INT:
            return "FYI";
        case Level.DEBUG_INT:
            return "BTW";
        default:
            return event.getLevel().levelStr;
        }
    }

}
