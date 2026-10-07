package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pzb extends wf4 implements eph {
    public static final int H = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
    public static final int I = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    public static final int J = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    public static final int K = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
    public static final int n1 = 52;
    public final ny8 A;
    public final View B;
    public final w38 C;
    public final GradientDrawable D;
    public final ny8 E;
    public final ny8 F;
    public ozb G;
    public final int s;
    public final int t;
    public final int u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final LayerDrawable z;

    public pzb(Context context) {
        super(context, null);
        this.s = getContext().getResources().getDimensionPixelSize(R.dimen.spacing_size_2xs);
        this.t = getContext().getResources().getDimensionPixelSize(R.dimen.spacing_size_m);
        this.u = getContext().getResources().getDimensionPixelSize(R.dimen.spacing_size_2xl);
        int i = 2;
        int i2 = 3;
        rx8.P(3, new bzb(context, i));
        this.v = rx8.P(3, new nzb(context, this, 0));
        int i3 = 1;
        this.w = rx8.P(3, new nzb(context, this, i3));
        this.x = rx8.P(3, new bzb(context, i2));
        this.y = rx8.P(3, new nzb(context, this, i));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        b0m.e(gradientDrawable, new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.z = new LayerDrawable(new Drawable[]{gradientDrawable, getContext().getDrawable(R.drawable.ellipse_7450).mutate()});
        this.A = rx8.P(3, new nzb(context, this, i2));
        View view = new View(context);
        view.setId(View.generateViewId());
        uf4 uf4Var = new uf4(1, 1);
        uf4Var.i = 0;
        uf4Var.v = 0;
        uf4Var.l = 0;
        uf4Var.t = 0;
        view.setLayoutParams(uf4Var);
        this.B = view;
        w38 w38Var = new w38(context, new pyb(i3));
        w38Var.setId(View.generateViewId());
        uf4 uf4Var2 = new uf4(0, gm0.K(100.0f * yl5.d().getDisplayMetrics().density));
        uf4Var2.i = 0;
        uf4Var2.l = 0;
        w38Var.setLayoutParams(uf4Var2);
        w38Var.setInitialRadius$common(yl5.d().getDisplayMetrics().density * 42.0f);
        this.C = w38Var;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.D = gradientDrawable2;
        this.E = rx8.P(3, new bzb(context, 4));
        this.F = rx8.P(3, new nzb(this, context));
        this.G = ozb.a;
        setClipToOutline(true);
        setOutlineProvider(new nt4(getContext().getResources().getDimensionPixelSize(R.dimen.size_border_radius_new_banner)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = gm0.K(yl5.d().getDisplayMetrics().density * 82.0f);
            setMaxHeight(gm0.K(82.0f * yl5.d().getDisplayMetrics().density));
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, gm0.K(yl5.d().getDisplayMetrics().density * 82.0f));
            setMaxHeight(gm0.K(82.0f * yl5.d().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        yab.e(this, view, null);
        yab.e(this, w38Var, null);
        onThemeChanged(pq3.j.e(context).m());
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.F.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.E.getValue();
    }

    public static ImageView u(pzb pzbVar, Context context) {
        ImageView imageViewD = qv1.d(context, R.id.oneme_compact_banner_close_button);
        imageViewD.setImageDrawable(pzbVar.getCloseBadgeDrawable());
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        uf4Var.i = 0;
        uf4Var.v = 0;
        int i = pzbVar.t;
        uf4Var.setMarginEnd(i);
        ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = i;
        imageViewD.setLayoutParams(uf4Var);
        return imageViewD;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable == null) {
            return;
        }
        int iOrdinal = this.G.ordinal();
        if (iOrdinal == 0) {
            ny8 ny8Var = this.v;
            Layout layout = ((TextView) ny8Var.getValue()).getLayout();
            if (layout != null) {
                int i = H;
                chevronDrawable.setBounds(0, 0, i, i);
                int lineCount = layout.getLineCount() - 1;
                float lineRight = layout.getLineRight(lineCount);
                int lineTop = layout.getLineTop(lineCount);
                int lineBottom = layout.getLineBottom(lineCount) - lineTop;
                float x = ((TextView) ny8Var.getValue()).getX();
                float y = ((TextView) ny8Var.getValue()).getY();
                int iSave = canvas.save();
                canvas.translate(Math.min(lineRight + x, x + ((TextView) ny8Var.getValue()).getWidth()), ((lineBottom - i) / 2.0f) + y + lineTop);
                try {
                    chevronDrawable.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
            ore.o();
            return;
        }
        ny8 ny8Var2 = this.w;
        Layout layout2 = ((TextView) ny8Var2.getValue()).getLayout();
        if (layout2 != null) {
            int i2 = I;
            chevronDrawable.setBounds(0, 0, i2, i2);
            int lineCount2 = layout2.getLineCount() - 1;
            float lineRight2 = layout2.getLineRight(lineCount2);
            int lineTop2 = layout2.getLineTop(lineCount2);
            int lineBottom2 = layout2.getLineBottom(lineCount2) - lineTop2;
            float x2 = ((TextView) ny8Var2.getValue()).getX();
            float y2 = ((TextView) ny8Var2.getValue()).getY();
            int iSave2 = canvas.save();
            canvas.translate(Math.min(lineRight2 + x2, x2 + ((TextView) ny8Var2.getValue()).getWidth()), ((lineBottom2 - i2) / 2.0f) + y2 + lineTop2);
            try {
                chevronDrawable.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ny8 ny8Var = this.v;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setTextColor(-1);
        }
        ny8 ny8Var2 = this.w;
        if (ny8Var2.d()) {
            ((TextView) ny8Var2.getValue()).setTextColor(tre.I0(-1, 0.7f));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        lvb.A0(closeBadgeDrawable, "cross", kbcVar.getIcon().c);
        lvb.A0(closeBadgeDrawable, "circle_background", kbcVar.h().a);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(kbcVar.getIcon().b);
        }
    }

    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setChevronAppearance(ozb ozbVar) {
        this.G = ozbVar;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.y.getValue()).setOnClickListener(onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        ny8 ny8Var = this.y;
        if (z || ny8Var.d()) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            imageView.setVisibility(z ? 0 : 8);
            yab.e(this, imageView, null);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        x();
    }

    public final void setSubtitle(String str) {
        ny8 ny8Var = this.w;
        if (str != null && !r5h.X0(str)) {
            TextView textView = (TextView) ny8Var.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            yab.e(this, textView, null);
            w();
            return;
        }
        if (ny8Var.d()) {
            TextView textView2 = (TextView) ny8Var.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            w();
        }
    }

    public final void setTitle(String str) {
        ny8 ny8Var = this.v;
        if (str != null && !r5h.X0(str)) {
            TextView textView = (TextView) ny8Var.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            yab.e(this, textView, null);
            w();
            return;
        }
        if (ny8Var.d()) {
            TextView textView2 = (TextView) ny8Var.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            w();
        }
    }

    public final void v(Drawable drawable, int i, int i2) {
        FrameLayout frameLayout = (FrameLayout) this.A.getValue();
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) this.x.getValue();
        int i3 = J;
        int i4 = K;
        if (i > i4) {
            i = i4;
        } else if (i < i3) {
            i = i3;
        }
        if (i2 > i4) {
            i2 = i4;
        } else if (i2 < i3) {
            i2 = i3;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        this.C.setIcon$common(drawable);
        yab.e(this, frameLayout, null);
        yab.e(this, imageView, null);
        w();
    }

    public final void w() {
        int id;
        int id2;
        int id3;
        ny8 ny8Var = this.v;
        boolean zD = ny8Var.d();
        int i = this.u;
        ny8 ny8Var2 = this.w;
        int id4 = -1;
        ny8 ny8Var3 = this.A;
        if (zD) {
            View view = (View) ny8Var.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            uf4 uf4Var = (uf4) layoutParams;
            if (n7j.o(ny8Var3)) {
                id2 = ((FrameLayout) ny8Var3.getValue()).getId();
            } else {
                uf4Var.v = 0;
                id2 = -1;
            }
            uf4Var.u = id2;
            if (n7j.o(ny8Var2)) {
                ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = i;
                id3 = ((TextView) ny8Var2.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = 0;
                uf4Var.l = 0;
                id3 = -1;
            }
            uf4Var.k = id3;
            view.setLayoutParams(uf4Var);
        }
        if (ny8Var2.d()) {
            View view2 = (View) ny8Var2.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            uf4 uf4Var2 = (uf4) layoutParams2;
            if (n7j.o(ny8Var)) {
                ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = this.s;
                ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = i;
                id = ((TextView) ny8Var.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = 0;
                uf4Var2.i = 0;
                id = -1;
            }
            uf4Var2.j = id;
            if (n7j.o(ny8Var3)) {
                id4 = ((FrameLayout) ny8Var3.getValue()).getId();
            } else {
                uf4Var2.v = 0;
            }
            uf4Var2.u = id4;
            view2.setLayoutParams(uf4Var2);
        }
        x();
    }

    public final void x() {
        w38 w38Var = this.C;
        ViewGroup.LayoutParams layoutParams = w38Var.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        uf4 uf4Var = (uf4) layoutParams;
        if (this.A.d()) {
            uf4Var.t = this.B.getId();
            uf4Var.setMarginStart(-gm0.K(((n1 / 2) + 24) * yl5.d().getDisplayMetrics().density));
        }
        w38Var.setLayoutParams(uf4Var);
    }
}
