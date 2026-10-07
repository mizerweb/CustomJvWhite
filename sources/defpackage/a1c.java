package defpackage;

import android.os.Handler;
import android.os.Looper;
import one.me.sdk.database.DbCorruptionException;

/* JADX INFO: loaded from: classes.dex */
public final class a1c {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public a1c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    public final zed a() {
        return (zed) this.a.getValue();
    }

    public final void b(int i) throws DbCorruptionException {
        je9 je9Var = je9.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "DbCorruptionListener", "onCorruption: start ".concat(x05.o(i)), null);
        }
        ((wxb) this.d.getValue()).getClass();
        ((wxb) this.d.getValue()).getClass();
        ((wxb) this.d.getValue()).getClass();
        if (qt4.d(i, 2) >= 0) {
            a55 a55VarA = a55.a(((Number) a().b.d().i()).intValue());
            DbCorruptionException dbCorruptionException = new DbCorruptionException("corruptionLevel=".concat(x05.o(i)), null, 2, null);
            if (a55VarA.compareTo(a55.DEV_OPTIONS_MENU) >= 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new DbCorruptionException("fatal exception", dbCorruptionException);
                }
                handler.postAtFrontOfQueue(new rda(5, dbCorruptionException));
            } else {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "DbCorruptionListener", "db corrupt ".concat(x05.o(i)), dbCorruptionException);
                }
            }
        }
        if (qt4.d(i, 2) < 0 || !((Boolean) a().b.F6.a(e5d.S6[398]).i()).booleanValue()) {
            String strC = ((svb) this.b.getValue()).c();
            if (strC == null || r5h.X0(strC)) {
                gm0.Y("DbCorruptionListener", "onCorruption: stop");
                return;
            }
            long jT = a().a.t();
            xb9 xb9Var = a().a;
            gvb gvbVar = xb9Var.l0;
            zv8[] zv8VarArr = xb9.g1;
            String str = (String) gvbVar.m(xb9Var, zv8VarArr[0]);
            String strV = a().a.V();
            a().a();
            a().a.N(jT);
            xb9 xb9Var2 = a().a;
            xb9Var2.l0.B(xb9Var2, zv8VarArr[0], str);
            a().a.l0(strV);
            ((svb) this.b.getValue()).e(strC);
            ((mih) this.c.getValue()).h();
        } else {
            ((svb) this.b.getValue()).d(true);
        }
        gm0.Y("DbCorruptionListener", "onCorruption: finish");
    }
}
