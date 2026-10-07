package defpackage;

import java.util.Set;
import one.me.android.root.RootController;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class j97 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ForwardPickerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j97(lq4 lq4Var, ForwardPickerScreen forwardPickerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = forwardPickerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ForwardPickerScreen forwardPickerScreen = this.g;
        switch (i) {
            case 0:
                j97 j97Var = new j97(lq4Var, forwardPickerScreen, 0);
                j97Var.f = obj;
                return j97Var;
            default:
                j97 j97Var2 = new j97(lq4Var, forwardPickerScreen, 1);
                j97Var2.f = obj;
                return j97Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((j97) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((j97) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ia8 ia8Var;
        n65 n65Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        ForwardPickerScreen forwardPickerScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((Boolean) obj2).getClass();
                zv8[] zv8VarArr = ForwardPickerScreen.z;
                forwardPickerScreen.C1().setStartIconDrawable(((u87) forwardPickerScreen.x1().d).g());
                return sbiVar;
            default:
                ch3.d0(obj);
                a97 a97Var = (a97) obj2;
                if (a97Var instanceof v87) {
                    v87 v87Var = (v87) a97Var;
                    Long l = v87Var.a;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        yl2.a(forwardPickerScreen);
                        r87 r87Var = r87.b;
                        Long l2 = v87Var.b;
                        Set set = v87Var.c;
                        Long l3 = v87Var.d;
                        Boolean boolValueOf = Boolean.valueOf(v87Var.e);
                        o65 o65VarB = r87Var.b();
                        n65 n65Var2 = new n65();
                        n65Var2.a = ":chats";
                        n65Var2.d(Long.valueOf(jLongValue), "id");
                        n65Var2.d("local", "type");
                        n65Var2.d(Boolean.TRUE, "from_forward");
                        if (l2 != null) {
                            n65Var2.d(Long.valueOf(l2.longValue()), "forward_cht_id");
                        }
                        if (set != null) {
                            n65Var = n65Var2;
                            n65Var.d(ww3.z1(set, ",", null, null, null, 62), "forward_msg_ids");
                        } else {
                            n65Var = n65Var2;
                        }
                        if (l3 != null) {
                            n65Var.d(Long.valueOf(l3.longValue()), "forward_attach_id");
                        }
                        n65Var.d(boolValueOf, "is_forward_attach");
                        o65.e(o65VarB, n65Var.a(), null, null, 4);
                    } else {
                        r87.b.b().f();
                    }
                    n87 n87Var = v87Var.f;
                    if (n87Var == null || (ia8Var = (ia8) forwardPickerScreen.k.getAccessor().f()) == null) {
                        return sbiVar;
                    }
                    ia8Var.f(n87Var.a, n87Var.b);
                    return sbiVar;
                }
                if (a97Var instanceof y87) {
                    forwardPickerScreen.p = new fj3(27, forwardPickerScreen);
                    return sbiVar;
                }
                if (a97Var instanceof x87) {
                    forwardPickerScreen.d0(true);
                    return sbiVar;
                }
                if (a97Var instanceof w87) {
                    forwardPickerScreen.d0(false);
                    txc txcVarX1 = forwardPickerScreen.x1();
                    txcVarX1.d.d();
                    txcVarX1.h.setValue(ui9.a);
                    return sbiVar;
                }
                if (!(a97Var instanceof z87)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr2 = BottomSheetWidget.t;
                z87 z87Var = (z87) a97Var;
                jc4 jc4VarA = mol.a(z87Var.a, null, null, 6);
                jc4VarA.g(z87Var.b);
                z87Var.c.forEach(new ob3(2, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 8)));
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(forwardPickerScreen);
                confirmationBottomSheetF.setTargetController(forwardPickerScreen);
                br4 parentController = forwardPickerScreen;
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
    }
}
