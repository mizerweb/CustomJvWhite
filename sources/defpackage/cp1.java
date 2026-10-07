package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cp1 extends fp1 {
    public final boolean a;

    public cp1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp1) && this.a == ((cp1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("RaiseHand(isRaised=", ")", this.a);
    }
}
