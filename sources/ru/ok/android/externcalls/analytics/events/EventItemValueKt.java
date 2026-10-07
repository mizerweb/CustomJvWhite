package ru.ok.android.externcalls.analytics.events;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\u0010\u001e\n\u0002\u0010$\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007¨\u0006\b"}, d2 = {"toEventItemValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "", "", "", "", "", "calls-sdk-analytics"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class EventItemValueKt {
    public static final EventItemValue toEventItemValue(String str) {
        return EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str));
    }

    public static final EventItemValue toEventItemValue(int i) {
        return EventItemValue.IntValue.m63boximpl(EventItemValue.IntValue.m64constructorimpl(i));
    }

    public static final EventItemValue toEventItemValue(long j) {
        return EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(j));
    }

    public static final EventItemValue toEventItemValue(float f) {
        return EventItemValue.FloatValue.m56boximpl(EventItemValue.FloatValue.m57constructorimpl(f));
    }

    public static final EventItemValue toEventItemValue(Collection<String> collection) {
        return EventItemValue.ArrStringValue.m42boximpl(EventItemValue.ArrStringValue.m43constructorimpl(collection));
    }

    public static final EventItemValue toEventItemValue(Map<String, String> map) {
        return EventItemValue.MapStringStringValue.m77boximpl(EventItemValue.MapStringStringValue.m78constructorimpl(map));
    }
}
