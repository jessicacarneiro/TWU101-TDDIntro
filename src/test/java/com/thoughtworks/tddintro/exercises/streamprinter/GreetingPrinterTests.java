package com.thoughtworks.tddintro.exercises.streamprinter;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GreetingPrinterTests {

    @Test
    public void shouldPrintGreetings() {
        PrintStream printStream = mock(PrintStream.class);
        GreetingPrinter greetingPrinter = new GreetingPrinter(printStream);

        greetingPrinter.printGreeting();
        verify(printStream).println("Greetings!");
    }
}
