/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xvdr.audio;

public class MpegAudioDecoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MpegAudioDecoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MpegAudioDecoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        audiodecoderJNI.delete_MpegAudioDecoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MpegAudioDecoder() {
    this(audiodecoderJNI.new_MpegAudioDecoder(), true);
  }

  public int decodeDirect(java.nio.ByteBuffer pchInput, int length) {
    return audiodecoderJNI.MpegAudioDecoder_decodeDirect(swigCPtr, this, pchInput, length);
  }

  public int decode(byte[] BYTE, int offset, int length) {
    return audiodecoderJNI.MpegAudioDecoder_decode(swigCPtr, this, BYTE, offset, length);
  }

  public boolean readDirect(java.nio.ByteBuffer pchInput, int length) {
    return audiodecoderJNI.MpegAudioDecoder_readDirect(swigCPtr, this, pchInput, length);
  }

  public boolean read(byte[] BYTE, int offset, int length) {
    return audiodecoderJNI.MpegAudioDecoder_read(swigCPtr, this, BYTE, offset, length);
  }

  public int getChannels() {
    return audiodecoderJNI.MpegAudioDecoder_getChannels(swigCPtr, this);
  }

  public int getSampleRate() {
    return audiodecoderJNI.MpegAudioDecoder_getSampleRate(swigCPtr, this);
  }

}
