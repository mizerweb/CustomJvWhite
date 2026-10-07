package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zs5 extends xtj {
    public final j71 e;
    public final Executor f;
    public final x71 g;

    public zs5(j71 j71Var, Executor executor, x71 x71Var) {
        super(j71Var, executor);
        this.e = j71Var;
        this.f = executor;
        this.g = x71Var;
    }

    @Override // defpackage.xtj
    public final ys5 r(ss5 ss5Var) {
        x71 x71Var = this.g;
        if (x71Var == null) {
            ore.o();
            return null;
        }
        long j = x71Var.c;
        long j2 = x71Var.b;
        Uri uri = ss5Var.b;
        List list = ss5Var.d;
        int iN = vqi.N(uri, ss5Var.c);
        Executor executor = this.f;
        j71 j71Var = this.e;
        if (iN == 0) {
            h15 h15Var = new h15(j71Var);
            h15Var.b = new p15();
            h15Var.c = executor;
            h15Var.d = j2;
            h15Var.e = j - j2;
            ay9 ay9Var = new ay9();
            ay9Var.b = uri;
            ay9Var.b(list);
            return new i15(ay9Var.a(), h15Var.b, h15Var.a, h15Var.c, h15Var.d, h15Var.e);
        }
        if (iN != 2) {
            return super.r(ss5Var);
        }
        fx7 fx7Var = new fx7(j71Var);
        fx7Var.b = new yx7();
        fx7Var.c = executor;
        fx7Var.d = j2;
        fx7Var.e = j - j2;
        ay9 ay9Var2 = new ay9();
        ay9Var2.b = uri;
        ay9Var2.b(list);
        return new gx7(ay9Var2.a(), fx7Var.b, fx7Var.a, fx7Var.c, fx7Var.d, fx7Var.e);
    }
}
