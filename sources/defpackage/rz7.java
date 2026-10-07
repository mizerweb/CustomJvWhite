package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class rz7 implements ou {
    public sgg a;
    public final /* synthetic */ tz7 b;

    public rz7(tz7 tz7Var) {
        this.b = tz7Var;
    }

    @Override // defpackage.ou
    public final void h(long j) {
        sgg sggVar = this.a;
        if (sggVar == null || !sggVar.isActive()) {
            tz7 tz7Var = this.b;
            this.a = yab.i0(cqk.a(((n0c) ((xhh) tz7Var.e.getValue())).a()), null, 0, new t20(tz7Var, null, 18), 3);
        }
    }

    @Override // defpackage.ou
    public final void w(long j) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.a;
        if (sggVar != null) {
            sggVar.b(null);
        }
    }
}
