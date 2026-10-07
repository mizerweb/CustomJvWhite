package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sw7 extends xw7 {
    public final int a;

    public sw7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw7) && this.a == ((sw7) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        return "CallType(callMediaType=" + x05.q(this.a) + ")";
    }
}
