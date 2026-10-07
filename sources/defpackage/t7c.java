package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class t7c extends FrameLayout implements eph {
    public static final /* synthetic */ int w = 0;
    public final int a;
    public final int b;
    public final int c;
    public CharSequence d;
    public String e;
    public o7c f;
    public p7c g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ynh l;
    public boolean m;
    public boolean n;
    public q7c o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final ValueAnimator u;
    public final ValueAnimator v;

    public t7c(final Context context) {
        super(context, null);
        this.a = getResources().getDimensionPixelSize(R.dimen.spacing_size_s);
        this.b = getResources().getDimensionPixelSize(R.dimen.spacing_size_l);
        this.c = getResources().getDimensionPixelSize(R.dimen.spacing_size_xl);
        this.e = getResources().getString(R.string.oneme_search_view_default_hint);
        this.f = o7c.a;
        final int i = 1;
        this.h = true;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = ynh.b;
        this.m = true;
        this.n = true;
        this.o = q7c.a;
        final int i2 = 0;
        final int i3 = 3;
        this.p = rx8.P(3, new af7() { // from class: k7c
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
                int i4 = i2;
                int i5 = 3;
                a8g a8gVar = pq3.j;
                lq4 lq4Var = null;
                final int i6 = 1;
                final t7c t7cVar = this;
                Context context2 = context;
                final int i7 = 0;
                switch (i4) {
                    case 0:
                        cs csVar = new cs(context2, null, 0);
                        csVar.setId(R.id.oneme_search_view_back_button);
                        int iK = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                        layoutParams.gravity = 8388627;
                        layoutParams.leftMargin = t7cVar.c;
                        csVar.setLayoutParams(layoutParams);
                        int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK2, iK2, iK2, iK2);
                        csVar.setImageResource(R.drawable.icon_arrow_left);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().b));
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i8 = i6;
                                t7c t7cVar2 = t7cVar;
                                switch (i8) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar);
                        return csVar;
                    case 1:
                        p1c p1cVar = new p1c(context2, 12);
                        p1cVar.setId(R.id.oneme_search_view_edit_text);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        boolean z = t7cVar.i;
                        int i8 = t7cVar.b;
                        int i9 = t7cVar.c;
                        layoutParams2.leftMargin = z ? c0a.e(26.0f, yl5.d().getDisplayMetrics().density, i9, i9) : 0;
                        int i10 = t7cVar.a;
                        layoutParams2.topMargin = i10;
                        layoutParams2.bottomMargin = i10;
                        p1cVar.setLayoutParams(layoutParams2);
                        p1cVar.setClipToOutline(true);
                        p1cVar.setOutlineProvider(new nt4(gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
                        p1cVar.setImeOptions(3);
                        p1cVar.setText(t7cVar.d);
                        p1cVar.setPadding(i9, i8, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), i8);
                        p1cVar.setBackgroundColor(a8gVar.h(p1cVar).h().b);
                        q9i.e.b(p1cVar, bx5.b);
                        Drawable drawableR = np4.r(p1cVar);
                        if (drawableR != null) {
                            sb8.m0(a8gVar.h(p1cVar).getText().h, drawableR);
                        }
                        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().d);
                        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
                        p1cVar.setSingleLine();
                        p1cVar.setOnEditorActionListener(new l7c(0, p1cVar));
                        bdc.a(p1cVar, new rda(6, p1cVar, p1cVar));
                        p1cVar.addTextChangedListener(new a3(4, t7cVar));
                        t7cVar.addView(p1cVar);
                        return p1cVar;
                    case 2:
                        cs csVar2 = new cs(context2, null, 0);
                        csVar2.setId(R.id.oneme_search_view_icon);
                        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                        layoutParams3.gravity = 8388629;
                        csVar2.setLayoutParams(layoutParams3);
                        int iK4 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK4, iK4, iK4, iK4);
                        csVar2.setImageResource(R.drawable.icon_search);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getIcon().b));
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i11 = i7;
                                t7c t7cVar2 = t7cVar;
                                switch (i11) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar2);
                        csVar2.setContentDescription(t7cVar.l.d(csVar2));
                        csVar2.setClickable(true);
                        return csVar2;
                    case 3:
                        ImageView imageView = new ImageView(context2, null);
                        imageView.setId(R.id.oneme_search_view_search_button);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageView.setPadding(iK5, iK5, iK5, iK5);
                        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(R.drawable.icon_search);
                        qe7.H(imageView, 300L, new ze3(i5, t7cVar));
                        n1g.N(new il3(i5, lq4Var, i6), imageView);
                        t7cVar.addView(imageView);
                        imageView.setContentDescription(t7cVar.l.d(imageView));
                        imageView.setClickable(true);
                        return imageView;
                    default:
                        cs csVar3 = new cs(context2, null, 0);
                        csVar3.setId(R.id.oneme_search_view_erase_button);
                        int iK6 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK6, iK6);
                        layoutParams5.gravity = 8388629;
                        csVar3.setLayoutParams(layoutParams5);
                        Editable text = ((p1c) t7cVar.q.getValue()).getText();
                        csVar3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        csVar3.setPadding(iK7, iK7, iK7, iK7);
                        csVar3.setImageResource(R.drawable.icon_cross_mini);
                        csVar3.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar3).getIcon().d));
                        final int i11 = 2;
                        qe7.H(csVar3, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i11;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar3);
                        return csVar3;
                }
            }
        });
        this.q = rx8.P(3, new af7() { // from class: k7c
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
                int i4 = i;
                int i5 = 3;
                a8g a8gVar = pq3.j;
                lq4 lq4Var = null;
                final int i6 = 1;
                final t7c t7cVar = this;
                Context context2 = context;
                final int i7 = 0;
                switch (i4) {
                    case 0:
                        cs csVar = new cs(context2, null, 0);
                        csVar.setId(R.id.oneme_search_view_back_button);
                        int iK = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                        layoutParams.gravity = 8388627;
                        layoutParams.leftMargin = t7cVar.c;
                        csVar.setLayoutParams(layoutParams);
                        int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK2, iK2, iK2, iK2);
                        csVar.setImageResource(R.drawable.icon_arrow_left);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().b));
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i6;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar);
                        return csVar;
                    case 1:
                        p1c p1cVar = new p1c(context2, 12);
                        p1cVar.setId(R.id.oneme_search_view_edit_text);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        boolean z = t7cVar.i;
                        int i8 = t7cVar.b;
                        int i9 = t7cVar.c;
                        layoutParams2.leftMargin = z ? c0a.e(26.0f, yl5.d().getDisplayMetrics().density, i9, i9) : 0;
                        int i10 = t7cVar.a;
                        layoutParams2.topMargin = i10;
                        layoutParams2.bottomMargin = i10;
                        p1cVar.setLayoutParams(layoutParams2);
                        p1cVar.setClipToOutline(true);
                        p1cVar.setOutlineProvider(new nt4(gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
                        p1cVar.setImeOptions(3);
                        p1cVar.setText(t7cVar.d);
                        p1cVar.setPadding(i9, i8, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), i8);
                        p1cVar.setBackgroundColor(a8gVar.h(p1cVar).h().b);
                        q9i.e.b(p1cVar, bx5.b);
                        Drawable drawableR = np4.r(p1cVar);
                        if (drawableR != null) {
                            sb8.m0(a8gVar.h(p1cVar).getText().h, drawableR);
                        }
                        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().d);
                        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
                        p1cVar.setSingleLine();
                        p1cVar.setOnEditorActionListener(new l7c(0, p1cVar));
                        bdc.a(p1cVar, new rda(6, p1cVar, p1cVar));
                        p1cVar.addTextChangedListener(new a3(4, t7cVar));
                        t7cVar.addView(p1cVar);
                        return p1cVar;
                    case 2:
                        cs csVar2 = new cs(context2, null, 0);
                        csVar2.setId(R.id.oneme_search_view_icon);
                        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                        layoutParams3.gravity = 8388629;
                        csVar2.setLayoutParams(layoutParams3);
                        int iK4 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK4, iK4, iK4, iK4);
                        csVar2.setImageResource(R.drawable.icon_search);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getIcon().b));
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i7;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar2);
                        csVar2.setContentDescription(t7cVar.l.d(csVar2));
                        csVar2.setClickable(true);
                        return csVar2;
                    case 3:
                        ImageView imageView = new ImageView(context2, null);
                        imageView.setId(R.id.oneme_search_view_search_button);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageView.setPadding(iK5, iK5, iK5, iK5);
                        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(R.drawable.icon_search);
                        qe7.H(imageView, 300L, new ze3(i5, t7cVar));
                        n1g.N(new il3(i5, lq4Var, i6), imageView);
                        t7cVar.addView(imageView);
                        imageView.setContentDescription(t7cVar.l.d(imageView));
                        imageView.setClickable(true);
                        return imageView;
                    default:
                        cs csVar3 = new cs(context2, null, 0);
                        csVar3.setId(R.id.oneme_search_view_erase_button);
                        int iK6 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK6, iK6);
                        layoutParams5.gravity = 8388629;
                        csVar3.setLayoutParams(layoutParams5);
                        Editable text = ((p1c) t7cVar.q.getValue()).getText();
                        csVar3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        csVar3.setPadding(iK7, iK7, iK7, iK7);
                        csVar3.setImageResource(R.drawable.icon_cross_mini);
                        csVar3.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar3).getIcon().d));
                        final int i11 = 2;
                        qe7.H(csVar3, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i11;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar3);
                        return csVar3;
                }
            }
        });
        final int i4 = 2;
        this.r = rx8.P(3, new af7() { // from class: k7c
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
                int i5 = i4;
                int i6 = 3;
                a8g a8gVar = pq3.j;
                lq4 lq4Var = null;
                final int i7 = 1;
                final t7c t7cVar = this;
                Context context2 = context;
                final int i8 = 0;
                switch (i5) {
                    case 0:
                        cs csVar = new cs(context2, null, 0);
                        csVar.setId(R.id.oneme_search_view_back_button);
                        int iK = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                        layoutParams.gravity = 8388627;
                        layoutParams.leftMargin = t7cVar.c;
                        csVar.setLayoutParams(layoutParams);
                        int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK2, iK2, iK2, iK2);
                        csVar.setImageResource(R.drawable.icon_arrow_left);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().b));
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i7;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar);
                        return csVar;
                    case 1:
                        p1c p1cVar = new p1c(context2, 12);
                        p1cVar.setId(R.id.oneme_search_view_edit_text);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        boolean z = t7cVar.i;
                        int i9 = t7cVar.b;
                        int i10 = t7cVar.c;
                        layoutParams2.leftMargin = z ? c0a.e(26.0f, yl5.d().getDisplayMetrics().density, i10, i10) : 0;
                        int i11 = t7cVar.a;
                        layoutParams2.topMargin = i11;
                        layoutParams2.bottomMargin = i11;
                        p1cVar.setLayoutParams(layoutParams2);
                        p1cVar.setClipToOutline(true);
                        p1cVar.setOutlineProvider(new nt4(gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
                        p1cVar.setImeOptions(3);
                        p1cVar.setText(t7cVar.d);
                        p1cVar.setPadding(i10, i9, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), i9);
                        p1cVar.setBackgroundColor(a8gVar.h(p1cVar).h().b);
                        q9i.e.b(p1cVar, bx5.b);
                        Drawable drawableR = np4.r(p1cVar);
                        if (drawableR != null) {
                            sb8.m0(a8gVar.h(p1cVar).getText().h, drawableR);
                        }
                        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().d);
                        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
                        p1cVar.setSingleLine();
                        p1cVar.setOnEditorActionListener(new l7c(0, p1cVar));
                        bdc.a(p1cVar, new rda(6, p1cVar, p1cVar));
                        p1cVar.addTextChangedListener(new a3(4, t7cVar));
                        t7cVar.addView(p1cVar);
                        return p1cVar;
                    case 2:
                        cs csVar2 = new cs(context2, null, 0);
                        csVar2.setId(R.id.oneme_search_view_icon);
                        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                        layoutParams3.gravity = 8388629;
                        csVar2.setLayoutParams(layoutParams3);
                        int iK4 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK4, iK4, iK4, iK4);
                        csVar2.setImageResource(R.drawable.icon_search);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getIcon().b));
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i12 = i8;
                                t7c t7cVar2 = t7cVar;
                                switch (i12) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar2);
                        csVar2.setContentDescription(t7cVar.l.d(csVar2));
                        csVar2.setClickable(true);
                        return csVar2;
                    case 3:
                        ImageView imageView = new ImageView(context2, null);
                        imageView.setId(R.id.oneme_search_view_search_button);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageView.setPadding(iK5, iK5, iK5, iK5);
                        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(R.drawable.icon_search);
                        qe7.H(imageView, 300L, new ze3(i6, t7cVar));
                        n1g.N(new il3(i6, lq4Var, i7), imageView);
                        t7cVar.addView(imageView);
                        imageView.setContentDescription(t7cVar.l.d(imageView));
                        imageView.setClickable(true);
                        return imageView;
                    default:
                        cs csVar3 = new cs(context2, null, 0);
                        csVar3.setId(R.id.oneme_search_view_erase_button);
                        int iK6 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK6, iK6);
                        layoutParams5.gravity = 8388629;
                        csVar3.setLayoutParams(layoutParams5);
                        Editable text = ((p1c) t7cVar.q.getValue()).getText();
                        csVar3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        csVar3.setPadding(iK7, iK7, iK7, iK7);
                        csVar3.setImageResource(R.drawable.icon_cross_mini);
                        csVar3.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar3).getIcon().d));
                        final int i12 = 2;
                        qe7.H(csVar3, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i12;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar3);
                        return csVar3;
                }
            }
        });
        this.s = rx8.P(3, new af7() { // from class: k7c
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
                int i5 = i3;
                int i6 = 3;
                a8g a8gVar = pq3.j;
                lq4 lq4Var = null;
                final int i7 = 1;
                final t7c t7cVar = this;
                Context context2 = context;
                final int i8 = 0;
                switch (i5) {
                    case 0:
                        cs csVar = new cs(context2, null, 0);
                        csVar.setId(R.id.oneme_search_view_back_button);
                        int iK = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                        layoutParams.gravity = 8388627;
                        layoutParams.leftMargin = t7cVar.c;
                        csVar.setLayoutParams(layoutParams);
                        int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK2, iK2, iK2, iK2);
                        csVar.setImageResource(R.drawable.icon_arrow_left);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().b));
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i7;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar);
                        return csVar;
                    case 1:
                        p1c p1cVar = new p1c(context2, 12);
                        p1cVar.setId(R.id.oneme_search_view_edit_text);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        boolean z = t7cVar.i;
                        int i9 = t7cVar.b;
                        int i10 = t7cVar.c;
                        layoutParams2.leftMargin = z ? c0a.e(26.0f, yl5.d().getDisplayMetrics().density, i10, i10) : 0;
                        int i11 = t7cVar.a;
                        layoutParams2.topMargin = i11;
                        layoutParams2.bottomMargin = i11;
                        p1cVar.setLayoutParams(layoutParams2);
                        p1cVar.setClipToOutline(true);
                        p1cVar.setOutlineProvider(new nt4(gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
                        p1cVar.setImeOptions(3);
                        p1cVar.setText(t7cVar.d);
                        p1cVar.setPadding(i10, i9, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), i9);
                        p1cVar.setBackgroundColor(a8gVar.h(p1cVar).h().b);
                        q9i.e.b(p1cVar, bx5.b);
                        Drawable drawableR = np4.r(p1cVar);
                        if (drawableR != null) {
                            sb8.m0(a8gVar.h(p1cVar).getText().h, drawableR);
                        }
                        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().d);
                        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
                        p1cVar.setSingleLine();
                        p1cVar.setOnEditorActionListener(new l7c(0, p1cVar));
                        bdc.a(p1cVar, new rda(6, p1cVar, p1cVar));
                        p1cVar.addTextChangedListener(new a3(4, t7cVar));
                        t7cVar.addView(p1cVar);
                        return p1cVar;
                    case 2:
                        cs csVar2 = new cs(context2, null, 0);
                        csVar2.setId(R.id.oneme_search_view_icon);
                        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                        layoutParams3.gravity = 8388629;
                        csVar2.setLayoutParams(layoutParams3);
                        int iK4 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK4, iK4, iK4, iK4);
                        csVar2.setImageResource(R.drawable.icon_search);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getIcon().b));
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i8;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar2);
                        csVar2.setContentDescription(t7cVar.l.d(csVar2));
                        csVar2.setClickable(true);
                        return csVar2;
                    case 3:
                        ImageView imageView = new ImageView(context2, null);
                        imageView.setId(R.id.oneme_search_view_search_button);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageView.setPadding(iK5, iK5, iK5, iK5);
                        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(R.drawable.icon_search);
                        qe7.H(imageView, 300L, new ze3(i6, t7cVar));
                        n1g.N(new il3(i6, lq4Var, i7), imageView);
                        t7cVar.addView(imageView);
                        imageView.setContentDescription(t7cVar.l.d(imageView));
                        imageView.setClickable(true);
                        return imageView;
                    default:
                        cs csVar3 = new cs(context2, null, 0);
                        csVar3.setId(R.id.oneme_search_view_erase_button);
                        int iK6 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK6, iK6);
                        layoutParams5.gravity = 8388629;
                        csVar3.setLayoutParams(layoutParams5);
                        Editable text = ((p1c) t7cVar.q.getValue()).getText();
                        csVar3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        csVar3.setPadding(iK7, iK7, iK7, iK7);
                        csVar3.setImageResource(R.drawable.icon_cross_mini);
                        csVar3.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar3).getIcon().d));
                        final int i12 = 2;
                        qe7.H(csVar3, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i12;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar3);
                        return csVar3;
                }
            }
        });
        final int i5 = 4;
        this.t = rx8.P(3, new af7() { // from class: k7c
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
                int i6 = i5;
                int i7 = 3;
                a8g a8gVar = pq3.j;
                lq4 lq4Var = null;
                final int i8 = 1;
                final t7c t7cVar = this;
                Context context2 = context;
                final int i9 = 0;
                switch (i6) {
                    case 0:
                        cs csVar = new cs(context2, null, 0);
                        csVar.setId(R.id.oneme_search_view_back_button);
                        int iK = gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
                        layoutParams.gravity = 8388627;
                        layoutParams.leftMargin = t7cVar.c;
                        csVar.setLayoutParams(layoutParams);
                        int iK2 = gm0.K(1.0f * yl5.d().getDisplayMetrics().density);
                        csVar.setPadding(iK2, iK2, iK2, iK2);
                        csVar.setImageResource(R.drawable.icon_arrow_left);
                        csVar.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar).getIcon().b));
                        qe7.H(csVar, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i8;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar);
                        return csVar;
                    case 1:
                        p1c p1cVar = new p1c(context2, 12);
                        p1cVar.setId(R.id.oneme_search_view_edit_text);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, -2);
                        layoutParams2.gravity = 8388629;
                        boolean z = t7cVar.i;
                        int i10 = t7cVar.b;
                        int i11 = t7cVar.c;
                        layoutParams2.leftMargin = z ? c0a.e(26.0f, yl5.d().getDisplayMetrics().density, i11, i11) : 0;
                        int i12 = t7cVar.a;
                        layoutParams2.topMargin = i12;
                        layoutParams2.bottomMargin = i12;
                        p1cVar.setLayoutParams(layoutParams2);
                        p1cVar.setClipToOutline(true);
                        p1cVar.setOutlineProvider(new nt4(gm0.K(10.0f * yl5.d().getDisplayMetrics().density)));
                        p1cVar.setImeOptions(3);
                        p1cVar.setText(t7cVar.d);
                        p1cVar.setPadding(i11, i10, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), i10);
                        p1cVar.setBackgroundColor(a8gVar.h(p1cVar).h().b);
                        q9i.e.b(p1cVar, bx5.b);
                        Drawable drawableR = np4.r(p1cVar);
                        if (drawableR != null) {
                            sb8.m0(a8gVar.h(p1cVar).getText().h, drawableR);
                        }
                        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().d);
                        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
                        p1cVar.setSingleLine();
                        p1cVar.setOnEditorActionListener(new l7c(0, p1cVar));
                        bdc.a(p1cVar, new rda(6, p1cVar, p1cVar));
                        p1cVar.addTextChangedListener(new a3(4, t7cVar));
                        t7cVar.addView(p1cVar);
                        return p1cVar;
                    case 2:
                        cs csVar2 = new cs(context2, null, 0);
                        csVar2.setId(R.id.oneme_search_view_icon);
                        int iK3 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, iK3);
                        layoutParams3.gravity = 8388629;
                        csVar2.setLayoutParams(layoutParams3);
                        int iK4 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        csVar2.setPadding(iK4, iK4, iK4, iK4);
                        csVar2.setImageResource(R.drawable.icon_search);
                        csVar2.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar2).getIcon().b));
                        qe7.H(csVar2, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i13 = i9;
                                t7c t7cVar2 = t7cVar;
                                switch (i13) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar2);
                        csVar2.setContentDescription(t7cVar.l.d(csVar2));
                        csVar2.setClickable(true);
                        return csVar2;
                    case 3:
                        ImageView imageView = new ImageView(context2, null);
                        imageView.setId(R.id.oneme_search_view_search_button);
                        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
                        layoutParams4.gravity = 8388629;
                        imageView.setLayoutParams(layoutParams4);
                        int iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageView.setPadding(iK5, iK5, iK5, iK5);
                        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                        imageView.setImageResource(R.drawable.icon_search);
                        qe7.H(imageView, 300L, new ze3(i7, t7cVar));
                        n1g.N(new il3(i7, lq4Var, i8), imageView);
                        t7cVar.addView(imageView);
                        imageView.setContentDescription(t7cVar.l.d(imageView));
                        imageView.setClickable(true);
                        return imageView;
                    default:
                        cs csVar3 = new cs(context2, null, 0);
                        csVar3.setId(R.id.oneme_search_view_erase_button);
                        int iK6 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK6, iK6);
                        layoutParams5.gravity = 8388629;
                        csVar3.setLayoutParams(layoutParams5);
                        Editable text = ((p1c) t7cVar.q.getValue()).getText();
                        csVar3.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                        int iK7 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                        csVar3.setPadding(iK7, iK7, iK7, iK7);
                        csVar3.setImageResource(R.drawable.icon_cross_mini);
                        csVar3.setImageTintList(ColorStateList.valueOf(a8gVar.h(csVar3).getIcon().d));
                        final int i13 = 2;
                        qe7.H(csVar3, 300L, new View.OnClickListener() { // from class: n7c
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i14 = i13;
                                t7c t7cVar2 = t7cVar;
                                switch (i14) {
                                    case 0:
                                        t7cVar2.d();
                                        break;
                                    case 1:
                                        t7cVar2.b();
                                        p7c p7cVar = t7cVar2.g;
                                        if (p7cVar != null) {
                                            p7cVar.o();
                                        }
                                        break;
                                    default:
                                        ((p1c) t7cVar2.q.getValue()).setText((CharSequence) null);
                                        break;
                                }
                            }
                        });
                        t7cVar.addView(csVar3);
                        return csVar3;
                }
            }
        });
        ValueAnimator duration = ValueAnimator.ofInt(120).setDuration(120L);
        duration.addListener(new s7c(this));
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m7c
            public final /* synthetic */ t7c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i2;
                t7c t7cVar = this.b;
                switch (i6) {
                    case 0:
                        int width = t7cVar.getWidth();
                        ny8 ny8Var = t7cVar.q;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ny8 ny8Var2 = t7cVar.p;
                        if (ny8Var2.d()) {
                            ((cs) ny8Var2.getValue()).setAlpha(animatedFraction);
                        }
                        ((cs) t7cVar.t.getValue()).setAlpha(animatedFraction);
                        View view = (View) ny8Var.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = ((View) ny8Var.getValue()).getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            layoutParams.width = (int) ((width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0)) * animatedFraction);
                            view.setLayoutParams(layoutParams);
                        }
                        break;
                    default:
                        float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                        ny8 ny8Var3 = t7cVar.p;
                        ny8 ny8Var4 = t7cVar.q;
                        if (ny8Var3.d()) {
                            cs csVar = (cs) ny8Var3.getValue();
                            csVar.setAlpha(csVar.getAlpha() * animatedFraction2);
                        }
                        cs csVar2 = (cs) t7cVar.t.getValue();
                        csVar2.setAlpha(csVar2.getAlpha() * animatedFraction2);
                        View view2 = (View) ny8Var4.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            layoutParams3.width = (int) (((p1c) ny8Var4.getValue()).getWidth() * animatedFraction2);
                            view2.setLayoutParams(layoutParams3);
                        }
                        break;
                }
            }
        });
        this.u = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(120).setDuration(120L);
        duration2.addListener(new r7c(this, context));
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m7c
            public final /* synthetic */ t7c b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = i;
                t7c t7cVar = this.b;
                switch (i6) {
                    case 0:
                        int width = t7cVar.getWidth();
                        ny8 ny8Var = t7cVar.q;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        ny8 ny8Var2 = t7cVar.p;
                        if (ny8Var2.d()) {
                            ((cs) ny8Var2.getValue()).setAlpha(animatedFraction);
                        }
                        ((cs) t7cVar.t.getValue()).setAlpha(animatedFraction);
                        View view = (View) ny8Var.getValue();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = ((View) ny8Var.getValue()).getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            layoutParams.width = (int) ((width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0)) * animatedFraction);
                            view.setLayoutParams(layoutParams);
                        }
                        break;
                    default:
                        float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                        ny8 ny8Var3 = t7cVar.p;
                        ny8 ny8Var4 = t7cVar.q;
                        if (ny8Var3.d()) {
                            cs csVar = (cs) ny8Var3.getValue();
                            csVar.setAlpha(csVar.getAlpha() * animatedFraction2);
                        }
                        cs csVar2 = (cs) t7cVar.t.getValue();
                        csVar2.setAlpha(csVar2.getAlpha() * animatedFraction2);
                        View view2 = (View) ny8Var4.getValue();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if (layoutParams3 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        } else {
                            layoutParams3.width = (int) (((p1c) ny8Var4.getValue()).getWidth() * animatedFraction2);
                            view2.setLayoutParams(layoutParams3);
                        }
                        break;
                }
            }
        });
        this.v = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.k) {
            a(this.u);
            float f = this.n ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.v;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c(boolean z) {
        if (this.j) {
            a(this.v);
            float f = this.m ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.u;
            valueAnimator.setCurrentFraction(f);
            if (z) {
                valueAnimator.addListener(new li(11, this));
            }
            addOnLayoutChangeListener(new xc0(14, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
            setLayoutParams(layoutParams);
        }
    }

    public final void d() {
        c(true);
        p7c p7cVar = this.g;
        if (p7cVar != null) {
            p7cVar.f();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.n;
    }

    public final boolean getExpandWithAnimation() {
        return this.m;
    }

    public final ynh getSearchButtonContentDescription() {
        return this.l;
    }

    public final boolean getShouldShowBackButton() {
        return this.i;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.h;
    }

    public final q7c getState() {
        return this.o;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.o != q7c.c) {
            return;
        }
        ny8 ny8Var = this.q;
        if (ny8Var.d()) {
            p1c p1cVar = (p1c) ny8Var.getValue();
            p1cVar.post(new ng7(p1cVar, 17, this));
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ny8 ny8Var = this.r;
        if (ny8Var.d()) {
            ((cs) ny8Var.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        }
        ny8 ny8Var2 = this.p;
        if (ny8Var2.d()) {
            ((cs) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        }
        ny8 ny8Var3 = this.t;
        if (ny8Var3.d()) {
            ((cs) ny8Var3.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        }
        ny8 ny8Var4 = this.q;
        if (ny8Var4.d()) {
            p1c p1cVar = (p1c) ny8Var4.getValue();
            f55.f(p1cVar, kbcVar);
            p1cVar.setBackgroundColor(kbcVar.h().b);
            p1cVar.setHintTextColor(kbcVar.getText().d);
            p1cVar.setTextColor(kbcVar.getText().b);
        }
    }

    public final void setCollapseWithAnimation(boolean z) {
        this.n = z;
    }

    public final void setCollapsedStyle(o7c o7cVar) {
        this.f = o7cVar;
        int iOrdinal = o7cVar.ordinal();
        ny8 ny8Var = this.r;
        q7c q7cVar = q7c.a;
        ny8 ny8Var2 = this.s;
        if (iOrdinal == 0) {
            if (ny8Var.d()) {
                ((cs) ny8Var.getValue()).setVisibility(8);
            }
            if (this.o == q7cVar) {
                ((View) ny8Var2.getValue()).setVisibility(this.h ? 0 : 8);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            ore.o();
            return;
        }
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setVisibility(8);
        }
        if (this.o == q7cVar) {
            ((View) ny8Var.getValue()).setVisibility(this.h ? 0 : 8);
        }
    }

    public final void setCollapsible(boolean z) {
        this.k = z;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.m = z;
    }

    public final void setExpandable(boolean z) {
        this.j = z;
    }

    public final void setListener(p7c p7cVar) {
        this.g = p7cVar;
    }

    public final void setSearchButtonContentDescription(ynh ynhVar) {
        this.l = ynhVar;
    }

    public final void setSearchHint(String str) {
        this.e = str;
        ny8 ny8Var = this.q;
        if (ny8Var.d()) {
            ((p1c) ny8Var.getValue()).setHint(str);
        }
    }

    public final void setSearchText(CharSequence charSequence) {
        this.d = charSequence;
        ny8 ny8Var = this.q;
        if (ny8Var.d()) {
            p1c p1cVar = (p1c) ny8Var.getValue();
            p1cVar.setText(charSequence);
            p1cVar.setSelection(p1cVar.length());
        }
    }

    public final void setShouldShowBackButton(boolean z) {
        this.i = z;
    }

    public final void setShouldShowSearchIcon(boolean z) {
        this.h = z;
    }
}
