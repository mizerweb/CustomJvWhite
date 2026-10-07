package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j3g extends vgd {
    public final r2f a;

    public j3g(r2f r2fVar) {
        this.a = r2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3g) && this.a == ((j3g) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Long.hashCode(100L) * 31);
    }

    public final String toString() {
        return "ShowSendScheduledDialog(requestId=100, pickerMode=" + this.a + ")";
    }
}
