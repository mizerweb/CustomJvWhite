package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hz8 implements wd4 {
    public final de4 a;
    public final /* synthetic */ h5 b;

    public hz8(h5 h5Var, Context context, ExecutorService executorService, iz8 iz8Var, ifh ifhVar, ny8 ny8Var) {
        this.b = h5Var;
        this.a = new de4(context, executorService, iz8Var, ifhVar, ny8Var);
    }

    @Override // defpackage.wd4
    public final we4 a() {
        return this.a.a();
    }

    @Override // defpackage.wd4
    public final long b() {
        return this.a.l;
    }

    @Override // defpackage.wd4
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.wd4
    public final boolean d() {
        if (this.a.d()) {
            return true;
        }
        ((wxb) this.b.c(82)).getClass();
        return false;
    }

    @Override // defpackage.wd4
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.wd4
    public final void f(vd4 vd4Var) {
        this.a.f(vd4Var);
    }

    @Override // defpackage.wd4
    public final void g(vd4 vd4Var) {
        this.a.g(vd4Var);
    }

    @Override // defpackage.wd4
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.wd4
    public final void invalidate() {
        this.a.invalidate();
    }
}
