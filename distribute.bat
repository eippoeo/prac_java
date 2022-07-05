javac prac2.java
md subclass
copy AAA.class .\subclass\AAA.class
copy BBB.class .\subclass\BBB.class
del AAA.class
del BBB.class
set classpath=.;.\subclass
java prac2
pause