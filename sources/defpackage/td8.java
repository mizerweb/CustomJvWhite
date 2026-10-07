package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class td8 extends ViewGroup implements r3d {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ifh e;
    public final TextView f;
    public final TextView g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ImageView k;
    public final pzf l;
    public final q8e m;

    public td8(final Context context) {
        super(context);
        this.a = gm0.K(9.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.c = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.d = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.e = new ifh(new q38(6));
        TextView textViewE = qv1.e(context, R.id.oneme_chatmedia_viewer_info_panel_author_view);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        final int i = 1;
        textViewE.setGravity(1);
        textViewE.setLayoutParams(layoutParams);
        q9i.a(q9i.i, textViewE);
        textViewE.setMaxLines(1);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        a8g a8gVar = pq3.j;
        textViewE.setTextColor(a8gVar.l(textViewE).b.getText().b);
        this.f = textViewE;
        TextView textViewE2 = qv1.e(context, R.id.oneme_chatmedia_viewer_info_panel_date_view);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textViewE2.setGravity(1);
        textViewE2.setLayoutParams(layoutParams2);
        q9i.a(q9i.s, textViewE2);
        textViewE2.setTextColor(a8gVar.l(textViewE2).b.getText().b);
        this.g = textViewE2;
        final int i2 = 0;
        this.h = rx8.P(3, new af7() { // from class: qd8
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar2 = pq3.j;
                td8 td8Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        s3d s3dVar = new s3d(context2);
                        s3dVar.setListener(td8Var);
                        return s3dVar;
                    case 1:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_chatmedia_viewer_info_panel_mute_view);
                        int i4 = a8gVar2.l(imageViewD).b.getIcon().b;
                        Drawable drawableMutate = imageViewD.getContext().getDrawable(R.drawable.icon_sound).mutate();
                        sb8.m0(i4, drawableMutate);
                        imageViewD.setImageDrawable(drawableMutate);
                        imageViewD.setBackground(col.c(((bs0) a8gVar2.l(imageViewD).b.u().c.g).c, null, null, 6));
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageViewD.setPadding(iK, iK, iK, iK);
                        qe7.H(imageViewD, 300L, new rd8(td8Var, 1));
                        return imageViewD;
                    default:
                        cyb cybVar = new cyb(context2);
                        cybVar.setCustomTheme(a8gVar2.l(cybVar).b);
                        cybVar.setIconResource(R.drawable.icon_settings);
                        cybVar.setSize(ayb.i);
                        cybVar.setAppearance(zxb.GHOST);
                        qe7.H(cybVar, 300L, new rd8(td8Var, 2));
                        return cybVar;
                }
            }
        });
        this.i = rx8.P(3, new af7() { // from class: qd8
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                a8g a8gVar2 = pq3.j;
                td8 td8Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        s3d s3dVar = new s3d(context2);
                        s3dVar.setListener(td8Var);
                        return s3dVar;
                    case 1:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_chatmedia_viewer_info_panel_mute_view);
                        int i4 = a8gVar2.l(imageViewD).b.getIcon().b;
                        Drawable drawableMutate = imageViewD.getContext().getDrawable(R.drawable.icon_sound).mutate();
                        sb8.m0(i4, drawableMutate);
                        imageViewD.setImageDrawable(drawableMutate);
                        imageViewD.setBackground(col.c(((bs0) a8gVar2.l(imageViewD).b.u().c.g).c, null, null, 6));
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageViewD.setPadding(iK, iK, iK, iK);
                        qe7.H(imageViewD, 300L, new rd8(td8Var, 1));
                        return imageViewD;
                    default:
                        cyb cybVar = new cyb(context2);
                        cybVar.setCustomTheme(a8gVar2.l(cybVar).b);
                        cybVar.setIconResource(R.drawable.icon_settings);
                        cybVar.setSize(ayb.i);
                        cybVar.setAppearance(zxb.GHOST);
                        qe7.H(cybVar, 300L, new rd8(td8Var, 2));
                        return cybVar;
                }
            }
        });
        final int i3 = 2;
        this.j = rx8.P(3, new af7() { // from class: qd8
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                a8g a8gVar2 = pq3.j;
                td8 td8Var = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        s3d s3dVar = new s3d(context2);
                        s3dVar.setListener(td8Var);
                        return s3dVar;
                    case 1:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_chatmedia_viewer_info_panel_mute_view);
                        int i5 = a8gVar2.l(imageViewD).b.getIcon().b;
                        Drawable drawableMutate = imageViewD.getContext().getDrawable(R.drawable.icon_sound).mutate();
                        sb8.m0(i5, drawableMutate);
                        imageViewD.setImageDrawable(drawableMutate);
                        imageViewD.setBackground(col.c(((bs0) a8gVar2.l(imageViewD).b.u().c.g).c, null, null, 6));
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        imageViewD.setPadding(iK, iK, iK, iK);
                        qe7.H(imageViewD, 300L, new rd8(td8Var, 1));
                        return imageViewD;
                    default:
                        cyb cybVar = new cyb(context2);
                        cybVar.setCustomTheme(a8gVar2.l(cybVar).b);
                        cybVar.setIconResource(R.drawable.icon_settings);
                        cybVar.setSize(ayb.i);
                        cybVar.setAppearance(zxb.GHOST);
                        qe7.H(cybVar, 300L, new rd8(td8Var, 2));
                        return cybVar;
                }
            }
        });
        ImageView imageViewD = qv1.d(context, R.id.oneme_chatmedia_viewer_info_panel_forward_message_view);
        int i4 = a8gVar.l(imageViewD).b.getIcon().b;
        Drawable drawableMutate = imageViewD.getContext().getDrawable(R.drawable.icon_forward).mutate();
        sb8.m0(i4, drawableMutate);
        imageViewD.setImageDrawable(drawableMutate);
        imageViewD.setBackground(col.c(((bs0) a8gVar.l(imageViewD).b.u().c.g).c, null, null, 6));
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        imageViewD.setPadding(iK, iK, iK, iK);
        qe7.H(imageViewD, 300L, new rd8(this, 0));
        this.k = imageViewD;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.l = pzfVarB;
        this.m = new q8e(pzfVarB);
        addView(textViewE);
        addView(textViewE2);
        addView(imageViewD);
    }

    public static void a(float f, cyb cybVar, td8 td8Var) {
        if (f == 1.0f) {
            cybVar.setCounterText(null);
            return;
        }
        cybVar.getCounterView().setTypography(q9i.o.g());
        cybVar.getCounterView().setBackgroundStrokeWidth(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        cybVar.getCounterView().setHasBackgroundStroke(true);
        cybVar.setCounterText(td8Var.getNumberFormat().format(Float.valueOf(f)));
    }

    private final DecimalFormat getNumberFormat() {
        return (DecimalFormat) this.e.getValue();
    }

    public final void b(k53 k53Var) {
        this.f.setText(k53Var.a);
        this.g.setText(k53Var.b);
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            ((s3d) ny8Var.getValue()).a(k53Var.d);
        }
        this.k.setVisibility(k53Var.e ? 0 : 8);
    }

    public final void c(k53 k53Var) {
        ny8 ny8Var = this.h;
        n7j.a(this, (View) ny8Var.getValue(), -1);
        ((View) ny8Var.getValue()).setVisibility(0);
        ny8 ny8Var2 = this.i;
        n7j.a(this, (View) ny8Var2.getValue(), -1);
        ((View) ny8Var2.getValue()).setVisibility(0);
        ((s3d) ny8Var.getValue()).a(k53Var.d);
        if (k53Var.f) {
            ny8 ny8Var3 = this.j;
            n7j.a(this, (View) ny8Var3.getValue(), -1);
            ((View) ny8Var3.getValue()).setVisibility(0);
        }
    }

    public final void d(boolean z) {
        Drawable drawableMutate;
        ny8 ny8Var = this.i;
        if (ny8Var.d()) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            a8g a8gVar = pq3.j;
            if (z) {
                int i = a8gVar.l(imageView).b.getIcon().b;
                drawableMutate = imageView.getContext().getDrawable(R.drawable.icon_sound_crossed).mutate();
                sb8.m0(i, drawableMutate);
            } else {
                int i2 = a8gVar.l(imageView).b.getIcon().b;
                drawableMutate = imageView.getContext().getDrawable(R.drawable.icon_sound).mutate();
                sb8.m0(i2, drawableMutate);
            }
            imageView.setImageDrawable(drawableMutate);
        }
    }

    public final void e(long j, long j2, long j3) {
        s3d s3dVar = (s3d) this.h.getValue();
        s3dVar.d.setText(mxl.a(j3));
        s3dVar.c.setText(mxl.a(j));
        g4d g4dVar = s3dVar.e;
        g4dVar.setMax((int) j3);
        g4dVar.setSecondaryProgress((int) j2);
        g4dVar.setProgress((int) j);
    }

    public final lzf getEvents() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int paddingTop = getPaddingTop();
        ny8 ny8Var = this.h;
        if (n7j.o(ny8Var) && ((s3d) ny8Var.getValue()).getParent() != null) {
            qyj.M((View) ny8Var.getValue(), 0, paddingTop, 0, 12);
            paddingTop += ((s3d) ny8Var.getValue()).getMeasuredHeight();
        }
        ny8 ny8Var2 = this.i;
        boolean zO = n7j.o(ny8Var2);
        int i5 = this.c;
        int measuredWidth2 = zO ? ((ImageView) ny8Var2.getValue()).getMeasuredWidth() + i5 + i5 : 0;
        ny8 ny8Var3 = this.j;
        if (n7j.o(ny8Var3)) {
            measuredWidth2 += ((cyb) ny8Var3.getValue()).getMeasuredWidth() + i5;
        }
        ImageView imageView = this.k;
        int iMax = Math.max(measuredWidth2, imageView.getVisibility() == 0 ? imageView.getMeasuredWidth() + i5 + i5 : 0);
        int measuredWidth3 = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - (iMax * 2);
        if (measuredWidth3 < 0) {
            measuredWidth3 = 0;
        }
        int paddingLeft = getPaddingLeft() + iMax;
        TextView textView = this.f;
        int measuredWidth4 = ((measuredWidth3 - textView.getMeasuredWidth()) / 2) + paddingLeft;
        int i6 = paddingTop + this.a;
        qyj.M(textView, measuredWidth4, i6, 0, 12);
        int paddingLeft2 = getPaddingLeft() + iMax;
        TextView textView2 = this.g;
        qyj.M(textView2, ((measuredWidth3 - textView2.getMeasuredWidth()) / 2) + paddingLeft2, textView.getMeasuredHeight() + this.b + i6, 0, 12);
        int bottom = ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2);
        if (n7j.o(ny8Var2)) {
            qyj.M((View) ny8Var2.getValue(), i5, bottom, 0, 12);
            measuredWidth = ((ImageView) ny8Var2.getValue()).getMeasuredWidth() + i5 + i5;
        } else {
            measuredWidth = i5;
        }
        if (n7j.o(ny8Var3)) {
            qyj.M((View) ny8Var3.getValue(), measuredWidth, bottom, 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            qyj.M(imageView, (getMeasuredWidth() - i5) - imageView.getMeasuredWidth(), bottom, 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int measuredWidth2;
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        ny8 ny8Var = this.h;
        if (!n7j.o(ny8Var) || ((s3d) ny8Var.getValue()).getParent() == null) {
            measuredHeight = 0;
        } else {
            ((s3d) ny8Var.getValue()).measure(i, i2);
            measuredHeight = ((s3d) ny8Var.getValue()).getMeasuredHeight();
        }
        ny8 ny8Var2 = this.i;
        boolean zO = n7j.o(ny8Var2);
        int i3 = this.c;
        if (zO) {
            ((ImageView) ny8Var2.getValue()).measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            measuredWidth = ((ImageView) ny8Var2.getValue()).getMeasuredWidth() + i3 + i3;
        } else {
            measuredWidth = 0;
        }
        ny8 ny8Var3 = this.j;
        if (n7j.o(ny8Var3)) {
            ((cyb) ny8Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            measuredWidth += ((cyb) ny8Var3.getValue()).getMeasuredWidth() + i3;
        }
        ImageView imageView = this.k;
        if (imageView.getVisibility() == 0) {
            imageView.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            measuredWidth2 = imageView.getMeasuredWidth() + i3 + i3;
        } else {
            measuredWidth2 = 0;
        }
        int iMax = size - (Math.max(measuredWidth, measuredWidth2) * 2);
        int i4 = iMax >= 0 ? iMax : 0;
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        TextView textView = this.f;
        textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec);
        int measuredHeight2 = textView.getMeasuredHeight() + this.a + measuredHeight;
        TextView textView2 = this.g;
        textView2.measure(i4, iMakeMeasureSpec);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + measuredHeight2);
    }
}
