package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fc3 implements pc3 {
    public final long a;
    public final r2f b;

    public fc3(long j, r2f r2fVar) {
        this.a = j;
        this.b = r2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc3)) {
            return false;
        }
        fc3 fc3Var = (fc3) obj;
        return this.a == fc3Var.a && this.b == fc3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OpenScheduledSendPicker(requestId=" + this.a + ", pickerMode=" + this.b + ")";
    }
}
