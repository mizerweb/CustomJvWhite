package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.work.WorkRequest;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class izi extends ViewGroup implements v35, b8e, mia, ekc, k24, z5j, azf, q1i, p1i, y5j, nyi {
    public static final /* synthetic */ zv8[] y1;
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final t5d D;
    public boolean E;
    public boolean F;
    public ga0 G;
    public md1 H;
    public sgg I;
    public sgg J;
    public ValueAnimator K;
    public final cf7 a;
    public final p6e b;
    public final gia c;
    public final fkc d;
    public final vvi e;
    public final i24 f;
    public final v0i g;
    public final vyf h;
    public final String i;
    public final ny8 j;
    public final ny8 k;
    public final ShapeDrawable l;
    public final q1j m;
    public final t58 n;
    public AnimatorSet n1;
    public final wti o;
    public Integer o1;
    public final ny8 p;
    public Integer p1;
    public final ny8 q;
    public Integer q1;
    public final u35 r;
    public Layout r1;
    public final ny8 s;
    public Integer s1;
    public final Rect t;
    public Integer t1;
    public final bzi u;
    public Integer u1;
    public final ny8 v;
    public int v1;
    public final ny8 w;
    public boolean w1;
    public final ny8 x;
    public int x1;
    public final ny8 y;
    public final int z;

    static {
        z8b z8bVar = new z8b(izi.class, "model", "getModel()Lone/me/messages/list/loader/model/VideoMessageAttach;");
        zfe.a.getClass();
        y1 = new zv8[]{z8bVar};
    }

    public izi(final Context context, fz7 fz7Var) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        fkc fkcVar = new fkc();
        vvi vviVar = new vvi();
        i24 i24Var = new i24(2);
        v0i v0iVar = new v0i();
        vyf vyfVar = new vyf();
        super(context);
        this.a = fz7Var;
        this.b = p6eVar;
        this.c = giaVar;
        this.d = fkcVar;
        this.e = vviVar;
        this.f = i24Var;
        this.g = v0iVar;
        this.h = vyfVar;
        this.i = izi.class.getName();
        this.j = rx8.P(3, new yfi(26));
        this.k = rx8.P(3, new yfi(24));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.setCallback(this);
        this.l = shapeDrawable;
        this.m = new q1j();
        t58 t58Var = new t58(context);
        ((wj7) t58Var.getHierarchy()).m(eve.a());
        qe7.H(t58Var, 300L, new aah(9, this));
        t58Var.setOnLongClickListener(new cw0(13, this));
        this.n = t58Var;
        wti wtiVar = new wti(context);
        final int i = 1;
        wtiVar.setBackgroundEnabled(true);
        final int i2 = 0;
        wtiVar.setDrawableEnabled(false);
        wtiVar.setCapsuleInside(false);
        this.o = wtiVar;
        this.p = rx8.P(3, new af7() { // from class: xyi
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                izi iziVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        ad0 ad0Var = new ad0(context2);
                        ad0Var.setVisibility(8);
                        ad0Var.setListener(new rai(iziVar));
                        return ad0Var;
                    default:
                        pyi pyiVar = new pyi(context2);
                        pyiVar.setListener(iziVar);
                        pyiVar.setOnLongClickListener(new cw0(14, pyiVar));
                        return pyiVar;
                }
            }
        });
        this.q = rx8.P(3, new twf(context, 18));
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(true);
        u35Var.setBackgroundColor(getColorBubbleOutside());
        this.r = u35Var;
        this.s = rx8.P(3, new af7(this) { // from class: yyi
            public final /* synthetic */ izi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                izi iziVar = this.b;
                switch (i3) {
                    case 0:
                        return izi.j(iziVar);
                    case 1:
                        return izi.c(iziVar);
                    default:
                        xr8 xr8Var = fea.u;
                        kbc kbcVarH = pq3.j.h(iziVar);
                        xr8Var.getClass();
                        return xr8.j(kbcVarH);
                }
            }
        });
        this.t = new Rect();
        bzi bziVar = new bzi();
        bziVar.c(getIconBackgroundColor(), bc1.k(24.0f, yl5.d().getDisplayMetrics().density));
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_sound_crossed_fill).mutate();
        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iconColor = getIconColor();
        bziVar.addLayer(drawableMutate);
        drawableMutate.setTint(iconColor);
        bziVar.setLayerSize(1, iK, iK);
        bziVar.setLayerGravity(1, 17);
        this.u = bziVar;
        this.v = rx8.P(3, new af7(this) { // from class: yyi
            public final /* synthetic */ izi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                izi iziVar = this.b;
                switch (i3) {
                    case 0:
                        return izi.j(iziVar);
                    case 1:
                        return izi.c(iziVar);
                    default:
                        xr8 xr8Var = fea.u;
                        kbc kbcVarH = pq3.j.h(iziVar);
                        xr8Var.getClass();
                        return xr8.j(kbcVarH);
                }
            }
        });
        this.w = rx8.P(3, new twf(context, 19));
        final int i3 = 2;
        this.x = rx8.P(3, new af7(this) { // from class: yyi
            public final /* synthetic */ izi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                izi iziVar = this.b;
                switch (i4) {
                    case 0:
                        return izi.j(iziVar);
                    case 1:
                        return izi.c(iziVar);
                    default:
                        xr8 xr8Var = fea.u;
                        kbc kbcVarH = pq3.j.h(iziVar);
                        xr8Var.getClass();
                        return xr8.j(kbcVarH);
                }
            }
        });
        this.y = rx8.P(3, new af7() { // from class: xyi
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                izi iziVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        ad0 ad0Var = new ad0(context2);
                        ad0Var.setVisibility(8);
                        ad0Var.setListener(new rai(iziVar));
                        return ad0Var;
                    default:
                        pyi pyiVar = new pyi(context2);
                        pyiVar.setListener(iziVar);
                        pyiVar.setOnLongClickListener(new cw0(14, pyiVar));
                        return pyiVar;
                }
            }
        });
        this.z = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.A = rx8.P(3, new yfi(27));
        this.B = rx8.P(3, new yfi(28));
        this.C = rx8.P(3, new yfi(29));
        this.D = new t5d(15, this);
        p6eVar.a = this;
        giaVar.a = this;
        vviVar.a = this;
        i24Var.a = this;
        v0iVar.a = this;
        vyfVar.a = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(t58Var, new ViewGroup.LayoutParams(-1, -1));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        addView(wtiVar, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        this.x1 = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
    }

    public static final void L(izi iziVar) {
        oxi model = iziVar.getModel();
        if (model != null) {
            iziVar.a.invoke(new sna(model.a, model, iziVar.g.d));
        }
    }

    public static final void M(izi iziVar) {
        oxi model = iziVar.getModel();
        if (model != null) {
            iziVar.a.invoke(new rna(model.a, model));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void N(izi iziVar, l1j l1jVar) {
        oxi model = iziVar.getModel();
        if (!cqk.d(model != null ? Long.valueOf(model.a) : null, l1jVar != null ? Long.valueOf(l1jVar.b) : null)) {
            iziVar.getAudioWaveView().f(0.0f, false, true);
            iziVar.n.setOverlayDrawable(iziVar.g.d ? iziVar.getMediaControlDrawable() : null);
            iziVar.getMediaControlDrawable().e(false);
            return;
        }
        k1j k1jVar = l1jVar != null ? l1jVar.f : null;
        int i = k1jVar == null ? -1 : czi.$EnumSwitchMapping$0[k1jVar.ordinal()];
        if (i == 2) {
            iziVar.getMediaControlDrawable().d();
            return;
        }
        if (i == 3) {
            iziVar.getMediaControlDrawable().d();
            ny8 ny8Var = iziVar.y;
            if (ny8Var.d()) {
                ((pyi) ny8Var.getValue()).l(l1jVar.g, false);
            }
            iziVar.getAudioWaveView().f(l1jVar.g / 100.0f, true, false);
            return;
        }
        if (i == 4) {
            iziVar.getMediaControlDrawable().e(true);
        } else if (i == 5 || i == 6) {
            iziVar.getAudioWaveView().f(0.0f, false, true);
            iziVar.getMediaControlDrawable().e(true);
        }
    }

    public static final void O(izi iziVar) {
        oxi model = iziVar.getModel();
        if (model == null) {
            return;
        }
        i1i i1iVar = model.g;
        fti ftiVar = model.c;
        iziVar.n.setImageAttach(new g58(0L, ftiVar.b, ftiVar.c, ftiVar.d, false, ftiVar.e, false, ftiVar.i, ftiVar.j, null, null, null, 0L, 0L, 32256));
        iziVar.r1 = i1iVar != null ? i1iVar.a : null;
        View viewR = iziVar.g.R();
        u0i u0iVar = viewR instanceof u0i ? (u0i) viewR : null;
        if (u0iVar != null) {
            u0iVar.setIncomingMessage(iziVar.E);
            u0iVar.setBackgroundEnabled(true);
            qe7.H(u0iVar, 300L, new jvf(iziVar, 21, model));
        }
        wti wtiVar = iziVar.o;
        long jG = ew5.g(ftiVar.f);
        String[] strArr = woh.b;
        wtiVar.setContent(mxl.a(jG));
        iziVar.f0((h50) model.d.a.getValue());
        o1i transcriptionView = iziVar.getTranscriptionView();
        transcriptionView.setState(i1iVar);
        transcriptionView.setIncomingMessage(iziVar.E);
        iziVar.requestLayout();
        iziVar.invalidate();
    }

    public static final void P(izi iziVar, oxi oxiVar, l1j l1jVar) {
        oxi model = iziVar.getModel();
        if (!cqk.d(model != null ? Long.valueOf(model.a) : null, l1jVar != null ? Long.valueOf(l1jVar.b) : null)) {
            if (iziVar.x1 != gm0.K(228.0f * yl5.d().getDisplayMetrics().density)) {
                k0(iziVar, oxiVar, false);
            }
            ny8 ny8Var = iziVar.y;
            if (ny8Var.d()) {
                pyi pyiVar = (pyi) ny8Var.getValue();
                pyiVar.setVisibility(8);
                pyiVar.k();
            }
            iziVar.getAudioWaveView().f(0.0f, false, true);
        }
        View viewR = iziVar.e.R();
        if (viewR != null) {
            viewR.setForeground(null);
        }
        k1j k1jVar = l1jVar != null ? l1jVar.f : null;
        switch (k1jVar == null ? -1 : czi.$EnumSwitchMapping$0[k1jVar.ordinal()]) {
            case 1:
                iziVar.e.D(l1jVar, oxiVar, l1jVar.b, false, false);
                break;
            case 2:
                iziVar.n.setOverlayDrawable(null);
                iziVar.getMediaControlDrawable().d();
                int i = iziVar.x1;
                int orientationBasedWidth = iziVar.getOrientationBasedWidth();
                ValueAnimator valueAnimator = iziVar.K;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, orientationBasedWidth);
                valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                valueAnimatorOfInt.addUpdateListener(new m11(5, iziVar));
                valueAnimatorOfInt.setDuration(250L);
                valueAnimatorOfInt.addListener(new ezi(iziVar, 5));
                valueAnimatorOfInt.start();
                iziVar.K = valueAnimatorOfInt;
                break;
            case 3:
                bdc.a(iziVar, new gzi(iziVar, iziVar, oxiVar, l1jVar, 0));
                iziVar.setKeepScreenOn(true);
                yab.e(iziVar, iziVar.getDurationSlider(), -1);
                iziVar.getDurationSlider().setVisibility(0);
                iziVar.getDurationSlider().l(l1jVar.g, true);
                long j = l1jVar.h;
                String[] strArr = woh.b;
                iziVar.o.setContent(mxl.a(j));
                iziVar.getAudioWaveView().f(l1jVar.g / 100.0f, true, false);
                iziVar.getMediaControlDrawable().d();
                break;
            case 4:
                bdc.a(iziVar, new gzi(iziVar, iziVar, oxiVar, l1jVar, 1));
                iziVar.setKeepScreenOn(false);
                yab.e(iziVar, iziVar.getDurationSlider(), -1);
                iziVar.getDurationSlider().setVisibility(0);
                iziVar.getDurationSlider().j();
                iziVar.getDurationSlider().setProgressForced(l1jVar.g);
                iziVar.getAudioWaveView().f(l1jVar.g / 100.0f, true, false);
                iziVar.getMediaControlDrawable().e(true);
                break;
            case 5:
            case 6:
                bdc.a(iziVar, new ruh(iziVar, iziVar, oxiVar));
                iziVar.setKeepScreenOn(false);
                iziVar.getAudioWaveView().f(0.0f, false, true);
                iziVar.getMediaControlDrawable().e(true);
                break;
        }
    }

    public static void R(izi iziVar, oxi oxiVar, l1j l1jVar, hzi hziVar, int i) {
        boolean z = (i & 4) != 0;
        af7 yfiVar = hziVar;
        if ((i & 8) != 0) {
            yfiVar = new yfi(25);
        }
        iziVar.getClass();
        if (l1jVar.b != oxiVar.a) {
            return;
        }
        int orientationBasedWidth = iziVar.getOrientationBasedWidth();
        iziVar.e.D(l1jVar, oxiVar, l1jVar.b, false, false);
        iziVar.n.setOverlayDrawable(null);
        if (!z) {
            yfiVar.invoke();
            return;
        }
        int i2 = iziVar.x1;
        ValueAnimator valueAnimator = iziVar.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, orientationBasedWidth);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new m11(5, iziVar));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new mgd(1, yfiVar));
        valueAnimatorOfInt.start();
        iziVar.K = valueAnimatorOfInt;
    }

    public static bzi c(izi iziVar) {
        bzi bziVar = new bzi();
        bziVar.c(iziVar.getIconBackgroundColor(), bc1.k(52.0f, yl5.d().getDisplayMetrics().density));
        v50 v50Var = new v50();
        v50Var.r = 2;
        v50Var.invalidateSelf();
        v50Var.a = iziVar.getContext().getDrawable(R.drawable.icon_cross_mini).mutate();
        v50Var.invalidateSelf();
        v50Var.c(iziVar.getIconColor());
        v50Var.b();
        int iK = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        int iconColor = iziVar.getIconColor();
        bziVar.addLayer(v50Var);
        v50Var.setTint(iconColor);
        bziVar.setLayerSize(1, iK, iK);
        bziVar.setLayerGravity(1, 17);
        return bziVar;
    }

    public static boolean c0(oxi oxiVar) {
        l1j l1jVarE;
        if (oxiVar == null || (l1jVarE = oxiVar.e()) == null || l1jVarE.b != oxiVar.a) {
            return false;
        }
        int iOrdinal = l1jVarE.f.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    public static void d(int i, int i2, int i3, int i4, int i5, int i6, izi iziVar, int i7, int i8, int i9, int i10, int i11, int i12, ValueAnimator valueAnimator) {
        int iC = lk.c(i, valueAnimator.getAnimatedFraction(), i2);
        int iC2 = lk.c(i3, valueAnimator.getAnimatedFraction(), i4);
        int iC3 = lk.c(i5, valueAnimator.getAnimatedFraction(), i6);
        iziVar.getAudioWaveView().setVisibility(iziVar.F ? 0 : 8);
        iziVar.s1 = Integer.valueOf(iC);
        iziVar.t1 = Integer.valueOf(iC2);
        iziVar.u1 = Integer.valueOf(iC3);
        iziVar.p1 = Integer.valueOf(lk.c(i7, valueAnimator.getAnimatedFraction(), i8));
        iziVar.q1 = Integer.valueOf(lk.c(i9, valueAnimator.getAnimatedFraction(), i10));
        iziVar.o1 = Integer.valueOf(lk.c(i11, valueAnimator.getAnimatedFraction(), i12));
        iziVar.getTranscriptionBackground().setBounds(0, 0, iC3, iC2);
        iziVar.requestLayout();
    }

    public static void g(izi iziVar) {
        oxi model = iziVar.getModel();
        if (model != null) {
            iziVar.a.invoke(new pna(model.a, model));
        }
    }

    public final ad0 getAudioWaveView() {
        return (ad0) this.p.getValue();
    }

    public final Path getBackgroundPath() {
        return (Path) this.B.getValue();
    }

    public final RectF getBackgroundRect() {
        return (RectF) this.C.getValue();
    }

    private final int getBorderColor() {
        return ((xac) pq3.j.h(this).f().b).a.a;
    }

    private final boolean getCanDrawMuteIcon() {
        return getMeasuredWidth() == gm0.K(228.0f * yl5.d().getDisplayMetrics().density) && this.n.getOverlayDrawable() == null;
    }

    private final int getCollapsedPreviewTop() {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        gia giaVar = this.c;
        if (!n7j.o((ny8) giaVar.b)) {
            return iK;
        }
        int iK2 = (gm0.K(4.0f * yl5.d().getDisplayMetrics().density) * 2) + giaVar.K() + iK;
        return this.F ? zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iK2) : iK2;
    }

    private final int getColorBubbleOutside() {
        return pq3.j.h(this).t().b;
    }

    public final pyi getDurationSlider() {
        return (pyi) this.y.getValue();
    }

    private final PathInterpolator getExpandInterpolator() {
        return (PathInterpolator) this.j.getValue();
    }

    private static /* synthetic */ void getExpandInterpolator$annotations() {
    }

    private final int getExpandedPreviewTop() {
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        gia giaVar = this.c;
        if (!n7j.o((ny8) giaVar.b)) {
            return iK;
        }
        int iK2 = giaVar.K() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        return this.F ? zo5.b(8.0f, yl5.d().getDisplayMetrics().density, iK2) : iK2;
    }

    private final PathInterpolator getFadeInterpolator() {
        return (PathInterpolator) this.k.getValue();
    }

    private static /* synthetic */ void getFadeInterpolator$annotations() {
    }

    private final int getIconBackgroundColor() {
        return pq3.j.h(this).h().i;
    }

    private final int getIconColor() {
        pq3.j.h(this);
        return -1;
    }

    private final eu9 getMediaControlDrawable() {
        return (eu9) this.w.getValue();
    }

    public final oxi getModel() {
        zv8 zv8Var = y1[0];
        return (oxi) this.D.b;
    }

    private final bzi getNeedDownloadDrawable() {
        return (bzi) this.s.getValue();
    }

    private final int getOrientationBasedWidth() {
        if (p90.E(this)) {
            return gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
        }
        ViewParent parent = getParent();
        iea ieaVar = parent instanceof iea ? (iea) parent : null;
        if (ieaVar != null) {
            return ieaVar.getMaxAvailableWidth$message_list();
        }
        return 0;
    }

    private final bzi getProgressDownloadDrawable() {
        return (bzi) this.v.getValue();
    }

    public final fea getTranscriptionBackground() {
        return (fea) this.x.getValue();
    }

    private final Rect getTranscriptionButtonClickArea() {
        return (Rect) this.A.getValue();
    }

    public final o1i getTranscriptionView() {
        return (o1i) this.q.getValue();
    }

    public static void i(float f, float f2, int i, int i2, int i3, int i4, int i5, izi iziVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float fA = lk.a(f, f2, fFloatValue);
        int iC = lk.c(i, fFloatValue, i2);
        int iC2 = lk.c(i3, fFloatValue, 0);
        int iC3 = lk.c(i4, fFloatValue, i5);
        Path backgroundPath = iziVar.getBackgroundPath();
        backgroundPath.reset();
        iziVar.getBackgroundRect().set(0.0f, iC2, iC3, iC);
        backgroundPath.addRoundRect(iziVar.getBackgroundRect(), fA, fA, Path.Direction.CW);
    }

    public static bzi j(izi iziVar) {
        bzi bziVar = new bzi();
        bziVar.c(iziVar.getIconBackgroundColor(), bc1.k(52.0f, yl5.d().getDisplayMetrics().density));
        Drawable drawableMutate = iziVar.getContext().getDrawable(R.drawable.icon_download).mutate();
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        int iconColor = iziVar.getIconColor();
        bziVar.addLayer(drawableMutate);
        drawableMutate.setTint(iconColor);
        bziVar.setLayerSize(1, iK, iK);
        bziVar.setLayerGravity(1, 17);
        return bziVar;
    }

    public static final void k0(izi iziVar, oxi oxiVar, boolean z) {
        ny8 ny8Var = iziVar.y;
        if (ny8Var.d()) {
            pyi pyiVar = (pyi) ny8Var.getValue();
            pyiVar.setVisibility(8);
            pyiVar.k();
        }
        wti wtiVar = iziVar.o;
        long jG = ew5.g(oxiVar.c.f);
        String[] strArr = woh.b;
        wtiVar.setContent(mxl.a(jG));
        iziVar.e.J();
        if (!z) {
            iziVar.x1 = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
            iziVar.requestLayout();
            return;
        }
        int i = iziVar.x1;
        int iK = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
        ValueAnimator valueAnimator = iziVar.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iK);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new m11(5, iziVar));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new ezi(iziVar, 6));
        valueAnimatorOfInt.start();
        iziVar.K = valueAnimatorOfInt;
    }

    public static void l(izi iziVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        iziVar.r.setAlpha(fFloatValue);
        iziVar.o.setAlpha(fFloatValue);
        View viewR = iziVar.g.R();
        if (viewR != null) {
            viewR.setAlpha(fFloatValue);
        }
        iziVar.getTranscriptionView().setAlpha(fFloatValue);
        View viewR2 = iziVar.b.R();
        if (viewR2 != null) {
            viewR2.setAlpha(fFloatValue);
        }
        View viewR3 = iziVar.c.R();
        if (viewR3 != null) {
            viewR3.setAlpha(fFloatValue);
        }
    }

    public static final void r(izi iziVar, boolean z) {
        iziVar.F = z;
        iziVar.e0(z);
        iziVar.g0(z);
        iziVar.i0(z);
        gia giaVar = iziVar.c;
        giaVar.Z(!z);
        giaVar.p(f55.g(pq3.j.h(iziVar).f(), iziVar.E));
        iziVar.n.setOverlayDrawable(iziVar.F ? iziVar.getMediaControlDrawable() : null);
        iziVar.getTranscriptionView().setVisibility(z ? 0 : 8);
        iziVar.h0(z);
    }

    private final void setModel(oxi oxiVar) {
        this.D.B(this, y1[0], oxiVar);
    }

    @Override // defpackage.mia
    public final void A() {
        this.c.A();
    }

    @Override // defpackage.z5j
    public final boolean B() {
        return this.e.B();
    }

    @Override // defpackage.azf
    public final void C() {
        this.h.C();
    }

    @Override // defpackage.z5j
    public final void D(q5j q5jVar, t50 t50Var, long j, boolean z, boolean z2) {
        this.e.D(q5jVar, t50Var, j, z, z2);
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.b.G(xacVar, z);
    }

    @Override // defpackage.y5j
    public final /* bridge */ /* synthetic */ u5j H(boolean z) {
        return s5j.a;
    }

    @Override // defpackage.z5j
    public final void J() {
        this.e.J();
    }

    public final void Q() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new dzi(this, 0));
            return;
        }
        ViewParent parent = getParent();
        iea ieaVar = parent instanceof iea ? (iea) parent : null;
        if (ieaVar == null) {
            return;
        }
        boolean zC0 = c0(getModel());
        int maxAvailableWidth$message_list = ieaVar.getMaxAvailableWidth$message_list();
        if (!zC0 || p90.E(this)) {
            maxAvailableWidth$message_list = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
        }
        if (maxAvailableWidth$message_list == this.x1) {
            return;
        }
        if (zC0 && !p90.E(this)) {
            this.e.s(false);
        }
        int i = this.x1;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, maxAvailableWidth$message_list);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new m11(5, this));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new s0i(3));
        valueAnimatorOfInt.start();
        this.K = valueAnimatorOfInt;
    }

    public final void S(oxi oxiVar, boolean z) {
        int i = oxiVar.h;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = z;
        boolean z2 = oxiVar.i;
        int i2 = 1;
        v0i v0iVar = this.g;
        if (z2) {
            v0iVar.r();
            boolean z3 = i == 2;
            v0iVar.d = z3;
            this.F = z3;
            if (z3) {
                yab.e(this, getTranscriptionView(), -1);
                yab.e(this, getAudioWaveView(), -1);
            }
            e0(this.F);
            g0(this.F);
            i0(this.F);
            boolean z4 = !this.F;
            gia giaVar = this.c;
            giaVar.Z(z4);
            giaVar.p(f55.g(pq3.j.h(this).f(), this.E));
            this.n.setOverlayDrawable(this.F ? getMediaControlDrawable() : null);
            getAudioWaveView().setVisibility(this.F ? 0 : 8);
            getTranscriptionView().setVisibility(this.F ? 0 : 8);
            getTranscriptionView().setAlpha(this.F ? 1.0f : 0.0f);
            ny8 ny8Var = this.y;
            if (ny8Var.d()) {
                ((pyi) ny8Var.getValue()).setVisibility(this.F ? 8 : 0);
            }
            ad0 audioWaveView = getAudioWaveView();
            fti ftiVar = oxiVar.c;
            audioWaveView.e(ew5.g(ftiVar.f), this.E, ftiVar.m);
            fea.b(getTranscriptionBackground(), this.E, 3, false, false, 0, false, 252);
            this.o1 = this.F ? bc1.k(44.0f, yl5.d().getDisplayMetrics().density) : Integer.valueOf(X());
            if (this.F) {
                this.e.J();
            }
            this.r.setAlpha(1.0f);
            this.o.setAlpha(1.0f);
            View viewR = v0iVar.R();
            if (viewR != null) {
                viewR.setAlpha(1.0f);
            }
            View viewR2 = this.b.R();
            if (viewR2 != null) {
                viewR2.setAlpha(1.0f);
            }
            View viewR3 = giaVar.R();
            if (viewR3 != null) {
                viewR3.setAlpha(1.0f);
            }
            h0(this.F);
        }
        setModel(oxiVar);
        l1j l1jVarE = oxiVar.e();
        if (l1jVarE == null || l1jVarE.b != oxiVar.a) {
            ValueAnimator valueAnimator2 = this.K;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.x1 = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
            requestLayout();
        }
        this.G = new ga0(this, 16, oxiVar);
        View viewR4 = v0iVar.R();
        u0i u0iVar = viewR4 instanceof u0i ? (u0i) viewR4 : null;
        if (u0iVar != null) {
            int i3 = i == 0 ? -1 : q0i.$EnumSwitchMapping$0[qt4.D(i)];
            if (i3 != 1) {
                if (i3 != 2) {
                    i2 = 3;
                    if (i3 != 3) {
                        i2 = 0;
                    }
                } else {
                    i2 = 2;
                }
            }
            ny8 ny8Var2 = u0i.t;
            u0iVar.b(i2, false);
        }
        if (isAttachedToWindow()) {
            ga0 ga0Var = this.G;
            if (ga0Var != null) {
                ga0Var.onViewAttachedToWindow(this);
            }
        } else {
            Q();
        }
        addOnAttachStateChangeListener(this.G);
    }

    public final int T() {
        int iX = X();
        gia giaVar = this.c;
        int iL = n7j.o((ny8) giaVar.b) ? giaVar.L() : 0;
        p6e p6eVar = this.b;
        return Math.max(iX, Math.max(iL, n7j.o((ny8) p6eVar.b) ? p6eVar.L() : 0));
    }

    public final int U() {
        int i = this.v1;
        oxi model = getModel();
        long jG = model != null ? ew5.g(model.c.f) : 0L;
        Layout layout = this.r1;
        int width = layout != null ? layout.getWidth() : 0;
        p6e p6eVar = this.b;
        int iL = n7j.o((ny8) p6eVar.b) ? p6eVar.L() : 0;
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        return Math.max((int) tqk.c(gm0.K(192.0f * yl5.d().getDisplayMetrics().density), i, tqk.b(1000.0f, 30000.0f, oc9.x(jG, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS))), Math.max(width > 0 ? (iK * 2) + width : 0, iL > 0 ? (iK * 2) + iL : 0));
    }

    public final int V() {
        boolean z = this.F;
        gia giaVar = this.c;
        boolean zO = n7j.o((ny8) giaVar.b);
        int iK = giaVar.K();
        int measuredHeight = this.r.getMeasuredHeight();
        Layout layout = this.r1;
        int height = layout != null ? layout.getHeight() : 0;
        p6e p6eVar = this.b;
        boolean zO2 = n7j.o((ny8) p6eVar.b);
        int iK2 = p6eVar.K();
        int iK3 = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK5 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        int iK6 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iK7 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        int iK8 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        if (zO) {
            iK4 = (iK6 * 2) + iK;
            if (!z) {
                iK4 -= iK6;
            }
        }
        if (!z) {
            iK7 = -iK7;
        }
        int i = height + iK5 + measuredHeight + iK7 + iK4 + iK3;
        return zO2 ? i + iK2 + iK8 : i;
    }

    public final int W() {
        int iU = U();
        i24 i24Var = this.f;
        int iL = n7j.o((ny8) i24Var.b) ? i24Var.L() : 0;
        vyf vyfVar = this.h;
        return Math.max(iL > 0 ? gm0.K(8.0f * yl5.d().getDisplayMetrics().density) + iL : 0, n7j.o((ny8) vyfVar.b) ? vyfVar.L() : 0) + iU;
    }

    public final int X() {
        return c0(getModel()) ? getOrientationBasedWidth() : gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
    }

    public final void Y(kbc kbcVar) {
        Drawable foreground = this.n.getForeground();
        bzi bziVar = foreground instanceof bzi ? (bzi) foreground : null;
        if (bziVar != null) {
            bziVar.a(kbcVar.h().i);
        }
        this.u.a(kbcVar.h().i);
        v0i v0iVar = this.g;
        boolean z = v0iVar.d;
        a8g a8gVar = pq3.j;
        int iconBackgroundColor = z ? a8gVar.h(this).b().g : getIconBackgroundColor();
        getNeedDownloadDrawable().b(iconBackgroundColor);
        getProgressDownloadDrawable().b(iconBackgroundColor);
        ShapeDrawable shapeDrawable = this.l;
        shapeDrawable.getPaint().setColor(getBorderColor());
        shapeDrawable.invalidateSelf();
        wti wtiVar = this.o;
        wtiVar.invalidate();
        boolean z2 = v0iVar.d;
        u35 u35Var = this.r;
        if (!z2) {
            u35Var.setTextColor$message_list(-1);
            u35Var.setDateViewStatusColor(-1);
            a8gVar.h(this);
            wtiVar.setTextColor(-1);
        }
        u35Var.setBackgroundColor(kbcVar.t().b);
        boolean z3 = this.E;
        vbf vbfVarF = kbcVar.f();
        v(z3 ? (xac) vbfVarF.a : (xac) vbfVarF.b);
        fea transcriptionBackground = getTranscriptionBackground();
        int[] iArr = ((xac) a8gVar.h(this).f().a).a.n.a;
        eea eeaVar = transcriptionBackground.p;
        zv8[] zv8VarArr = fea.v;
        eeaVar.B(transcriptionBackground, zv8VarArr[0], iArr);
        transcriptionBackground.q.B(transcriptionBackground, zv8VarArr[1], ((xac) a8gVar.h(this).f().b).a.n.a);
        transcriptionBackground.invalidateSelf();
        eu9 mediaControlDrawable = getMediaControlDrawable();
        a8gVar.h(this);
        mediaControlDrawable.c(-1);
        eu9 mediaControlDrawable2 = getMediaControlDrawable();
        mediaControlDrawable2.t.B(mediaControlDrawable2, eu9.u[0], Integer.valueOf(a8gVar.h(this).b().g));
        invalidate();
    }

    public final void Z() {
        oxi model = getModel();
        if (model != null) {
            this.a.invoke(new mna(model.a, model));
        }
    }

    @Override // defpackage.p1i
    public final void a() {
        float f;
        int iL0;
        int iV;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (this.r1 == null) {
            return;
        }
        yab.e(this, getTranscriptionView(), -1);
        yab.e(this, getAudioWaveView(), -1);
        AnimatorSet animatorSet = this.n1;
        final int i = 1;
        if (animatorSet != null && animatorSet.isRunning()) {
            gm0.n(this.i, "animateExpandView: expandingTranscriptionAnimation isRunning");
            return;
        }
        v0i v0iVar = this.g;
        ylc ylcVar = v0iVar.d ? new ylc(fValueOf2, fValueOf) : new ylc(fValueOf, fValueOf2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        Number number = (Number) ylcVar.a;
        float fFloatValue = number.floatValue();
        Number number2 = (Number) ylcVar.b;
        final int i2 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, number2.floatValue());
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(getFadeInterpolator());
        valueAnimatorOfFloat.setStartDelay(!v0iVar.d ? 200L : 0L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wyi
            public final /* synthetic */ izi b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                izi iziVar = this.b;
                switch (i3) {
                    case 0:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float fC = lk.c(0, fFloatValue2, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        u35 u35Var = iziVar.r;
                        float f2 = -fC;
                        u35Var.setTranslationY(f2);
                        u35Var.setTranslationX(f2);
                        float f3 = 1.0f - (fFloatValue2 * 1.0f);
                        u35Var.setAlpha(f3);
                        wti wtiVar = iziVar.o;
                        wtiVar.setTranslationY(f2);
                        wtiVar.setAlpha(f3);
                        View viewR = iziVar.g.R();
                        if (viewR != null) {
                            viewR.setTranslationX(f2);
                            viewR.setAlpha(f3);
                        }
                        View viewR2 = iziVar.b.R();
                        if (viewR2 != null) {
                            viewR2.setAlpha(f3);
                        }
                        View viewR3 = iziVar.c.R();
                        if (viewR3 != null) {
                            viewR3.setAlpha(f3);
                        }
                        break;
                    default:
                        izi.l(iziVar, valueAnimator);
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ezi(this, 3));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(number.floatValue(), number2.floatValue());
        valueAnimatorOfFloat2.setStartDelay(v0iVar.d ? 100L : 0L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(getFadeInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: wyi
            public final /* synthetic */ izi b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i;
                izi iziVar = this.b;
                switch (i3) {
                    case 0:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float fC = lk.c(0, fFloatValue2, gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        u35 u35Var = iziVar.r;
                        float f2 = -fC;
                        u35Var.setTranslationY(f2);
                        u35Var.setTranslationX(f2);
                        float f3 = 1.0f - (fFloatValue2 * 1.0f);
                        u35Var.setAlpha(f3);
                        wti wtiVar = iziVar.o;
                        wtiVar.setTranslationY(f2);
                        wtiVar.setAlpha(f3);
                        View viewR = iziVar.g.R();
                        if (viewR != null) {
                            viewR.setTranslationX(f2);
                            viewR.setAlpha(f3);
                        }
                        View viewR2 = iziVar.b.R();
                        if (viewR2 != null) {
                            viewR2.setAlpha(f3);
                        }
                        View viewR3 = iziVar.c.R();
                        if (viewR3 != null) {
                            viewR3.setAlpha(f3);
                        }
                        break;
                    default:
                        izi.l(iziVar, valueAnimator);
                        break;
                }
            }
        });
        if (v0iVar.d) {
            valueAnimatorOfFloat2.addListener(new ezi(this, 2));
        }
        valueAnimatorOfFloat2.addListener(new ezi(this, 1));
        int iT = T();
        final int iX = X();
        final float f2 = iT / 2.0f;
        final float f3 = yl5.d().getDisplayMetrics().density * 16.0f;
        final int collapsedPreviewTop = getCollapsedPreviewTop();
        final int i3 = collapsedPreviewTop + iX;
        final int iV2 = V();
        final int iU = U();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(number.floatValue(), number2.floatValue());
        valueAnimatorOfFloat3.setDuration(400L);
        valueAnimatorOfFloat3.setInterpolator(getExpandInterpolator());
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zyi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                izi.i(f2, f3, i3, iV2, collapsedPreviewTop, iX, iU, this, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new u5e(this, f3, 2));
        int iT2 = T();
        final int measuredWidth = getMeasuredWidth();
        boolean z = v0iVar.d;
        gia giaVar = this.c;
        wti wtiVar = this.o;
        u35 u35Var = this.r;
        p6e p6eVar = this.b;
        if (z) {
            iL0 = W();
            f = 8.0f;
        } else {
            int iX2 = X();
            int measuredWidth2 = u35Var.getMeasuredWidth();
            int measuredWidth3 = wtiVar.getMeasuredWidth();
            f = 8.0f;
            int iL = n7j.o((ny8) giaVar.b) ? giaVar.L() : 0;
            int iL2 = n7j.o((ny8) p6eVar.b) ? p6eVar.L() : 0;
            i24 i24Var = this.f;
            int iL3 = n7j.o((ny8) i24Var.b) ? i24Var.L() : 0;
            vyf vyfVar = this.h;
            int iL4 = n7j.o((ny8) vyfVar.b) ? vyfVar.L() : 0;
            int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            int iMax = Math.max(iL4 > 0 ? iL4 + iK : 0, iL3 > 0 ? iK + iL3 : 0);
            iL0 = e9i.l0(iX2 + iMax, measuredWidth2 + measuredWidth3 + iMax, iL, iL2);
        }
        Integer num = this.u1;
        int iIntValue = num != null ? num.intValue() : measuredWidth;
        int iU2 = v0iVar.d ? U() : iT2;
        int iX3 = v0iVar.d ? X() : gm0.K(yl5.d().getDisplayMetrics().density * 44.0f);
        final int iK2 = v0iVar.d ? gm0.K(44.0f * yl5.d().getDisplayMetrics().density) : X();
        final int i4 = iL0;
        final int measuredHeight = getMeasuredHeight();
        final int i5 = iIntValue;
        if (v0iVar.d) {
            iV = V();
        } else {
            int iX4 = X();
            boolean z2 = this.F;
            boolean zC = u35Var.c();
            boolean zO = n7j.o((ny8) giaVar.b);
            int iK3 = giaVar.K();
            int measuredHeight2 = u35Var.getMeasuredHeight();
            int measuredHeight3 = wtiVar.getMeasuredHeight();
            boolean zO2 = n7j.o((ny8) p6eVar.b);
            int iK4 = p6eVar.K();
            int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
            int iK6 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
            int iK7 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
            int iK8 = gm0.K(yl5.d().getDisplayMetrics().density * f);
            int iK9 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
            int iK10 = gm0.K(yl5.d().getDisplayMetrics().density * f);
            int i6 = iX4 + iK5;
            if (zO) {
                i6 = (iK7 * 2) + iK3 + i6;
                if (z2) {
                    i6 += iK8;
                }
            }
            int iMax2 = Math.max(measuredHeight2 + (z2 ? iK9 * 2 : 0), measuredHeight3) + i6;
            if (zC) {
                iMax2 += iK7 * 2;
            }
            iV = zO2 ? iK6 + iK4 + iK10 + iMax2 : iMax2;
        }
        final int iK11 = v0iVar.d ? 0 : gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int iK12 = v0iVar.d ? gm0.K(10.0f * yl5.d().getDisplayMetrics().density) : 0;
        int collapsedPreviewTop2 = v0iVar.d ? getCollapsedPreviewTop() : getExpandedPreviewTop();
        int expandedPreviewTop = v0iVar.d ? getExpandedPreviewTop() : getCollapsedPreviewTop();
        final int i7 = iV;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int i8 = iX3;
        valueAnimatorOfFloat4.setDuration(400L);
        valueAnimatorOfFloat4.setInterpolator(getExpandInterpolator());
        final int i9 = collapsedPreviewTop2;
        final int i10 = iU2;
        final int i11 = expandedPreviewTop;
        final int i12 = iK12;
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: azi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                izi.d(measuredWidth, i4, measuredHeight, i7, i5, i10, this, iK11, i12, i9, i11, i8, iK2, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new ezi(this, 4));
        valueAnimatorOfFloat4.addListener(new fzi(this, i4, i7, i10, iK2));
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        animatorSet2.addListener(new ezi(this, 0));
        animatorSet2.start();
        this.n1 = animatorSet2;
    }

    public final void a0() {
        oxi model;
        if (getDurationSlider().o || (model = getModel()) == null) {
            return;
        }
        this.a.invoke(new nna(model.a, model));
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.h.b(i);
    }

    public final void b0(float f, boolean z) {
        oxi model = getModel();
        if (model != null) {
            this.a.invoke(new ona(model.a, model, f, z));
        }
    }

    public final void d0(float f) {
        t58 t58Var = this.n;
        Drawable overlayDrawable = t58Var.getOverlayDrawable();
        bzi bziVar = overlayDrawable instanceof bzi ? (bzi) overlayDrawable : null;
        Drawable drawable = bziVar != null ? bziVar.getDrawable(1) : null;
        if (!(drawable instanceof v50)) {
            t58Var.setOverlayDrawable(getProgressDownloadDrawable());
            drawable = t58Var.getOverlayDrawable();
        }
        if (drawable != null) {
            int i = (int) ((f / 100.0f) * 10000.0f);
            if (i > 10000) {
                i = 10000;
            }
            drawable.setLevel(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path backgroundPath = getBackgroundPath();
        int iSave = canvas.save();
        canvas.clipPath(backgroundPath);
        try {
            getTranscriptionBackground().draw(canvas);
            canvas.restoreToCount(iSave);
            super.dispatchDraw(canvas);
            this.l.draw(canvas);
            if (getCanDrawMuteIcon()) {
                Rect rect = this.t;
                bzi bziVar = this.u;
                bziVar.setBounds(rect);
                bziVar.draw(canvas);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.r.d(charSequence, z);
    }

    public final void e0(boolean z) {
        int i;
        a8g a8gVar = pq3.j;
        wac wacVar = f55.g(a8gVar.h(this).f(), this.E).b;
        u35 u35Var = this.r;
        u35Var.setBackgroundEnabled$message_list(!z);
        int i2 = -1;
        if (z) {
            i = wacVar.g;
        } else {
            a8gVar.h(u35Var);
            i = -1;
        }
        u35Var.setTextColor$message_list(i);
        if (z) {
            i2 = wacVar.g;
        } else {
            a8gVar.h(u35Var);
        }
        u35Var.setDateViewStatusColor(i2);
        u35Var.requestLayout();
    }

    @Override // defpackage.q1i
    public final void f(int i) {
        this.g.f(i);
    }

    public final void f0(h50 h50Var) {
        oxi model = getModel();
        if (!cqk.d(model != null ? Long.valueOf(model.a) : null, h50Var != null ? Long.valueOf(h50Var.b()) : null) || h50Var == null) {
            return;
        }
        if (h50Var instanceof c50) {
            d0(((c50) h50Var).b);
            return;
        }
        if (h50Var instanceof g50) {
            d0(((g50) h50Var).b);
            return;
        }
        boolean z = h50Var instanceof d50;
        t58 t58Var = this.n;
        if (z) {
            t58Var.setOverlayDrawable(getNeedDownloadDrawable());
        } else if (h50Var instanceof f50) {
            t58Var.setOverlayDrawable(this.g.d ? getMediaControlDrawable() : null);
        } else {
            if (h50Var instanceof e50) {
                return;
            }
            ore.o();
        }
    }

    public final void g0(boolean z) {
        int i;
        a8g a8gVar = pq3.j;
        xac xacVarG = f55.g(a8gVar.h(this).f(), this.E);
        wti wtiVar = this.o;
        wtiVar.setBackgroundEnabled(!z);
        if (z) {
            i = xacVarG.b.b;
        } else {
            a8gVar.h(wtiVar);
            i = -1;
        }
        wtiVar.setTextColor(i);
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    @Override // defpackage.q1i
    public Point getPosition() {
        return this.g.getPosition();
    }

    @Override // defpackage.z5j
    public View getPreviewView() {
        return this.n;
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.f.h(i);
    }

    public final void h0(boolean z) {
        float f;
        float f2;
        if (z) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 44.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 52.0f;
        }
        int iK = gm0.K(f2 * f);
        bzi needDownloadDrawable = getNeedDownloadDrawable();
        needDownloadDrawable.setLayerSize(0, iK, iK);
        needDownloadDrawable.setLayerGravity(0, 17);
        needDownloadDrawable.invalidateSelf();
        bzi progressDownloadDrawable = getProgressDownloadDrawable();
        progressDownloadDrawable.setLayerSize(0, iK, iK);
        progressDownloadDrawable.setLayerGravity(0, 17);
        progressDownloadDrawable.invalidateSelf();
        int iconBackgroundColor = z ? pq3.j.h(this).b().g : getIconBackgroundColor();
        getNeedDownloadDrawable().b(iconBackgroundColor);
        getProgressDownloadDrawable().b(iconBackgroundColor);
    }

    public final void i0(boolean z) {
        boolean z2 = (z || this.E) ? false : true;
        p6e p6eVar = this.b;
        p6eVar.g = z2;
        p6eVar.G(f55.g(pq3.j.h(this).f(), this.E), z);
    }

    public final void j0(oxi oxiVar) {
        l1j l1jVarE = oxiVar.e();
        if (l1jVarE == null || l1jVarE.b != oxiVar.a) {
            ValueAnimator valueAnimator = this.K;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.x1 = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
            requestLayout();
        }
        setModel(oxiVar);
        if (isAttachedToWindow()) {
            Q();
        }
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.f.k();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.b.m(z);
    }

    @Override // defpackage.z5j
    public final boolean n() {
        return this.e.n();
    }

    @Override // defpackage.k24
    public final void o() {
        this.f.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.n1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.n1 = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q1j q1jVar = this.m;
        Region region = (Region) q1jVar.d;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Region region2 = (Region) q1jVar.e;
        if (region2.isEmpty() || region.isEmpty() || region2.contains(x, y) || !region.contains(x, y)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int iG;
        int measuredHeight;
        boolean z2 = this.F;
        wti wtiVar = this.o;
        ShapeDrawable shapeDrawable = this.l;
        gia giaVar = this.c;
        t58 t58Var = this.n;
        p6e p6eVar = this.b;
        v0i v0iVar = this.g;
        vyf vyfVar = this.h;
        i24 i24Var = this.f;
        q1j q1jVar = this.m;
        u35 u35Var = this.r;
        if (z2) {
            Integer num = this.u1;
            int iIntValue = num != null ? num.intValue() : U();
            int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            if (n7j.o((ny8) giaVar.b)) {
                int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
                giaVar.T(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), iK2);
                iK = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iK2);
            }
            Integer num2 = this.p1;
            int iIntValue2 = num2 != null ? num2.intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
            Integer num3 = this.q1;
            qyj.M(t58Var, iIntValue2, num3 != null ? num3.intValue() : iK, 0, 12);
            shapeDrawable.setBounds(0, 0, 0, 0);
            q1jVar.a(t58Var);
            if (n7j.o((ny8) v0iVar.b)) {
                v0iVar.T((iIntValue - v0iVar.L()) - gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), iK);
                View viewR = v0iVar.R();
                if (viewR != null) {
                    getTranscriptionButtonClickArea().set(viewR.getLeft(), viewR.getTop(), viewR.getRight(), viewR.getBottom());
                }
            }
            qyj.M(getAudioWaveView(), t58Var.getMeasuredWidth() + zo5.b(2.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f)), iK, 0, 12);
            qyj.M(getTranscriptionView(), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), zo5.b(2.0f, yl5.d().getDisplayMetrics().density, t58Var.getBottom()), 0, 12);
            int bottom = getTranscriptionView().getBottom();
            int i5 = (int) getBackgroundRect().right;
            AnimatorSet animatorSet = this.n1;
            if (animatorSet == null || !animatorSet.isRunning() || i5 <= 0) {
                i5 = iIntValue;
            }
            if (n7j.o((ny8) vyfVar.b)) {
                f = 6.0f;
                vyfVar.T(i5, zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
                iG = bc1.g(6.0f, yl5.d().getDisplayMetrics().density, 2, vyfVar.K());
            } else {
                f = 6.0f;
                iG = 0;
            }
            if (n7j.o((ny8) i24Var.b)) {
                i24Var.T(zo5.b(f, yl5.d().getDisplayMetrics().density, i5), (getMeasuredHeight() - iG) - i24Var.K());
            }
            if (n7j.o((ny8) p6eVar.b)) {
                if (!n7j.o((ny8) i24Var.b)) {
                    bottom = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, bottom);
                }
                p6eVar.T(gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), bottom);
                bottom += p6eVar.K();
            }
            qyj.M(u35Var, zo5.D(10.0f, yl5.d().getDisplayMetrics().density, iIntValue - u35Var.getMeasuredWidth()), bottom, 0, 12);
            qyj.M(wtiVar, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, t58Var.getRight()), t58Var.getBottom() - wtiVar.getMeasuredHeight(), 0, 12);
            return;
        }
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        if (n7j.o((ny8) giaVar.b)) {
            int iB = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, iK3);
            giaVar.T(this.E ? 0 : getMeasuredWidth() - giaVar.L(), iB);
            iK3 = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, giaVar.K(), iB);
        }
        Integer num4 = this.p1;
        int iIntValue3 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.q1;
        qyj.M(t58Var, iIntValue3, num5 != null ? num5.intValue() : iK3, 0, 12);
        if (n7j.o((ny8) v0iVar.b)) {
            v0iVar.T(t58Var.getMeasuredWidth() - v0iVar.L(), iK3);
            View viewR2 = v0iVar.R();
            if (viewR2 != null) {
                getTranscriptionButtonClickArea().set(viewR2.getLeft(), viewR2.getTop(), viewR2.getRight(), viewR2.getBottom());
            }
        }
        if (getCanDrawMuteIcon()) {
            int measuredWidth = (t58Var.getMeasuredWidth() / 2) + t58Var.getLeft();
            bzi bziVar = this.u;
            int intrinsicWidth = measuredWidth - (bziVar.getIntrinsicWidth() / 2);
            int iD = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, t58Var.getBottom() - bziVar.getIntrinsicHeight());
            this.t.set(intrinsicWidth, iD, bziVar.getIntrinsicWidth() + intrinsicWidth, bziVar.getIntrinsicHeight() + iD);
        }
        ny8 ny8Var = this.y;
        if (ny8Var.d()) {
            qyj.M((pyi) ny8Var.getValue(), 0, iK3, 0, 12);
        }
        vvi vviVar = this.e;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.T(0, iK3);
            View viewR3 = vviVar.R();
            if (viewR3 != null) {
                q1jVar.a(viewR3);
            }
        } else {
            ((Region) q1jVar.e).setEmpty();
            ((Region) q1jVar.d).setEmpty();
            q1jVar.a = -1;
            q1jVar.b = -1;
        }
        int x = (int) t58Var.getX();
        int y = (int) t58Var.getY();
        shapeDrawable.setBounds(x, y, t58Var.getMeasuredWidth() + x, t58Var.getMeasuredHeight() + y);
        if (n7j.o((ny8) p6eVar.b)) {
            measuredHeight = zo5.D(10.0f, yl5.d().getDisplayMetrics().density, zo5.D(8.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - p6eVar.K()));
        } else {
            measuredHeight = getMeasuredHeight();
        }
        int measuredWidth2 = t58Var.getMeasuredWidth() - u35Var.getMeasuredWidth();
        int measuredHeight2 = measuredHeight - u35Var.getMeasuredHeight();
        int i6 = this.z;
        qyj.M(u35Var, measuredWidth2, measuredHeight2 - i6, 0, 12);
        qyj.M(wtiVar, 0, (measuredHeight - wtiVar.getMeasuredHeight()) - i6, 0, 12);
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.T(p6eVar.g ? getMeasuredWidth() - p6eVar.L() : 0, zo5.b(10.0f, yl5.d().getDisplayMetrics().density, measuredHeight));
        }
        int iJ = (int) getBackgroundRect().right;
        AnimatorSet animatorSet2 = this.n1;
        if (animatorSet2 == null || !animatorSet2.isRunning() || iJ <= 0) {
            iJ = yab.J(t58Var);
        }
        int iK4 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(iJ, ((measuredHeight - vyfVar.K()) - i6) - gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
            iK4 = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, vyfVar.K(), iK4);
        }
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, iJ), ((measuredHeight - i24Var.K()) - i6) - iK4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iW;
        int iMax;
        Integer num;
        AnimatorSet animatorSet;
        this.v1 = View.MeasureSpec.getSize(i);
        Integer num2 = this.s1;
        boolean z = (num2 == null || (animatorSet = this.n1) == null || !animatorSet.isRunning()) ? false : true;
        v0i v0iVar = this.g;
        if (z) {
            iW = num2.intValue();
        } else if (getDependOnOutsideView()) {
            iW = View.MeasureSpec.getSize(i);
        } else {
            iW = v0iVar.d ? W() : r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        }
        int iMax2 = (getDependOnOutsideView() || z) ? iW : 0;
        boolean z2 = v0iVar.d;
        ny8 ny8Var = (ny8) v0iVar.b;
        int iK = z2 ? gm0.K(12.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        gia giaVar = this.c;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iW, Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, giaVar.L());
            iK += giaVar.K() + (v0iVar.d ? gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) : c0a.d(4.0f, yl5.d().getDisplayMetrics().density, 2));
        }
        u35 u35Var = this.r;
        u35Var.measure(i, i2);
        wti wtiVar = this.o;
        wtiVar.measure(i, i2);
        vyf vyfVar = this.h;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(iW, Integer.MIN_VALUE), i2);
        }
        i24 i24Var = this.f;
        ny8 ny8Var2 = (ny8) i24Var.b;
        ny8 ny8Var3 = (ny8) i24Var.b;
        if (n7j.o(ny8Var2)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iW, Integer.MIN_VALUE), i2);
        }
        float f = 2.0f;
        if (v0iVar.d) {
            iMax = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight(), iK);
            f = 2.0f;
        } else {
            iMax = Math.max(u35Var.getMeasuredHeight(), wtiVar.getMeasuredHeight()) + iK + (u35Var.c() ? c0a.d(4.0f, yl5.d().getDisplayMetrics().density, 2) : 0);
        }
        int i3 = this.x1;
        int iIntValue = ((v0iVar.d || z) && (num = this.o1) != null) ? num.intValue() : i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824);
        t58 t58Var = this.n;
        t58Var.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredHeight = t58Var.getMeasuredHeight() + iMax;
        int iMax3 = Math.max(iMax2, Math.max(t58Var.getMeasuredWidth(), wtiVar.getMeasuredWidth() + u35Var.getMeasuredWidth()));
        ny8 ny8Var4 = this.y;
        if (ny8Var4.d()) {
            ((pyi) ny8Var4.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        int iMax4 = Math.max((!n7j.o((ny8) vyfVar.b) || v0iVar.d) ? 0 : vyfVar.L() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), (!n7j.o(ny8Var3) || v0iVar.d) ? 0 : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) + i24Var.L());
        int iMax5 = Math.max(iMax3, Math.max(t58Var.getMeasuredWidth() + iMax4, wtiVar.getMeasuredWidth() + u35Var.getMeasuredWidth() + iMax4));
        if (v0iVar.d && n7j.o(ny8Var3)) {
            iMax5 = Math.max(iMax5, W());
        }
        if (n7j.o(ny8Var)) {
            v0iVar.U(qv1.a(36.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(28.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        }
        if (n7j.o(ny8Var) && getAudioWaveView().getVisibility() == 0) {
            getAudioWaveView().measure(View.MeasureSpec.makeMeasureSpec(zo5.D(44.0f, yl5.d().getDisplayMetrics().density, r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, U()) - v0iVar.L()) - (gm0.K(yl5.d().getDisplayMetrics().density * f) * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 1073741824));
        }
        if (n7j.o(ny8Var) && getTranscriptionView().getVisibility() == 0) {
            Layout layout = this.r1;
            getTranscriptionView().measure(View.MeasureSpec.makeMeasureSpec(iW - (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2), 1073741824), View.MeasureSpec.makeMeasureSpec(layout != null ? zo5.b(8.0f, yl5.d().getDisplayMetrics().density, layout.getHeight()) : 0, 1073741824));
            iMax5 = Math.max(iMax5, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + getTranscriptionView().getMeasuredWidth());
            measuredHeight = c0a.e(f, yl5.d().getDisplayMetrics().density, getTranscriptionView().getMeasuredHeight(), measuredHeight);
        }
        vvi vviVar = this.e;
        if (n7j.o((ny8) vviVar.b)) {
            vviVar.U(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        p6e p6eVar = this.b;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iW, Integer.MIN_VALUE), i2);
            iMax5 = Math.max(iMax5, p6eVar.L());
            measuredHeight = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), measuredHeight);
            if (!v0iVar.d) {
                measuredHeight = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, measuredHeight);
            }
        }
        Integer num3 = this.t1;
        AnimatorSet animatorSet2 = this.n1;
        if (animatorSet2 != null && animatorSet2.isRunning() && num2 != 0 && num3 != null) {
            iMax5 = num2.intValue();
            measuredHeight = num3.intValue();
        }
        AnimatorSet animatorSet3 = this.n1;
        if (animatorSet3 == null || !animatorSet3.isRunning()) {
            if (v0iVar.d) {
                int iU = U();
                this.u1 = Integer.valueOf(iU);
                getTranscriptionBackground().setBounds(0, 0, iU, measuredHeight);
                Path backgroundPath = getBackgroundPath();
                backgroundPath.reset();
                getBackgroundRect().set(0.0f, 0.0f, iU, measuredHeight);
                backgroundPath.addRoundRect(getBackgroundRect(), yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 16.0f, Path.Direction.CW);
            } else {
                this.u1 = null;
                getBackgroundPath().reset();
                getBackgroundRect().set(0.0f, 0.0f, 0.0f, 0.0f);
                getTranscriptionBackground().setBounds(0, 0, 0, 0);
            }
        }
        setMeasuredDimension(iMax5, measuredHeight);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.e.J();
        int i = this.x1;
        int iK = gm0.K(228.0f * yl5.d().getDisplayMetrics().density);
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iK);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new m11(5, this));
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addListener(new s0i(4));
        valueAnimatorOfInt.start();
        this.K = valueAnimatorOfInt;
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View viewR;
        boolean zContains = getTranscriptionButtonClickArea().contains((int) motionEvent.getX(), (int) motionEvent.getY());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.w1 = zContains;
            return zContains;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.w1 = false;
            }
            return false;
        }
        if (this.w1 && zContains && (viewR = this.g.R()) != null) {
            viewR.performClick();
        }
        this.w1 = false;
        return true;
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.c.p(xacVar);
    }

    @Override // defpackage.q1i
    public final boolean q() {
        return this.g.d;
    }

    @Override // defpackage.z5j
    public final void s(boolean z) {
        this.e.s(true);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.b.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.f.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.r.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.r.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.d.a = z;
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
        this.r.setChannelMode$message_list(z);
    }

    public void setIsExpanded(boolean z) {
        this.g.d = z;
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
        this.f.d = af7Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.h.c = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.c.c = qf7Var;
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.h.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.b.g = z;
    }

    @Override // defpackage.z5j
    public void setVideoClickListener(qf7 qf7Var) {
        this.e.c = qf7Var;
    }

    @Override // defpackage.z5j
    public void setVideoLongClickListener(qf7 qf7Var) {
        this.e.d = qf7Var;
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.f.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.h.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.b.x(kjaVar, z);
    }

    @Override // defpackage.z5j
    public final boolean z() {
        this.e.getClass();
        return false;
    }
}
