package defpackage;

import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wu implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen b;

    public /* synthetic */ wu(AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, int i) {
        this.a = i;
        this.b = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AppearanceSettingsMultiThemeScreen.i;
                a8j.x(appearanceSettingsMultiThemeScreen.o1().s, rt3.b);
                return sbi.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                zsj zsjVar = appearanceSettingsMultiThemeScreen.h;
                return Boolean.valueOf(zsjVar.l() <= 0 ? false : ((aqh) ((k79) zsjVar.F(iIntValue))).a);
        }
    }
}
