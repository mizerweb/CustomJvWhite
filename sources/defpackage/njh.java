package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class njh {
    public final do6[] a;
    public final boolean b;
    public final int c;

    public njh(do6[] do6VarArr, boolean z, int i) {
        this.a = do6VarArr;
        boolean z2 = false;
        if (do6VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public abstract void a(fo foVar, qjh qjhVar);

    public njh() {
        this.a = null;
        this.b = false;
        this.c = 0;
    }
}
