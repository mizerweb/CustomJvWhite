package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sd8 implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ cyb b;
    public final /* synthetic */ td8 c;

    public /* synthetic */ sd8(float f, cyb cybVar, td8 td8Var) {
        this.a = f;
        this.b = cybVar;
        this.c = td8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        td8.a(this.a, this.b, this.c);
    }
}
