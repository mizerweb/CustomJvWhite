package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class xyj {
    public static final a8g l;
    public static final /* synthetic */ zv8[] m;
    public static final String n;
    public static final String[] o;
    public final Context a;
    public final gu4 b;
    public final xhh c;
    public final e5d d;
    public final ha9 e;
    public final ny8 f;
    public final Set g = a.p1(new String[]{"ru.ok.tamtam.", "ru.ok.messages.", "one.me."});
    public final p3c h = qyj.S();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ny8 j = rx8.P(1, new xlf(9, this));
    public volatile int k = 999;

    static {
        z8b z8bVar = new z8b(xyj.class, "countCheckingJob", "getCountCheckingJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
        l = new a8g(26);
        n = xyj.class.getName();
        o = new String[]{"TaskTimeChangeWorker"};
    }

    public xyj(Context context, gu4 gu4Var, xhh xhhVar, ny8 ny8Var, e5d e5dVar, ha9 ha9Var) {
        this.a = context;
        this.b = gu4Var;
        this.c = xhhVar;
        this.d = e5dVar;
        this.e = ha9Var;
        this.f = ny8Var;
        yab.i0(gu4Var, null, 0, new t7f(this, null, 8), 3);
    }

    public static v6g e(xyj xyjVar, String str, int i, gsc gscVar, int i2) {
        ve6 ve6Var;
        boolean z = (i2 & 16) == 0;
        if (xyjVar.k < xyjVar.f()) {
            gm0.m(n, "enqueueUniquePeriodicWork %s", str);
            xyjVar.k++;
            xyjVar.h().c(str, i, gscVar);
            return new v6g(false);
        }
        gm0.W(n, "enqueueUniquePeriodicWork: put %s in backlog", str);
        int iD = qt4.D(i);
        if (iD == 0) {
            ve6Var = ve6.a;
        } else if (iD == 1) {
            ve6Var = ve6.b;
        } else if (iD == 2) {
            ve6Var = ve6.c;
        } else {
            if (iD != 3) {
                ore.o();
                return null;
            }
            ve6Var = ve6.d;
        }
        vzj vzjVar = new vzj(str, ve6Var, gscVar);
        xyjVar.a(vzjVar, z);
        oyj oyjVarH = xyjVar.h();
        int iIntValue = ((Number) xyjVar.d.j0.a(e5d.S6[59]).i()).intValue();
        if (iIntValue < 1) {
            iIntValue = 1;
        }
        vd7.L(oyjVarH, Integer.valueOf(iIntValue), xyjVar.e, vzjVar).N();
        return new v6g(true);
    }

    public final void a(vzj vzjVar, boolean z) {
        if (z || cqk.d(Looper.getMainLooper(), Looper.myLooper())) {
            yab.i0(this.b, ((n0c) this.c).b(), 0, new y73(this, vzjVar, null, 21), 2);
        } else {
            try {
                g().insert(vzjVar);
            } catch (Throwable th) {
                gm0.X(n, th, "fail to add item %s", vzjVar.b);
            }
        }
    }

    public final n19 b(String str, ve6 ve6Var, cdc cdcVar) {
        if (this.k >= f()) {
            gm0.W(n, "beginUniqueWork: put %s in backlog", str);
            vzj vzjVar = new vzj(str, ve6Var, cdcVar);
            a(vzjVar, false);
            oyj oyjVarH = h();
            int iIntValue = ((Number) this.d.j0.a(e5d.S6[59]).i()).intValue();
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            return new n19(true, vd7.L(oyjVarH, Integer.valueOf(iIntValue), this.e, vzjVar));
        }
        gm0.m(n, "beginUniqueWork %s", str);
        this.k++;
        oyj oyjVarH2 = h();
        oyjVarH2.getClass();
        List listSingletonList = Collections.singletonList(cdcVar);
        if (!listSingletonList.isEmpty()) {
            return new n19(false, new cyj(oyjVarH2, str, ve6Var, listSingletonList, 0));
        }
        ore.p("beginUniqueWork needs at least one OneTimeWorkRequest.");
        return null;
    }

    public final void c(String str) {
        gm0.m(n, "cancelAllWorkByTag %s", str);
        oyj oyjVarH = h();
        lvb.v0(oyjVarH.b.m, "CancelWorkByTag_".concat(str), oyjVarH.d.a, new yj2(oyjVarH, str));
    }

    public final void d(String str) {
        gm0.m(n, "cancelUniqueWork %s", str);
        oyj oyjVarH = h();
        lvb.v0(oyjVarH.b.m, "CancelWorkByName_".concat(str), oyjVarH.d.a, new yj2(str, oyjVarH));
    }

    public final int f() {
        e5d e5dVar = this.d;
        b5d b5dVar = e5dVar.g0;
        zv8[] zv8VarArr = e5d.S6;
        int iIntValue = ((Number) b5dVar.a(zv8VarArr[56]).i()).intValue();
        if (iIntValue < 1) {
            iIntValue = 1;
        }
        int iIntValue2 = ((Number) e5dVar.k0.a(zv8VarArr[60]).i()).intValue();
        if (iIntValue2 < 0) {
            iIntValue2 = 0;
        }
        int i = iIntValue - iIntValue2;
        if (i < 1) {
            return 1;
        }
        return i;
    }

    public final WorkersQueueDao g() {
        return (WorkersQueueDao) this.f.getValue();
    }

    public final oyj h() {
        return (oyj) this.j.getValue();
    }
}
