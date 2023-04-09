/**
 */
package ejemploDC4.impl;

import ejemploDC4.Atributo;
import ejemploDC4.Clase;
import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Implementacion;
import ejemploDC4.Operacion;
import ejemploDC4.Relacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.impl.ClaseImpl#getAtributos_contenidos <em>Atributos contenidos</em>}</li>
 *   <li>{@link ejemploDC4.impl.ClaseImpl#getOperaciones_contenidas <em>Operaciones contenidas</em>}</li>
 *   <li>{@link ejemploDC4.impl.ClaseImpl#getImplementaciones_contenidas <em>Implementaciones contenidas</em>}</li>
 *   <li>{@link ejemploDC4.impl.ClaseImpl#getRelaciones_contenidas <em>Relaciones contenidas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseImpl extends ClasificadorImpl implements Clase {
	/**
	 * The cached value of the '{@link #getAtributos_contenidos() <em>Atributos contenidos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos_contenidos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos_contenidos;

	/**
	 * The cached value of the '{@link #getOperaciones_contenidas() <em>Operaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Operacion> operaciones_contenidas;

	/**
	 * The cached value of the '{@link #getImplementaciones_contenidas() <em>Implementaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementacion> implementaciones_contenidas;

	/**
	 * The cached value of the '{@link #getRelaciones_contenidas() <em>Relaciones contenidas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones_contenidas()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relaciones_contenidas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjemploDC4Package.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributos_contenidos() {
		if (atributos_contenidos == null) {
			atributos_contenidos = new EObjectContainmentEList<Atributo>(Atributo.class, this,
					EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS);
		}
		return atributos_contenidos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operacion> getOperaciones_contenidas() {
		if (operaciones_contenidas == null) {
			operaciones_contenidas = new EObjectContainmentEList<Operacion>(Operacion.class, this,
					EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS);
		}
		return operaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementacion> getImplementaciones_contenidas() {
		if (implementaciones_contenidas == null) {
			implementaciones_contenidas = new EObjectContainmentEList<Implementacion>(Implementacion.class, this,
					EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS);
		}
		return implementaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelaciones_contenidas() {
		if (relaciones_contenidas == null) {
			relaciones_contenidas = new EObjectContainmentEList<Relacion>(Relacion.class, this,
					EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS);
		}
		return relaciones_contenidas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS:
			return ((InternalEList<?>) getAtributos_contenidos()).basicRemove(otherEnd, msgs);
		case EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS:
			return ((InternalEList<?>) getOperaciones_contenidas()).basicRemove(otherEnd, msgs);
		case EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS:
			return ((InternalEList<?>) getImplementaciones_contenidas()).basicRemove(otherEnd, msgs);
		case EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS:
			return ((InternalEList<?>) getRelaciones_contenidas()).basicRemove(otherEnd, msgs);
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
		case EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS:
			return getAtributos_contenidos();
		case EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS:
			return getOperaciones_contenidas();
		case EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS:
			return getImplementaciones_contenidas();
		case EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS:
			return getRelaciones_contenidas();
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
		case EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS:
			getAtributos_contenidos().clear();
			getAtributos_contenidos().addAll((Collection<? extends Atributo>) newValue);
			return;
		case EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS:
			getOperaciones_contenidas().clear();
			getOperaciones_contenidas().addAll((Collection<? extends Operacion>) newValue);
			return;
		case EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS:
			getImplementaciones_contenidas().clear();
			getImplementaciones_contenidas().addAll((Collection<? extends Implementacion>) newValue);
			return;
		case EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS:
			getRelaciones_contenidas().clear();
			getRelaciones_contenidas().addAll((Collection<? extends Relacion>) newValue);
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
		case EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS:
			getAtributos_contenidos().clear();
			return;
		case EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS:
			getOperaciones_contenidas().clear();
			return;
		case EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS:
			getImplementaciones_contenidas().clear();
			return;
		case EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS:
			getRelaciones_contenidas().clear();
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
		case EjemploDC4Package.CLASE__ATRIBUTOS_CONTENIDOS:
			return atributos_contenidos != null && !atributos_contenidos.isEmpty();
		case EjemploDC4Package.CLASE__OPERACIONES_CONTENIDAS:
			return operaciones_contenidas != null && !operaciones_contenidas.isEmpty();
		case EjemploDC4Package.CLASE__IMPLEMENTACIONES_CONTENIDAS:
			return implementaciones_contenidas != null && !implementaciones_contenidas.isEmpty();
		case EjemploDC4Package.CLASE__RELACIONES_CONTENIDAS:
			return relaciones_contenidas != null && !relaciones_contenidas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaseImpl
