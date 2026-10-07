package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zu6 {
    public static final ifh b = new ifh(new s35(29));
    public final ny8 a;

    public zu6(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final ylc a(String str) {
        Object poeVar;
        try {
            boolean zO1 = r5h.o1(str, '8');
            ny8 ny8Var = this.a;
            luc lucVarT = zO1 ? ((vtc) ny8Var.getValue()).t(str, "RU") : ((vtc) ny8Var.getValue()).t(str, null);
            poeVar = new ylc("+" + lucVarT.b, String.valueOf(lucVarT.c));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        return (ylc) (poeVar instanceof poe ? null : poeVar);
    }
}
