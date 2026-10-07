package defpackage;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n8b {
    public o0a a;
    public o0a b;
    public o0a c;
    public o0a d;

    public n8b(o0a o0aVar, o0a o0aVar2, o0a o0aVar3, o0a o0aVar4) {
        o0aVar.getClass();
        o0aVar2.getClass();
        o0aVar3.getClass();
        o0aVar4.getClass();
        this.a = o0aVar;
        this.b = o0aVar2;
        this.c = o0aVar3;
        this.d = o0aVar4;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(n0a.class);
        enumMap.put(n0a.a, this.a);
        enumMap.put(n0a.b, this.b);
        enumMap.put(n0a.c, this.c);
        enumMap.put(n0a.d, this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8b)) {
            return false;
        }
        n8b n8bVar = (n8b) obj;
        return this.a == n8bVar.a && this.b == n8bVar.b && this.c == n8bVar.c && this.d == n8bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutableMediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n8b() {
        o0a o0aVar = o0a.a;
        this(o0aVar, o0aVar, o0aVar, o0aVar);
    }
}
