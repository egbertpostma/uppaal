/**
 */
package org.muml.uppaal.declarations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.Variable;
import org.muml.uppaal.declarations.VariableContainer;
import org.muml.uppaal.types.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.declarations.impl.VariableContainerImpl#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link org.muml.uppaal.declarations.impl.VariableContainerImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableContainerImpl extends EObjectImpl implements VariableContainer {
	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition typeDefinition;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.VARIABLE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getTypeDefinition() {
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinition(TypeDefinition newTypeDefinition, NotificationChain msgs) {
		TypeDefinition oldTypeDefinition = typeDefinition;
		typeDefinition = newTypeDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION, oldTypeDefinition, newTypeDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeDefinition(TypeDefinition newTypeDefinition) {
		if (newTypeDefinition != typeDefinition) {
			NotificationChain msgs = null;
			if (typeDefinition != null)
				msgs = ((InternalEObject)typeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION, null, msgs);
			if (newTypeDefinition != null)
				msgs = ((InternalEObject)newTypeDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION, null, msgs);
			msgs = basicSetTypeDefinition(newTypeDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION, newTypeDefinition, newTypeDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE, DeclarationsPackage.VARIABLE__CONTAINER);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION:
				return basicSetTypeDefinition(null, msgs);
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION:
				return getTypeDefinition();
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				return getVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)newValue);
				return;
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION:
				setTypeDefinition((TypeDefinition)null);
				return;
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				getVariable().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeclarationsPackage.VARIABLE_CONTAINER__TYPE_DEFINITION:
				return typeDefinition != null;
			case DeclarationsPackage.VARIABLE_CONTAINER__VARIABLE:
				return variable != null && !variable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableContainerImpl
