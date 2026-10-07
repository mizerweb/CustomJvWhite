package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s24 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ ny8 e;
    public final /* synthetic */ ny8 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ a8j h;

    public /* synthetic */ s24(kua kuaVar, ifh ifhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, gjf gjfVar) {
        this.a = 2;
        this.h = kuaVar;
        this.f = ifhVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.g = gjfVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ny8 ny8Var = this.b;
        Object obj = this.g;
        a8j a8jVar = this.h;
        switch (i) {
            case 0:
                u24 u24Var = (u24) a8jVar;
                return new a14(u24Var.r, u24Var.b, new ft0(((w95) ny8Var.getValue()).a.R0(1, "comments-subscribe")), this.c, this.d, this.e, this.f, (ny8) obj);
            case 1:
                jsa jsaVar = (jsa) a8jVar;
                return new e1i(jsaVar.g, jsaVar.b, jsaVar.j, this.b, this.c, this.d, this.e, this.f, (ny8) obj);
            default:
                kua kuaVar = (kua) a8jVar;
                ifh ifhVar = (ifh) this.f;
                long j = kuaVar.r;
                ft0 ft0Var = new ft0(((xt4) ifhVar.getValue()).R0(1, "chat-subscribe"));
                xn3 xn3Var = (xn3) ny8Var.getValue();
                yt4 yt4Var = (yt4) this.c.getValue();
                iua iuaVar = new iua(0, kuaVar);
                return new se3(j, ft0Var, yt4Var, this.d, this.e, (gjf) obj, xn3Var, iuaVar);
        }
    }

    public /* synthetic */ s24(a8j a8jVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, int i) {
        this.a = i;
        this.h = a8jVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
    }
}
