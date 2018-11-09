/**
 */
package at.ac.tuwien.big.roverml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Motor Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.SetMotorSpeed#getMotors <em>Motors</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.SetMotorSpeed#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetMotorSpeed()
 * @model
 * @generated
 */
public interface SetMotorSpeed extends Command {
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
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetMotorSpeed_Motors()
	 * @model required="true"
	 * @generated
	 */
	EList<Motor> getMotors();

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference.
	 * @see #setSpeed(Velocity)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSetMotorSpeed_Speed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Velocity getSpeed();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SetMotorSpeed#getSpeed <em>Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' containment reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Velocity value);

} // SetMotorSpeed
