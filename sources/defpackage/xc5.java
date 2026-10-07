package defpackage;

import java.util.HashMap;
import java.util.Random;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class xc5 {
    public static final v25 h = new v25(2);
    public static final Random i = new Random();
    public g0a d;
    public String f;
    public final tsh a = new tsh();
    public final rsh b = new rsh();
    public final HashMap c = new HashMap();
    public ush e = ush.a;
    public long g = -1;

    public final void a(wc5 wc5Var) {
        if (wc5Var.c != -1 && wc5Var.e) {
            this.g = wc5Var.c;
        }
        this.f = null;
    }

    public final long b() {
        wc5 wc5Var = (wc5) this.c.get(this.f);
        return (wc5Var == null || wc5Var.c == -1) ? this.g + 1 : wc5Var.c;
    }

    public final wc5 c(int i2, x4a x4aVar) {
        HashMap map = this.c;
        wc5 wc5Var = null;
        long j = BuildConfig.MAX_TIME_TO_UPLOAD;
        for (wc5 wc5Var2 : map.values()) {
            wc5Var2.k(i2, x4aVar);
            if (wc5Var2.i(i2, x4aVar)) {
                long j2 = wc5Var2.c;
                if (j2 == -1 || j2 < j) {
                    wc5Var = wc5Var2;
                    j = j2;
                } else if (j2 == j) {
                    String str = vqi.a;
                    if (wc5Var.d != null && wc5Var2.d != null) {
                        wc5Var = wc5Var2;
                    }
                }
            }
        }
        if (wc5Var != null) {
            return wc5Var;
        }
        String str2 = (String) h.get();
        wc5 wc5Var3 = new wc5(this, str2, i2, x4aVar);
        map.put(str2, wc5Var3);
        return wc5Var3;
    }

    public final synchronized String d(ush ushVar, x4a x4aVar) {
        return c(ushVar.g(x4aVar.a, this.b).c, x4aVar).a;
    }

    public final void e(wf wfVar) {
        ush ushVar = wfVar.b;
        int i2 = wfVar.c;
        x4a x4aVar = wfVar.d;
        boolean zP = ushVar.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                wc5 wc5Var = (wc5) map.get(str);
                wc5Var.getClass();
                a(wc5Var);
                return;
            }
            return;
        }
        wc5 wc5Var2 = (wc5) map.get(str);
        this.f = c(i2, x4aVar).a;
        f(wfVar);
        if (x4aVar != null) {
            long j = x4aVar.d;
            if (x4aVar.b()) {
                if (wc5Var2 != null && wc5Var2.c == j && wc5Var2.d != null && wc5Var2.d.b == x4aVar.b && wc5Var2.d.c == x4aVar.c) {
                    return;
                }
                c(i2, new x4a(j, x4aVar.a));
                this.d.getClass();
            }
        }
    }

    public final synchronized void f(wf wfVar) {
        this.d.getClass();
        if (wfVar.b.p()) {
            return;
        }
        x4a x4aVar = wfVar.d;
        if (x4aVar != null) {
            long j = x4aVar.d;
            if (j != -1 && j < b()) {
                return;
            }
            wc5 wc5Var = (wc5) this.c.get(this.f);
            if (wc5Var != null && wc5Var.c == -1 && wc5Var.b != wfVar.c) {
                return;
            }
        }
        wc5 wc5VarC = c(wfVar.c, wfVar.d);
        if (this.f == null) {
            this.f = wc5VarC.a;
        }
        x4a x4aVar2 = wfVar.d;
        if (x4aVar2 != null && x4aVar2.b()) {
            x4a x4aVar3 = wfVar.d;
            wc5 wc5VarC2 = c(wfVar.c, new x4a(x4aVar3.a, x4aVar3.d, x4aVar3.b));
            if (!wc5VarC2.e) {
                wc5VarC2.e = true;
                wfVar.b.g(wfVar.d.a, this.b);
                Math.max(0L, vqi.p0(this.b.d(wfVar.d.b)) + vqi.p0(this.b.e));
                this.d.getClass();
            }
        }
        if (!wc5VarC.e) {
            wc5VarC.e = true;
            this.d.getClass();
        }
        if (wc5VarC.a.equals(this.f) && !wc5VarC.f) {
            wc5VarC.f = true;
            g0a g0aVar = this.d;
            String str = wc5VarC.a;
            g0aVar.getClass();
            x4a x4aVar4 = wfVar.d;
            if (x4aVar4 == null || !x4aVar4.b()) {
                g0aVar.b();
                g0aVar.j = str;
                g0aVar.k = e0a.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.3");
                g0aVar.c(wfVar.b, wfVar.d);
            }
        }
    }
}
