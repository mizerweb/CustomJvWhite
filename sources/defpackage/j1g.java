package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j1g extends wod {
    public final ImageView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public fql u;
    public final TextView v;
    public final zr w;
    public final AppCompatTextView x;
    public final cyb y;
    public final ImageView z;

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
    public j1g(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setGravity(16);
        noh nohVar = q9i.e;
        q9i.a(nohVar, textView);
        this.v = textView;
        final zr zrVar = new zr(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        zrVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), zrVar.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), zrVar.getPaddingBottom());
        zrVar.setLayoutParams(layoutParams);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        zrVar.setEllipsize(truncateAt);
        zrVar.setInputType(524288);
        q9i.a(nohVar, zrVar);
        zrVar.setBackground(null);
        zrVar.setSingleLine(true);
        zrVar.setHint(zrVar.getResources().getText(R.string.oneme_profile_edit_shortlink_placeholder));
        zrVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: i1g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Editable text;
                j1g j1gVar = this.a;
                j1gVar.z.setVisibility((!z || (text = zrVar.getText()) == null || text.length() == 0) ? 8 : 0);
                if (j1gVar.u instanceof f1g) {
                    j1gVar.A.setVisibility(8);
                }
            }
        });
        zrVar.setOnEditorActionListener(new fi5(1));
        this.w = zrVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        appCompatTextView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f));
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setGravity(16);
        q9i.a(nohVar, appCompatTextView);
        appCompatTextView.setBackground(null);
        appCompatTextView.setSingleLine(true);
        this.x = appCompatTextView;
        cyb cybVar = new cyb(context);
        cybVar.setPaddingRelative(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), cybVar.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), cybVar.getPaddingBottom());
        cybVar.setSize(ayb.h);
        cybVar.setAppearance(zxb.SECONDARY);
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.y = cybVar;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.profile_edit_short_link_input_button);
        imageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
        int marginEnd = layoutParams3.getMarginEnd();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        layoutParams3.setMarginStart(iK);
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i;
        layoutParams3.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i2;
        imageView.setLayoutParams(layoutParams3);
        qe7.H(imageView, 300L, new gwc(25, this));
        a8g a8gVar = pq3.j;
        int i3 = a8gVar.h(imageView).getIcon().d;
        Drawable drawableMutate = imageView.getContext().getDrawable(R.drawable.icon_cross).mutate();
        sb8.m0(i3, drawableMutate);
        imageView.setImageDrawable(drawableMutate);
        this.z = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R.id.profile_edit_short_link_input_button);
        imageView2.setVisibility(8);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(gm0.K(24.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
        int marginEnd2 = layoutParams4.getMarginEnd();
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        layoutParams4.setMarginStart(iK2);
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i4;
        layoutParams4.setMarginEnd(marginEnd2);
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i5;
        imageView2.setLayoutParams(layoutParams4);
        int i6 = a8gVar.h(imageView2).getIcon().b;
        Drawable drawableMutate2 = imageView2.getContext().getDrawable(R.drawable.icon_dots_vertical).mutate();
        sb8.m0(i6, drawableMutate2);
        imageView2.setImageDrawable(drawableMutate2);
        this.A = imageView2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
        linearLayout2.setPaddingRelative(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), linearLayout2.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), linearLayout2.getPaddingBottom());
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipToOutline(true);
        linearLayout2.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        linearLayout2.setBackgroundColor(a8gVar.h(linearLayout2).b().b);
        linearLayout2.addView(textView);
        linearLayout2.addView(zrVar);
        linearLayout2.addView(appCompatTextView);
        linearLayout2.addView(imageView2);
        linearLayout2.addView(imageView);
        this.B = linearLayout2;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(a8gVar.h(textView2).getText().j);
        noh nohVar2 = q9i.i;
        q9i.a(nohVar2, textView2);
        textView2.setPaddingRelative(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), textView2.getPaddingTop(), textView2.getPaddingEnd(), textView2.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        textView2.setLayoutParams(layoutParams5);
        this.C = textView2;
        TextView textView3 = new TextView(context);
        q9i.a(nohVar2, textView3);
        textView3.setText(textView3.getResources().getText(R.string.oneme_profile_edit_shortlink_input_description));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        textView3.setLayoutParams(layoutParams6);
        this.D = textView3;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(cybVar);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        linearLayout.setPaddingRelative(iK3, linearLayout.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), iK4);
        n1g.N(new nff(this, (lq4) null, 2), linearLayout);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        H(((h1g) k79Var).a);
    }

    public final void H(fql fqlVar) {
        Editable text;
        boolean z = fqlVar instanceof g1g;
        View view = this.a;
        TextView textView = this.D;
        ImageView imageView = this.A;
        ImageView imageView2 = this.z;
        LinearLayout linearLayout = this.B;
        cyb cybVar = this.y;
        TextView textView2 = this.v;
        AppCompatTextView appCompatTextView = this.x;
        zr zrVar = this.w;
        int i = 8;
        if (z) {
            cybVar.setVisibility(8);
            linearLayout.setVisibility(0);
            zrVar.setVisibility(8);
            nl9.c(zrVar);
            appCompatTextView.setVisibility(0);
            textView2.setVisibility(8);
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            textView.setVisibility(8);
            appCompatTextView.setText(((g1g) fqlVar).a.b(view.getContext()));
        } else {
            if (!(fqlVar instanceof f1g)) {
                ore.o();
                return;
            }
            cybVar.setVisibility(8);
            linearLayout.setVisibility(0);
            zrVar.setVisibility(0);
            appCompatTextView.setVisibility(8);
            textView2.setVisibility(0);
            imageView2.setVisibility((!zrVar.isFocused() || (text = zrVar.getText()) == null || text.length() == 0) ? 8 : 0);
            f1g f1gVar = (f1g) fqlVar;
            imageView.setVisibility(8);
            textView.setVisibility(f1gVar.d ? 0 : 8);
            textView2.setText(f1gVar.a);
            if (!(this.u instanceof f1g)) {
                nl9.d(zrVar, true);
                zrVar.setText(f1gVar.b);
                zrVar.post(new yde(this, 24, fqlVar));
            }
            zrVar.setHint(f1gVar.c.b(view.getContext()));
        }
        this.u = fqlVar;
        if (fqlVar.b() != null && fqlVar.c() != null) {
            i = 0;
        }
        TextView textView3 = this.C;
        textView3.setVisibility(i);
        ynh ynhVarB = fqlVar.b();
        textView3.setText(ynhVarB != null ? ynhVarB.b(textView3.getContext()) : null);
        Integer numC = fqlVar.c();
        if (numC != null) {
            textView3.setTextColor(oc9.Z(numC.intValue(), pq3.j.h(textView3)));
        }
    }
}
