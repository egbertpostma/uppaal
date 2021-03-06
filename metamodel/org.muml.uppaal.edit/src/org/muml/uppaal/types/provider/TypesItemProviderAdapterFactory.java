/**
 */
package org.muml.uppaal.types.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.muml.uppaal.types.util.TypesAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesItemProviderAdapterFactory extends TypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.PredefinedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredefinedTypeItemProvider predefinedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.PredefinedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredefinedTypeAdapter() {
		if (predefinedTypeItemProvider == null) {
			predefinedTypeItemProvider = new PredefinedTypeItemProvider(this);
		}

		return predefinedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.DeclaredType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredTypeItemProvider declaredTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.DeclaredType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclaredTypeAdapter() {
		if (declaredTypeItemProvider == null) {
			declaredTypeItemProvider = new DeclaredTypeItemProvider(this);
		}

		return declaredTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.TypeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceItemProvider typeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeReferenceAdapter() {
		if (typeReferenceItemProvider == null) {
			typeReferenceItemProvider = new TypeReferenceItemProvider(this);
		}

		return typeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.ScalarTypeSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarTypeSpecificationItemProvider scalarTypeSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.ScalarTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScalarTypeSpecificationAdapter() {
		if (scalarTypeSpecificationItemProvider == null) {
			scalarTypeSpecificationItemProvider = new ScalarTypeSpecificationItemProvider(this);
		}

		return scalarTypeSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.StructTypeSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructTypeSpecificationItemProvider structTypeSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.StructTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructTypeSpecificationAdapter() {
		if (structTypeSpecificationItemProvider == null) {
			structTypeSpecificationItemProvider = new StructTypeSpecificationItemProvider(this);
		}

		return structTypeSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.RangeTypeSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeTypeSpecificationItemProvider rangeTypeSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.RangeTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRangeTypeSpecificationAdapter() {
		if (rangeTypeSpecificationItemProvider == null) {
			rangeTypeSpecificationItemProvider = new RangeTypeSpecificationItemProvider(this);
		}

		return rangeTypeSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.IntegerBounds} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerBoundsItemProvider integerBoundsItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.IntegerBounds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerBoundsAdapter() {
		if (integerBoundsItemProvider == null) {
			integerBoundsItemProvider = new IntegerBoundsItemProvider(this);
		}

		return integerBoundsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.muml.uppaal.types.Library} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.muml.uppaal.types.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (predefinedTypeItemProvider != null) predefinedTypeItemProvider.dispose();
		if (declaredTypeItemProvider != null) declaredTypeItemProvider.dispose();
		if (typeReferenceItemProvider != null) typeReferenceItemProvider.dispose();
		if (scalarTypeSpecificationItemProvider != null) scalarTypeSpecificationItemProvider.dispose();
		if (structTypeSpecificationItemProvider != null) structTypeSpecificationItemProvider.dispose();
		if (rangeTypeSpecificationItemProvider != null) rangeTypeSpecificationItemProvider.dispose();
		if (integerBoundsItemProvider != null) integerBoundsItemProvider.dispose();
		if (libraryItemProvider != null) libraryItemProvider.dispose();
	}

}
