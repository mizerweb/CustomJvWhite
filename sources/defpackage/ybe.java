package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ybe implements dce {
    public final boolean a;

    public ybe(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybe) && this.a == ((ybe) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("Finalizing(wasLocked=", ")", this.a);
    }
}
