package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "", "<init>", "()V", CallAnalyticsApiRequest.KEY_ITEMS, "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "getItems", "()Ljava/util/Map;", "apiMethodName", "getApiMethodName", "()Ljava/lang/String;", "collector", "getCollector", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CallAnalyticsEvent {
    private final String collector;

    public abstract String getApiMethodName();

    public String getCollector() {
        return this.collector;
    }

    public abstract Map<String, EventItemValue> getItems();
}
