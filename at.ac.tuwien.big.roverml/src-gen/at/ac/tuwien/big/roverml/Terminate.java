/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getTerminate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noOutgoingTransition'"
 * @generated
 */
public interface Terminate extends Command {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv noOutgoingTransition:\n *   let severity : Integer[1] = \'Terminate::noOutgoingTransition\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : Boolean[1] = self.outgoing-&gt;isEmpty()\n *       in\n *         \'Terminate::noOutgoingTransition\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Terminate_c_c_noOutgoingTransition);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; outgoing = this.getOutgoing();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_outgoing = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition, outgoing);\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation%&gt;.INSTANCE.evaluate(BOXED_outgoing).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Terminate_c_c_noOutgoingTransition, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean noOutgoingTransition(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Terminate
