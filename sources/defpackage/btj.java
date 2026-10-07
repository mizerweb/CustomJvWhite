package defpackage;

import java.util.List;
import one.me.webapp.settings.WebAppsSettingScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class btj extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ WebAppsSettingScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btj(lq4 lq4Var, WebAppsSettingScreen webAppsSettingScreen) {
        super(2, lq4Var);
        this.g = webAppsSettingScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        WebAppsSettingScreen webAppsSettingScreen = this.g;
        switch (i) {
            case 0:
                btj btjVar = new btj(webAppsSettingScreen, lq4Var);
                btjVar.f = obj;
                return btjVar;
            default:
                btj btjVar2 = new btj(lq4Var, webAppsSettingScreen);
                btjVar2.f = obj;
                return btjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((btj) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((btj) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        WebAppsSettingScreen webAppsSettingScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                webAppsSettingScreen.e.H((List) obj2);
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                zv8[] zv8VarArr = WebAppsSettingScreen.f;
                if (rbbVar instanceof rt3) {
                    webAppsSettingScreen.getRouter().D();
                } else if (rbbVar instanceof i65) {
                    qkj.b.e((i65) rbbVar);
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btj(WebAppsSettingScreen webAppsSettingScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = webAppsSettingScreen;
    }
}
