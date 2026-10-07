package defpackage;

import android.net.Uri;
import java.util.List;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AboutAppSettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(lq4 lq4Var, AboutAppSettingsScreen aboutAppSettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = aboutAppSettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AboutAppSettingsScreen aboutAppSettingsScreen = this.g;
        switch (i) {
            case 0:
                o oVar = new o(lq4Var, aboutAppSettingsScreen, 0);
                oVar.f = obj;
                return oVar;
            default:
                o oVar2 = new o(lq4Var, aboutAppSettingsScreen, 1);
                oVar2.f = obj;
                return oVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((o) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((o) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        AboutAppSettingsScreen aboutAppSettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                aboutAppSettingsScreen.c.H((List) obj2);
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (cqk.d(rbbVar, rt3.b)) {
                    aboutAppSettingsScreen.getRouter().D();
                } else if (rbbVar instanceof C0047t) {
                    it3.a(aboutAppSettingsScreen.getContext(), ((C0047t) rbbVar).b);
                } else if (rbbVar instanceof w) {
                    Uri uriI = ((ju6) aboutAppSettingsScreen.a.getAccessor().c(179)).i(aboutAppSettingsScreen.getContext(), ((w) rbbVar).b.toFile());
                    dp4.c(uriI);
                    String str = sj8.a;
                    sj8.i(aboutAppSettingsScreen.getContext(), uriI, "*/*");
                } else if (rbbVar instanceof v) {
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.about_app_send_report_dialog_title, null, null, 6);
                    jc4VarC.a(new kc4(2, new tnh(R.string.about_app_send_report_dialog_decline), 3, true, 3, 2), new kc4(1, new tnh(R.string.about_app_send_report_dialog_accept), 2, 32));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(aboutAppSettingsScreen);
                    confirmationBottomSheetF.setTargetController(aboutAppSettingsScreen);
                    br4 parentController = aboutAppSettingsScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (rbbVar instanceof u) {
                    a0 a0Var = a0.b;
                    long j = ((u) rbbVar).b;
                    o65 o65VarB = a0Var.b();
                    n65 n65Var = new n65();
                    n65Var.a = ":chats";
                    n65Var.d(Long.valueOf(j), "id");
                    n65Var.d("local", "type");
                    o65.e(o65VarB, n65Var.a(), null, null, 4);
                }
                break;
        }
        return sbiVar;
    }
}
