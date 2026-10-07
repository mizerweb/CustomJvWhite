package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ym5 extends m4j {
    public final String d;
    public final m4j e;

    public ym5(String str, m4j m4jVar) {
        super(m4jVar);
        this.d = str;
        this.e = m4jVar;
    }

    @Override // defpackage.m4j
    public final m4j c(String str) {
        return new ym5(this.d, this.e.c(str));
    }

    public final m4j e() {
        return this.e;
    }

    @Override // defpackage.m4j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof ym5)) {
            return false;
        }
        ym5 ym5Var = (ym5) obj;
        return cqk.d(this.d, ym5Var.d) && cqk.d(this.e, ym5Var.e);
    }

    @Override // defpackage.m4j
    public final int hashCode() {
        return this.e.hashCode() + zo5.d(super.hashCode() * 31, 31, this.d);
    }
}
