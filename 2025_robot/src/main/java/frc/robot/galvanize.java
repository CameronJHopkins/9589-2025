// This is the time-based initialisation class

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.subsystems.*;

public class galvanize extends TimedRobot {

    private Command autonomous_command;

    private final kickstart_my_heart robot_container;

    public galvanize() {
      
        robot_container = new kickstart_my_heart();
  
    }

    @Override
    public void robotInit(){
        
        System.out.println("The robot is initialising.");

        just_victims_of_the_in_house_drive_by drive = new just_victims_of_the_in_house_drive_by();
        //the_goal_is_elevation elevator = new the_goal_is_elevation();
        //seven_nation_arm arm = new seven_nation_arm();
        //one_way_or_another picker = new one_way_or_another();

    }

    @Override
    public void robotPeriodic() {
  
        CommandScheduler.getInstance().run();
  
    }

    @Override
    public void disabledInit() {}

    @Override
    public void disabledPeriodic() {}

    @Override
    public void disabledExit() {}

    @Override
    public void autonomousInit() {

        autonomous_command = robot_container.getAutonomousCommand();

        if (autonomous_command != null) {
      
            autonomous_command.schedule();
    
        }
  
    }

    @Override
    public void autonomousPeriodic() {}

    @Override
    public void autonomousExit() {}

    @Override
    public void teleopInit() {
  
        if (autonomous_command != null) {
      
            autonomous_command.cancel();
    
        }
  
    }

    @Override
    public void teleopPeriodic() {}

    @Override
    public void teleopExit() {}

    @Override
    public void testInit() {
  
        CommandScheduler.getInstance().cancelAll();
  
    }

    @Override
    public void testPeriodic() {}

    @Override
    public void testExit() {}
}
