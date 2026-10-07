package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qdf {
    public final Object a;
    public final tf7 b;
    public final tf7 c;
    public final Object d;
    public final mdh e;
    public final tf7 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ sdf i;

    public qdf(sdf sdfVar, Object obj, tf7 tf7Var, tf7 tf7Var2, c5b c5bVar, mdh mdhVar, tf7 tf7Var3) {
        this.i = sdfVar;
        this.a = obj;
        this.b = tf7Var;
        this.c = tf7Var2;
        this.d = c5bVar;
        this.e = mdhVar;
        this.f = tf7Var3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof gcf) {
            ((gcf) obj).m(this.h, this.i.a);
            return;
        }
        no5 no5Var = obj instanceof no5 ? (no5) obj : null;
        if (no5Var != null) {
            no5Var.dispose();
        }
    }
}
