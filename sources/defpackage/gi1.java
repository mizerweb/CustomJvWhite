package defpackage;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class gi1 implements fi1, dwh {
    public static final List i = Collections.singletonList(RttRateHintConfig.RTT);
    public final CallAnalyticsSender a;
    public final esh b;
    public final zfh c;
    public final vn7 d;
    public final ih e;
    public final CidLogger f;
    public EventItemsMap g;
    public final ArrayList h;

    public gi1(CallAnalyticsSender callAnalyticsSender, esh eshVar, zfh zfhVar, vn7 vn7Var, ih ihVar, CidLogger cidLogger) {
        callAnalyticsSender.getClass();
        eshVar.getClass();
        this.a = callAnalyticsSender;
        this.b = eshVar;
        this.c = zfhVar;
        this.d = vn7Var;
        this.e = ihVar;
        this.f = cidLogger;
        this.h = new ArrayList();
    }

    public final void b(vhk vhkVar, EventItemsMap eventItemsMap) {
        Long lValueOf;
        EventItemsMap eventItemsMap2 = vhkVar.c;
        eventItemsMap2.addAll(eventItemsMap);
        cth cthVar = vhkVar.d;
        cthVar.getClass();
        long jLongValue = cthVar.a;
        esh eshVar = this.b;
        eshVar.getClass();
        int i2 = bth.$EnumSwitchMapping$0[qt4.D(cthVar.b)];
        if (i2 != 1) {
            lValueOf = null;
            if (i2 == 2) {
                Long lA = ((gsh) eshVar).a();
                if (lA != null) {
                    lValueOf = Long.valueOf(lA.longValue() - Clock.systemUTC().millis());
                }
            } else if (i2 != 3) {
                ore.o();
                return;
            } else {
                Long lA2 = ((gsh) eshVar).a();
                if (lA2 != null) {
                    lValueOf = Long.valueOf(lA2.longValue() - System.currentTimeMillis());
                }
            }
        } else {
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        }
        this.a.send(new SdkMetricStatEvent.Builder(vhkVar.a, vhkVar.b).addAll(eventItemsMap2.getItems()).set("timestamp", Long.valueOf(jLongValue)).build());
    }

    public final void c(EventItemsMap eventItemsMap) {
        List listT1;
        synchronized (this.h) {
            listT1 = ww3.T1(this.h);
            this.h.clear();
        }
        Iterator it = listT1.iterator();
        while (it.hasNext()) {
            b((vhk) it.next(), eventItemsMap);
        }
    }

    public final void d(String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        str.getClass();
        eventItemsMap.getClass();
        e(((gsh) this.b).c(), str, eventItemValue, eventItemsMap);
    }

    public final void e(cth cthVar, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
        str.getClass();
        cthVar.getClass();
        eventItemsMap.getClass();
        this.f.log("CallEventualStatSenderImpl", "Event saved " + str + ", value " + eventItemValue + ", additional " + eventItemsMap);
        vhk vhkVar = new vhk(cthVar, str, eventItemValue, eventItemsMap);
        EventItemsMap eventItemsMap2 = this.g;
        if (eventItemsMap2 != null) {
            b(vhkVar, eventItemsMap2);
            return;
        }
        synchronized (this.h) {
            this.h.add(vhkVar);
        }
    }

    @Override // defpackage.dwh
    public final void onTopologyUpdated(zvh zvhVar, zvh zvhVar2) {
        zvhVar.getClass();
        zvhVar2.getClass();
        EventItemsMap eventItemsMap = this.g;
        ih ihVar = this.e;
        vn7 vn7Var = this.d;
        zfh zfhVar = this.c;
        if (eventItemsMap != null) {
            zfhVar.b(eventItemsMap);
            vn7Var.h(eventItemsMap);
            ihVar.q(eventItemsMap);
        } else {
            eventItemsMap = new EventItemsMap();
            zfhVar.b(eventItemsMap);
            vn7Var.h(eventItemsMap);
            ihVar.q(eventItemsMap);
            c(eventItemsMap);
        }
        this.g = eventItemsMap;
    }
}
