package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xub {
    public final int a;
    public final int b;
    public final tub c;
    public final sub d;
    public final float e;

    public xub(int i, int i2, tub tubVar, sub subVar, float f) {
        this.a = i;
        this.b = i2;
        this.c = tubVar;
        this.d = subVar;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xub)) {
            return false;
        }
        xub xubVar = (xub) obj;
        return this.a == xubVar.a && this.b == xubVar.b && this.c == xubVar.c && this.d == xubVar.d && Float.compare(this.e, xubVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("TooltipPosition(x=", this.a, ", y=", this.b, ", arrowSide=");
        sbP.append(this.c);
        sbP.append(", arrowAlignment=");
        sbP.append(this.d);
        sbP.append(", rotation=");
        sbP.append(this.e);
        sbP.append(")");
        return sbP.toString();
    }
}
