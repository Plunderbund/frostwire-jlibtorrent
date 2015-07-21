/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_get_peers_reply_alert extends alert {
  private long swigCPtr;

  protected dht_get_peers_reply_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_get_peers_reply_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_get_peers_reply_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_get_peers_reply_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public dht_get_peers_reply_alert(stack_allocator alloc, sha1_hash ih, tcp_endpoint_vector v) {
    this(libtorrent_jni.new_dht_get_peers_reply_alert(stack_allocator.getCPtr(alloc), alloc, sha1_hash.getCPtr(ih), ih, tcp_endpoint_vector.getCPtr(v), v), true);
  }

  public int type() {
    return libtorrent_jni.dht_get_peers_reply_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_get_peers_reply_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_get_peers_reply_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_get_peers_reply_alert_message(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.dht_get_peers_reply_alert_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.dht_get_peers_reply_alert_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public int num_peers() {
    return libtorrent_jni.dht_get_peers_reply_alert_num_peers(swigCPtr, this);
  }

  public void peers(tcp_endpoint_vector peers) {
    libtorrent_jni.dht_get_peers_reply_alert_peers(swigCPtr, this, tcp_endpoint_vector.getCPtr(peers), peers);
  }

  public final static int static_category = libtorrent_jni.dht_get_peers_reply_alert_static_category_get();
  public final static int priority = libtorrent_jni.dht_get_peers_reply_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_get_peers_reply_alert_alert_type_get();
}