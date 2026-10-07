package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tfb {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(int i, double d) {
        return (Double.hashCode(d) + i) * 31;
    }

    public static final void b(b8j b8jVar, b1f b1fVar, i19 i19Var) {
        AutoCloseable autoCloseable;
        boolean z;
        d8j d8jVar = b8jVar.a;
        if (d8jVar != null) {
            synchronized (d8jVar.a) {
                autoCloseable = (AutoCloseable) d8jVar.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        w0f w0fVar = (w0f) autoCloseable;
        if (w0fVar == null || (z = w0fVar.c)) {
            return;
        }
        if (z) {
            ore.k("Already attached to lifecycleOwner");
            return;
        }
        w0fVar.c = true;
        i19Var.a(w0fVar);
        b1fVar.c(w0fVar.a, w0fVar.b.e);
        n09 n09Var = i19Var.d;
        if (n09Var == n09.b || n09Var.a(n09.d)) {
            b1fVar.d();
        } else {
            i19Var.a(new qz8(i19Var, b1fVar));
        }
    }
}
