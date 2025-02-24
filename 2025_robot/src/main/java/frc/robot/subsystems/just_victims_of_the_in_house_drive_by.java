// This is the drive subsytem class
package frc.robot.subsystems;


import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class just_victims_of_the_in_house_drive_by extends SubsystemBase {

    static CANSparkMax front_left = new CANSparkMax(drive_constants.front_left, MotorType.kBrushless);
    static CANSparkMax front_right = new CANSparkMax(drive_constants.front_right, MotorType.kBrushless);
    static CANSparkMax back_left = new CANSparkMax(drive_constants.back_left, MotorType.kBrushless);
    static CANSparkMax back_right = new CANSparkMax(drive_constants.back_right, MotorType.kBrushless);

    static DifferentialDrive robot_drive = new DifferentialDrive(front_left::set, front_right::set);
    static XboxController controller = new XboxController(0);

    public just_victims_of_the_in_house_drive_by() {


    }
    
    public static void prepare_drive(){

        back_left.follow(front_left);
        back_right.follow(front_right);

    }
    
    public static void differential_start(){

        SendableRegistry.addChild(robot_drive, front_left);
        SendableRegistry.addChild(robot_drive, front_right);

    }

    public static void start_drive(){

        robot_drive.arcadeDrive(controller.getRawAxis(1), controller.getRawAxis(4));

    }

    public void stop_wait_a_minute(){

        front_left.set(0);
        front_right.set(0);
        CommandScheduler.getInstance().cancelAll();

    }

    public void well_youre_left_hand_is_free(){

        //pass

    }

    public void like_a_record_baby(){

        //pass

    }

    public void live_and_learn(){

        //pass


    }

    public void every_now_and_then_i_get_a_little_bit_lonely_and_youre_never_coming_round(){
        
        //pass
    }

    public void heterosexual_man(){

        //pass
    
    }


}

