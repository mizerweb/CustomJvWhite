package defpackage;

import one.me.stickerssettings.stickersscreen.StickersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jng implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ jng(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StickersScreen stickersScreen = this.b;
        switch (i) {
            case 0:
                upg upgVar = (upg) stickersScreen.d.getAccessor().c(399);
                kng kngVar = stickersScreen.a;
                vv vvVar = stickersScreen.b;
                zv8[] zv8VarArr = StickersScreen.m;
                zv8 zv8Var = zv8VarArr[0];
                long jLongValue = ((Number) vvVar.a(stickersScreen)).longValue();
                vv vvVar2 = stickersScreen.c;
                zv8 zv8Var2 = zv8VarArr[1];
                boolean zBooleanValue = ((Boolean) vvVar2.a(stickersScreen)).booleanValue();
                upgVar.getClass();
                return new spg(kngVar, jLongValue, zBooleanValue, upgVar.a, upgVar.b, upgVar.c, upgVar.d, upgVar.e, upgVar.f, upgVar.g, upgVar.h, upgVar.i);
            default:
                zv8[] zv8VarArr2 = StickersScreen.m;
                return new zmg(stickersScreen.getContext());
        }
    }
}
