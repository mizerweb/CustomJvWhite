package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.devices.SettingsDevicesScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lrf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SettingsDevicesScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lrf(lq4 lq4Var, SettingsDevicesScreen settingsDevicesScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = settingsDevicesScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SettingsDevicesScreen settingsDevicesScreen = this.g;
        switch (i) {
            case 0:
                lrf lrfVar = new lrf(lq4Var, settingsDevicesScreen, 0);
                lrfVar.f = obj;
                return lrfVar;
            case 1:
                lrf lrfVar2 = new lrf(lq4Var, settingsDevicesScreen, 1);
                lrfVar2.f = obj;
                return lrfVar2;
            default:
                lrf lrfVar3 = new lrf(lq4Var, settingsDevicesScreen, 2);
                lrfVar3.f = obj;
                return lrfVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((lrf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((lrf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((lrf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        SettingsDevicesScreen settingsDevicesScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                settingsDevicesScreen.j.H((List) obj2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                grf grfVar = (grf) obj2;
                if (cqk.d(grfVar, ile.a)) {
                    yd0 yd0Var = (yd0) settingsDevicesScreen.e.getValue();
                    yd0Var.getClass();
                    yd0.a(yd0Var, 2, 0, null, 6);
                    wsc.q((wsc) settingsDevicesScreen.d.getValue(), new svj(settingsDevicesScreen, 1), wsc.n, 158, R.string.settings_devices_camera_request_description, 0, new jsc(R.drawable.icon_camera), 16);
                    return sbiVar;
                }
                if (grfVar instanceof rfc) {
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    rfc rfcVar = (rfc) grfVar;
                    jc4 jc4VarA = mol.a(rfcVar.a, null, null, 6);
                    Iterator it = rfcVar.b.iterator();
                    while (it.hasNext()) {
                        jc4VarA.a((kc4) it.next());
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(settingsDevicesScreen);
                    confirmationBottomSheetF.setTargetController(settingsDevicesScreen);
                    br4 parentController = settingsDevicesScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 == null) {
                        return sbiVar;
                    }
                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                    return sbiVar;
                }
                if (grfVar instanceof zbg) {
                    g8c g8cVar = settingsDevicesScreen.h;
                    if (g8cVar != null) {
                        g8cVar.b();
                    }
                    settingsDevicesScreen.h = null;
                    return sbiVar;
                }
                if (!(grfVar instanceof bcg)) {
                    ore.o();
                    return null;
                }
                g8c g8cVar2 = settingsDevicesScreen.h;
                if (g8cVar2 != null) {
                    g8cVar2.a();
                }
                h8c h8cVar = (h8c) settingsDevicesScreen.g.getValue();
                bcg bcgVar = (bcg) grfVar;
                h8cVar.m(bcgVar.a);
                h8cVar.a(bcgVar.c);
                h8cVar.h(new w8c(bcgVar.b));
                h8cVar.c(new o8c(0, 0, bcgVar.d, 11));
                settingsDevicesScreen.h = h8cVar.p();
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof ggc) {
                    String str = sj8.a;
                    sj8.g(settingsDevicesScreen.getContext());
                } else if (rbbVar instanceof rt3) {
                    hrf.b.b().f();
                } else if (rbbVar instanceof i65) {
                    a8j.x(settingsDevicesScreen.o1().q, zbg.a);
                    hrf.b.e((i65) rbbVar);
                }
                return sbiVar;
        }
    }
}
