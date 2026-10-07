package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xl1 {
    public final ny8 a;

    public xl1(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static String a(qw7 qw7Var) {
        if (qw7Var instanceof ow7) {
            return "p2p";
        }
        if (qw7Var instanceof lw7) {
            return "group";
        }
        if (qw7Var instanceof nw7) {
            return "link";
        }
        if (qw7Var.equals(pw7.a)) {
            return null;
        }
        ore.o();
        return null;
    }
}
