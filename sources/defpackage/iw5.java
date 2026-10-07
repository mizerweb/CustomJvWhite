package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iw5 implements aw8 {
    public static final iw5 a = new iw5();
    public static final thd b = new thd("kotlin.time.Duration", phd.h);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        long j = ((ew5) obj).a;
        ghb ghbVar = ew5.b;
        StringBuilder sb = new StringBuilder();
        if (ew5.m(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jV = ew5.m(j) ? ew5.v(j) : j;
        long jS = ew5.s(jV, lw5.HOURS);
        boolean z = false;
        int iS = ew5.k(jV) ? 0 : (int) (ew5.s(jV, lw5.MINUTES) % 60);
        int iS2 = ew5.k(jV) ? 0 : (int) (ew5.s(jV, lw5.SECONDS) % 60);
        int i = ew5.i(jV);
        if (ew5.k(j)) {
            jS = 9999999999999L;
        }
        boolean z2 = jS != 0;
        boolean z3 = (iS2 == 0 && i == 0) ? false : true;
        if (iS != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jS);
            sb.append('H');
        }
        if (z) {
            sb.append(iS);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            ew5.b(sb, iS2, i, 9, "S", true);
        }
        u76Var.C(sb.toString());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        ghb ghbVar = ew5.b;
        String strY = r55Var.y();
        try {
            long jC = qe7.C(strY);
            if (ew5.f(jC, ew5.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new ew5(jC);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(c0a.o("Invalid ISO duration string format: '", strY, "'."), e);
        }
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
