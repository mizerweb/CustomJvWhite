package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tda implements eph {
    public final Context a;
    public final Collection b;
    public final lsa c;
    public final boolean d;
    public final k01 e;
    public final msa f;
    public final ExecutorService g;
    public pda h;
    public RecyclerView i;
    public bq4 j;
    public int k;
    public TextView l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;

    public tda(Context context, Collection collection, lsa lsaVar, boolean z, k01 k01Var, msa msaVar, ExecutorService executorService, lsa lsaVar2) {
        this.a = context;
        this.b = collection;
        this.c = lsaVar;
        this.d = z;
        this.e = k01Var;
        this.f = msaVar;
        this.g = executorService;
        final int i = 0;
        this.m = rx8.P(3, new af7(this) { // from class: lda
            public final /* synthetic */ tda b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                boolean z2;
                int i2;
                int i3 = i;
                tda tdaVar = this.b;
                switch (i3) {
                    case 0:
                        boolean z3 = tdaVar.d;
                        LinearLayout linearLayout = new LinearLayout(tdaVar.a);
                        boolean z4 = true;
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), linearLayout.getPaddingRight(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        Collection<rp4> collection2 = tdaVar.b;
                        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                            z2 = false;
                        } else {
                            Iterator it = collection2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                } else if (((rp4) it.next()).d != null) {
                                    z2 = true;
                                }
                            }
                        }
                        boolean z5 = false;
                        for (rp4 rp4Var : collection2) {
                            if (z3 && !z5 && ((i2 = rp4Var.a) == R.id.messages_list_context_action_delete || i2 == R.id.messages_list_context_action_delete_for_all)) {
                                linearLayout.addView(tdaVar.a());
                                linearLayout.addView(tdaVar.e());
                                linearLayout.addView(tdaVar.a());
                                z5 = z4;
                            }
                            fcd fcdVar = new fcd(linearLayout.getContext(), false);
                            ynh ynhVar = rp4Var.b;
                            Integer num = rp4Var.d;
                            fcdVar.c(fcdVar, ynhVar, rp4Var.c, num != null ? z4 : false, z2);
                            fcdVar.b(num, rp4Var.e);
                            qe7.H(fcdVar, 300L, new z36(tdaVar, 23, rp4Var));
                            linearLayout.addView(fcdVar, new LinearLayout.LayoutParams(-1, -2));
                            z4 = true;
                        }
                        if (z3 && !z5) {
                            linearLayout.addView(tdaVar.a());
                            linearLayout.addView(tdaVar.e());
                        }
                        linearLayout.setId(R.id.messages_list_context_read_by_menu_content);
                        return linearLayout;
                    default:
                        kda kdaVar = new kda(tdaVar.c(), tdaVar.a);
                        kdaVar.addView(tdaVar.c(), new FrameLayout.LayoutParams(-1, -2));
                        kdaVar.setReadByHeaderText(tdaVar.l);
                        return kdaVar;
                }
            }
        });
        final int i2 = 1;
        this.n = rx8.P(3, new af7(this) { // from class: lda
            public final /* synthetic */ tda b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                boolean z2;
                int i3;
                int i4 = i2;
                tda tdaVar = this.b;
                switch (i4) {
                    case 0:
                        boolean z3 = tdaVar.d;
                        LinearLayout linearLayout = new LinearLayout(tdaVar.a);
                        boolean z4 = true;
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), linearLayout.getPaddingRight(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        Collection<rp4> collection2 = tdaVar.b;
                        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                            z2 = false;
                        } else {
                            Iterator it = collection2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                } else if (((rp4) it.next()).d != null) {
                                    z2 = true;
                                }
                            }
                        }
                        boolean z5 = false;
                        for (rp4 rp4Var : collection2) {
                            if (z3 && !z5 && ((i3 = rp4Var.a) == R.id.messages_list_context_action_delete || i3 == R.id.messages_list_context_action_delete_for_all)) {
                                linearLayout.addView(tdaVar.a());
                                linearLayout.addView(tdaVar.e());
                                linearLayout.addView(tdaVar.a());
                                z5 = z4;
                            }
                            fcd fcdVar = new fcd(linearLayout.getContext(), false);
                            ynh ynhVar = rp4Var.b;
                            Integer num = rp4Var.d;
                            fcdVar.c(fcdVar, ynhVar, rp4Var.c, num != null ? z4 : false, z2);
                            fcdVar.b(num, rp4Var.e);
                            qe7.H(fcdVar, 300L, new z36(tdaVar, 23, rp4Var));
                            linearLayout.addView(fcdVar, new LinearLayout.LayoutParams(-1, -2));
                            z4 = true;
                        }
                        if (z3 && !z5) {
                            linearLayout.addView(tdaVar.a());
                            linearLayout.addView(tdaVar.e());
                        }
                        linearLayout.setId(R.id.messages_list_context_read_by_menu_content);
                        return linearLayout;
                    default:
                        kda kdaVar = new kda(tdaVar.c(), tdaVar.a);
                        kdaVar.addView(tdaVar.c(), new FrameLayout.LayoutParams(-1, -2));
                        kdaVar.setReadByHeaderText(tdaVar.l);
                        return kdaVar;
                }
            }
        });
        this.o = rx8.P(3, new vx9(this, 4, lsaVar2));
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
    public final oda a() {
        oda odaVar = new oda(this.a);
        odaVar.setId(R.id.messages_list_context_read_by_divider);
        odaVar.setBackgroundColor(pq3.j.h(odaVar).B().b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        odaVar.setLayoutParams(layoutParams);
        return odaVar;
    }

    public final kda b() {
        return (kda) this.n.getValue();
    }

    public final LinearLayout c() {
        return (LinearLayout) this.m.getValue();
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
    public final View d() {
        pda pdaVar = this.h;
        if (pdaVar != null) {
            return pdaVar;
        }
        Context context = this.a;
        pda pdaVar2 = new pda(context);
        pdaVar2.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_arrow_left);
        a8g a8gVar = pq3.j;
        imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_primary, a8gVar.h(imageView))));
        TextView textView = new TextView(context);
        noh nohVar = q9i.e;
        q9i.a(nohVar, textView);
        textView.setText(R.string.back);
        textView.setTextColor(a8gVar.h(textView).getText().b);
        nda ndaVar = new nda(imageView, textView, context);
        ndaVar.setId(R.id.messages_list_context_read_by_back_header);
        ndaVar.setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        ndaVar.setBackground(col.c(((fn8) a8gVar.h(ndaVar).u().c.b).c, new ColorDrawable(a8gVar.h(ndaVar).b().f), null, 4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        ndaVar.addView(imageView, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        ndaVar.addView(textView, layoutParams2);
        qe7.H(ndaVar, 300L, new mda(this, 1));
        pdaVar2.addView(ndaVar, new LinearLayout.LayoutParams(-1, -2));
        pdaVar2.addView(a());
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.messages_list_context_read_by_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((e8e) this.o.getValue());
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        recyclerView.setItemAnimator(null);
        this.i = recyclerView;
        pdaVar2.addView(recyclerView, new LinearLayout.LayoutParams(-1, -2));
        bq4 bq4Var = new bq4(context, 1);
        q9i.a(nohVar, bq4Var);
        bq4Var.setText(R.string.chat_screen_read_participants_empty);
        bq4Var.setTextColor(a8gVar.h(bq4Var).getText().c);
        bq4Var.setGravity(1);
        bq4Var.setVisibility(8);
        bq4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        this.j = bq4Var;
        pdaVar2.addView(bq4Var, new LinearLayout.LayoutParams(-1, -2));
        pdaVar2.setId(R.id.messages_list_context_read_by_detail_content);
        pdaVar2.setVisibility(8);
        b().addView(pdaVar2, new FrameLayout.LayoutParams(-1, -2));
        this.h = pdaVar2;
        return pdaVar2;
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
    public final qda e() {
        Context context = this.a;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_eye);
        a8g a8gVar = pq3.j;
        imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_primary, a8gVar.h(imageView))));
        TextView textView = new TextView(context);
        q9i.a(q9i.e, textView);
        textView.setText(R.string.chat_screen_read_participants_read_header);
        textView.setTextColor(a8gVar.h(textView).getText().b);
        this.l = textView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.icon_chevron_right);
        imageView2.setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_secondary, a8gVar.h(imageView2))));
        qda qdaVar = new qda(imageView, textView, imageView2, context);
        qdaVar.setId(R.id.messages_list_context_read_by_header);
        qdaVar.setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        qdaVar.setBackground(col.c(((fn8) a8gVar.h(qdaVar).u().c.b).c, new ColorDrawable(a8gVar.h(qdaVar).b().f), null, 4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 8388627;
        layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        qdaVar.addView(imageView, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        qdaVar.addView(textView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        layoutParams3.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        qdaVar.addView(imageView2, layoutParams3);
        qe7.H(qdaVar, 300L, new mda(this, 0));
        return qdaVar;
    }

    public final void f(int i) {
        View viewD = d();
        viewD.measure(View.MeasureSpec.makeMeasureSpec(b().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
        ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = viewD.getMeasuredHeight();
        viewD.setLayoutParams(layoutParams);
        ViewParent parent = b().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gp2 gp2Var = new gp2();
            gp2Var.c = 150L;
            gp2Var.d = new DecelerateInterpolator(1.2f);
            gp2Var.b(b());
            x2i.a(gp2Var, viewGroup);
        }
        c().setVisibility(8);
        viewD.setVisibility(0);
        viewD.setScaleX(0.75f);
        viewD.setScaleY(0.75f);
        viewD.setAlpha(0.0f);
        bdc.a(viewD, new sda(viewD, viewD, 0));
    }

    public final boolean g(boolean z) {
        RecyclerView recyclerView;
        bq4 bq4Var = this.j;
        if (bq4Var != null && (recyclerView = this.i) != null) {
            if ((bq4Var.getVisibility() == 0) != z) {
                bq4Var.setVisibility(z ? 0 : 8);
                recyclerView.setVisibility(z ? 8 : 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        b().onThemeChanged(kbcVar);
        LinearLayout linearLayoutC = c();
        int i = 0;
        while (true) {
            if (i < linearLayoutC.getChildCount()) {
                int i2 = i + 1;
                KeyEvent.Callback childAt = linearLayoutC.getChildAt(i);
                if (childAt == null) {
                    ore.i();
                    return;
                }
                eph ephVar = childAt instanceof eph ? (eph) childAt : null;
                if (ephVar != null) {
                    ephVar.onThemeChanged(kbcVar);
                }
                i = i2;
            } else {
                pda pdaVar = this.h;
                if (pdaVar == null) {
                    pdaVar = null;
                }
                if (pdaVar != null) {
                    pdaVar.onThemeChanged(kbcVar);
                }
                RecyclerView recyclerView = this.i;
                if (recyclerView == null) {
                    return;
                }
                int i3 = 0;
                while (true) {
                    if (!(i3 < recyclerView.getChildCount())) {
                        return;
                    }
                    int i4 = i3 + 1;
                    KeyEvent.Callback childAt2 = recyclerView.getChildAt(i3);
                    if (childAt2 == null) {
                        ore.i();
                        return;
                    }
                    eph ephVar2 = childAt2 instanceof eph ? (eph) childAt2 : null;
                    if (ephVar2 != null) {
                        ephVar2.onThemeChanged(kbcVar);
                    }
                    i3 = i4;
                }
            }
        }
    }
}
