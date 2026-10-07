package defpackage;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* JADX INFO: loaded from: classes3.dex */
public interface fi1 {
    static /* synthetic */ void a(fi1 fi1Var, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i) {
        if ((i & 2) != 0) {
            eventItemValue = null;
        }
        if ((i & 4) != 0) {
            eventItemsMap = new EventItemsMap();
        }
        ((gi1) fi1Var).d(str, eventItemValue, eventItemsMap);
    }
}
