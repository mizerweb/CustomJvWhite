package defpackage;

import java.util.Collections;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.startconversation.StartConversationScreen;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class thg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StartConversationScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thg(lq4 lq4Var, StartConversationScreen startConversationScreen) {
        super(2, lq4Var);
        this.e = 2;
        this.g = startConversationScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StartConversationScreen startConversationScreen = this.g;
        switch (i) {
            case 0:
                thg thgVar = new thg(startConversationScreen, lq4Var, 0);
                thgVar.f = obj;
                return thgVar;
            case 1:
                thg thgVar2 = new thg(startConversationScreen, lq4Var, 1);
                thgVar2.f = obj;
                return thgVar2;
            case 2:
                thg thgVar3 = new thg(lq4Var, startConversationScreen);
                thgVar3.f = obj;
                return thgVar3;
            default:
                thg thgVar4 = new thg(startConversationScreen, lq4Var, 3);
                thgVar4.f = obj;
                return thgVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((thg) create((vj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((thg) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((thg) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((thg) create((i65) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
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
        StartConversationScreen startConversationScreen = this.g;
        sbi sbiVar = sbi.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                vj4 vj4Var = (vj4) obj2;
                ch3.d0(obj);
                zsj zsjVar = startConversationScreen.u;
                lp0 lp0Var = startConversationScreen.t;
                zsj zsjVar2 = startConversationScreen.s;
                h47 h47Var = startConversationScreen.w;
                h47 h47Var2 = startConversationScreen.q;
                r66 r66Var = r66.a;
                h47Var2.H(r66Var);
                pk6 pk6Var = startConversationScreen.v;
                pk6Var.H(r66Var);
                lp0 lp0Var2 = startConversationScreen.r;
                lp0Var2.H(r66Var);
                if (((vj4) startConversationScreen.p1().q.j.a.getValue()).b()) {
                    vv vvVar = startConversationScreen.f;
                    zv8 zv8Var = StartConversationScreen.A[2];
                    if (((Boolean) vvVar.a(startConversationScreen)).booleanValue()) {
                        boolean zC = ((wsc) startConversationScreen.o.getValue()).c(wsc.g);
                        h47Var.H(Collections.singletonList(new pn4(zC ? R.string.empty_search_contact_enabled_description : R.string.empty_search_contact_disabled_description, zC ? null : Integer.valueOf(R.string.empty_search_contact_btn_title))));
                    } else {
                        h47Var.H(r66Var);
                    }
                } else {
                    h47Var.H(r66Var);
                }
                CharSequence charSequenceO1 = startConversationScreen.o1();
                if (charSequenceO1 == null || charSequenceO1.length() == 0) {
                    h47Var2.H((List) startConversationScreen.p1().s.a.getValue());
                    pk6Var.H(ch3.j(xw3.P0(ll8.a, ll8.b)));
                    zsjVar2.H(((vj4) startConversationScreen.p1().p.a.getValue()).a);
                    lp0Var.H(r66Var);
                    zsjVar.H(((vj4) startConversationScreen.p1().p.a.getValue()).c);
                    lp0Var2.H((List) ((zo0) startConversationScreen.l.getValue()).i.a.getValue());
                } else {
                    zsjVar2.H(vj4Var.a);
                    lp0Var.H(vj4Var.b);
                    zsjVar.H(vj4Var.c);
                }
                return sbiVar;
            case 1:
                List list = (List) obj2;
                ch3.d0(obj);
                zv8[] zv8VarArr = StartConversationScreen.A;
                CharSequence charSequenceO2 = startConversationScreen.o1();
                if (charSequenceO2 == null || charSequenceO2.length() == 0) {
                    startConversationScreen.q.H(list);
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                nhg nhgVar = (nhg) obj2;
                if (nhgVar instanceof lhg) {
                    e9i.j0(new bye(new xra(uw8.f, (lq4) null, startConversationScreen, nhgVar)), startConversationScreen.getViewLifecycleScope());
                    ml9.b(startConversationScreen);
                } else {
                    if (!cqk.d(nhgVar, mhg.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet = new VpnConnectedWarningBottomSheet(y3f.CALL_VPN_WARNING_SHEET, startConversationScreen.getB().b());
                    vpnConnectedWarningBottomSheet.setTargetController(startConversationScreen);
                    br4 parentController = startConversationScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(vpnConnectedWarningBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                ohg.b.e((i65) obj2);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ thg(StartConversationScreen startConversationScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = startConversationScreen;
    }
}
