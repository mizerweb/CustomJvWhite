package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yqd extends erd {
    public final int a;
    public final int b;
    public final int c;

    public yqd(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqd)) {
            return false;
        }
        yqd yqdVar = (yqd) obj;
        return this.a == yqdVar.a && this.b == yqdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 128L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.c;
    }

    public final String toString() {
        return "ParticipantsCount(count=" + this.a + ", itemViewType=" + jll.b(this.b) + ")";
    }
}
