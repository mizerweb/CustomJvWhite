package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class mq9 {
    public static final lq9 Companion = new lq9();
    public static final ny8[] d = {rx8.P(2, new bh9(13)), rx8.P(2, new bh9(14)), null};
    public final nq9 a;
    public final pq9 b;
    public final long c;

    public /* synthetic */ mq9(int i, nq9 nq9Var, pq9 pq9Var, long j) {
        if (7 != (i & 7)) {
            shl.b(i, 7, kq9.a.d());
            throw null;
        }
        this.a = nq9Var;
        this.b = pq9Var;
        this.c = j;
    }

    public final nq9 a() {
        return this.a;
    }

    public final pq9 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq9)) {
            return false;
        }
        mq9 mq9Var = (mq9) obj;
        return this.a == mq9Var.a && this.b == mq9Var.b && this.c == mq9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoSaveRecord(chatType=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", enabledAt=");
        return c0a.m(this.c, ")", sb);
    }

    public mq9(nq9 nq9Var, pq9 pq9Var, long j) {
        this.a = nq9Var;
        this.b = pq9Var;
        this.c = j;
    }
}
