package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sx {
    public final dnf a;

    public sx(dnf dnfVar) {
        this.a = dnfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx) && this.a.equals(((sx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
