package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o51 implements kyh {
    public final int a;
    public final b87 b;
    public final nm5 c = new nm5();
    public final p51 d;
    public b87 e;
    public kyh f;
    public long g;

    public o51(int i, int i2, b87 b87Var, p51 p51Var) {
        this.a = i2;
        this.b = b87Var;
        this.d = p51Var;
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.c;
        }
        kyh kyhVar = this.f;
        String str = vqi.a;
        kyhVar.a(j, i, i2, i3, jyhVar);
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        kyh kyhVar = this.f;
        String str = vqi.a;
        kyhVar.f(i, nmcVar);
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) {
        kyh kyhVar = this.f;
        String str = vqi.a;
        return kyhVar.c(q25Var, i, z);
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        this.d.getClass();
        b87 b87Var2 = this.b;
        if (b87Var2 != null) {
            b87Var = b87Var.f(b87Var2);
        }
        this.e = b87Var;
        kyh kyhVar = this.f;
        String str = vqi.a;
        kyhVar.g(b87Var);
    }
}
