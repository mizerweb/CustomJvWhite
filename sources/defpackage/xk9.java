package defpackage;

import android.view.View;
import java.util.Map;
import one.me.android.root.RootController;
import one.me.main.MainScreen;
import one.me.main.accountswitcher.AccountSwitcherBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes.dex */
public final class xk9 implements View.OnLongClickListener {
    public final /* synthetic */ MainScreen a;
    public final /* synthetic */ rxb b;

    public xk9(MainScreen mainScreen, rxb rxbVar) {
        this.a = mainScreen;
        this.b = rxbVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MainScreen mainScreen = this.a;
        rxb rxbVar = this.b;
        String str = mainScreen.t;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "handleLongClick, item=" + rxbVar, null);
            }
        }
        String str2 = rxbVar.d;
        pk9.c.getClass();
        if (str2.equals(v65.a(pk9.h.a))) {
            y6b y6bVar = (y6b) mainScreen.d.getValue();
            if (y6bVar.c && (((Number) y6bVar.i.getValue()).intValue() > 1 || ((Map) y6bVar.h.a.getValue()).size() > 1)) {
                zv8[] zv8VarArr = BottomSheetWidget.t;
                AccountSwitcherBottomSheet accountSwitcherBottomSheet = new AccountSwitcherBottomSheet(mainScreen.e);
                accountSwitcherBottomSheet.setTargetController(mainScreen);
                br4 parentController = mainScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(accountSwitcherBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "account_switcher");
                    hveVarU1.I(lveVar);
                }
                return true;
            }
        }
        return false;
    }
}
