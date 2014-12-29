/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 26 00:35:23 SGT 2014
 */

package wox.serial;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.reflect.Constructor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;
import wox.serial.Util;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.primitive(Ljava/lang/Class;)Z: I16 Branch 23 IFEQ L145 - false
   */

  @Test
  public void test00()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      boolean boolean0 = Util.primitive(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 wox.serial.Util.primitive(Ljava/lang/Class;)Z: I8 Branch 22 IF_ICMPGE L144 - true
   * 2 wox.serial.Util.primitive(Ljava/lang/Class;)Z: I8 Branch 22 IF_ICMPGE L144 - false
   * 3 wox.serial.Util.primitive(Ljava/lang/Class;)Z: I16 Branch 23 IFEQ L145 - true
   */

  @Test
  public void test01()  throws Throwable  {
      Class<Float> class0 = Float.class;
      boolean boolean0 = Util.primitive(class0);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/String;)Z: I10 Branch 21 IFNULL L125 - false
   */

  @Test
  public void test02()  throws Throwable  {
      boolean boolean0 = Util.stringable("charWrapper");
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/String;)Z: I10 Branch 21 IFNULL L125 - true
   */

  @Test
  public void test03()  throws Throwable  {
      boolean boolean0 = Util.stringable("2p8f2V@rzS");
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I59 Branch 20 IFEQ L91 - false
   */

  @Test
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I47 Branch 18 IFNE L89 - true
   */

  @Test
  public void test05()  throws Throwable  {
      Class<Character> class0 = Character.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I41 Branch 17 IFNE L88 - true
   */

  @Test
  public void test06()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I35 Branch 16 IFNE L87 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I41 Branch 17 IFNE L88 - false
   * 3 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I47 Branch 18 IFNE L89 - false
   * 4 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I53 Branch 19 IFNE L90 - false
   * 5 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I59 Branch 20 IFEQ L91 - true
   */

  @Test
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I29 Branch 15 IFNE L86 - true
   */

  @Test
  public void test08()  throws Throwable  {
      Class<Long> class0 = Long.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I23 Branch 14 IFNE L85 - true
   */

  @Test
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I17 Branch 13 IFNE L84 - true
   */

  @Test
  public void test10()  throws Throwable  {
      Class<Float> class0 = Float.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I11 Branch 12 IFNE L83 - true
   */

  @Test
  public void test11()  throws Throwable  {
      Class<Double> class0 = Double.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 6 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I5 Branch 11 IFNE L82 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I11 Branch 12 IFNE L83 - false
   * 3 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I17 Branch 13 IFNE L84 - false
   * 4 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I23 Branch 14 IFNE L85 - false
   * 5 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I29 Branch 15 IFNE L86 - false
   * 6 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I35 Branch 16 IFNE L87 - true
   */

  @Test
  public void test12()  throws Throwable  {
      Class<Short> class0 = Short.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Class;)Z: I5 Branch 11 IFNE L82 - true
   */

  @Test
  public void test13()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      boolean boolean0 = Util.stringable(class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I31 Branch 10 IFEQ L59 - true
   */

  @Test
  public void test14()  throws Throwable  {
      boolean boolean0 = Util.stringable((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I28 Branch 9 IFNE L59 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I31 Branch 10 IFEQ L59 - false
   */

  @Test
  public void test15()  throws Throwable  {
      boolean boolean0 = Util.stringable((Object) "");
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I25 Branch 8 IFNE L59 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I28 Branch 9 IFNE L59 - true
   */

  @Test
  public void test16()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      boolean boolean0 = Util.stringable((Object) class0);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I22 Branch 7 IFNE L59 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I25 Branch 8 IFNE L59 - true
   */

  @Test
  public void test17()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      boolean boolean1 = Util.stringable((Object) boolean0);
      assertEquals(true, boolean1);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I19 Branch 6 IFNE L59 - true
   */

  @Test
  public void test18()  throws Throwable  {
      Double double0 = new Double(9.9);
      boolean boolean0 = Util.stringable((Object) double0);
      assertEquals(true, boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I16 Branch 5 IFNE L59 - true
   */

  @Test
  public void test19()  throws Throwable  {
      Float float0 = new Float(9.9);
      boolean boolean0 = Util.stringable((Object) float0);
      assertEquals(true, boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I13 Branch 4 IFNE L59 - true
   */

  @Test
  public void test20()  throws Throwable  {
      Long long0 = new Long((long) (short)1561);
      boolean boolean0 = Util.stringable((Object) long0);
      assertEquals(true, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I10 Branch 3 IFNE L59 - true
   */

  @Test
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((int) (short)1561);
      boolean boolean0 = Util.stringable((Object) integer0);
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I7 Branch 2 IFNE L59 - true
   */

  @Test
  public void test22()  throws Throwable  {
      Short short0 = new Short((short)1561);
      boolean boolean0 = Util.stringable((Object) short0);
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 7 covered goals:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I4 Branch 1 IFNE L59 - false
   * 2 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I7 Branch 2 IFNE L59 - false
   * 3 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I10 Branch 3 IFNE L59 - false
   * 4 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I13 Branch 4 IFNE L59 - false
   * 5 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I16 Branch 5 IFNE L59 - false
   * 6 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I19 Branch 6 IFNE L59 - false
   * 7 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I22 Branch 7 IFNE L59 - true
   */

  @Test
  public void test23()  throws Throwable  {
      Character character0 = new Character('_');
      boolean boolean0 = Util.stringable((Object) character0);
      assertEquals(true, boolean0);
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.stringable(Ljava/lang/Object;)Z: I4 Branch 1 IFNE L59 - true
   */

  @Test
  public void test24()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-16));
      boolean boolean0 = Util.stringable((Object) byte0);
      assertEquals(true, boolean0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.<init>()V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      Util util0 = new Util();
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 wox.serial.Util.forceDefaultConstructor(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Constructor constructor0 = Util.forceDefaultConstructor(class0);
      assertEquals(true, constructor0.isAccessible());
  }
}