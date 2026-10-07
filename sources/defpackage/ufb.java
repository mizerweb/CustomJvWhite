package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ufb extends ViewGroup implements v35, khf, b8e, mia, fhf, k24, azf {
    public static final String v = tfb.class.getName();
    public static final sfb w = new sfb();
    public final p6e a;
    public final gia b;
    public final dhf c;
    public final i24 d;
    public final vyf e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public double m;
    public final int n;
    public final int o;
    public final lhf p;
    public final hq9 q;
    public final uxb r;
    public final ImageView s;
    public final u35 t;
    public final fea u;

    public ufb(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        i24 i24Var = new i24(1);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = dhfVar;
        this.d = i24Var;
        this.e = vyfVar;
        this.f = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        this.g = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        this.h = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        this.i = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.j = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        this.k = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.l = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.m = 1.7d;
        this.n = gm0.K(yl5.d().getDisplayMetrics().density * 40.0f);
        this.o = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.p = new lhf(this);
        hq9 hq9Var = new hq9(context);
        ((wj7) hq9Var.getHierarchy()).h(i1f.n);
        this.q = hq9Var;
        uxb uxbVar = new uxb(context);
        uxbVar.setText(np4.q(uxbVar.getContext(), R.string.chat_screen_new_messages_decor_title));
        this.r = uxbVar;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_geolocation_fill);
        a8g a8gVar = pq3.j;
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().h));
        this.s = imageView;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.t = u35Var;
        xr8 xr8Var = fea.u;
        kbc kbcVarH = a8gVar.h(this);
        xr8Var.getClass();
        fea feaVarJ = xr8.j(kbcVarH);
        this.u = feaVarJ;
        giaVar.a = this;
        p6eVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        addView(hq9Var, new ViewGroup.LayoutParams(-1, -2));
        addView(uxbVar, new ViewGroup.LayoutParams(-1, -2));
        addView(imageView, new ViewGroup.LayoutParams(-2, -2));
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setBackground(feaVarJ);
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

    public final void a(zj7 zj7Var) {
        String str;
        this.m = zj7Var.i;
        int iOrdinal = pq3.j.h(this).A().ordinal();
        if (iOrdinal == 0) {
            str = zj7Var.g;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            str = zj7Var.g;
        } else {
            str = zj7Var.h;
        }
        if (!r5h.X0(str)) {
            w78 w78VarD = w78.d(Uri.parse(str));
            w78VarD.l = w;
            l1c.j(this.q, w78VarD.a(), null, 6);
        }
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.e.b(i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!cqk.d(view, this.q)) {
            return super.drawChild(canvas, view, j);
        }
        fea feaVar = this.u;
        Path path = feaVar.h;
        if (path == null) {
            path = feaVar.g;
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.drawChild(canvas, view, j);
            return true;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.t.d(charSequence, false);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.Z();
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
        int iK;
        int i5 = (int) this.u.s;
        lhf lhfVar = this.p;
        boolean zO = n7j.o(lhfVar.b);
        int i6 = this.f;
        if (zO) {
            int iA = lhfVar.a() + i6;
            lhfVar.c(i6, i6);
            iE = iA + this.k;
        } else {
            iE = 0;
        }
        dhf dhfVar = this.c;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - i6) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + i6);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            if (iE == 0) {
                iE += i6;
            }
            giaVar.T(i6, iE);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iE);
        }
        hq9 hq9Var = this.q;
        qyj.M(hq9Var, 0, iE, 0, 12);
        qyj.M(this.s, (hq9Var.getMeasuredWidth() / 2) - (this.o / 2), zo5.D(37.0f, yl5.d().getDisplayMetrics().density, (hq9Var.getMeasuredHeight() / 2) + iE), 0, 12);
        int measuredHeight = hq9Var.getMeasuredHeight();
        int i7 = this.h;
        int i8 = measuredHeight + i7 + iE;
        uxb uxbVar = this.r;
        qyj.M(uxbVar, i7, i8, 0, 12);
        int measuredHeight2 = uxbVar.getMeasuredHeight() + this.i + i8;
        int measuredWidth = getMeasuredWidth();
        u35 u35Var = this.t;
        qyj.M(u35Var, ((measuredWidth - u35Var.getMeasuredWidth()) - this.l) - i5, measuredHeight2, 0, 12);
        p6e p6eVar = this.a;
        boolean zO2 = n7j.o((ny8) p6eVar.b);
        int i9 = this.g;
        if (zO2) {
            iK = p6eVar.K() + gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + i9;
        } else {
            iK = 0;
        }
        i24 i24Var = this.d;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, (getMeasuredHeight() - iK) - i24Var.K());
        }
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(p6eVar.g ? (getMeasuredWidth() - i5) - p6eVar.L() : 0, (getMeasuredHeight() - i9) - p6eVar.K());
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iE;
        int size = View.MeasureSpec.getSize(i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        dhf dhfVar = this.c;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.p;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(iMakeMeasureSpec, i2);
        }
        boolean zO2 = n7j.o(lhfVar.b);
        int i3 = this.f;
        if (zO2) {
            lhfVar.d(iMakeMeasureSpec, i2);
            iE = lhfVar.a() + this.k + i3;
        } else {
            iE = 0;
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            if (iE == 0) {
                iE += i3;
            }
            giaVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iE);
        }
        u35 u35Var = this.t;
        u35Var.measure(i, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((int) (((double) size) / this.m), 1073741824);
        hq9 hq9Var = this.q;
        hq9Var.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        int measuredHeight = hq9Var.getMeasuredHeight() + iE;
        vyf vyfVar = this.e;
        boolean zO3 = n7j.o((ny8) vyfVar.b);
        fea feaVar = this.u;
        if (zO3) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            feaVar.s = vyfVar.L();
        } else {
            feaVar.s = 0.0f;
        }
        int i4 = (int) feaVar.s;
        int i5 = this.h;
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec((size - (i5 * 2)) - i4, 1073741824);
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(this.n, 1073741824);
        uxb uxbVar = this.r;
        uxbVar.measure(iMakeMeasureSpec4, iMakeMeasureSpec5);
        int measuredHeight2 = u35Var.getMeasuredHeight() + uxbVar.getMeasuredHeight() + i5 + this.i + this.j + measuredHeight;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            int iK = p6eVar.K() + gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + this.g;
            measuredHeight2 += iK;
            feaVar.r = iK;
        } else {
            feaVar.r = 0.0f;
        }
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        this.s.measure(iMakeMeasureSpec6, iMakeMeasureSpec6);
        i24 i24Var = this.d;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            measuredHeight2 += i24Var.K();
        }
        setMeasuredDimension(size, measuredHeight2);
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
        this.d.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.t.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.t.setStatus$message_list(f9jVar);
    }

    public final void setExternalMapButtonClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.r, 300L, onClickListener);
    }

    public final void setExternalMapButtonText(CharSequence charSequence) {
        this.r.setText(charSequence);
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
        this.t.setChannelMode$message_list(z);
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

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.e.c = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.p.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.p.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.e.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
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
