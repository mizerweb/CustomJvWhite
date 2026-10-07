package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ha8 {
    public final fa8 a;
    public final int b;

    public ha8(fa8 fa8Var, int i) {
        this.a = fa8Var;
        this.b = i;
    }

    public final fa8 a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha8)) {
            return false;
        }
        ha8 ha8Var = (ha8) obj;
        return this.a == ha8Var.a && this.b == ha8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredCondition(key=" + this.a + ", quantity=" + this.b + ")";
    }
}
