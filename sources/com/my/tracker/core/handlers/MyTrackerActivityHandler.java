package com.my.tracker.core.handlers;

import android.app.Activity;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimePoint;

/* JADX INFO: loaded from: classes.dex */
public interface MyTrackerActivityHandler {
    void handleOnActivityStarted(EngineCore engineCore, Activity activity, TimePoint timePoint);

    void handleOnActivityStopped(EngineCore engineCore, Activity activity, TimePoint timePoint);

    void manualOnActivityStarted(EngineCore engineCore, Activity activity, TimePoint timePoint);

    void resetFlushTimer();

    void setActionEngineCoreFlush(Runnable runnable);

    void setActionSensorHandlerStart(Runnable runnable);

    void setActionTimespentSwitchToBackground(Consumer<Long> consumer);

    void setActionTimespentSwitchToForeground(Consumer<Long> consumer);

    void setActionTrackLaunch(BiConsumer<EngineCore, Long> biConsumer);
}
