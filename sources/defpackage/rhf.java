package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class rhf implements rye {
    public final rye a;
    public final int b;
    public long c;
    public final /* synthetic */ shf d;

    public rhf(shf shfVar, rye ryeVar, int i) {
        this.d = shfVar;
        this.a = ryeVar;
        this.b = i;
    }

    @Override // defpackage.rye
    public final u55 a() {
        return this.a.a();
    }

    @Override // defpackage.rye
    public final boolean c() {
        rye ryeVar = this.a;
        u55 u55VarA = ryeVar.a();
        u55VarA.getClass();
        if (u55VarA.d(4)) {
            shf shfVar = this.d;
            shfVar.k.decrementAndGet();
            if (!shfVar.j()) {
                if (this.b == 1 && shfVar.p) {
                    lvb.b0(ryeVar.c());
                } else {
                    u55VarA.q();
                    u55VarA.f = 0L;
                }
                if (shfVar.k.get() == 0) {
                    shfVar.f.f(new h7b(25, this));
                }
                return true;
            }
        }
        lvb.b0(ryeVar.c());
        return true;
    }

    @Override // defpackage.rye
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.rye
    public final int e(Bitmap bitmap, lf4 lf4Var) {
        return this.a.e(bitmap, lf4Var.a());
    }

    @Override // defpackage.rye
    public final void f() {
        shf shfVar = this.d;
        AtomicInteger atomicInteger = shfVar.k;
        atomicInteger.decrementAndGet();
        if (shfVar.j()) {
            this.a.f();
        } else if (atomicInteger.get() == 0) {
            shfVar.f.f(new h7b(25, this));
        }
    }

    @Override // defpackage.rye
    public final boolean g(long j) {
        return this.a.g(j);
    }

    @Override // defpackage.rye
    public final Surface getInputSurface() {
        return this.a.getInputSurface();
    }
}
