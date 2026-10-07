package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dw8 {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final bw8 b;

    static {
        new dw8(0, null);
    }

    public dw8(int i, f9i f9iVar) {
        String string;
        this.a = i;
        this.b = f9iVar;
        if ((i == 0) == (f9iVar == null)) {
            return;
        }
        if (i != 0) {
            StringBuilder sb = new StringBuilder("The projection variance ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "OUT" : "IN" : "INVARIANT");
            sb.append(" requires type to be specified.");
            string = sb.toString();
        } else {
            string = "Star projection must have no type specified.";
        }
        c.o(string);
        throw null;
    }

    public final bw8 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw8)) {
            return false;
        }
        dw8 dw8Var = (dw8) obj;
        return this.a == dw8Var.a && cqk.d(this.b, dw8Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        int iD = (i == 0 ? 0 : qt4.D(i)) * 31;
        bw8 bw8Var = this.b;
        return iD + (bw8Var != null ? bw8Var.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        int i2 = i == 0 ? -1 : cw8.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == -1) {
            return "*";
        }
        bw8 bw8Var = this.b;
        if (i2 == 1) {
            return String.valueOf(bw8Var);
        }
        if (i2 == 2) {
            return "in " + bw8Var;
        }
        if (i2 != 3) {
            ore.o();
            return null;
        }
        return "out " + bw8Var;
    }
}
