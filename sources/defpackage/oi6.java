package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi6 implements pi6 {
    public final boolean a;

    public oi6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi6) && this.a == ((oi6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("WaitingRoom(adminIsHere=", ")", this.a);
    }
}
