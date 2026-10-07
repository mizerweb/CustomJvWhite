package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jge {
    public final String a;
    public final String b;

    public jge(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jge)) {
            return false;
        }
        jge jgeVar = (jge) obj;
        return this.a.equals(jgeVar.a) && this.b.equals(jgeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("RefreshedPhoto(baseUrl=", this.a, ", mp4Url=", this.b, ")");
    }
}
