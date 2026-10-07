package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wr6 extends gnh {
    public static final /* synthetic */ zv8[] q1;
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ShapeDrawable D;
    public final ny8 E;
    public final ny8 F;
    public final ny8 G;
    public final ny8 H;
    public final ny8 I;
    public final l1c J;
    public final TextView K;
    public Layout n1;
    public final int o1;
    public final int p1;
    public int s;
    public final ny8 t;
    public boolean u;
    public boolean v;
    public ga0 w;
    public sgg x;
    public final zb y;
    public final Rect z;

    static {
        z8b z8bVar = new z8b(wr6.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;");
        zfe.a.getClass();
        q1 = new zv8[]{z8bVar};
    }

    public wr6(final Context context) {
        super(context);
        a8g a8gVar = pq3.j;
        a8gVar.h(this);
        this.s = ((xac) a8gVar.h(this).f().a).c.g;
        final int i = 3;
        this.t = rx8.P(3, new n52(context, 9));
        this.y = new zb(this, 14);
        this.z = new Rect();
        final int i2 = 0;
        this.A = rx8.P(3, new af7(this) { // from class: ur6
            public final /* synthetic */ wr6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                wr6 wr6Var = this.b;
                switch (i3) {
                    case 0:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_download).mutate();
                    case 1:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    default:
                        return wr6.M(wr6Var);
                }
            }
        });
        final int i3 = 1;
        this.B = rx8.P(3, new af7(this) { // from class: ur6
            public final /* synthetic */ wr6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                wr6 wr6Var = this.b;
                switch (i4) {
                    case 0:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_download).mutate();
                    case 1:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    default:
                        return wr6.M(wr6Var);
                }
            }
        });
        final int i4 = 2;
        this.C = rx8.P(3, new af7(this) { // from class: ur6
            public final /* synthetic */ wr6 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                wr6 wr6Var = this.b;
                switch (i5) {
                    case 0:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_download).mutate();
                    case 1:
                        return wr6Var.getContext().getDrawable(R.drawable.icon_play_fill).mutate();
                    default:
                        return wr6.M(wr6Var);
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.D = shapeDrawable;
        this.E = rx8.P(3, new af7() { // from class: vr6
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                wr6 wr6Var = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        wq6 wq6Var = new wq6(context2);
                        wr6Var.addView(wq6Var);
                        return wq6Var;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
                        imageView.setBackground(wr6Var.D);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        wr6Var.addView(imageView);
                        return imageView;
                    case 2:
                        t58 t58Var = new t58(context2);
                        wr6Var.addView(t58Var);
                        return t58Var;
                    default:
                        wti wtiVar = new wti(context2);
                        wtiVar.setBackgroundEnabled(true);
                        wr6Var.addView(wtiVar);
                        return wtiVar;
                }
            }
        });
        this.F = rx8.P(3, new af7() { // from class: vr6
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i3;
                wr6 wr6Var = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        wq6 wq6Var = new wq6(context2);
                        wr6Var.addView(wq6Var);
                        return wq6Var;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
                        imageView.setBackground(wr6Var.D);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        wr6Var.addView(imageView);
                        return imageView;
                    case 2:
                        t58 t58Var = new t58(context2);
                        wr6Var.addView(t58Var);
                        return t58Var;
                    default:
                        wti wtiVar = new wti(context2);
                        wtiVar.setBackgroundEnabled(true);
                        wr6Var.addView(wtiVar);
                        return wtiVar;
                }
            }
        });
        this.G = rx8.P(3, new af7() { // from class: vr6
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                wr6 wr6Var = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        wq6 wq6Var = new wq6(context2);
                        wr6Var.addView(wq6Var);
                        return wq6Var;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
                        imageView.setBackground(wr6Var.D);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        wr6Var.addView(imageView);
                        return imageView;
                    case 2:
                        t58 t58Var = new t58(context2);
                        wr6Var.addView(t58Var);
                        return t58Var;
                    default:
                        wti wtiVar = new wti(context2);
                        wtiVar.setBackgroundEnabled(true);
                        wr6Var.addView(wtiVar);
                        return wtiVar;
                }
            }
        });
        this.H = rx8.P(3, new af7() { // from class: vr6
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i;
                wr6 wr6Var = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        wq6 wq6Var = new wq6(context2);
                        wr6Var.addView(wq6Var);
                        return wq6Var;
                    case 1:
                        ImageView imageView = new ImageView(context2);
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density)));
                        imageView.setBackground(wr6Var.D);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        wr6Var.addView(imageView);
                        return imageView;
                    case 2:
                        t58 t58Var = new t58(context2);
                        wr6Var.addView(t58Var);
                        return t58Var;
                    default:
                        wti wtiVar = new wti(context2);
                        wtiVar.setBackgroundEnabled(true);
                        wr6Var.addView(wtiVar);
                        return wtiVar;
                }
            }
        });
        this.I = rx8.P(3, new s35(28));
        l1c l1cVar = new l1c(context);
        this.J = l1cVar;
        TextView textView = new TextView(context);
        q9i.a(q9i.t.h(), textView);
        textView.setMaxLines(1);
        this.K = textView;
        this.o1 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        this.p1 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(l1cVar, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = a8gVar.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static Drawable M(wr6 wr6Var) {
        int previewActionIconColor = wr6Var.getPreviewActionIconColor();
        Drawable drawableMutate = wr6Var.getContext().getDrawable(R.drawable.icon_cross).mutate();
        sb8.m0(previewActionIconColor, drawableMutate);
        return drawableMutate;
    }

    public static final void N(wr6 wr6Var, boolean z) {
        aq6 model = wr6Var.getModel();
        if (model == null) {
            return;
        }
        r8e r8eVar = model.m;
        gjg gjgVar = r8eVar.a;
        wr6Var.n1 = model.f;
        wr6Var.setSubtitle(((h50) gjgVar.getValue()).c());
        wr6Var.setPreview(model);
        boolean z2 = !z;
        ny8 ny8Var = wr6Var.F;
        dka messageTextView$message_list = wr6Var.getMessageTextView$message_list();
        boolean z3 = model.l;
        zp6 zp6Var = model.g;
        messageTextView$message_list.setVisibility(z3 ? 0 : 8);
        h50 h50Var = (h50) gjgVar.getValue();
        if (wr6Var.v) {
            ny8 ny8Var2 = wr6Var.E;
            if (ny8Var2.d()) {
                ((wq6) ny8Var2.getValue()).setVisibility(8);
            }
            wr6Var.getBigPreviewActionIcon().setVisibility(0);
            if (r8eVar.a.getValue() instanceof d50) {
                wr6Var.S(ny8Var);
                return;
            } else if (r8eVar.a.getValue() instanceof f50) {
                wr6Var.Q(ny8Var);
                return;
            } else {
                if (h50Var instanceof c50) {
                    wr6Var.R(ny8Var, ((c50) h50Var).b);
                    return;
                }
                return;
            }
        }
        if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = wr6Var.G;
        if (ny8Var3.d()) {
            ((t58) ny8Var3.getValue()).setVisibility(8);
        }
        wr6Var.J.setVisibility(8);
        wr6Var.getActionIconView().setVisibility(0);
        if (r8eVar.a.getValue() instanceof d50) {
            wr6Var.getActionIconView().c(zp6Var, z2);
            return;
        }
        if (r8eVar.a.getValue() instanceof f50) {
            wr6Var.getActionIconView().a(zp6Var, z2);
            return;
        }
        if (h50Var instanceof g50) {
            wr6Var.getActionIconView().b(zp6Var, ((g50) h50Var).b, z2);
            return;
        }
        wq6 actionIconView = wr6Var.getActionIconView();
        jr6 jr6Var = actionIconView.d;
        jr6Var.a(zp6Var);
        zp6 zp6Var2 = jr6Var.c;
        if (zp6Var2 == null) {
            return;
        }
        int iZ = oc9.Z(zp6Var2.h().d, pq3.j.h(actionIconView));
        actionIconView.c.d(iZ, iZ);
    }

    private final wq6 getActionIconView() {
        return (wq6) this.E.getValue();
    }

    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.F.getValue();
    }

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.t.getValue();
    }

    private final nt4 getCornersOutlineProvider() {
        return (nt4) this.I.getValue();
    }

    private final aq6 getModel() {
        zv8 zv8Var = q1[0];
        return (aq6) this.y.b;
    }

    private final int getPreviewActionIconBackgroundColor() {
        return pq3.j.h(this).h().i;
    }

    private final int getPreviewActionIconColor() {
        pq3.j.h(this);
        return -1;
    }

    private final void setModel(aq6 aq6Var) {
        this.y.B(this, q1[0], aq6Var);
    }

    private final void setPreview(aq6 aq6Var) {
        g58 g58Var = aq6Var.j;
        fti ftiVar = aq6Var.k;
        if (g58Var == null) {
            g58Var = ftiVar != null ? new g58(0L, ftiVar.b, ftiVar.c, ftiVar.d, false, ftiVar.e, false, ftiVar.i, null, null, null, null, 0L, 0L, 32512) : null;
        }
        ny8 ny8Var = this.H;
        ((View) ny8Var.getValue()).setVisibility(aq6Var.i == 2 ? 0 : 8);
        if (n7j.o(ny8Var)) {
            wti wtiVar = (wti) ny8Var.getValue();
            if (ftiVar != null) {
                long jG = ew5.g(ftiVar.f);
                String[] strArr = woh.b;
                wtiVar.setContent(mxl.a(jG));
            }
        }
        l1c l1cVar = this.J;
        ny8 ny8Var2 = this.G;
        if (g58Var != null) {
            t58 t58Var = (t58) ny8Var2.getValue();
            t58Var.setVisibility(0);
            t58Var.setImageAttach(g58Var);
            zqk.a(l1cVar, g58Var, getBlurPostProcessor(), false);
            return;
        }
        if (n7j.o(ny8Var2)) {
            ((t58) ny8Var2.getValue()).setVisibility(8);
        }
        l1cVar.setVisibility(8);
        this.u = false;
    }

    private final void setSubtitle(ynh ynhVar) {
        if (ynhVar == null) {
            return;
        }
        this.K.setText(ynhVar.b(getContext()));
    }

    public final void O(xac xacVar) {
        TextPaint paint;
        wac wacVar = xacVar.b;
        int i = wacVar.g;
        this.s = xacVar.c.g;
        ny8 ny8Var = this.A;
        boolean zD = ny8Var.d();
        a8g a8gVar = pq3.j;
        if (zD) {
            Drawable drawable = (Drawable) ny8Var.getValue();
            a8gVar.h(this);
            sb8.m0(-1, drawable);
        }
        ny8 ny8Var2 = this.C;
        if (ny8Var2.d()) {
            Drawable drawable2 = (Drawable) ny8Var2.getValue();
            a8gVar.h(this);
            sb8.m0(-1, drawable2);
        }
        Layout layout = this.n1;
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(wacVar.d);
        }
        this.K.setTextColor(wacVar.e);
        ny8 ny8Var3 = this.E;
        if (ny8Var3.d()) {
            wq6 wq6Var = (wq6) ny8Var3.getValue();
            wq6Var.a = xacVar;
            jr6 jr6Var = wq6Var.d;
            jr6Var.onThemeChanged(a8gVar.h(wq6Var));
            zp6 zp6Var = jr6Var.c;
            if (zp6Var != null) {
                int iZ = oc9.Z(zp6Var.h().d, a8gVar.h(wq6Var));
                wq6Var.c.d(iZ, iZ);
            }
        }
        ny8 ny8Var4 = this.F;
        boolean zD2 = ny8Var4.d();
        ShapeDrawable shapeDrawable = this.D;
        if (zD2) {
            ImageView imageView = (ImageView) ny8Var4.getValue();
            if (imageView.getDrawable() instanceof v50) {
                Drawable drawable3 = imageView.getDrawable();
                v50 v50Var = drawable3 instanceof v50 ? (v50) drawable3 : null;
                if (v50Var != null) {
                    v50Var.c(this.s);
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list().setTextColor$message_list(i);
        getDate$message_list().setDateViewStatusColor(i);
        invalidate();
    }

    public final void P() throws IllegalAccessException, InvocationTargetException {
        removeOnAttachStateChangeListener(this.w);
        sgg sggVar = this.x;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.x = null;
        setModel(null);
    }

    public final void Q(ny8 ny8Var) {
        if (ny8Var.d()) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            aq6 model = getModel();
            if ((model != null ? model.i : 0) == 2) {
                Drawable drawable = (Drawable) this.B.getValue();
                sb8.m0(getPreviewActionIconColor(), drawable);
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.D);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
            aq6 model2 = getModel();
            imageView.setVisibility((model2 != null ? model2.i : 0) != 2 ? 8 : 0);
        }
    }

    public final void R(ny8 ny8Var, float f) {
        Drawable drawable = (Drawable) this.C.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) ny8Var.getValue();
        if (!(imageView.getDrawable() instanceof v50)) {
            v50 v50Var = new v50();
            v50Var.a = drawable;
            v50Var.invalidateSelf();
            v50Var.c(previewActionIconColor);
            v50Var.b();
            imageView.setImageDrawable(v50Var);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * 100.0f));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public final void S(ny8 ny8Var) {
        ImageView imageView = (ImageView) ny8Var.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.A.getValue();
        sb8.m0(getPreviewActionIconColor(), drawable);
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.D);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void T(aq6 aq6Var) {
        setModel(aq6Var);
    }

    public final void U(h50 h50Var) {
        aq6 model;
        zp6 zp6Var;
        if (h50Var == null || (model = getModel()) == null || h50Var.b() != model.b) {
            return;
        }
        setSubtitle(h50Var.c());
        boolean z = this.v;
        ny8 ny8Var = this.F;
        if (z) {
            ny8 ny8Var2 = this.E;
            if (ny8Var2.d()) {
                ((wq6) ny8Var2.getValue()).setVisibility(8);
            }
            getBigPreviewActionIcon().setVisibility(0);
            if (h50Var instanceof c50) {
                R(ny8Var, ((c50) h50Var).b);
                return;
            }
            if (h50Var instanceof g50) {
                R(ny8Var, ((g50) h50Var).b);
                return;
            }
            if (h50Var instanceof d50) {
                S(ny8Var);
                return;
            } else if (h50Var instanceof f50) {
                Q(ny8Var);
                return;
            } else {
                if (h50Var instanceof e50) {
                    return;
                }
                ore.o();
                return;
            }
        }
        if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = this.G;
        if (ny8Var3.d()) {
            ((t58) ny8Var3.getValue()).setVisibility(8);
        }
        this.J.setVisibility(8);
        getActionIconView().setVisibility(0);
        aq6 model2 = getModel();
        if (model2 == null || (zp6Var = model2.g) == null) {
            zp6Var = yp6.c;
        }
        if (h50Var instanceof c50) {
            getActionIconView().b(zp6Var, ((c50) h50Var).b, true);
            return;
        }
        if (h50Var instanceof g50) {
            getActionIconView().b(zp6Var, ((g50) h50Var).b, true);
            return;
        }
        if (h50Var instanceof d50) {
            getActionIconView().c(zp6Var, true);
        } else if (h50Var instanceof f50) {
            getActionIconView().a(zp6Var, true);
        } else {
            if (h50Var instanceof e50) {
                return;
            }
            ore.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int contentHorizontalPadding$message_list;
        super.dispatchDraw(canvas);
        Layout layout = this.n1;
        if (layout != null) {
            View viewI = n7j.i(this.E);
            if (viewI != null) {
                contentHorizontalPadding$message_list = getContentHorizontalPadding$message_list() + viewI.getMeasuredWidth();
            } else {
                contentHorizontalPadding$message_list = 0;
            }
            int i = this.o1 + contentHorizontalPadding$message_list;
            float top = this.K.getTop() - layout.getHeight();
            int iSave = canvas.save();
            canvas.translate(i, top);
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.gnh, defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        u35 date$message_list = getDate$message_list();
        zv8[] zv8VarArr = u35.x;
        date$message_list.d(charSequence, false);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x02be  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e8  */
    @Override // defpackage.gnh, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredLayoutHeight;
        int contentHorizontalPadding$message_list;
        int iK;
        int measuredWidth;
        int measuredHeight;
        int measuredWidth2;
        int measuredHeight2;
        int iK2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        int i5 = (int) ((fea) getBackground()).s;
        boolean zO = n7j.o(getSenderNameViewStub$message_list().b);
        int i6 = this.o1;
        if (zO) {
            getSenderNameViewStub$message_list().c(i6, i6);
            measuredLayoutHeight = getSenderBottomMargin$message_list() + getSenderNameViewStub$message_list().a() + i6;
        } else {
            measuredLayoutHeight = i6;
        }
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().T(((getMeasuredWidth() - i6) - getSenderAliasDelegate().L()) - i5, ((getSenderNameViewStub$message_list().a() / 2) - (getSenderAliasDelegate().K() / 2)) + i6);
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            getMessageLinkDelegate().T(i6, measuredLayoutHeight);
            measuredLayoutHeight += getMessageLinkDelegate().K() + iK3;
        }
        aq6 model = getModel();
        int i7 = this.p1;
        if (model != null && model.l) {
            dka messageTextView$message_list = getMessageTextView$message_list();
            qyj.M(messageTextView$message_list, i6, measuredLayoutHeight, 0, 12);
            measuredLayoutHeight += messageTextView$message_list.getMeasuredHeight() + i7;
        }
        boolean z2 = this.u;
        l1c l1cVar = this.J;
        if (z2) {
            l1cVar.layout(i6, measuredLayoutHeight, l1cVar.getMeasuredWidth() + i6, l1cVar.getMeasuredHeight() + measuredLayoutHeight);
        }
        ny8 ny8Var = this.G;
        if (n7j.o(ny8Var)) {
            t58 t58Var = (t58) ny8Var.getValue();
            if (this.u) {
                measuredHeight2 = t58Var.getMeasuredLayoutHeight() != t58Var.getMeasuredHeight() ? ((l1cVar.getMeasuredHeight() - t58Var.getMeasuredHeight()) / 2) + measuredLayoutHeight : measuredLayoutHeight;
                measuredWidth2 = t58Var.getMeasuredLayoutWidth() != t58Var.getMeasuredWidth() ? ((l1cVar.getMeasuredWidth() - t58Var.getMeasuredWidth()) / 2) + i6 : i6;
            } else {
                measuredWidth2 = i6;
                measuredHeight2 = measuredLayoutHeight;
            }
            qyj.M(t58Var, measuredWidth2, measuredHeight2, 0, 12);
            if (this.u) {
                l1cVar.setOutlineProvider(getCornersOutlineProvider());
                t58Var.setOutlineProvider(getCornersOutlineProvider());
            } else {
                t58Var.setOutlineProvider(getCornersOutlineProvider());
            }
        }
        ny8 ny8Var2 = this.F;
        if (n7j.o(ny8Var2)) {
            ImageView imageView = (ImageView) ny8Var2.getValue();
            if (this.u) {
                measuredHeight = ((t58) ny8Var.getValue()).getMeasuredLayoutHeight() != imageView.getMeasuredHeight() ? ((l1cVar.getMeasuredHeight() - ((t58) ny8Var.getValue()).getMeasuredHeight()) / 2) + measuredLayoutHeight : measuredLayoutHeight;
                measuredWidth = ((t58) ny8Var.getValue()).getMeasuredLayoutWidth() != imageView.getMeasuredWidth() ? ((l1cVar.getMeasuredWidth() - ((t58) ny8Var.getValue()).getMeasuredWidth()) / 2) + i6 : i6;
            } else {
                measuredWidth = i6;
                measuredHeight = measuredLayoutHeight;
            }
            int measuredWidth3 = (((t58) ny8Var.getValue()).getMeasuredWidth() / 2) + measuredWidth;
            int measuredHeight3 = (((t58) ny8Var.getValue()).getMeasuredHeight() / 2) + measuredHeight;
            qyj.L(imageView, measuredWidth3 - (imageView.getMeasuredWidth() / 2), measuredHeight3 - (imageView.getMeasuredHeight() / 2), (imageView.getMeasuredWidth() / 2) + measuredWidth3, (imageView.getMeasuredHeight() / 2) + measuredHeight3);
        }
        if (n7j.o(ny8Var)) {
            ny8 ny8Var3 = this.H;
            if (n7j.o(ny8Var3)) {
                wti wtiVar = (wti) ny8Var3.getValue();
                qyj.M(wtiVar, zo5.b(4.0f, yl5.d().getDisplayMetrics().density, i6), zo5.D(4.0f, yl5.d().getDisplayMetrics().density, (((t58) ny8Var.getValue()).getMeasuredLayoutHeight() + measuredLayoutHeight) - wtiVar.getMeasuredHeight()), 0, 12);
            }
            measuredLayoutHeight += ((t58) ny8Var.getValue()).getMeasuredLayoutHeight() + i7;
        }
        int iK4 = n7j.o((ny8) getCommentsEntryDelegate().b) ? getCommentsEntryDelegate().K() : 0;
        ny8 ny8Var4 = this.E;
        if (n7j.o(ny8Var4)) {
            wq6 wq6Var = (wq6) ny8Var4.getValue();
            if (n7j.o((ny8) getReactionsDelegate().b)) {
                if (getMeasuredWidth() - (getReactionsDelegate().L() + (i6 * 2)) < getDate$message_list().getMeasuredWidth()) {
                    iK = getDate$message_list().getMeasuredHeight() + getReactionsDelegate().K() + c0a.e(6.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), iK4);
                } else if (n7j.o((ny8) getReactionsDelegate().b)) {
                    iK = getReactionsDelegate().K() + c0a.e(8.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), iK4);
                } else {
                    iK = i6 + iK4;
                }
            } else if (n7j.o((ny8) getReactionsDelegate().b)) {
                iK = getReactionsDelegate().K() + c0a.e(8.0f, yl5.d().getDisplayMetrics().density, gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), iK4);
            } else {
                iK = i6 + iK4;
            }
            qyj.M(wq6Var, i6, ((((getMeasuredHeight() - iK) - measuredLayoutHeight) / 2) + measuredLayoutHeight) - (wq6Var.getMeasuredHeight() / 2), 0, 12);
            contentHorizontalPadding$message_list = getContentHorizontalPadding$message_list() + iK2 + i6;
        } else {
            contentHorizontalPadding$message_list = i6;
        }
        int iK5 = n7j.o(ny8Var4) ? gm0.K(getActionIconView().getY() + (getActionIconView().getMeasuredHeight() / 2)) : (iK2 / 2) + measuredLayoutHeight;
        TextView textView = this.K;
        qyj.L(textView, contentHorizontalPadding$message_list, iK5, textView.getMeasuredWidth() + contentHorizontalPadding$message_list, textView.getMeasuredHeight() + iK5);
        Math.max(o9b.d(this.n1), textView.getMeasuredWidth());
        int bottom = n7j.o(ny8Var4) ? ((wq6) ny8Var4.getValue()).getBottom() : textView.getBottom();
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            getReactionsDelegate().T(gm0.K(10.0f * yl5.d().getDisplayMetrics().density), zo5.b(10.0f, yl5.d().getDisplayMetrics().density, bottom));
            getReactionsDelegate().K();
        }
        qyj.M(getDate$message_list(), ((getMeasuredWidth() - getDate$message_list().getMeasuredWidth()) - i6) - i5, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, (getMeasuredHeight() - iK4) - getDate$message_list().getMeasuredHeight()), 0, 12);
        if (n7j.o((ny8) getCommentsEntryDelegate().b)) {
            getCommentsEntryDelegate().T(0, getMeasuredHeight() - getCommentsEntryDelegate().K());
        }
        if (n7j.o((ny8) getShareMessageDelegate().b)) {
            getShareMessageDelegate().T(getMeasuredWidth() - getShareMessageDelegate().L(), (getMeasuredHeight() - getShareMessageDelegate().K()) - gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        }
    }

    @Override // defpackage.gnh, android.view.View
    public final void onMeasure(int i, int i2) {
        int iK;
        int iIntValue;
        int iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iK2 = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list();
        if (n7j.o((ny8) getSenderAliasDelegate().b) && n7j.o(getSenderNameViewStub$message_list().b)) {
            getSenderAliasDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().L());
        }
        boolean zO = n7j.o(getSenderNameViewStub$message_list().b);
        int iK5 = this.o1;
        if (zO) {
            getSenderNameViewStub$message_list().d(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            int iZ = getSenderAliasDelegate().Z();
            iK = getSenderBottomMargin$message_list() + getSenderNameViewStub$message_list().a() + iK5;
            size = Math.max(size, (iK5 * 2) + getSenderNameViewStub$message_list().b() + iZ);
        } else {
            iK = iK5;
        }
        aq6 model = getModel();
        int i3 = this.p1;
        if (model != null && model.l) {
            dka messageTextView$message_list = getMessageTextView$message_list();
            messageTextView$message_list.j();
            size = Math.max(size, (iK5 * 2) + messageTextView$message_list.getMeasuredWidth());
            iK += messageTextView$message_list.getMeasuredHeight() + i3;
        }
        ny8 ny8Var = this.G;
        boolean zO2 = n7j.o(ny8Var);
        l1c l1cVar = this.J;
        if (zO2) {
            t58 t58Var = (t58) ny8Var.getValue();
            t58Var.measure(View.MeasureSpec.makeMeasureSpec(iF, 1073741824), i2);
            iK += t58Var.getMeasuredLayoutHeight() + i3;
            size = Math.max(size, (iK5 * 2) + t58Var.getMeasuredLayoutWidth());
            boolean z = (t58Var.getMeasuredLayoutWidth() == t58Var.getMeasuredWidth() && t58Var.getMeasuredLayoutHeight() == t58Var.getMeasuredHeight()) ? false : true;
            this.u = z;
            l1cVar.setVisibility(z ? 0 : 8);
        }
        if (this.u) {
            l1cVar.measure(View.MeasureSpec.makeMeasureSpec(iF, 1073741824), View.MeasureSpec.makeMeasureSpec(((t58) ny8Var.getValue()).getMeasuredLayoutHeight(), 1073741824));
            size = Math.max(size, (iK5 * 2) + l1cVar.getMeasuredWidth());
        }
        ny8 ny8Var2 = this.F;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK3, 1073741824), View.MeasureSpec.makeMeasureSpec(iK3, 1073741824));
        }
        boolean zO3 = n7j.o(ny8Var);
        ny8 ny8Var3 = this.E;
        if (zO3) {
            iIntValue = Math.min(iF, ((t58) ny8Var.getValue()).getMeasuredWidth());
        } else {
            Integer numValueOf = Integer.valueOf(getContentHorizontalPadding$message_list() + iK2);
            if (!n7j.o(ny8Var3)) {
                numValueOf = 0;
            }
            iIntValue = iF - numValueOf.intValue();
        }
        if (n7j.o((ny8) getMessageLinkDelegate().b)) {
            getMessageLinkDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            size = Math.max(size, (iK5 * 2) + getMessageLinkDelegate().L());
            iK += getMessageLinkDelegate().K() + iK4;
        }
        getDate$message_list().measure(i, i2);
        ny8 ny8Var4 = this.H;
        if (ny8Var4.d()) {
            ((wti) ny8Var4.getValue()).measure(i, i2);
        }
        if (ny8Var3.d()) {
            ((wq6) ny8Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iK2, 1073741824), View.MeasureSpec.makeMeasureSpec(iK2, 1073741824));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE);
        TextView textView = this.K;
        textView.measure(iMakeMeasureSpec, i2);
        int iMax = Math.max(o9b.d(this.n1), textView.getMeasuredWidth());
        if (!n7j.o(ny8Var)) {
            size = Math.max(size, getContentHorizontalPadding$message_list() + (iK5 * 2) + iMax + iK2);
        }
        int contentHorizontalPadding$message_list = (size - iK5) - getContentHorizontalPadding$message_list();
        Integer numValueOf2 = Integer.valueOf(iK2);
        Integer numValueOf3 = Integer.valueOf(textView.getMeasuredHeight() + o9b.c(this.n1));
        if (!n7j.o(ny8Var3)) {
            numValueOf2 = numValueOf3;
        }
        this.z.set(iK5, iK, contentHorizontalPadding$message_list, numValueOf2.intValue() + iK);
        int measuredHeight = textView.getMeasuredHeight() + o9b.c(this.n1);
        Integer numValueOf4 = Integer.valueOf(iK2);
        Integer numValueOf5 = Integer.valueOf(measuredHeight);
        if (!n7j.o(ny8Var3)) {
            numValueOf4 = numValueOf5;
        }
        int iMax2 = Math.max(numValueOf4.intValue(), measuredHeight) + iK;
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            getReactionsDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax2 = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, getReactionsDelegate().K(), iMax2);
            size = Math.max(size, (iK5 * 2) + getReactionsDelegate().L());
        }
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            if (size - (getReactionsDelegate().L() + (iK5 * 2)) < getDate$message_list().getMeasuredWidth()) {
                iMax2 += zo5.b(6.0f, yl5.d().getDisplayMetrics().density, getDate$message_list().getMeasuredHeight()) - gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
            }
        }
        int iD = o9b.d(this.n1) - textView.getMeasuredWidth();
        boolean z2 = n7j.o(ny8Var) && ((t58) ny8Var.getValue()).getMeasuredLayoutWidth() <= iD && iD < getDate$message_list().getMeasuredWidth();
        boolean z3 = !n7j.o(ny8Var) && iD < getDate$message_list().getMeasuredWidth();
        if (!n7j.o((ny8) getReactionsDelegate().b) && (z2 || z3)) {
            size += (gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) + getDate$message_list().getMeasuredWidth()) - iD;
        }
        if (n7j.o((ny8) getReactionsDelegate().b)) {
            iK5 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        }
        int iK6 = iMax2 + iK5;
        if (n7j.o((ny8) getCommentsEntryDelegate().b)) {
            getCommentsEntryDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            size = Math.max(size, getCommentsEntryDelegate().L());
            getCommentsEntryDelegate().U(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            iK6 += getCommentsEntryDelegate().K();
        }
        if (n7j.o((ny8) getShareMessageDelegate().b)) {
            getShareMessageDelegate().U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            int iL = getShareMessageDelegate().L();
            size += iL;
            ((fea) getBackground()).s = iL;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(size, iK6);
    }

    @Override // defpackage.gnh, defpackage.i59
    public final boolean r() {
        return false;
    }

    @Override // defpackage.gnh, defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        getDate$message_list().setStatus$message_list(f9jVar);
    }

    public final void setFileInfo(aq6 aq6Var) {
        ga0 ga0Var;
        setModel(aq6Var);
        this.w = new ga0(this, 5, aq6Var);
        if (isAttachedToWindow() && (ga0Var = this.w) != null) {
            ga0Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.w);
    }

    @Override // defpackage.gnh, defpackage.v35
    public void setIsChannelMode(boolean z) {
        getDate$message_list().setChannelMode$message_list(z);
    }

    @Override // defpackage.gnh, defpackage.khf
    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list().e(layout);
    }

    @Override // defpackage.gnh, defpackage.khf
    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list().f(i);
    }

    @Override // defpackage.gnh, defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.u && n9j.d(this.J, this).contains(x, y)) {
            return true;
        }
        ny8 ny8Var = this.G;
        if (n7j.o(ny8Var) && n9j.d((View) ny8Var.getValue(), this).contains(x, y)) {
            return true;
        }
        return this.z.contains(x, y);
    }
}
