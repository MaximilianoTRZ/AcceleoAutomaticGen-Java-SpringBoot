/**
 */
package ejemploDC4.impl;

import ejemploDC4.Clasificador;
import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Paquete;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.impl.PaqueteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.impl.PaqueteImpl#getClasificadores_contenidos <em>Clasificadores contenidos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaqueteImpl extends MinimalEObjectImpl.Container implements Paquete {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasificadores_contenidos() <em>Clasificadores contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasificadores_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Clasificador> clasificadores_contenidos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjemploDC4Package.Literals.PAQUETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.PAQUETE__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clasificador> getClasificadores_contenidos() {
		if (clasificadores_contenidos == null) {
			clasificadores_contenidos = new EObjectContainmentEList<Clasificador>(Clasificador.class, this,
					EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS);
		}
		return clasificadores_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS:
			return ((InternalEList<?>) getClasificadores_contenidos()).basicRemove(otherEnd, msgs);
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
		case EjemploDC4Package.PAQUETE__NOMBRE:
			return getNombre();
		case EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS:
			return getClasificadores_contenidos();
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
		case EjemploDC4Package.PAQUETE__NOMBRE:
			setNombre((String) newValue);
			return;
		case EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS:
			getClasificadores_contenidos().clear();
			getClasificadores_contenidos().addAll((Collection<? extends Clasificador>) newValue);
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
		case EjemploDC4Package.PAQUETE__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS:
			getClasificadores_contenidos().clear();
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
		case EjemploDC4Package.PAQUETE__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case EjemploDC4Package.PAQUETE__CLASIFICADORES_CONTENIDOS:
			return clasificadores_contenidos != null && !clasificadores_contenidos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //PaqueteImpl
