
package org.usfirst.frc.team4334.robot;

import acilibj.actuators.KiwiDrivetrain;
import acilibj.actuators.SuperJoystickModule;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class Robot extends IterativeRobot 
{
    
    KiwiDrivetrain drivetrain;
    
    Talon L1 = new Talon(RobotMap.LEFT_MOTOR_1);
    Victor L2 = new Victor(RobotMap.LEFT_MOTOR_2);
    Talon R1 = new Talon(RobotMap.RIGHT_MOTOR_1);
    Talon R2 = new Talon(RobotMap.RIGHT_MOTOR_2);
    Talon M1= new Talon(RobotMap.MIDDLE_MOTOR_1);
    Talon M2= new Talon(RobotMap.MIDDLE_MOTOR_2);
    
    SuperJoystickModule driver = new SuperJoystickModule(RobotMap.JOYSTICK_PORT);
    
   
    public void robotInit() 
    {
        drivetrain = new KiwiDrivetrain(L1, L2, R1, R2, M1, M2);
    }

    public void autonomousPeriodic() 
    {

    }

    public void teleopPeriodic()
    {
        drivetrain.getKiwi(driver.getAxisWithDeadzone(0, 0, true),
                driver.getAxisWithDeadzone(1, 0, false),
                (driver.getAxisWithDeadzone(2, 0, false)*0.5), 1);
    }
    
    public void testPeriodic() 
    {
    
    }
    
}
