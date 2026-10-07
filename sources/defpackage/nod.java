package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profileedit.ProfileEditScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nod implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ nod(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
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
        final ProfileEditScreen profileEditScreen = this.b;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                et4 et4Var = (et4) obj;
                zv8[] zv8VarArr = ProfileEditScreen.p;
                rq rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.profile_edit_appbar_layout);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rqVar.setBackground(null);
                rqVar.setLiftOnScroll(true);
                rqVar.setStateListAnimator(null);
                zv8[] zv8VarArr2 = ProfileEditScreen.p;
                nod nodVar = new nod(profileEditScreen, i3);
                rw3 rw3Var = new rw3(rqVar.getContext());
                rw3Var.setId(View.generateViewId());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                nodVar.invoke(rw3Var);
                rqVar.addView(rw3Var);
                et4Var.addView(rqVar);
                RecyclerView recyclerView = new RecyclerView(et4Var.getContext());
                recyclerView.setId(R.id.profile_edit_recycler_view);
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(bt4Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.g);
                recyclerView.setItemAnimator(null);
                int[] iArr = {np0.q, np0.r, np0.m, 1, 2, np0.o, 131072};
                f8b f8bVar = jj8.a;
                f8b f8bVar2 = new f8b(7);
                for (int i4 = 0; i4 < 7; i4++) {
                    f8bVar2.h(iArr[i4]);
                }
                fv9 fv9Var = new fv9(profileEditScreen, 23, f8bVar2);
                a8g a8gVar = pq3.j;
                recyclerView.h(new sbf(a8gVar.h(recyclerView), fv9Var, null, null, null, 60), -1);
                recyclerView.h(new ym9(0), -1);
                et4Var.addView(recyclerView);
                FrameLayout frameLayout = new FrameLayout(et4Var.getContext());
                frameLayout.setId(R.id.profile_edit_confirm_save_button);
                bt4 bt4Var2 = new bt4(-1, -2);
                bt4Var2.c = 80;
                frameLayout.setLayoutParams(bt4Var2);
                frameLayout.setBackground(new ShapeDrawable());
                if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
                    frameLayout.addOnLayoutChangeListener(new b62(profileEditScreen, 5, frameLayout));
                } else {
                    ProfileEditScreen.p1(profileEditScreen, a8gVar.h(frameLayout));
                }
                cyb cybVar = new cyb(et4Var.getContext());
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.PRIMARY);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                cybVar.setLayoutParams(layoutParams);
                cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_profile_edit_confirm_save_action));
                qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: ood
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i2;
                        ProfileEditScreen profileEditScreen2 = profileEditScreen;
                        switch (i5) {
                            case 0:
                                zv8[] zv8VarArr3 = ProfileEditScreen.p;
                                apd apdVarS1 = profileEditScreen2.s1();
                                apdVarS1.p.B(apdVarS1, apd.r[0], yab.i0(apdVarS1.b, null, 0, new yod(apdVarS1, null, 1), 3));
                                break;
                            default:
                                zv8[] zv8VarArr4 = ProfileEditScreen.p;
                                zz5 zz5Var = profileEditScreen2.s1().c;
                                if (zz5Var.d()) {
                                    zz5Var.l();
                                    break;
                                }
                                break;
                        }
                    }
                });
                frameLayout.addView(cybVar);
                et4Var.addView(frameLayout);
                break;
            case 1:
                rw3 rw3Var2 = (rw3) obj;
                zv8[] zv8VarArr3 = ProfileEditScreen.p;
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                toolbar.setId(View.generateViewId());
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                zv8[] zv8VarArr4 = ProfileEditScreen.p;
                rcc rccVar = new rcc(toolbar.getContext());
                rccVar.setId(R.id.profile_edit_oneme_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setLeftActions(new wbc(new nod(profileEditScreen, 3)));
                rccVar.setRightActions(ybc.a);
                toolbar.addView(rccVar);
                rw3Var2.addView(toolbar);
                nod nodVar2 = new nod(profileEditScreen, 2);
                LinearLayout linearLayout = new LinearLayout(rw3Var2.getContext());
                linearLayout.setId(R.id.profile_edit_collapsible_container_layout);
                ow3 ow3Var2 = new ow3(-1, -2);
                ow3Var2.a = 2;
                ((FrameLayout.LayoutParams) ow3Var2).bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(ow3Var2);
                linearLayout.setOrientation(1);
                nodVar2.invoke(linearLayout);
                rw3Var2.addView(linearLayout);
                break;
            case 2:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                zv8[] zv8VarArr5 = ProfileEditScreen.p;
                kwb kwbVar = new kwb(linearLayout2.getContext());
                kwbVar.setId(R.id.profile_edit_avatar);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density));
                layoutParams2.gravity = 1;
                layoutParams2.topMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                kwbVar.setLayoutParams(layoutParams2);
                kwbVar.setAddBadgeVisibility(false);
                qe7.H(kwbVar, 300L, new View.OnClickListener() { // from class: ood
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        ProfileEditScreen profileEditScreen2 = profileEditScreen;
                        switch (i5) {
                            case 0:
                                zv8[] zv8VarArr6 = ProfileEditScreen.p;
                                apd apdVarS1 = profileEditScreen2.s1();
                                apdVarS1.p.B(apdVarS1, apd.r[0], yab.i0(apdVarS1.b, null, 0, new yod(apdVarS1, null, 1), 3));
                                break;
                            default:
                                zv8[] zv8VarArr7 = ProfileEditScreen.p;
                                zz5 zz5Var = profileEditScreen2.s1().c;
                                if (zz5Var.d()) {
                                    zz5Var.l();
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout2.addView(kwbVar);
                break;
            default:
                zv8[] zv8VarArr6 = ProfileEditScreen.p;
                ltb onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
        }
        return sbiVar;
    }
}
