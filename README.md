# xlair

[![Build Status](https://travis-ci.org/xlair/xlair.svg?branch=master)](https://travis-ci.org/xlair/xlair)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/294c20e14f71464eb53e8cccc3093e8f)](https://www.codacy.com/app/xlair/xlair?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=xlair/xlair&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/294c20e14f71464eb53e8cccc3093e8f)](https://www.codacy.com/app/xlair/xlair?utm_source=github.com&utm_medium=referral&utm_content=xlair/xlair&utm_campaign=Badge_Coverage)

xlair is four-dimension overlap check library

Determine whether object1 and object2 overlap.
Object is four-dimensional data.
The following data are supported.

* Period to Period : temporal distance overlap
* Line to Line : one-dimension distance overlap
* Square to Square : two-dimension distance overlap
* Cube to Cube : three-dimension distance overlap
* D4 to D4 : four-dimension distance overlap

## Usage

![square_sample](/images/square_sample.png)

```java
Square blue = new Square(30L, 30L, 100L, 50L);
Square red = new Square.Builder(100L, 40L).width(50L).height(30L).build();
Square green = new Square.Builder(170L, 70L).width(60L).height(40L).build();

System.out.println(Xlair.isOverlap(blue, red)); // true
System.out.println(Xlair.isOverlap(blue, green)); // false
```

Target instance is created by constructor or builder.

![cube_sample](/images/cube_sample.png)

```java
Cube green = new Cube(1L, 0L, 1L, 5L, 2L, 4L);
Cube red = new Cube.Builder(3L, 2L, 3L).width(3L).height(1L).depth(3L).build();

System.out.println(Xlair.isOverlap(green, red)); // false
System.out.println(Xlair.isOverlapOrContact(green, red)); // true
```

`isOverlapOrContact()` method is `true`, if object contact.

* D4 : Four-dimension = Cude(Three-dimension) + Time-axis.

```java
SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
Date date1 = fmt.parse("2018/12/3");
Date date2 = fmt.parse("2018/12/5");
Date date3 = fmt.parse("2018/12/10");
Date date4 = fmt.parse("2018/12/14");

D4 greenUse2week = new D4(green, new Period(date1, date2));
D4 redUse3week = new D4(red, new Period(date3, date4));

System.out.println(Xlair.isOverlapOrContact(greenUse2week, redUse3week)); // false
```

green and red are not contact, because it is far apart on the time axis.

## Required

* apache maven
* JDK 8+

## Install

Clone the repository form github and mvn local istall.

```console
git clone https://github.com/xlair/xlair.git
cd xlair
mvn clean install
```

Write dependecy on your project's pom.xml.

```xml
<dependency>
  <groupId>io.github.xlair</groupId>
  <artifactId>xlair</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```
