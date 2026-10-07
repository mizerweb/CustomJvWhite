package defpackage;

import android.widget.EditText;
import one.me.android.root.RootController;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.multilang.LocaleBottomSheet;

/* JADX INFO: loaded from: classes.dex */
public final class sh8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ InputPhoneScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh8(lq4 lq4Var, InputPhoneScreen inputPhoneScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = inputPhoneScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        InputPhoneScreen inputPhoneScreen = this.g;
        switch (i) {
            case 0:
                sh8 sh8Var = new sh8(inputPhoneScreen, lq4Var, 0);
                sh8Var.f = obj;
                return sh8Var;
            case 1:
                sh8 sh8Var2 = new sh8(lq4Var, inputPhoneScreen, 1);
                sh8Var2.f = obj;
                return sh8Var2;
            case 2:
                sh8 sh8Var3 = new sh8(lq4Var, inputPhoneScreen, 2);
                sh8Var3.f = obj;
                return sh8Var3;
            case 3:
                sh8 sh8Var4 = new sh8(lq4Var, inputPhoneScreen, 3);
                sh8Var4.f = obj;
                return sh8Var4;
            case 4:
                sh8 sh8Var5 = new sh8(inputPhoneScreen, lq4Var, 4);
                sh8Var5.f = obj;
                return sh8Var5;
            default:
                sh8 sh8Var6 = new sh8(lq4Var, inputPhoneScreen, 5);
                sh8Var6.f = obj;
                return sh8Var6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((sh8) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((sh8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((sh8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((sh8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((sh8) create((ag9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((sh8) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        InputPhoneScreen inputPhoneScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                rbb rbbVar = (rbb) obj2;
                ch3.d0(obj);
                if (rbbVar instanceof qh8) {
                    qh8 qh8Var = (qh8) rbbVar;
                    ((bk8) inputPhoneScreen.p.getValue()).d(qh8Var.e(), qh8Var.d(), qh8Var.a(), qh8Var.b(), qh8Var.c());
                } else if (rbbVar instanceof oh8) {
                    LocaleBottomSheet localeBottomSheet = new LocaleBottomSheet(inputPhoneScreen.getB().b());
                    ln5 ln5Var = new ln5(localeBottomSheet, new mp5(26, inputPhoneScreen));
                    if (localeBottomSheet.getRouter() != null) {
                        localeBottomSheet.getRouter().a(ln5Var);
                    } else {
                        localeBottomSheet.addLifecycleListener(new bb(localeBottomSheet, ln5Var, 7));
                    }
                    inputPhoneScreen.s = localeBottomSheet;
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    localeBottomSheet.setTargetController(inputPhoneScreen);
                    br4 parentController = inputPhoneScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(localeBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (rbbVar instanceof i65) {
                    lg9.b.e((i65) rbbVar);
                } else if (rbbVar instanceof ph8) {
                    inputPhoneScreen.getRouter().N(new lve(new InputPhoneScreen(inputPhoneScreen.getArgs()), null, null, null, false, -1));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                if (!cqk.d((gh8) obj2, gh8.a)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                inputPhoneScreen.r1().setText("");
                return sbiVar;
            case 2:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr3 = InputPhoneScreen.v;
                inputPhoneScreen.p1().setEnabled(zBooleanValue);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                zv8[] zv8VarArr4 = InputPhoneScreen.v;
                r5c r5cVarR1 = inputPhoneScreen.r1();
                if (r5cVarR1.hasWindowFocus()) {
                    EditText editText = r5cVarR1.i;
                    editText.requestFocus();
                    editText.post(new o90(r5cVarR1, 20, editText));
                } else {
                    r5cVarR1.setOnWindowFocusChanged(new kl3(4, r5cVarR1));
                }
                return sbiVar;
            case 4:
                ag9 ag9Var = (ag9) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr5 = InputPhoneScreen.v;
                cyb cybVarP1 = inputPhoneScreen.p1();
                cybVarP1.setLoading(false);
                cybVarP1.setClickable(true);
                if (ag9Var instanceof uf9) {
                    InputPhoneScreen.o1(inputPhoneScreen, ((uf9) ag9Var).c.b(inputPhoneScreen.getContext()));
                } else if ((ag9Var instanceof wf9) || (ag9Var instanceof vf9) || (ag9Var instanceof sf9)) {
                    InputPhoneScreen.o1(inputPhoneScreen, ((yf9) ag9Var).c.b(inputPhoneScreen.getContext()));
                } else if (ag9Var instanceof xf9) {
                    uql.b(inputPhoneScreen);
                } else if (ag9Var instanceof zf9) {
                    zf9 zf9Var = (zf9) ag9Var;
                    ((pd0) inputPhoneScreen.q.getValue()).a(new nd0(zf9Var.b()));
                    kzi kziVar = new kzi(zf9Var.c(), zf9Var.a(), false);
                    inputPhoneScreen.a.getClass();
                    ku6.C(inputPhoneScreen, kziVar);
                } else if (!(ag9Var instanceof tf9)) {
                    if (ag9Var != null) {
                        ore.o();
                        return null;
                    }
                    InputPhoneScreen.o1(inputPhoneScreen, null);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                uu4 uu4Var = (uu4) obj2;
                pd0 pd0Var = (pd0) inputPhoneScreen.q.getValue();
                x0c x0cVar = uu4Var.a;
                int i2 = uu4Var.b;
                pd0Var.a(new od0("phone_country_changed", q1f.c(new ylc("phoneCountry", x0cVar.a))));
                x0c x0cVar2 = uu4Var.a;
                if ("".equals(x0cVar2.a)) {
                    inputPhoneScreen.r1().i.removeTextChangedListener(inputPhoneScreen.o);
                    inputPhoneScreen.o = null;
                } else {
                    sk8 sk8Var = inputPhoneScreen.o;
                    if (sk8Var == null) {
                        inputPhoneScreen.o = new sk8((vtc) inputPhoneScreen.n.getValue(), x0cVar2.a, x0cVar2.b, i2);
                        sk8 sk8Var2 = inputPhoneScreen.o;
                        if (sk8Var2 != null) {
                            inputPhoneScreen.r1().i.addTextChangedListener(sk8Var2);
                        }
                    } else {
                        sk8Var.b(x0cVar2.b, x0cVar2.a);
                        sk8 sk8Var3 = inputPhoneScreen.o;
                        if (sk8Var3 != null) {
                            sk8Var3.g = i2;
                        }
                    }
                }
                CharSequence charSequenceB = uu4Var.c.b(inputPhoneScreen.getContext());
                CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
                r5c r5cVarR2 = inputPhoneScreen.r1();
                r5cVarR2.setHint(charSequence);
                r5cVarR2.setCountry(x0cVar2);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh8(InputPhoneScreen inputPhoneScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = inputPhoneScreen;
    }
}
