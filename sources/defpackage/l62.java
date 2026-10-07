package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l62 {
    public final boolean a;

    public l62(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l62) && this.a == ((l62) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("PromotionApproved(approved=", ")", this.a);
    }
}
