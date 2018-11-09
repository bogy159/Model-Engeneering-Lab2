/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggered Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.TriggeredTransition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.TriggeredTransition#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.TriggeredTransition#getComparisonValue <em>Comparison Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTriggeredTransition()
 * @model abstract="true"
 * @generated
 */
public interface TriggeredTransition<SensorType extends Sensor<QuantityType>, QuantityType extends Quantity> extends Transition {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTriggeredTransition_Sensor()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!TriggeredTransition{SensorType,QuantityType}!sensor'"
	 * @generated
	 */
	SensorType getSensor();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(SensorType value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.roverml.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.ComparisonOperator
	 * @see #setOperator(ComparisonOperator)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTriggeredTransition_Operator()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!TriggeredTransition{SensorType,QuantityType}!operator'"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.ComparisonOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Comparison Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Value</em>' containment reference.
	 * @see #setComparisonValue(Quantity)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTriggeredTransition_ComparisonValue()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!TriggeredTransition{SensorType,QuantityType}!comparisonValue'"
	 * @generated
	 */
	QuantityType getComparisonValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.TriggeredTransition#getComparisonValue <em>Comparison Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' containment reference.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(QuantityType value);

} // TriggeredTransition
