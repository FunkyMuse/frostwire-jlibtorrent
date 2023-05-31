/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_plugin {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected swig_plugin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_plugin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_plugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.swig_plugin_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_plugin_change_ownership(this, swigCPtr, true);
  }

  public boolean on_dht_request(string_view query, udp_endpoint source, bdecode_node message, entry response) {
    return (getClass() == swig_plugin.class) ? libtorrent_jni.swig_plugin_on_dht_request(swigCPtr, this, string_view.getCPtr(query), query, udp_endpoint.getCPtr(source), source, bdecode_node.getCPtr(message), message, entry.getCPtr(response), response) : libtorrent_jni.swig_plugin_on_dht_requestSwigExplicitswig_plugin(swigCPtr, this, string_view.getCPtr(query), query, udp_endpoint.getCPtr(source), source, bdecode_node.getCPtr(message), message, entry.getCPtr(response), response);
  }

  public swig_plugin() {
    this(libtorrent_jni.new_swig_plugin(), true);
    libtorrent_jni.swig_plugin_director_connect(this, swigCPtr, true, true);
  }

}
