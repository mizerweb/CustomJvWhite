package ru.ok.android.externcalls.analytics.events;

import defpackage.qv1;
import defpackage.skd;
import defpackage.wm9;
import defpackage.ww3;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB\u001d\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\r\u001a\u00020\u0004H\u0096\u0080\u0004R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent;", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", CallAnalyticsApiRequest.KEY_ITEMS, "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "<init>", "(Ljava/util/Map;)V", "getItems", "()Ljava/util/Map;", "apiMethodName", "getApiMethodName", "()Ljava/lang/String;", "toString", "Builder", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SdkIntervalStatEvent extends CallAnalyticsEvent {
    private final String apiMethodName = "vchat.clientStats";
    private final Map<String, EventItemValue> items;

    /* JADX WARN: Multi-variable type inference failed */
    public SdkIntervalStatEvent(Map<String, ? extends EventItemValue> map) {
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
        return qv1.l("SdkIntervalStatEvent apiMethod=", getApiMethodName(), " ", ww3.z1(getItems().entrySet(), ", ", null, null, new skd(25), 30));
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002J\u001b\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002J \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0086\u0002¢\u0006\u0002\u0010\fJ \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0086\u0002¢\u0006\u0002\u0010\u000eJ \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0086\u0002¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0013J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "<init>", "()V", "map", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "set", "key", "", SdkMetricStatEvent.VALUE_KEY, "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent$Builder;", "addAll", CallAnalyticsApiRequest.KEY_ITEMS, "", "build", "Lru/ok/android/externcalls/analytics/events/SdkIntervalStatEvent;", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        private final EventItemsMap map = new EventItemsMap();

        public final Builder addAll(EventItemsMap map) {
            addAll(map.getItems());
            return this;
        }

        public final SdkIntervalStatEvent build() {
            return new SdkIntervalStatEvent(wm9.X0(this.map.getItems()));
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
