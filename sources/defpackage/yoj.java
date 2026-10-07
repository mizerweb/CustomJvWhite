package defpackage;

import one.me.webapp.settings.WebAppSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class yoj implements vsj {
    public final /* synthetic */ WebAppSettingsScreen a;

    public yoj(WebAppSettingsScreen webAppSettingsScreen) {
        this.a = webAppSettingsScreen;
    }

    @Override // defpackage.vsj
    public final void a(ssj ssjVar, boolean z) {
        zv8[] zv8VarArr = WebAppSettingsScreen.j;
        cpj cpjVarO1 = this.a.o1();
        cpjVarO1.p.B(cpjVarO1, cpj.r[0], yab.h0(cpjVarO1.b, ((n0c) ((xhh) cpjVarO1.i.getValue())).b(), 2, new g02(cpjVarO1, z, null, 9)));
        cpjVarO1.B();
    }

    @Override // defpackage.vsj
    public final void b(usj usjVar) {
        zv8[] zv8VarArr = WebAppSettingsScreen.j;
        cpj cpjVarO1 = this.a.o1();
        if (usjVar instanceof tsj) {
            a8j.x(cpjVarO1.o, new apj(((tsj) usjVar).b));
        } else {
            cpjVarO1.getClass();
        }
    }
}
