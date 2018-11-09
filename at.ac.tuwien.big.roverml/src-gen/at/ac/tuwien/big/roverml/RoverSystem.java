/**
 */
package at.ac.tuwien.big.roverml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.RoverSystem#getRovers <em>Rovers</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.RoverSystem#getRoverPrograms <em>Rover Programs</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverSystem()
 * @model
 * @generated
 */
public interface RoverSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Rovers</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Rover}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rovers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rovers</em>' containment reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverSystem_Rovers()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!RoverSystem!rovers'"
	 * @generated
	 */
	EList<Rover> getRovers();

	/**
	 * Returns the value of the '<em><b>Rover Programs</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.RoverProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rover Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rover Programs</em>' containment reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getRoverSystem_RoverPrograms()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!RoverSystem!roverPrograms'"
	 * @generated
	 */
	EList<RoverProgram> getRoverPrograms();

} // RoverSystem
