/**
 */
package org.muml.uppaal.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.statements.ReturnStatement;
import org.muml.uppaal.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.statements.impl.ReturnStatementImpl#getReturnExpression <em>Return Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnStatementImpl extends StatementImpl implements ReturnStatement {
	/**
	 * The cached value of the '{@link #getReturnExpression() <em>Return Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression returnExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.RETURN_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReturnExpression() {
		return returnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnExpression(Expression newReturnExpression, NotificationChain msgs) {
		Expression oldReturnExpression = returnExpression;
		returnExpression = newReturnExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION, oldReturnExpression, newReturnExpression);
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
	public void setReturnExpression(Expression newReturnExpression) {
		if (newReturnExpression != returnExpression) {
			NotificationChain msgs = null;
			if (returnExpression != null)
				msgs = ((InternalEObject)returnExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION, null, msgs);
			if (newReturnExpression != null)
				msgs = ((InternalEObject)newReturnExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION, null, msgs);
			msgs = basicSetReturnExpression(newReturnExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION, newReturnExpression, newReturnExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION:
				return basicSetReturnExpression(null, msgs);
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
			case StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION:
				return getReturnExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION:
				setReturnExpression((Expression)newValue);
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
			case StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION:
				setReturnExpression((Expression)null);
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
			case StatementsPackage.RETURN_STATEMENT__RETURN_EXPRESSION:
				return returnExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnStatementImpl
