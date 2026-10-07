package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jrg extends kih {
    public final u8b c;
    public final u8b d;

    public jrg(u8b u8bVar, u8b u8bVar2) {
        this.c = u8bVar;
        this.d = u8bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrg)) {
            return false;
        }
        jrg jrgVar = (jrg) obj;
        return cqk.d(this.c, jrgVar.c) && cqk.d(this.d, jrgVar.d);
    }

    public final u8b h() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final u8b i() {
        return this.d;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(peerStories=" + this.c + ", storiesPreviews=" + this.d + ")";
    }
}
