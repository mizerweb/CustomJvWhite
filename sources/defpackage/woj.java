package defpackage;

import one.me.webapp.settings.WebAppSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class woj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppSettingsScreen b;

    public /* synthetic */ woj(WebAppSettingsScreen webAppSettingsScreen, int i) {
        this.a = i;
        this.b = webAppSettingsScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        WebAppSettingsScreen webAppSettingsScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = WebAppSettingsScreen.j;
                cpj cpjVarO1 = webAppSettingsScreen.o1();
                yab.i0(cpjVarO1.b, ((n0c) ((xhh) cpjVarO1.i.getValue())).b(), 0, new fpf(cpjVarO1, null, 20), 2);
                break;
            default:
                zv8[] zv8VarArr2 = WebAppSettingsScreen.j;
                webAppSettingsScreen.getRouter().D();
                break;
        }
        return sbiVar;
    }
}
