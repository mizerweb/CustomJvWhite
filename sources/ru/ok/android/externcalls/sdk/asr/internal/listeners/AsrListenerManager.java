package ru.ok.android.externcalls.sdk.asr.internal.listeners;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/asr/internal/listeners/AsrListenerManager;", "", "Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;", "listener", "Lsbi;", "addAsrRecordListener", "(Lru/ok/android/externcalls/sdk/asr/listener/AsrRecordListener;)V", "removeAsrRecordListener", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface AsrListenerManager {
    void addAsrRecordListener(AsrRecordListener listener);

    void removeAsrRecordListener(AsrRecordListener listener);
}
