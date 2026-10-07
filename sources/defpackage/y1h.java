package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y1h {
    public final q2h a;
    public final long b;
    public final u8b c;
    public final long d;
    public final long e;
    public final u8b f;
    public final long g;
    public final long h;

    public y1h(q2h q2hVar, long j, u8b u8bVar, long j2, long j3, u8b u8bVar2, long j4, long j5) {
        this.a = q2hVar;
        this.b = j;
        this.c = u8bVar;
        this.d = j2;
        this.e = j3;
        this.f = u8bVar2;
        this.g = j4;
        this.h = j5;
    }

    public static y1h a(y1h y1hVar, q2h q2hVar, long j, u8b u8bVar, long j2, long j3, u8b u8bVar2, long j4, long j5, int i) {
        if ((i & 1) != 0) {
            q2hVar = y1hVar.a;
        }
        return new y1h(q2hVar, (i & 2) != 0 ? y1hVar.b : j, (i & 4) != 0 ? y1hVar.c : u8bVar, (i & 8) != 0 ? y1hVar.d : j2, (i & 16) != 0 ? y1hVar.e : j3, (i & 32) != 0 ? y1hVar.f : u8bVar2, (i & 64) != 0 ? y1hVar.g : j4, (i & np0.m) != 0 ? y1hVar.h : j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1h)) {
            return false;
        }
        y1h y1hVar = (y1h) obj;
        return cqk.d(this.a, y1hVar.a) && this.b == y1hVar.b && cqk.d(this.c, y1hVar.c) && this.d == y1hVar.d && this.e == y1hVar.e && cqk.d(this.f, y1hVar.f) && this.g == y1hVar.g && this.h == y1hVar.h;
    }

    public final int hashCode() {
        q2h q2hVar = this.a;
        return Long.hashCode(this.h) + qt4.g((this.f.hashCode() + qt4.g(qt4.g((this.c.hashCode() + qt4.g((q2hVar == null ? 0 : q2hVar.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedStoryStats(stats=");
        sb.append(this.a);
        sb.append(", statsLoadedAtMs=");
        sb.append(this.b);
        sb.append(", viewers=");
        sb.append(this.c);
        sb.append(", viewersMarker=");
        sb.append(this.d);
        qt4.z(this.e, ", viewersLoadedAtMs=", ", reactions=", sb);
        sb.append(this.f);
        sb.append(", reactionsMarker=");
        sb.append(this.g);
        return zo5.k(this.h, ", reactionsLoadedAtMs=", ")", sb);
    }
}
