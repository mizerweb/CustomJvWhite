package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b7d {
    public final int a;
    public final CharSequence b;
    public final d7d c;
    public final w6d d;
    public final boolean e;

    public b7d(int i, CharSequence charSequence, d7d d7dVar, w6d w6dVar, boolean z) {
        this.a = i;
        this.b = charSequence;
        this.c = d7dVar;
        this.d = w6dVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7d)) {
            return false;
        }
        b7d b7dVar = (b7d) obj;
        return this.a == b7dVar.a && cqk.d(this.b, b7dVar.b) && this.c.equals(b7dVar.c) && this.d.equals(b7dVar.d) && this.e == b7dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + mw7.f(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollAnswerInfo(answerId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", startButtonState=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", isPending=");
        return qt4.r(sb, this.e, ")");
    }
}
