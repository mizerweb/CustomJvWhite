package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cla implements ela {
    public final r2f a;

    public cla(r2f r2fVar) {
        this.a = r2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cla) && this.a == ((cla) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Long.hashCode(1L) * 31);
    }

    public final String toString() {
        return "ShowSendScheduledDialog(requestId=1, pickerMode=" + this.a + ")";
    }
}
