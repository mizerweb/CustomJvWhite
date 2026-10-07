package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class bi0 extends v0b.a {
    private final String a;
    private final String b;
    private final String c;

    public bi0(String str, String str2, String str3) {
        if (str == null) {
            ore.n("Null modelType");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ore.n("Null modelFile");
            throw null;
        }
        this.b = str2;
        if (str3 != null) {
            this.c = str3;
        } else {
            ore.n("Null labelsFile");
            throw null;
        }
    }

    @Override // v0b.a
    public String a() {
        return this.c;
    }

    @Override // v0b.a
    public String b() {
        return this.b;
    }

    @Override // v0b.a
    public String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0b.a) {
            v0b.a aVar = (v0b.a) obj;
            if (this.a.equals(aVar.c()) && this.b.equals(aVar.b()) && this.c.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoMLManifest{modelType=");
        sb.append(this.a);
        sb.append(", modelFile=");
        sb.append(this.b);
        sb.append(", labelsFile=");
        return zo5.w(sb, this.c, "}");
    }
}
