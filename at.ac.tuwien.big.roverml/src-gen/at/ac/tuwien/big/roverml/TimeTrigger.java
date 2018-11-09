/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.TimeTrigger#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTimeTrigger()
 * @model
 * @generated
 */
public interface TimeTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTimeTrigger_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.TimeTrigger#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // TimeTrigger
