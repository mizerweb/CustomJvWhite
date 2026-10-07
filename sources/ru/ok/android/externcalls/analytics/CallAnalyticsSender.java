package ru.ok.android.externcalls.analytics;

import defpackage.qt4;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender;", "", "<init>", "()V", "Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;", "config", "Lsbi;", "initialize", "(Lru/ok/android/externcalls/analytics/config/CallAnalyticsConfig;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "send", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "forceSendScheduledEvents", "", "isIdle", "isCallActive", "setIdle", "(ZZ)V", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "listener", "setEventListener", "(Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;)V", "", "LOG_TAG", "Ljava/lang/String;", "Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "Listener", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallAnalyticsSender {
    public static final CallAnalyticsSender INSTANCE = new CallAnalyticsSender();
    private static final String LOG_TAG = "CallAnalyticsSender";
    private static volatile Listener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/analytics/CallAnalyticsSender$Listener;", "", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "Lsbi;", "onNewEvent", "(Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Listener {
        void onNewEvent(CallAnalyticsEvent event);
    }

    private CallAnalyticsSender() {
    }

    public final void forceSendScheduledEvents() {
        EventQueueCollector.flushAll();
    }

    public final synchronized void initialize(CallAnalyticsConfig config) {
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() == null) {
            callAnalyticsConfigStorage.setConfig(config);
        }
    }

    public final void send(CallAnalyticsEvent event) {
        try {
            Listener listener2 = listener;
            if (listener2 != null) {
                listener2.onNewEvent(event);
            }
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Error while notifying external listener", th);
        }
        CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
        if (callAnalyticsConfigStorage.getConfig() != null) {
            EventQueueCollector.getInstance(new EventChannel(event.getApiMethodName(), null, null, null, false, 30, null)).addEvent(event);
            return;
        }
        callAnalyticsConfigStorage.getLogger().e(LOG_TAG, "CallAnalyticsSender is not initialized, event=" + event + " is skipped");
    }

    public final void setEventListener(Listener listener2) {
        listener = listener2;
    }

    public final void setIdle(final boolean isIdle, final boolean isCallActive) {
        CallAnalyticsConfigStorage.INSTANCE.getLogger().d(LOG_TAG, qt4.o("CallAnalyticsSender setIdle(isIdle=", isIdle, ",isCallActive=", isCallActive, ")"));
        EventQueueCollector.setIdleStateProvider(new EventQueueCollector.IdleStateProvider() { // from class: ru.ok.android.externcalls.analytics.CallAnalyticsSender.setIdle.1
            @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
            /* JADX INFO: renamed from: isCallActive, reason: from getter */
            public boolean get$isCallActive() {
                return isCallActive;
            }

            @Override // ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector.IdleStateProvider
            /* JADX INFO: renamed from: isIdle, reason: from getter */
            public boolean get$isIdle() {
                return isIdle;
            }
        });
    }
}
