package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ieb implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ieb(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
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
        int i2 = 18;
        int i3 = 1;
        sbi sbiVar = sbi.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        int i4 = 0;
        switch (i) {
            case 0:
                rw3 rw3Var = (rw3) obj;
                zv8[] zv8VarArr = NeuroAvatarsScreen.B;
                Toolbar toolbar = new Toolbar(rw3Var.getContext());
                ow3 ow3Var = new ow3(-1, gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                er3.M(toolbar, neuroAvatarsScreen.s1().k, new ieb(neuroAvatarsScreen, i3));
                rw3Var.addView(toolbar);
                LinearLayout linearLayout = new LinearLayout(rw3Var.getContext());
                linearLayout.setId(R.id.oneme_login_neuro_avatars_collapsible);
                ow3 ow3Var2 = new ow3(-1, -2);
                ow3Var2.a = 2;
                ow3Var2.setMargins(0, zo5.b(52.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f)), 0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                linearLayout.setLayoutParams(ow3Var2);
                linearLayout.setOrientation(1);
                zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                er3.L(linearLayout, neuroAvatarsScreen.s1().k);
                rw3Var.addView(linearLayout);
                break;
            case 1:
                zv8[] zv8VarArr4 = NeuroAvatarsScreen.B;
                neuroAvatarsScreen.getRouter().D();
                break;
            case 2:
                et4 et4Var = (et4) obj;
                zv8[] zv8VarArr5 = NeuroAvatarsScreen.B;
                ieb iebVar = new ieb(neuroAvatarsScreen, 3);
                View rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.oneme_login_neuro_avatars_appbar);
                rqVar.setLayoutParams(new bt4(-1, -2));
                rqVar.setElevation(0.0f);
                n1g.N(new meb(3, null, 0), rqVar);
                iebVar.invoke(rqVar);
                et4Var.addView(rqVar);
                zsj zsjVar = neuroAvatarsScreen.x;
                xeb xebVarS1 = neuroAvatarsScreen.s1();
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                RecyclerView recyclerView = new RecyclerView(et4Var.getContext());
                recyclerView.setId(R.id.oneme_login_neuro_avatars_recycler_view);
                recyclerView.setLayoutParams(bt4Var);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setOverScrollMode(2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                recyclerView.setAdapter(zsjVar);
                int i5 = 7;
                odb odbVar = new odb(recyclerView, zsjVar, new w62(zsjVar, i5, xebVarS1));
                g57 g57Var = new g57(new ol0(i2, zsjVar), recyclerView.getContext());
                recyclerView.h(odbVar, -1);
                recyclerView.h(g57Var, -1);
                recyclerView.h(new q91(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), i5), -1);
                et4Var.addView(recyclerView);
                recyclerView.k(neuroAvatarsScreen.y);
                bt4 bt4Var2 = new bt4(-1, -2);
                bt4Var2.c = 80;
                FrameLayout frameLayout = new FrameLayout(et4Var.getContext());
                frameLayout.setId(R.id.oneme_login_neuro_avatars_button_background);
                frameLayout.setLayoutParams(bt4Var2);
                frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, ((nac) pq3.j.h(frameLayout).k().r.b).a));
                lvb.G(frameLayout);
                cyb cybVar = new cyb(frameLayout.getContext());
                cybVar.setId(R.id.oneme_login_neuro_avatars_continue_btn);
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.PRIMARY);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.gravity = 48;
                cybVar.setLayoutParams(layoutParams);
                cybVar.setText(np4.q(neuroAvatarsScreen.getContext(), neuroAvatarsScreen.s1().k.c));
                frameLayout.addView(cybVar);
                frameLayout.addOnLayoutChangeListener(new b62(recyclerView, 4, frameLayout));
                n1g.N(new qb3(3, null, 8), frameLayout);
                et4Var.addView(frameLayout);
                break;
            default:
                rq rqVar2 = (rq) obj;
                zv8[] zv8VarArr6 = NeuroAvatarsScreen.B;
                ieb iebVar2 = new ieb(neuroAvatarsScreen, i4);
                rw3 rw3Var2 = new rw3(rqVar2.getContext());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var2.setLayoutParams(pqVar);
                rw3Var2.setTitleEnabled(false);
                iebVar2.invoke(rw3Var2);
                rqVar2.addView(rw3Var2);
                er3.I(rqVar2, (Drawable) neuroAvatarsScreen.A.getValue(), new jeb(neuroAvatarsScreen, 0), new jeb(neuroAvatarsScreen, 1), gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density), new s9a(i2), new s9a(19));
                er3.K(rqVar2);
                break;
        }
        return sbiVar;
    }
}
