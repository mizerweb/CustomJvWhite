package com.my.tracker.core;

import android.content.SharedPreferences;
import com.my.tracker.core.utils.Consumer;

/* JADX INFO: loaded from: classes.dex */
public interface EnginePrefs {
    boolean getBoolean(String str);

    long getLastStopTimestampAndClearSec();

    long getLastUpdateTimestampSec();

    long getLong(String str);

    String getString(String str);

    void setBlock(Consumer<SharedPreferences.Editor> consumer);

    void setBoolean(String str, boolean z);

    void setLastStopTimestampSec(long j);

    void setLong(String str, long j);

    void setString(String str, String str2);
}
