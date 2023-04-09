/**
 */
package ejemploDC4.impl;

import ejemploDC4.Clase;
import ejemploDC4.Clasificador;
import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Multiplicidad;
import ejemploDC4.Relacion;
import ejemploDC4.TipoRelacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.impl.RelacionImpl#getRol <em>Rol</em>}</li>
 *   <li>{@link ejemploDC4.impl.RelacionImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ejemploDC4.impl.RelacionImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link ejemploDC4.impl.RelacionImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ejemploDC4.impl.RelacionImpl#getMultiplicidad <em>Multiplicidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The default value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRol() <em>Rol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRol()
	 * @generated
	 * @ordered
	 */
	protected String rol = ROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Clase origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Clasificador destino;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRelacion TIPO_EDEFAULT = TipoRelacion.UNIDIRECCIONAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoRelacion tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicidad MULTIPLICIDAD_EDEFAULT = Multiplicidad.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected Multiplicidad multiplicidad = MULTIPLICIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjemploDC4Package.Literals.RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRol(String newRol) {
		String oldRol = rol;
		rol = newRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.RELACION__ROL, oldRol, rol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject) origen;
			origen = (Clase) eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EjemploDC4Package.RELACION__ORIGEN,
							oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Clase newOrigen) {
		Clase oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.RELACION__ORIGEN, oldOrigen,
					origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasificador getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject) destino;
			destino = (Clasificador) eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EjemploDC4Package.RELACION__DESTINO,
							oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clasificador basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Clasificador newDestino) {
		Clasificador oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.RELACION__DESTINO, oldDestino,
					destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRelacion getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoRelacion newTipo) {
		TipoRelacion oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.RELACION__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicidad getMultiplicidad() {
		return multiplicidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidad(Multiplicidad newMultiplicidad) {
		Multiplicidad oldMultiplicidad = multiplicidad;
		multiplicidad = newMultiplicidad == null ? MULTIPLICIDAD_EDEFAULT : newMultiplicidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.RELACION__MULTIPLICIDAD,
					oldMultiplicidad, multiplicidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EjemploDC4Package.RELACION__ROL:
			return getRol();
		case EjemploDC4Package.RELACION__ORIGEN:
			if (resolve)
				return getOrigen();
			return basicGetOrigen();
		case EjemploDC4Package.RELACION__DESTINO:
			if (resolve)
				return getDestino();
			return basicGetDestino();
		case EjemploDC4Package.RELACION__TIPO:
			return getTipo();
		case EjemploDC4Package.RELACION__MULTIPLICIDAD:
			return getMultiplicidad();
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
		case EjemploDC4Package.RELACION__ROL:
			setRol((String) newValue);
			return;
		case EjemploDC4Package.RELACION__ORIGEN:
			setOrigen((Clase) newValue);
			return;
		case EjemploDC4Package.RELACION__DESTINO:
			setDestino((Clasificador) newValue);
			return;
		case EjemploDC4Package.RELACION__TIPO:
			setTipo((TipoRelacion) newValue);
			return;
		case EjemploDC4Package.RELACION__MULTIPLICIDAD:
			setMultiplicidad((Multiplicidad) newValue);
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
		case EjemploDC4Package.RELACION__ROL:
			setRol(ROL_EDEFAULT);
			return;
		case EjemploDC4Package.RELACION__ORIGEN:
			setOrigen((Clase) null);
			return;
		case EjemploDC4Package.RELACION__DESTINO:
			setDestino((Clasificador) null);
			return;
		case EjemploDC4Package.RELACION__TIPO:
			setTipo(TIPO_EDEFAULT);
			return;
		case EjemploDC4Package.RELACION__MULTIPLICIDAD:
			setMultiplicidad(MULTIPLICIDAD_EDEFAULT);
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
		case EjemploDC4Package.RELACION__ROL:
			return ROL_EDEFAULT == null ? rol != null : !ROL_EDEFAULT.equals(rol);
		case EjemploDC4Package.RELACION__ORIGEN:
			return origen != null;
		case EjemploDC4Package.RELACION__DESTINO:
			return destino != null;
		case EjemploDC4Package.RELACION__TIPO:
			return tipo != TIPO_EDEFAULT;
		case EjemploDC4Package.RELACION__MULTIPLICIDAD:
			return multiplicidad != MULTIPLICIDAD_EDEFAULT;
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
		result.append(" (rol: ");
		result.append(rol);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", multiplicidad: ");
		result.append(multiplicidad);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
