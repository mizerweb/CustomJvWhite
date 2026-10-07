package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i4f implements x58 {
    public final x58 a;
    public final Object b = new Object();
    public boolean c;
    public y58 d;

    public i4f(x58 x58Var) {
        this.a = x58Var;
    }

    @Override // defpackage.x58
    public final void a(long j, y58 y58Var) {
        synchronized (this.b) {
            this.c = true;
            this.d = y58Var;
        }
        x58 x58Var = this.a;
        if (x58Var != null) {
            x58Var.a(j, new qyb(18, this));
        } else {
            tvj.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    x58 x58Var = this.a;
                    if (x58Var != null) {
                        x58Var.clear();
                    } else {
                        tvj.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    tvj.g("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                y58 y58Var = this.d;
                if (y58Var != null) {
                    y58Var.p();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.x58
    public final void clear() {
        b();
    }
}
