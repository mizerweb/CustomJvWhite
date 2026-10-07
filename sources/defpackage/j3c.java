package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3c implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ ny8 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j3c(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ha9 ha9Var) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ha9Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                return new zya(this.b, this.c, this.d, this.e, (ny8) obj3, (ny8) obj2, (ha9) obj);
            default:
                yfd yfdVar = (yfd) obj3;
                ite iteVar = yfdVar.m;
                xhh xhhVar = yfdVar.l;
                return new vfd((Context) obj2, iteVar, this.b, xhhVar, this.c, this.d, this.e, yfdVar, (gu4) obj);
        }
    }

    public /* synthetic */ j3c(yfd yfdVar, Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, gu4 gu4Var) {
        this.f = yfdVar;
        this.g = context;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.h = gu4Var;
    }
}
