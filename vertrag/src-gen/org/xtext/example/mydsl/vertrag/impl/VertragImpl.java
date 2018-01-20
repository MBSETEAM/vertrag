/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.vertrag.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.vertrag.Vertrag;
import org.xtext.example.mydsl.vertrag.VertragPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertrag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vertrag.impl.VertragImpl#getMindestvertragslaufzeit <em>Mindestvertragslaufzeit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.impl.VertragImpl#getDatenvolumen <em>Datenvolumen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.impl.VertragImpl#getMonatl_kosten <em>Monatl kosten</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.impl.VertragImpl#getNetzanbieter <em>Netzanbieter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.impl.VertragImpl#getInternetseite <em>Internetseite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertragImpl extends ElementImpl implements Vertrag
{
  /**
   * The default value of the '{@link #getMindestvertragslaufzeit() <em>Mindestvertragslaufzeit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMindestvertragslaufzeit()
   * @generated
   * @ordered
   */
  protected static final int MINDESTVERTRAGSLAUFZEIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMindestvertragslaufzeit() <em>Mindestvertragslaufzeit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMindestvertragslaufzeit()
   * @generated
   * @ordered
   */
  protected int mindestvertragslaufzeit = MINDESTVERTRAGSLAUFZEIT_EDEFAULT;

  /**
   * The default value of the '{@link #getDatenvolumen() <em>Datenvolumen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatenvolumen()
   * @generated
   * @ordered
   */
  protected static final int DATENVOLUMEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDatenvolumen() <em>Datenvolumen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatenvolumen()
   * @generated
   * @ordered
   */
  protected int datenvolumen = DATENVOLUMEN_EDEFAULT;

  /**
   * The default value of the '{@link #getMonatl_kosten() <em>Monatl kosten</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonatl_kosten()
   * @generated
   * @ordered
   */
  protected static final float MONATL_KOSTEN_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getMonatl_kosten() <em>Monatl kosten</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonatl_kosten()
   * @generated
   * @ordered
   */
  protected float monatl_kosten = MONATL_KOSTEN_EDEFAULT;

  /**
   * The default value of the '{@link #getNetzanbieter() <em>Netzanbieter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetzanbieter()
   * @generated
   * @ordered
   */
  protected static final String NETZANBIETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNetzanbieter() <em>Netzanbieter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetzanbieter()
   * @generated
   * @ordered
   */
  protected String netzanbieter = NETZANBIETER_EDEFAULT;

  /**
   * The default value of the '{@link #getInternetseite() <em>Internetseite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternetseite()
   * @generated
   * @ordered
   */
  protected static final String INTERNETSEITE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInternetseite() <em>Internetseite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternetseite()
   * @generated
   * @ordered
   */
  protected String internetseite = INTERNETSEITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VertragImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VertragPackage.Literals.VERTRAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMindestvertragslaufzeit()
  {
    return mindestvertragslaufzeit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMindestvertragslaufzeit(int newMindestvertragslaufzeit)
  {
    int oldMindestvertragslaufzeit = mindestvertragslaufzeit;
    mindestvertragslaufzeit = newMindestvertragslaufzeit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertragPackage.VERTRAG__MINDESTVERTRAGSLAUFZEIT, oldMindestvertragslaufzeit, mindestvertragslaufzeit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDatenvolumen()
  {
    return datenvolumen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatenvolumen(int newDatenvolumen)
  {
    int oldDatenvolumen = datenvolumen;
    datenvolumen = newDatenvolumen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertragPackage.VERTRAG__DATENVOLUMEN, oldDatenvolumen, datenvolumen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getMonatl_kosten()
  {
    return monatl_kosten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonatl_kosten(float newMonatl_kosten)
  {
    float oldMonatl_kosten = monatl_kosten;
    monatl_kosten = newMonatl_kosten;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertragPackage.VERTRAG__MONATL_KOSTEN, oldMonatl_kosten, monatl_kosten));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNetzanbieter()
  {
    return netzanbieter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNetzanbieter(String newNetzanbieter)
  {
    String oldNetzanbieter = netzanbieter;
    netzanbieter = newNetzanbieter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertragPackage.VERTRAG__NETZANBIETER, oldNetzanbieter, netzanbieter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInternetseite()
  {
    return internetseite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInternetseite(String newInternetseite)
  {
    String oldInternetseite = internetseite;
    internetseite = newInternetseite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VertragPackage.VERTRAG__INTERNETSEITE, oldInternetseite, internetseite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VertragPackage.VERTRAG__MINDESTVERTRAGSLAUFZEIT:
        return getMindestvertragslaufzeit();
      case VertragPackage.VERTRAG__DATENVOLUMEN:
        return getDatenvolumen();
      case VertragPackage.VERTRAG__MONATL_KOSTEN:
        return getMonatl_kosten();
      case VertragPackage.VERTRAG__NETZANBIETER:
        return getNetzanbieter();
      case VertragPackage.VERTRAG__INTERNETSEITE:
        return getInternetseite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VertragPackage.VERTRAG__MINDESTVERTRAGSLAUFZEIT:
        setMindestvertragslaufzeit((Integer)newValue);
        return;
      case VertragPackage.VERTRAG__DATENVOLUMEN:
        setDatenvolumen((Integer)newValue);
        return;
      case VertragPackage.VERTRAG__MONATL_KOSTEN:
        setMonatl_kosten((Float)newValue);
        return;
      case VertragPackage.VERTRAG__NETZANBIETER:
        setNetzanbieter((String)newValue);
        return;
      case VertragPackage.VERTRAG__INTERNETSEITE:
        setInternetseite((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VertragPackage.VERTRAG__MINDESTVERTRAGSLAUFZEIT:
        setMindestvertragslaufzeit(MINDESTVERTRAGSLAUFZEIT_EDEFAULT);
        return;
      case VertragPackage.VERTRAG__DATENVOLUMEN:
        setDatenvolumen(DATENVOLUMEN_EDEFAULT);
        return;
      case VertragPackage.VERTRAG__MONATL_KOSTEN:
        setMonatl_kosten(MONATL_KOSTEN_EDEFAULT);
        return;
      case VertragPackage.VERTRAG__NETZANBIETER:
        setNetzanbieter(NETZANBIETER_EDEFAULT);
        return;
      case VertragPackage.VERTRAG__INTERNETSEITE:
        setInternetseite(INTERNETSEITE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VertragPackage.VERTRAG__MINDESTVERTRAGSLAUFZEIT:
        return mindestvertragslaufzeit != MINDESTVERTRAGSLAUFZEIT_EDEFAULT;
      case VertragPackage.VERTRAG__DATENVOLUMEN:
        return datenvolumen != DATENVOLUMEN_EDEFAULT;
      case VertragPackage.VERTRAG__MONATL_KOSTEN:
        return monatl_kosten != MONATL_KOSTEN_EDEFAULT;
      case VertragPackage.VERTRAG__NETZANBIETER:
        return NETZANBIETER_EDEFAULT == null ? netzanbieter != null : !NETZANBIETER_EDEFAULT.equals(netzanbieter);
      case VertragPackage.VERTRAG__INTERNETSEITE:
        return INTERNETSEITE_EDEFAULT == null ? internetseite != null : !INTERNETSEITE_EDEFAULT.equals(internetseite);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mindestvertragslaufzeit: ");
    result.append(mindestvertragslaufzeit);
    result.append(", datenvolumen: ");
    result.append(datenvolumen);
    result.append(", monatl_kosten: ");
    result.append(monatl_kosten);
    result.append(", netzanbieter: ");
    result.append(netzanbieter);
    result.append(", internetseite: ");
    result.append(internetseite);
    result.append(')');
    return result.toString();
  }

} //VertragImpl
