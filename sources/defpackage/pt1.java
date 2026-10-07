package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.List;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pt1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallOpponentsListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt1(lq4 lq4Var, CallOpponentsListWidget callOpponentsListWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callOpponentsListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallOpponentsListWidget callOpponentsListWidget = this.g;
        switch (i) {
            case 0:
                pt1 pt1Var = new pt1(lq4Var, callOpponentsListWidget, 0);
                pt1Var.f = obj;
                return pt1Var;
            case 1:
                pt1 pt1Var2 = new pt1(lq4Var, callOpponentsListWidget, 1);
                pt1Var2.f = obj;
                return pt1Var2;
            default:
                pt1 pt1Var3 = new pt1(lq4Var, callOpponentsListWidget, 2);
                pt1Var3.f = obj;
                return pt1Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((pt1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((pt1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((pt1) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        r1c r1cVar;
        hve hveVarU1;
        int i = this.e;
        CallOpponentsListWidget callOpponentsListWidget = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                bd bdVar = (bd) obj2;
                isk.d((TextView) callOpponentsListWidget.p.m(callOpponentsListWidget, CallOpponentsListWidget.v[7]), !bdVar.b.isEmpty(), 0L, null, 6);
                ((wc) callOpponentsListWidget.t.getValue()).H(bdVar.b);
                break;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                st1 st1Var = (st1) obj3;
                j8e j8eVar = callOpponentsListWidget.n;
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                TextView textView = (TextView) j8eVar.m(callOpponentsListWidget, zv8VarArr[5]);
                CharSequence charSequence = st1Var.e;
                boolean z = st1Var.d;
                textView.setText(charSequence);
                callOpponentsListWidget.o1().setTitle(st1Var.e);
                oyb oybVar = (oyb) callOpponentsListWidget.l.m(callOpponentsListWidget, zv8VarArr[3]);
                List list = st1Var.b;
                oybVar.m = list.size() < 3 && !z;
                ((oyb) callOpponentsListWidget.l.m(callOpponentsListWidget, zv8VarArr[3])).b(list, st1Var.c, z);
                if (st1Var.f) {
                    callOpponentsListWidget.o1().setRightActions((acc) callOpponentsListWidget.i.getValue());
                } else {
                    callOpponentsListWidget.o1().setRightActions(ybc.a);
                }
                c79 c79VarW = yab.w();
                c79VarW.addAll(st1Var.a);
                c79 c79VarJ = yab.j(c79VarW);
                ((et1) callOpponentsListWidget.s.getValue()).H(c79VarJ);
                boolean zIsEmpty = c79VarJ.isEmpty();
                View view = callOpponentsListWidget.getView();
                View viewFindViewById = view != null ? view.findViewById(R.id.call_screen_opponent_empty_list) : null;
                ViewStub viewStub = viewFindViewById instanceof ViewStub ? (ViewStub) viewFindViewById : null;
                if (zIsEmpty || viewStub == null || n7j.n(viewStub)) {
                    if (viewStub != null) {
                        r1c r1cVar2 = new r1c(callOpponentsListWidget.getContext());
                        r1cVar2.setId(R.id.call_screen_opponent_empty_list);
                        bt4 bt4Var = new bt4(-1, -1);
                        bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                        r1cVar2.setLayoutParams(bt4Var);
                        r1cVar2.setPadding(0, 0, 0, zo5.b(40.0f, yl5.d().getDisplayMetrics().density, ((k4f) callOpponentsListWidget.d.getValue()).f));
                        r1cVar2.setIcon(R.drawable.icon_search);
                        r1cVar2.setTitle(new tnh(R.string.call_screen_opponents_list_empty_title));
                        r1cVar2.setSubtitle(new tnh(R.string.call_screen_opponents_list_empty_subtitle));
                        r1cVar2.setVisibility(8);
                        r1cVar2.setCustomTheme(pq3.j.l(r1cVar2).b);
                        n7j.m(viewStub, r1cVar2, null);
                    }
                    View view2 = callOpponentsListWidget.getView();
                    if (view2 != null && (r1cVar = (r1c) view2.findViewById(R.id.call_screen_opponent_empty_list)) != null) {
                        r1cVar.setVisibility(zIsEmpty ? 0 : 8);
                    }
                    ((RecyclerView) callOpponentsListWidget.m.m(callOpponentsListWidget, zv8VarArr[4])).setVisibility(zIsEmpty ? 8 : 0);
                }
                break;
            default:
                Object obj4 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj4;
                if (rbbVar instanceof ry1) {
                    CallOpponentsListWidget callOpponentsListWidget2 = this.g;
                    ny8 ny8Var = callOpponentsListWidget2.e;
                    ry1 ry1Var = (ry1) rbbVar;
                    zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                    if (ry1Var instanceof by1) {
                        zv8[] zv8VarArr3 = BottomSheetWidget.t;
                        ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet(callOpponentsListWidget2.getA().b());
                        confirmAddOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget2);
                        br4 parentController = callOpponentsListWidget2;
                        while (parentController.getParentController() != null) {
                            parentController = parentController.getParentController();
                        }
                        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                        hveVarU1 = rootController != null ? rootController.u1() : null;
                        if (hveVarU1 != null) {
                            lve lveVar = new lve(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar, true, "BottomSheetWidget");
                            hveVarU1.I(lveVar);
                        }
                    } else if (ry1Var instanceof fy1) {
                        zv8[] zv8VarArr4 = BottomSheetWidget.t;
                        ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((fy1) ry1Var).F, callOpponentsListWidget2.getA().b());
                        confirmRemoveOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget2);
                        br4 parentController2 = callOpponentsListWidget2;
                        while (parentController2.getParentController() != null) {
                            parentController2 = parentController2.getParentController();
                        }
                        RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                        hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                        if (hveVarU1 != null) {
                            lve lveVar2 = new lve(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar2, true, "BottomSheetWidget");
                            hveVarU1.I(lveVar2);
                        }
                    } else if (ry1Var instanceof ux1) {
                        callOpponentsListWidget2.getRouter().C(callOpponentsListWidget2);
                    } else if (ry1Var instanceof ly1) {
                        cs1.b.l(((ly1) ry1Var).F, callOpponentsListWidget2.getContext().getString(R.string.call_screen_share_link_title), CallOpponentsListWidget.class.getName());
                    } else if (ry1Var instanceof yx1) {
                        it3.a(callOpponentsListWidget2.getContext(), ((yx1) ry1Var).F);
                        if (it3.b()) {
                            String string = callOpponentsListWidget2.getContext().getString(R.string.call_link_share_dialog_share_link_copy);
                            h8c h8cVar = new h8c(callOpponentsListWidget2);
                            h8cVar.n(string);
                            h8cVar.e(new y42(4, null));
                            h8cVar.c(new o8c(0, 0, 0, 11));
                            h8cVar.p();
                        }
                    } else if (ry1Var instanceof py1) {
                        py1 py1Var = (py1) ry1Var;
                        ((t3g) ny8Var.getValue()).getClass();
                        t3g.b(py1Var.F, new tp9(py1Var, callOpponentsListWidget2, 0, null, 1));
                    } else if (ry1Var instanceof qy1) {
                        ((t3g) ny8Var.getValue()).getClass();
                        t3g.b(xx1.b, new tp9(callOpponentsListWidget2, (qy1) ry1Var, 0, null, 2));
                    }
                } else if (rbbVar instanceof i65) {
                    cs1.b.e((i65) rbbVar);
                }
                break;
        }
        return sbiVar;
    }
}
