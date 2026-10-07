package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fke {
    public final vo8 a;
    public final List b;

    public fke(vo8 vo8Var, List list) {
        this.a = vo8Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fke)) {
            return false;
        }
        fke fkeVar = (fke) obj;
        return cqk.d(this.a, fkeVar.a) && this.b.equals(fkeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobData(job=" + this.a + ", keys=" + this.b + ")";
    }
}
