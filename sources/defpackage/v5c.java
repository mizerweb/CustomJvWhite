package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import java.util.BitSet;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v5c extends ViewGroup implements eph, b77 {
    public final u5c a;
    public final noh b;
    public final noh c;
    public final BitSet d;
    public final BitSet e;
    public final int f;
    public final int g;
    public final int h;
    public final gn i;
    public final xme j;
    public final xme k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final v0g p;
    public final rfb q;
    public final ImageView r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    public v5c(final Context context, u5c u5cVar) {
        float f;
        int i;
        int iG;
        ?? r7;
        super(context, null);
        this.a = u5cVar;
        BitSet bitSet = new BitSet(5);
        this.d = bitSet;
        BitSet bitSet2 = new BitSet(5);
        this.e = bitSet2;
        final int i2 = 1;
        this.f = 1;
        final int i3 = 2;
        this.g = 2;
        final int i4 = 3;
        this.h = 3;
        this.i = new gn(4, this);
        final int i5 = 0;
        this.j = p90.M(new af7(this) { // from class: s5c
            public final /* synthetic */ v5c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar = pq3.j;
                v5c v5cVar = this.b;
                switch (i6) {
                    case 0:
                        Paint paint = new Paint(1);
                        paint.setShader((Shader) v5cVar.k.getValue());
                        return paint;
                    case 1:
                        Drawable drawableMutate = v5cVar.getContext().getDrawable(R.drawable.icon_users_fill).mutate();
                        sb8.m0(a8gVar.h(v5cVar).getIcon().d, drawableMutate);
                        return drawableMutate;
                    case 2:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(v5cVar).h().c);
                        return shapeDrawable;
                    default:
                        return v5c.c(v5cVar);
                }
            }
        });
        this.k = p90.M(new af7() { // from class: t5c
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                v5c v5cVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return v5c.d(context2, v5cVar);
                    default:
                        return v5c.b(context2, v5cVar);
                }
            }
        });
        this.l = rx8.P(3, new af7(this) { // from class: s5c
            public final /* synthetic */ v5c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i2;
                a8g a8gVar = pq3.j;
                v5c v5cVar = this.b;
                switch (i6) {
                    case 0:
                        Paint paint = new Paint(1);
                        paint.setShader((Shader) v5cVar.k.getValue());
                        return paint;
                    case 1:
                        Drawable drawableMutate = v5cVar.getContext().getDrawable(R.drawable.icon_users_fill).mutate();
                        sb8.m0(a8gVar.h(v5cVar).getIcon().d, drawableMutate);
                        return drawableMutate;
                    case 2:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(v5cVar).h().c);
                        return shapeDrawable;
                    default:
                        return v5c.c(v5cVar);
                }
            }
        });
        this.m = rx8.P(3, new af7(this) { // from class: s5c
            public final /* synthetic */ v5c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i3;
                a8g a8gVar = pq3.j;
                v5c v5cVar = this.b;
                switch (i6) {
                    case 0:
                        Paint paint = new Paint(1);
                        paint.setShader((Shader) v5cVar.k.getValue());
                        return paint;
                    case 1:
                        Drawable drawableMutate = v5cVar.getContext().getDrawable(R.drawable.icon_users_fill).mutate();
                        sb8.m0(a8gVar.h(v5cVar).getIcon().d, drawableMutate);
                        return drawableMutate;
                    case 2:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(v5cVar).h().c);
                        return shapeDrawable;
                    default:
                        return v5c.c(v5cVar);
                }
            }
        });
        this.n = rx8.P(3, new af7(this) { // from class: s5c
            public final /* synthetic */ v5c b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i4;
                a8g a8gVar = pq3.j;
                v5c v5cVar = this.b;
                switch (i6) {
                    case 0:
                        Paint paint = new Paint(1);
                        paint.setShader((Shader) v5cVar.k.getValue());
                        return paint;
                    case 1:
                        Drawable drawableMutate = v5cVar.getContext().getDrawable(R.drawable.icon_users_fill).mutate();
                        sb8.m0(a8gVar.h(v5cVar).getIcon().d, drawableMutate);
                        return drawableMutate;
                    case 2:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(v5cVar).h().c);
                        return shapeDrawable;
                    default:
                        return v5c.c(v5cVar);
                }
            }
        });
        this.o = rx8.P(3, new af7() { // from class: t5c
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i2;
                v5c v5cVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return v5c.d(context2, v5cVar);
                    default:
                        return v5c.b(context2, v5cVar);
                }
            }
        });
        v0g v0gVar = new v0g(context);
        int iOrdinal = u5cVar.ordinal();
        noh nohVarH = (iOrdinal == 2 || iOrdinal == 3) ? q9i.h.h() : iOrdinal != 4 ? q9i.j : q9i.j;
        this.b = nohVarH;
        q9i.a(nohVarH, v0gVar);
        a8g a8gVar = pq3.j;
        u5c u5cVar2 = u5c.e;
        v0gVar.setTextColor(u5cVar == u5cVar2 ? a8gVar.h(v0gVar).getText().b : a8gVar.h(v0gVar).getText().h);
        v0gVar.setSingleLine();
        v0gVar.b.d();
        v0gVar.c = false;
        v0gVar.invalidate();
        v0gVar.setEllipsize(TextUtils.TruncateAt.END);
        Rect rect = n7j.a;
        i7j.n(v0gVar, false);
        this.p = v0gVar;
        rfb rfbVar = new rfb(context);
        int iOrdinal2 = u5cVar.ordinal();
        noh nohVarH2 = (iOrdinal2 == 2 || iOrdinal2 == 3) ? q9i.g.h() : q9i.g;
        this.c = nohVarH2;
        rfbVar.g(nohVarH2, bx5.b);
        rfbVar.setTextColor(a8gVar.h(rfbVar).getText().b);
        rfbVar.setMaxLinesValue((u5cVar == u5c.a || u5cVar == u5c.b) ? 1 : 2);
        i7j.n(rfbVar, false);
        this.q = rfbVar;
        ImageView imageViewD = qv1.d(context, R.id.pinbars_close_button);
        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_cross_round).mutate());
        int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        u5c u5cVar3 = u5c.d;
        imageViewD.setPadding(gm0.K(u5cVar == u5cVar3 ? yl5.d().getDisplayMetrics().density * 2.0f : yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        if (u5cVar == u5cVar3) {
            f = 12.0f;
            iG = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iK));
            i = 2;
        } else {
            f = 12.0f;
            i = 2;
            iG = bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, iK);
        }
        imageViewD.setLayoutParams(new ViewGroup.MarginLayoutParams(iG, bc1.g(f, yl5.d().getDisplayMetrics().density, i, iK)));
        imageViewD.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageViewD).getIcon().d));
        imageViewD.setContentDescription(np4.q(imageViewD.getContext(), R.string.pinbars_accessibility_close_button));
        imageViewD.setClickable(true);
        this.r = imageViewD;
        u5c u5cVar4 = u5c.c;
        if (u5cVar == u5cVar4 || u5cVar == u5cVar3 || u5cVar == u5cVar2) {
            addView(getIconView());
        }
        addView(v0gVar);
        addView(rfbVar);
        addView(imageViewD);
        if (u5cVar == u5cVar4 || u5cVar == u5cVar3) {
            r7 = 0;
            setPaddingRelative(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 7.0f), 0, gm0.K(7.0f * yl5.d().getDisplayMetrics().density));
        } else {
            r7 = 0;
            setPaddingRelative(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 5.0f), 0, gm0.K(5.0f * yl5.d().getDisplayMetrics().density));
        }
        bitSet.set(r7, bitSet.size(), true);
        bitSet2.set((int) r7, u5cVar == u5cVar2 ? 1 : r7);
        bitSet2.set(1, (boolean) r7);
        bitSet2.set(3, (boolean) r7);
        bitSet2.set(2, (boolean) r7);
        i7j.n(this, true);
    }

    public static ImageView b(Context context, v5c v5cVar) {
        int iK;
        int iK2;
        ImageView imageView = new ImageView(context);
        u5c u5cVar = v5cVar.a;
        int iOrdinal = u5cVar.ordinal();
        if (iOrdinal != 3) {
            iK = iOrdinal != 4 ? gm0.K(24.0f * yl5.d().getDisplayMetrics().density) : gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        } else {
            iK = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
        }
        int iOrdinal2 = u5cVar.ordinal();
        if (iOrdinal2 != 3) {
            iK2 = iOrdinal2 != 4 ? gm0.K(15.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else {
            iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        }
        int iK3 = u5cVar == u5c.d ? gm0.K(3.0f * yl5.d().getDisplayMetrics().density) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        u5c u5cVar2 = u5c.e;
        imageView.setPadding(u5cVar == u5cVar2 ? 0 : iK2, iK3, iK2, iK3);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams((iK2 * 2) + iK, (iK3 * 2) + iK));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (u5cVar == u5cVar2) {
            imageView.setImageDrawable(v5cVar.getPendingRequestsIco());
        }
        return imageView;
    }

    public static LayerDrawable c(v5c v5cVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{v5cVar.getPendingRequestsOval(), v5cVar.getPendingRequestsInnerIco()});
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 28.0f);
        int iK2 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(28.0f * yl5.d().getDisplayMetrics().density) - (iK2 * 2);
        layerDrawable.setLayerSize(0, iK, iK);
        layerDrawable.setLayerSize(1, iK3, iK3);
        layerDrawable.setLayerInset(1, iK2, iK2, iK2, iK2);
        return layerDrawable;
    }

    public static RadialGradient d(Context context, v5c v5cVar) {
        oac oacVar = (oac) pq3.j.e(context).m().x().d;
        float width = (v5cVar.getIconView().getWidth() / 2.0f) + v5cVar.getIconView().getLeft();
        return new RadialGradient(width, (v5cVar.getIconView().getHeight() / 2.0f) + v5cVar.getIconView().getTop(), Math.max(v5cVar.getMeasuredWidth(), v5cVar.getMeasuredHeight()) - width, oacVar.a, new float[]{0.041f, 0.12f, 0.5364f}, Shader.TileMode.CLAMP);
    }

    public static m0g f(kbc kbcVar) {
        ex8 ex8Var = new ex8(28);
        m0g m0gVar = (m0g) ex8Var.b;
        m0gVar.j = false;
        ex8Var.M(kbcVar.getText().h);
        m0gVar.d = -1;
        ex8Var.L(1.0f);
        ex8Var.O(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        m0gVar.m = 1;
        m0gVar.l = 2;
        ex8Var.N(500L);
        m0gVar.p = new LinearInterpolator();
        m0gVar.o = 3500L;
        return ex8Var.s();
    }

    public final ImageView getIconView() {
        return (ImageView) this.o.getValue();
    }

    private final LayerDrawable getPendingRequestsIco() {
        return (LayerDrawable) this.n.getValue();
    }

    private final Drawable getPendingRequestsInnerIco() {
        return (Drawable) this.l.getValue();
    }

    private final ShapeDrawable getPendingRequestsOval() {
        return (ShapeDrawable) this.m.getValue();
    }

    @Override // defpackage.b77
    public final void a(bx5 bx5Var) {
        setDynamicFont(bx5Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final List<View> getContentViews$pinbars() {
        return xw3.P0(getIconView(), this.p, this.q, this.r);
    }

    public final u5c getPinnedViewType() {
        return this.a;
    }

    public final CharSequence getSubtitle() {
        CharSequence textValue = this.q.getTextValue();
        return textValue == null ? "" : textValue;
    }

    public final CharSequence getTitle() {
        return this.p.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e.get(0)) {
            osk.c(getIconView(), this.i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.e.get(0)) {
            osk.e(getIconView(), this.i);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a != u5c.d || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.j.getValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        BitSet bitSet = this.e;
        if (bitSet.get(0)) {
            qyj.L(getIconView(), getPaddingStart(), (getMeasuredHeight() / 2) - (getIconView().getMeasuredHeight() / 2), getIconView().getMeasuredWidth() + getPaddingStart(), (getIconView().getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        int right = getIconView().getVisibility() == 0 ? getIconView().getRight() : 0;
        u5c u5cVar = u5c.e;
        u5c u5cVar2 = this.a;
        int paddingStart = right + (u5cVar2 != u5cVar ? getPaddingStart() : 0);
        boolean z2 = bitSet.get(this.f);
        int i5 = this.g;
        v0g v0gVar = this.p;
        if (z2) {
            int paddingTop = bitSet.get(i5) ? getPaddingTop() : (getMeasuredHeight() - v0gVar.getMeasuredHeight()) / 2;
            qyj.L(v0gVar, paddingStart, paddingTop, v0gVar.getMeasuredWidth() + paddingStart, v0gVar.getMeasuredHeight() + paddingTop);
        }
        boolean z3 = bitSet.get(i5);
        u5c u5cVar3 = u5c.d;
        rfb rfbVar = this.q;
        if (z3) {
            int iB = ((u5cVar2 == u5c.c || u5cVar2 == u5cVar3) && (measuredHeight = getMeasuredHeight() - (rfbVar.getMeasuredHeight() + zo5.b(7.0f, yl5.d().getDisplayMetrics().density, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, v0gVar.getBottom())))) > 0) ? (measuredHeight / 2) + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, v0gVar.getBottom()) : zo5.b(2.0f, yl5.d().getDisplayMetrics().density, v0gVar.getBottom());
            qyj.L(rfbVar, paddingStart, iB, rfbVar.getMeasuredWidth() + paddingStart, rfbVar.getMeasuredHeight() + iB);
        }
        boolean z4 = bitSet.get(this.h);
        ImageView imageView = this.r;
        if (z4) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = measuredWidth - imageView.getMeasuredWidth();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2);
            qyj.L(imageView, measuredWidth2, measuredHeight2, measuredWidth, imageView.getMeasuredHeight() + measuredHeight2);
        }
        if (u5cVar2 == u5cVar3) {
            float measuredWidth3 = getMeasuredWidth() / 2.0f;
            float measuredHeight3 = getMeasuredHeight() / 2.0f;
            for (View view : xw3.P0(getIconView(), v0gVar, rfbVar, imageView)) {
                view.setPivotX(measuredWidth3 - view.getLeft());
                view.setPivotY(measuredHeight3 - view.getTop());
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        ImageView iconView = getIconView();
        BitSet bitSet = this.e;
        iconView.setVisibility(bitSet.get(0) ? 0 : 8);
        int i3 = this.f;
        int i4 = bitSet.get(i3) ? 0 : 8;
        v0g v0gVar = this.p;
        v0gVar.setVisibility(i4);
        int i5 = this.g;
        int i6 = bitSet.get(i5) ? 0 : 8;
        rfb rfbVar = this.q;
        rfbVar.setVisibility(i6);
        int i7 = this.h;
        int i8 = bitSet.get(i7) ? 0 : 8;
        ImageView imageView = this.r;
        imageView.setVisibility(i8);
        if (bitSet.get(i7)) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(imageView.getLayoutParams().height, 1073741824));
        }
        if (bitSet.get(0)) {
            getIconView().measure(View.MeasureSpec.makeMeasureSpec(getIconView().getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getIconView().getLayoutParams().height, 1073741824));
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingStart = ((size - (getIconView().getVisibility() == 0 ? getPaddingStart() + getIconView().getMeasuredWidth() : 0)) - (imageView.getVisibility() == 0 ? imageView.getMeasuredWidth() : gm0.K(12.0f * yl5.d().getDisplayMetrics().density))) - getPaddingStart();
        if (bitSet.get(i3)) {
            v0gVar.measure(View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE), 0);
        }
        if (bitSet.get(i5)) {
            rfbVar.measure(View.MeasureSpec.makeMeasureSpec(paddingStart, Integer.MIN_VALUE), 0);
        }
        BitSet bitSet2 = this.d;
        bitSet2.set(0, bitSet2.size(), false);
        u5c u5cVar = u5c.a;
        u5c u5cVar2 = this.a;
        if (u5cVar2 == u5cVar || u5cVar2 == u5c.b || u5cVar2 == u5c.e) {
            iK = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
        } else {
            iK = Math.max(getPaddingBottom() + getPaddingTop() + (v0gVar.getVisibility() == 0 ? v0gVar.getMeasuredHeight() : 0) + ((v0gVar.getVisibility() == 0 && rfbVar.getVisibility() == 0) ? gm0.K(2.0f * yl5.d().getDisplayMetrics().density) : 0) + (rfbVar.getVisibility() == 0 ? rfbVar.getMeasuredHeight() : 0), Math.max(getIconView().getVisibility() == 0 ? getIconView().getMeasuredHeight() : 0, Math.max(imageView.getMeasuredHeight(), u5cVar2 == u5c.d ? gm0.K(56.0f * yl5.d().getDisplayMetrics().density) : 0)));
        }
        setMeasuredDimension(size, iK);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int iOrdinal = this.a.ordinal();
        rfb rfbVar = this.q;
        v0g v0gVar = this.p;
        if (iOrdinal == 0 || iOrdinal == 1) {
            v0gVar.setTextColor(kbcVar.getText().h);
            rfbVar.setTextColor(kbcVar.getText().b);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            v0gVar.setTextColor(kbcVar.getText().h);
            rfbVar.setTextColor(kbcVar.getText().b);
            Object drawable = getIconView().getDrawable();
            eph ephVar = drawable instanceof eph ? (eph) drawable : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(kbcVar);
            }
            khb khbVar = khb.k;
            this.j.b = khbVar;
            this.k.b = khbVar;
        } else if (iOrdinal != 4) {
            ore.o();
            return;
        } else {
            v0gVar.setTextColor(kbcVar.getText().b);
            sb8.m0(kbcVar.getIcon().d, getPendingRequestsInnerIco());
        }
        if (v0gVar.c) {
            v0gVar.b(f(kbcVar));
        }
        this.r.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        BitSet bitSet = this.d;
        bitSet.set(0, bitSet.size(), true);
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.r;
        qe7.H(imageView, 300L, onClickListener);
        if (this.a == u5c.d) {
            imageView.setOnTouchListener(new ie8(imageView, a4m.a(1.0f, imageView), a4m.a(0.9f, imageView), 0));
        }
    }

    public final void setCloseButtonVisibility(boolean z) {
        BitSet bitSet = this.d;
        int i = this.h;
        bitSet.set(i, true);
        this.e.set(i, z);
        requestLayout();
    }

    public final void setDynamicFont(bx5 bx5Var) {
        u5c u5cVar = u5c.c;
        u5c u5cVar2 = this.a;
        if (u5cVar2 == u5cVar || u5cVar2 == u5c.d) {
            this.b.b(this.p, bx5Var);
            this.q.g(this.c, bx5Var);
        }
    }

    public final void setIcon(Drawable drawable) {
        ImageView iconView = getIconView();
        gn gnVar = this.i;
        osk.e(iconView, gnVar);
        getIconView().setImageDrawable(drawable);
        this.d.set(0, true);
        boolean z = drawable != null;
        BitSet bitSet = this.e;
        bitSet.set(0, z);
        if (bitSet.get(0) && isAttachedToWindow()) {
            osk.c(getIconView(), gnVar);
        }
        requestLayout();
        invalidate();
    }

    public final void setOnPinnedMsgClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setShimmerEnabled(boolean z) {
        v0g v0gVar = this.p;
        if (!z) {
            v0gVar.b.d();
            v0gVar.b.d();
            v0gVar.c = false;
            v0gVar.invalidate();
            return;
        }
        v0gVar.b(f(pq3.j.h(this)));
        p0g p0gVar = v0gVar.b;
        p0gVar.c();
        v0gVar.c = true;
        p0gVar.c();
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.q.setTextValue(charSequence);
        BitSet bitSet = this.d;
        int i = this.g;
        bitSet.set(i, true);
        this.e.set(i, charSequence.length() > 0);
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        this.p.setText(charSequence);
        BitSet bitSet = this.d;
        int i = this.f;
        bitSet.set(i, true);
        this.e.set(i, charSequence.length() > 0);
        requestLayout();
    }
}
