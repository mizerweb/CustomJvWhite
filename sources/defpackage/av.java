package defpackage;

import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class av extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public u93 f;
    public int g;
    public final /* synthetic */ u93 h;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(u93 u93Var, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = u93Var;
        this.i = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.i;
        u93 u93Var = this.h;
        switch (i) {
            case 0:
                return new av(u93Var, appearanceSettingsMultiThemeScreen, lq4Var, 0);
            default:
                return new av(u93Var, appearanceSettingsMultiThemeScreen, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((av) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.i;
        u93 u93Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                    lv lvVarO1 = appearanceSettingsMultiThemeScreen.o1();
                    this.f = u93Var;
                    this.g = 1;
                    obj = lvVarO1.F(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u93Var = this.f;
                    ch3.d0(obj);
                }
                u93Var.a((t93) obj);
                return sbiVar;
            default:
                int i3 = this.g;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr2 = AppearanceSettingsMultiThemeScreen.i;
                    lv lvVarO2 = appearanceSettingsMultiThemeScreen.o1();
                    this.f = u93Var;
                    this.g = 1;
                    obj = lvVarO2.F(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u93Var = this.f;
                    ch3.d0(obj);
                }
                u93Var.a((t93) obj);
                return sbiVar;
        }
    }
}
