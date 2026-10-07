package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ms8 {
    public final String a;
    public final int b;
    public final ns8 c;

    public ms8(String str, int i, ns8 ns8Var) {
        this.a = str;
        this.b = i;
        this.c = ns8Var;
    }

    public final String a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.concat("."));
        sb.append(str);
        ns8 ns8VarB = b();
        if (ns8VarB != null && (str2 = ns8VarB.a) != null) {
            sb.append(".".concat(str2));
        }
        return sb.toString();
    }

    public ns8 b() {
        return this.c;
    }
}
