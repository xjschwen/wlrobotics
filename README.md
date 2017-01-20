# wlrobotics
Seed project with off-robot development



This project is intended to be checkedout as a sibling directory to the FRC Robot project. 

From there you can add import statements to import classes from this prject through eclipse.

You will need to add the following lines in the build.xml file located in the root of the
robot project


```
<!--Be sure to set the value of wldir to your current check out directory -->	
  <property name="wldir" value="wl2"/>

  <!-- delete the jar from teh wpilib that is used to compile the robot code-->	
  <delete file="${user.home}/wpilib/user/java/lib/wlrobotics.jar"/>
  
  <echo message = "wldir = ${wldir}"/>
  
  <!-- call targets from the wlrobotics ant file -->
  <ant dir="../${wldir}" target="clean" inheritAll="false"/> 	
  <ant dir="../${wldir}" target="run"   inheritAll="false"/>	  
  <ant dir="../${wldir}" target="jar"   inheritAll="false"/>

  <!-- copy the freshly compiled jar file back to the wpilib folder to be used to compile the robot code --> 
  <copy todir="${user.home}/wpilib/user/java/lib/" verbose="true" force="true">
    <fileset dir="../${wldir}/dist/">
      <include name="**/*.jar"/>
    </fileset>
  </copy>
```

Insert these lines just above the last 2 lines of the build.xml file. 

```
  <import file="${wpilib.ant.dir}/build.xml"/>
</project>
```
