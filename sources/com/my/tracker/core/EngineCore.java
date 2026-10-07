package com.my.tracker.core;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.my.tracker.core.net.HttpCore;
import com.my.tracker.core.net.HttpResult;
import com.my.tracker.core.proto.ByteArrayProtoWriter;
import com.my.tracker.core.proto.ProtoWriter;

/* JADX INFO: loaded from: classes.dex */
public interface EngineCore {

    @FunctionalInterface
    public interface EventPacker {
        byte[] invoke(InsertEventTools insertEventTools);
    }

    public static final class InsertEventTools {
        public final ByteArrayProtoWriter mainWriter;
        public final ByteArrayProtoWriter secondWriter;

        public InsertEventTools(ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2) {
            this.mainWriter = byteArrayProtoWriter;
            this.secondWriter = byteArrayProtoWriter2;
        }

        public void reset() {
            this.mainWriter.reset();
            this.secondWriter.reset();
        }
    }

    void flush();

    void flushIfNeeded();

    Application getApplication();

    long getApplicationLastUpdateTimestampSec();

    AsyncCore getAsyncCore();

    EngineMiniCore getEngineMiniCore();

    EnginePrefs getEnginePrefs();

    HttpCore getHttpCore();

    EnginePrefs getPrefs();

    SQLiteDatabase getSQLiteDatabase();

    TimeCore getTimeCore();

    TrackerConfig getTrackerConfig();

    void handleReferrerAttribution(String str);

    void insertEventInWorker(long j, int i, boolean z, boolean z2, long j2, EventPacker eventPacker);

    void insertEventSync(long j, int i, boolean z, boolean z2, long j2, EventPacker eventPacker);

    boolean insertSession(long j, long j2);

    HttpResult sendHttpPost(String str, byte[] bArr, boolean z);

    void setApplicationLastUpdateTimestampSec(long j);

    void timespentWritePacketHeader(ProtoWriter protoWriter, long j);
}
