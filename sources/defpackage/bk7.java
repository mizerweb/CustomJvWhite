package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class bk7 extends ViewGroup implements v35, khf, b8e, mia, fhf, azf {
    public final p6e a;
    public final gia b;
    public final dhf c;
    public final vyf d;
    public xac e;
    public final ifh f;
    public final lhf g;
    public final TextView h;
    public final TextView i;
    public final cs j;
    public final u35 k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    public bk7(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = dhfVar;
        this.d = vyfVar;
        a8g a8gVar = pq3.j;
        this.e = (xac) a8gVar.h(this).f().a;
        this.f = new ifh(new mp5(17, this));
        this.g = new lhf(this);
        TextView textView = new TextView(context);
        q9i.a(q9i.u.h(), textView);
        textView.setTextColor(getTitleColor());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.h = textView;
        TextView textView2 = new TextView(context);
        q9i.a(q9i.t.h(), textView2);
        textView2.setTextColor(getSubtitleColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.i = textView2;
        cs csVar = new cs(context);
        csVar.setBackground(getIconBackground());
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        csVar.setPadding(iK, iK, iK, iK);
        this.j = csVar;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.k = u35Var;
        this.l = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.m = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.n = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.o = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.p = iK2;
        giaVar.a = this;
        p6eVar.a = this;
        dhfVar.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(csVar, new ViewGroup.LayoutParams(iK2, iK2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = a8gVar.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
    }

    public static ShapeDrawable a(bk7 bk7Var) {
        float f = yl5.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(bk7Var.getIconBackgroundColor());
        return shapeDrawable;
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.f.getValue();
    }

    private final int getIconBackgroundColor() {
        return this.e.a.f;
    }

    private final int getIconColor() {
        return this.e.c.g;
    }

    private final int getSubtitleColor() {
        return this.e.b.e;
    }

    private final int getTitleColor() {
        return this.e.b.d;
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.d.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.d.b(i);
    }

    public final void c(zj7 zj7Var, boolean z) {
        vbf vbfVarF = pq3.j.h(this).f();
        this.e = z ? (xac) vbfVarF.a : (xac) vbfVarF.b;
        String str = zj7Var.b;
        TextView textView = this.h;
        textView.setText(str);
        textView.setTextColor(getTitleColor());
        String str2 = zj7Var.c;
        TextView textView2 = this.i;
        textView2.setText(str2);
        textView2.setTextColor(getSubtitleColor());
        cs csVar = this.j;
        csVar.setImageResource(R.drawable.icon_geolocation_fill_mini);
        csVar.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    public final void d(xac xacVar) {
        this.e = xacVar;
        this.h.setTextColor(getTitleColor());
        this.i.setTextColor(getSubtitleColor());
        this.j.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(getIconBackgroundColor());
        int i = this.e.b.g;
        u35 u35Var = this.k;
        u35Var.setTextColor$message_list(i);
        u35Var.setDateViewStatusColor(this.e.b.g);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.k.d(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.Z();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int i5 = (int) ((fea) getBackground()).s;
        lhf lhfVar = this.g;
        boolean zO = n7j.o(lhfVar.b);
        int i6 = this.l;
        if (zO) {
            lhfVar.c(i6, i6);
            iK = lhfVar.a() + this.m + i6;
        } else {
            iK = i6;
        }
        dhf dhfVar = this.c;
        boolean zO2 = n7j.o((ny8) dhfVar.b);
        int i7 = this.l;
        if (zO2 && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - i7) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i7);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(i6, iK);
            iK += giaVar.K() + this.o;
        }
        int i8 = this.p;
        cs csVar = this.j;
        yab.j0(i6, iK, i6 + i8, iK + i8, csVar, this);
        int i9 = i6 + i8 + i7;
        TextView textView = this.h;
        yab.j0(i9, iK, textView.getMeasuredWidth() + i9, textView.getMeasuredHeight() + iK, textView, this);
        int measuredHeight = iK + textView.getMeasuredHeight();
        TextView textView2 = this.i;
        yab.j0(i9, measuredHeight, textView2.getMeasuredWidth() + i9, textView2.getMeasuredHeight() + measuredHeight, textView2, this);
        int bottom = csVar.getBottom();
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(gm0.K(10.0f * yl5.d().getDisplayMetrics().density), zo5.b(10.0f, yl5.d().getDisplayMetrics().density, bottom));
            p6eVar.K();
        }
        int measuredWidth = getMeasuredWidth();
        u35 u35Var = this.k;
        int measuredWidth2 = ((measuredWidth - u35Var.getMeasuredWidth()) - i7) - i5;
        int measuredHeight2 = (getMeasuredHeight() - u35Var.getMeasuredHeight()) - this.n;
        u35 u35Var2 = this.k;
        yab.j0(measuredWidth2, measuredHeight2, u35Var2.getMeasuredWidth() + measuredWidth2, u35Var.getMeasuredHeight() + measuredHeight2, u35Var2, this);
        vyf vyfVar = this.d;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.l;
        int i4 = size - (i3 * 2);
        dhf dhfVar = this.c;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.g;
        int iMax = 0;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(0, dhfVar.L());
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (i3 * 2) + lhfVar.b() + dhfVar.Z());
            iK = lhfVar.a() + this.m + i3;
        } else {
            iK = i3;
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (i3 * 2) + giaVar.L());
            iK += giaVar.K() + this.o;
        }
        u35 u35Var = this.k;
        u35Var.measure(i, i2);
        this.j.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i2);
        int i5 = this.p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i4 - i5) - (i3 * 2), Integer.MIN_VALUE);
        TextView textView = this.h;
        textView.measure(iMakeMeasureSpec, i2);
        TextView textView2 = this.i;
        textView2.measure(iMakeMeasureSpec, i2);
        int iMax2 = Math.max(Math.min(i4, u35Var.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), textView2.getMeasuredWidth()) + i5) + i3, iMax);
        int measuredHeight = u35Var.getMeasuredHeight() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredHeight() + textView2.getMeasuredHeight()) + this.n + iK;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + p6eVar.L());
            measuredHeight = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), measuredHeight);
        }
        vyf vyfVar = this.d;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            int iL = vyfVar.L();
            iMax2 += iL;
            ((fea) getBackground()).s = iL;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iMax2, measuredHeight);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.b.p(xacVar);
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.k.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.k.setStatus$message_list(f9jVar);
    }

    public void setForceIfFloating(boolean z) {
        this.b.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.b.d = qf7Var;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.k.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.b.setLink(fiaVar);
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
        this.d.c = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.g.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.g.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.d.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.azf
    public final void w() {
        this.d.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }
}
