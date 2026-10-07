package defpackage;

import android.system.Os;
import android.system.OsConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bdk implements af7 {
    public final /* synthetic */ int a;

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        Object poeVar2;
        switch (this.a) {
            case 0:
                return "listenToBatteryCharge: detected battery charge, stop collecting";
            case 1:
                return "Cannot read proc file, fallback to Process.getElapsedCpuTime";
            case 2:
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                if (iAvailableProcessors < 1) {
                    iAvailableProcessors = 1;
                }
                return Integer.valueOf(iAvailableProcessors);
            case 3:
                try {
                    poeVar = Double.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object objValueOf = Double.valueOf(100.0d);
                if (poeVar instanceof poe) {
                    poeVar = objValueOf;
                }
                return Double.valueOf(((Number) poeVar).doubleValue());
            case 4:
                return new xhk();
            case 5:
                return "crutch: onActivityResumed calls notifyForeground";
            case 6:
                return "Retrieved snapshot via TrafficStats only";
            case 7:
                return "Fallback on unknown";
            case 8:
                return "Failed to read network counters via TrafficStats";
            case 9:
                return "Failed to read network counters via HealthStats";
            default:
                try {
                    poeVar2 = Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
                    break;
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                if (poeVar2 instanceof poe) {
                    poeVar2 = 100L;
                }
                return Long.valueOf(((Number) poeVar2).longValue());
        }
    }
}
