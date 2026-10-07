package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q3h implements o3h {
    public final String a;
    public final azg b;
    public final long c;
    public final boolean d;

    public q3h(String str, azg azgVar, long j, boolean z) {
        this.a = str;
        this.b = azgVar;
        this.c = j;
        this.d = z;
    }

    @Override // defpackage.o3h
    public final String a() {
        return this.a;
    }

    @Override // defpackage.o3h
    public final azg b() {
        return this.b;
    }

    @Override // defpackage.o3h
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.o3h
    public final o3h d() {
        return new q3h(this.a, this.b, this.c, true);
    }

    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3h)) {
            return false;
        }
        q3h q3hVar = (q3h) obj;
        return cqk.d(this.a, q3hVar.a) && cqk.d(this.b, q3hVar.b) && wxg.b(this.c, q3hVar.c) && this.d == q3hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qt4.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "TrackingTargetStory(traceId=" + owh.a(this.a) + ", owner=" + this.b + ", storyId=" + wxg.c(this.c) + ", isTargetOwnerShown=" + this.d + ")";
    }

    public /* synthetic */ q3h(long j, azg azgVar, String str) {
        this(str, azgVar, j, false);
    }
}
