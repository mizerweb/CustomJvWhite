package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rxb {
    public final Integer a;
    public final qxb b;
    public final int c;
    public final String d;
    public final int e;

    public rxb(Integer num, qxb qxbVar, int i, String str, int i2) {
        this.a = num;
        this.b = qxbVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxb)) {
            return false;
        }
        rxb rxbVar = (rxb) obj;
        return cqk.d(this.a, rxbVar.a) && this.b.equals(rxbVar.b) && this.c == rxbVar.c && this.d.equals(rxbVar.d) && this.e == rxbVar.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.e) + zo5.d(zo5.c(this.c, (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", screenId=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", bottomBarItemId=");
        return zo5.t(sb, this.e, ")");
    }
}
