package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pt4 implements cf7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xf5 b;
    public final /* synthetic */ i64 c;

    public /* synthetic */ pt4(xf5 xf5Var, i64 i64Var) {
        this.b = xf5Var;
        this.c = i64Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        i64 i64Var = this.c;
        xf5 xf5Var = this.b;
        sbi sbiVar = sbi.a;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th == null) {
                    i64Var.Q(xf5Var.l());
                } else if (!(th instanceof CancellationException)) {
                    i64Var.j0(th);
                } else {
                    i64Var.r((CancellationException) th);
                }
                break;
            default:
                if (th == null) {
                    i64Var.Q(sbiVar);
                } else if (!(th instanceof CancellationException)) {
                    i64Var.j0(th);
                } else {
                    i64Var.r((CancellationException) th);
                }
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ pt4(xf5 xf5Var, i64 i64Var, u8h u8hVar) {
        this.b = xf5Var;
        this.c = i64Var;
    }
}
