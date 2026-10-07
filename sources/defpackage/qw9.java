package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qw9 implements rw9 {
    public final List a;
    public final int b;

    public qw9(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw9)) {
            return false;
        }
        qw9 qw9Var = (qw9) obj;
        return this.a.equals(qw9Var.a) && this.b == qw9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(items=" + this.a + ", currentIndex=" + this.b + ")";
    }
}
