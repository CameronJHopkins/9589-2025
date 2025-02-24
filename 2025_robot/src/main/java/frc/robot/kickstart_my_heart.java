// This is the initialisation of most subsystem classes

package frc.robot;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class kickstart_my_heart{

    private final CommandXboxController controller = new CommandXboxController(0);
    private final Trigger bigoneontheleft = controller.leftTrigger();
    private final Trigger bigoneontheright = controller.rightTrigger();
    private final Trigger abutton = controller.a();
    private final Trigger bbutton = controller.b();
    private final Trigger xbutton = controller.x();
    private final Trigger ybutton = controller.y();
    private final Trigger up = controller.povUp();
    private final Trigger down = controller.povDown();
    private final Trigger left = controller.povLeft();
    private final Trigger right = controller.povRight();
    private final Trigger smalloneontheleft = controller.leftBumper();
    private final Trigger smalloneontheright = controller.rightBumper();

    private final CommandXboxController operator_controller = new CommandXboxController(0);
    private final Trigger operator_bigoneontheleft = operator_controller.leftTrigger();
    private final Trigger operator_bigoneontheright = operator_controller.rightTrigger();
    private final Trigger operator_abutton = operator_controller.a();
    private final Trigger operator_bbutton = operator_controller.b();
    private final Trigger operator_xbutton = operator_controller.x();
    private final Trigger operator_ybutton = operator_controller.y();
    private final Trigger operator_up = operator_controller.povUp();
    private final Trigger operator_down = operator_controller.povDown();
    private final Trigger operator_left = operator_controller.povLeft();
    private final Trigger operator_right = operator_controller.povRight();
    private final Trigger operator_smalloneontheleft = operator_controller.leftBumper();
    private final Trigger operator_smalloneontheright = operator_controller.rightBumper();
    
    public kickstart_my_heart() {
      
        configureBindings();
  
    }

    private void configureBindings() {}

    public Command getAutonomousCommand() {
    
        return Commands.print("No autonomous command configured");
  
    }

}
