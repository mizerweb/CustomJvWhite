package defpackage;

import one.me.android.root.RootController;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cvc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoEditScreen b;

    public /* synthetic */ cvc(PhotoEditScreen photoEditScreen, int i) {
        this.a = i;
        this.b = photoEditScreen;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
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
    @Override // defpackage.af7
    public final Object invoke() {
        boolean z;
        hve hveVarU1;
        tvc tvcVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        PhotoEditScreen photoEditScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                if (photoEditScreen.getView() != null) {
                    br4 parentController = photoEditScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hveVarU1 = rootController != null ? rootController.u1() : null;
                    z = hveVarU1 != null && hveVarU1.e().isEmpty() && (tvcVar = (tvc) photoEditScreen.y1().i.a.getValue()) != null && tvcVar.c;
                }
                return Boolean.valueOf(z);
            case 1:
                zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                mrk.e(photoEditScreen);
                return sbiVar;
            case 2:
                zv8[] zv8VarArr3 = PhotoEditScreen.s1;
                qk5 qk5Var = new qk5(4);
                pw pwVar = photoEditScreen.g;
                pwVar.getClass();
                hw hwVar = new hw(pwVar);
                while (hwVar.hasNext()) {
                    qk5Var.accept((qvc) hwVar.next());
                }
                return sbiVar;
            case 3:
                zv8[] zv8VarArr4 = PhotoEditScreen.s1;
                zv8[] zv8VarArr5 = BottomSheetWidget.t;
                jc4 jc4VarA = mrk.a();
                jc4VarA.j(photoEditScreen.v1().getName());
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(photoEditScreen);
                confirmationBottomSheetF.setTargetController(photoEditScreen);
                br4 parentController2 = photoEditScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                    p.k(false, lveVar, true, "BottomSheetWidget");
                    hveVarU1.I(lveVar);
                }
                return sbiVar;
            default:
                mvc mvcVar = (mvc) photoEditScreen.b.getAccessor().c(1086);
                qu5 qu5Var = photoEditScreen.J;
                k11 k11Var = photoEditScreen.K;
                vv vvVar = photoEditScreen.c;
                zv8 zv8Var = PhotoEditScreen.s1[0];
                String str = (String) vvVar.a(photoEditScreen);
                mvcVar.getClass();
                return new lvc(mvcVar.a, mvcVar.b, mvcVar.c, qu5Var, k11Var, str);
        }
    }
}
