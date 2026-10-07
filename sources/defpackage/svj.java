package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.collections.a;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class svj {
    public final /* synthetic */ int a;
    public final Widget b;
    public final ny8 c;

    public svj(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                ifh ifhVarD = new ca2(widget.m35getAccountScopeuqN4xOY()).getAccessor().d(35);
                this.b = widget;
                this.c = ifhVarD;
                break;
            default:
                this.b = widget;
                this.c = rx8.P(3, new xlf(6, this));
                break;
        }
    }

    private final void b(String[] strArr, int i, int i2, int i3, int i4, lsc lscVar) {
    }

    public static void e(svj svjVar, int i, Integer num, Intent intent, lsc lscVar, boolean z, Integer num2, int i2) {
        Integer num3 = (i2 & 2) != 0 ? null : num;
        Intent intent2 = (i2 & 4) != 0 ? null : intent;
        lsc lscVar2 = (i2 & 8) != 0 ? null : lscVar;
        boolean z2 = (i2 & 16) != 0 ? false : z;
        Integer num4 = (i2 & 32) != 0 ? null : num2;
        switch (svjVar.a) {
            case 0:
                e((svj) svjVar.c.getValue(), i, num3, intent2, new jsc(R.drawable.calls_avd), false, null, 48);
                break;
            default:
                zv8[] zv8VarArr = BottomSheetWidget.t;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, num3, lscVar2, intent2, z2, num4);
                br4 parentController = svjVar.b;
                permissionBottomSheet.setTargetController(parentController);
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(permissionBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                break;
        }
    }

    public final void a(String[] strArr, int i, int i2, int i3, int i4, lsc lscVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                zv8[] zv8VarArr = BottomSheetWidget.t;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4, lscVar);
                br4 parentController = this.b;
                permissionBottomSheet.setTargetController(parentController);
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(permissionBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                break;
        }
    }

    public final void c(int i, String[] strArr) {
        int i2 = this.a;
        ny8 ny8Var = this.c;
        switch (i2) {
            case 0:
                ((svj) ny8Var.getValue()).c(i, strArr);
                break;
            default:
                Widget widget = this.b;
                if (i != 180) {
                    widget.requestPermissions(strArr, i);
                } else {
                    lsi lsiVar = (lsi) ny8Var.getValue();
                    Context context = widget.getContext();
                    lsiVar.getClass();
                    String str = sj8.a;
                    sj8.k(context, lsiVar.a);
                }
                break;
        }
    }

    public final boolean d(String str) {
        switch (this.a) {
            case 0:
                return ((svj) this.c.getValue()).d(str);
            default:
                if (Build.VERSION.SDK_INT < 29 || !a.N0(wsc.q, str)) {
                    return this.b.shouldShowRequestPermissionRationale(str);
                }
                return true;
        }
    }
}
