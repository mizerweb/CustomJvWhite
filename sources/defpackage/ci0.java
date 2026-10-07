package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ci0 extends v0b.b {
    private final long a;
    private final String b;
    private final boolean c;

    public ci0(long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    @Override // v0b.b
    public String a() {
        return this.b;
    }

    @Override // v0b.b
    public long b() {
        return this.a;
    }

    @Override // v0b.b
    public boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0b.b) {
            v0b.b bVar = (v0b.b) obj;
            if (this.a == bVar.b() && this.b.equals(bVar.a()) && this.c == bVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (true != this.c ? 1237 : 1231) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModelLoggingInfo{size=");
        sb.append(this.a);
        sb.append(", hash=");
        sb.append(this.b);
        sb.append(", manifestModel=");
        return qt4.r(sb, this.c, "}");
    }
}
