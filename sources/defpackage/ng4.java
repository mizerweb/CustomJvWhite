package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ng4 extends og4 {
    public final int a;

    public ng4(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng4) && this.a == ((ng4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return qt4.p(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
