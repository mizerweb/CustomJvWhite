package com.my.tracker.core.o;

import com.my.tracker.core.EnginePrefs;
import com.my.tracker.core.utils.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements EnginePrefs {
    private final e0 a;

    private c0(e0 e0Var) {
        this.a = e0Var;
    }

    public static c0 a(e0 e0Var) {
        return new c0(e0Var);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public boolean getBoolean(String str) {
        return this.a.a(str);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public long getLastStopTimestampAndClearSec() {
        return this.a.a("lastStopTimeStampSec", 0L);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public long getLastUpdateTimestampSec() {
        return getLong("lastUpdateTimestamp");
    }

    @Override // com.my.tracker.core.EnginePrefs
    public long getLong(String str) {
        return this.a.b(str);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public String getString(String str) {
        return this.a.c(str);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public void setBlock(Consumer consumer) {
        this.a.a(consumer);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public void setBoolean(String str, boolean z) {
        this.a.a(str, z);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public void setLastStopTimestampSec(long j) {
        setLong("lastStopTimeStampSec", j);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public void setLong(String str, long j) {
        this.a.b(str, j);
    }

    @Override // com.my.tracker.core.EnginePrefs
    public void setString(String str, String str2) {
        this.a.a(str, str2);
    }
}
