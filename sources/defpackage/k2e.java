package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class k2e extends FrameLayout {
    public static final float t = yl5.d().getDisplayMetrics().density * 24.0f;
    public final FloatEvaluator a;
    public boolean b;
    public ValueAnimator c;
    public n2e d;
    public uvc e;
    public c7k f;
    public final hj2 g;
    public final cs h;
    public final m5c i;
    public final Chronometer j;
    public final LinearLayout k;
    public final m5c l;
    public final nd2 m;
    public final m5c n;
    public final m5c o;
    public final FrameLayout p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
    public k2e(Context context) {
        super(context, null, 0, 0);
        final int i = 0;
        this.a = new FloatEvaluator();
        hj2 hj2Var = new hj2(context);
        hj2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g = hj2Var;
        cs csVar = new cs(context);
        csVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        a8g a8gVar = pq3.j;
        a8gVar.h(csVar);
        csVar.setImageTintList(ColorStateList.valueOf(-1));
        csVar.setImageResource(R.drawable.icon_camera);
        this.h = csVar;
        m5c m5cVar = new m5c(context);
        m5cVar.setId(R.id.quick_camera_view__close_button);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388659);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        m5cVar.setLayoutParams(layoutParams);
        j5c j5cVar = j5c.b;
        m5cVar.setMode(j5cVar);
        float f = t;
        m5cVar.a(f, R.drawable.icon_cross, "M12 10.586L5.734 4.32c-0.39-0.39-1.024-0.39-1.414 0-0.39 0.39-0.39 1.023 0 1.414L10.586 12 4.32 18.266c-0.39 0.39-0.39 1.024 0 1.414 0.39 0.39 1.023 0.39 1.414 0L12 13.414l6.266 6.266c0.39 0.39 1.024 0.39 1.414 0 0.39-0.39 0.39-1.024 0-1.414L13.414 12l6.266-6.266c0.39-0.39 0.39-1.023 0-1.414-0.39-0.39-1.024-0.39-1.414 0L12 10.586z");
        qe7.H(m5cVar, 300L, new View.OnClickListener(this) { // from class: g2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object obj;
                int i2 = i;
                a2e a2eVar = a2e.a;
                boolean z = false;
                k2e k2eVar = this.b;
                switch (i2) {
                    case 0:
                        c7k c7kVar = k2eVar.f;
                        if (c7kVar != null) {
                            wd2 wd2Var = (wd2) c7kVar.b;
                            int i3 = wd2.o;
                            wd2Var.d(false, true);
                            vd2 listener = wd2Var.getListener();
                            if (listener != null) {
                                listener.P();
                            }
                        }
                        break;
                    case 1:
                        n2e n2eVar = k2eVar.d;
                        (n2eVar != null ? n2eVar : null).D();
                        break;
                    case 2:
                        n2e n2eVar2 = k2eVar.d;
                        if (n2eVar2 == null) {
                            n2eVar2 = null;
                        }
                        ic6 ic6Var = n2eVar2.o;
                        mjg mjgVar = n2eVar2.m;
                        gm0.n("QuickCameraViewModel", "onClickTake(). State: " + mjgVar.getValue());
                        b2e b2eVar = (b2e) mjgVar.getValue();
                        if (b2eVar instanceof x1e) {
                            mjgVar.j(null, y1e.a);
                            f5d f5dVar = (f5d) n2eVar2.j;
                            f5dVar.getClass();
                            ghb ghbVar = ew5.b;
                            a8j.x(ic6Var, new u1e(qe7.P(((Number) f5dVar.a.x2.a(e5d.S6[179]).i()).longValue(), lw5.SECONDS)));
                        } else if (!(b2eVar instanceof y1e)) {
                            if (!(b2eVar instanceof a2e)) {
                                if (!(b2eVar instanceof z1e)) {
                                    ore.o();
                                } else {
                                    mjgVar.j(null, a2eVar);
                                    a8j.x(ic6Var, t1e.a);
                                }
                            } else if (!n2eVar2.q.i()) {
                                n2eVar2.C();
                                a8j.x(n2eVar2.p, d2e.a);
                            } else {
                                mjgVar.j(null, new z1e(SystemClock.elapsedRealtime()));
                                a8j.x(ic6Var, new s1e(((ju6) n2eVar2.f).t(n2eVar2.g.d())));
                            }
                        }
                        break;
                    case 3:
                        oc2 cameraApi = k2eVar.getCameraApi();
                        p09 p09Var = ((hj2) k2eVar.getCameraApi()).c;
                        p09Var.getClass();
                        wxl.a();
                        o09 o09Var = p09Var.q;
                        nf2 nf2VarA = o09Var != null ? o09Var.a() : null;
                        if (nf2VarA != null && ((r97) nf2VarA).a.j() == 0) {
                            z = true;
                        }
                        hj2 hj2Var2 = (hj2) cameraApi;
                        hj2Var2.getClass();
                        try {
                            hj2Var2.c.n(!z ? fh2.b : fh2.c);
                        } catch (IllegalStateException e) {
                            gm0.V(hj2.class.getName(), "Switch camera exception", new ej2(e));
                            return;
                        }
                        break;
                    default:
                        n2e n2eVar3 = k2eVar.d;
                        n2e n2eVar4 = n2eVar3 == null ? null : n2eVar3;
                        mjg mjgVar2 = n2eVar4.m;
                        do {
                            value = mjgVar2.getValue();
                            obj = (b2e) value;
                            if (obj instanceof x1e) {
                                n2eVar4.B(true);
                                obj = a2eVar;
                            } else if (obj instanceof a2e) {
                                n2eVar4.B(false);
                                obj = x1e.a;
                            } else if (!(obj instanceof z1e) && !(obj instanceof y1e)) {
                                ore.o();
                            }
                            break;
                        } while (!mjgVar2.h(value, obj));
                        break;
                }
            }
        });
        this.i = m5cVar;
        Chronometer chronometer = new Chronometer(context);
        a8gVar.h(chronometer);
        chronometer.setTextColor(-1);
        this.j = chronometer;
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 1);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
        sb8.m0(a8gVar.h(linearLayout).h().i, gradientDrawable);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        cs csVar2 = new cs(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams3.setMargins(((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        csVar2.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        sb8.m0(a8gVar.h(csVar2).h().d, gradientDrawable2);
        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 6.0f);
        csVar2.setImageDrawable(gradientDrawable2);
        linearLayout.addView(csVar2);
        linearLayout.addView(chronometer);
        this.k = linearLayout;
        m5c m5cVar2 = new m5c(context);
        m5cVar2.setId(R.id.quick_camera_view__flash_button);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams4.setMargins(gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        m5cVar2.setLayoutParams(layoutParams4);
        m5cVar2.setMode(j5cVar);
        final int i2 = 1;
        qe7.H(m5cVar2, 300L, new View.OnClickListener(this) { // from class: g2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object obj;
                int i3 = i2;
                a2e a2eVar = a2e.a;
                boolean z = false;
                k2e k2eVar = this.b;
                switch (i3) {
                    case 0:
                        c7k c7kVar = k2eVar.f;
                        if (c7kVar != null) {
                            wd2 wd2Var = (wd2) c7kVar.b;
                            int i4 = wd2.o;
                            wd2Var.d(false, true);
                            vd2 listener = wd2Var.getListener();
                            if (listener != null) {
                                listener.P();
                            }
                        }
                        break;
                    case 1:
                        n2e n2eVar = k2eVar.d;
                        (n2eVar != null ? n2eVar : null).D();
                        break;
                    case 2:
                        n2e n2eVar2 = k2eVar.d;
                        if (n2eVar2 == null) {
                            n2eVar2 = null;
                        }
                        ic6 ic6Var = n2eVar2.o;
                        mjg mjgVar = n2eVar2.m;
                        gm0.n("QuickCameraViewModel", "onClickTake(). State: " + mjgVar.getValue());
                        b2e b2eVar = (b2e) mjgVar.getValue();
                        if (b2eVar instanceof x1e) {
                            mjgVar.j(null, y1e.a);
                            f5d f5dVar = (f5d) n2eVar2.j;
                            f5dVar.getClass();
                            ghb ghbVar = ew5.b;
                            a8j.x(ic6Var, new u1e(qe7.P(((Number) f5dVar.a.x2.a(e5d.S6[179]).i()).longValue(), lw5.SECONDS)));
                        } else if (!(b2eVar instanceof y1e)) {
                            if (!(b2eVar instanceof a2e)) {
                                if (!(b2eVar instanceof z1e)) {
                                    ore.o();
                                } else {
                                    mjgVar.j(null, a2eVar);
                                    a8j.x(ic6Var, t1e.a);
                                }
                            } else if (!n2eVar2.q.i()) {
                                n2eVar2.C();
                                a8j.x(n2eVar2.p, d2e.a);
                            } else {
                                mjgVar.j(null, new z1e(SystemClock.elapsedRealtime()));
                                a8j.x(ic6Var, new s1e(((ju6) n2eVar2.f).t(n2eVar2.g.d())));
                            }
                        }
                        break;
                    case 3:
                        oc2 cameraApi = k2eVar.getCameraApi();
                        p09 p09Var = ((hj2) k2eVar.getCameraApi()).c;
                        p09Var.getClass();
                        wxl.a();
                        o09 o09Var = p09Var.q;
                        nf2 nf2VarA = o09Var != null ? o09Var.a() : null;
                        if (nf2VarA != null && ((r97) nf2VarA).a.j() == 0) {
                            z = true;
                        }
                        hj2 hj2Var2 = (hj2) cameraApi;
                        hj2Var2.getClass();
                        try {
                            hj2Var2.c.n(!z ? fh2.b : fh2.c);
                        } catch (IllegalStateException e) {
                            gm0.V(hj2.class.getName(), "Switch camera exception", new ej2(e));
                            return;
                        }
                        break;
                    default:
                        n2e n2eVar3 = k2eVar.d;
                        n2e n2eVar4 = n2eVar3 == null ? null : n2eVar3;
                        mjg mjgVar2 = n2eVar4.m;
                        do {
                            value = mjgVar2.getValue();
                            obj = (b2e) value;
                            if (obj instanceof x1e) {
                                n2eVar4.B(true);
                                obj = a2eVar;
                            } else if (obj instanceof a2e) {
                                n2eVar4.B(false);
                                obj = x1e.a;
                            } else if (!(obj instanceof z1e) && !(obj instanceof y1e)) {
                                ore.o();
                            }
                            break;
                        } while (!mjgVar2.h(value, obj));
                        break;
                }
            }
        });
        this.l = m5cVar2;
        nd2 nd2Var = new nd2(context);
        nd2Var.setLayoutParams(new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(72.0f * yl5.d().getDisplayMetrics().density), 17));
        final int i3 = 2;
        qe7.H(nd2Var, 300L, new View.OnClickListener(this) { // from class: g2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object obj;
                int i4 = i3;
                a2e a2eVar = a2e.a;
                boolean z = false;
                k2e k2eVar = this.b;
                switch (i4) {
                    case 0:
                        c7k c7kVar = k2eVar.f;
                        if (c7kVar != null) {
                            wd2 wd2Var = (wd2) c7kVar.b;
                            int i5 = wd2.o;
                            wd2Var.d(false, true);
                            vd2 listener = wd2Var.getListener();
                            if (listener != null) {
                                listener.P();
                            }
                        }
                        break;
                    case 1:
                        n2e n2eVar = k2eVar.d;
                        (n2eVar != null ? n2eVar : null).D();
                        break;
                    case 2:
                        n2e n2eVar2 = k2eVar.d;
                        if (n2eVar2 == null) {
                            n2eVar2 = null;
                        }
                        ic6 ic6Var = n2eVar2.o;
                        mjg mjgVar = n2eVar2.m;
                        gm0.n("QuickCameraViewModel", "onClickTake(). State: " + mjgVar.getValue());
                        b2e b2eVar = (b2e) mjgVar.getValue();
                        if (b2eVar instanceof x1e) {
                            mjgVar.j(null, y1e.a);
                            f5d f5dVar = (f5d) n2eVar2.j;
                            f5dVar.getClass();
                            ghb ghbVar = ew5.b;
                            a8j.x(ic6Var, new u1e(qe7.P(((Number) f5dVar.a.x2.a(e5d.S6[179]).i()).longValue(), lw5.SECONDS)));
                        } else if (!(b2eVar instanceof y1e)) {
                            if (!(b2eVar instanceof a2e)) {
                                if (!(b2eVar instanceof z1e)) {
                                    ore.o();
                                } else {
                                    mjgVar.j(null, a2eVar);
                                    a8j.x(ic6Var, t1e.a);
                                }
                            } else if (!n2eVar2.q.i()) {
                                n2eVar2.C();
                                a8j.x(n2eVar2.p, d2e.a);
                            } else {
                                mjgVar.j(null, new z1e(SystemClock.elapsedRealtime()));
                                a8j.x(ic6Var, new s1e(((ju6) n2eVar2.f).t(n2eVar2.g.d())));
                            }
                        }
                        break;
                    case 3:
                        oc2 cameraApi = k2eVar.getCameraApi();
                        p09 p09Var = ((hj2) k2eVar.getCameraApi()).c;
                        p09Var.getClass();
                        wxl.a();
                        o09 o09Var = p09Var.q;
                        nf2 nf2VarA = o09Var != null ? o09Var.a() : null;
                        if (nf2VarA != null && ((r97) nf2VarA).a.j() == 0) {
                            z = true;
                        }
                        hj2 hj2Var2 = (hj2) cameraApi;
                        hj2Var2.getClass();
                        try {
                            hj2Var2.c.n(!z ? fh2.b : fh2.c);
                        } catch (IllegalStateException e) {
                            gm0.V(hj2.class.getName(), "Switch camera exception", new ej2(e));
                            return;
                        }
                        break;
                    default:
                        n2e n2eVar3 = k2eVar.d;
                        n2e n2eVar4 = n2eVar3 == null ? null : n2eVar3;
                        mjg mjgVar2 = n2eVar4.m;
                        do {
                            value = mjgVar2.getValue();
                            obj = (b2e) value;
                            if (obj instanceof x1e) {
                                n2eVar4.B(true);
                                obj = a2eVar;
                            } else if (obj instanceof a2e) {
                                n2eVar4.B(false);
                                obj = x1e.a;
                            } else if (!(obj instanceof z1e) && !(obj instanceof y1e)) {
                                ore.o();
                            }
                            break;
                        } while (!mjgVar2.h(value, obj));
                        break;
                }
            }
        });
        this.m = nd2Var;
        m5c m5cVar3 = new m5c(context);
        m5cVar3.setId(R.id.quick_camera_view__switch_camera_button);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams5.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 90.0f), ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin);
        m5cVar3.setLayoutParams(layoutParams5);
        m5cVar3.setMode(j5cVar);
        m5cVar3.a(f, R.drawable.icon_change_camera, "M16.472 8C15.374 6.772 13.777 6 12 6c-2.974 0-5.443 2.164-5.918 5.004C5.992 11.55 5.552 12 5 12s-1.006-0.45-0.938-0.998C4.552 7.055 7.92 4 12 4c2.39 0 4.534 1.047 6 2.708V5c0-0.552 0.448-1 1-1s1 0.448 1 1v4c0 0.552-0.448 1-1 1h-4c-0.552 0-1-0.448-1-1s0.448-1 1-1h1.472zM10 15c0-0.552-0.448-1-1-1H5c-0.552 0-1 0.448-1 1v4c0 0.552 0.448 1 1 1s1-0.448 1-1v-1.708C7.466 18.952 9.61 20 12 20c4.08 0 7.447-3.055 7.938-7.002C20.007 12.45 19.552 12 19 12c-0.552 0-0.991 0.451-1.082 0.996C17.443 15.836 14.975 18 12 18c-1.777 0-3.374-0.773-4.472-2H9c0.552 0 1-0.448 1-1z");
        final int i4 = 3;
        qe7.H(m5cVar3, 300L, new View.OnClickListener(this) { // from class: g2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object obj;
                int i5 = i4;
                a2e a2eVar = a2e.a;
                boolean z = false;
                k2e k2eVar = this.b;
                switch (i5) {
                    case 0:
                        c7k c7kVar = k2eVar.f;
                        if (c7kVar != null) {
                            wd2 wd2Var = (wd2) c7kVar.b;
                            int i6 = wd2.o;
                            wd2Var.d(false, true);
                            vd2 listener = wd2Var.getListener();
                            if (listener != null) {
                                listener.P();
                            }
                        }
                        break;
                    case 1:
                        n2e n2eVar = k2eVar.d;
                        (n2eVar != null ? n2eVar : null).D();
                        break;
                    case 2:
                        n2e n2eVar2 = k2eVar.d;
                        if (n2eVar2 == null) {
                            n2eVar2 = null;
                        }
                        ic6 ic6Var = n2eVar2.o;
                        mjg mjgVar = n2eVar2.m;
                        gm0.n("QuickCameraViewModel", "onClickTake(). State: " + mjgVar.getValue());
                        b2e b2eVar = (b2e) mjgVar.getValue();
                        if (b2eVar instanceof x1e) {
                            mjgVar.j(null, y1e.a);
                            f5d f5dVar = (f5d) n2eVar2.j;
                            f5dVar.getClass();
                            ghb ghbVar = ew5.b;
                            a8j.x(ic6Var, new u1e(qe7.P(((Number) f5dVar.a.x2.a(e5d.S6[179]).i()).longValue(), lw5.SECONDS)));
                        } else if (!(b2eVar instanceof y1e)) {
                            if (!(b2eVar instanceof a2e)) {
                                if (!(b2eVar instanceof z1e)) {
                                    ore.o();
                                } else {
                                    mjgVar.j(null, a2eVar);
                                    a8j.x(ic6Var, t1e.a);
                                }
                            } else if (!n2eVar2.q.i()) {
                                n2eVar2.C();
                                a8j.x(n2eVar2.p, d2e.a);
                            } else {
                                mjgVar.j(null, new z1e(SystemClock.elapsedRealtime()));
                                a8j.x(ic6Var, new s1e(((ju6) n2eVar2.f).t(n2eVar2.g.d())));
                            }
                        }
                        break;
                    case 3:
                        oc2 cameraApi = k2eVar.getCameraApi();
                        p09 p09Var = ((hj2) k2eVar.getCameraApi()).c;
                        p09Var.getClass();
                        wxl.a();
                        o09 o09Var = p09Var.q;
                        nf2 nf2VarA = o09Var != null ? o09Var.a() : null;
                        if (nf2VarA != null && ((r97) nf2VarA).a.j() == 0) {
                            z = true;
                        }
                        hj2 hj2Var2 = (hj2) cameraApi;
                        hj2Var2.getClass();
                        try {
                            hj2Var2.c.n(!z ? fh2.b : fh2.c);
                        } catch (IllegalStateException e) {
                            gm0.V(hj2.class.getName(), "Switch camera exception", new ej2(e));
                            return;
                        }
                        break;
                    default:
                        n2e n2eVar3 = k2eVar.d;
                        n2e n2eVar4 = n2eVar3 == null ? null : n2eVar3;
                        mjg mjgVar2 = n2eVar4.m;
                        do {
                            value = mjgVar2.getValue();
                            obj = (b2e) value;
                            if (obj instanceof x1e) {
                                n2eVar4.B(true);
                                obj = a2eVar;
                            } else if (obj instanceof a2e) {
                                n2eVar4.B(false);
                                obj = x1e.a;
                            } else if (!(obj instanceof z1e) && !(obj instanceof y1e)) {
                                ore.o();
                            }
                            break;
                        } while (!mjgVar2.h(value, obj));
                        break;
                }
            }
        });
        this.n = m5cVar3;
        m5c m5cVar4 = new m5c(context);
        m5cVar4.setId(R.id.quick_camera_view__switch_record_mode_button);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin, gm0.K(90.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
        m5cVar4.setLayoutParams(layoutParams6);
        m5cVar4.setMode(j5cVar);
        final int i5 = 4;
        qe7.H(m5cVar4, 300L, new View.OnClickListener(this) { // from class: g2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                Object obj;
                int i6 = i5;
                a2e a2eVar = a2e.a;
                boolean z = false;
                k2e k2eVar = this.b;
                switch (i6) {
                    case 0:
                        c7k c7kVar = k2eVar.f;
                        if (c7kVar != null) {
                            wd2 wd2Var = (wd2) c7kVar.b;
                            int i7 = wd2.o;
                            wd2Var.d(false, true);
                            vd2 listener = wd2Var.getListener();
                            if (listener != null) {
                                listener.P();
                            }
                        }
                        break;
                    case 1:
                        n2e n2eVar = k2eVar.d;
                        (n2eVar != null ? n2eVar : null).D();
                        break;
                    case 2:
                        n2e n2eVar2 = k2eVar.d;
                        if (n2eVar2 == null) {
                            n2eVar2 = null;
                        }
                        ic6 ic6Var = n2eVar2.o;
                        mjg mjgVar = n2eVar2.m;
                        gm0.n("QuickCameraViewModel", "onClickTake(). State: " + mjgVar.getValue());
                        b2e b2eVar = (b2e) mjgVar.getValue();
                        if (b2eVar instanceof x1e) {
                            mjgVar.j(null, y1e.a);
                            f5d f5dVar = (f5d) n2eVar2.j;
                            f5dVar.getClass();
                            ghb ghbVar = ew5.b;
                            a8j.x(ic6Var, new u1e(qe7.P(((Number) f5dVar.a.x2.a(e5d.S6[179]).i()).longValue(), lw5.SECONDS)));
                        } else if (!(b2eVar instanceof y1e)) {
                            if (!(b2eVar instanceof a2e)) {
                                if (!(b2eVar instanceof z1e)) {
                                    ore.o();
                                } else {
                                    mjgVar.j(null, a2eVar);
                                    a8j.x(ic6Var, t1e.a);
                                }
                            } else if (!n2eVar2.q.i()) {
                                n2eVar2.C();
                                a8j.x(n2eVar2.p, d2e.a);
                            } else {
                                mjgVar.j(null, new z1e(SystemClock.elapsedRealtime()));
                                a8j.x(ic6Var, new s1e(((ju6) n2eVar2.f).t(n2eVar2.g.d())));
                            }
                        }
                        break;
                    case 3:
                        oc2 cameraApi = k2eVar.getCameraApi();
                        p09 p09Var = ((hj2) k2eVar.getCameraApi()).c;
                        p09Var.getClass();
                        wxl.a();
                        o09 o09Var = p09Var.q;
                        nf2 nf2VarA = o09Var != null ? o09Var.a() : null;
                        if (nf2VarA != null && ((r97) nf2VarA).a.j() == 0) {
                            z = true;
                        }
                        hj2 hj2Var2 = (hj2) cameraApi;
                        hj2Var2.getClass();
                        try {
                            hj2Var2.c.n(!z ? fh2.b : fh2.c);
                        } catch (IllegalStateException e) {
                            gm0.V(hj2.class.getName(), "Switch camera exception", new ej2(e));
                            return;
                        }
                        break;
                    default:
                        n2e n2eVar3 = k2eVar.d;
                        n2e n2eVar4 = n2eVar3 == null ? null : n2eVar3;
                        mjg mjgVar2 = n2eVar4.m;
                        do {
                            value = mjgVar2.getValue();
                            obj = (b2e) value;
                            if (obj instanceof x1e) {
                                n2eVar4.B(true);
                                obj = a2eVar;
                            } else if (obj instanceof a2e) {
                                n2eVar4.B(false);
                                obj = x1e.a;
                            } else if (!(obj instanceof z1e) && !(obj instanceof y1e)) {
                                ore.o();
                            }
                            break;
                        } while (!mjgVar2.h(value, obj));
                        break;
                }
            }
        });
        this.o = m5cVar4;
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams7.setMargins(((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin, gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        frameLayout.setLayoutParams(layoutParams7);
        frameLayout.addView(m5cVar4);
        frameLayout.addView(nd2Var);
        frameLayout.addView(m5cVar3);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.addView(m5cVar);
        frameLayout2.addView(linearLayout);
        frameLayout2.addView(m5cVar2);
        frameLayout2.addView(frameLayout);
        final int i6 = 0;
        lvb.H(frameLayout2, new oi8(0, 3, 0, new j11(3, 3, false), 5), null);
        this.p = frameLayout2;
        this.q = rx8.P(3, new af7(this) { // from class: h2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                k2e k2eVar = this.b;
                switch (i7) {
                    case 0:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_auto).mutate();
                    case 1:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash).mutate();
                    default:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_crossed).mutate();
                }
            }
        });
        final int i7 = 1;
        this.r = rx8.P(3, new af7(this) { // from class: h2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                k2e k2eVar = this.b;
                switch (i8) {
                    case 0:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_auto).mutate();
                    case 1:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash).mutate();
                    default:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_crossed).mutate();
                }
            }
        });
        final int i8 = 2;
        this.s = rx8.P(3, new af7(this) { // from class: h2e
            public final /* synthetic */ k2e b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                k2e k2eVar = this.b;
                switch (i9) {
                    case 0:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_auto).mutate();
                    case 1:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash).mutate();
                    default:
                        return k2eVar.getContext().getDrawable(R.drawable.icon_flash_crossed).mutate();
                }
            }
        });
        addView(hj2Var);
        addView(csVar);
        addView(frameLayout2);
        setBackgroundColor(-16777216);
    }

    public static final void b(k2e k2eVar, l2e l2eVar) {
        Drawable flashOffDrawable;
        String str;
        String str2;
        m5c m5cVar = k2eVar.l;
        m5cVar.setVisibility(l2eVar.c ? 0 : 8);
        if (!l2eVar.c) {
            gm0.x(k2e.class.getName(), "Flash don't supported on device", null);
            return;
        }
        int i = l2eVar.d ? l2eVar.b : l2eVar.a;
        int iD = qt4.D(i);
        if (iD == 0) {
            flashOffDrawable = k2eVar.getFlashOffDrawable();
        } else if (iD == 1) {
            flashOffDrawable = k2eVar.getFlashOnDrawable();
        } else if (iD == 2) {
            flashOffDrawable = k2eVar.getFlashAutoDrawable();
        } else {
            if (iD != 3) {
                ore.o();
                return;
            }
            flashOffDrawable = k2eVar.getFlashOnDrawable();
        }
        int iD2 = qt4.D(i);
        if (iD2 != 0) {
            str = "M14.16 3.854l-7.786 8.384 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 7.786-8.384-3.643-0.52c-1.23-0.176-1.987-1.439-1.563-2.607l1.74-4.781zm0.285-3.248c1.098-1.181 3.025-0.003 2.474 1.512l-2.6 7.152 4.576 0.653c1.181 0.17 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.51l2.601-7.153-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l10.214-11z";
            if (iD2 != 1) {
                if (iD2 == 2) {
                    str = "M14.919 2.118c0.55-1.515-1.376-2.693-2.474-1.512l-10.214 11c-0.812 0.875-0.307 2.302 0.874 2.47l4.577 0.654-2.6 7.152c-0.552 1.515 1.376 2.693 2.473 1.511l10.214-11c0.812-0.874 0.307-2.3-0.874-2.47L12.318 9.27l2.6-7.152zM4.374 12.238l7.785-8.384-1.739 4.781c-0.424 1.168 0.333 2.431 1.563 2.607l3.643 0.52-7.785 8.384 1.739-4.782c0.424-1.168-0.333-2.43-1.563-2.606l-3.643-0.52zm15.456 3.843c-0.53-1.428-2.546-1.438-3.09-0.015l-2.181 5.713c-0.177 0.464 0.055 0.984 0.52 1.162 0.464 0.177 0.984-0.056 1.162-0.52l0.395-1.036h3.239l0.38 1.028c0.174 0.466 0.691 0.704 1.158 0.53 0.466-0.172 0.703-0.69 0.53-1.156l-2.114-5.706zm-0.622 3.504L18.28 17.08l-0.956 2.504h1.884z";
                } else if (iD2 != 3) {
                    ore.o();
                    return;
                }
            }
        } else {
            str = "M10 5.792c0-0.301 0.133-0.571 0.344-0.755l4.101-4.43c1.098-1.182 3.025-0.004 2.474 1.51l-1.643 4.52h0.002l-0.33 0.9-0.561 1.543-0.003-0.003-0.07 0.192 0.306 0.044 4.275 0.61c1.181 0.17 1.686 1.596 0.874 2.47l-1 1.069c-0.182 0.188-0.437 0.305-0.72 0.305-0.552 0-1-0.448-1-1 0-0.302 0.134-0.573 0.346-0.756l0.23-0.249-0.649-0.092-0.008-0.008-1.668-0.23-2.855-2.866 0.972-2.68h0.003l0.74-2.032-2.372 2.553C11.605 6.641 11.32 6.792 11 6.792c-0.552 0-1-0.448-1-1z M7.101 8.516L3.293 4.707c-0.39-0.39-0.39-1.024 0-1.414 0.39-0.39 1.024-0.39 1.414 0l16 16c0.39 0.39 0.39 1.024 0 1.414-0.39 0.39-1.024 0.39-1.414 0l-3.756-3.756-5.982 6.443c-1.097 1.181-3.025 0.003-2.474-1.512l2.601-7.152-4.577-0.653c-1.181-0.17-1.686-1.596-0.874-2.47l2.87-3.091zm7.02 7.02L8.518 9.93l-2.143 2.307 3.643 0.52c1.23 0.176 1.987 1.439 1.563 2.607l-1.74 4.781 4.282-4.61z";
        }
        m5cVar.b(flashOffDrawable, str, t);
        oc2 cameraApi = k2eVar.getCameraApi();
        if (i == 1) {
            str2 = "OFF";
        } else if (i == 2) {
            str2 = "ON";
        } else if (i == 3) {
            str2 = "AUTO";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "TORCH";
        }
        ((hj2) cameraApi).setFlash(str2);
    }

    public static final void c(k2e k2eVar, float f, float f2, float f3, float f4, float f5) {
        cs csVar = k2eVar.h;
        FloatEvaluator floatEvaluator = k2eVar.a;
        csVar.setAlpha(floatEvaluator.evaluate(f5, (Number) Float.valueOf(f), (Number) Float.valueOf(f2)).floatValue());
        k2eVar.p.setAlpha(floatEvaluator.evaluate(f5, (Number) Float.valueOf(f3), (Number) Float.valueOf(f4)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCanRecordingVideo() {
        return this.b;
    }

    private final Drawable getFlashAutoDrawable() {
        return (Drawable) this.q.getValue();
    }

    private final Drawable getFlashOffDrawable() {
        return (Drawable) this.s.getValue();
    }

    private final Drawable getFlashOnDrawable() {
        return (Drawable) this.r.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b) {
            return false;
        }
        if (keyEvent.getKeyCode() != 25 && keyEvent.getKeyCode() != 24) {
            return false;
        }
        int action = keyEvent.getAction();
        return action == 0 || action == 1;
    }

    public final oc2 getCameraApi() {
        return this.g;
    }
}
