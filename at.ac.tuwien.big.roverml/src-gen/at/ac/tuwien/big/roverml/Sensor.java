/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Sensor#getLastSensedValue <em>Last Sensed Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensor()
 * @model abstract="true"
 * @generated
 */
public interface Sensor<QuantityType> extends Component {

	/**
	 * Returns the value of the '<em><b>Last Sensed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Sensed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Sensed Value</em>' containment reference.
	 * @see #setLastSensedValue(Object)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensor_LastSensedValue()
	 * @model kind="reference" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Sensor{QuantityType}!lastSensedValue'"
	 * @generated
	 */
	QuantityType getLastSensedValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Sensor#getLastSensedValue <em>Last Sensed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Sensed Value</em>' containment reference.
	 * @see #getLastSensedValue()
	 * @generated
	 */
	void setLastSensedValue(QuantityType value);
} // Sensor
