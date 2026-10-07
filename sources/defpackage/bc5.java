package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class bc5 implements it9 {
    public final tgg a;
    public final kg6 b;
    public ks0 c;
    public it9 d;
    public boolean e = true;
    public boolean f;

    public bc5(kg6 kg6Var, qt3 qt3Var) {
        this.b = kg6Var;
        this.a = new tgg(qt3Var);
    }

    @Override // defpackage.it9
    public final long A() {
        if (this.e) {
            return this.a.A();
        }
        it9 it9Var = this.d;
        it9Var.getClass();
        return it9Var.A();
    }

    public final void a(ks0 ks0Var) {
        it9 it9Var;
        it9 it9VarG = ks0Var.g();
        if (it9VarG == null || it9VarG == (it9Var = this.d)) {
            return;
        }
        if (it9Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = it9VarG;
        this.c = ks0Var;
        it9VarG.x(this.a.e);
    }

    @Override // defpackage.it9
    public final s2d c() {
        it9 it9Var = this.d;
        return it9Var != null ? it9Var.c() : this.a.e;
    }

    @Override // defpackage.it9
    public final boolean o() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        it9 it9Var = this.d;
        it9Var.getClass();
        return it9Var.o();
    }

    @Override // defpackage.it9
    public final void x(s2d s2dVar) {
        it9 it9Var = this.d;
        if (it9Var != null) {
            it9Var.x(s2dVar);
            s2dVar = this.d.c();
        }
        this.a.x(s2dVar);
    }
}
