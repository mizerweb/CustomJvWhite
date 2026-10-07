package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qfd {
    public static final qfd c = new qfd(0, agd.WAS_RECENTLY);
    public final int a;
    public final agd b;

    public qfd(int i, agd agdVar) {
        this.a = i;
        this.b = agdVar;
    }

    public static qfd a(qfd qfdVar, int i) {
        int i2 = qfdVar.a;
        agd agdVar = (i & 2) != 0 ? qfdVar.b : agd.ONLINE;
        qfdVar.getClass();
        return new qfd(i2, agdVar);
    }

    public final boolean b() {
        return this.b == agd.ONLINE;
    }

    public final qfd c() {
        agd agdVar = this.b;
        agd agdVar2 = agd.OFFLINE;
        if (agdVar == agdVar2) {
            gm0.Y(qfd.class.getName(), "try to move to offline already offlined user!");
        }
        if (agdVar != agd.ONLINE) {
            gm0.Y(qfd.class.getName(), "try to move to offline not onlined user!");
        }
        return new qfd(this.a, agdVar2);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return hashCode();
    }

    public final String toString() {
        return "Presence(seen=" + this.a + ", status=" + this.b + ")";
    }
}
