package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class JobSortTest {

    @Test
    public void whenSortAscByName() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, ba3);
        list.sort(new JobAscByName());
        List<Job> expected = Arrays.asList(aa2, ba3, ca1);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortDescByName() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, ba3);
        list.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(ca1, ba3, aa2);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortAscByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, ba3);
        list.sort(new JobAscPriority());
        List<Job> expected = Arrays.asList(ca1, aa2, ba3);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortDescByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, ba3);
        list.sort(new JobDescPriority());
        List<Job> expected = Arrays.asList(ba3, aa2, ca1);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortAscByNameAscByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        Job aa1 = new Job("AA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, aa1, ba3);
        list.sort(new JobAscByName().thenComparing(new JobAscPriority()));
        List<Job> expected = Arrays.asList(aa1, aa2, ba3, ca1);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortAscByNameDescByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        Job aa1 = new Job("AA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, aa1, ba3);
        list.sort(new JobAscByName().thenComparing(new JobDescPriority()));
        List<Job> expected = Arrays.asList(aa2, aa1, ba3, ca1);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortDescByNameAscByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        Job aa1 = new Job("AA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, aa1, ba3);
        list.sort(new JobDescByName().thenComparing(new JobAscPriority()));
        List<Job> expected = Arrays.asList(ca1, ba3, aa1, aa2);
        assertArrayEquals(expected.toArray(), list.toArray());
    }

    @Test
    public void whenSortDescByNameDescByPriority() {
        Job aa2 = new Job("AA", 2);
        Job ba3 = new Job("BA", 3);
        Job ca1 = new Job("CA", 1);
        Job aa1 = new Job("AA", 1);
        List<Job> list = Arrays.asList(ca1, aa2, aa1, ba3);
        list.sort(new JobDescByName().thenComparing(new JobDescPriority()));
        List<Job> expected = Arrays.asList(ca1, ba3, aa2, aa1);
        assertArrayEquals(expected.toArray(), list.toArray());
    }
}