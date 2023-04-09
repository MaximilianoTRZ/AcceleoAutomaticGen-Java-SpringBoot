/**
 */
package ejemploDC4.impl;

import ejemploDC4.DiagramaClases;
import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Paquete;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.impl.DiagramaClasesImpl#getPaquetes_contenidos <em>Paquetes contenidos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaClasesImpl extends MinimalEObjectImpl.Container implements DiagramaClases {
	/**
	 * The cached value of the '{@link #getPaquetes_contenidos() <em>Paquetes contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaquetes_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Paquete> paquetes_contenidos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjemploDC4Package.Literals.DIAGRAMA_CLASES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paquete> getPaquetes_contenidos() {
		if (paquetes_contenidos == null) {
			paquetes_contenidos = new EObjectContainmentEList<Paquete>(Paquete.class, this,
					EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS);
		}
		return paquetes_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS:
			return ((InternalEList<?>) getPaquetes_contenidos()).basicRemove(otherEnd, msgs);
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
		case EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS:
			return getPaquetes_contenidos();
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
		case EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS:
			getPaquetes_contenidos().clear();
			getPaquetes_contenidos().addAll((Collection<? extends Paquete>) newValue);
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
		case EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS:
			getPaquetes_contenidos().clear();
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
		case EjemploDC4Package.DIAGRAMA_CLASES__PAQUETES_CONTENIDOS:
			return paquetes_contenidos != null && !paquetes_contenidos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaClasesImpl
