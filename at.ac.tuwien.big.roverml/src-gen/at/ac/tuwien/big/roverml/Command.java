/**
 */
package at.ac.tuwien.big.roverml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.roverml.Command#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link at.ac.tuwien.big.roverml.Command#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getCommand()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noParallelExecution'"
 * @generated
 */
public interface Command extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getCommand_Incoming()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * self.Block.transitions-&gt;select(target = self)\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt; IMPPROPid_commands = new &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt;(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.PROPid_commands);\nfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Block%&gt; Block = (&lt;%at.ac.tuwien.big.roverml.Block%&gt;)IMPPROPid_commands.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Block, this);\nif (Block == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.big.tuwien.ac.at/roverml\\\'::Block::transitions\\\'\");\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; transitions = Block.getTransitions();\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_transitions = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition, transitions);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createOrderedSetAccumulatorValue(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition);\n/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_transitions.iterator();\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; select;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tselect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Transition%&gt; _1 = (&lt;%at.ac.tuwien.big.roverml.Transition%&gt;)ITERATOR__1.next();\n\t/**\n\t * target = self\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; target = _1.getTarget();\n\tfinal /*@NonInvalid\052/ boolean eq = target.equals(this);\n\t//\n\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\taccumulator.add(_1);\n\t}\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; ECORE_select = ((&lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt;.IdResolverExtension)idResolver).ecoreValueOfAll(&lt;%at.ac.tuwien.big.roverml.Transition%&gt;.class, select);\nreturn (&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt;)ECORE_select;'"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.roverml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see at.ac.tuwien.big.roverml.RoverMLPackage#getCommand_Outgoing()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * self.Block.transitions-&gt;select(source = self)\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt; IMPPROPid_commands = new &lt;%org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty%&gt;(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.PROPid_commands);\nfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Block%&gt; Block = (&lt;%at.ac.tuwien.big.roverml.Block%&gt;)IMPPROPid_commands.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Block, this);\nif (Block == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.big.tuwien.ac.at/roverml\\\'::Block::transitions\\\'\");\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; transitions = Block.getTransitions();\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_transitions = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition, transitions);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createOrderedSetAccumulatorValue(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition);\n/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_transitions.iterator();\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; select;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tselect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Transition%&gt; _1 = (&lt;%at.ac.tuwien.big.roverml.Transition%&gt;)ITERATOR__1.next();\n\t/**\n\t * source = self\n\t \052/\n\tfinal /*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Command%&gt; source = _1.getSource();\n\tfinal /*@NonInvalid\052/ boolean eq = source.equals(this);\n\t//\n\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\taccumulator.add(_1);\n\t}\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; ECORE_select = ((&lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt;.IdResolverExtension)idResolver).ecoreValueOfAll(&lt;%at.ac.tuwien.big.roverml.Transition%&gt;.class, select);\nreturn (&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt;)ECORE_select;'"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv noParallelExecution:\n *   let severity : Integer[1] = \'Command::noParallelExecution\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = if\n *           not self.oclIsKindOf(Block) and\n *           self.outgoing-&gt;size() &gt; 1\n *         then\n *           self.outgoing-&gt;select(t | t.oclIsTypeOf(Transition))\n *           -&gt;size() &lt;= 1\n *         else true\n *         endif\n *       in\n *         \'Command::noParallelExecution\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Command_c_c_noParallelExecution);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Block = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Block, null);\n\tfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%at.ac.tuwien.big.roverml.Transition%&gt;&gt; outgoing_0 = this.getOutgoing();\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; BOXED_outgoing_0 = idResolver.createOrderedSetOfAll(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition, outgoing_0);\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, this, TYP_roverml_c_c_Block).booleanValue();\n\tfinal /*@NonInvalid\052/ &lt;%java.lang.Boolean%&gt; not = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanNotOperation%&gt;.INSTANCE.evaluate(oclIsKindOf);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_outgoing_0);\n\tfinal /*@NonInvalid\052/ boolean gt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%&gt;.INSTANCE.evaluate(executor, size, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1).booleanValue();\n\tfinal /*@Thrown\052/ &lt;%java.lang.Boolean%&gt; and = &lt;%org.eclipse.ocl.pivot.library.logical.BooleanAndOperation%&gt;.INSTANCE.evaluate(not, gt);\n\tif (and == null) {\n\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null if condition\");\n\t}\n\t/*@NonInvalid\052/ boolean result;\n\tif (and) {\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createOrderedSetAccumulatorValue(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.ORD_CLSSid_Transition);\n\t\t/*@NonNull\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR_t = BOXED_outgoing_0.iterator();\n\t\t/*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.OrderedSetValue%&gt; select;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR_t.hasNext()) {\n\t\t\t\tselect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%at.ac.tuwien.big.roverml.Transition%&gt; t = (&lt;%at.ac.tuwien.big.roverml.Transition%&gt;)ITERATOR_t.next();\n\t\t\t/**\n\t\t\t * t.oclIsTypeOf(Transition)\n\t\t\t \052/\n\t\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_roverml_c_c_Transition = idResolver.getClass(&lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.CLSSid_Transition, null);\n\t\t\tfinal /*@NonInvalid\052/ boolean oclIsTypeOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%&gt;.INSTANCE.evaluate(executor, t, TYP_roverml_c_c_Transition).booleanValue();\n\t\t\t//\n\t\t\tif (oclIsTypeOf == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\taccumulator.add(t);\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size_0 = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\t\tfinal /*@NonInvalid\052/ boolean le_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size_0, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_1).booleanValue();\n\t\tresult = le_0;\n\t}\n\telse {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.STR_Command_c_c_noParallelExecution, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%at.ac.tuwien.big.roverml.RoverMLTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean noParallelExecution(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Command
