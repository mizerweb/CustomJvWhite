package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s3d extends ViewGroup {
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final g4d e;
    public final yd1 f;
    public kc7 g;
    public boolean h;
    public r3d i;

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
    public s3d(Context context) {
        super(context);
        this.a = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        this.b = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        TextView textViewE = qv1.e(context, R.id.oneme_chatmedia_viewer_info_panel_current_time_view);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.l(textViewE).b.getText().b);
        noh nohVar = q9i.s;
        q9i.a(nohVar, textViewE);
        this.c = textViewE;
        TextView textViewE2 = qv1.e(context, R.id.oneme_chatmedia_viewer_info_panel_duration_view);
        textViewE2.setTextColor(a8gVar.l(textViewE2).b.getText().b);
        q9i.a(nohVar, textViewE2);
        this.d = textViewE2;
        g4d g4dVar = new g4d(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(lvb.I0(a8gVar.l(g4dVar).b.getIcon().b, 0.8f));
        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 100.0f);
        g4dVar.setThumb(gradientDrawable);
        g4dVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), g4dVar.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), g4dVar.getPaddingBottom());
        g4dVar.setProgressBackgroundTintList(ColorStateList.valueOf(a8gVar.l(g4dVar).b.getIcon().d));
        g4dVar.setProgressTintList(ColorStateList.valueOf(a8gVar.l(g4dVar).b.h().a));
        g4dVar.setSecondaryProgressTintList(ColorStateList.valueOf(a8gVar.l(g4dVar).b.getIcon().c));
        this.e = g4dVar;
        yd1 yd1Var = new yd1(context, 1);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yd1Var.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        yd1Var.b = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        yd1Var.addView(progressBar, layoutParams);
        yd1Var.d = progressBar;
        TextView textView = new TextView(context);
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        q9i.a(q9i.o, textView);
        textView.setGravity(17);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        yd1Var.addView(textView, layoutParams2);
        yd1Var.c = textView;
        yd1Var.setElevation(yl5.d().getDisplayMetrics().density * 4.0f);
        float f = yl5.d().getDisplayMetrics().density * 14.0f;
        View view = new View(yd1Var.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(gm0.K(1.0f * yl5.d().getDisplayMetrics().density), a8gVar.l(view).b.l().d);
        gradientDrawable2.setCornerRadius(f);
        view.setBackground(gradientDrawable2);
        yd1Var.addView(view, new FrameLayout.LayoutParams(-1, -1));
        yd1Var.setOutlineProvider(new nt4(f));
        this.f = yd1Var;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textViewE);
        addView(textViewE2);
        addView(g4dVar);
        addView(yd1Var);
        g4dVar.setOnSeekBarChangeListener(new q3d(this));
    }

    public final void a(j53 j53Var) {
        Bitmap bitmap;
        boolean z = j53Var.b;
        kc7 kc7Var = j53Var.a;
        kc7 kc7Var2 = (kc7Var == null || ((bitmap = kc7Var.a) != null && bitmap.isRecycled())) ? null : kc7Var;
        this.g = kc7Var2;
        Bitmap bitmap2 = kc7Var2 != null ? kc7Var2.a : null;
        yd1 yd1Var = this.f;
        ((ImageView) yd1Var.b).setImageBitmap(bitmap2);
        if (kc7Var == null && !z) {
            yd1Var.setVisibility(8);
            this.h = true;
        } else {
            yd1Var.setVisibility(0);
            this.h = true;
            ((ProgressBar) yd1Var.d).setVisibility(z ? 0 : 8);
        }
    }

    public final r3d getListener() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yd1 yd1Var = this.f;
        int visibility = yd1Var.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            qyj.M(yd1Var, i6, i5 - yd1Var.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        qyj.M(textView, i6, i5, 0, 12);
        int measuredWidth = getMeasuredWidth() - i6;
        TextView textView2 = this.d;
        qyj.M(textView2, measuredWidth - textView2.getMeasuredWidth(), i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight();
        qyj.M(this.e, i6, measuredHeight + i5 + i5, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        g4d g4dVar = this.e;
        g4dVar.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int measuredHeight = g4dVar.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        kc7 kc7Var = this.g;
        int i3 = kc7Var != null ? kc7Var.b : 0;
        int i4 = kc7Var != null ? kc7Var.c : 0;
        if (i3 != 0 && i4 != 0) {
            yd1 yd1Var = this.f;
            if (yd1Var.getVisibility() == 0) {
                yd1Var.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(r3d r3dVar) {
        this.i = r3dVar;
    }
}
