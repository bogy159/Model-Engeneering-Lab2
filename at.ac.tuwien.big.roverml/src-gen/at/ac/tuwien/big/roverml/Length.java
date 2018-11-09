/**
 */
package at.ac.tuwien.big.roverml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Length#getLengthUnit <em>Length Unit</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getLength()
 * @model
 * @generated
 */
public interface Length extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Length Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.roverml.LengthUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.LengthUnit
	 * @see #setLengthUnit(LengthUnit)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getLength_LengthUnit()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Length!lengthUnit'"
	 * @generated
	 */
	LengthUnit getLengthUnit();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Length#getLengthUnit <em>Length Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.LengthUnit
	 * @see #getLengthUnit()
	 * @generated
	 */
	void setLengthUnit(LengthUnit value);

} // Length
