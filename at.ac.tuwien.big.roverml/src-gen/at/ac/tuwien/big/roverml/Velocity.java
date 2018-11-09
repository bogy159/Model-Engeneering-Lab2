/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Velocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Velocity#getVelocityUnit <em>Velocity Unit</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getVelocity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveOrNegative'"
 * @generated
 */
public interface Velocity extends SingleQuantity {
	/**
	 * Returns the value of the '<em><b>Velocity Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ac.tuwien.big.roverml.VelocityUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.VelocityUnit
	 * @see #setVelocityUnit(VelocityUnit)
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getVelocity_VelocityUnit()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.big.tuwien.ac.at/roverml!Velocity!velocityUnit'"
	 * @generated
	 */
	VelocityUnit getVelocityUnit();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.roverml.Velocity#getVelocityUnit <em>Velocity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Unit</em>' attribute.
	 * @see at.ac.tuwien.big.roverml.VelocityUnit
	 * @see #getVelocityUnit()
	 * @generated
	 */
	void setVelocityUnit(VelocityUnit value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv positiveOrNegative:\n *   let severity : Integer[1] = \'Velocity::positiveOrNegative\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[1] = self.value &lt;&gt; 0\n *       in\n *         \'Velocity::positiveOrNegative\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Velocity_c_c_positiveOrNegative);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ float value = this.getValue();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.RealValue%&gt; BOXED_value = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.realValueOf(value);\n\tfinal /*@NonInvalid\052/ boolean result = !BOXED_value.equals(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0);\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Velocity_c_c_positiveOrNegative, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean positiveOrNegative(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Velocity
