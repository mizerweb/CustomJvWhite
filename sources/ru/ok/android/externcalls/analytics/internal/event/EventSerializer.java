package ru.ok.android.externcalls.analytics.internal.event;

import defpackage.mv8;
import defpackage.ore;
import defpackage.x1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/event/EventSerializer;", "", "<init>", "()V", "Lmv8;", "writer", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "Lsbi;", "writeValue", "(Lmv8;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "Lru/ok/android/externcalls/analytics/events/EventItemValue$ArrStringValue;", "writeValue-iurDigI", "(Lmv8;Ljava/util/Collection;)V", "Lru/ok/android/externcalls/analytics/events/EventItemValue$MapStringStringValue;", "writeValue-4i0utlQ", "(Lmv8;Ljava/util/Map;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "serialize", "(Lmv8;Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
    }

    private final void writeValue(mv8 writer, EventItemValue value) {
        if (value instanceof EventItemValue.FloatValue) {
            Float fValueOf = Float.valueOf(((EventItemValue.FloatValue) value).m62unboximpl());
            x1 x1Var = (x1) writer;
            x1Var.getClass();
            x1Var.l(fValueOf.doubleValue());
            return;
        }
        if (value instanceof EventItemValue.IntValue) {
            ((x1) writer).y(((EventItemValue.IntValue) value).m69unboximpl());
            return;
        }
        if (value instanceof EventItemValue.LongValue) {
            long jM76unboximpl = ((EventItemValue.LongValue) value).m76unboximpl();
            x1 x1Var2 = (x1) writer;
            x1Var2.getClass();
            x1Var2.b(Long.toString(jM76unboximpl));
            return;
        }
        if (value instanceof EventItemValue.BooleanValue) {
            boolean zM55unboximpl = ((EventItemValue.BooleanValue) value).m55unboximpl();
            x1 x1Var3 = (x1) writer;
            x1Var3.getClass();
            x1Var3.b(String.valueOf(zM55unboximpl));
            return;
        }
        if (value instanceof EventItemValue.StringValue) {
            writer.p0(((EventItemValue.StringValue) value).m90unboximpl());
            return;
        }
        if (value instanceof EventItemValue.ArrStringValue) {
            m92writeValueiurDigI(writer, ((EventItemValue.ArrStringValue) value).getValue());
        } else if (value instanceof EventItemValue.MapStringStringValue) {
            m91writeValue4i0utlQ(writer, ((EventItemValue.MapStringStringValue) value).getValue());
        } else {
            ore.o();
        }
    }

    /* JADX INFO: renamed from: writeValue-4i0utlQ, reason: not valid java name */
    private final void m91writeValue4i0utlQ(mv8 writer, Map<String, ? extends String> value) {
        try {
            writer.p();
            for (Map.Entry<String, ? extends String> entry : value.entrySet()) {
                writer.a0(entry.getKey());
                writer.p0(entry.getValue());
            }
            writer.t();
        } catch (Throwable th) {
            writer.t();
            throw th;
        }
    }

    /* JADX INFO: renamed from: writeValue-iurDigI, reason: not valid java name */
    private final void m92writeValueiurDigI(mv8 writer, Collection<? extends String> value) {
        try {
            writer.r();
            Iterator<? extends String> it = value.iterator();
            while (it.hasNext()) {
                writer.p0(it.next());
            }
            writer.q();
        } catch (Throwable th) {
            writer.q();
            throw th;
        }
    }

    public final void serialize(mv8 writer, CallAnalyticsEvent event) {
        writer.p();
        for (Map.Entry<String, EventItemValue> entry : event.getItems().entrySet()) {
            writer.a0(entry.getKey());
            writeValue(writer, entry.getValue());
        }
        writer.t();
    }
}
