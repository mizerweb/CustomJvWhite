package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t6d extends kjl {
    public final List a;
    public final int b;

    public t6d(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6d)) {
            return false;
        }
        t6d t6dVar = (t6d) obj;
        return this.a.equals(t6dVar.a) && this.b == t6dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StackWithCount(avatarsInfo=" + this.a + ", count=" + this.b + ")";
    }
}
