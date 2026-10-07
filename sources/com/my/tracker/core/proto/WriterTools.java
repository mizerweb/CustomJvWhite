package com.my.tracker.core.proto;

import com.my.tracker.core.EngineInfoState;
import com.my.tracker.core.TrackerConfig;

/* JADX INFO: loaded from: classes.dex */
public final class WriterTools {
    public final EngineInfoState engineInfoState;
    public final ByteArrayProtoWriter mainWriter;
    public final ByteArrayProtoWriter secondWriter;
    public final TrackerConfig.ReadOnlyCopy trackerConfigReadOnly;

    private WriterTools(ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2, TrackerConfig.ReadOnlyCopy readOnlyCopy, EngineInfoState engineInfoState) {
        this.mainWriter = byteArrayProtoWriter;
        this.secondWriter = byteArrayProtoWriter2;
        this.trackerConfigReadOnly = readOnlyCopy;
        this.engineInfoState = engineInfoState;
    }

    public static WriterTools a(ByteArrayProtoWriter byteArrayProtoWriter, ByteArrayProtoWriter byteArrayProtoWriter2, TrackerConfig.ReadOnlyCopy readOnlyCopy, EngineInfoState engineInfoState) {
        return new WriterTools(byteArrayProtoWriter, byteArrayProtoWriter2, readOnlyCopy, engineInfoState);
    }

    public void reset() {
        this.mainWriter.reset();
        this.secondWriter.reset();
    }
}
