package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n7a implements k79 {
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;

    public n7a(long j, int i, int i2, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7a)) {
            return false;
        }
        n7a n7aVar = (n7a) obj;
        return this.a == n7aVar.a && this.b == n7aVar.b && this.c == n7aVar.c && this.d == n7aVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "ButtonItem(itemId=", ", iconRes=");
        sbQ.append(", titleRes=");
        sbQ.append(this.c);
        sbQ.append(", isSelected=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
