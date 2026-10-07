package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dv7 {
    public static final dv7 c = new dv7(bv7.d, cv7.b);
    public final bv7 a;
    public final cv7 b;

    public dv7(bv7 bv7Var, cv7 cv7Var) {
        this.a = bv7Var;
        this.b = cv7Var;
    }

    public final String toString() {
        StringBuilder sbC = nbh.C("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.a.a(sbC, "        ");
        sbC.append('\n');
        sbC.append("    ),");
        sbC.append('\n');
        sbC.append("    number = NumberHexFormat(");
        sbC.append('\n');
        this.b.a(sbC, "        ");
        sbC.append('\n');
        sbC.append("    )");
        sbC.append('\n');
        sbC.append(")");
        return sbC.toString();
    }
}
