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
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jl4 extends ViewGroup implements v35, khf, b8e, mia, fhf, k24, azf {
    public final p6e a;
    public final gia b;
    public final dhf c;
    public final i24 d;
    public final vyf e;
    public final cf7 f;
    public final ifh g;
    public final lhf h;
    public final TextView i;
    public final TextView j;
    public final kwb k;
    public final ny8 l;
    public final ny8 m;
    public final u35 n;
    public final int o;

    public jl4(final Context context, fz7 fz7Var) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        final int i = 1;
        i24 i24Var = new i24(1);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = dhfVar;
        this.d = i24Var;
        this.e = vyfVar;
        this.f = fz7Var;
        this.g = new ifh(new zn3(23));
        this.h = new lhf(this);
        TextView textView = new TextView(context);
        q9i.a(q9i.j.h(), textView);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.i = textView;
        TextView textView2 = new TextView(context);
        q9i.a(q9i.t.h(), textView2);
        this.j = textView2;
        kwb kwbVar = new kwb(context);
        this.k = kwbVar;
        final int i2 = 0;
        this.l = rx8.P(3, new af7() { // from class: il4
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                jl4 jl4Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        return jl4.a(context2, jl4Var);
                    default:
                        return jl4.c(context2, jl4Var);
                }
            }
        });
        this.m = rx8.P(3, new af7() { // from class: il4
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                jl4 jl4Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        return jl4.a(context2, jl4Var);
                    default:
                        return jl4.c(context2, jl4Var);
                }
            }
        });
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.n = u35Var;
        this.o = 4;
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(kwbVar, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
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

    public static cs a(Context context, jl4 jl4Var) {
        cs csVar = new cs(context);
        csVar.setId(R.id.messages_list_profile_icon);
        csVar.setBackground(jl4Var.getIconBackground());
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        csVar.setPadding(iK, iK, iK, iK);
        jl4Var.addView(csVar, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
        csVar.requestLayout();
        return csVar;
    }

    public static cs c(Context context, jl4 jl4Var) {
        cs csVar = new cs(context);
        csVar.setId(R.id.messages_list_chat_icon);
        csVar.setBackground(jl4Var.getIconBackground());
        int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        csVar.setPadding(iK, iK, iK, iK);
        jl4Var.addView(csVar, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
        csVar.requestLayout();
        return csVar;
    }

    public static void f(ny8 ny8Var, Drawable drawable) {
        if (drawable != null) {
            cs csVar = (cs) ny8Var.getValue();
            int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            csVar.setPadding(iK, iK, iK, iK);
            csVar.setImageDrawable(drawable);
            csVar.setVisibility(0);
            return;
        }
        if (ny8Var.d()) {
            cs csVar2 = (cs) ny8Var.getValue();
            csVar2.setImageDrawable(null);
            csVar2.setVisibility(8);
        }
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.g.getValue();
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.i.setText(charSequence);
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

    public final void d(xac xacVar) {
        int i = xacVar.c.c;
        wac wacVar = xacVar.b;
        this.i.setTextColor(wacVar.d);
        this.j.setTextColor(wacVar.e);
        getIconBackground().getPaint().setColor(xacVar.a.d);
        int i2 = wacVar.g;
        u35 u35Var = this.n;
        u35Var.setTextColor$message_list(i2);
        u35Var.setDateViewStatusColor(i2);
        v(xacVar);
        ny8 ny8Var = this.m;
        if (ny8Var.d()) {
            ((cs) ny8Var.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            ((cs) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        zv8[] zv8VarArr = u35.x;
        this.n.d(charSequence, false);
    }

    public final void g(final jh4 jh4Var) {
        setTitle(jh4Var.b);
        setSubtitle(jh4Var.g);
        long j = jh4Var.a;
        String str = jh4Var.d;
        CharSequence charSequence = jh4Var.e;
        awb awbVar = awb.a;
        kwb kwbVar = this.k;
        kwbVar.setAvatarShape(awbVar);
        kwb.v(kwbVar, str, Long.valueOf(j), charSequence);
        Drawable drawable = jh4Var.i;
        ny8 ny8Var = this.m;
        f(ny8Var, drawable);
        Drawable drawable2 = jh4Var.h;
        ny8 ny8Var2 = this.l;
        f(ny8Var2, drawable2);
        if (ny8Var.d()) {
            final int i = 0;
            qe7.H((cs) ny8Var.getValue(), 300L, new View.OnClickListener(this) { // from class: hl4
                public final /* synthetic */ jl4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    jh4 jh4Var2 = jh4Var;
                    jl4 jl4Var = this.b;
                    switch (i2) {
                        case 0:
                            jl4Var.f.invoke(new bna(jh4Var2.j, jh4Var2));
                            break;
                        default:
                            jl4Var.f.invoke(new cna(jh4Var2.j, jh4Var2));
                            break;
                    }
                }
            });
        }
        if (ny8Var2.d()) {
            cs csVar = (cs) ny8Var2.getValue();
            final int i2 = 1;
            qe7.H(csVar, 300L, new View.OnClickListener(this) { // from class: hl4
                public final /* synthetic */ jl4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    jh4 jh4Var2 = jh4Var;
                    jl4 jl4Var = this.b;
                    switch (i3) {
                        case 0:
                            jl4Var.f.invoke(new bna(jh4Var2.j, jh4Var2));
                            break;
                        default:
                            jl4Var.f.invoke(new cna(jh4Var2.j, jh4Var2));
                            break;
                    }
                }
            });
        }
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
        int measuredHeight;
        int iK;
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int iK4 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        int i5 = (int) ((fea) getBackground()).s;
        int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        lhf lhfVar = this.h;
        if (n7j.o(lhfVar.b)) {
            lhfVar.c(iK5, iK3);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a(), iK3);
        } else {
            iE = iK3;
        }
        dhf dhfVar = this.c;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - iK5) - dhfVar.L()) - i5, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + iK3);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(iK5, iE);
            iE = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iE);
        }
        kwb kwbVar = this.k;
        int measuredWidth = kwbVar.getMeasuredWidth() + iK2 + iK5;
        TextView textView = this.i;
        int measuredHeight2 = textView.getMeasuredHeight();
        TextView textView2 = this.j;
        if (textView2.getMeasuredHeight() + measuredHeight2 > kwbVar.getMeasuredHeight()) {
            qyj.M(textView, measuredWidth, iE, 0, 12);
            qyj.M(textView2, measuredWidth, textView.getBottom(), 0, 12);
            iK = gm0.K(((textView2.getMeasuredHeight() + textView.getMeasuredHeight()) / 2.0f) + textView.getTop());
            qyj.M(kwbVar, iK5, iK - (kwbVar.getMeasuredHeight() / 2), 0, 12);
            measuredHeight = textView2.getMeasuredHeight() + textView.getMeasuredHeight() + iE;
        } else {
            qyj.M(kwbVar, iK5, iE, 0, 12);
            int measuredHeight3 = (kwbVar.getMeasuredHeight() / 2) + iE;
            qyj.L(textView, measuredWidth, measuredHeight3 - textView.getMeasuredHeight(), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + measuredHeight3);
            qyj.M(textView2, measuredWidth, measuredHeight3, 0, 12);
            measuredHeight = kwbVar.getMeasuredHeight() + iE;
            iK = measuredHeight3;
        }
        int i6 = iK - (iK4 / 2);
        int measuredWidth2 = (getMeasuredWidth() - iK3) - i5;
        ny8 ny8Var = this.m;
        if (n7j.o(ny8Var)) {
            int i7 = measuredWidth2 - iK4;
            qyj.L((cs) ny8Var.getValue(), i7, i6, measuredWidth2, i6 + iK4);
            measuredWidth2 = i7 - iK2;
        }
        ny8 ny8Var2 = this.l;
        if (n7j.o(ny8Var2)) {
            qyj.L((cs) ny8Var2.getValue(), measuredWidth2 - iK4, i6, measuredWidth2, iK4 + i6);
        }
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), zo5.b(8.0f, yl5.d().getDisplayMetrics().density, measuredHeight));
            p6eVar.K();
        }
        i24 i24Var = this.d;
        int iK6 = n7j.o((ny8) i24Var.b) ? i24Var.K() : 0;
        int measuredWidth3 = getMeasuredWidth();
        u35 u35Var = this.n;
        int measuredWidth4 = ((measuredWidth3 - u35Var.getMeasuredWidth()) - iK2) - i5;
        int iD = zo5.D(6.0f, yl5.d().getDisplayMetrics().density, (getMeasuredHeight() - iK6) - u35Var.getMeasuredHeight());
        qyj.L(u35Var, measuredWidth4, iD, u35Var.getMeasuredWidth() + measuredWidth4, u35Var.getMeasuredHeight() + iD);
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, getMeasuredHeight() - i24Var.K());
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int size = View.MeasureSpec.getSize(i);
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, size);
        int iK2 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int i3 = iK2 + iK4;
        Integer numValueOf = Integer.valueOf(i3);
        Integer num = 0;
        ny8 ny8Var = this.m;
        if (!n7j.o(ny8Var)) {
            numValueOf = num;
        }
        int iIntValue = iF - numValueOf.intValue();
        Integer numValueOf2 = Integer.valueOf(i3);
        ny8 ny8Var2 = this.l;
        int iIntValue2 = (((iIntValue - (n7j.o(ny8Var2) ? numValueOf2 : 0).intValue()) - (iK3 + iK4)) - iK5) - iK5;
        dhf dhfVar = this.c;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.h;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iK = zo5.b(this.o, yl5.d().getDisplayMetrics().density, lhfVar.a() + iK4);
        } else {
            iK = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iK += giaVar.K();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iK3, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iK3, 1073741824);
        kwb kwbVar = this.k;
        kwbVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824);
        TextView textView = this.i;
        textView.measure(iMakeMeasureSpec3, i2);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iIntValue2, Integer.MIN_VALUE);
        TextView textView2 = this.j;
        textView2.measure(iMakeMeasureSpec4, i2);
        if (n7j.o(ny8Var)) {
            ((cs) ny8Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK2, 1073741824), i2);
        }
        if (n7j.o(ny8Var2)) {
            ((cs) ny8Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK2, 1073741824), i2);
        }
        int iMax = Math.max(kwbVar.getMeasuredHeight(), textView2.getMeasuredHeight() + textView.getMeasuredHeight()) + iK;
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iMax);
        }
        u35 u35Var = this.n;
        u35Var.measure(i, i2);
        int iE = (!n7j.o((ny8) p6eVar.b) || zo5.b(10.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredWidth() + zo5.b(6.0f, yl5.d().getDisplayMetrics().density, p6eVar.L())) >= iF) ? c0a.e(6.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight(), iMax) : zo5.b(10.0f, yl5.d().getDisplayMetrics().density, iMax);
        i24 i24Var = this.d;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            iE += i24Var.K();
        }
        vyf vyfVar = this.e;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            ((fea) getBackground()).s = vyfVar.L();
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(size, iE);
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
        this.n.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.n.setStatus$message_list(f9jVar);
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
        this.n.setChannelMode$message_list(z);
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
        this.h.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.h.f(i);
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
