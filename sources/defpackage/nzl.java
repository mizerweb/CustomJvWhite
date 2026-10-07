package defpackage;

import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nzl {
    public static k84 a(k84 k84Var, long j, long j2, long j3, boolean z, boolean z2) {
        s26 s26Var = (s26) ((t26) ((c98) k84Var.b).get(0)).a.get(0);
        by9 by9Var = new by9();
        by9Var.b(j);
        by9Var.a(j2);
        by9Var.e = z;
        cy9 cy9Var = new cy9(by9Var);
        ry9 ry9Var = s26Var.a;
        j36 j36Var = s26Var.f;
        ay9 ay9VarA = ry9Var.a();
        ay9VarA.d = cy9Var.a();
        ry9 ry9VarA = ay9VarA.a();
        if (z2) {
            j36Var = new j36(j36Var.a, ghe.e);
        }
        r26 r26VarA = s26Var.a();
        r26VarA.a = ry9VarA;
        lvb.R(j3 > 0);
        r26VarA.d = j3;
        r26VarA.f = j36Var;
        s26 s26Var2 = new s26(r26VarA);
        k84 k84VarC = k84Var.c();
        k84VarC.d(c98.r(new t26(new kzi(s26Var2))));
        return k84VarC.a();
    }

    public static we7 b(qxe qxeVar, String str) {
        gof gofVar = new gof();
        vxe vxeVarO0 = qxeVar.O0("PRAGMA table_info(`" + str + "`)");
        try {
            if (vxeVarO0.M0()) {
                int iN = qyj.n(vxeVarO0, SdkMetricStatEvent.NAME_KEY);
                do {
                    gofVar.add(vxeVarO0.B0(iN));
                } while (vxeVarO0.M0());
            }
            p90.f(vxeVarO0, null);
            gof gofVarE = p90.e(gofVar);
            vxe vxeVarO1 = qxeVar.O0("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String strB0 = vxeVarO1.M0() ? vxeVarO1.B0(qyj.n(vxeVarO1, "sql")) : "";
                p90.f(vxeVarO1, null);
                return new we7(str, gofVarE, yok.d(strB0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p90.f(vxeVarO1, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p90.f(vxeVarO0, th3);
                throw th4;
            }
        }
    }
}
