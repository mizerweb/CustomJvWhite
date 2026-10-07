package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a8a implements srb {
    public final b99 a;
    public final srb b;
    public int c = -1;

    public a8a(b99 b99Var, srb srbVar) {
        this.a = b99Var;
        this.b = srbVar;
    }

    @Override // defpackage.srb
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.f(this);
    }
}
