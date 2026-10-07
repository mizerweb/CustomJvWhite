package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cel {
    public static void a(ltb ltbVar, g19 g19Var, cf7 cf7Var) {
        ev evVar = new ev(11, cf7Var);
        if (g19Var != null) {
            ltbVar.a(g19Var, evVar);
        } else {
            ltbVar.b(evVar);
        }
    }

    public static String b(wu0 wu0Var) {
        du8 du8Var = new du8();
        l51.c(du8Var, "mrx", Long.valueOf(wu0Var.c));
        l51.c(du8Var, "mtx", Long.valueOf(wu0Var.d));
        l51.c(du8Var, "midle", Long.valueOf(wu0Var.e));
        l51.c(du8Var, "wrx", Long.valueOf(wu0Var.f));
        l51.c(du8Var, "wtx", Long.valueOf(wu0Var.g));
        l51.c(du8Var, "widle", Long.valueOf(wu0Var.h));
        l51.c(du8Var, "source", Integer.valueOf(wu0Var.j));
        return du8Var.a().toString();
    }
}
