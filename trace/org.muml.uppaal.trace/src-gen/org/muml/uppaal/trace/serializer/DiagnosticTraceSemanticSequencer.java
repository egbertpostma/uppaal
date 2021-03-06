/*
 * generated by Xtext
 */
package org.muml.uppaal.trace.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.muml.uppaal.trace.ActionTransition;
import org.muml.uppaal.trace.ChannelSynchronization;
import org.muml.uppaal.trace.DelayTransition;
import org.muml.uppaal.trace.EdgeActivity;
import org.muml.uppaal.trace.LocationActivity;
import org.muml.uppaal.trace.NamedElementReference;
import org.muml.uppaal.trace.ProcessIdentifier;
import org.muml.uppaal.trace.SingleNamedElementReference;
import org.muml.uppaal.trace.State;
import org.muml.uppaal.trace.Synchronization;
import org.muml.uppaal.trace.Trace;
import org.muml.uppaal.trace.TracePackage;
import org.muml.uppaal.trace.TraceRepository;
import org.muml.uppaal.trace.VariableValue;
import org.muml.uppaal.trace.services.DiagnosticTraceGrammarAccess;

@SuppressWarnings("all")
public class DiagnosticTraceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DiagnosticTraceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TracePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TracePackage.ACTION_TRANSITION:
				sequence_ActionTransition(context, (ActionTransition) semanticObject); 
				return; 
			case TracePackage.CHANNEL_SYNCHRONIZATION:
				sequence_ChannelSynchronization(context, (ChannelSynchronization) semanticObject); 
				return; 
			case TracePackage.DELAY_TRANSITION:
				sequence_DelayTransition(context, (DelayTransition) semanticObject); 
				return; 
			case TracePackage.EDGE_ACTIVITY:
				sequence_EdgeActivity(context, (EdgeActivity) semanticObject); 
				return; 
			case TracePackage.LOCATION_ACTIVITY:
				sequence_LocationActivity(context, (LocationActivity) semanticObject); 
				return; 
			case TracePackage.NAMED_ELEMENT_REFERENCE:
				sequence_NamedElementReference(context, (NamedElementReference) semanticObject); 
				return; 
			case TracePackage.PROCESS_IDENTIFIER:
				sequence_ProcessIdentifier(context, (ProcessIdentifier) semanticObject); 
				return; 
			case TracePackage.SINGLE_NAMED_ELEMENT_REFERENCE:
				sequence_SingleNamedElementReference(context, (SingleNamedElementReference) semanticObject); 
				return; 
			case TracePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case TracePackage.SYNCHRONIZATION:
				sequence_Synchronization(context, (Synchronization) semanticObject); 
				return; 
			case TracePackage.TRACE:
				sequence_Trace(context, (Trace) semanticObject); 
				return; 
			case TracePackage.TRACE_REPOSITORY:
				sequence_TraceRepository(context, (TraceRepository) semanticObject); 
				return; 
			case TracePackage.VARIABLE_VALUE:
				sequence_VariableValue(context, (VariableValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TraceItem returns ActionTransition
	 *     ActionTransition returns ActionTransition
	 *     Transition returns ActionTransition
	 *
	 * Constraint:
	 *     edgeActivities+=EdgeActivity+
	 */
	protected void sequence_ActionTransition(ISerializationContext context, ActionTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Synchronization returns ChannelSynchronization
	 *     ChannelSynchronization returns ChannelSynchronization
	 *
	 * Constraint:
	 *     (channel=[Variable|ID] kind=SynchronizationKind)
	 */
	protected void sequence_ChannelSynchronization(ISerializationContext context, ChannelSynchronization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.CHANNEL_SYNCHRONIZATION__CHANNEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.CHANNEL_SYNCHRONIZATION__CHANNEL));
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.CHANNEL_SYNCHRONIZATION__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.CHANNEL_SYNCHRONIZATION__KIND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChannelSynchronizationAccess().getChannelVariableIDTerminalRuleCall_0_0_1(), semanticObject.eGet(TracePackage.Literals.CHANNEL_SYNCHRONIZATION__CHANNEL, false));
		feeder.accept(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0(), semanticObject.getKind());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TraceItem returns DelayTransition
	 *     DelayTransition returns DelayTransition
	 *     Transition returns DelayTransition
	 *
	 * Constraint:
	 *     duration=INT
	 */
	protected void sequence_DelayTransition(ISerializationContext context, DelayTransition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.DELAY_TRANSITION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.DELAY_TRANSITION__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EdgeActivity returns EdgeActivity
	 *
	 * Constraint:
	 *     (source=LocationActivity target=LocationActivity details=EDGE)
	 */
	protected void sequence_EdgeActivity(ISerializationContext context, EdgeActivity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__SOURCE));
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__TARGET));
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__DETAILS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.EDGE_ACTIVITY__DETAILS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0(), semanticObject.getDetails());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LocationActivity returns LocationActivity
	 *
	 * Constraint:
	 *     (process=ProcessIdentifier location=[Location|ID])
	 */
	protected void sequence_LocationActivity(ISerializationContext context, LocationActivity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.LOCATION_ACTIVITY__PROCESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.LOCATION_ACTIVITY__PROCESS));
			if (transientValues.isValueTransient(semanticObject, TracePackage.Literals.LOCATION_ACTIVITY__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TracePackage.Literals.LOCATION_ACTIVITY__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0(), semanticObject.getProcess());
		feeder.accept(grammarAccess.getLocationActivityAccess().getLocationLocationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TracePackage.Literals.LOCATION_ACTIVITY__LOCATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElementReference returns NamedElementReference
	 *
	 * Constraint:
	 *     (singleNamedElementReference=SingleNamedElementReference namedElementReference=NamedElementReference?)
	 */
	protected void sequence_NamedElementReference(ISerializationContext context, NamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProcessIdentifier returns ProcessIdentifier
	 *
	 * Constraint:
	 *     (template=[AbstractTemplate|ID] (arguments+=INT arguments+=INT*)?)
	 */
	protected void sequence_ProcessIdentifier(ISerializationContext context, ProcessIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleNamedElementReference returns SingleNamedElementReference
	 *
	 * Constraint:
	 *     (namedElement=[NamedElement|ID] indexes+=INT*)?
	 */
	protected void sequence_SingleNamedElementReference(ISerializationContext context, SingleNamedElementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TraceItem returns State
	 *     State returns State
	 *
	 * Constraint:
	 *     (locationActivities+=LocationActivity+ (variableValues+=VariableValue variableValues+=VariableValue*)?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Synchronization returns Synchronization
	 *
	 * Constraint:
	 *     {Synchronization}
	 */
	protected void sequence_Synchronization(ISerializationContext context, Synchronization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TraceRepository returns TraceRepository
	 *
	 * Constraint:
	 *     traces+=Trace+
	 */
	protected void sequence_TraceRepository(ISerializationContext context, TraceRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Trace returns Trace
	 *
	 * Constraint:
	 *     (property=INT line=INT result=Result traceItems+=TraceItem*)
	 */
	protected void sequence_Trace(ISerializationContext context, Trace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableValue returns VariableValue
	 *
	 * Constraint:
	 *     (firstNamedElementReference=NamedElementReference secondNamedElementReference=NamedElementReference? operator=CompareOperator value=INT)
	 */
	protected void sequence_VariableValue(ISerializationContext context, VariableValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
