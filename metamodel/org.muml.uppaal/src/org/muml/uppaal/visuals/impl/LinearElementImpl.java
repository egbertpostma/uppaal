/**
 */
package org.muml.uppaal.visuals.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.visuals.LinearElement;
import org.muml.uppaal.visuals.Point;
import org.muml.uppaal.visuals.VisualsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.visuals.impl.LinearElementImpl#getBendPoint <em>Bend Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinearElementImpl extends EObjectImpl implements LinearElement {
	/**
	 * The cached value of the '{@link #getBendPoint() <em>Bend Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> bendPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualsPackage.Literals.LINEAR_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Point> getBendPoint() {
		if (bendPoint == null) {
			bendPoint = new EObjectContainmentEList<Point>(Point.class, this, VisualsPackage.LINEAR_ELEMENT__BEND_POINT);
		}
		return bendPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualsPackage.LINEAR_ELEMENT__BEND_POINT:
				return ((InternalEList<?>)getBendPoint()).basicRemove(otherEnd, msgs);
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
			case VisualsPackage.LINEAR_ELEMENT__BEND_POINT:
				return getBendPoint();
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
			case VisualsPackage.LINEAR_ELEMENT__BEND_POINT:
				getBendPoint().clear();
				getBendPoint().addAll((Collection<? extends Point>)newValue);
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
			case VisualsPackage.LINEAR_ELEMENT__BEND_POINT:
				getBendPoint().clear();
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
			case VisualsPackage.LINEAR_ELEMENT__BEND_POINT:
				return bendPoint != null && !bendPoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LinearElementImpl
