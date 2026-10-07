package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n21 implements esb {
    public long a;
    public long b;
    public Object c;
    public Object d;

    public n21(long j, int i) {
        lvb.b0(((pf) this.c) == null);
        this.a = j;
        this.b = j + ((long) i);
    }

    public pf a() {
        pf pfVar = (pf) this.c;
        pfVar.getClass();
        return pfVar;
    }

    @Override // defpackage.esb
    public long b(kj6 kj6Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // defpackage.esb
    public xbf c() {
        lvb.b0(this.a != -1);
        return new vk0((bx6) this.c, this.a, 1);
    }

    public n21 d() {
        n21 n21Var = (n21) this.d;
        if (n21Var == null || ((pf) n21Var.c) == null) {
            return null;
        }
        return n21Var;
    }

    @Override // defpackage.esb
    public void e(long j) {
        long[] jArr = (long[]) ((xp9) this.d).b;
        this.b = jArr[vqi.f(jArr, j, true)];
    }

    public n21(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.a = j;
        this.b = j2;
    }
}
