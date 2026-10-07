package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vs1 extends xs1 {
    public final boolean a;

    public vs1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs1) && this.a == ((vs1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("HoldState(isOnHold=", ")", this.a);
    }
}
