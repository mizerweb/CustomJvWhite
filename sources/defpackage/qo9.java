package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qo9 implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public qo9(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((qo9) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo9)) {
            return false;
        }
        qo9 qo9Var = (qo9) obj;
        return this.a == qo9Var.a && this.b == qo9Var.b && this.c == qo9Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
