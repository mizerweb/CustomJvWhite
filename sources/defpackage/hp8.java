package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class hp8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp8 b;

    public /* synthetic */ hp8(jp8 jp8Var, int i) {
        this.a = i;
        this.b = jp8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p76 p76Var;
        int i;
        switch (this.a) {
            case 0:
                jp8 jp8Var = this.b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                synchronized (jp8Var) {
                    p76Var = jp8Var.e;
                    i = jp8Var.f;
                    jp8Var.e = null;
                    jp8Var.f = 0;
                    jp8Var.g = 3;
                    jp8Var.i = jUptimeMillis;
                    break;
                }
                try {
                    if (jp8.c(p76Var, i)) {
                        jp8Var.b.b(p76Var, i);
                        break;
                    }
                    return;
                } finally {
                    p76.g(p76Var);
                    jp8Var.a();
                }
            default:
                jp8 jp8Var2 = this.b;
                jp8Var2.a.execute(jp8Var2.c);
                return;
        }
    }
}
