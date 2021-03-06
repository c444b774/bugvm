/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bugvm.libimobiledevice.binding;

public class IntOut {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IntOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_IntOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getValue() {
    return LibIMobileDeviceJNI.IntOut_value_get(swigCPtr, this);
  }

  public IntOut() {
    this(LibIMobileDeviceJNI.new_IntOut(), true);
  }

}
