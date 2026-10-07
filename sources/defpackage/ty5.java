package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ty5 implements vy5 {
    public final r2f a;

    public ty5(r2f r2fVar) {
        this.a = r2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty5) && this.a == ((ty5) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowSendScheduledDialog(pickerMode=" + this.a + ")";
    }
}
