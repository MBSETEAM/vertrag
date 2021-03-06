/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.vertrag;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertrag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getMindestvertragslaufzeit <em>Mindestvertragslaufzeit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getDatenvolumen <em>Datenvolumen</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getMonatl_kosten <em>Monatl kosten</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getInternetseite <em>Internetseite</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getTelefonflat <em>Telefonflat</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getSmsflat <em>Smsflat</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vertrag.Vertrag#getGeraet <em>Geraet</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag()
 * @model
 * @generated
 */
public interface Vertrag extends Element
{
  /**
   * Returns the value of the '<em><b>Mindestvertragslaufzeit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mindestvertragslaufzeit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mindestvertragslaufzeit</em>' attribute.
   * @see #setMindestvertragslaufzeit(int)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Mindestvertragslaufzeit()
   * @model
   * @generated
   */
  int getMindestvertragslaufzeit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getMindestvertragslaufzeit <em>Mindestvertragslaufzeit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mindestvertragslaufzeit</em>' attribute.
   * @see #getMindestvertragslaufzeit()
   * @generated
   */
  void setMindestvertragslaufzeit(int value);

  /**
   * Returns the value of the '<em><b>Datenvolumen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datenvolumen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datenvolumen</em>' attribute.
   * @see #setDatenvolumen(int)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Datenvolumen()
   * @model
   * @generated
   */
  int getDatenvolumen();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getDatenvolumen <em>Datenvolumen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datenvolumen</em>' attribute.
   * @see #getDatenvolumen()
   * @generated
   */
  void setDatenvolumen(int value);

  /**
   * Returns the value of the '<em><b>Monatl kosten</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Monatl kosten</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Monatl kosten</em>' attribute.
   * @see #setMonatl_kosten(String)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Monatl_kosten()
   * @model
   * @generated
   */
  String getMonatl_kosten();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getMonatl_kosten <em>Monatl kosten</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Monatl kosten</em>' attribute.
   * @see #getMonatl_kosten()
   * @generated
   */
  void setMonatl_kosten(String value);

  /**
   * Returns the value of the '<em><b>Internetseite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internetseite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internetseite</em>' attribute.
   * @see #setInternetseite(String)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Internetseite()
   * @model
   * @generated
   */
  String getInternetseite();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getInternetseite <em>Internetseite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internetseite</em>' attribute.
   * @see #getInternetseite()
   * @generated
   */
  void setInternetseite(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.vertrag.Netzanbieter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.vertrag.Netzanbieter
   * @see #setValue(Netzanbieter)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Value()
   * @model
   * @generated
   */
  Netzanbieter getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.xtext.example.mydsl.vertrag.Netzanbieter
   * @see #getValue()
   * @generated
   */
  void setValue(Netzanbieter value);

  /**
   * Returns the value of the '<em><b>Telefonflat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Telefonflat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Telefonflat</em>' attribute.
   * @see #setTelefonflat(String)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Telefonflat()
   * @model
   * @generated
   */
  String getTelefonflat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getTelefonflat <em>Telefonflat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Telefonflat</em>' attribute.
   * @see #getTelefonflat()
   * @generated
   */
  void setTelefonflat(String value);

  /**
   * Returns the value of the '<em><b>Smsflat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smsflat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smsflat</em>' attribute.
   * @see #setSmsflat(String)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Smsflat()
   * @model
   * @generated
   */
  String getSmsflat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getSmsflat <em>Smsflat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Smsflat</em>' attribute.
   * @see #getSmsflat()
   * @generated
   */
  void setSmsflat(String value);

  /**
   * Returns the value of the '<em><b>Geraet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geraet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geraet</em>' reference.
   * @see #setGeraet(Handy)
   * @see org.xtext.example.mydsl.vertrag.VertragPackage#getVertrag_Geraet()
   * @model
   * @generated
   */
  Handy getGeraet();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vertrag.Vertrag#getGeraet <em>Geraet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geraet</em>' reference.
   * @see #getGeraet()
   * @generated
   */
  void setGeraet(Handy value);

} // Vertrag
