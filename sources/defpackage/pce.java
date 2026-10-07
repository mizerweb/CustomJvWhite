package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pce {
    public final int a;
    public final int b;
    public final int c;

    public pce(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pce)) {
            return false;
        }
        pce pceVar = (pce) obj;
        return this.a == pceVar.a && this.b == pceVar.b && this.c == pceVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("Config(recordingButtonIcon=", this.a, ", pauseRecordingIcon=", this.b, ", resumeRecodingIcon="), this.c, ")");
    }
}
