/**
 */
package org.muml.uppaal.declarations.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.ExpressionInitializer;
import org.muml.uppaal.expressions.ExpressionsFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.declarations.ExpressionInitializer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionInitializerItemProvider
	extends InitializerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInitializerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExpressionInitializer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpressionInitializer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExpressionInitializer_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExpressionInitializer.class)) {
			case DeclarationsPackage.EXPRESSION_INITIALIZER__EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DeclarationsPackage.Literals.EXPRESSION_INITIALIZER__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));
	}

}
