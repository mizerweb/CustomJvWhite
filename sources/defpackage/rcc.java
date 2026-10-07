package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class rcc extends FrameLayout implements zff, eph {
    public static final /* synthetic */ zv8[] E = {new z8b(rcc.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), zo5.e(zfe.a, rcc.class, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;"), new z8b(rcc.class, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;"), new z8b(rcc.class, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;"), new z8b(rcc.class, "actionsHorizontalPadding", "getActionsHorizontalPadding()Lkotlin/Pair;"), new z8b(rcc.class, "isTextShimmerEnabled", "isTextShimmerEnabled()Z")};
    public af7 A;
    public long B;
    public af7 C;
    public Integer D;
    public final qcc a;
    public final qcc b;
    public final qcc c;
    public final qcc d;
    public final qcc e;
    public final qcc f;
    public final TextView g;
    public final ny8 h;
    public final ny8 i;
    public final amh j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public ViewGroup o;
    public View p;
    public View q;
    public View r;
    public Rect s;
    public Rect t;
    public Rect u;
    public Rect v;
    public final Rect w;
    public boolean x;
    public boolean y;
    public boolean z;

    public rcc(final Context context) {
        super(context, null, 0);
        final int i = 0;
        this.a = new qcc(this, 0, false);
        final int i2 = 1;
        this.b = new qcc(this, 1);
        final int i3 = 2;
        this.c = new qcc(this, 2);
        final int i4 = 3;
        this.d = new qcc(this, 3);
        final int i5 = 4;
        this.e = new qcc(this, 4, false);
        this.f = new qcc(this, 5);
        TextView textViewE = qv1.e(context, R.id.oneme_toolbar_title);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setTextColor(pq3.j.h(textViewE).getText().b);
        textViewE.setTextAlignment(5);
        np4.C(textViewE, false);
        textViewE.setSingleLine();
        Rect rect = n7j.a;
        i7j.n(textViewE, false);
        this.g = textViewE;
        this.h = rx8.P(3, new af7() { // from class: vbc
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i;
                rcc rccVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return rcc.e(context2, rccVar);
                    case 1:
                        return rcc.d(context2, rccVar);
                    case 2:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_toolbar_title_avatar);
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density), gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density)));
                        kwbVar.setAvatarShape(awb.a);
                        rccVar.addView(kwbVar);
                        return kwbVar;
                    case 3:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_toolbar_title_dropdown);
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
                        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_down).mutate());
                        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageViewD).getIcon().b));
                        rccVar.addView(imageViewD);
                        return imageViewD;
                    default:
                        tcc tccVar = new tcc(context2);
                        tccVar.setId(R.id.oneme_toolbar_selection_view);
                        tccVar.setVisibility(8);
                        tccVar.setAlpha(0.0f);
                        tccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        rccVar.addView(tccVar);
                        return tccVar;
                }
            }
        });
        this.i = rx8.P(3, new af7() { // from class: vbc
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i2;
                rcc rccVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return rcc.e(context2, rccVar);
                    case 1:
                        return rcc.d(context2, rccVar);
                    case 2:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_toolbar_title_avatar);
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density), gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density)));
                        kwbVar.setAvatarShape(awb.a);
                        rccVar.addView(kwbVar);
                        return kwbVar;
                    case 3:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_toolbar_title_dropdown);
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
                        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_down).mutate());
                        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageViewD).getIcon().b));
                        rccVar.addView(imageViewD);
                        return imageViewD;
                    default:
                        tcc tccVar = new tcc(context2);
                        tccVar.setId(R.id.oneme_toolbar_selection_view);
                        tccVar.setVisibility(8);
                        tccVar.setAlpha(0.0f);
                        tccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        rccVar.addView(tccVar);
                        return tccVar;
                }
            }
        });
        this.j = new amh();
        this.k = rx8.P(3, new af7() { // from class: vbc
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i3;
                rcc rccVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return rcc.e(context2, rccVar);
                    case 1:
                        return rcc.d(context2, rccVar);
                    case 2:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_toolbar_title_avatar);
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density), gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density)));
                        kwbVar.setAvatarShape(awb.a);
                        rccVar.addView(kwbVar);
                        return kwbVar;
                    case 3:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_toolbar_title_dropdown);
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
                        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_down).mutate());
                        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageViewD).getIcon().b));
                        rccVar.addView(imageViewD);
                        return imageViewD;
                    default:
                        tcc tccVar = new tcc(context2);
                        tccVar.setId(R.id.oneme_toolbar_selection_view);
                        tccVar.setVisibility(8);
                        tccVar.setAlpha(0.0f);
                        tccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        rccVar.addView(tccVar);
                        return tccVar;
                }
            }
        });
        this.l = rx8.P(3, new af7() { // from class: vbc
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i4;
                rcc rccVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return rcc.e(context2, rccVar);
                    case 1:
                        return rcc.d(context2, rccVar);
                    case 2:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_toolbar_title_avatar);
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density), gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density)));
                        kwbVar.setAvatarShape(awb.a);
                        rccVar.addView(kwbVar);
                        return kwbVar;
                    case 3:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_toolbar_title_dropdown);
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
                        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_down).mutate());
                        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageViewD).getIcon().b));
                        rccVar.addView(imageViewD);
                        return imageViewD;
                    default:
                        tcc tccVar = new tcc(context2);
                        tccVar.setId(R.id.oneme_toolbar_selection_view);
                        tccVar.setVisibility(8);
                        tccVar.setAlpha(0.0f);
                        tccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        rccVar.addView(tccVar);
                        return tccVar;
                }
            }
        });
        this.m = rx8.P(3, new ap9(14, this));
        this.n = rx8.P(3, new af7() { // from class: vbc
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                rcc rccVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return rcc.e(context2, rccVar);
                    case 1:
                        return rcc.d(context2, rccVar);
                    case 2:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_toolbar_title_avatar);
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density), gm0.K(rccVar.getForm().a * yl5.d().getDisplayMetrics().density)));
                        kwbVar.setAvatarShape(awb.a);
                        rccVar.addView(kwbVar);
                        return kwbVar;
                    case 3:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_toolbar_title_dropdown);
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density)));
                        imageViewD.setImageDrawable(imageViewD.getContext().getDrawable(R.drawable.icon_chevron_down).mutate());
                        imageViewD.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageViewD).getIcon().b));
                        rccVar.addView(imageViewD);
                        return imageViewD;
                    default:
                        tcc tccVar = new tcc(context2);
                        tccVar.setId(R.id.oneme_toolbar_selection_view);
                        tccVar.setVisibility(8);
                        tccVar.setAlpha(0.0f);
                        tccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        rccVar.addView(tccVar);
                        return tccVar;
                }
            }
        });
        this.w = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textViewE, new FrameLayout.LayoutParams(-2, -2));
        t();
        u();
        addOnLayoutChangeListener(new pcc(this));
        if (isLaidOut()) {
            g(this);
        }
        new u6j(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(this, Boolean.TRUE);
        i7j.n(this, true);
    }

    public static v0g d(Context context, rcc rccVar) {
        v0g v0gVarH0 = e9i.H0(context, rccVar.getCurrentTheme());
        v0gVarH0.setId(View.generateViewId());
        q9i.a(q9i.i, v0gVarH0);
        v0gVarH0.setTextColor(rccVar.getCurrentTheme().getText().d);
        v0gVarH0.setVisibility(8);
        rccVar.addView(v0gVarH0);
        return v0gVarH0;
    }

    public static v0g e(Context context, rcc rccVar) {
        v0g v0gVarH0 = e9i.H0(context, rccVar.getCurrentTheme());
        qcc qccVar = rccVar.f;
        zv8 zv8Var = E[5];
        v0gVarH0.a(((Boolean) qccVar.b).booleanValue());
        rccVar.addView(v0gVarH0);
        return v0gVarH0;
    }

    public static final void f(rcc rccVar, final dcc dccVar) {
        View view;
        View view2;
        View view3;
        Rect rectY;
        Rect rectY2;
        View viewY0;
        rccVar.removeView(rccVar.p);
        rccVar.removeView(rccVar.q);
        rccVar.removeView(rccVar.r);
        Context context = rccVar.getContext();
        ncc searchViewInteraction = rccVar.getSearchViewInteraction();
        Rect rectY3 = null;
        acc accVar = dccVar instanceof acc ? (acc) dccVar : null;
        View viewY1 = e9i.y0(context, accVar != null ? accVar.c : null, searchViewInteraction);
        if (viewY1 != null) {
            viewY1.setId(R.id.oneme_right_third_icon_button);
        } else {
            viewY1 = null;
        }
        rccVar.r = viewY1;
        Context context2 = rccVar.getContext();
        ncc searchViewInteraction2 = rccVar.getSearchViewInteraction();
        boolean z = dccVar instanceof acc;
        acc accVar2 = z ? (acc) dccVar : null;
        View viewY2 = e9i.y0(context2, accVar2 != null ? accVar2.a : null, searchViewInteraction2);
        if (viewY2 != null) {
            viewY2.setId(R.id.oneme_right_secondary_icon_button);
        } else {
            viewY2 = null;
        }
        rccVar.q = viewY2;
        Context context3 = rccVar.getContext();
        ncc searchViewInteraction3 = rccVar.getSearchViewInteraction();
        kbc customTheme = rccVar.getCustomTheme();
        if (z) {
            viewY0 = e9i.y0(context3, ((acc) dccVar).b, searchViewInteraction3);
        } else {
            boolean z2 = dccVar instanceof ccc;
            zxb zxbVar = zxb.GHOST;
            if (z2) {
                int iD = qt4.D(((ccc) dccVar).b());
                final int i = 1;
                if (iD == 0) {
                    cyb cybVar = new cyb(context3);
                    cybVar.setCustomTheme(customTheme);
                    cybVar.setAppearance(zxbVar);
                    cybVar.setSize(ayb.i);
                    cybVar.setIconResource(R.drawable.icon_dots_vertical);
                    qe7.H(cybVar, 300L, new View.OnClickListener() { // from class: dvh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i2 = i;
                            dcc dccVar2 = dccVar;
                            switch (i2) {
                                case 0:
                                    ((ccc) dccVar2).a().invoke(view4);
                                    break;
                                case 1:
                                    ((ccc) dccVar2).a().invoke(view4);
                                    break;
                                case 2:
                                    ((ecc) dccVar2).c.invoke(view4);
                                    break;
                                default:
                                    ((xbc) dccVar2).a.invoke(view4);
                                    break;
                            }
                        }
                    });
                    view2 = cybVar;
                } else {
                    if (iD != 1) {
                        ore.o();
                        return;
                    }
                    ImageView imageView = new ImageView(context3);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.icon_dots_vertical);
                    int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                    imageView.setPadding(iK, iK, iK, iK);
                    imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density)));
                    imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
                    n1g.N(new o23(), imageView);
                    final int i2 = 0;
                    qe7.H(imageView, 300L, new View.OnClickListener() { // from class: dvh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i3 = i2;
                            dcc dccVar2 = dccVar;
                            switch (i3) {
                                case 0:
                                    ((ccc) dccVar2).a().invoke(view4);
                                    break;
                                case 1:
                                    ((ccc) dccVar2).a().invoke(view4);
                                    break;
                                case 2:
                                    ((ecc) dccVar2).c.invoke(view4);
                                    break;
                                default:
                                    ((xbc) dccVar2).a.invoke(view4);
                                    break;
                            }
                        }
                    });
                    view2 = imageView;
                }
            } else if (dccVar instanceof ecc) {
                cyb cybVar2 = new cyb(context3);
                cybVar2.setCustomTheme(customTheme);
                ecc eccVar = (ecc) dccVar;
                Integer num = eccVar.b;
                cybVar2.setText(eccVar.a);
                cybVar2.setAppearance(zxbVar);
                cybVar2.setSize(ayb.i);
                if (num != null) {
                    cybVar2.setTextColor(num);
                }
                final int i3 = 2;
                qe7.H(cybVar2, 300L, new View.OnClickListener() { // from class: dvh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i4 = i3;
                        dcc dccVar2 = dccVar;
                        switch (i4) {
                            case 0:
                                ((ccc) dccVar2).a().invoke(view4);
                                break;
                            case 1:
                                ((ccc) dccVar2).a().invoke(view4);
                                break;
                            case 2:
                                ((ecc) dccVar2).c.invoke(view4);
                                break;
                            default:
                                ((xbc) dccVar2).a.invoke(view4);
                                break;
                        }
                    }
                });
                view2 = cybVar2;
            } else if (dccVar instanceof xbc) {
                cyb cybVar3 = new cyb(context3);
                cybVar3.setIconResource(R.drawable.icon_cross);
                cybVar3.setAppearance(zxbVar);
                cybVar3.setSize(ayb.i);
                final int i4 = 3;
                qe7.H(cybVar3, 300L, new View.OnClickListener() { // from class: dvh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i5 = i4;
                        dcc dccVar2 = dccVar;
                        switch (i5) {
                            case 0:
                                ((ccc) dccVar2).a().invoke(view4);
                                break;
                            case 1:
                                ((ccc) dccVar2).a().invoke(view4);
                                break;
                            case 2:
                                ((ecc) dccVar2).c.invoke(view4);
                                break;
                            default:
                                ((xbc) dccVar2).a.invoke(view4);
                                break;
                        }
                    }
                });
                view2 = cybVar3;
            } else {
                if (!(dccVar instanceof ybc)) {
                    ore.o();
                    return;
                }
                view = null;
            }
            view = view2;
        }
        if (view != null) {
            view = viewY0;
            view.setId(R.id.oneme_right_primary_icon_button);
            view3 = view;
        } else {
            view = viewY0;
            view3 = null;
        }
        rccVar.p = view3;
        if (view3 != null) {
            rccVar.addView(view3);
            rectY = qyj.y(view3, gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
        } else {
            rectY = null;
        }
        rccVar.t = rectY;
        View view4 = rccVar.q;
        if (view4 != null) {
            rccVar.addView(view4);
            rectY2 = qyj.y(view4, gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
        } else {
            rectY2 = null;
        }
        rccVar.u = rectY2;
        View view5 = rccVar.r;
        if (view5 != null) {
            rccVar.addView(view5);
            rectY3 = qyj.y(view5, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        }
        rccVar.v = rectY3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    public static final void g(rcc rccVar) {
        int right;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        Rect bounds;
        Rect rect = rccVar.w;
        TextView textView = rccVar.g;
        rect.set(textView.getLeft(), 0, textView.getRight(), rccVar.getHeight());
        ny8 ny8Var = rccVar.k;
        if (ny8Var.d()) {
            rect.left = Math.min(((kwb) ny8Var.getValue()).getLeft(), rect.left);
        }
        ny8 ny8Var2 = rccVar.h;
        if (ny8Var2.d()) {
            v0g v0gVar = (v0g) ny8Var2.getValue();
            rect.left = Math.min(v0gVar.getLeft(), rect.left);
            rect.right = Math.max(v0gVar.getRight(), rect.right);
        }
        ny8 ny8Var3 = rccVar.i;
        if (ny8Var3.d()) {
            v0g v0gVar2 = (v0g) ny8Var3.getValue();
            rect.left = Math.min(v0gVar2.getLeft(), rect.left);
            rect.right = Math.max(v0gVar2.getRight(), rect.right);
        }
        ViewGroup viewGroup = rccVar.o;
        if (viewGroup != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                if (touchDelegate == null || (touchDelegateInfo = touchDelegate.getTouchDelegateInfo()) == null) {
                    right = -1;
                } else {
                    Region regionAt = touchDelegateInfo.getRegionCount() <= 0 ? null : touchDelegateInfo.getRegionAt(0);
                    if (regionAt == null || (bounds = regionAt.getBounds()) == null) {
                        right = -1;
                    } else {
                        right = bounds.right;
                    }
                }
            } else {
                right = viewGroup.getRight();
            }
            rect.left = Math.max(right, viewGroup.getRight());
        }
        ny8 ny8Var4 = rccVar.l;
        if (ny8Var4.d()) {
            rect.right = Math.max(((ImageView) ny8Var4.getValue()).getRight(), rect.right);
        }
        View view = rccVar.p;
        if (view != null) {
            rect.right = Math.min(qyj.F(view), view.getLeft());
        }
        View view2 = rccVar.q;
        if (view2 != null) {
            rect.right = Math.min(qyj.F(view2), view2.getLeft());
        }
        View view3 = rccVar.r;
        if (view3 != null) {
            rect.right = Math.min(qyj.F(view3), view3.getLeft());
        }
    }

    private final kbc getCurrentTheme() {
        kbc customTheme = getCustomTheme();
        return customTheme == null ? pq3.j.h(this) : customTheme;
    }

    private final ncc getSearchViewInteraction() {
        return (ncc) this.m.getValue();
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void m(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void n(View view, int i, int i2) {
        view.layout(i, c0a.g(view, 2, i2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + c0a.g(view, 2, i2));
    }

    public static void p(TextView textView) {
        textView.setTranslationX(0.0f);
        textView.setAlpha(1.0f);
    }

    private final void setSubtitleAnimated(CharSequence charSequence) {
        h();
        v0g v0gVar = (v0g) this.h.getValue();
        v0g v0gVar2 = (v0g) this.i.getValue();
        CharSequence text = v0gVar.getText();
        this.x = true;
        v0gVar2.setText(text);
        int i = 8;
        v0gVar2.setVisibility((l() || this.z) ? 8 : 0);
        v0gVar.setText(charSequence);
        if (!l() && !this.z) {
            i = 0;
        }
        v0gVar.setVisibility(i);
        if (l()) {
            return;
        }
        v0gVar.setTranslationX(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        v0gVar.setAlpha(0.0f);
        requestLayout();
        float fK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        float fK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        wre wreVar = new wre(v0gVar2, this, v0gVar, 26);
        amh amhVar = this.j;
        AnimatorSet animatorSet = amhVar.a;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        amhVar.a = null;
        Property property = View.ALPHA;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.0f);
        float[] fArr = {0.0f, fK};
        Property property2 = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(v0gVar2, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr));
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = amh.b;
        objectAnimatorOfPropertyValuesHolder.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(v0gVar, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fK2, 0.0f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(accelerateDecelerateInterpolator);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet2.addListener(new al(amhVar, 3, wreVar));
        amhVar.a = animatorSet2;
        animatorSet2.start();
    }

    private final void setSubtitleImmediate(CharSequence charSequence) {
        AnimatorSet animatorSet = this.j.a;
        ny8 ny8Var = this.h;
        if (animatorSet == null || !animatorSet.isRunning() || charSequence == null || !z5h.E0(charSequence, ((v0g) ny8Var.getValue()).getText())) {
            h();
            this.x = charSequence != null;
            if (charSequence != null) {
                ((v0g) ny8Var.getValue()).setText(charSequence);
                ((View) ny8Var.getValue()).setVisibility((l() || this.z) ? 8 : 0);
            } else if (ny8Var.d()) {
                ((v0g) ny8Var.getValue()).setVisibility(8);
            }
            ny8 ny8Var2 = this.i;
            if (ny8Var2.d()) {
                ((v0g) ny8Var2.getValue()).setVisibility(8);
            }
            if (l()) {
                return;
            }
            requestLayout();
        }
    }

    @Override // defpackage.zff
    public final void a() {
        ((tcc) this.n.getValue()).setOffEditMode(new occ(this));
    }

    @Override // defpackage.zff
    public final boolean b() {
        ny8 ny8Var = this.n;
        return ny8Var.d() && ((tcc) ny8Var.getValue()).b();
    }

    @Override // defpackage.zff
    public final void c(String str, List list, af7 af7Var, cf7 cf7Var) {
        k();
        setPadding(0, getPaddingTop(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        ((tcc) this.n.getValue()).c(str, list, new vx9(this, 20, af7Var), cf7Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public final ylc getActionsHorizontalPadding() {
        zv8 zv8Var = E[4];
        return (ylc) this.e.b;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = E[0];
        return (kbc) this.a.b;
    }

    public final gcc getForm() {
        zv8 zv8Var = E[1];
        return (gcc) this.b.b;
    }

    public final bcc getLeftActions() {
        zv8 zv8Var = E[3];
        return (bcc) this.d.b;
    }

    public final dcc getRightActions() {
        zv8 zv8Var = E[2];
        return (dcc) this.c.b;
    }

    public final t7c getSearchView() {
        View view = this.p;
        t7c t7cVar = view instanceof t7c ? (t7c) view : null;
        if (t7cVar == null) {
            View view2 = this.q;
            t7cVar = view2 instanceof t7c ? (t7c) view2 : null;
            if (t7cVar == null) {
                View view3 = this.r;
                if (view3 instanceof t7c) {
                    return (t7c) view3;
                }
                return null;
            }
        }
        return t7cVar;
    }

    public final TextView getTitle() {
        return this.g;
    }

    public final void h() {
        this.y = false;
        amh amhVar = this.j;
        AnimatorSet animatorSet = amhVar.a;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        amhVar.a = null;
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            p((v0g) ny8Var.getValue());
        }
        ny8 ny8Var2 = this.i;
        if (ny8Var2.d()) {
            v0g v0gVar = (v0g) ny8Var2.getValue();
            v0gVar.setVisibility(8);
            p(v0gVar);
        }
    }

    public final void i(boolean z) {
        AnimatorSet animatorSet;
        if (!z) {
            h();
        }
        this.z = !z;
        this.g.setVisibility(z ? 0 : 8);
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            ((v0g) ny8Var.getValue()).setVisibility(z ? 0 : 8);
        }
        ny8 ny8Var2 = this.i;
        if (ny8Var2.d()) {
            ((v0g) ny8Var2.getValue()).setVisibility((z && (animatorSet = this.j.a) != null && animatorSet.isRunning()) ? 0 : 8);
        }
        ny8 ny8Var3 = this.k;
        if (ny8Var3.d()) {
            ((kwb) ny8Var3.getValue()).setVisibility(z ? 0 : 8);
        }
        ny8 ny8Var4 = this.l;
        if (ny8Var4.d()) {
            ((ImageView) ny8Var4.getValue()).setVisibility(z ? 0 : 8);
        }
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
        View view = this.p;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.q;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        View view3 = this.r;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
    }

    public final c79 j(float f, boolean z) {
        View view;
        ObjectAnimator objectAnimatorA;
        float f2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.2f);
        int iK = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
        float fK = ((f + gm0.K(56.0f * yl5.d().getDisplayMetrics().density)) + gm0.K(12.0f * yl5.d().getDisplayMetrics().density)) - ((2.0f * gm0.K(8.0f * yl5.d().getDisplayMetrics().density)) + gm0.K(getForm().a * yl5.d().getDisplayMetrics().density));
        Float fValueOf3 = Float.valueOf(0.0f);
        ylc ylcVar = z ? new ylc(Integer.valueOf(iK), Integer.valueOf(paddingBottom)) : new ylc(Integer.valueOf(paddingBottom), Integer.valueOf(iK));
        int iIntValue = ((Number) ylcVar.a).intValue();
        int iIntValue2 = ((Number) ylcVar.b).intValue();
        ylc ylcVar2 = z ? new ylc(Float.valueOf(fK), fValueOf3) : new ylc(fValueOf3, Float.valueOf(fK));
        float fFloatValue = ((Number) ylcVar2.a).floatValue();
        float fFloatValue2 = ((Number) ylcVar2.b).floatValue();
        ylc ylcVar3 = z ? new ylc(fValueOf2, fValueOf) : new ylc(fValueOf, fValueOf2);
        float fFloatValue3 = ((Number) ylcVar3.a).floatValue();
        float fFloatValue4 = ((Number) ylcVar3.b).floatValue();
        View viewI = n7j.i(this.h);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, iIntValue2);
        valueAnimatorOfInt.addUpdateListener(new ak(23, this));
        TextView textView = this.g;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator objectAnimatorA2 = fsk.a(textView, property, fFloatValue, fFloatValue2, 0L, 0L, z, 120);
        ObjectAnimator objectAnimatorA3 = null;
        if (viewI != null) {
            view = viewI;
            objectAnimatorA = fsk.a(view, property, fFloatValue, fFloatValue2, 0L, 0L, z, 120);
        } else {
            view = viewI;
            objectAnimatorA = null;
        }
        if (view != null) {
            f2 = fFloatValue3;
            objectAnimatorA3 = fsk.a(view, FrameLayout.ALPHA, f2, fFloatValue4, 0L, 0L, z, 120);
        } else {
            f2 = fFloatValue3;
        }
        ObjectAnimator objectAnimator = objectAnimatorA3;
        this.D = Integer.valueOf(iIntValue);
        textView.setTranslationX(fFloatValue);
        if (view != null) {
            view.setTranslationX(fFloatValue);
        }
        if (view != null) {
            view.setAlpha(f2);
        }
        c79 c79VarW = yab.w();
        c79VarW.add(valueAnimatorOfInt);
        c79VarW.add(objectAnimatorA2);
        if (objectAnimatorA != null) {
            c79VarW.add(objectAnimatorA);
        }
        if (objectAnimator != null) {
            c79VarW.add(objectAnimator);
        }
        return yab.j(c79VarW);
    }

    public final void k() {
        h();
        this.z = true;
        setPadding(0, getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), getPaddingBottom());
        View view = this.q;
        if (view instanceof t7c) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(0);
            view.setLayoutParams(marginLayoutParams);
            View view2 = this.p;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.r;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        View view4 = this.r;
        if (view4 instanceof t7c) {
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(0);
            view4.setLayoutParams(marginLayoutParams2);
            View view5 = this.p;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.q;
            if (view6 != null) {
                view6.setVisibility(8);
            }
        }
        this.g.setVisibility(8);
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            ((v0g) ny8Var.getValue()).setVisibility(8);
        }
        ny8 ny8Var2 = this.i;
        if (ny8Var2.d()) {
            ((v0g) ny8Var2.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = this.k;
        if (ny8Var3.d()) {
            ((kwb) ny8Var3.getValue()).setVisibility(8);
        }
        ny8 ny8Var4 = this.l;
        if (ny8Var4.d()) {
            ((ImageView) ny8Var4.getValue()).setVisibility(8);
        }
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean l() {
        t7c searchView = getSearchView();
        q7c state = searchView != null ? searchView.getState() : null;
        return state == q7c.c || state == q7c.d || state == q7c.b;
    }

    public final int o(int i, int i2, View view, View view2, View view3, int i3, int i4) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        if (view != null && view2 != null && view3 != null) {
            measureChild(view, i, i2);
            measureChild(view2, i, i2);
            measureChild(view3, i, i2);
            return (i4 * 2) + view3.getMeasuredWidth() + view2.getMeasuredWidth() + view.getMeasuredWidth() + i3;
        }
        if (view != null && view2 != null) {
            measureChild(view, i, i2);
            measureChild(view2, i, i2);
            measuredWidth2 = view.getMeasuredWidth();
            measuredWidth3 = view2.getMeasuredWidth();
        } else {
            if (view2 == null || view3 == null) {
                if (view != null) {
                    measureChild(view, i, i2);
                    measuredWidth = view.getMeasuredWidth();
                } else if (view2 != null) {
                    measureChild(view2, i, i2);
                    measuredWidth = view2.getMeasuredWidth();
                } else {
                    if (view3 == null) {
                        return 0;
                    }
                    measureChild(view3, i, i2);
                    measuredWidth = view3.getMeasuredWidth();
                }
                return measuredWidth + i3;
            }
            measureChild(view2, i, i2);
            measureChild(view3, i, i2);
            measuredWidth2 = view2.getMeasuredWidth();
            measuredWidth3 = view3.getMeasuredWidth();
        }
        return measuredWidth3 + measuredWidth2 + i4 + i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int verticalPaddingOffset;
        int iK;
        int iK2;
        int verticalPaddingOffset2;
        int verticalPaddingOffset3;
        int iOrdinal = getForm().ordinal();
        ny8 ny8Var = this.l;
        ny8 ny8Var2 = this.n;
        ny8 ny8Var3 = this.i;
        ny8 ny8Var4 = this.k;
        ny8 ny8Var5 = this.h;
        TextView textView = this.g;
        if (iOrdinal == 0) {
            View viewI = n7j.i(ny8Var2);
            if (viewI != null) {
                n(viewI, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            ViewGroup viewGroup = this.o;
            if (viewGroup != null) {
                viewGroup.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (viewGroup.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), viewGroup.getMeasuredWidth() + getPaddingLeft(), (viewGroup.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewI2 = n7j.i(ny8Var5);
            if (viewI2 == null) {
                viewI2 = n7j.i(ny8Var3);
            }
            if (viewI2 != null) {
                verticalPaddingOffset = ((((getMeasuredHeight() - viewI2.getMeasuredHeight()) - textView.getMeasuredHeight()) - gm0.K(yl5.d().getDisplayMetrics().density * 2.0f)) / 2) + getVerticalPaddingOffset();
            } else {
                verticalPaddingOffset = getVerticalPaddingOffset() + ((getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2));
            }
            View view = this.p;
            View view2 = this.q;
            if ((view2 instanceof t7c) && l()) {
                t7c t7cVar = (t7c) view2;
                t7cVar.layout((getMeasuredWidth() - getPaddingRight()) - t7cVar.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (t7cVar.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (t7cVar.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null && view2 != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), c0a.g(view, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                view2.layout(zo5.D(12.0f, yl5.d().getDisplayMetrics().density, yab.P(view) - view2.getMeasuredWidth()), c0a.g(view2, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(12.0f, yl5.d().getDisplayMetrics().density, yab.P(view)), (view2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view2 != null) {
                view2.layout((getMeasuredWidth() - getPaddingRight()) - view2.getMeasuredWidth(), c0a.g(view2, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), c0a.g(view, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewI3 = n7j.i(ny8Var4);
            View viewI4 = n7j.i(ny8Var);
            int measuredHeight = (textView.getMeasuredHeight() / 2) + verticalPaddingOffset;
            if (viewI3 != null) {
                iK = (gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) + viewI3.getMeasuredWidth()) / 2;
            } else {
                iK = 0;
            }
            if (viewI4 != null) {
                iK2 = (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + viewI4.getMeasuredWidth()) / 2;
            } else {
                iK2 = 0;
            }
            int measuredWidth = (((getMeasuredWidth() / 2) - iK) - iK2) - (textView.getMeasuredWidth() / 2);
            if (viewI3 != null) {
                n(viewI3, measuredWidth, measuredHeight);
                measuredWidth = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, viewI3.getMeasuredWidth(), measuredWidth);
            }
            m(textView, measuredWidth, verticalPaddingOffset);
            int iE = c0a.e(2.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth(), measuredWidth);
            if (viewI4 != null) {
                n(viewI4, iE, measuredHeight);
            }
            View viewI5 = n7j.i(ny8Var4);
            int iB = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, viewI5 != null ? viewI5.getBottom() : textView.getBottom());
            View viewI6 = n7j.i(ny8Var5);
            if (viewI6 != null) {
                int measuredWidth2 = getMeasuredWidth() / 2;
                View viewI7 = n7j.i(ny8Var5);
                m(viewI6, measuredWidth2 - ((viewI7 != null ? viewI7.getMeasuredWidth() : 0) / 2), iB);
            }
            View viewI8 = n7j.i(ny8Var3);
            if (viewI8 != null) {
                int measuredWidth3 = getMeasuredWidth() / 2;
                View viewI9 = n7j.i(ny8Var3);
                m(viewI8, measuredWidth3 - ((viewI9 != null ? viewI9.getMeasuredWidth() : 0) / 2), iB);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            View viewI10 = n7j.i(ny8Var2);
            if (viewI10 != null) {
                n(viewI10, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View viewI11 = n7j.i(ny8Var5);
            if (viewI11 == null) {
                viewI11 = n7j.i(ny8Var3);
            }
            if (viewI11 != null) {
                verticalPaddingOffset2 = ((((getMeasuredHeight() - viewI11.getMeasuredHeight()) - textView.getMeasuredHeight()) - gm0.K(yl5.d().getDisplayMetrics().density * 2.0f)) / 2) + getVerticalPaddingOffset();
            } else {
                verticalPaddingOffset2 = getVerticalPaddingOffset() + ((getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2));
            }
            m(textView, getPaddingLeft(), verticalPaddingOffset2);
            View viewI12 = n7j.i(ny8Var);
            if (viewI12 != null) {
                n(viewI12, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + verticalPaddingOffset2);
            }
            View viewI13 = n7j.i(ny8Var5);
            if (viewI13 != null) {
                m(viewI13, getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + textView.getBottom());
            }
            View viewI14 = n7j.i(ny8Var3);
            if (viewI14 != null) {
                m(viewI14, getPaddingLeft(), gm0.K(2.0f * yl5.d().getDisplayMetrics().density) + textView.getBottom());
            }
            View view3 = this.p;
            View view4 = this.q;
            if ((view4 instanceof t7c) && l()) {
                t7c t7cVar2 = (t7c) view4;
                t7cVar2.layout((getMeasuredWidth() - getPaddingRight()) - t7cVar2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (t7cVar2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (t7cVar2.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            if (view3 != null && view4 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), c0a.g(view3, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                view4.layout(zo5.D(16.0f, yl5.d().getDisplayMetrics().density, yab.P(view3) - view4.getMeasuredWidth()), c0a.g(view4, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(16.0f, yl5.d().getDisplayMetrics().density, yab.P(view3)), (view4.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else if (view4 != null) {
                view4.layout((getMeasuredWidth() - getPaddingRight()) - view4.getMeasuredWidth(), c0a.g(view4, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view4.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else {
                if (view3 != null) {
                    view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), c0a.g(view3, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                    return;
                }
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            int paddingLeft = getPaddingLeft();
            View viewI15 = n7j.i(ny8Var4);
            if (viewI15 != null) {
                n(viewI15, paddingLeft, getMeasuredHeight() / 2);
                paddingLeft = c0a.e(8.0f, yl5.d().getDisplayMetrics().density, viewI15.getMeasuredWidth(), paddingLeft);
            }
            m(textView, paddingLeft, getPaddingTop());
            View viewI16 = n7j.i(ny8Var5);
            if (viewI16 != null) {
                m(viewI16, paddingLeft, textView.getBottom());
                return;
            }
            return;
        }
        View viewI17 = n7j.i(ny8Var2);
        if (viewI17 != null) {
            n(viewI17, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        View viewI18 = n7j.i(ny8Var5);
        if (viewI18 == null) {
            viewI18 = n7j.i(ny8Var3);
        }
        if (viewI18 != null) {
            verticalPaddingOffset3 = (((getMeasuredHeight() - viewI18.getMeasuredHeight()) - textView.getMeasuredHeight()) / 2) + getVerticalPaddingOffset();
        } else {
            verticalPaddingOffset3 = getVerticalPaddingOffset() + ((getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2));
        }
        int paddingLeft2 = getPaddingLeft();
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            viewGroup2.layout(paddingLeft2, ((getMeasuredHeight() / 2) - (viewGroup2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), viewGroup2.getMeasuredWidth() + paddingLeft2, (viewGroup2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft2 += viewGroup2.getMeasuredWidth();
        }
        View viewI19 = n7j.i(ny8Var4);
        if (viewI19 != null) {
            int iK3 = paddingLeft2 + (this.o != null ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) / 2 : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
            n(viewI19, iK3, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft2 = iK3 + viewI19.getMeasuredWidth();
        }
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) + paddingLeft2;
        m(textView, iK4, verticalPaddingOffset3);
        View viewI20 = n7j.i(ny8Var);
        if (viewI20 != null) {
            n(viewI20, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + verticalPaddingOffset3);
        }
        View viewI21 = n7j.i(ny8Var5);
        if (viewI21 != null) {
            m(viewI21, iK4, textView.getBottom());
        }
        View viewI22 = n7j.i(ny8Var3);
        if (viewI22 != null) {
            m(viewI22, iK4, textView.getBottom());
        }
        View view5 = this.p;
        View view6 = this.q;
        View view7 = this.r;
        if ((view6 instanceof t7c) && l()) {
            t7c t7cVar3 = (t7c) view6;
            t7cVar3.layout((getMeasuredWidth() - getPaddingRight()) - t7cVar3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (t7cVar3.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (t7cVar3.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if ((view7 instanceof t7c) && l()) {
            t7c t7cVar4 = (t7c) view7;
            t7cVar4.layout((getMeasuredWidth() - getPaddingRight()) - t7cVar4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (t7cVar4.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (t7cVar4.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view5 != null && view6 != null && view7 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), c0a.g(view5, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view6.layout(zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view5) - view6.getMeasuredWidth()), c0a.g(view6, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view5)), (view6.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            view7.layout(zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view6) - view7.getMeasuredWidth()), c0a.g(view7, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view6)), (view7.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view5 != null && view6 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), c0a.g(view5, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view6.layout(zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view5) - view6.getMeasuredWidth()), c0a.g(view6, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view5)), (view6.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view6 != null && view7 != null) {
            view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), c0a.g(view6, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredHeight() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view7.layout(zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view6) - view7.getMeasuredWidth()), c0a.g(view7, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), zo5.D(8.0f, yl5.d().getDisplayMetrics().density, yab.P(view6)), (view7.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view6 != null) {
            view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), c0a.g(view6, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view7 != null) {
            view7.layout((getMeasuredWidth() - getPaddingRight()) - view7.getMeasuredWidth(), c0a.g(view7, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view7.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view5 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), c0a.g(view5, 2, getMeasuredHeight() / 2) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingBottom;
        int iOrdinal = getForm().ordinal();
        ny8 ny8Var = this.l;
        ny8 ny8Var2 = this.i;
        ny8 ny8Var3 = this.n;
        ny8 ny8Var4 = this.k;
        ny8 ny8Var5 = this.h;
        TextView textView = this.g;
        if (iOrdinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingBottom2 = getPaddingBottom() + getPaddingTop() + gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View viewI = n7j.i(ny8Var3);
            if (viewI != null) {
                viewI.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824));
            }
            if (viewI != null) {
                measureChild(viewI, i, i2);
            }
            int paddingRight = getPaddingRight() + o(i, i2, this.p, this.q, null, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            int paddingLeft2 = getPaddingLeft();
            ViewGroup viewGroup = this.o;
            if (viewGroup != null) {
                measureChild(viewGroup, i, i2);
                paddingLeft2 = c0a.e(12.0f, yl5.d().getDisplayMetrics().density, viewGroup.getMeasuredWidth(), paddingLeft2);
            }
            int iMax = size - (Math.max(paddingLeft2, paddingRight) * 2);
            View viewI2 = n7j.i(ny8Var5);
            if (viewI2 != null) {
                i3 = 0;
                viewI2.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                i3 = 0;
            }
            View viewI3 = n7j.i(ny8Var2);
            if (viewI3 != null) {
                viewI3.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, i3));
            }
            View viewI4 = n7j.i(ny8Var4);
            if (viewI4 != null) {
                measureChild(viewI4, i, i2);
                iMax = qv1.b(8.0f, yl5.d().getDisplayMetrics().density, viewI4.getMeasuredWidth(), iMax);
            }
            View viewI5 = n7j.i(ny8Var);
            if (viewI5 != null) {
                measureChild(viewI5, i, i2);
                iMax = qv1.b(2.0f, yl5.d().getDisplayMetrics().density, viewI5.getMeasuredWidth(), iMax);
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, paddingBottom2);
            return;
        }
        if (iOrdinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingBottom3 = getPaddingBottom() + getPaddingTop() + gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View viewI6 = n7j.i(ny8Var3);
            if (viewI6 != null) {
                viewI6.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom3, 1073741824));
            }
            int iO = paddingLeft3 - o(i, i2, this.p, this.q, null, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            View viewI7 = n7j.i(ny8Var5);
            if (viewI7 != null) {
                i4 = 0;
                viewI7.measure(View.MeasureSpec.makeMeasureSpec(iO, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                i4 = 0;
            }
            View viewI8 = n7j.i(ny8Var2);
            if (viewI8 != null) {
                viewI8.measure(View.MeasureSpec.makeMeasureSpec(iO, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, i4));
            }
            View viewI9 = n7j.i(ny8Var);
            if (viewI9 != null) {
                measureChild(viewI9, i, i2);
                iO = qv1.b(2.0f, yl5.d().getDisplayMetrics().density, viewI9.getMeasuredWidth(), iO);
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iO, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, paddingBottom3);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            int size3 = View.MeasureSpec.getSize(i);
            Integer num = this.D;
            if (num != null) {
                paddingBottom = num.intValue();
            } else {
                paddingBottom = getPaddingBottom() + getPaddingTop() + gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
            }
            int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
            View viewI10 = n7j.i(ny8Var4);
            if (viewI10 != null) {
                measureChild(viewI10, i, i2);
                paddingLeft4 = qv1.b(8.0f, yl5.d().getDisplayMetrics().density, viewI10.getMeasuredWidth(), paddingLeft4);
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            View viewI11 = n7j.i(ny8Var5);
            if (viewI11 != null) {
                viewI11.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            setMeasuredDimension(size3, paddingBottom);
            return;
        }
        int size4 = View.MeasureSpec.getSize(i);
        int paddingBottom4 = getPaddingBottom() + getPaddingTop() + gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
        int paddingLeft5 = (size4 - getPaddingLeft()) - getPaddingRight();
        View viewI12 = n7j.i(ny8Var3);
        if (viewI12 != null) {
            viewI12.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft5, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom4, 1073741824));
        }
        int iO2 = paddingLeft5 - o(i, i2, this.p, this.q, this.r, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 != null) {
            measureChild(viewGroup2, i, i2);
            iO2 -= viewGroup2.getMeasuredWidth();
        }
        View viewI13 = n7j.i(ny8Var4);
        if (viewI13 != null) {
            measureChild(viewI13, i, i2);
            iO2 = qv1.b(8.0f, yl5.d().getDisplayMetrics().density, viewI13.getMeasuredWidth() + (this.o != null ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) / 2 : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f)), iO2);
        }
        View viewI14 = n7j.i(ny8Var5);
        if (viewI14 != null) {
            i5 = 0;
            viewI14.measure(View.MeasureSpec.makeMeasureSpec(iO2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            i5 = 0;
        }
        View viewI15 = n7j.i(ny8Var2);
        if (viewI15 != null) {
            viewI15.measure(View.MeasureSpec.makeMeasureSpec(iO2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, i5));
        }
        View viewI16 = n7j.i(ny8Var);
        if (viewI16 != null) {
            measureChild(viewI16, i, i2);
            iO2 = qv1.b(2.0f, yl5.d().getDisplayMetrics().density, viewI16.getMeasuredWidth(), iO2);
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(iO2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size4, paddingBottom4);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        pq3.j.e(getContext()).getClass();
        pq3.f(this, kbcVar);
        t();
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            v0g v0gVar = (v0g) ny8Var.getValue();
            CharSequence text = v0gVar.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, v0gVar.getText().length(), eph.class) : null;
            if (spans == null) {
                spans = new eph[0];
            }
            for (Object obj : spans) {
                eph ephVar = (eph) obj;
                ephVar.onThemeChanged(kbcVar);
                soh.b(v0gVar, ephVar);
            }
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        View view3;
        TouchDelegate touchDelegate4;
        ViewGroup viewGroup;
        if (motionEvent == null || this.z) {
            return super.onTouchEvent(motionEvent);
        }
        af7 af7Var = this.C;
        Rect rect = this.w;
        if (af7Var != null && motionEvent.getAction() == 0 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.B = System.currentTimeMillis();
        }
        if (!(this.A == null && this.C == null && !hasOnClickListeners()) && motionEvent.getAction() == 1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (this.C == null || System.currentTimeMillis() - this.B <= ViewConfiguration.getLongPressTimeout()) {
                af7 af7Var2 = this.A;
                if (af7Var2 != null) {
                    af7Var2.invoke();
                }
                performClick();
            } else {
                af7 af7Var3 = this.C;
                if (af7Var3 != null) {
                    af7Var3.invoke();
                }
            }
            this.B = 0L;
            return true;
        }
        ViewGroup viewGroup2 = this.o;
        if (viewGroup2 == null || (touchDelegate4 = viewGroup2.getTouchDelegate()) == null || !touchDelegate4.onTouchEvent(motionEvent)) {
            View view4 = this.q;
            if (view4 == null || (touchDelegate3 = view4.getTouchDelegate()) == null || !touchDelegate3.onTouchEvent(motionEvent)) {
                View view5 = this.r;
                if (view5 == null || (touchDelegate2 = view5.getTouchDelegate()) == null || !touchDelegate2.onTouchEvent(motionEvent)) {
                    View view6 = this.p;
                    if (view6 != null && (touchDelegate = view6.getTouchDelegate()) != null && touchDelegate.onTouchEvent(motionEvent) && motionEvent.getAction() == 1 && (view = this.p) != null) {
                        view.performClick();
                    }
                } else if (motionEvent.getAction() == 1 && (view2 = this.r) != null) {
                    view2.performClick();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && (view3 = this.q) != null) {
                view3.performClick();
                return true;
            }
        } else if (motionEvent.getAction() == 1 && (viewGroup = this.o) != null) {
            viewGroup.performClick();
            return true;
        }
        return true;
    }

    public final void q() {
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            v0g v0gVar = (v0g) ny8Var.getValue();
            boolean z = v0gVar.getVisibility() == 0;
            boolean z2 = this.x;
            if (z != z2) {
                v0gVar.setVisibility(z2 ? 0 : 8);
                zv8 zv8Var = E[5];
                v0gVar.a(((Boolean) this.f.b).booleanValue());
                u();
            }
        }
        ny8 ny8Var2 = this.i;
        if (ny8Var2.d()) {
            ((v0g) ny8Var2.getValue()).setVisibility(8);
        }
    }

    public final void r() {
        int iIntValue;
        int iIntValue2;
        this.z = false;
        int iOrdinal = getForm().ordinal();
        if (iOrdinal == 0) {
            ylc actionsHorizontalPadding = getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal == 1) {
            ylc actionsHorizontalPadding2 = getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        } else if (iOrdinal == 2) {
            ylc actionsHorizontalPadding3 = getActionsHorizontalPadding();
            iIntValue = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        } else {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            iIntValue = gm0.K(yl5.d().getDisplayMetrics().density * 0.0f);
        }
        int iOrdinal2 = getForm().ordinal();
        if (iOrdinal2 == 0) {
            ylc actionsHorizontalPadding4 = getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal2 == 1) {
            ylc actionsHorizontalPadding5 = getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        } else if (iOrdinal2 == 2) {
            ylc actionsHorizontalPadding6 = getActionsHorizontalPadding();
            iIntValue2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        } else {
            if (iOrdinal2 != 3) {
                ore.o();
                return;
            }
            iIntValue2 = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        }
        setPadding(iIntValue, getPaddingTop(), iIntValue2, getPaddingBottom());
        View view = this.q;
        if (view instanceof t7c) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
            view.setLayoutParams(marginLayoutParams);
            View view2 = this.q;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.p;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.r;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        View view5 = this.r;
        if (view5 instanceof t7c) {
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            view5.setLayoutParams(marginLayoutParams2);
            View view6 = this.p;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            View view7 = this.q;
            if (view7 != null) {
                view7.setVisibility(0);
            }
        }
        this.g.setVisibility(0);
        q();
        ny8 ny8Var = this.k;
        if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).setVisibility(0);
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setVisibility(0);
        }
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    public final void s(CharSequence charSequence, boolean z) {
        if (!this.y || charSequence == null) {
            setSubtitleImmediate(charSequence);
        } else {
            CharSequence text = ((v0g) this.h.getValue()).getText();
            if (!this.x || text == null || z5h.E0(charSequence, text)) {
                setSubtitleImmediate(charSequence);
            } else {
                setSubtitleAnimated(charSequence);
            }
        }
        this.y = z;
    }

    public final void setActionsHorizontalPadding(ylc ylcVar) {
        this.e.B(this, E[4], ylcVar);
    }

    public final void setAvatar(fcc fccVar) {
        if (getForm() == gcc.Main) {
            ore.k("setAvatar can't be applied for Form.Main");
            return;
        }
        int i = 8;
        ny8 ny8Var = this.k;
        if (fccVar != null) {
            kwb kwbVar = (kwb) ny8Var.getValue();
            kwb.w(kwbVar, gm0.K(getForm().a * yl5.d().getDisplayMetrics().density));
            kwbVar.t(gm0.a(fccVar.a(), Long.valueOf(fccVar.c())), true);
            kwbVar.setAvatarUrl(fccVar.e());
            kwb.y(kwbVar, null, null, null, null, 30);
            kwbVar.setOverlay(fccVar.d());
            kwbVar.setFadeDuration(fccVar.b());
            if (!l() && !this.z) {
                i = 0;
            }
            kwbVar.setVisibility(i);
        } else if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).setVisibility(8);
        }
        if (l()) {
            return;
        }
        requestLayout();
    }

    public final void setAvatarAlpha(float f) {
        ny8 ny8Var = this.k;
        if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).setAlpha(f);
        }
    }

    public final void setContentDescription(int i) {
        setContentDescription(np4.q(getContext(), i));
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.a.B(this, E[0], kbcVar);
    }

    public final void setDropdownRotationProgress(float f) {
        ny8 ny8Var = this.l;
        if (ny8Var.d()) {
            ((ImageView) ny8Var.getValue()).setRotation(oc9.u(f, 0.0f, 1.0f) * 180.0f);
        }
    }

    public final void setForm(gcc gccVar) {
        this.b.B(this, E[1], gccVar);
    }

    public final void setLeftActionEnabled(boolean z) {
        ViewGroup viewGroup = this.o;
        if (viewGroup != null) {
            Rect rect = n7j.a;
            viewGroup.setEnabled(z);
            viewGroup.setAlpha(!z ? 0.64f : 1.0f);
        }
    }

    public final void setLeftActions(bcc bccVar) {
        this.d.B(this, E[3], bccVar);
    }

    public final void setPreviewExpandStartHeight(int i) {
        this.D = Integer.valueOf(i);
    }

    public final void setRightActions(dcc dccVar) {
        this.c.B(this, E[2], dccVar);
    }

    public final void setRightPrimaryActionEnabled(boolean z) {
        View view = this.p;
        if (view != null) {
            Rect rect = n7j.a;
            view.setEnabled(z);
            view.setAlpha(!z ? 0.64f : 1.0f);
        }
    }

    public final void setShowDropdown(boolean z) {
        ((View) this.l.getValue()).setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        s(getContext().getText(i), false);
    }

    public final void setTextShimmerEnabled(boolean z) {
        this.f.B(this, E[5], Boolean.valueOf(z));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.g.setAlpha(f);
    }

    public final void setTitleClickListener(af7 af7Var) {
        this.A = af7Var;
    }

    public final void setTitleLongClickListener(af7 af7Var) {
        this.C = af7Var;
    }

    public final void t() {
        int iOrdinal = getForm().ordinal();
        TextView textView = this.g;
        if (iOrdinal == 0) {
            q9i.a(q9i.d, textView);
            textView.setTextColor(getCurrentTheme().getText().b);
            ViewGroup viewGroup = this.o;
            if (viewGroup != null) {
                n1g.c(viewGroup, getLeftActions(), getCustomTheme());
            }
            View view = this.q;
            if (view != null) {
                n1g.d(view, getRightActions(), 2, getCustomTheme());
            }
            View view2 = this.p;
            if (view2 != null) {
                n1g.d(view2, getRightActions(), 1, getCustomTheme());
            }
        } else if (iOrdinal == 1) {
            q9i.a(q9i.c, textView);
            textView.setTextColor(getCurrentTheme().getText().b);
            View view3 = this.q;
            if (view3 != null) {
                n1g.e(view3, getRightActions(), 2);
            }
            View view4 = this.p;
            if (view4 != null) {
                n1g.e(view4, getRightActions(), 1);
            }
        } else if (iOrdinal == 2) {
            q9i.a(q9i.d, textView);
            textView.setTextColor(getCurrentTheme().getText().b);
            ViewGroup viewGroup2 = this.o;
            if (viewGroup2 != null) {
                n1g.c(viewGroup2, getLeftActions(), getCustomTheme());
            }
            View view5 = this.r;
            if (view5 != null) {
                n1g.d(view5, getRightActions(), 3, getCustomTheme());
            }
            View view6 = this.q;
            if (view6 != null) {
                n1g.d(view6, getRightActions(), 2, getCustomTheme());
            }
            View view7 = this.p;
            if (view7 != null) {
                n1g.d(view7, getRightActions(), 1, getCustomTheme());
            }
        } else if (iOrdinal != 3) {
            ore.o();
            return;
        } else {
            q9i.a(q9i.f, textView);
            textView.setTextColor(getCurrentTheme().getText().b);
        }
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            v0g v0gVar = (v0g) ny8Var.getValue();
            zv8 zv8Var = E[5];
            if (((Boolean) this.f.b).booleanValue()) {
                q9i.a(q9i.f, v0gVar);
                v0gVar.setTextColor(getCurrentTheme().getText().c);
            } else {
                q9i.a(q9i.i, v0gVar);
                v0gVar.setTextColor(getCurrentTheme().getText().d);
            }
        }
        ny8 ny8Var2 = this.i;
        if (ny8Var2.d()) {
            v0g v0gVar2 = (v0g) ny8Var2.getValue();
            q9i.a(q9i.i, v0gVar2);
            v0gVar2.setTextColor(getCurrentTheme().getText().d);
        }
        v();
    }

    public final void u() {
        int iOrdinal = getForm().ordinal();
        ny8 ny8Var = this.k;
        TextView textView = this.g;
        if (iOrdinal == 0) {
            textView.setGravity(17);
            if (ny8Var.d()) {
                kwb kwbVar = (kwb) ny8Var.getValue();
                kwb.w(kwbVar, getForm().a);
                ViewGroup.LayoutParams layoutParams = kwbVar.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams.width = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    layoutParams.height = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    kwbVar.setLayoutParams(layoutParams);
                }
            }
            ylc actionsHorizontalPadding = getActionsHorizontalPadding();
            int iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
            ylc actionsHorizontalPadding2 = getActionsHorizontalPadding();
            setPadding(iIntValue, 0, actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.b).intValue() : gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal == 1) {
            textView.setGravity(8388611);
            if (ny8Var.d()) {
                kwb kwbVar2 = (kwb) ny8Var.getValue();
                kwb.w(kwbVar2, getForm().a);
                ViewGroup.LayoutParams layoutParams2 = kwbVar2.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams2.width = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    layoutParams2.height = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    kwbVar2.setLayoutParams(layoutParams2);
                }
            }
            ylc actionsHorizontalPadding3 = getActionsHorizontalPadding();
            int iIntValue2 = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
            ylc actionsHorizontalPadding4 = getActionsHorizontalPadding();
            setPadding(iIntValue2, 0, actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                ore.o();
                return;
            }
            textView.setGravity(8388611);
            if (ny8Var.d()) {
                kwb kwbVar3 = (kwb) ny8Var.getValue();
                kwb.w(kwbVar3, getForm().a);
                ViewGroup.LayoutParams layoutParams3 = kwbVar3.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams3.width = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    layoutParams3.height = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                    kwbVar3.setLayoutParams(layoutParams3);
                }
            }
            setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
            return;
        }
        textView.setGravity(8388611);
        if (ny8Var.d()) {
            kwb kwbVar4 = (kwb) ny8Var.getValue();
            kwb.w(kwbVar4, getForm().a);
            ViewGroup.LayoutParams layoutParams4 = kwbVar4.getLayoutParams();
            if (layoutParams4 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams4.width = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                layoutParams4.height = gm0.K(getForm().a * yl5.d().getDisplayMetrics().density);
                kwbVar4.setLayoutParams(layoutParams4);
            }
        }
        ylc actionsHorizontalPadding5 = getActionsHorizontalPadding();
        int iIntValue3 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.a).intValue() : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        ylc actionsHorizontalPadding6 = getActionsHorizontalPadding();
        setPadding(iIntValue3, 0, actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : gm0.K(4.0f * yl5.d().getDisplayMetrics().density), 0);
    }

    public final void v() {
        ny8 ny8Var = this.h;
        if (ny8Var.d()) {
            ((v0g) ny8Var.getValue()).c(getCurrentTheme().getText().c, getCurrentTheme().getText().g);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.g.setText(charSequence);
    }
}
