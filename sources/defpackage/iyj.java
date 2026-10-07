package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iyj {
    public final String a;
    public final int b;

    public iyj(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyj)) {
            return false;
        }
        iyj iyjVar = (iyj) obj;
        return cqk.d(this.a, iyjVar.a) && this.b == iyjVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return qt4.p(sb, this.b, ')');
    }
}
