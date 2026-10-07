package ru.ok.android.externcalls.analytics.events;

import defpackage.qv1;
import defpackage.skd;
import defpackage.wm9;
import defpackage.ww3;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB\u001d\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\r\u001a\u00020\u0004H\u0096\u0080\u0004R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", CallAnalyticsApiRequest.KEY_ITEMS, "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "<init>", "(Ljava/util/Map;)V", "getItems", "()Ljava/util/Map;", "apiMethodName", "getApiMethodName", "()Ljava/lang/String;", "toString", "Builder", "Companion", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SdkMetricStatEvent extends CallAnalyticsEvent {
    public static final String NAME_KEY = "name";
    public static final String STRING_VALUE_KEY = "string_value";
    public static final String VALUE_KEY = "value";
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkMetricStatEvent(Map<String, ? extends EventItemValue> map) {
        this.items = map;
    }

    public static final CharSequence toString$lambda$0(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public String getApiMethodName() {
        return this.apiMethodName;
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public String toString() {
        return qv1.l("SdkMetricStatEvent apiMethod=", getApiMethodName(), " ", ww3.z1(getItems().entrySet(), ", ", null, null, new skd(26), 30));
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u0086\u0002J\u001b\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0086\u0002J \u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0086\u0002¢\u0006\u0002\u0010\u000eJ \u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0086\u0002¢\u0006\u0002\u0010\u0010J \u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0011H\u0086\u0002¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0015J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "metricName", "", "metricValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "<init>", "(Ljava/lang/String;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "map", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "set", "key", SdkMetricStatEvent.VALUE_KEY, "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent$Builder;", "addAll", CallAnalyticsApiRequest.KEY_ITEMS, "", "build", "Lru/ok/android/externcalls/analytics/events/SdkMetricStatEvent;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        private final EventItemsMap map;

        public Builder(String str, EventItemValue eventItemValue) {
            EventItemsMap eventItemsMap = new EventItemsMap();
            this.map = eventItemsMap;
            eventItemsMap.set(SdkMetricStatEvent.NAME_KEY, str);
            if (eventItemValue != null) {
                if (eventItemValue instanceof EventItemValue.StringValue) {
                    eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, eventItemValue);
                } else {
                    eventItemsMap.set(SdkMetricStatEvent.VALUE_KEY, eventItemValue);
                }
            }
        }

        public final Builder addAll(EventItemsMap map) {
            addAll(map.getItems());
            return this;
        }

        public final SdkMetricStatEvent build() {
            return new SdkMetricStatEvent(wm9.X0(this.map.getItems()));
        }

        public final Builder set(String key, EventItemValue eventItemValue) {
            this.map.set(key, eventItemValue);
            return this;
        }

        public final Builder set(String key, String str) {
            this.map.set(key, str);
            return this;
        }

        public final Builder set(String key, Integer num) {
            this.map.set(key, num);
            return this;
        }

        public final Builder addAll(Map<String, ? extends EventItemValue> map) {
            this.map.addAll(map);
            return this;
        }

        public final Builder set(String key, Long l) {
            this.map.set(key, l);
            return this;
        }

        public final Builder set(String key, Float f) {
            this.map.set(key, f);
            return this;
        }
    }
}
