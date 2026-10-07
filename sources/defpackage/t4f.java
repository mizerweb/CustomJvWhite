package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t4f {
    public static final t4f e = new t4f(u4f.d, null, false, null);
    public final u4f a;
    public final m4f b;
    public final boolean c;
    public final CharSequence d;

    public t4f(u4f u4fVar, m4f m4fVar, boolean z, CharSequence charSequence) {
        this.a = u4fVar;
        this.b = m4fVar;
        this.c = z;
        this.d = charSequence;
    }

    public static t4f a(t4f t4fVar, u4f u4fVar, m4f m4fVar, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            u4fVar = t4fVar.a;
        }
        if ((i & 2) != 0) {
            m4fVar = t4fVar.b;
        }
        boolean z = (i & 4) != 0 ? t4fVar.c : true;
        if ((i & 8) != 0) {
            charSequence = t4fVar.d;
        }
        t4fVar.getClass();
        return new t4f(u4fVar, m4fVar, z, charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4f)) {
            return false;
        }
        t4f t4fVar = (t4f) obj;
        return this.a == t4fVar.a && cqk.d(this.b, t4fVar.b) && this.c == t4fVar.c && cqk.d(this.d, t4fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m4f m4fVar = this.b;
        int iN = nbh.n((iHashCode + (m4fVar == null ? 0 : m4fVar.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return iN + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenRecordData(state=" + this.a + ", data=" + this.b + ", isApproved=" + this.c + ", recordUserName=" + ((Object) this.d) + ")";
    }
}
