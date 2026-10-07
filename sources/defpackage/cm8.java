package defpackage;

import one.me.android.root.RootController;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cm8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InviteByPhoneScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm8(InviteByPhoneScreen inviteByPhoneScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 4;
        this.g = inviteByPhoneScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        InviteByPhoneScreen inviteByPhoneScreen = this.g;
        switch (i) {
            case 0:
                cm8 cm8Var = new cm8(lq4Var, inviteByPhoneScreen, 0);
                cm8Var.f = obj;
                return cm8Var;
            case 1:
                cm8 cm8Var2 = new cm8(lq4Var, inviteByPhoneScreen, 1);
                cm8Var2.f = obj;
                return cm8Var2;
            case 2:
                cm8 cm8Var3 = new cm8(lq4Var, inviteByPhoneScreen, 2);
                cm8Var3.f = obj;
                return cm8Var3;
            case 3:
                cm8 cm8Var4 = new cm8(lq4Var, inviteByPhoneScreen, 3);
                cm8Var4.f = obj;
                return cm8Var4;
            default:
                cm8 cm8Var5 = new cm8(inviteByPhoneScreen, lq4Var);
                cm8Var5.f = obj;
                return cm8Var5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((cm8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((cm8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((cm8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((cm8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((cm8) create((xl8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InviteByPhoneScreen inviteByPhoneScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                uu4 uu4Var = (uu4) obj2;
                x0c x0cVar = uu4Var.a;
                int i2 = uu4Var.b;
                x0c x0cVar2 = uu4Var.a;
                if (cqk.d(x0cVar.a, "")) {
                    zv8[] zv8VarArr = InviteByPhoneScreen.p;
                    inviteByPhoneScreen.q1().i.removeTextChangedListener(inviteByPhoneScreen.n);
                    inviteByPhoneScreen.n = null;
                } else {
                    sk8 sk8Var = inviteByPhoneScreen.n;
                    if (sk8Var == null) {
                        inviteByPhoneScreen.n = new sk8((vtc) inviteByPhoneScreen.m.getValue(), x0cVar2.a, x0cVar2.b, i2);
                        sk8 sk8Var2 = inviteByPhoneScreen.n;
                        if (sk8Var2 != null) {
                            inviteByPhoneScreen.q1().i.addTextChangedListener(sk8Var2);
                        }
                    } else {
                        sk8Var.b(x0cVar2.b, x0cVar2.a);
                        sk8 sk8Var3 = inviteByPhoneScreen.n;
                        if (sk8Var3 != null) {
                            sk8Var3.g = i2;
                        }
                    }
                }
                CharSequence charSequenceB = uu4Var.c.b(inviteByPhoneScreen.getContext());
                CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
                r5c r5cVarQ1 = inviteByPhoneScreen.q1();
                r5cVarQ1.setHint(charSequence);
                r5cVarQ1.setCountry(x0cVar2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                am8 am8Var = (am8) obj2;
                if (am8Var instanceof zl8) {
                    ((uj4) inviteByPhoneScreen.l.getValue()).a(inviteByPhoneScreen.getContext(), ((zl8) am8Var).a);
                } else {
                    if (!(am8Var instanceof yl8)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr2 = InviteByPhoneScreen.p;
                    inviteByPhoneScreen.q1().setText("");
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    ml9.b(inviteByPhoneScreen);
                    yl2.a(inviteByPhoneScreen);
                    rl8.b.e((i65) rbbVar);
                }
                return sbiVar;
            case 3:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr3 = InviteByPhoneScreen.p;
                inviteByPhoneScreen.p1().setEnabled(zBooleanValue);
                return sbiVar;
            default:
                xl8 xl8Var = (xl8) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr4 = InviteByPhoneScreen.p;
                cyb cybVarP1 = inviteByPhoneScreen.p1();
                boolean z = false;
                cybVarP1.setLoading(false);
                cybVarP1.setClickable(true);
                if (xl8Var instanceof tl8) {
                    InviteByPhoneScreen.o1(inviteByPhoneScreen, ((tl8) xl8Var).a.b(inviteByPhoneScreen.getContext()));
                } else if (xl8Var instanceof ul8) {
                    ul8 ul8Var = (ul8) xl8Var;
                    kzi kziVar = new kzi(ul8Var.a, ul8Var.b, z);
                    inviteByPhoneScreen.a.getClass();
                    ku6.C(inviteByPhoneScreen, kziVar);
                } else if (xl8Var instanceof vl8) {
                    tol.b(inviteByPhoneScreen);
                } else if (xl8Var instanceof wl8) {
                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.oneme_too_many_requests_bottomsheet_title, null, null, 6);
                    jc4VarC.g(new tnh(R.string.oneme_too_many_requests_bottomsheet_subtitle));
                    jc4VarC.d(R.id.oneme_too_many_requests_bottomsheet_positive_button, new tnh(R.string.oneme_too_many_requests_bottomsheet_positive_button));
                    ConfirmationBottomSheet confirmationBottomSheetE = jc4VarC.e(inviteByPhoneScreen.getB().b());
                    confirmationBottomSheetE.setTargetController(inviteByPhoneScreen);
                    br4 parentController = inviteByPhoneScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetE, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else {
                    if (xl8Var != null) {
                        ore.o();
                        return null;
                    }
                    InviteByPhoneScreen.o1(inviteByPhoneScreen, null);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm8(lq4 lq4Var, InviteByPhoneScreen inviteByPhoneScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = inviteByPhoneScreen;
    }
}
