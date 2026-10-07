package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mnj implements ynj {
    public final String a;
    public final String b;
    public final boolean c;

    public mnj(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnj)) {
            return false;
        }
        mnj mnjVar = (mnj) obj;
        return cqk.d(this.a, mnjVar.a) && cqk.d(this.b, mnjVar.b) && this.c == mnjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(qv1.q("SendJsEvent(name=", this.a, ", data=", this.b, ", isPrivateBridge="), this.c, ")");
    }
}
