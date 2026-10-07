package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ram extends vam {
    private final String a;
    private final boolean b;
    private final int c;

    public /* synthetic */ ram(String str, boolean z, int i, qam qamVar) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.vam
    public final int a() {
        return this.c;
    }

    @Override // defpackage.vam
    public final String b() {
        return this.a;
    }

    @Override // defpackage.vam
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vam) {
            vam vamVar = (vam) obj;
            if (this.a.equals(vamVar.b()) && this.b == vamVar.c() && this.c == vamVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.c ^ (((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.a);
        sb.append(", enableFirelog=");
        sb.append(this.b);
        sb.append(", firelogEventType=");
        return zo5.t(sb, this.c, "}");
    }
}
