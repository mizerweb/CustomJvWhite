package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ph0 {
    public final String a;
    public final ArrayList b;

    public ph0(String str, ArrayList arrayList) {
        if (str == null) {
            ore.n("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0Var = (ph0) obj;
        return this.a.equals(ph0Var.a) && this.b.equals(ph0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
