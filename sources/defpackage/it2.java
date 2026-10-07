package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class it2 implements cu3, Iterable, uv8 {
    public final char a;
    public final char b;
    public final int c = 1;

    static {
        new it2((char) 1, (char) 0);
    }

    public it2(char c, char c2) {
        this.a = c;
        this.b = (char) wk8.s(c, c2, 1);
    }

    @Override // defpackage.cu3
    public final Comparable a() {
        return Character.valueOf(this.a);
    }

    @Override // defpackage.cu3
    public final Comparable b() {
        return Character.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof it2)) {
            return false;
        }
        if (isEmpty() && ((it2) obj).isEmpty()) {
            return true;
        }
        it2 it2Var = (it2) obj;
        return this.a == it2Var.a && this.b == it2Var.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.cu3
    public final boolean isEmpty() {
        return cqk.i(this.a, this.b) > 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ht2(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
