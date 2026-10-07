package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface et3 {
    default boolean a() {
        xb9 xb9Var = (xb9) this;
        String string = xb9Var.d.getString(zo5.j(xb9Var.t(), "app.pin_"), null);
        return !(string == null || string.length() == 0);
    }
}
