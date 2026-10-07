package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r1e extends ush {
    public static final r1e g;
    public static final Object h;
    public final c98 e;
    public final q1e f;

    static {
        a98 a98Var = c98.b;
        g = new r1e(ghe.e, null);
        h = new Object();
    }

    public r1e(c98 c98Var, q1e q1eVar) {
        this.e = c98Var;
        this.f = q1eVar;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ush
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1e)) {
            return false;
        }
        r1e r1eVar = (r1e) obj;
        return Objects.equals(this.e, r1eVar.e) && Objects.equals(this.f, r1eVar.f);
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        q1e q1eVarR = r(i);
        Long lValueOf = Long.valueOf(q1eVarR.b);
        long jX = vqi.X(q1eVarR.c);
        rshVar.getClass();
        rshVar.i(lValueOf, null, i, jX, 0L, fa.f, false);
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return o();
    }

    @Override // defpackage.ush
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        q1e q1eVarR = r(i);
        tshVar.b(h, q1eVarR.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, vqi.X(q1eVarR.c), i, i, 0L);
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final long q(int i) {
        if (i < 0) {
            return -1L;
        }
        c98 c98Var = this.e;
        if (i < c98Var.size()) {
            return ((q1e) c98Var.get(i)).b;
        }
        return -1L;
    }

    public final q1e r(int i) {
        q1e q1eVar;
        c98 c98Var = this.e;
        return (i != c98Var.size() || (q1eVar = this.f) == null) ? (q1e) c98Var.get(i) : q1eVar;
    }
}
