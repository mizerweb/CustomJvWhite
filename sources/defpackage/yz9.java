package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yz9 extends ViewGroup implements v35, khf, b8e, mia, ekc, fhf, k24, azf, rz9 {
    public static final /* synthetic */ zv8[] m;
    public final p6e a;
    public final gia b;
    public final dhf c;
    public final fkc d;
    public final i24 e;
    public final vyf f;
    public final lhf g;
    public final u35 h;
    public final mjg i;
    public final mjg j;
    public final zb k;
    public boolean l;

    static {
        z8b z8bVar = new z8b(yz9.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public yz9(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        fkc fkcVar = new fkc();
        dhf dhfVar = new dhf();
        i24 i24Var = new i24(1);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = dhfVar;
        this.d = fkcVar;
        this.e = i24Var;
        this.f = vyfVar;
        this.g = new lhf(this);
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(true);
        this.h = u35Var;
        mjg mjgVarA = p90.a(null);
        this.i = mjgVarA;
        this.j = mjgVarA;
        this.k = new zb(this, 19);
        giaVar.a = this;
        p6eVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.f.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.f.b(i);
    }

    public final void d(kbc kbcVar) {
        u35 u35Var = this.h;
        u35Var.setTextColor$message_list(-1);
        u35Var.setDateViewStatusColor(-1);
        u35Var.setBackgroundColor(kbcVar.t().a);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.h.d(charSequence, z);
    }

    public void g(eag eagVar) {
        setModel(eagVar);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.Z();
    }

    public final u35 getDate() {
        return this.h;
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    public iq9 getModel() {
        zv8 zv8Var = m[0];
        return (iq9) this.k.b;
    }

    public final gjg getModelFlow() {
        return this.j;
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.e.h(i);
    }

    @Override // defpackage.rz9
    public final boolean i() {
        return this.l;
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.e.k();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    @Override // defpackage.k24
    public final void o() {
        this.e.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int iB;
        int iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        lhf lhfVar = this.g;
        if (n7j.o(lhfVar.b)) {
            int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            lhfVar.c(iK2, iK3);
            iK = lhfVar.a() + iK3;
        } else {
            iK = 0;
        }
        dhf dhfVar = this.c;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - iK2) - dhfVar.L()) - ((int) ((fea) getBackground()).s), zo5.b(8.0f, yl5.d().getDisplayMetrics().density, (lhfVar.a() / 2) - (dhfVar.K() / 2)));
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            int iK4 = iK + gm0.K(iK == 0 ? yl5.d().getDisplayMetrics().density * 8.0f : yl5.d().getDisplayMetrics().density * 4.0f);
            giaVar.T(iK2, iK4);
            iK = iK4 + giaVar.K();
        }
        int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 1.0f) + (iK == 0 ? 0 : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f)) + iK;
        int iT = t(gm0.K(yl5.d().getDisplayMetrics().density * 1.0f), iK5) + iK5;
        int measuredWidth = getMeasuredWidth() - ((int) ((fea) getBackground()).s);
        u35 u35Var = this.h;
        qyj.M(u35Var, zo5.D(1.0f, yl5.d().getDisplayMetrics().density, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, measuredWidth - u35Var.getMeasuredWidth())), zo5.D(4.0f, yl5.d().getDisplayMetrics().density, iT - u35Var.getMeasuredHeight()), 0, 12);
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, p6eVar.K() + gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        } else {
            iB = 0;
        }
        i24 i24Var = this.e;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, (getMeasuredHeight() - iB) - i24Var.K());
        }
        vyf vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - iB) - vyfVar.K());
        }
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(p6eVar.g ? (getMeasuredWidth() - ((int) ((fea) getBackground()).s)) - p6eVar.L() : 0, zo5.D(8.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - p6eVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int size = View.MeasureSpec.getSize(i) - (this.l ? 0 : c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2));
        int size2 = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : 0;
        dhf dhfVar = this.c;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.g;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, E(dhfVar.L(), size));
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, E((gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + lhfVar.b() + dhfVar.Z(), size));
            iK = lhfVar.a() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        } else {
            iK = 0;
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, E(bc1.g(10.0f, yl5.d().getDisplayMetrics().density, 2, giaVar.L()), size));
            iK += giaVar.K() + gm0.K(iK == 0 ? yl5.d().getDisplayMetrics().density * 8.0f : yl5.d().getDisplayMetrics().density * 4.0f);
        }
        int iK2 = iK + (iK != 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) : 0);
        this.h.measure(i, i2);
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, E(p6eVar.L(), size));
            int iB = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, p6eVar.K() + gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            iK2 += iB;
            ((fea) getBackground()).r = iB;
        } else {
            ((fea) getBackground()).r = 0.0f;
        }
        i24 i24Var = this.e;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, i24Var.L());
        }
        long jI = I(r5a.f(1.0f, yl5.d().getDisplayMetrics().density, 2, size2), r5a.f(1.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        int i3 = (int) (jI >> 32);
        int iMax = Math.max(size2, (gm0.K(yl5.d().getDisplayMetrics().density * 1.0f) * 2) + i3);
        int iK3 = (gm0.K(yl5.d().getDisplayMetrics().density * 1.0f) * 2) + ((int) (4294967295L & jI)) + iK2;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i2);
            iK3 += i24Var.K();
            iMax = Math.max(iMax, E(bc1.g(1.0f, yl5.d().getDisplayMetrics().density, 2, i3), size));
        }
        vyf vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            int iL = vyfVar.L();
            iMax += iL;
            ((fea) getBackground()).s = iL;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iMax, iK3);
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

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.e.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.h.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.h.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.d.a = z;
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
        this.h.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.rz9
    public void setLimitByContentWidthEnabled(boolean z) {
        this.l = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.b.setLink(fiaVar);
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.a.f = i;
    }

    public void setModel(iq9 iq9Var) {
        this.k.B(this, m[0], iq9Var);
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.a.d = cf7Var;
    }

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.e.d = af7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.f.c = af7Var;
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
        this.f.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.e.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.f.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }
}
