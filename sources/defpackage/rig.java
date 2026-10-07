package defpackage;

import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class rig implements bkg {
    public final yig a;
    public final y3e b;
    public final boolean c;
    public x36 d;
    public double e;
    public final yi9 f;
    public BigInteger g;
    public BigInteger h;
    public final ex8 i;
    public final CopyOnWriteArrayList j;

    public rig(yig yigVar, CidLogger cidLogger, boolean z) {
        yigVar.getClass();
        cidLogger.getClass();
        this.a = yigVar;
        this.b = cidLogger;
        this.c = z;
        this.f = new yi9();
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new ex8(29);
        this.j = new CopyOnWriteArrayList();
        yigVar.a(this, 5L, TimeUnit.SECONDS);
    }

    @Override // defpackage.bkg
    public final void a(a4e a4eVar) {
        double d;
        Double d2;
        ex8 ex8Var = this.i;
        List list = a4eVar.b;
        list.getClass();
        boolean zT = ex8Var.T(list);
        Object obj = null;
        if (zT) {
            this.d = null;
            this.e = 0.0d;
            BigInteger bigInteger = BigInteger.ZERO;
            this.g = bigInteger;
            this.h = bigInteger;
            yi9 yi9Var = this.f;
            yi9Var.a = 0L;
            yi9Var.b = 0L;
        }
        pk2 pk2VarC = a4eVar.c();
        if (pk2VarC != null && (d2 = pk2VarC.h) != null) {
            double dDoubleValue = d2.doubleValue();
            x36 x36Var = this.d;
            if (x36Var != null) {
                x36Var.a(dDoubleValue);
            } else {
                this.d = new x36(dDoubleValue);
            }
        }
        List<fgg> list2 = a4eVar.b;
        ArrayList arrayList = new ArrayList(list2.size() / 2);
        for (fgg fggVar : list2) {
            if (fggVar.b == 2 && fggVar.a == 2) {
                arrayList.add((egg) fggVar);
            }
        }
        for (Object obj2 : arrayList) {
            if (cqk.d(((cgg) obj2).n, Boolean.FALSE)) {
                obj = obj2;
                break;
            }
        }
        egg eggVar = (egg) ((cgg) obj);
        if (eggVar != null) {
            yi9 yi9Var2 = this.f;
            y3e y3eVar = this.b;
            BigInteger bigInteger2 = eggVar.h;
            BigInteger bigInteger3 = eggVar.i;
            if (bigInteger2 == null || bigInteger3 == null) {
                d = 0.0d;
                this.e = 0.0d;
                y3eVar.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (this.c) {
                    this.e = yi9Var2.a(bigInteger3.longValue(), bigInteger2.longValue());
                    long j = yi9Var2.d;
                    long j2 = yi9Var2.c;
                    StringBuilder sb = new StringBuilder("Sent stats: sent=");
                    sb.append(j);
                    sb.append(" (total=");
                    sb.append(bigInteger2);
                    qt4.z(j2, "), lost=", " (total=", sb);
                    sb.append(bigInteger3);
                    sb.append(")");
                    y3eVar.log("MediaAdaptation", sb.toString());
                    y3eVar.log("MediaAdaptation", "Lost packets fraction updated to " + this.e);
                } else {
                    if (bigInteger2.compareTo(this.g) < 0) {
                        this.g = bigInteger2;
                    }
                    if (bigInteger3.compareTo(this.h) < 0) {
                        this.h = bigInteger3;
                    }
                    BigInteger bigInteger4 = this.h;
                    bigInteger4.getClass();
                    BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger4);
                    bigIntegerSubtract.getClass();
                    BigInteger bigInteger5 = this.g;
                    bigInteger5.getClass();
                    BigInteger bigIntegerSubtract2 = bigInteger2.subtract(bigInteger5);
                    bigIntegerSubtract2.getClass();
                    y3eVar.log("MediaAdaptation", "Sent stats: sent=" + bigIntegerSubtract2 + " (total=" + bigInteger2 + "), lost=" + bigIntegerSubtract + " (total=" + bigInteger3 + ")");
                    BigInteger bigInteger6 = BigInteger.ZERO;
                    double dDoubleValue2 = (bigIntegerSubtract2.compareTo(bigInteger6) <= 0 || bigIntegerSubtract.compareTo(bigInteger6) <= 0) ? 0.0d : bigIntegerSubtract.doubleValue() / bigIntegerSubtract2.doubleValue();
                    this.e = dDoubleValue2;
                    y3eVar.log("MediaAdaptation", "Lost packets fraction updated to " + dDoubleValue2);
                    this.g = bigInteger2;
                    this.h = bigInteger3;
                }
                d = 0.0d;
            }
        } else {
            d = 0.0d;
        }
        if (this.j.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        x36 x36Var2 = this.d;
        if (x36Var2 != null) {
            d = x36Var2.b;
        }
        bq9 bq9Var = new bq9(d, this.e);
        for (gq9 gq9Var : this.j) {
            esh eshVar = gq9Var.b;
            y3e y3eVar2 = gq9Var.c;
            double d3 = bq9Var.b;
            double d4 = bq9Var.a;
            cq9 cq9Var = gq9Var.e.a;
            if ((d4 <= 120.0d && d3 >= 0.04d) || ((d4 > 120.0d && d3 >= 0.04d) || d4 >= 1000.0d)) {
                y3eVar2.log("MediaAdaptation", "Bad network detected. Current condition is " + mw7.n(gq9Var.g) + ", state is " + bq9Var);
                int i = 3;
                if (d4 < 1000.0d) {
                    int i2 = gq9Var.g;
                    i = (i2 != 3 || d4 < 700.0d) ? 2 : i2;
                }
                ((gsh) eshVar).getClass();
                gq9Var.d = SystemClock.elapsedRealtime();
                if (gq9Var.g != i) {
                    gq9Var.b(i, bq9Var);
                }
            } else if ((d4 >= 90.0d || d3 > 0.02d) && (d4 >= 700.0d || d3 > 0.02d)) {
                y3eVar2.log("MediaAdaptation", "Ignore inbound state update " + bq9Var);
            } else {
                y3eVar2.log("MediaAdaptation", "Good network detected. Current condition is " + mw7.n(gq9Var.g) + ", state is " + bq9Var);
                ((gsh) eshVar).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - gq9Var.d;
                if (jElapsedRealtime <= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    y3eVar2.log("MediaAdaptation", nbh.s(jElapsedRealtime, "Good network detected. Do not update to good networks state because of ", " < 30000"));
                } else if (gq9Var.g != 1) {
                    y3eVar2.log("MediaAdaptation", "Good network detected. Reconfigure to good network mode. Timeout " + jElapsedRealtime);
                    gq9Var.b(1, bq9Var);
                }
            }
        }
    }
}
