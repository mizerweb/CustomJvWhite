package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qld implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileChangeLinkScreen b;

    public /* synthetic */ qld(ProfileChangeLinkScreen profileChangeLinkScreen, int i) {
        this.a = i;
        this.b = profileChangeLinkScreen;
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
        int i;
        bcc wbcVar;
        int i2 = this.a;
        int i3 = 3;
        final int i4 = 0;
        sbi sbiVar = sbi.a;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.b;
        final int i5 = 1;
        switch (i2) {
            case 0:
                et4 et4Var = (et4) obj;
                zv8[] zv8VarArr = ProfileChangeLinkScreen.t;
                rq rqVar = new rq(et4Var.getContext());
                rqVar.setId(R.id.profile_edit_shortlink_app_bar_layout);
                rqVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                n1g.N(new meb(3, null, 1), rqVar);
                rqVar.setElevation(0.0f);
                rqVar.setStateListAnimator(null);
                zv8[] zv8VarArr2 = ProfileChangeLinkScreen.t;
                qld qldVar = new qld(profileChangeLinkScreen, i5);
                rw3 rw3Var = new rw3(rqVar.getContext());
                pq pqVar = new pq();
                pqVar.a = 19;
                rw3Var.setLayoutParams(pqVar);
                rw3Var.setTitleEnabled(false);
                qldVar.invoke(rw3Var);
                rqVar.addView(rw3Var);
                et4Var.addView(rqVar);
                RecyclerView recyclerView = new RecyclerView(et4Var.getContext());
                bt4 bt4Var = new bt4(-1, -1);
                bt4Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(bt4Var);
                recyclerView.setPaddingRelative(0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), 0, gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
                recyclerView.setClipToPadding(false);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(profileChangeLinkScreen.g);
                recyclerView.setItemAnimator(null);
                recyclerView.setClipChildren(false);
                recyclerView.h(new sbf(pq3.j.h(recyclerView), new qyb(10, profileChangeLinkScreen), null, null, null, 60), -1);
                recyclerView.h(new ym9(0), -1);
                et4Var.addView(recyclerView);
                cyb cybVar = new cyb(et4Var.getContext());
                cybVar.setId(R.id.profile_edit_shortlink_confirm_button);
                cybVar.setSize(ayb.h);
                cybVar.setAppearance(zxb.PRIMARY);
                bt4 bt4Var2 = new bt4(-1, -2);
                bt4Var2.c = 80;
                bt4Var2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                cybVar.setLayoutParams(bt4Var2);
                int iOrdinal = profileChangeLinkScreen.q1().ordinal();
                if (iOrdinal == 0) {
                    i = R.string.profile_edit_shortlink_button_continue;
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    i = R.string.profile_edit_shortlink_button_submit;
                }
                cybVar.setText(np4.q(profileChangeLinkScreen.getContext(), i));
                qe7.H(cybVar, 300L, new gwc(9, profileChangeLinkScreen));
                et4Var.addView(cybVar);
                return sbiVar;
            case 1:
                rw3 rw3Var2 = (rw3) obj;
                zv8[] zv8VarArr3 = ProfileChangeLinkScreen.t;
                qld qldVar2 = new qld(profileChangeLinkScreen, 2);
                Toolbar toolbar = new Toolbar(rw3Var2.getContext());
                ow3 ow3Var = new ow3(-1, -2);
                ow3Var.a = 1;
                toolbar.setLayoutParams(ow3Var);
                toolbar.setElevation(0.0f);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.s(0, 0);
                qldVar2.invoke(toolbar);
                rw3Var2.addView(toolbar);
                LinearLayout linearLayout = new LinearLayout(rw3Var2.getContext());
                linearLayout.setId(R.id.profile_edit_shortlink_collapsing_content);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                int iK = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
                ViewGroup.LayoutParams ow3Var2 = new ow3(-1, -2);
                linearLayout.setPaddingRelative(iK, linearLayout.getPaddingTop(), iK, linearLayout.getPaddingBottom());
                linearLayout.setLayoutParams(ow3Var2);
                int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
                View imageView = new ImageView(linearLayout.getContext());
                imageView.setId(R.id.profile_edit_shortlink_header_icon);
                int iK3 = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK3, iK3);
                int marginStart = layoutParams.getMarginStart();
                int marginEnd = layoutParams.getMarginEnd();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                layoutParams.setMarginStart(marginStart);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iK2;
                layoutParams.setMarginEnd(marginEnd);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i6;
                imageView.setLayoutParams(layoutParams);
                imageView.setVisibility(8);
                linearLayout.addView(imageView);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(R.id.profile_edit_shortlink_header_title);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                int marginStart2 = layoutParams2.getMarginStart();
                int marginEnd2 = layoutParams2.getMarginEnd();
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                layoutParams2.setMarginStart(marginStart2);
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = iK2;
                layoutParams2.setMarginEnd(marginEnd2);
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i7;
                textView.setLayoutParams(layoutParams2);
                q9i.a(q9i.c, textView);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                int iK4 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                int iK5 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                int marginStart3 = layoutParams3.getMarginStart();
                int marginEnd3 = layoutParams3.getMarginEnd();
                layoutParams3.setMarginStart(marginStart3);
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = iK4;
                layoutParams3.setMarginEnd(marginEnd3);
                ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iK5;
                textView2.setLayoutParams(layoutParams3);
                q9i.a(q9i.g, textView2);
                textView2.setText(R.string.profile_edit_shortlink_header_description);
                linearLayout.addView(textView2);
                n1g.N(new vzc(textView, textView2, (lq4) null), linearLayout);
                rw3Var2.addView(linearLayout);
                return sbiVar;
            case 2:
                Toolbar toolbar2 = (Toolbar) obj;
                zv8[] zv8VarArr4 = ProfileChangeLinkScreen.t;
                rcc rccVar = new rcc(toolbar2.getContext());
                rccVar.setId(R.id.profile_edit_short_link_toolbar);
                final qld qldVar3 = new qld(profileChangeLinkScreen, i3);
                int iOrdinal2 = profileChangeLinkScreen.q1().ordinal();
                if (iOrdinal2 == 0) {
                    wbcVar = new wbc(new cf7(qldVar3) { // from class: rld
                        public final /* synthetic */ qld b;

                        {
                            this.b = qldVar3;
                        }

                        @Override // defpackage.cf7
                        public final Object invoke(Object obj2) {
                            int i8 = i4;
                            sbi sbiVar2 = sbi.a;
                            qld qldVar4 = this.b;
                            View view = (View) obj2;
                            switch (i8) {
                                case 0:
                                    zv8[] zv8VarArr5 = ProfileChangeLinkScreen.t;
                                    qldVar4.invoke(view);
                                    break;
                                default:
                                    zv8[] zv8VarArr6 = ProfileChangeLinkScreen.t;
                                    qldVar4.invoke(view);
                                    break;
                            }
                            return sbiVar2;
                        }
                    });
                } else {
                    if (iOrdinal2 != 1) {
                        ore.o();
                        return null;
                    }
                    wbcVar = new xbc(new cf7(qldVar3) { // from class: rld
                        public final /* synthetic */ qld b;

                        {
                            this.b = qldVar3;
                        }

                        @Override // defpackage.cf7
                        public final Object invoke(Object obj2) {
                            int i8 = i5;
                            sbi sbiVar2 = sbi.a;
                            qld qldVar4 = this.b;
                            View view = (View) obj2;
                            switch (i8) {
                                case 0:
                                    zv8[] zv8VarArr5 = ProfileChangeLinkScreen.t;
                                    qldVar4.invoke(view);
                                    break;
                                default:
                                    zv8[] zv8VarArr6 = ProfileChangeLinkScreen.t;
                                    qldVar4.invoke(view);
                                    break;
                            }
                            return sbiVar2;
                        }
                    });
                }
                rccVar.setLeftActions(wbcVar);
                rccVar.setRightActions(ybc.a);
                rccVar.setForm(gcc.Compact);
                toolbar2.addView(rccVar);
                return sbiVar;
            default:
                zv8[] zv8VarArr5 = ProfileChangeLinkScreen.t;
                ltb onBackPressedDispatcher = profileChangeLinkScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbiVar;
        }
    }
}
