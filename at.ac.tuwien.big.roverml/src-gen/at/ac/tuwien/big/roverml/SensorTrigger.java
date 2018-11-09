/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.SensorTrigger#getSensor <em>Sensor</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.SensorTrigger#getSensorDataPoint <em>Sensor Data Point</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.SensorTrigger#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.SensorTrigger#getComparisonValue <em>Comparison Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensorTrigger()
 * @model
 * @generated
 */
public interface SensorTrigger extends Trigger {
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
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensorTrigger_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SensorTrigger#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Sensor Data Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Data Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Data Point</em>' attribute.
	 * @see #setSensorDataPoint(String)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensorTrigger_SensorDataPoint()
	 * @model
	 * @generated
	 */
	String getSensorDataPoint();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SensorTrigger#getSensorDataPoint <em>Sensor Data Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Data Point</em>' attribute.
	 * @see #getSensorDataPoint()
	 * @generated
	 */
	void setSensorDataPoint(String value);

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
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensorTrigger_Operator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getOperator();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SensorTrigger#getOperator <em>Operator</em>}' attribute.
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
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getSensorTrigger_ComparisonValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Quantity getComparisonValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.SensorTrigger#getComparisonValue <em>Comparison Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Value</em>' containment reference.
	 * @see #getComparisonValue()
	 * @generated
	 */
	void setComparisonValue(Quantity value);

} // SensorTrigger
