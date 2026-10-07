package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mrg extends kih {
    public final u8b c;
    public final long d;

    public mrg(u8b u8bVar, long j) {
        this.c = u8bVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrg)) {
            return false;
        }
        mrg mrgVar = (mrg) obj;
        return cqk.d(this.c, mrgVar.c) && this.d == mrgVar.d;
    }

    public final long h() {
        return this.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final u8b i() {
        return this.c;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(storyDetailedStats=" + this.c + ", marker=" + this.d + ")";
    }
}
