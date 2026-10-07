package defpackage;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dmk extends eo7 {
    public static final v2a k = new v2a("ModuleInstall.API", new lkk(2), new xvc(14));
    public static final v2a l = new v2a("LocationServices.API", new lkk(4), new xvc(14));
    public static final v2a m = new v2a("SmsRetriever.API", new lkk(3), new xvc(14));
    public static int n = 1;

    public kam c(ygc... ygcVarArr) {
        yab.n("Please provide at least one OptionalModuleApi.", ygcVarArr.length > 0);
        for (ygc ygcVar : ygcVarArr) {
            yab.t(ygcVar, "Requested API must not be null.");
        }
        hp hpVarB = hp.b(Arrays.asList(ygcVarArr), false);
        if (hpVarB.a.isEmpty()) {
            return gwl.e(new a1b(true, 0));
        }
        dc5 dc5Var = new dc5();
        dc5Var.d = new do6[]{tqk.a};
        dc5Var.b = 27301;
        dc5Var.a = false;
        eth ethVar = new eth();
        ethVar.a = hpVarB;
        dc5Var.c = ethVar;
        return b(0, dc5Var.a());
    }

    public synchronized int d() {
        try {
            if (n == 1) {
                Context context = this.a;
                fo7 fo7Var = fo7.d;
                int iC = fo7Var.c(context, 12451000);
                if (iC == 0) {
                    n = 4;
                } else if (fo7Var.b(iC, context, null) != null || rx5.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    n = 2;
                } else {
                    n = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return n;
    }
}
