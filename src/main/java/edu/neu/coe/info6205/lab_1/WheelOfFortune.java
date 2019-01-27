package edu.neu.coe.info6205.lab_1;

import java.util.Objects;
import java.util.Random;

/**
 * This class is models a wheel of fortune.
 * The set of possible events is provided in the constructor(s).
 * Each event specifies the event itself and the frequency of that event's occurrence.
 *
 * @param <T> the event type.
 */
public class WheelOfFortune<T> {

    /**
     * Constructor specifying a random number source and a set of events.
     *
     * @param random the random source.
     * @param events the (variable number of) events.
     */
    public WheelOfFortune(Random random, Event<T> ...events) {
        this.random = random;
        this.events = events;
        this.total = getTotal();
    }

    /**
     * Constructor specifying the seed for a random number source and a set of events.
     *
     * @param seed the seed for a random source.
     * @param events the (variable number of) events.
     */
    public WheelOfFortune(long seed, Event<T> ...events) {
        this(new Random(seed), events);
    }

    /**
     * Constructor specifying a set of events.
     * A random number generator is created with a random seed.
     *
     * @param events the (variable number of) events.
     */
    public WheelOfFortune(Event<T> ...events) {
        this(new Random(), events);
    }

    /**
     * Method to get the next randomly chosen event.
     *
     * @return an event of type T
     */
    public T get() {
        // TO BE IMPLEMENTED
        throw new RuntimeException("Not yet implemented");
        // END IMPLEMENTATION
    }

    // Private stuff...
    private int getTotal() {
        int total = 0;
        for (Event<T> event : events) total += event.frequency;
        return total;
    }

    private final Random random;
    private final Event<T>[] events;
    private final int total;

    // Class (static) stuff...

    /**
     * The Event type which includes the event itself and its frequency.
     *
     * @param <E> the event type.
     */
    static class Event<E> {
        final E event;
        final int frequency;

        Event(E event, int frequency) {
            this.event = event;
            this.frequency = frequency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Event<?> event1 = (Event<?>) o;
            return frequency == event1.frequency &&
                    Objects.equals(event, event1.event);
        }

        @Override
        public int hashCode() {
            return Objects.hash(event, frequency);
        }
    }

    /**
     * A public static factory method for an Event.
     *
     * @param event the event.
     * @param frequency its frequency.
     * @param <E> the event type.
     * @return a newly-constructed Event<E.
     */
    public static <E> Event<E> valueOf(E event, int frequency) {
        return new Event<E>(event, frequency);
    }
}
