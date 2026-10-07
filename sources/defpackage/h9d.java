package defpackage;

import java.util.List;
import one.me.android.root.RootController;
import one.me.finishbottomsheet.PollFinishBottomSheet;
import one.me.polls.screens.result.PollResultScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h9d extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PollResultScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9d(lq4 lq4Var, PollResultScreen pollResultScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = pollResultScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PollResultScreen pollResultScreen = this.g;
        switch (i) {
            case 0:
                h9d h9dVar = new h9d(lq4Var, pollResultScreen, 0);
                h9dVar.f = obj;
                return h9dVar;
            case 1:
                h9d h9dVar2 = new h9d(lq4Var, pollResultScreen, 1);
                h9dVar2.f = obj;
                return h9dVar2;
            case 2:
                h9d h9dVar3 = new h9d(lq4Var, pollResultScreen, 2);
                h9dVar3.f = obj;
                return h9dVar3;
            case 3:
                h9d h9dVar4 = new h9d(lq4Var, pollResultScreen, 3);
                h9dVar4.f = obj;
                return h9dVar4;
            default:
                h9d h9dVar5 = new h9d(lq4Var, pollResultScreen, 4);
                h9dVar5.f = obj;
                return h9dVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((h9d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((h9d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((h9d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((h9d) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((h9d) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        PollResultScreen pollResultScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ((rcc) pollResultScreen.i.m(pollResultScreen, PollResultScreen.k[3])).setTitle((String) obj2);
                return sbiVar;
            case 1:
                ch3.d0(obj);
                pollResultScreen.j.H((List) obj2);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (cqk.d(rbbVar, rt3.b)) {
                    mad.b.b().f();
                } else if (rbbVar instanceof i65) {
                    mad.b.e((i65) rbbVar);
                } else if (rbbVar instanceof agc) {
                    zv8[] zv8VarArr = BottomSheetWidget.t;
                    agc agcVar = (agc) rbbVar;
                    PollFinishBottomSheet pollFinishBottomSheet = new PollFinishBottomSheet(pollResultScreen.b, agcVar.b, agcVar.c, agcVar.d);
                    pollFinishBottomSheet.setTargetController(pollResultScreen);
                    br4 parentController = pollResultScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(pollFinishBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbiVar;
            case 3:
                ch3.d0(obj);
                p3g p3gVar = (p3g) obj2;
                if (p3gVar == null) {
                    ore.o();
                    return null;
                }
                tnh tnhVar = p3gVar.a;
                zv8[] zv8VarArr2 = PollResultScreen.k;
                h8c h8cVar = new h8c(pollResultScreen);
                h8cVar.m(tnhVar);
                h8cVar.a(null);
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
                return sbiVar;
            default:
                ch3.d0(obj);
                g8d g8dVar = (g8d) obj2;
                if (g8dVar instanceof e8d) {
                    e8d e8dVar = (e8d) g8dVar;
                    ynh ynhVar = e8dVar.a;
                    ynh ynhVar2 = e8dVar.b;
                    zv8[] zv8VarArr3 = PollResultScreen.k;
                    h8c h8cVar2 = new h8c(pollResultScreen);
                    h8cVar2.m(ynhVar);
                    h8cVar2.a(ynhVar2);
                    h8cVar2.h(new w8c(R.drawable.icon_warning));
                    h8cVar2.p();
                } else {
                    if (!cqk.d(g8dVar, f8d.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr4 = PollResultScreen.k;
                    a8j.x(pollResultScreen.o1().t, rt3.b);
                }
                return sbiVar;
        }
    }
}
