package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class s54 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ComplaintBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s54(lq4 lq4Var, ComplaintBottomSheet complaintBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = complaintBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ComplaintBottomSheet complaintBottomSheet = this.g;
        switch (i) {
            case 0:
                s54 s54Var = new s54(lq4Var, complaintBottomSheet, 0);
                s54Var.f = obj;
                return s54Var;
            default:
                s54 s54Var2 = new s54(lq4Var, complaintBottomSheet, 1);
                s54Var2.f = obj;
                return s54Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((s54) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((s54) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        ComplaintBottomSheet complaintBottomSheet = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                if (list.isEmpty()) {
                    zv8[] zv8VarArr = ComplaintBottomSheet.n;
                    y54.b.b().f();
                } else {
                    zv8[] zv8VarArr2 = ComplaintBottomSheet.n;
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(complaintBottomSheet.o1().a, null, null, 6);
                    jc4VarA.g(complaintBottomSheet.o1().b);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jc4VarA.a((kc4) it.next());
                    }
                    jc4VarA.a((kc4) complaintBottomSheet.k.getValue());
                    vv vvVar = complaintBottomSheet.f;
                    zv8 zv8Var = ComplaintBottomSheet.n[5];
                    if (((Boolean) vvVar.a(complaintBottomSheet)).booleanValue()) {
                        jc4VarA.j(pq3.j.e(complaintBottomSheet.getContext()).j().b.getName());
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(complaintBottomSheet);
                    confirmationBottomSheetF.addLifecycleListener(new t54(complaintBottomSheet, 0));
                    confirmationBottomSheetF.setTargetController(complaintBottomSheet);
                    br4 parentController = complaintBottomSheet;
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
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                if (cqk.d((x54) obj2, x54.a)) {
                    ((h8c) complaintBottomSheet.l.getValue()).p();
                    return sbiVar;
                }
                ore.o();
                return null;
        }
    }
}
