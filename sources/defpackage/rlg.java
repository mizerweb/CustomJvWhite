package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class rlg extends ViewGroup implements v35, nlg, b8e, mia, k24, azf {
    public final nlg a;
    public final p6e b;
    public final gia c;
    public final i24 d;
    public final vyf e;
    public final FrameLayout f;
    public final int g;
    public final u35 h;
    public boolean i;

    public rlg(Context context, nlg nlgVar) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        i24 i24Var = new i24(2);
        vyf vyfVar = new vyf();
        super(context);
        this.a = nlgVar;
        this.b = p6eVar;
        this.c = giaVar;
        this.d = i24Var;
        this.e = vyfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        this.g = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(true);
        this.h = u35Var;
        this.i = true;
        p6eVar.a = this;
        giaVar.a = this;
        nlgVar.setParent(frameLayout);
        i24Var.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.mia
    public final void A() {
        this.c.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.e.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.b.G(xacVar, z);
    }

    @Override // defpackage.nlg
    public final void a(tlg tlgVar) {
        this.a.a(tlgVar);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.e.b(i);
    }

    @Override // defpackage.nlg
    public final void c(dj9 dj9Var) {
        this.a.c(dj9Var);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.h.d(charSequence, false);
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.d.h(i);
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.d.k();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.b.m(z);
    }

    @Override // defpackage.k24
    public final void o() {
        this.d.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer numValueOf;
        int iMax;
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = this.g;
        int i5 = measuredWidth - (measuredWidth2 * 2);
        gia giaVar = this.c;
        ny8 ny8Var = (ny8) giaVar.b;
        ny8 ny8Var2 = (ny8) giaVar.b;
        int iK = n7j.o(ny8Var) ? gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) : measuredWidth2;
        if (n7j.o(ny8Var2)) {
            giaVar.T(this.i ? measuredWidth2 : (i5 + measuredWidth2) - giaVar.L(), iK);
            iK = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iK);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        hea heaVar = layoutParams instanceof hea ? (hea) layoutParams : null;
        FrameLayout frameLayout = this.f;
        if (heaVar != null && !heaVar.a && !n7j.o(ny8Var2)) {
            measuredWidth2 = (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - measuredWidth2;
        }
        qyj.M(frameLayout, measuredWidth2, iK, 0, 12);
        int iE = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), iK);
        int measuredWidth3 = frameLayout.getMeasuredWidth() + measuredWidth2;
        u35 u35Var = this.h;
        int measuredWidth4 = measuredWidth3 - u35Var.getMeasuredWidth();
        qyj.M(u35Var, measuredWidth4, iE, 0, 12);
        int iMax2 = Math.max(u35Var.getMeasuredWidth() + measuredWidth4, yab.J(frameLayout));
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(iMax2, ((u35Var.getMeasuredHeight() + iE) - vyfVar.K()) - gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
            iK2 = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, vyfVar.K(), iK2);
        }
        i24 i24Var = this.d;
        ny8 ny8Var3 = (ny8) i24Var.b;
        ny8 ny8Var4 = (ny8) i24Var.b;
        if (n7j.o(ny8Var3)) {
            i24Var.T(gm0.K(6.0f * yl5.d().getDisplayMetrics().density) + iMax2, ((u35Var.getMeasuredHeight() + iE) - i24Var.K()) - iK2);
        }
        if (getBackground() != null) {
            int measuredHeight = u35Var.getMeasuredHeight();
            numValueOf = n7j.o(ny8Var4) ? Integer.valueOf(i24Var.K()) : null;
            iMax = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, Math.max(measuredHeight, numValueOf != null ? numValueOf.intValue() : 0));
        } else {
            int measuredHeight2 = u35Var.getMeasuredHeight();
            numValueOf = n7j.o(ny8Var4) ? Integer.valueOf(i24Var.K()) : null;
            iMax = Math.max(measuredHeight2, numValueOf != null ? numValueOf.intValue() : 0);
        }
        int i6 = iE + iMax;
        p6e p6eVar = this.b;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(p6eVar.g ? getMeasuredWidth() - p6eVar.L() : 0, gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + i6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.g;
        int i4 = size - (i3 * 2);
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        FrameLayout frameLayout = this.f;
        frameLayout.measure(iMakeMeasureSpec, i2);
        int iMax = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + iK;
        i24 i24Var = this.d;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(i, i2);
        }
        gia giaVar = this.c;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + giaVar.L());
            measuredHeight += (gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) * 2) + giaVar.K();
        }
        u35 u35Var = this.h;
        u35Var.measure(i, i2);
        int iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, n7j.o((ny8) i24Var.b) ? Math.max(u35Var.getMeasuredHeight(), i24Var.K()) : u35Var.getMeasuredHeight()), measuredHeight);
        if (n7j.o((ny8) vyfVar.b)) {
            iMax = Math.max(iMax, Math.max(vyfVar.L() + u35Var.getMeasuredWidth(), vyfVar.L() + frameLayout.getMeasuredWidth()));
        }
        if (n7j.o((ny8) i24Var.b)) {
            iMax = Math.max(iMax, Math.max(i24Var.L() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredWidth()), i24Var.L() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, frameLayout.getMeasuredWidth())));
        }
        int iMax2 = (i3 * 2) + Math.max(iMax, u35Var.getMeasuredWidth());
        p6e p6eVar = this.b;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, p6eVar.L());
            iE = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iE);
        }
        setMeasuredDimension(iMax2, iE);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.c.p(xacVar);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.b.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.d.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.h.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.h.setStatus$message_list(f9jVar);
    }

    public void setForceIfFloating(boolean z) {
        this.c.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.c.d = qf7Var;
    }

    public final void setIncomingAlignment(boolean z) {
        this.i = z;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.h.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.b.c = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.c.setLink(fiaVar);
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.b.f = i;
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.b.d = cf7Var;
    }

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.d.d = af7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.e.c = af7Var;
    }

    @Override // defpackage.nlg
    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.c.c = qf7Var;
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.e.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.b.g = z;
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.d.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.e.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.b.x(kjaVar, z);
    }
}
