package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class q8d extends ViewGroup implements khf, v35, b8e, mia, fhf, azf, hnh {
    public static final /* synthetic */ zv8[] w;
    public final cf7 a;
    public final p6e b;
    public final gia c;
    public final dhf d;
    public final vyf e;
    public final ny8 f;
    public final TextView g;
    public final TextView h;
    public final u5d i;
    public final o8d j;
    public final u35 k;
    public final lhf l;
    public final t5d m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    static {
        z8b z8bVar = new z8b(q8d.class, "model", "getModel()Lone/me/messages/list/loader/model/PollAttachModel;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public q8d(Context context, fz7 fz7Var) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        vyf vyfVar = new vyf();
        super(context);
        this.a = fz7Var;
        this.b = p6eVar;
        this.c = giaVar;
        this.d = dhfVar;
        this.e = vyfVar;
        this.f = rx8.P(3, new vx9(context, 27, this));
        TextView textView = new TextView(context);
        q9i.a(noh.f(q9i.z, 191), textView);
        this.g = textView;
        TextView textView2 = new TextView(context);
        q9i.a(q9i.t, textView2);
        this.h = textView2;
        u5d u5dVar = new u5d(context);
        this.i = u5dVar;
        o8d o8dVar = new o8d(context);
        this.j = o8dVar;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.k = u35Var;
        this.l = new lhf(this);
        this.m = new t5d(2, this);
        this.n = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.o = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.p = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.q = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        this.r = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.s = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.t = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        this.u = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.v = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(u5dVar, new ViewGroup.LayoutParams(-2, -2));
        addView(o8dVar, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
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

    @Override // defpackage.azf
    public final float b(int i) {
        return this.e.b(i);
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.k.d(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.d.Z();
    }

    public final e7d getModel() {
        zv8 zv8Var = w[0];
        return (e7d) this.m.b;
    }

    public final lhf getSenderNameViewStub$message_list() {
        return this.l;
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.b.m(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5 = (int) ((fea) getBackground()).s;
        lhf lhfVar = this.l;
        boolean zO = n7j.o(lhfVar.b);
        int i6 = this.n;
        if (zO) {
            lhfVar.c(i6, i6);
            measuredHeight = lhfVar.a() + this.o + i6;
        } else {
            measuredHeight = i6;
        }
        dhf dhfVar = this.d;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - i6) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i6);
        }
        gia giaVar = this.c;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(i6, measuredHeight);
            measuredHeight += giaVar.K() + this.p;
        }
        ny8 ny8Var = this.f;
        if (ny8Var.d() && ((View) ny8Var.getValue()).getVisibility() == 0 && ((dka) ny8Var.getValue()).getMeasuredHeight() > 0) {
            qyj.M((View) ny8Var.getValue(), i6, measuredHeight, 0, 12);
            measuredHeight += ((dka) ny8Var.getValue()).getMeasuredHeight() + this.q;
        }
        TextView textView = this.g;
        qyj.M(textView, i6, measuredHeight, 0, 12);
        int measuredHeight2 = textView.getMeasuredHeight() + this.r + measuredHeight;
        TextView textView2 = this.h;
        qyj.M(textView2, i6, measuredHeight2, 0, 12);
        int measuredHeight3 = textView2.getMeasuredHeight() + this.s + measuredHeight2;
        u5d u5dVar = this.i;
        qyj.M(u5dVar, 0, measuredHeight3, 0, 12);
        int measuredHeight4 = u5dVar.getMeasuredHeight() + this.t + measuredHeight3;
        o8d o8dVar = this.j;
        qyj.M(o8dVar, i6, measuredHeight4, 0, 12);
        int measuredHeight5 = o8dVar.getMeasuredHeight() + this.u + measuredHeight4;
        p6e p6eVar = this.b;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(i6, gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + measuredHeight5);
        }
        int measuredWidth = getMeasuredWidth();
        u35 u35Var = this.k;
        qyj.M(u35Var, ((measuredWidth - u35Var.getMeasuredWidth()) - i6) - i5, (getMeasuredHeight() - u35Var.getMeasuredHeight()) - this.v, 0, 12);
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iK = this.n;
        int i3 = size - (iK * 2);
        int size2 = View.MeasureSpec.getSize(i);
        dhf dhfVar = this.d;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.l;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            size2 = Math.max(size2, lhfVar.b() + dhfVar.Z());
            iK += lhfVar.a() + this.o;
        }
        gia giaVar = this.c;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            iK += giaVar.K() + this.p;
        }
        u35 u35Var = this.k;
        u35Var.measure(i, i2);
        int measuredHeight = u35Var.getMeasuredHeight() + this.v + iK;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        ny8 ny8Var = this.f;
        if (ny8Var.d() && ((View) ny8Var.getValue()).getVisibility() == 0) {
            ((dka) ny8Var.getValue()).j();
            if (((dka) ny8Var.getValue()).getMeasuredHeight() > 0) {
                measuredHeight += ((dka) ny8Var.getValue()).getMeasuredHeight() + this.q;
            }
        }
        TextView textView = this.g;
        textView.measure(iMakeMeasureSpec, i2);
        int measuredHeight2 = textView.getMeasuredHeight() + this.r + measuredHeight;
        TextView textView2 = this.h;
        textView2.measure(iMakeMeasureSpec, i2);
        int measuredHeight3 = textView2.getMeasuredHeight() + this.s + measuredHeight2;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm0.K(40.0f * yl5.d().getDisplayMetrics().density), 1073741824);
        o8d o8dVar = this.j;
        o8dVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight4 = o8dVar.getMeasuredHeight() + this.u + measuredHeight3;
        u5d u5dVar = this.i;
        u5dVar.measure(i, i2);
        int measuredHeight5 = u5dVar.getMeasuredHeight() + this.t + measuredHeight4;
        p6e p6eVar = this.b;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            measuredHeight5 = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), measuredHeight5);
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            int iL = vyfVar.L();
            size2 += iL;
            ((fea) getBackground()).s = iL;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(size2, measuredHeight5);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.c.p(xacVar);
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.d.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.d.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.b.setChipObserver(t5eVar);
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
        this.c.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.c.d = qf7Var;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.k.setChannelMode$message_list(z);
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

    public final void setModel(e7d e7dVar) {
        this.m.B(this, w[0], e7dVar);
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.b.d = cf7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.e.c = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.c.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.l.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.l.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.e.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.b.g = z;
    }

    @Override // defpackage.hnh
    public void setTextMessageColors(xac xacVar) {
        ny8 ny8Var = this.f;
        if (ny8Var.d()) {
            ((dka) ny8Var.getValue()).setTextColors(xacVar);
        }
    }

    @Override // defpackage.hnh
    public void setTextMessageLayout(aka akaVar) {
        dka dkaVar = (dka) this.f.getValue();
        dkaVar.setVisibility(0);
        dkaVar.setLayout(akaVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLinkClickListener(o59 o59Var) {
        ((dka) this.f.getValue()).setLinkListener(o59Var);
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
