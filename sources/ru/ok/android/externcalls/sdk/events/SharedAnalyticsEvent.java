package ru.ok.android.externcalls.sdk.events;

import defpackage.j95;
import defpackage.ore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0019\u001a\u00020\u0007H\u0096\u0080\u0004J(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00152\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u0015H\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u001bH\u0002R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ok/android/externcalls/sdk/events/SharedAnalyticsEvent;", "Lru/ok/android/externcalls/sdk/events/AnalyticsEventListener$AnalyticsEvent;", "source", "Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;", "<init>", "(Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;)V", SdkMetricStatEvent.NAME_KEY, "", "getName", "()Ljava/lang/String;", SdkMetricStatEvent.VALUE_KEY, "", "getValue", "()Ljava/lang/Number;", "stringValue", "getStringValue", "timestamp", "", "getTimestamp", "()J", "data", "", "", "getData", "()Ljava/util/Map;", "toString", "toValuesMap", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "toRaw", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SharedAnalyticsEvent implements AnalyticsEventListener.AnalyticsEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Object> data;

    private SharedAnalyticsEvent(SdkMetricStatEvent sdkMetricStatEvent) {
        this.data = toValuesMap(sdkMetricStatEvent.getItems());
    }

    public static final AnalyticsEventListener.AnalyticsEvent toEventListenerEvent(CallAnalyticsEvent callAnalyticsEvent) {
        return INSTANCE.toEventListenerEvent(callAnalyticsEvent);
    }

    private final Object toRaw(EventItemValue value) {
        if (value instanceof EventItemValue.StringValue) {
            return ((EventItemValue.StringValue) value).m90unboximpl();
        }
        if (value instanceof EventItemValue.FloatValue) {
            return Float.valueOf(((EventItemValue.FloatValue) value).m62unboximpl());
        }
        if (value instanceof EventItemValue.LongValue) {
            return Long.valueOf(((EventItemValue.LongValue) value).m76unboximpl());
        }
        if (value instanceof EventItemValue.IntValue) {
            return Integer.valueOf(((EventItemValue.IntValue) value).m69unboximpl());
        }
        if (value instanceof EventItemValue.ArrStringValue) {
            return ((EventItemValue.ArrStringValue) value).getValue();
        }
        if (value instanceof EventItemValue.MapStringStringValue) {
            return ((EventItemValue.MapStringStringValue) value).getValue();
        }
        if (value instanceof EventItemValue.BooleanValue) {
            return Boolean.valueOf(((EventItemValue.BooleanValue) value).m55unboximpl());
        }
        ore.o();
        return null;
    }

    private final Map<String, Object> toValuesMap(Map<String, ? extends EventItemValue> source) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends EventItemValue> entry : source.entrySet()) {
            linkedHashMap.put(entry.getKey(), toRaw(entry.getValue()));
        }
        return linkedHashMap;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public Map<String, Object> getData() {
        return this.data;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public String getName() {
        String string;
        Object obj = getData().get(SdkMetricStatEvent.NAME_KEY);
        return (obj == null || (string = obj.toString()) == null) ? "" : string;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public String getStringValue() {
        Object obj = getData().get(SdkMetricStatEvent.STRING_VALUE_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public long getTimestamp() {
        Object obj = getData().get("timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // ru.ok.android.externcalls.sdk.events.AnalyticsEventListener.AnalyticsEvent
    public Number getValue() {
        Object obj = getData().get(SdkMetricStatEvent.VALUE_KEY);
        if (obj instanceof Number) {
            return (Number) obj;
        }
        return null;
    }

    public String toString() {
        return getName() + " " + getData();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/events/SharedAnalyticsEvent$Companion;", "", "<init>", "()V", "toEventListenerEvent", "Lru/ok/android/externcalls/sdk/events/AnalyticsEventListener$AnalyticsEvent;", "event", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final AnalyticsEventListener.AnalyticsEvent toEventListenerEvent(CallAnalyticsEvent event) {
            j95 j95Var = null;
            if (event instanceof SdkMetricStatEvent) {
                return new SharedAnalyticsEvent((SdkMetricStatEvent) event, j95Var);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SharedAnalyticsEvent(SdkMetricStatEvent sdkMetricStatEvent, j95 j95Var) {
        this(sdkMetricStatEvent);
    }
}
