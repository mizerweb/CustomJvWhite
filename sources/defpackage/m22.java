package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m22 extends wf4 implements zr4, uy1, n22 {
    public Boolean A;
    public CharSequence B;
    public fu1 C;
    public int D;
    public as4 E;
    public o22 F;
    public c1d G;
    public md1 H;
    public final ny8 s;
    public final xme t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public l22 x;
    public Boolean y;
    public Boolean z;

    public m22(Context context) {
        super(context, null);
        this.s = rx8.P(3, new br1(25));
        this.t = p90.M(new ca0(context, 11));
        this.C = fu1.c;
        setLayoutParams(new uf4(-1, -2));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        ImageView imageViewD = qv1.d(context, R.id.call_video_rotation);
        imageViewD.setBackground(getBackgroundView());
        imageViewD.setImageResource(R.drawable.ic_rotation_view_16);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        imageViewD.setPadding(iK, iK, iK, iK);
        imageViewD.setVisibility(8);
        a8g a8gVar = pq3.j;
        imageViewD.setImageTintList(ColorStateList.valueOf(a8gVar.l(imageViewD).b.getIcon().b));
        this.v = imageViewD;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.call_pin);
        imageView.setImageResource(R.drawable.icon_pin_fill);
        imageView.setBackground(getBackgroundView());
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.l(imageView).b.getIcon().b));
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        imageView.setPadding(iK2, iK2, iK2, iK2);
        imageView.setVisibility(8);
        qe7.H(imageView, 300L, new k22(this, 0));
        this.w = imageView;
        TextView textView = new TextView(context);
        textView.setId(R.id.call_user_full_name);
        textView.setMaxLines(1);
        q9i.a(q9i.f, textView);
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setBackground(getBackgroundView());
        textView.setGravity(17);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 7.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(7.0f * yl5.d().getDisplayMetrics().density));
        textView.setVisibility(8);
        np4.C(textView, false);
        l8j.a(textView);
        this.u = textView;
        addView(imageView, gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        addView(imageViewD, gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        addView(textView, -2, gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        WeakHashMap weakHashMap = i7j.a;
        int i = 2;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new xc0(i, this));
        } else {
            x(this.B);
        }
        eg4 eg4VarH = ch3.h(this);
        int id = imageView.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 4, 0, 4);
        eg4VarH.d(id, 7, textView.getId(), 6);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.g(id).d.V = 2;
        int id2 = textView.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.d(id2, 6, imageView.getId(), 7);
        new bsb(6, eg4VarH, id2).a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        eg4VarH.d(id2, 7, imageViewD.getId(), 6);
        new bsb(7, eg4VarH, id2).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.g(id2).d.l0 = true;
        int id3 = imageViewD.getId();
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 6, textView.getId(), 7);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.a(this);
    }

    private final float[] getBG_RADIUS() {
        return (float[]) this.s.getValue();
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBG_RADIUS(), null, null));
        shapeDrawable.getPaint().setColor(pq3.j.e(getContext()).j().b.k().a);
        return shapeDrawable;
    }

    public static float u(yr4 yr4Var, boolean z) {
        int iB;
        int i;
        boolean z2 = yr4Var.c;
        int i2 = z2 ? 1 : -1;
        if (z) {
            if (z2) {
                iB = yr4Var.b();
            } else {
                i = yr4Var.b;
            }
            return i;
        }
        if (!z2) {
            return 0.0f;
        }
        iB = yr4Var.a;
        i = iB * i2;
        return i;
    }

    @Override // defpackage.zr4
    public final void G(yr4 yr4Var) {
        setTranslationY(u(yr4Var, getContext().getResources().getConfiguration().orientation == 1));
    }

    @Override // defpackage.zr4
    public final List J(xr4 xr4Var, xr4 xr4Var2) {
        c79 c79VarW = yab.w();
        c79VarW.add(hsk.c((Math.abs(xr4Var.d) - xr4Var.f) * xr4Var.c, this));
        if (cqk.d(this.A, Boolean.TRUE)) {
            c79VarW.add(hsk.b(this, xr4Var2.a));
        }
        return yab.j(c79VarW);
    }

    @Override // defpackage.zr4
    public final void M() {
        yr4 yr4Var;
        as4 as4Var = this.E;
        if (as4Var == null || (yr4Var = ((es4) as4Var).j) == null) {
            return;
        }
        setTranslationY(u(yr4Var, getContext().getResources().getConfiguration().orientation == 1));
    }

    @Override // defpackage.uy1
    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    @Override // defpackage.uy1
    public final void h(boolean z) {
        if (z) {
            setAlpha(1.0f);
        }
    }

    @Override // defpackage.n22
    public final void i() {
        w();
    }

    @Override // defpackage.uy1
    public final void k(c79 c79Var, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (isk.h(this, z)) {
            c79Var.add(isk.b(this, z, f, f2, j));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o22 o22Var = this.F;
        if (o22Var != null) {
            ((p22) o22Var).a.add(this);
        }
        Context context = getContext();
        ufe ufeVar = new ufe();
        ufeVar.a = context.getResources().getConfiguration().orientation;
        md1 md1Var = new md1(ufeVar, this, 8);
        context.registerComponentCallbacks(md1Var);
        this.H = md1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        md1 md1Var = this.H;
        if (md1Var != null) {
            getContext().unregisterComponentCallbacks(md1Var);
        }
        o22 o22Var = this.F;
        if (o22Var != null) {
            ((p22) o22Var).a.remove(this);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        x(this.B);
    }

    public final void setActive(boolean z) {
        if (cqk.d(this.A, Boolean.valueOf(z))) {
            gm0.Y(m22.class.getName(), "Early return in setActive cuz of isActiveState == isActive");
        } else {
            this.A = Boolean.valueOf(z);
            w();
        }
    }

    public final void setCallSpeakerMediator(o22 o22Var) {
        this.F = o22Var;
    }

    public final void setControlsMediator(as4 as4Var) {
        yr4 yr4Var;
        this.E = as4Var;
        if (as4Var == null || (yr4Var = ((es4) as4Var).j) == null) {
            return;
        }
        G(yr4Var);
    }

    public final void setLabel(CharSequence charSequence) {
        if (cqk.d(this.B, charSequence)) {
            gm0.Y(m22.class.getName(), "Early return in setLabel cuz of labelText == text");
        } else {
            this.B = charSequence;
            x(charSequence);
        }
    }

    public final void setListener(l22 l22Var) {
        this.x = l22Var;
    }

    public final void setParticipantId(fu1 fu1Var) {
        this.C = fu1Var;
    }

    public final void setPipBoundariesController(c1d c1dVar) {
        this.G = c1dVar;
    }

    public final void v() {
        Boolean bool = this.z;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        CharSequence string = this.B;
        if (string == null) {
            string = "";
        }
        if (zBooleanValue) {
            string = getContext().getString(R.string.call_user_talking_accessibility);
        }
        this.u.setContentDescription(string);
    }

    public final void w() {
        yr4 yr4Var;
        as4 as4Var = this.E;
        isk.d(this, (as4Var == null || (yr4Var = ((es4) as4Var).j) == null || yr4Var.c) ? cqk.d(this.A, Boolean.TRUE) : false, 0L, new j22(0, this), 2);
    }

    public final void x(CharSequence charSequence) {
        TextView textView = this.u;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        int iG = bc1.g(8.0f, yl5.d().getDisplayMetrics().density, 2, bc1.g(26.0f, yl5.d().getDisplayMetrics().density, 2, textView.getPaddingStart() + textView.getPaddingEnd() + marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)));
        ImageView imageView = this.w;
        CharSequence charSequenceA = o7j.a(charSequence, textView, ((((k4f) this.t.getValue()).b - c0a.d(12.0f, yl5.d().getDisplayMetrics().density, 2)) - iG) - (imageView.getVisibility() == 0 ? imageView.getMeasuredWidth() : 0));
        textView.setText(charSequenceA);
        textView.setVisibility((charSequenceA == null || r5h.X0(charSequenceA)) ? 8 : 0);
        v();
    }
}
