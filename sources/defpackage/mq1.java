package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mq1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ mq1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
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
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (i) {
            case 0:
                et4 et4Var = (et4) obj;
                ldf ldfVar = CallLinkInfoScreen.t;
                rq rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.call_info_appbarlayout);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rqVar.setBackground(null);
                rqVar.setStateListAnimator(null);
                ldf ldfVar2 = CallLinkInfoScreen.t;
                mq1 mq1Var = new mq1(callLinkInfoScreen, 1);
                rw3 rw3Var = new rw3(rqVar.getContext());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                mq1Var.invoke(rw3Var);
                rqVar.addView(rw3Var);
                et4Var.addView(rqVar);
                RecyclerView recyclerView = new RecyclerView(et4Var.getContext());
                recyclerView.setId(R.id.call_info_action_list);
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                bt4Var.c = 49;
                recyclerView.setLayoutParams(bt4Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.q);
                recyclerView.setItemAnimator(null);
                recyclerView.h(new sbf(pq3.j.h(recyclerView), new ot4(14, callLinkInfoScreen), null, null, null, 60), -1);
                recyclerView.h(new q91(1), -1);
                et4Var.addView(recyclerView);
                cyb cybVar = new cyb(et4Var.getContext());
                cybVar.setId(R.id.call_info_button);
                cybVar.setSize(ayb.g);
                bt4 bt4Var2 = new bt4(-1, -2);
                bt4Var2.c = 81;
                bt4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                bt4Var2.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                ((ViewGroup.MarginLayoutParams) bt4Var2).bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                ((ViewGroup.MarginLayoutParams) bt4Var2).topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                cybVar.setLayoutParams(bt4Var2);
                et4Var.addView(cybVar);
                n1g.N(new d3(callLinkInfoScreen, null, 4), et4Var);
                break;
            default:
                rw3 rw3Var2 = (rw3) obj;
                ldf ldfVar3 = CallLinkInfoScreen.t;
                xk1 xk1Var = new xk1(callLinkInfoScreen, 5);
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                xk1Var.invoke(toolbar);
                rw3Var2.addView(toolbar);
                xk1 xk1Var2 = new xk1(callLinkInfoScreen, 6);
                LinearLayout linearLayout = new LinearLayout(rw3Var2.getContext());
                linearLayout.setId(R.id.call_info_collapsiblecontainerlinearlayout);
                ow3 ow3Var2 = new ow3(-1, -2);
                ow3Var2.a = 2;
                ((FrameLayout.LayoutParams) ow3Var2).bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(ow3Var2);
                linearLayout.setOrientation(1);
                xk1Var2.invoke(linearLayout);
                rw3Var2.addView(linearLayout);
                break;
        }
        return sbiVar;
    }
}
