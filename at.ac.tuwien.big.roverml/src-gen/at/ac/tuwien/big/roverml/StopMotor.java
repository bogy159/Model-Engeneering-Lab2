/**
 */
package at.ac.tuwien.big.roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.StopMotor#getMotors <em>Motors</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getStopMotor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='stopMotorOnlyAfterSetSpeedMotor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot stopMotorOnlyAfterSetSpeedMotor='incoming-&gt;closure(incoming.source.incoming)-&gt; exists(c | c.source.oclIsTypeOf(SetMotorSpeed))'"
 * @generated
 */
public interface StopMotor extends Command {
	/**
	 * Returns the value of the '<em><b>Motors</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motors</em>' reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getStopMotor_Motors()
	 * @model required="true"
	 * @generated
	 */
	EList<Motor> getMotors();

} // StopMotor
