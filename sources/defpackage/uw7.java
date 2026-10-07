package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uw7 extends xw7 {
    public final boolean a;

    public uw7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw7) && this.a == ((uw7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Missing(isMissing=", ")", this.a);
    }
}
