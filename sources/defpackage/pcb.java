package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;

/* JADX INFO: loaded from: classes2.dex */
public final class pcb {
    public final Context a;
    public final String b = pcb.class.getName();
    public final ifh c = new ifh(new iua(7, this));

    public pcb(Context context) {
        this.a = context;
    }

    public static long b(HealthStats healthStats, int i) {
        if (healthStats.hasMeasurement(i)) {
            return healthStats.getMeasurement(i);
        }
        return 0L;
    }

    public final mcb a() {
        Object poeVar;
        Object poeVar2;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        try {
            HealthStats healthStatsTakeMyUidSnapshot = ((SystemHealthManager) this.c.getValue()).takeMyUidSnapshot();
            poeVar = new ncb(new ocb(b(healthStatsTakeMyUidSnapshot, 10048), b(healthStatsTakeMyUidSnapshot, 10049), b(healthStatsTakeMyUidSnapshot, 10024)), new ocb(b(healthStatsTakeMyUidSnapshot, 10050), b(healthStatsTakeMyUidSnapshot, 10051), b(healthStatsTakeMyUidSnapshot, 10016)));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Failed to read network counters via HealthStats", thA);
            }
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        ncb ncbVar = (ncb) poeVar;
        try {
            int i = this.a.getApplicationInfo().uid;
            long uidRxBytes = TrafficStats.getUidRxBytes(i);
            long j = 0;
            if (uidRxBytes < 0) {
                uidRxBytes = 0;
            }
            long uidTxBytes = TrafficStats.getUidTxBytes(i);
            if (uidTxBytes >= 0) {
                j = uidTxBytes;
            }
            poeVar2 = new ncb(new ocb(uidRxBytes, j, 0L), new ocb(0L, 0L, 0L));
        } catch (Throwable th2) {
            poeVar2 = new poe(th2);
        }
        Throwable thA2 = roe.a(poeVar2);
        if (thA2 != null) {
            String str2 = this.b;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "Failed to read network counters via TrafficStats", thA2);
            }
        }
        if (poeVar2 instanceof poe) {
            poeVar2 = null;
        }
        ncb ncbVar2 = (ncb) poeVar2;
        String str3 = this.b;
        if (ncbVar != null) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str3, qv1.m("Retrieved snapshot via HealthStats (trafficStats also captured: ", ")", ncbVar2 != null), null);
            }
        } else if (ncbVar2 != null) {
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str3, "Retrieved snapshot via TrafficStats only", null);
            }
        } else {
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, str3, "Fallback on unknown", null);
            }
        }
        return new mcb(ncbVar, ncbVar2);
    }
}
