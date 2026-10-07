package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zo1 extends fp1 {
    public final boolean a;

    public zo1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo1) && this.a == ((zo1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("HoldState(isOnHold=", ")", this.a);
    }
}
