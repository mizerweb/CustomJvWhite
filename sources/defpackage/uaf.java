package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uaf implements vaf {
    public final ctf a;
    public final i65 b;
    public final int c;
    public final long d;
    public final int e;

    public uaf(ctf ctfVar, i65 i65Var, int i, long j, int i2) {
        this.a = ctfVar;
        this.b = i65Var;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    @Override // defpackage.vaf
    public final int a() {
        return this.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.c;
    }
}
