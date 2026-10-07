package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m9b {
    public final /* synthetic */ int a = 0;
    public final b40 b = gvk.a(false);
    public final Object c;

    public m9b(v30 v30Var) {
        this.c = v30Var;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.b();
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((j9b) this.c).g(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                v30 v30Var = (v30) this.c;
                synchronized (v30Var.f) {
                    int i = v30Var.b - 1;
                    v30Var.b = i;
                    if (i == 0 && !v30Var.c) {
                        v30Var.g = yab.i0((gu4) v30Var.d, null, 0, new fpf(v30Var, null, 19), 3);
                    }
                    break;
                }
                return true;
        }
    }

    public m9b(j9b j9bVar) {
        this.c = j9bVar;
    }
}
