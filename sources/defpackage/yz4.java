package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yz4 implements Comparable, Serializable {
    public final Comparable a;

    public yz4(Comparable comparable) {
        this.a = comparable;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(yz4 yz4Var) {
        if (yz4Var == wz4.d) {
            return 1;
        }
        if (yz4Var == wz4.c) {
            return -1;
        }
        Comparable comparable = yz4Var.a;
        int i = k4e.c;
        int iCompareTo = this.a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof xz4, yz4Var instanceof xz4);
    }

    public abstract void b(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof yz4) {
            try {
                if (compareTo((yz4) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public Comparable h() {
        return this.a;
    }

    public abstract int hashCode();

    public abstract boolean i(Comparable comparable);
}
