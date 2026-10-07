package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ona implements tna {
    public final long a;
    public final oxi b;
    public final float c;
    public final boolean d;

    public ona(long j, oxi oxiVar, float f, boolean z) {
        this.a = j;
        this.b = oxiVar;
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.tna
    public final oxi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ona)) {
            return false;
        }
        ona onaVar = (ona) obj;
        return this.a == onaVar.a && this.b.equals(onaVar.b) && Float.compare(this.c, onaVar.c) == 0 && this.d == onaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.m((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, this.c, 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.a;
    }

    public final String toString() {
        return "OnSeek(messageId=" + this.a + ", model=" + this.b + ", progress=" + this.c + ", needPauseAfterSeek=" + this.d + ")";
    }
}
