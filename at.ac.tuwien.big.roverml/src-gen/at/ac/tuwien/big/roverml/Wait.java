/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Wait#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getWait()
 * @model
 * @generated
 */
public interface Wait extends Command {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Time)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getWait_Duration()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Wait!duration'"
	 * @generated
	 */
	Time getDuration();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Wait#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Time value);

} // Wait
