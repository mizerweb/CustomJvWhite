package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n3h implements o3h {
    public final String a;
    public final azg b;
    public final boolean c;

    public n3h(String str, azg azgVar, boolean z) {
        this.a = str;
        this.b = azgVar;
        this.c = z;
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
        return this.c;
    }

    @Override // defpackage.o3h
    public final o3h d() {
        return new n3h(this.a, this.b, true);
    }

    public final q3h e(long j) {
        return new q3h(this.a, this.b, j, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3h)) {
            return false;
        }
        n3h n3hVar = (n3h) obj;
        return cqk.d(this.a, n3hVar.a) && cqk.d(this.b, n3hVar.b) && this.c == n3hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strA = owh.a(this.a);
        StringBuilder sb = new StringBuilder("AwaitingTargetStory(traceId=");
        sb.append(strA);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", isTargetOwnerShown=");
        return qt4.r(sb, this.c, ")");
    }

    public /* synthetic */ n3h(String str, azg azgVar) {
        this(str, azgVar, false);
    }
}
