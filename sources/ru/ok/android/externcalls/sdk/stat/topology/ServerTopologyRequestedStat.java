package ru.ok.android.externcalls.sdk.stat.topology;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.bwh;
import defpackage.cwh;
import defpackage.esh;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.gsh;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/topology/ServerTopologyRequestedStat;", "", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "Lesh;", "timeProvider", "<init>", "(Laf7;Lesh;)V", "Lcwh;", "event", "Lsbi;", "onServerTopologyRequested", "(Lcwh;)V", "Laf7;", "Lesh;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ServerTopologyRequestedStat {
    private final af7 getEventualStatSender;
    private final esh timeProvider;

    public ServerTopologyRequestedStat(af7 af7Var, esh eshVar) {
        this.getEventualStatSender = af7Var;
        this.timeProvider = eshVar;
    }

    public final void onServerTopologyRequested(cwh event) {
        long j;
        long j2;
        if (event instanceof bwh) {
            ((gsh) this.timeProvider).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bwh bwhVar = (bwh) event;
            switch (bwhVar.b) {
                case 0:
                    j2 = bwhVar.c;
                    break;
                case 1:
                    j2 = bwhVar.c;
                    break;
                case 2:
                    j2 = bwhVar.c;
                    break;
                default:
                    j2 = bwhVar.c;
                    break;
            }
            j = jElapsedRealtime - j2;
        } else {
            j = 0;
        }
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(j);
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, event.a.a);
            ((gi1) fi1Var).d("client_requested_server_topology", eventItemValue, eventItemsMap);
        }
    }
}
