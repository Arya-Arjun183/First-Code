package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class Drive extends Subsystem{
    int idLB = 0;
    int idLF = 1;
    int idRB = 2;
    int idRF = 3;
    public TalonFX talonLB = new TalonFX(idLB);//Left Back
    public TalonFX talonLF = new TalonFX(idLF);//Left Front
    public TalonFX talonRB = new TalonFX(idRB);//Right Back
    public TalonFX talonRF = new TalonFX(idRF);//Right Front
    public Drive(){
        //Following set
        talonLB.set(ControlMode.Follower, idLF);
        talonRB.set(ControlMode.Follower, idRF);
    }
    public void stop(){
        talonLF.set(ControlMode.PercentOutput, 0);
        talonRF.set(ControlMode.PercentOutput, 0);
    }
    
    public void setOpenLoop(double throttle, double turn){
        /* negative turn value is right, positive turn value is left
        Negative throttle value = backward, Positive throttle value is forward
        */
        if (Math.signum(throttle)>0){
            talonLF.set(ControlMode.PercentOutput, (-throttle+turn)/2);
            talonRF.set(ControlMode.PercentOutput, (throttle+turn)/2);
        }   
        else if (Math.signum(throttle)<0){
            talonLF.set(ControlMode.PercentOutput, (throttle+turn)/2);
            talonRF.set(ControlMode.PercentOutput, (-throttle+turn)/2);
        } else{
            talonLF.set(ControlMode.PercentOutput, 0);
            talonRF.set(ControlMode.PercentOutput, 0);
        }
    }
}