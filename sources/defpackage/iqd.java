package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iqd extends erd {
    public final int a;
    public final int b;
    public final int c;

    public iqd(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqd)) {
            return false;
        }
        iqd iqdVar = (iqd) obj;
        return this.a == iqdVar.a && this.b == iqdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 64L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.c;
    }

    public final String toString() {
        return "Admins(count=" + this.a + ", itemViewType=" + jll.b(this.b) + ")";
    }
}
