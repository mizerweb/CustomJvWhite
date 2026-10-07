package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ot3 extends m4j {
    public final m4j d;
    public final long e;
    public final long f;
    public final boolean g;

    public ot3(m4j m4jVar, long j, long j2, boolean z) {
        super(m4jVar);
        this.d = m4jVar;
        this.e = j;
        this.f = j2;
        this.g = z;
    }

    @Override // defpackage.m4j
    public final m4j c(String str) {
        return new ot3(this.d.c(str), this.e, this.f, this.g);
    }

    @Override // defpackage.m4j
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            ot3 ot3Var = (ot3) obj;
            if (this.e == ot3Var.e && this.f == ot3Var.f) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.m4j
    public final int hashCode() {
        return Long.hashCode(this.f) + qt4.g(super.hashCode() * 31, 31, this.e);
    }

    public /* synthetic */ ot3(z15 z15Var, long j, long j2) {
        this(z15Var, j, j2, true);
    }
}
