/**
 */
package ejemploDC4.provider;

import ejemploDC4.util.EjemploDC4AdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EjemploDC4ItemProviderAdapterFactory extends EjemploDC4AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public EjemploDC4ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.DiagramaClases} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesItemProvider diagramaClasesItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.DiagramaClases}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiagramaClasesAdapter() {
		if (diagramaClasesItemProvider == null) {
			diagramaClasesItemProvider = new DiagramaClasesItemProvider(this);
		}

		return diagramaClasesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Clase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseItemProvider claseItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Clase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaseAdapter() {
		if (claseItemProvider == null) {
			claseItemProvider = new ClaseItemProvider(this);
		}

		return claseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Atributo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoItemProvider atributoItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoAdapter() {
		if (atributoItemProvider == null) {
			atributoItemProvider = new AtributoItemProvider(this);
		}

		return atributoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Operacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionItemProvider operacionItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Operacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperacionAdapter() {
		if (operacionItemProvider == null) {
			operacionItemProvider = new OperacionItemProvider(this);
		}

		return operacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Herencia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaItemProvider herenciaItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Herencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHerenciaAdapter() {
		if (herenciaItemProvider == null) {
			herenciaItemProvider = new HerenciaItemProvider(this);
		}

		return herenciaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Implementacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementacionItemProvider implementacionItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Implementacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplementacionAdapter() {
		if (implementacionItemProvider == null) {
			implementacionItemProvider = new ImplementacionItemProvider(this);
		}

		return implementacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Relacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionItemProvider relacionItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Relacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelacionAdapter() {
		if (relacionItemProvider == null) {
			relacionItemProvider = new RelacionItemProvider(this);
		}

		return relacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ejemploDC4.Paquete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteItemProvider paqueteItemProvider;

	/**
	 * This creates an adapter for a {@link ejemploDC4.Paquete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaqueteAdapter() {
		if (paqueteItemProvider == null) {
			paqueteItemProvider = new PaqueteItemProvider(this);
		}

		return paqueteItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
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
		if (diagramaClasesItemProvider != null)
			diagramaClasesItemProvider.dispose();
		if (claseItemProvider != null)
			claseItemProvider.dispose();
		if (interfaceItemProvider != null)
			interfaceItemProvider.dispose();
		if (atributoItemProvider != null)
			atributoItemProvider.dispose();
		if (operacionItemProvider != null)
			operacionItemProvider.dispose();
		if (herenciaItemProvider != null)
			herenciaItemProvider.dispose();
		if (implementacionItemProvider != null)
			implementacionItemProvider.dispose();
		if (relacionItemProvider != null)
			relacionItemProvider.dispose();
		if (paqueteItemProvider != null)
			paqueteItemProvider.dispose();
	}

}
