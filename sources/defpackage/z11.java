package defpackage;

import android.widget.TextView;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import one.me.stories.viewer.viewer.widgets.bottominfo.BottomStoryInfoWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class z11 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BottomStoryInfoWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z11(lq4 lq4Var, BottomStoryInfoWidget bottomStoryInfoWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = bottomStoryInfoWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        BottomStoryInfoWidget bottomStoryInfoWidget = this.g;
        switch (i) {
            case 0:
                z11 z11Var = new z11(lq4Var, bottomStoryInfoWidget, 0);
                z11Var.f = obj;
                return z11Var;
            case 1:
                z11 z11Var2 = new z11(lq4Var, bottomStoryInfoWidget, 1);
                z11Var2.f = obj;
                return z11Var2;
            default:
                z11 z11Var3 = new z11(lq4Var, bottomStoryInfoWidget, 2);
                z11Var3.f = obj;
                return z11Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((z11) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((z11) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((z11) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

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
        int i = this.e;
        sbi sbiVar = sbi.a;
        BottomStoryInfoWidget bottomStoryInfoWidget = this.g;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                lsg lsgVar = (lsg) obj2;
                long jC = lsgVar.c();
                Long l = bottomStoryInfoWidget.b;
                if (l == null || jC != l.longValue()) {
                    bottomStoryInfoWidget.b = new Long(jC);
                    bottomStoryInfoWidget.a = true;
                }
                w11 w11VarP1 = bottomStoryInfoWidget.p1();
                long jC2 = lsgVar.c();
                long jI = lsgVar.i();
                int iD = lsgVar.d();
                Long l2 = w11VarP1.A;
                p3c p3cVar = w11VarP1.w;
                if (l2 == null || jC2 != l2.longValue()) {
                    w11VarP1.A = Long.valueOf(jC2);
                    p3c p3cVar2 = w11VarP1.x;
                    zv8[] zv8VarArr = w11.B;
                    p3cVar2.B(w11VarP1, zv8VarArr[2], null);
                    w11VarP1.y.B(w11VarP1, zv8VarArr[3], null);
                    mjg mjgVar = w11VarP1.p;
                    mjgVar.getClass();
                    r66 r66Var = r66.a;
                    mjgVar.j(null, r66Var);
                    mjg mjgVar2 = w11VarP1.r;
                    k7e k7eVar = new k7e(r66Var, 1, false);
                    mjgVar2.getClass();
                    mjgVar2.j(null, k7eVar);
                    mjg mjgVar3 = w11VarP1.i;
                    hwg hwgVar = new hwg(null, null);
                    mjgVar3.getClass();
                    mjgVar3.j(null, hwgVar);
                    mjg mjgVar4 = w11VarP1.k;
                    Boolean bool = Boolean.FALSE;
                    mjgVar4.getClass();
                    mjgVar4.j(null, bool);
                    if (iD <= 0) {
                        p3cVar.B(w11VarP1, zv8VarArr[1], null);
                        w11VarP1.j.setValue(null);
                    } else {
                        p3cVar.B(w11VarP1, zv8VarArr[1], a8j.t(w11VarP1, null, new v11(iD, jI, w11VarP1, null), 1));
                    }
                    w11VarP1.v.B(w11VarP1, zv8VarArr[0], yab.h0(w11VarP1.b, ((n0c) ((xhh) w11VarP1.g.getValue())).a(), 2, new u11(1, jC2, w11VarP1, null)));
                }
                return sbiVar;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                qxg qxgVar = (qxg) obj3;
                if (qxgVar == null) {
                    ore.o();
                    return null;
                }
                boolean z = qxgVar.a;
                zv8[] zv8VarArr2 = BottomStoryInfoWidget.j;
                zv8[] zv8VarArr3 = BottomSheetWidget.t;
                StoryViewsBottomSheet storyViewsBottomSheet = new StoryViewsBottomSheet(bottomStoryInfoWidget.getA(), z);
                storyViewsBottomSheet.setTargetController(bottomStoryInfoWidget);
                br4 parentController = bottomStoryInfoWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(storyViewsBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                return sbiVar;
            default:
                Object obj4 = this.f;
                ch3.d0(obj);
                d21 d21Var = (d21) obj4;
                if (d21Var instanceof a21) {
                    j8e j8eVar = bottomStoryInfoWidget.i;
                    a21 a21Var = (a21) d21Var;
                    Integer num = a21Var.b;
                    Integer num2 = a21Var.a;
                    zv8[] zv8VarArr4 = BottomStoryInfoWidget.j;
                    boolean z2 = num2 != null;
                    boolean z3 = num != null;
                    boolean z4 = num2 != null && num2.intValue() > 0;
                    boolean z5 = num != null && num.intValue() > 0;
                    boolean z6 = z2 && z3 && !z4 && !z5;
                    j8e j8eVar2 = bottomStoryInfoWidget.h;
                    zv8[] zv8VarArr5 = BottomStoryInfoWidget.j;
                    ((TextView) j8eVar2.m(bottomStoryInfoWidget, zv8VarArr5[2])).setVisibility(z6 ? 0 : 8);
                    if (z2) {
                        if (z4) {
                            bottomStoryInfoWidget.q1().setVisibility(0);
                            gwg gwgVarQ1 = bottomStoryInfoWidget.q1();
                            boolean z7 = !bottomStoryInfoWidget.a;
                            v0c v0cVar = gwgVarQ1.g;
                            if (v0cVar != null) {
                                v0cVar.b(num2, z7, true);
                            }
                        } else {
                            bottomStoryInfoWidget.q1().setVisibility(8);
                            bottomStoryInfoWidget.q1().b();
                        }
                    }
                    if (z3) {
                        if (z5) {
                            bottomStoryInfoWidget.o1().setVisibility(0);
                            gwg gwgVarO1 = bottomStoryInfoWidget.o1();
                            boolean z8 = !bottomStoryInfoWidget.a;
                            v0c v0cVar2 = gwgVarO1.g;
                            if (v0cVar2 != null) {
                                v0cVar2.b(num, z8, true);
                            }
                        } else {
                            bottomStoryInfoWidget.o1().setVisibility(8);
                            bottomStoryInfoWidget.o1().b();
                        }
                    }
                    if (z2 && z3) {
                        bottomStoryInfoWidget.a = false;
                    }
                    ((r2h) j8eVar.m(bottomStoryInfoWidget, zv8VarArr5[3])).setVisibility(8);
                    String str = a21Var.c;
                    if (str != null) {
                        ((r2h) j8eVar.m(bottomStoryInfoWidget, zv8VarArr5[3])).setTime(str);
                    }
                } else if (d21Var instanceof b21) {
                    zv8[] zv8VarArr6 = BottomStoryInfoWidget.j;
                    bottomStoryInfoWidget.q1().setVisibility(8);
                    bottomStoryInfoWidget.q1().b();
                    bottomStoryInfoWidget.o1().setVisibility(8);
                    bottomStoryInfoWidget.o1().b();
                    j8e j8eVar3 = bottomStoryInfoWidget.i;
                    zv8[] zv8VarArr7 = BottomStoryInfoWidget.j;
                    ((r2h) j8eVar3.m(bottomStoryInfoWidget, zv8VarArr7[3])).setVisibility(8);
                    ((TextView) bottomStoryInfoWidget.h.m(bottomStoryInfoWidget, zv8VarArr7[2])).setVisibility(0);
                } else if (!cqk.d(d21Var, c21.a)) {
                    ore.o();
                    return null;
                }
                return sbiVar;
        }
    }
}
