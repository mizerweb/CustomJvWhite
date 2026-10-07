package com.my.tracker.core;

import android.app.Application;
import com.my.tracker.core.proto.ExternalProtoWritersSetter;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TriConsumer;

/* JADX INFO: loaded from: classes.dex */
public interface EngineMiniCore {
    void addEngineInfoBeforeChangeListener(TriConsumer<Long, Long, EngineInfoState> triConsumer);

    Application getApplication();

    EngineInfoState getCurrentEngineInfoState();

    ExternalProtoWritersSetter getExternalProtoWritersSetter();

    TimeCore getTimeCore();

    TrackerConfig getTrackerConfig();

    void insertEventWithEngineCore(long j, int i, boolean z, boolean z2, long j2, EngineCore.EventPacker eventPacker);

    void onEngineWorkerWithEngineCore(Consumer<EngineCore> consumer);

    void setRemoteConfig(String str);
}
