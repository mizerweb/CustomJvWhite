package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class f4d {
    public final e4d a;
    public final kg6 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public f4d(kg6 kg6Var, e4d e4dVar, ush ushVar, int i, Looper looper) {
        this.b = kg6Var;
        this.a = e4dVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        lvb.b0(!this.f);
        this.f = true;
        kg6 kg6Var = this.b;
        if (!kg6Var.K && kg6Var.j.getThread().isAlive()) {
            kg6Var.h.c(14, this).b();
        } else {
            lvb.G0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
