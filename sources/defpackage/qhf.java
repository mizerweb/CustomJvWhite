package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: classes2.dex */
public final class qhf implements ey {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final b87 d;
    public final b87 e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ shf h;

    public qhf(shf shfVar, long j) {
        this.h = shfVar;
        this.a = j;
        boolean z = shfVar.y || shfVar.b.contains(1);
        this.b = z;
        boolean z2 = shfVar.z || shfVar.b.contains(2);
        this.c = z2;
        lvb.b0(z || z2);
        a87 a87Var = new a87();
        a87Var.m = uya.n("audio/raw");
        this.d = new b87(a87Var);
        a87 a87Var2 = new a87();
        a87Var2.m = uya.n("audio/raw");
        a87Var2.F = 44100;
        a87Var2.E = 2;
        a87Var2.G = 2;
        this.e = new b87(a87Var2);
    }

    public final void a() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.b && !this.f;
        boolean z4 = this.c && !this.g;
        lvb.b0(z3 || z4);
        shf shfVar = this.h;
        if (z3) {
            try {
                rhf rhfVarF = shfVar.f(this.e);
                if (rhfVarF == null) {
                    z = true;
                } else {
                    shf shfVar2 = rhfVarF.d;
                    if (shfVar2.k.decrementAndGet() == 0 && !shfVar2.j()) {
                        shfVar2.f.f(new h7b(25, rhfVarF));
                    }
                    this.f = true;
                }
            } catch (ExportException e) {
                shfVar.b(e);
                return;
            } catch (RuntimeException e2) {
                shfVar.b(ExportException.a(1000, e2));
                return;
            }
        }
        if (!z4) {
            z2 = z;
        } else if (shfVar.f(shf.B) != null) {
            shfVar.i(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
            this.g = true;
            z2 = z;
        }
        if (z2) {
            shfVar.f.a.postDelayed(new h7b(24, this), 10L);
        }
    }

    @Override // defpackage.ey
    public final int c(ww6 ww6Var) {
        boolean z = this.b && !this.f;
        boolean z2 = this.c && !this.g;
        if (z && z2) {
            ww6Var.b = 0;
            return 2;
        }
        if (z || z2) {
            ww6Var.b = 50;
            return 2;
        }
        ww6Var.b = 99;
        return 2;
    }

    @Override // defpackage.ey
    public final g98 g() {
        return lhe.g;
    }

    @Override // defpackage.ey
    public final void release() {
    }

    @Override // defpackage.ey
    public final void start() {
        long j = this.a;
        shf shfVar = this.h;
        shfVar.d(j);
        boolean z = this.c;
        boolean z2 = this.b;
        shfVar.a((z2 && z) ? 2 : 1);
        if (z2) {
            shfVar.e(2, this.d);
        }
        if (z) {
            shfVar.e(2, shf.B);
        }
        a();
    }
}
