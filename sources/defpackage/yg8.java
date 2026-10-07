package defpackage;

import one.me.login.inputname.InputNameScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yg8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ yg8(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        boolean z;
        boolean z2;
        int i = this.a;
        InputNameScreen inputNameScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = InputNameScreen.r;
                return new bk8(inputNameScreen.getRouter(), inputNameScreen.getB());
            case 1:
                zv8[] zv8VarArr2 = InputNameScreen.r;
                vv vvVar = inputNameScreen.b;
                zv8[] zv8VarArr3 = InputNameScreen.r;
                zv8 zv8Var = zv8VarArr3[0];
                String str = (String) vvVar.a(inputNameScreen);
                vv vvVar2 = inputNameScreen.c;
                zv8 zv8Var2 = zv8VarArr3[1];
                return new fh8(str, (String) vvVar2.a(inputNameScreen), inputNameScreen.d.getAccessor().d(24));
            default:
                zv8[] zv8VarArr4 = InputNameScreen.r;
                fh8 fh8VarS1 = inputNameScreen.s1();
                vv vvVar3 = inputNameScreen.p;
                zv8 zv8Var3 = InputNameScreen.r[5];
                String str2 = (String) vvVar3.a(inputNameScreen);
                String strR1 = inputNameScreen.r1();
                ks9 ks9Var = fh8VarS1.h;
                ic6 ic6Var = fh8VarS1.i;
                sx3 sx3VarF = ks9Var.F(1, str2);
                ynh ynhVar = sx3VarF != null ? (ynh) ww3.t1(sx3VarF.a) : null;
                if (ynhVar != null) {
                    a8j.x(ic6Var, new ug8(1, ynhVar));
                    z = false;
                } else {
                    z = true;
                }
                sx3 sx3VarF2 = fh8VarS1.h.F(2, strR1);
                ynh ynhVar2 = sx3VarF2 != null ? (ynh) ww3.t1(sx3VarF2.a) : null;
                if (ynhVar2 != null) {
                    a8j.x(ic6Var, new ug8(2, ynhVar2));
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    a8j.x(fh8VarS1.g, new xg8(new xge(fh8VarS1.d, fh8VarS1.e, str2, strR1, null)));
                }
                inputNameScreen.o1().setActiveButtonLoaderState(!(inputNameScreen.p1().l() || inputNameScreen.q1().l()));
                return sbi.a;
        }
    }
}
