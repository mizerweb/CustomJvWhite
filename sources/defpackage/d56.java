package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d56 {
    public int a = 1;
    public final ywa b;
    public ywa c;
    public ywa d;
    public int e;
    public int f;

    public d56(ywa ywaVar) {
        this.b = ywaVar;
        this.c = ywaVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        swa swaVarB = this.c.b.b();
        int iA = swaVarB.a(6);
        return !(iA == 0 || swaVarB.b.get(iA + swaVarB.a) == 0) || this.e == 65039;
    }
}
