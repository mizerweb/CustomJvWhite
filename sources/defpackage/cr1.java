package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class cr1 extends ViewGroup implements v35, khf, b8e, fhf, azf {
    public final p6e a;
    public final dhf b;
    public final vyf c;
    public final ifh d;
    public final lhf e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final cs i;
    public final u35 j;
    public final int k;
    public final int l;
    public boolean m;
    public boolean n;

    public cr1(Context context) {
        p6e p6eVar = new p6e();
        dhf dhfVar = new dhf();
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = dhfVar;
        this.c = vyfVar;
        this.d = new ifh(new br1(0));
        this.e = new lhf(this);
        TextView textView = new TextView(context);
        q9i.a(q9i.j.h(), textView);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f = textView;
        TextView textView2 = new TextView(context);
        noh nohVar = q9i.t;
        q9i.a(nohVar.h(), textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.g = textView2;
        TextView textView3 = new TextView(context);
        q9i.a(nohVar.h(), textView3);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        this.h = textView3;
        cs csVar = new cs(context);
        csVar.setBackground(getIconBackground());
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        csVar.setPadding(iK, iK, iK, iK);
        this.i = csVar;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.j = u35Var;
        this.k = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.l = iK2;
        p6eVar.a = this;
        dhfVar.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(csVar, new ViewGroup.LayoutParams(iK2, iK2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(textView3, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final int getBackgroundColor() {
        return (this.n && this.m) ? getColors().a.g : getColors().a.f;
    }

    private final xac getColors() {
        return f55.g(pq3.j.h(this).f(), this.n);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.d.getValue();
    }

    private final int getIconColor() {
        return (this.n && this.m) ? getColors().c.f : getColors().c.e;
    }

    private final void setDuration(CharSequence charSequence) {
        this.h.setText(charSequence);
    }

    private final void setIcon(Drawable drawable) {
        cs csVar = this.i;
        csVar.setImageDrawable(drawable);
        csVar.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    @Override // defpackage.azf
    public final void C() {
        this.c.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    public final void a(xac xacVar) {
        wac wacVar = xacVar.b;
        this.f.setTextColor(wacVar.d);
        int i = wacVar.e;
        this.g.setTextColor(i);
        this.h.setTextColor(i);
        this.i.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getBackgroundColor());
        int i2 = wacVar.g;
        u35 u35Var = this.j;
        u35Var.setTextColor$message_list(i2);
        u35Var.setDateViewStatusColor(i2);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.c.b(i);
    }

    public final void c(yb1 yb1Var) {
        this.n = yb1Var.g;
        this.m = yb1Var.d;
        setTitle(yb1Var.a);
        setSubtitle(yb1Var.b);
        setDuration(yb1Var.c);
        setIcon(yb1Var.e);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.j.d(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.Z();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = (int) ((fea) getBackground()).s;
        lhf lhfVar = this.e;
        ny8 ny8Var = lhfVar.b;
        ny8 ny8Var2 = lhfVar.b;
        boolean zO = n7j.o(ny8Var);
        int i6 = this.k;
        if (zO) {
            lhfVar.c(i6, i6);
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), i6);
        } else {
            measuredHeight = i6;
        }
        dhf dhfVar = this.b;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(ny8Var2)) {
            dhfVar.T(((getMeasuredWidth() - i6) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i6);
        }
        TextView textView = this.g;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.h;
        int iMax = Math.max(measuredHeight2, textView2.getMeasuredHeight());
        TextView textView3 = this.f;
        int measuredHeight3 = textView3.getMeasuredHeight() + iMax;
        cs csVar = this.i;
        int measuredHeight4 = csVar.getMeasuredHeight() > measuredHeight3 ? measuredHeight : ((measuredHeight3 - csVar.getMeasuredHeight()) / 2) + measuredHeight;
        int i7 = this.l;
        qyj.L(csVar, i6, measuredHeight4, i6 + i7, measuredHeight4 + i7);
        int iE = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, i7, i6);
        if (measuredHeight3 <= csVar.getMeasuredHeight()) {
            measuredHeight += (csVar.getMeasuredHeight() - measuredHeight3) / 2;
        }
        qyj.M(textView3, iE, measuredHeight, 0, 12);
        int measuredHeight5 = textView3.getMeasuredHeight() + measuredHeight;
        if (textView2.getText().length() > 0) {
            qyj.M(textView2, iE, measuredHeight5, 0, 12);
        }
        if (textView2.getText().length() != 0) {
            iE = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, textView2.getMeasuredWidth() + iE);
        }
        qyj.M(textView, iE, measuredHeight5, 0, 12);
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            int iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, Math.max(csVar.getMeasuredHeight(), measuredHeight3) + i6);
            if (n7j.o(ny8Var2)) {
                iB = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), iB);
            }
            p6eVar.T(i6, iB);
        }
        int measuredWidth = getMeasuredWidth();
        u35 u35Var = this.j;
        qyj.M(u35Var, ((measuredWidth - u35Var.getMeasuredWidth()) - i6) - i5, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - u35Var.getMeasuredHeight()), 0, 12);
        vyf vyfVar = this.c;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iZ;
        int measuredWidth;
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int i3 = this.k;
        int iE = i3 * 2;
        dhf dhfVar = this.b;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.e;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iZ = dhfVar.Z() + lhfVar.b();
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), iE);
        } else {
            iZ = 0;
        }
        u35 u35Var = this.j;
        u35Var.measure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iF, 1073741824);
        cs csVar = this.i;
        csVar.measure(iMakeMeasureSpec, i2);
        int i4 = this.l;
        int i5 = iF - (i4 + i3);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        TextView textView = this.f;
        textView.measure(iMakeMeasureSpec2, i2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        TextView textView2 = this.g;
        textView2.measure(iMakeMeasureSpec3, i2);
        TextView textView3 = this.h;
        if (textView3.getText().length() > 0) {
            textView3.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i2);
            measuredWidth = textView2.getMeasuredWidth() + zo5.b(8.0f, yl5.d().getDisplayMetrics().density, textView3.getMeasuredWidth());
        } else {
            measuredWidth = textView2.getMeasuredWidth();
        }
        int measuredWidth2 = textView.getMeasuredWidth() - (measuredWidth < 0 ? 0 : measuredWidth);
        int iMin = (i3 * 2) + Math.min(iF, u35Var.getMeasuredWidth() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) + i4 + Math.max(textView.getMeasuredWidth(), Math.max(measuredWidth, iZ)) + (measuredWidth2 <= gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) - measuredWidth2 : 0));
        int iMax = Math.max(csVar.getMeasuredHeight(), textView.getMeasuredHeight() + Math.max(textView2.getMeasuredHeight(), textView3.getMeasuredHeight())) + iE;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMin = Math.max(iMin, p6eVar.L());
            int iE2 = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iMax);
            int iB = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight() - i3);
            iMax = iE2 + (iB < 0 ? 0 : iB);
        }
        vyf vyfVar = this.c;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            int iL = vyfVar.L();
            iMin += iL;
            ((fea) getBackground()).s = iL;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iMin, iMax);
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.j.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.j.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.j.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.a.f = i;
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.a.d = cf7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.c.c = af7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.e.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.e.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.c.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.azf
    public final void w() {
        this.c.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }
}
