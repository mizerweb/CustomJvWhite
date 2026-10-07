package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dw0 extends ViewGroup implements v35, hnh, z7g, jp5, b8e, mia, ekc, k24, azf {
    public final p6e a;
    public final gia b;
    public final fkc c;
    public final i24 d;
    public final vyf e;
    public final dka f;
    public final u35 g;
    public final int h;
    public af7 i;
    public af7 j;

    public dw0(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        fkc fkcVar = new fkc();
        i24 i24Var = new i24(2);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = fkcVar;
        this.d = i24Var;
        this.e = vyfVar;
        dka dkaVar = new dka(context);
        dkaVar.setId(R.id.messages_list_item_text);
        this.f = dkaVar;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(true);
        this.g = u35Var;
        this.h = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        p6eVar.a = this;
        giaVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        dkaVar.setSingleClickAction(new c3(16, this));
        dkaVar.setOnLongClickListener(new cw0(0, this));
        dkaVar.setOnDoubleClickListener(new m(18, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(dkaVar, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.e.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.e.b(i);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.g.d(charSequence, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public af7 getOnDoubleTap() {
        return this.j;
    }

    public af7 getOnSingleClick() {
        return this.i;
    }

    public final CharSequence getText() {
        return this.f.getText();
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
        this.a.m(z);
    }

    @Override // defpackage.k24
    public final void o() {
        this.d.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iE;
        int iL;
        gia giaVar = this.b;
        ny8 ny8Var = (ny8) giaVar.b;
        ny8 ny8Var2 = (ny8) giaVar.b;
        boolean zO = n7j.o(ny8Var);
        int measuredWidth = this.h;
        if (zO) {
            giaVar.T(measuredWidth, measuredWidth);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), measuredWidth);
        } else {
            iE = measuredWidth;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        hea heaVar = layoutParams instanceof hea ? (hea) layoutParams : null;
        boolean z2 = (heaVar == null || heaVar.a) ? false : true;
        dka dkaVar = this.f;
        int measuredWidth2 = (!z2 || n7j.o(ny8Var2)) ? measuredWidth : (getMeasuredWidth() - dkaVar.getMeasuredWidth()) - measuredWidth;
        qyj.M(dkaVar, measuredWidth2, iE, 0, 12);
        int measuredHeight = dkaVar.getMeasuredHeight() + (getBackground() == null ? gm0.K(2.0f * yl5.d().getDisplayMetrics().density) : 0) + iE;
        vyf vyfVar = this.e;
        int iL2 = n7j.o((ny8) vyfVar.b) ? vyfVar.L() : 0;
        i24 i24Var = this.d;
        ny8 ny8Var3 = (ny8) i24Var.b;
        ny8 ny8Var4 = (ny8) i24Var.b;
        if (n7j.o(ny8Var3)) {
            iL = i24Var.L() + gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        } else {
            iL = 0;
        }
        int iMax = Math.max(iL2, iL);
        boolean zO2 = n7j.o(ny8Var2);
        u35 u35Var = this.g;
        if (zO2 || z2) {
            measuredWidth = ((getMeasuredWidth() - u35Var.getMeasuredWidth()) - iMax) - measuredWidth;
        } else if (dkaVar.getMeasuredWidth() >= u35Var.getMeasuredWidth()) {
            measuredWidth = (dkaVar.getMeasuredWidth() + measuredWidth2) - u35Var.getMeasuredWidth();
        }
        qyj.M(u35Var, measuredWidth, measuredHeight, 0, 12);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(u35Var.getMeasuredWidth() + measuredWidth, ((u35Var.getMeasuredHeight() + measuredHeight) - vyfVar.K()) - gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
            iK = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, vyfVar.K(), iK);
        }
        if (n7j.o(ny8Var4)) {
            i24Var.T(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredWidth() + measuredWidth), ((u35Var.getMeasuredHeight() + measuredHeight) - i24Var.K()) - iK);
        }
        int iMax2 = n7j.o(ny8Var4) ? Math.max(u35Var.getMeasuredHeight(), i24Var.K()) : u35Var.getMeasuredHeight();
        if (getBackground() != null) {
            iMax2 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, iMax2);
        }
        int i5 = measuredHeight + iMax2;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(p6eVar.g ? getMeasuredWidth() - p6eVar.L() : 0, gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + i5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        dka dkaVar = this.f;
        dkaVar.j();
        int measuredWidth = getDependOnOutsideView() ? iF : dkaVar.getMeasuredWidth();
        int measuredHeight = dkaVar.getMeasuredHeight() + (getBackground() == null ? gm0.K(2.0f * yl5.d().getDisplayMetrics().density) : 0);
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, giaVar.L());
            measuredHeight = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), measuredHeight);
        }
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, p6eVar.L());
            measuredHeight = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), measuredHeight);
        }
        i24 i24Var = this.d;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
        }
        u35 u35Var = this.g;
        u35Var.measure(i, i2);
        int iMax = n7j.o((ny8) i24Var.b) ? Math.max(u35Var.getMeasuredHeight(), i24Var.K()) : u35Var.getMeasuredHeight();
        if (n7j.o((ny8) vyfVar.b)) {
            measuredWidth = Math.max(Math.max(measuredWidth, vyfVar.L() + u35Var.getMeasuredWidth()), vyfVar.L() + dkaVar.getMeasuredWidth());
        }
        if (n7j.o((ny8) i24Var.b)) {
            measuredWidth = Math.max(Math.max(measuredWidth, i24Var.L() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredWidth())), i24Var.L() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, dkaVar.getMeasuredWidth()));
        }
        setMeasuredDimension(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, Math.max(measuredWidth, u35Var.getMeasuredWidth())), bc1.g(8.0f, yl5.d().getDisplayMetrics().density, 2, measuredHeight + iMax));
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.b.p(xacVar);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.d.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.g.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.g.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
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
        this.g.setChannelMode$message_list(z);
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

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.d.d = af7Var;
    }

    @Override // defpackage.jp5
    public void setOnDoubleTap(af7 af7Var) {
        this.j = af7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.e.c = af7Var;
    }

    @Override // defpackage.z7g
    public void setOnSingleClick(af7 af7Var) {
        this.i = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.e.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.hnh
    public void setTextMessageColors(xac xacVar) {
        this.f.setTextColors(xacVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLayout(aka akaVar) {
        this.f.setLayout(akaVar);
    }

    @Override // defpackage.hnh
    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(o59 o59Var) {
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
        this.a.x(kjaVar, z);
    }
}
