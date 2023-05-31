/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class piece_index_int_pair_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected piece_index_int_pair_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(piece_index_int_pair_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_piece_index_int_pair_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public piece_index_int_pair_vector() {
    this(libtorrent_jni.new_piece_index_int_pair_vector(), true);
  }

  public long size() {
    return libtorrent_jni.piece_index_int_pair_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.piece_index_int_pair_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.piece_index_int_pair_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.piece_index_int_pair_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.piece_index_int_pair_vector_clear(swigCPtr, this);
  }

  public void push_back(piece_index_int_pair x) {
    libtorrent_jni.piece_index_int_pair_vector_push_back(swigCPtr, this, piece_index_int_pair.getCPtr(x), x);
  }

  public piece_index_int_pair get(int i) {
    return new piece_index_int_pair(libtorrent_jni.piece_index_int_pair_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, piece_index_int_pair val) {
    libtorrent_jni.piece_index_int_pair_vector_set(swigCPtr, this, i, piece_index_int_pair.getCPtr(val), val);
  }

}
