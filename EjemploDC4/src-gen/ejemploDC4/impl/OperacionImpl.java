/**
 */
package ejemploDC4.impl;

import ejemploDC4.EjemploDC4Package;
import ejemploDC4.Operacion;
import ejemploDC4.TipoRetorino;
import ejemploDC4.TipoVisibilidad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ejemploDC4.impl.OperacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ejemploDC4.impl.OperacionImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link ejemploDC4.impl.OperacionImpl#getRetorno <em>Retorno</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionImpl extends MinimalEObjectImpl.Container implements Operacion {
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
	 * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final TipoVisibilidad VISIBILIDAD_EDEFAULT = TipoVisibilidad.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilidad()
	 * @generated
	 * @ordered
	 */
	protected TipoVisibilidad visibilidad = VISIBILIDAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final TipoRetorino RETORNO_EDEFAULT = TipoRetorino.VOID;

	/**
	 * The cached value of the '{@link #getRetorno() <em>Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetorno()
	 * @generated
	 * @ordered
	 */
	protected TipoRetorino retorno = RETORNO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjemploDC4Package.Literals.OPERACION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.OPERACION__NOMBRE, oldNombre,
					nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVisibilidad getVisibilidad() {
		return visibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibilidad(TipoVisibilidad newVisibilidad) {
		TipoVisibilidad oldVisibilidad = visibilidad;
		visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.OPERACION__VISIBILIDAD,
					oldVisibilidad, visibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoRetorino getRetorno() {
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetorno(TipoRetorino newRetorno) {
		TipoRetorino oldRetorno = retorno;
		retorno = newRetorno == null ? RETORNO_EDEFAULT : newRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjemploDC4Package.OPERACION__RETORNO, oldRetorno,
					retorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EjemploDC4Package.OPERACION__NOMBRE:
			return getNombre();
		case EjemploDC4Package.OPERACION__VISIBILIDAD:
			return getVisibilidad();
		case EjemploDC4Package.OPERACION__RETORNO:
			return getRetorno();
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
		case EjemploDC4Package.OPERACION__NOMBRE:
			setNombre((String) newValue);
			return;
		case EjemploDC4Package.OPERACION__VISIBILIDAD:
			setVisibilidad((TipoVisibilidad) newValue);
			return;
		case EjemploDC4Package.OPERACION__RETORNO:
			setRetorno((TipoRetorino) newValue);
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
		case EjemploDC4Package.OPERACION__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case EjemploDC4Package.OPERACION__VISIBILIDAD:
			setVisibilidad(VISIBILIDAD_EDEFAULT);
			return;
		case EjemploDC4Package.OPERACION__RETORNO:
			setRetorno(RETORNO_EDEFAULT);
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
		case EjemploDC4Package.OPERACION__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case EjemploDC4Package.OPERACION__VISIBILIDAD:
			return visibilidad != VISIBILIDAD_EDEFAULT;
		case EjemploDC4Package.OPERACION__RETORNO:
			return retorno != RETORNO_EDEFAULT;
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
		result.append(", visibilidad: ");
		result.append(visibilidad);
		result.append(", retorno: ");
		result.append(retorno);
		result.append(')');
		return result.toString();
	}

} //OperacionImpl
