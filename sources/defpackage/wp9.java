package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wp9 implements kyh {
    public b87 a;
    public final boolean b;
    public final t28 c;
    public final ifh d;

    public wp9(int i) {
        this.b = i == 2;
        this.c = new t28();
        this.d = new ifh(new bh9(12));
    }

    @Override // defpackage.kyh
    public final void a(long j, int i, int i2, int i3, jyh jyhVar) {
        if (this.b) {
            this.c.e(i, j);
        }
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        while (i > 0) {
            ifh ifhVar = this.d;
            int iMin = Math.min(i, ((byte[]) ifhVar.getValue()).length);
            nmcVar.k(0, (byte[]) ifhVar.getValue(), iMin);
            i -= iMin;
        }
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            ifh ifhVar = this.d;
            int i3 = q25Var.read((byte[]) ifhVar.getValue(), 0, Math.min(i2, ((byte[]) ifhVar.getValue()).length));
            if (i3 == -1) {
                throw new ji1("Unexpected end of track", 7);
            }
            i2 -= i3;
        }
        return i;
    }

    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        this.a = b87Var;
    }
}
