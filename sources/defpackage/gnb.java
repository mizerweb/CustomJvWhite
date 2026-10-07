package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gnb {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ifh d;
    public final ny8 e;
    public final ny8 f;
    public final ifh g;
    public final ifh h;
    public final ifh i;
    public final ny8 j;
    public final ny8 k;

    public gnb(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = new ifh(new w40(ny8Var4, 20));
        this.e = ny8Var9;
        this.f = ny8Var5;
        this.g = new ifh(new w40(ny8Var6, 21));
        this.h = new ifh(new w40(ny8Var6, 22));
        this.i = new ifh(new w40(ny8Var6, 23));
        this.j = ny8Var7;
        this.k = ny8Var8;
    }

    public static final void a(gnb gnbVar, long j, CharSequence charSequence, long j2) {
        if (j2 == 0) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "gnb", zo5.j(j, "directReply: failed to send message, no chat in cache for chatServerId="), null);
                }
            }
            ((h5c) gnbVar.b.getValue()).b(j);
            return;
        }
        g4b g4bVarJ = ((h4b) gnbVar.j.getValue()).J(6);
        mlf mlfVar = new mlf(j2, charSequence.toString(), true, r66.a);
        mlfVar.g = g4bVarJ;
        ((wzj) gnbVar.k.getValue()).c(new slf(mlfVar));
        ((h5c) gnbVar.b.getValue()).b(j);
    }
}
