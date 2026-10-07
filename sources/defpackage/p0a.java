package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p0a {
    public final o0a a;
    public final o0a b;
    public final o0a c;
    public final o0a d;

    public p0a(o0a o0aVar, o0a o0aVar2, o0a o0aVar3, o0a o0aVar4) {
        this.a = o0aVar;
        this.b = o0aVar2;
        this.c = o0aVar3;
        this.d = o0aVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0a)) {
            return false;
        }
        p0a p0aVar = (p0a) obj;
        return this.a == p0aVar.a && this.b == p0aVar.b && this.c == p0aVar.c && this.d == p0aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p0a() {
        o0a o0aVar = o0a.a;
        this(o0aVar, o0aVar, o0aVar, o0aVar);
    }
}
