package defpackage;

import java.util.Arrays;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class cf4 {
    public final jb1 a;
    public final CidLogger b;
    public final bf4 c;
    public double e;
    public volatile boolean i;
    public volatile boolean j;
    public final uw d = new uw(1);
    public final yi9 f = new yi9();
    public double g = 1.0d;
    public final ex8 h = new ex8(29);

    public cf4(jb1 jb1Var, CidLogger cidLogger, bf4 bf4Var) {
        this.a = jb1Var;
        this.b = cidLogger;
        this.c = bf4Var;
        cidLogger.log("CallAnalyticsLoggerConnectivityTracker", "Configuration: " + bf4Var);
    }

    public final void a() {
        if (this.i && this.j) {
            double d = this.g;
            bf4 bf4Var = this.c;
            if (d <= bf4Var.b && this.e >= bf4Var.c) {
                if (this.a.c) {
                    b("Already enabled");
                } else {
                    b("Enable upload analytics");
                }
                jb1 jb1Var = this.a;
                if (jb1Var.c) {
                    return;
                }
                jb1Var.c = true;
                ((CallAnalyticsSender) jb1Var.d).setIdle(true, !jb1Var.b);
                return;
            }
        }
        if (this.a.c) {
            b("Disable upload analytics");
        } else {
            b("Already disabled");
        }
        jb1 jb1Var2 = this.a;
        if (jb1Var2.c) {
            jb1Var2.c = false;
            CallAnalyticsSender callAnalyticsSender = (CallAnalyticsSender) jb1Var2.d;
            boolean z = jb1Var2.b;
            callAnalyticsSender.setIdle(z, !z);
        }
    }

    public final void b(String str) {
        CidLogger cidLogger = this.b;
        boolean z = this.i;
        boolean z2 = this.j;
        String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.e)}, 1));
        String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.g)}, 1));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": signaling_connected=");
        sb.append(z);
        sb.append(", pc_connected=");
        sb.append(z2);
        cidLogger.log("CallAnalyticsLoggerConnectivityTracker", nbh.y(sb, ", bitrate=", str2, ", loss=", str3));
    }
}
