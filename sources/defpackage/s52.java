package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s52 extends wf4 implements eph, n22 {
    public static final /* synthetic */ zv8[] C1 = {new z8b(s52.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserView$Mode;"), zo5.e(zfe.a, s52.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;")};
    public final wue A;
    public final r52 A1;
    public af7 B;
    public int B1;
    public af7 C;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public final ny8 G;
    public final ViewStub H;
    public final ViewStub I;
    public final ViewStub J;
    public final ViewStub K;
    public final FrameLayout n1;
    public final ifh o1;
    public final ny8 p1;
    public final View q1;
    public final ny8 r1;
    public final ny8 s;
    public p52 s1;
    public final ny8 t;
    public Boolean t1;
    public final ny8 u;
    public Boolean u1;
    public final ny8 v;
    public Boolean v1;
    public final ny8 w;
    public CharSequence w1;
    public final GestureDetector x;
    public fu1 x1;
    public final kwb y;
    public npi y1;
    public final TextView z;
    public final r52 z1;

    public s52(Context context, ha9 ha9Var) {
        super(context);
        this.s = rx8.P(3, new br1(28));
        this.t = rx8.P(3, new o52(context, this, 1));
        this.u = rx8.P(3, new l52(this, 3));
        this.v = rx8.P(3, new l52(this, 4));
        this.w = rx8.P(3, new l52(this, 5));
        this.D = rx8.P(3, new o52(context, this, 2));
        this.E = rx8.P(3, new o52(context, this, 3));
        this.F = rx8.P(3, new wre(context, ha9Var, this, 8));
        this.G = rx8.P(3, new ca0(context, 29));
        this.o1 = new ifh(new l52(this, 0));
        this.p1 = rx8.P(3, new l52(this, 2));
        View view = new View(context);
        view.setId(R.id.call_user_hold_overlay);
        view.setAlpha(0.0f);
        view.setVisibility(8);
        this.q1 = view;
        this.r1 = rx8.P(3, new o52(this, context));
        this.x1 = fu1.c;
        this.z1 = new r52(this, 0);
        this.A1 = new r52(this, 1);
        setLayoutParams(new uf4(-1, -1));
        setElevation(yl5.d().getDisplayMetrics().density * 2.0f);
        o7j.f(yl5.d().getDisplayMetrics().density * 20.0f, this);
        setBackgroundColor(getBackgroundColor());
        this.x = new GestureDetector(context, new pi9(6, this));
        kwb kwbVar = new kwb(context);
        kwbVar.setId(R.id.call_user_small_avatar);
        kwbVar.setAvatarShape(awb.a);
        this.y = kwbVar;
        TextView textView = new TextView(context);
        textView.setId(R.id.call_user_full_name);
        textView.setMaxLines(1);
        textView.setTextColor(pq3.j.l(textView).b.getText().b);
        q9i.a(q9i.i, textView);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        textView.setPadding(iK, iK, iK, iK);
        l8j.a(textView);
        np4.C(textView, false);
        this.z = textView;
        wue wueVar = new wue(context);
        wueVar.setId(R.id.call_more);
        wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        wueVar.setMode(rue.a);
        wueVar.setVisibility(8);
        this.A = wueVar;
        ViewStub viewStubI = bc1.i(context, R.id.call_pip_video);
        this.I = viewStubI;
        ViewStub viewStubI2 = bc1.i(context, R.id.call_pip_camera_preview);
        this.J = viewStubI2;
        ViewStub viewStubI3 = bc1.i(context, R.id.call_raise_hand_status);
        this.H = viewStubI3;
        ViewStub viewStubI4 = bc1.i(context, R.id.call_loading);
        this.K = viewStubI4;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.call_name_layout);
        frameLayout.addView(textView, -2, -2);
        this.n1 = frameLayout;
        addView(kwbVar, getAvatarSize(), getAvatarSize());
        addView(view, 0, 0);
        addView(viewStubI);
        addView(viewStubI2);
        addView(viewStubI4);
        addView(frameLayout, 0, -2);
        addView(wueVar);
        addView(viewStubI3);
        WeakHashMap weakHashMap = i7j.a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new xc0(3, this));
        } else {
            K(this.w1);
        }
        eg4 eg4VarH = ch3.h(this);
        int id = kwbVar.getId();
        eg4VarH.d(id, 4, 0, 4);
        qt4.w(5.0f, yl5.d().getDisplayMetrics().density, new bsb(4, eg4VarH, id));
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = view.getId();
        eg4VarH.d(id2, 3, kwbVar.getId(), 3);
        eg4VarH.d(id2, 4, kwbVar.getId(), 4);
        eg4VarH.d(id2, 6, kwbVar.getId(), 6);
        eg4VarH.d(id2, 7, kwbVar.getId(), 7);
        int id3 = viewStubI.getId();
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        int id4 = viewStubI4.getId();
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.d(id4, 3, 0, 3);
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 7, 0, 7);
        int id5 = viewStubI2.getId();
        eg4VarH.d(id5, 4, 0, 4);
        eg4VarH.d(id5, 3, 0, 3);
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        int id6 = frameLayout.getId();
        eg4VarH.d(id6, 6, 0, 6);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id6));
        eg4VarH.d(id6, 4, 0, 4);
        new bsb(4, eg4VarH, id6).a(getNameVerticalMargin());
        eg4VarH.d(id6, 7, 0, 7);
        new bsb(7, eg4VarH, id6).a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        int id7 = wueVar.getId();
        eg4VarH.d(id7, 3, 0, 3);
        new bsb(3, eg4VarH, id7).a(getActionButtonPadding());
        eg4VarH.d(id7, 7, 0, 7);
        new bsb(7, eg4VarH, id7).a(getActionButtonPadding());
        int id8 = viewStubI3.getId();
        eg4VarH.d(id8, 3, 0, 3);
        new bsb(3, eg4VarH, id8).a(getRaiseHandButtonPadding());
        eg4VarH.d(id8, 6, 0, 6);
        new bsb(6, eg4VarH, id8).a(getRaiseHandButtonPadding());
        eg4VarH.a(this);
    }

    public static final void B(s52 s52Var, q52 q52Var) {
        kwb kwbVar = s52Var.y;
        ViewGroup.LayoutParams layoutParams = kwbVar.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.height = s52Var.getAvatarSize();
        layoutParams.width = s52Var.getAvatarSize();
        kwbVar.setLayoutParams(layoutParams);
        kwb.w(kwbVar, gm0.K(q52Var.a * yl5.d().getDisplayMetrics().density));
        FrameLayout frameLayout = s52Var.n1;
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.bottomMargin = s52Var.getNameVerticalMargin();
        frameLayout.setLayoutParams(marginLayoutParams);
        wue wueVar = s52Var.A;
        ViewGroup.LayoutParams layoutParams3 = wueVar.getLayoutParams();
        if (layoutParams3 == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.topMargin = s52Var.getActionButtonPadding();
        marginLayoutParams2.setMarginEnd(s52Var.getActionButtonPadding());
        wueVar.setLayoutParams(marginLayoutParams2);
        s52Var.getRaiseHandIcon().setBounds(0, 0, s52Var.getActionButtonSize(), s52Var.getActionButtonSize());
        if (n7j.n(s52Var.H)) {
            ImageView raiseHandView = s52Var.getRaiseHandView();
            ViewGroup.LayoutParams layoutParams4 = raiseHandView.getLayoutParams();
            if (layoutParams4 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams3.width = s52Var.getRaiseHandButton();
            marginLayoutParams3.height = s52Var.getRaiseHandButton();
            raiseHandView.setLayoutParams(marginLayoutParams3);
        }
    }

    private final int getActionButtonPadding() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3 || iOrdinal == 4) {
                return gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 5) {
                ore.o();
                return 0;
            }
        }
        return gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
    }

    private final int getActionButtonSize() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                return gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 5) {
                ore.o();
                return 0;
            }
        }
        return gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
    }

    private final int getAvatarSize() {
        return gm0.K(getMode().a * yl5.d().getDisplayMetrics().density);
    }

    private final int getBackgroundColor() {
        return getCurrentTheme().b().d;
    }

    private final ShapeDrawable getBackgroundItemView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getItemRoundRectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    private final ud1 getCameraPreviewView() {
        return (ud1) this.G.getValue();
    }

    private final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final jy7 getHoldOverlayController() {
        return (jy7) this.r1.getValue();
    }

    private final RoundRectShape getItemRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    private final ShapeDrawable getLoadingDrawable() {
        return (ShapeDrawable) this.p1.getValue();
    }

    private final View getLoadingView() {
        return (View) this.E.getValue();
    }

    private final float[] getMAIN_BG_RADIUS() {
        return (float[]) this.s.getValue();
    }

    private final RoundRectShape getMainRoundRectShape() {
        return new RoundRectShape(getMAIN_BG_RADIUS(), null, null);
    }

    private final Drawable getMoreIcon() {
        return (Drawable) this.w.getValue();
    }

    private final int getNameVerticalMargin() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3 || iOrdinal == 4) {
                return gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 5) {
                ore.o();
                return 0;
            }
        }
        return gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
    }

    private final Drawable getPinnedIcon() {
        return (Drawable) this.u.getValue();
    }

    private final int getRaiseHandButton() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return gm0.K(26.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                ore.o();
                return 0;
            }
        }
        return gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
    }

    private final int getRaiseHandButtonPadding() {
        int iOrdinal = getMode().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal == 3 || iOrdinal == 4) {
                return gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
            }
            if (iOrdinal != 5) {
                ore.o();
                return 0;
            }
        }
        return gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
    }

    private final f4e getRaiseHandIcon() {
        return (f4e) this.t.getValue();
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.D.getValue();
    }

    private final c62 getRender() {
        return (c62) this.F.getValue();
    }

    private final Drawable getRotateIcon() {
        return (Drawable) this.v.getValue();
    }

    private final ShapeDrawable getTalkingDrawable() {
        return (ShapeDrawable) this.o1.getValue();
    }

    public static View u(s52 s52Var, Context context) {
        View view = new View(context);
        view.setId(R.id.call_loading);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(s52Var.getLoadingDrawable());
        view.setVisibility(8);
        return view;
    }

    public static ShapeDrawable v(s52 s52Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(s52Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(pq3.j.l(s52Var).b.b().g);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public static void w(s52 s52Var, boolean z) {
        o7j.i(s52Var.getRender(), z);
        kwb kwbVar = s52Var.y;
        if ((kwbVar.getVisibility() == 0) != (!z)) {
            kwbVar.setVisibility(z ? 8 : 0);
        }
        TextView textView = s52Var.z;
        ShapeDrawable backgroundItemView = s52Var.getBackgroundItemView();
        if (!z) {
            backgroundItemView = null;
        }
        textView.setBackground(backgroundItemView);
    }

    public static f4e x(s52 s52Var, Context context) {
        f4e f4eVar = new f4e(context);
        sj sjVar = f4eVar.a;
        if (sjVar != null) {
            sjVar.setCallback(f4eVar);
        }
        f4eVar.setBounds(0, 0, s52Var.getActionButtonSize(), s52Var.getActionButtonSize());
        return f4eVar;
    }

    public static ImageView y(s52 s52Var, Context context) {
        ImageView imageViewD = qv1.d(context, R.id.call_raise_hand_status);
        imageViewD.setLayoutParams(new FrameLayout.LayoutParams(s52Var.getRaiseHandButton(), s52Var.getRaiseHandButton()));
        imageViewD.setImageDrawable(s52Var.getRaiseHandIcon());
        qe7.H(imageViewD, 300L, new m52(s52Var, 2));
        return imageViewD;
    }

    public static ShapeDrawable z(s52 s52Var) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(s52Var.getMainRoundRectShape());
        shapeDrawable.getPaint().setColor(pq3.j.l(s52Var).b.h().f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public final void C() {
        if (n7j.n(this.I)) {
            c62 render = getRender();
            render.getClass();
            render.f(null);
        }
    }

    public final void D(boolean z) {
        ViewStub viewStub = this.K;
        if ((n7j.n(viewStub) || z) && !cqk.d(this.u1, Boolean.valueOf(z))) {
            n7j.m(viewStub, getLoadingView(), null);
            this.u1 = Boolean.valueOf(z);
            getLoadingView().setVisibility(z ? 0 : 8);
        }
    }

    public final void E(boolean z) {
        if (cqk.d(this.t1, Boolean.valueOf(z))) {
            return;
        }
        this.t1 = Boolean.valueOf(z);
        ShapeDrawable talkingDrawable = getTalkingDrawable();
        if (!z) {
            talkingDrawable = null;
        }
        setForeground(talkingDrawable);
    }

    public final void F(boolean z, boolean z2) {
        n7j.m(this.J, getCameraPreviewView(), null);
        getCameraPreviewView().setVisibility(z ? 0 : 8);
        ud1 cameraPreviewView = getCameraPreviewView();
        if (cameraPreviewView.b == z && cameraPreviewView.c == z2) {
            return;
        }
        cameraPreviewView.b = z;
        cameraPreviewView.c = z2;
        cameraPreviewView.a(z, z2);
    }

    public final void H(boolean z, boolean z2) {
        getHoldOverlayController().a(z, z2);
    }

    public final void I(String str, CharSequence charSequence) {
        if (cqk.d(this.w1, charSequence)) {
            return;
        }
        this.w1 = charSequence;
        K(charSequence);
        this.z.setContentDescription(str);
    }

    public final void K(CharSequence charSequence) {
        TextView textView = this.z;
        View view = (View) textView.getParent();
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginEnd = measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        CharSequence charSequenceA = o7j.a(charSequence, textView, ((marginEnd - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0)) - textView.getPaddingEnd()) - textView.getPaddingRight());
        textView.setText(charSequenceA);
        textView.setVisibility(charSequenceA == null || r5h.X0(charSequenceA) ? 8 : 0);
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = C1[1];
        return (kbc) this.A1.b;
    }

    public final q52 getMode() {
        zv8 zv8Var = C1[0];
        return (q52) this.z1.b;
    }

    @Override // defpackage.n22
    public final void i() {
        setOpponentVideo(this.y1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        o22 o22Var;
        super.onAttachedToWindow();
        af7 af7Var = this.B;
        if (af7Var != null && (o22Var = (o22) af7Var.invoke()) != null) {
            ((p22) o22Var).a.add(this);
        }
        if (n7j.n(this.H) && cqk.d(this.v1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o22 o22Var;
        super.onDetachedFromWindow();
        af7 af7Var = this.B;
        if (af7Var != null && (o22Var = (o22) af7Var.invoke()) != null) {
            ((p22) o22Var).a.remove(this);
        }
        if (n7j.n(this.H)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        K(this.w1);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(getBackgroundColor());
        ShapeDrawable backgroundItemView = getBackgroundItemView();
        if (getRender().getVisibility() != 0) {
            backgroundItemView = null;
        }
        this.z.setBackground(backgroundItemView);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.x.onTouchEvent(motionEvent);
    }

    public final void setAvatar(ok0 ok0Var) {
        kwb.u(this.y, ok0Var != null ? ok0Var.b : null, ok0Var != null ? ok0Var.a : null);
    }

    public final void setBackgroundCorners(float f) {
        o7j.f(f, this);
    }

    public final void setButtonAction(e61 e61Var) {
        boolean z = e61Var.b;
        boolean z2 = e61Var.a;
        boolean z3 = e61Var.d;
        int i = this.B1;
        int i2 = e61Var.c;
        if (i == i2) {
            if (i == ((z2 && z && z3) ? 4 : i2)) {
                return;
            }
        }
        wue wueVar = this.A;
        rue rueVar = rue.i;
        if (z3 && z2 && z) {
            wueVar.setVisibility(8);
            wueVar.setContentDescription(null);
            wueVar.setMode(rueVar);
            this.B1 = 4;
            return;
        }
        this.B1 = i2;
        int iD = qt4.D(i2);
        a8g a8gVar = pq3.j;
        if (iD == 0) {
            wueVar.setVisibility(0);
            wueVar.y(a8gVar.l(wueVar).b.getIcon().b, getMoreIcon());
            wueVar.setImageSize(new sue(getActionButtonSize(), getActionButtonSize()));
            wueVar.setMode(rueVar);
            wueVar.setContentDescription(wueVar.getContext().getString(R.string.call_user_item_more));
            qe7.H(wueVar, 300L, new ee(this, 11, wueVar));
            wueVar.setButtonPadding(1);
            return;
        }
        if (iD == 1) {
            wueVar.setVisibility(0);
            Drawable rotateIcon = getRotateIcon();
            a8gVar.l(wueVar);
            wueVar.y(-1, rotateIcon);
            wueVar.setImageSize(new sue(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
            wueVar.setMode(rue.f);
            wueVar.setContentDescription(wueVar.getContext().getString(R.string.call_user_item_rotate));
            qe7.H(wueVar, 300L, new m52(this, 1));
            wueVar.setButtonPadding(8);
            return;
        }
        if (iD != 2) {
            if (iD != 3) {
                ore.o();
                return;
            }
            wueVar.setVisibility(8);
            wueVar.setContentDescription(null);
            wueVar.setMode(rueVar);
            return;
        }
        wueVar.setVisibility(0);
        wueVar.y(a8gVar.l(wueVar).b.getIcon().b, getPinnedIcon());
        wueVar.setImageSize(new sue(getActionButtonSize(), getActionButtonSize()));
        wueVar.setMode(rueVar);
        wueVar.setContentDescription(wueVar.getContext().getString(R.string.call_user_info_pinned));
        qe7.H(wueVar, 300L, new m52(this, 0));
        wueVar.setButtonPadding(1);
    }

    public final void setCallSpeakerMediator(af7 af7Var) {
        this.B = af7Var;
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.A1.B(this, C1[1], kbcVar);
    }

    public final void setMode(q52 q52Var) {
        this.z1.B(this, C1[0], q52Var);
    }

    public final void setOpponentVideo(npi npiVar) {
        o22 o22Var;
        npi npiVar2;
        ViewStub viewStub = this.I;
        if (npiVar != null || n7j.n(viewStub)) {
            c62 render = getRender();
            boolean z = false;
            if (!n7j.n(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = render.getLayoutParams().height;
                layoutParams.width = render.getLayoutParams().width;
                render.setId(viewStub.getId());
                viewGroup.addView(render, iIndexOfChild, layoutParams);
                o7j.i(getRender(), false);
            }
            af7 af7Var = this.B;
            if (af7Var != null && (o22Var = (o22) af7Var.invoke()) != null && (npiVar2 = ((p22) o22Var).b) != null && npiVar2.g && npiVar != null && npiVar2.a == npiVar.a) {
                z = true;
            }
            c62 render2 = getRender();
            render2.j = npiVar;
            render2.k = z;
            getRender().g();
            this.y1 = npiVar;
        }
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.H;
        if (n7j.n(viewStub) || z) {
            this.v1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!n7j.n(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, iIndexOfChild, layoutParams);
                getRaiseHandIcon().setBounds(0, 0, getRaiseHandButton(), getRaiseHandButton());
            }
            isk.d(getRaiseHandView(), z, 50L, null, 4);
            f4e raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(af7 af7Var) {
        this.C = af7Var;
    }
}
