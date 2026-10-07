package defpackage;

import one.me.webapp.settings.WebAppsSettingScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ctj implements vsj {
    public final /* synthetic */ WebAppsSettingScreen a;

    public ctj(WebAppsSettingScreen webAppsSettingScreen) {
        this.a = webAppsSettingScreen;
    }

    @Override // defpackage.vsj
    public final void b(usj usjVar) {
        zv8[] zv8VarArr = WebAppsSettingScreen.f;
        dtj dtjVar = (dtj) this.a.c.getValue();
        dtjVar.getClass();
        if ((usjVar instanceof ssj) || (usjVar instanceof rsj)) {
            return;
        }
        if (usjVar instanceof tsj) {
            a8j.x(dtjVar.h, ((tsj) usjVar).b);
        } else {
            ore.o();
        }
    }
}
