package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hf1 extends kih {
    public final String c;

    public hf1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf1) && cqk.d(this.c, ((hf1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        String str = this.c;
        return c0a.o("Response(joinLink=", r5h.h1(str, 0, str.length(), "*").toString(), ")");
    }

    public /* synthetic */ hf1() {
        this("");
    }
}
