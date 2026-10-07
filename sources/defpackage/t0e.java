package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import one.me.android.root.RootController;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t0e extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ QrScannerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0e(lq4 lq4Var, QrScannerWidget qrScannerWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = qrScannerWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        QrScannerWidget qrScannerWidget = this.g;
        switch (i) {
            case 0:
                t0e t0eVar = new t0e(lq4Var, qrScannerWidget, 0);
                t0eVar.f = obj;
                return t0eVar;
            case 1:
                t0e t0eVar2 = new t0e(lq4Var, qrScannerWidget, 1);
                t0eVar2.f = obj;
                return t0eVar2;
            case 2:
                t0e t0eVar3 = new t0e(lq4Var, qrScannerWidget, 2);
                t0eVar3.f = obj;
                return t0eVar3;
            case 3:
                t0e t0eVar4 = new t0e(lq4Var, qrScannerWidget, 3);
                t0eVar4.f = obj;
                return t0eVar4;
            case 4:
                t0e t0eVar5 = new t0e(lq4Var, qrScannerWidget, 4);
                t0eVar5.f = obj;
                return t0eVar5;
            default:
                t0e t0eVar6 = new t0e(lq4Var, qrScannerWidget, 5);
                t0eVar6.f = obj;
                return t0eVar6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((t0e) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        n0e n0eVar;
        int i = this.e;
        Object obj2 = null;
        drawable = null;
        Drawable drawable = null;
        sbi sbiVar = sbi.a;
        QrScannerWidget qrScannerWidget = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                fhd fhdVar = (fhd) obj3;
                int i2 = fhdVar != null ? s0e.$EnumSwitchMapping$1[fhdVar.ordinal()] : -1;
                if (i2 != 1) {
                    if (i2 != 2) {
                        ore.o();
                        return null;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorWithStartAction = ((FrameLayout) qrScannerWidget.o.m(qrScannerWidget, QrScannerWidget.w[7])).animate().alpha(0.0f).setDuration(800L).setInterpolator((PathInterpolator) qrScannerWidget.v.getValue()).withStartAction(new r0e(qrScannerWidget, 0));
                    qrScannerWidget.s = viewPropertyAnimatorWithStartAction;
                    if (viewPropertyAnimatorWithStartAction != null) {
                        viewPropertyAnimatorWithStartAction.start();
                    }
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj3;
                if (rbbVar instanceof m0e) {
                    hve router = qrScannerWidget.getRouter();
                    zv zvVar = new zv();
                    zvVar.addLast(router);
                    while (!zvVar.isEmpty()) {
                        ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                        int iO0 = xw3.O0(arrayListE);
                        while (true) {
                            if (-1 < iO0) {
                                br4 br4Var = ((lve) arrayListE.get(iO0)).a;
                                if (br4Var instanceof n0e) {
                                    obj2 = br4Var;
                                    n0eVar = (n0e) obj2;
                                    if (n0eVar != null) {
                                        n0eVar.s0(((m0e) rbbVar).b);
                                    }
                                    l0e.b.b().f();
                                } else {
                                    Iterator it = new upe(br4Var.getChildRouters()).iterator();
                                    while (true) {
                                        ListIterator listIterator = ((tpe) it).b;
                                        if (listIterator.hasPrevious()) {
                                            zvVar.addLast((hve) listIterator.previous());
                                        } else {
                                            iO0--;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n0eVar = (n0e) obj2;
                    if (n0eVar != null) {
                        n0eVar.s0(((m0e) rbbVar).b);
                    }
                    l0e.b.b().f();
                } else if (rbbVar instanceof i65) {
                    zv8[] zv8VarArr = QrScannerWidget.w;
                    qrScannerWidget.p1();
                    l0e.b.e((i65) rbbVar);
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                ((Boolean) obj3).getClass();
                zv8[] zv8VarArr2 = QrScannerWidget.w;
                mjg mjgVar = qrScannerWidget.t1().n;
                Boolean bool = Boolean.FALSE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 0);
                zv8[] zv8VarArr3 = BottomSheetWidget.t;
                jc4 jc4VarC = p.c(R.string.permissions_allow_access, bundle, null, 4);
                jc4VarC.i(Integer.valueOf(R.drawable.icon_media));
                jc4VarC.g(new tnh(R.string.oneme_qrscanner_camera_request_description));
                jc4VarC.a(new kc4(R.id.qrscanner_allow_permission, new tnh(R.string.permissions_dialog_yes), 3, true, 3, 2), new kc4(R.id.qrscanner_not_allow_permission, new tnh(R.string.permissions_dialog_no), 2, true, 3, 2));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(qrScannerWidget);
                confirmationBottomSheetF.setTargetController(qrScannerWidget);
                br4 parentController = qrScannerWidget;
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
                return sbiVar;
            case 3:
                ch3.d0(obj);
                if (((Boolean) obj3).booleanValue()) {
                    zv8[] zv8VarArr4 = QrScannerWidget.w;
                    qrScannerWidget.t1().B(n1f.a);
                }
                return sbiVar;
            case 4:
                ch3.d0(obj);
                if (((Boolean) obj3).booleanValue()) {
                    zv8[] zv8VarArr5 = QrScannerWidget.w;
                    qrScannerWidget.p1();
                } else {
                    zv8[] zv8VarArr6 = QrScannerWidget.w;
                    qrScannerWidget.o1();
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                Integer num = (Integer) obj3;
                if (num != null && num.intValue() == 1) {
                    drawable = (Drawable) qrScannerWidget.i.getValue();
                } else if (num != null && num.intValue() == 0) {
                    drawable = (Drawable) qrScannerWidget.h.getValue();
                }
                if (drawable != null) {
                    ((m5c) qrScannerWidget.m.m(qrScannerWidget, QrScannerWidget.w[5])).b(drawable, "M14.446 0.606c1.097-1.181 3.024-0.003 2.473 1.512L14.318 9.27l4.577 0.653c1.181 0.169 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.511l2.601-7.152-4.577-0.653c-1.181-0.169-1.686-1.596-0.874-2.47L14.446 0.606z", yl5.d().getDisplayMetrics().density * 24.0f);
                }
                return sbiVar;
        }
    }
}
