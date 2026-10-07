package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lmg implements nmg {
    public final boolean a;

    public lmg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmg) && this.a == ((lmg) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("SetSelection(selected=", ")", this.a);
    }
}
