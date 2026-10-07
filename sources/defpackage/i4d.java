package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i4d extends ush {
    public static final Object j = new Object();
    public final ry9 e;
    public final boolean f;
    public final boolean g;
    public final iy9 h;
    public final long i;

    public i4d(j4d j4dVar) {
        this.e = j4dVar.U();
        j4dVar.q0();
        this.f = j4dVar.b.g0();
        j4dVar.q0();
        this.g = j4dVar.b.e0();
        this.h = j4dVar.e0() ? iy9.f : null;
        this.i = vqi.X(j4dVar.T());
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        rshVar.getClass();
        fa faVar = fa.f;
        Object obj = j;
        rshVar.i(obj, obj, 0, this.i, 0L, faVar, false);
        rshVar.f = false;
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return 1;
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        return j;
    }

    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j2) {
        tshVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        tshVar.j = false;
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return 1;
    }
}
