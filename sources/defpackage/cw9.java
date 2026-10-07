package defpackage;

import one.me.mediaeditor.MediaEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cw9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaEditScreen b;

    public /* synthetic */ cw9(MediaEditScreen mediaEditScreen, int i) {
        this.a = i;
        this.b = mediaEditScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        t73 t73VarB;
        int i = this.a;
        a8g a8gVar = pq3.j;
        MediaEditScreen mediaEditScreen = this.b;
        switch (i) {
            case 0:
                mx9 mx9Var = (mx9) mediaEditScreen.v.getAccessor().c(1087);
                vv vvVar = mediaEditScreen.r;
                zv8[] zv8VarArr = MediaEditScreen.w1;
                zv8 zv8Var = zv8VarArr[1];
                long jLongValue = ((Number) vvVar.a(mediaEditScreen)).longValue();
                vv vvVar2 = mediaEditScreen.u;
                zv8 zv8Var2 = zv8VarArr[4];
                Long l = (Long) vvVar2.a(mediaEditScreen);
                vv vvVar3 = mediaEditScreen.t;
                zv8 zv8Var3 = zv8VarArr[3];
                Long l2 = (Long) vvVar3.a(mediaEditScreen);
                mx9Var.getClass();
                return new lx9(jLongValue, l, l2, mx9Var.a, mx9Var.b, mx9Var.c, mx9Var.d, mx9Var.e, mx9Var.f, mx9Var.g, mx9Var.h, mx9Var.i, mx9Var.j, mx9Var.k, mx9Var.l, mx9Var.m);
            case 1:
                zv8[] zv8VarArr2 = MediaEditScreen.w1;
                return a8gVar.e(mediaEditScreen.getContext()).j().b;
            case 2:
                y9h y9hVar = (y9h) mediaEditScreen.v.getAccessor().c(797);
                gjg gjgVar = mediaEditScreen.a2().y;
                vv vvVar4 = mediaEditScreen.q;
                zv8 zv8Var4 = MediaEditScreen.w1[0];
                t3f t3fVar = (t3f) vvVar4.a(mediaEditScreen);
                if (t3fVar == null || (t73VarB = sol.b(t3fVar)) == null) {
                    t73VarB = t73.b;
                }
                return y9hVar.a(gjgVar, t73VarB, new cw9(mediaEditScreen, 3), new fik(new cw9(mediaEditScreen, 1)));
            default:
                zv8[] zv8VarArr3 = MediaEditScreen.w1;
                return a8gVar.e(mediaEditScreen.getContext()).j().b;
        }
    }
}
