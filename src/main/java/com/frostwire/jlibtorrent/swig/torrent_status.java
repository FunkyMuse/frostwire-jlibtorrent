/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_status {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected torrent_status(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_status obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_torrent_status(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public torrent_status() {
    this(libtorrent_jni.new_torrent_status__SWIG_0(), true);
  }

  public torrent_status(torrent_status arg0) {
    this(libtorrent_jni.new_torrent_status__SWIG_1(torrent_status.getCPtr(arg0), arg0), true);
  }

  public boolean op_eq(torrent_status st) {
    return libtorrent_jni.torrent_status_op_eq(swigCPtr, this, torrent_status.getCPtr(st), st);
  }

  public void setHandle(torrent_handle value) {
    libtorrent_jni.torrent_status_handle_set(swigCPtr, this, torrent_handle.getCPtr(value), value);
  }

  public torrent_handle getHandle() {
    long cPtr = libtorrent_jni.torrent_status_handle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_handle(cPtr, false);
  }

  public void setErrc(error_code value) {
    libtorrent_jni.torrent_status_errc_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getErrc() {
    long cPtr = libtorrent_jni.torrent_status_errc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setError_file(int value) {
    libtorrent_jni.torrent_status_error_file_set(swigCPtr, this, value);
  }

  public int getError_file() {
    return libtorrent_jni.torrent_status_error_file_get(swigCPtr, this);
  }

  public static int getError_file_none() {
    return libtorrent_jni.torrent_status_error_file_none_get();
  }

  public static int getError_file_ssl_ctx() {
    return libtorrent_jni.torrent_status_error_file_ssl_ctx_get();
  }

  public static int getError_file_metadata() {
    return libtorrent_jni.torrent_status_error_file_metadata_get();
  }

  public static int getError_file_exception() {
    return libtorrent_jni.torrent_status_error_file_exception_get();
  }

  public static int getError_file_partfile() {
    return libtorrent_jni.torrent_status_error_file_partfile_get();
  }

  public void setSave_path(String value) {
    libtorrent_jni.torrent_status_save_path_set(swigCPtr, this, value);
  }

  public String getSave_path() {
    return libtorrent_jni.torrent_status_save_path_get(swigCPtr, this);
  }

  public void setName(String value) {
    libtorrent_jni.torrent_status_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.torrent_status_name_get(swigCPtr, this);
  }

  public void setCurrent_tracker(String value) {
    libtorrent_jni.torrent_status_current_tracker_set(swigCPtr, this, value);
  }

  public String getCurrent_tracker() {
    return libtorrent_jni.torrent_status_current_tracker_get(swigCPtr, this);
  }

  public void setTotal_download(long value) {
    libtorrent_jni.torrent_status_total_download_set(swigCPtr, this, value);
  }

  public long getTotal_download() {
    return libtorrent_jni.torrent_status_total_download_get(swigCPtr, this);
  }

  public void setTotal_upload(long value) {
    libtorrent_jni.torrent_status_total_upload_set(swigCPtr, this, value);
  }

  public long getTotal_upload() {
    return libtorrent_jni.torrent_status_total_upload_get(swigCPtr, this);
  }

  public void setTotal_payload_download(long value) {
    libtorrent_jni.torrent_status_total_payload_download_set(swigCPtr, this, value);
  }

  public long getTotal_payload_download() {
    return libtorrent_jni.torrent_status_total_payload_download_get(swigCPtr, this);
  }

  public void setTotal_payload_upload(long value) {
    libtorrent_jni.torrent_status_total_payload_upload_set(swigCPtr, this, value);
  }

  public long getTotal_payload_upload() {
    return libtorrent_jni.torrent_status_total_payload_upload_get(swigCPtr, this);
  }

  public void setTotal_failed_bytes(long value) {
    libtorrent_jni.torrent_status_total_failed_bytes_set(swigCPtr, this, value);
  }

  public long getTotal_failed_bytes() {
    return libtorrent_jni.torrent_status_total_failed_bytes_get(swigCPtr, this);
  }

  public void setTotal_redundant_bytes(long value) {
    libtorrent_jni.torrent_status_total_redundant_bytes_set(swigCPtr, this, value);
  }

  public long getTotal_redundant_bytes() {
    return libtorrent_jni.torrent_status_total_redundant_bytes_get(swigCPtr, this);
  }

  public void setPieces(piece_index_bitfield value) {
    libtorrent_jni.torrent_status_pieces_set(swigCPtr, this, piece_index_bitfield.getCPtr(value), value);
  }

  public piece_index_bitfield getPieces() {
    long cPtr = libtorrent_jni.torrent_status_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public void setVerified_pieces(piece_index_bitfield value) {
    libtorrent_jni.torrent_status_verified_pieces_set(swigCPtr, this, piece_index_bitfield.getCPtr(value), value);
  }

  public piece_index_bitfield getVerified_pieces() {
    long cPtr = libtorrent_jni.torrent_status_verified_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public void setTotal_done(long value) {
    libtorrent_jni.torrent_status_total_done_set(swigCPtr, this, value);
  }

  public long getTotal_done() {
    return libtorrent_jni.torrent_status_total_done_get(swigCPtr, this);
  }

  public void setTotal(long value) {
    libtorrent_jni.torrent_status_total_set(swigCPtr, this, value);
  }

  public long getTotal() {
    return libtorrent_jni.torrent_status_total_get(swigCPtr, this);
  }

  public void setTotal_wanted_done(long value) {
    libtorrent_jni.torrent_status_total_wanted_done_set(swigCPtr, this, value);
  }

  public long getTotal_wanted_done() {
    return libtorrent_jni.torrent_status_total_wanted_done_get(swigCPtr, this);
  }

  public void setTotal_wanted(long value) {
    libtorrent_jni.torrent_status_total_wanted_set(swigCPtr, this, value);
  }

  public long getTotal_wanted() {
    return libtorrent_jni.torrent_status_total_wanted_get(swigCPtr, this);
  }

  public void setAll_time_upload(long value) {
    libtorrent_jni.torrent_status_all_time_upload_set(swigCPtr, this, value);
  }

  public long getAll_time_upload() {
    return libtorrent_jni.torrent_status_all_time_upload_get(swigCPtr, this);
  }

  public void setAll_time_download(long value) {
    libtorrent_jni.torrent_status_all_time_download_set(swigCPtr, this, value);
  }

  public long getAll_time_download() {
    return libtorrent_jni.torrent_status_all_time_download_get(swigCPtr, this);
  }

  public void setAdded_time(long value) {
    libtorrent_jni.torrent_status_added_time_set(swigCPtr, this, value);
  }

  public long getAdded_time() {
    return libtorrent_jni.torrent_status_added_time_get(swigCPtr, this);
  }

  public void setCompleted_time(long value) {
    libtorrent_jni.torrent_status_completed_time_set(swigCPtr, this, value);
  }

  public long getCompleted_time() {
    return libtorrent_jni.torrent_status_completed_time_get(swigCPtr, this);
  }

  public void setLast_seen_complete(long value) {
    libtorrent_jni.torrent_status_last_seen_complete_set(swigCPtr, this, value);
  }

  public long getLast_seen_complete() {
    return libtorrent_jni.torrent_status_last_seen_complete_get(swigCPtr, this);
  }

  public void setStorage_mode(storage_mode_t value) {
    libtorrent_jni.torrent_status_storage_mode_set(swigCPtr, this, value.swigValue());
  }

  public storage_mode_t getStorage_mode() {
    return storage_mode_t.swigToEnum(libtorrent_jni.torrent_status_storage_mode_get(swigCPtr, this));
  }

  public void setProgress(float value) {
    libtorrent_jni.torrent_status_progress_set(swigCPtr, this, value);
  }

  public float getProgress() {
    return libtorrent_jni.torrent_status_progress_get(swigCPtr, this);
  }

  public void setProgress_ppm(int value) {
    libtorrent_jni.torrent_status_progress_ppm_set(swigCPtr, this, value);
  }

  public int getProgress_ppm() {
    return libtorrent_jni.torrent_status_progress_ppm_get(swigCPtr, this);
  }

  public void setDownload_rate(int value) {
    libtorrent_jni.torrent_status_download_rate_set(swigCPtr, this, value);
  }

  public int getDownload_rate() {
    return libtorrent_jni.torrent_status_download_rate_get(swigCPtr, this);
  }

  public void setUpload_rate(int value) {
    libtorrent_jni.torrent_status_upload_rate_set(swigCPtr, this, value);
  }

  public int getUpload_rate() {
    return libtorrent_jni.torrent_status_upload_rate_get(swigCPtr, this);
  }

  public void setDownload_payload_rate(int value) {
    libtorrent_jni.torrent_status_download_payload_rate_set(swigCPtr, this, value);
  }

  public int getDownload_payload_rate() {
    return libtorrent_jni.torrent_status_download_payload_rate_get(swigCPtr, this);
  }

  public void setUpload_payload_rate(int value) {
    libtorrent_jni.torrent_status_upload_payload_rate_set(swigCPtr, this, value);
  }

  public int getUpload_payload_rate() {
    return libtorrent_jni.torrent_status_upload_payload_rate_get(swigCPtr, this);
  }

  public void setNum_seeds(int value) {
    libtorrent_jni.torrent_status_num_seeds_set(swigCPtr, this, value);
  }

  public int getNum_seeds() {
    return libtorrent_jni.torrent_status_num_seeds_get(swigCPtr, this);
  }

  public void setNum_peers(int value) {
    libtorrent_jni.torrent_status_num_peers_set(swigCPtr, this, value);
  }

  public int getNum_peers() {
    return libtorrent_jni.torrent_status_num_peers_get(swigCPtr, this);
  }

  public void setNum_complete(int value) {
    libtorrent_jni.torrent_status_num_complete_set(swigCPtr, this, value);
  }

  public int getNum_complete() {
    return libtorrent_jni.torrent_status_num_complete_get(swigCPtr, this);
  }

  public void setNum_incomplete(int value) {
    libtorrent_jni.torrent_status_num_incomplete_set(swigCPtr, this, value);
  }

  public int getNum_incomplete() {
    return libtorrent_jni.torrent_status_num_incomplete_get(swigCPtr, this);
  }

  public void setList_seeds(int value) {
    libtorrent_jni.torrent_status_list_seeds_set(swigCPtr, this, value);
  }

  public int getList_seeds() {
    return libtorrent_jni.torrent_status_list_seeds_get(swigCPtr, this);
  }

  public void setList_peers(int value) {
    libtorrent_jni.torrent_status_list_peers_set(swigCPtr, this, value);
  }

  public int getList_peers() {
    return libtorrent_jni.torrent_status_list_peers_get(swigCPtr, this);
  }

  public void setConnect_candidates(int value) {
    libtorrent_jni.torrent_status_connect_candidates_set(swigCPtr, this, value);
  }

  public int getConnect_candidates() {
    return libtorrent_jni.torrent_status_connect_candidates_get(swigCPtr, this);
  }

  public void setNum_pieces(int value) {
    libtorrent_jni.torrent_status_num_pieces_set(swigCPtr, this, value);
  }

  public int getNum_pieces() {
    return libtorrent_jni.torrent_status_num_pieces_get(swigCPtr, this);
  }

  public void setDistributed_full_copies(int value) {
    libtorrent_jni.torrent_status_distributed_full_copies_set(swigCPtr, this, value);
  }

  public int getDistributed_full_copies() {
    return libtorrent_jni.torrent_status_distributed_full_copies_get(swigCPtr, this);
  }

  public void setDistributed_fraction(int value) {
    libtorrent_jni.torrent_status_distributed_fraction_set(swigCPtr, this, value);
  }

  public int getDistributed_fraction() {
    return libtorrent_jni.torrent_status_distributed_fraction_get(swigCPtr, this);
  }

  public void setDistributed_copies(float value) {
    libtorrent_jni.torrent_status_distributed_copies_set(swigCPtr, this, value);
  }

  public float getDistributed_copies() {
    return libtorrent_jni.torrent_status_distributed_copies_get(swigCPtr, this);
  }

  public void setBlock_size(int value) {
    libtorrent_jni.torrent_status_block_size_set(swigCPtr, this, value);
  }

  public int getBlock_size() {
    return libtorrent_jni.torrent_status_block_size_get(swigCPtr, this);
  }

  public void setNum_uploads(int value) {
    libtorrent_jni.torrent_status_num_uploads_set(swigCPtr, this, value);
  }

  public int getNum_uploads() {
    return libtorrent_jni.torrent_status_num_uploads_get(swigCPtr, this);
  }

  public void setNum_connections(int value) {
    libtorrent_jni.torrent_status_num_connections_set(swigCPtr, this, value);
  }

  public int getNum_connections() {
    return libtorrent_jni.torrent_status_num_connections_get(swigCPtr, this);
  }

  public void setUploads_limit(int value) {
    libtorrent_jni.torrent_status_uploads_limit_set(swigCPtr, this, value);
  }

  public int getUploads_limit() {
    return libtorrent_jni.torrent_status_uploads_limit_get(swigCPtr, this);
  }

  public void setConnections_limit(int value) {
    libtorrent_jni.torrent_status_connections_limit_set(swigCPtr, this, value);
  }

  public int getConnections_limit() {
    return libtorrent_jni.torrent_status_connections_limit_get(swigCPtr, this);
  }

  public void setUp_bandwidth_queue(int value) {
    libtorrent_jni.torrent_status_up_bandwidth_queue_set(swigCPtr, this, value);
  }

  public int getUp_bandwidth_queue() {
    return libtorrent_jni.torrent_status_up_bandwidth_queue_get(swigCPtr, this);
  }

  public void setDown_bandwidth_queue(int value) {
    libtorrent_jni.torrent_status_down_bandwidth_queue_set(swigCPtr, this, value);
  }

  public int getDown_bandwidth_queue() {
    return libtorrent_jni.torrent_status_down_bandwidth_queue_get(swigCPtr, this);
  }

  public void setSeed_rank(int value) {
    libtorrent_jni.torrent_status_seed_rank_set(swigCPtr, this, value);
  }

  public int getSeed_rank() {
    return libtorrent_jni.torrent_status_seed_rank_get(swigCPtr, this);
  }

  public void setState(torrent_status.state_t value) {
    libtorrent_jni.torrent_status_state_set(swigCPtr, this, value.swigValue());
  }

  public torrent_status.state_t getState() {
    return torrent_status.state_t.swigToEnum(libtorrent_jni.torrent_status_state_get(swigCPtr, this));
  }

  public void setNeed_save_resume(boolean value) {
    libtorrent_jni.torrent_status_need_save_resume_set(swigCPtr, this, value);
  }

  public boolean getNeed_save_resume() {
    return libtorrent_jni.torrent_status_need_save_resume_get(swigCPtr, this);
  }

  public void setIs_seeding(boolean value) {
    libtorrent_jni.torrent_status_is_seeding_set(swigCPtr, this, value);
  }

  public boolean getIs_seeding() {
    return libtorrent_jni.torrent_status_is_seeding_get(swigCPtr, this);
  }

  public void setIs_finished(boolean value) {
    libtorrent_jni.torrent_status_is_finished_set(swigCPtr, this, value);
  }

  public boolean getIs_finished() {
    return libtorrent_jni.torrent_status_is_finished_get(swigCPtr, this);
  }

  public void setHas_metadata(boolean value) {
    libtorrent_jni.torrent_status_has_metadata_set(swigCPtr, this, value);
  }

  public boolean getHas_metadata() {
    return libtorrent_jni.torrent_status_has_metadata_get(swigCPtr, this);
  }

  public void setHas_incoming(boolean value) {
    libtorrent_jni.torrent_status_has_incoming_set(swigCPtr, this, value);
  }

  public boolean getHas_incoming() {
    return libtorrent_jni.torrent_status_has_incoming_get(swigCPtr, this);
  }

  public void setMoving_storage(boolean value) {
    libtorrent_jni.torrent_status_moving_storage_set(swigCPtr, this, value);
  }

  public boolean getMoving_storage() {
    return libtorrent_jni.torrent_status_moving_storage_get(swigCPtr, this);
  }

  public void setAnnouncing_to_trackers(boolean value) {
    libtorrent_jni.torrent_status_announcing_to_trackers_set(swigCPtr, this, value);
  }

  public boolean getAnnouncing_to_trackers() {
    return libtorrent_jni.torrent_status_announcing_to_trackers_get(swigCPtr, this);
  }

  public void setAnnouncing_to_lsd(boolean value) {
    libtorrent_jni.torrent_status_announcing_to_lsd_set(swigCPtr, this, value);
  }

  public boolean getAnnouncing_to_lsd() {
    return libtorrent_jni.torrent_status_announcing_to_lsd_get(swigCPtr, this);
  }

  public void setAnnouncing_to_dht(boolean value) {
    libtorrent_jni.torrent_status_announcing_to_dht_set(swigCPtr, this, value);
  }

  public boolean getAnnouncing_to_dht() {
    return libtorrent_jni.torrent_status_announcing_to_dht_get(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.torrent_status_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.torrent_status_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setFlags(torrent_flags_t value) {
    libtorrent_jni.torrent_status_flags_set(swigCPtr, this, torrent_flags_t.getCPtr(value), value);
  }

  public torrent_flags_t getFlags() {
    long cPtr = libtorrent_jni.torrent_status_flags_get(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_flags_t(cPtr, false);
  }

  public torrent_info torrent_file_ptr() {
    long cPtr = libtorrent_jni.torrent_status_torrent_file_ptr(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_info(cPtr, false);
  }

  public long get_next_announce() {
    return libtorrent_jni.torrent_status_get_next_announce(swigCPtr, this);
  }

  public long get_last_upload() {
    return libtorrent_jni.torrent_status_get_last_upload(swigCPtr, this);
  }

  public long get_last_download() {
    return libtorrent_jni.torrent_status_get_last_download(swigCPtr, this);
  }

  public long get_active_duration() {
    return libtorrent_jni.torrent_status_get_active_duration(swigCPtr, this);
  }

  public long get_finished_duration() {
    return libtorrent_jni.torrent_status_get_finished_duration(swigCPtr, this);
  }

  public long get_seeding_duration() {
    return libtorrent_jni.torrent_status_get_seeding_duration(swigCPtr, this);
  }

  public int get_queue_position() {
    return libtorrent_jni.torrent_status_get_queue_position(swigCPtr, this);
  }

  public final static class state_t {
    public final static torrent_status.state_t checking_files = new torrent_status.state_t("checking_files", libtorrent_jni.torrent_status_checking_files_get());
    public final static torrent_status.state_t downloading_metadata = new torrent_status.state_t("downloading_metadata");
    public final static torrent_status.state_t downloading = new torrent_status.state_t("downloading");
    public final static torrent_status.state_t finished = new torrent_status.state_t("finished");
    public final static torrent_status.state_t seeding = new torrent_status.state_t("seeding");
    public final static torrent_status.state_t checking_resume_data = new torrent_status.state_t("checking_resume_data", libtorrent_jni.torrent_status_checking_resume_data_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static state_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + state_t.class + " with value " + swigValue);
    }

    private state_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private state_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private state_t(String swigName, state_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static state_t[] swigValues = { checking_files, downloading_metadata, downloading, finished, seeding, checking_resume_data };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
