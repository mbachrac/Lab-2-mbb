package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // TODO makeListFixture:
  List<Team> makeListFixture(final int size){
    final List<Team>list=new ArrayList<>(size);
    for (int i =0; i<size; i++){
        final String s=Integer.toString(i);
        list.add(new Team("Team "+s,"Coach "+s,i*100+50));
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f:
  @Test
    public void testFindPositionListZero()
  {
      final List<Team> list=makeListFixture(0);
      assertFalse(Search.findTeamPosition(list,"Team 5").isPresent());
  }
    @Test
    public void testFindPositionList10s()
    {
        final List<Team> list=makeListFixture(10);
        assertTrue(Search.findTeamPosition(list,"Team 5").isPresent());
    }
    @Test
    public void testFindPositionList10f()
    {
        final List<Team> list=makeListFixture(10);
        assertFalse(Search.findTeamPosition(list,"Team 11").isPresent());
    }
  
  // TODO: testFindMinFundingArray for several sizes and scenarios:
    @Test
    public void testFindMinFundingArray1()
    {
        final Team[] arr = makeArrayFixture(0);
        assertEquals(Optional.empty(),Search.findTeamMinFunding(arr,49));
    }
    @Test
    public void testFindMinFundingArray2()
    {
        final Team[] arr = makeArrayFixture(4);
        assertEquals(Optional.of(3),Search.findTeamMinFunding(arr,301));
    }
    @Test
    public void testFindMinFundingArray3()
    {
        final Team[] arr = makeArrayFixture(55);
        assertEquals(Optional.of(46),Search.findTeamMinFunding(arr,4560));
    }
    @Test
    public void testFindMinFundingArray4()
    {
        final Team[] arr = makeArrayFixture(2);
        assertEquals(Optional.of(1),Search.findTeamMinFunding(arr,51));
    }
    @Test
    public void testFindMinFundingArray5()
    {
        final Team[] arr = makeArrayFixture(6);
        assertEquals(Optional.of(5),Search.findTeamMinFunding(arr,550));
    }

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios:
  @Test
  public void testFindMinFundingArrayFast1()
  {
      final Team[] arr = makeArrayFixture(10);
      assertEquals(Optional.of(6),Search.findTeamMinFundingFast(arr,551));
  }
  @Test
  public void testFindMinFundingArrayFast2()
  {
      final Team[] arr = makeArrayFixture(100);
      assertEquals(Optional.of(99),Search.findTeamMinFundingFast(arr,9950));
  }
  @Test
  public void testFindMinFundingArrayFast3()
  {
      final Team[] arr = makeArrayFixture(14);
      assertEquals(Optional.of(11),Search.findTeamMinFundingFast(arr,1099));
  }
    @Test
    public void testFindMinFundingArrayFast4()
    {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Optional.of(0),Search.findTeamMinFundingFast(arr,0));
    }
}
