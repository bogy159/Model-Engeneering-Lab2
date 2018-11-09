/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Angle#getAngleUnit <em>Angle Unit</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getAngle()
 * @model
 * @generated
 */
public interface Angle extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Angle Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.roverml.AngleUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.AngleUnit
	 * @see #setAngleUnit(AngleUnit)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getAngle_AngleUnit()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Angle!angleUnit'"
	 * @generated
	 */
	AngleUnit getAngleUnit();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Angle#getAngleUnit <em>Angle Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.AngleUnit
	 * @see #getAngleUnit()
	 * @generated
	 */
	void setAngleUnit(AngleUnit value);

} // Angle
