package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vj5 {
    public final int a;
    public final String b;

    public vj5(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj5)) {
            return false;
        }
        vj5 vj5Var = (vj5) obj;
        return this.a == vj5Var.a && this.b.equals(vj5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DevMenuTab(id=" + this.a + ", name=" + this.b + ")";
    }
}
