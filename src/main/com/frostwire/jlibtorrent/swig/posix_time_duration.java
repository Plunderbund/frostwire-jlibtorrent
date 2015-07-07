/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class posix_time_duration {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected posix_time_duration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(posix_time_duration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_posix_time_duration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public posix_time_duration() {
    this(libtorrent_jni.new_posix_time_duration__SWIG_0(), true);
  }

  public posix_time_duration(long hours_in, long minutes_in, long seconds_in, long frac_sec_in) {
    this(libtorrent_jni.new_posix_time_duration__SWIG_1(hours_in, minutes_in, seconds_in, frac_sec_in), true);
  }

  public posix_time_duration(posix_time_duration other) {
    this(libtorrent_jni.new_posix_time_duration__SWIG_2(posix_time_duration.getCPtr(other), other), true);
  }

  public posix_time_duration(special_values sv) {
    this(libtorrent_jni.new_posix_time_duration__SWIG_3(sv.swigValue()), true);
  }

  public static posix_time_duration unit() {
    return new posix_time_duration(libtorrent_jni.posix_time_duration_unit(), true);
  }

  public static long ticks_per_second() {
    return libtorrent_jni.posix_time_duration_ticks_per_second();
  }

  public static time_resolutions resolution() {
    return time_resolutions.swigToEnum(libtorrent_jni.posix_time_duration_resolution());
  }

  public long hours() {
    return libtorrent_jni.posix_time_duration_hours(swigCPtr, this);
  }

  public long minutes() {
    return libtorrent_jni.posix_time_duration_minutes(swigCPtr, this);
  }

  public long seconds() {
    return libtorrent_jni.posix_time_duration_seconds(swigCPtr, this);
  }

  public long total_seconds() {
    return libtorrent_jni.posix_time_duration_total_seconds(swigCPtr, this);
  }

  public long total_milliseconds() {
    return libtorrent_jni.posix_time_duration_total_milliseconds(swigCPtr, this);
  }

  public long total_nanoseconds() {
    return libtorrent_jni.posix_time_duration_total_nanoseconds(swigCPtr, this);
  }

  public long total_microseconds() {
    return libtorrent_jni.posix_time_duration_total_microseconds(swigCPtr, this);
  }

  public long fractional_seconds() {
    return libtorrent_jni.posix_time_duration_fractional_seconds(swigCPtr, this);
  }

  public static int num_fractional_digits() {
    return libtorrent_jni.posix_time_duration_num_fractional_digits();
  }

  public boolean is_negative() {
    return libtorrent_jni.posix_time_duration_is_negative(swigCPtr, this);
  }

  public long ticks() {
    return libtorrent_jni.posix_time_duration_ticks(swigCPtr, this);
  }

  public boolean is_special() {
    return libtorrent_jni.posix_time_duration_is_special(swigCPtr, this);
  }

  public boolean is_pos_infinity() {
    return libtorrent_jni.posix_time_duration_is_pos_infinity(swigCPtr, this);
  }

  public boolean is_neg_infinity() {
    return libtorrent_jni.posix_time_duration_is_neg_infinity(swigCPtr, this);
  }

  public boolean is_not_a_date_time() {
    return libtorrent_jni.posix_time_duration_is_not_a_date_time(swigCPtr, this);
  }

}