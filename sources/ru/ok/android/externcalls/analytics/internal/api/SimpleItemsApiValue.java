package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.mv8;
import defpackage.u21;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class SimpleItemsApiValue extends u21 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    @Override // defpackage.u21
    public void write(mv8 mv8Var) throws JsonSerializeException, IOException {
        mv8Var.r();
        Iterator<CallAnalyticsEvent> it = this.items.iterator();
        while (it.hasNext()) {
            EventSerializer.INSTANCE.serialize(mv8Var, it.next());
        }
        mv8Var.q();
    }
}
