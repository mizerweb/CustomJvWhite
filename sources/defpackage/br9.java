package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class br9 implements cr9 {
    public final long a;
    public final r2f b;

    public br9(long j, r2f r2fVar) {
        this.a = j;
        this.b = r2fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return this.a == br9Var.a && this.b == br9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ShowSendScheduledDialog(requestId=" + this.a + ", pickerMode=" + this.b + ")";
    }
}
