package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class kwb extends View implements eph, Animatable {
    public static final ghb r1;
    public static final /* synthetic */ zv8[] s1;
    public final c9b A;
    public af7 B;
    public af7 C;
    public boolean D;
    public af7 E;
    public boolean F;
    public sj0 G;
    public rk0 H;
    public int I;
    public boolean J;
    public final dpe K;
    public final String a;
    public final eu5 b;
    public dwb c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final qj0 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public boolean n;
    public final fwb n1;
    public final ny8 o;
    public long o1;
    public final ny8 p;
    public List p1;
    public final ny8 q;
    public int q1;
    public boolean r;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public boolean v;
    public final ny8 w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    static {
        z8b z8bVar = new z8b(kwb.class, "storiesVisible", "getStoriesVisible()Z");
        zfe.a.getClass();
        s1 = new zv8[]{z8bVar};
        r1 = new ghb(20);
    }

    public kwb(Context context) {
        super(context, null);
        this.a = kwb.class.getName();
        eu5 eu5Var = new eu5(new xj7(getResources()).a());
        ote oteVarD = eu5Var.d();
        if (oteVarD != null) {
            oteVarD.setCallback(this);
        }
        du5 du5Var = eu5Var.d;
        du5Var.getClass();
        wj6 wj6Var = ((wj7) du5Var).e;
        wj6Var.l = 50;
        final int i = 1;
        final int i2 = 0;
        if (wj6Var.k == 1) {
            wj6Var.k = 0;
        }
        this.b = eu5Var;
        this.c = awb.a;
        this.q1 = 1;
        this.h = new qj0(this);
        final int i3 = 5;
        final int i4 = 3;
        this.i = rx8.P(3, new vvb(context, this, 5));
        final int i5 = 7;
        this.j = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i6) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i7 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i7);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i8 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i8);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.k = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i2;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i6) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i7 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i7);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i8 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i8);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.l = rx8.P(3, new vvb(context, this, 0));
        this.m = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i6) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i7 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i7);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i8 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i8);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.o = rx8.P(3, new vvb(context, this, 1));
        final int i6 = 2;
        this.p = rx8.P(3, new vvb(context, this, 2));
        this.q = rx8.P(3, new vvb(context, this, 3));
        this.s = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i7) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i8 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i8);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i9 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i9);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        final int i7 = 4;
        this.t = rx8.P(3, new vvb(context, this, 4));
        this.u = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i4;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i8) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i9 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i9);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i10 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i10);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.w = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i8) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i9 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i9);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i10 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i10);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.x = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i3;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i8) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i9 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i9);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i10 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i10);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        final int i8 = 6;
        this.y = rx8.P(3, new af7(this) { // from class: uvb
            public final /* synthetic */ kwb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                a8g a8gVar = pq3.j;
                kwb kwbVar = this.b;
                switch (i9) {
                    case 0:
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(kwbVar).b().c);
                        return shapeDrawable;
                    case 1:
                        return kwb.a(kwbVar);
                    case 2:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        gradientDrawable.setSize(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
                        gradientDrawable.setCallback(kwbVar);
                        return gradientDrawable;
                    case 3:
                        return kwb.d(kwbVar);
                    case 4:
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(kwbVar).b().c);
                        gradientDrawable2.setColor(a8gVar.h(kwbVar).getIcon().h);
                        gradientDrawable2.setCornerRadius(yl5.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable2;
                    case 5:
                        a8gVar.h(kwbVar);
                        Drawable drawableMutate = kwbVar.getContext().getDrawable(R.drawable.icon_call_fill).mutate();
                        sb8.m0(-1, drawableMutate);
                        return drawableMutate;
                    case 6:
                        return kwb.b(kwbVar);
                    default:
                        yt5 yt5Var = new yt5();
                        int i10 = a8gVar.h(kwbVar).b().c;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        yt5Var.addLayer(shapeDrawable2);
                        Paint paint = shapeDrawable2.getPaint();
                        if (paint != null) {
                            paint.setColor(i10);
                        }
                        yt5Var.setLayerGravity(0, 17);
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setOrientation(orientation);
                        gradientDrawable3.setGradientType(0);
                        gradientDrawable3.setColors(new int[]{-13783297, -5685249});
                        gradientDrawable3.setShape(1);
                        yt5Var.addLayer(gradientDrawable3);
                        yt5Var.setLayerGravity(1, 17);
                        Drawable drawableMutate2 = kwbVar.getContext().getDrawable(R.drawable.icon_plus).mutate();
                        int i11 = a8gVar.h(kwbVar).getIcon().g;
                        yt5Var.addLayer(drawableMutate2);
                        drawableMutate2.setTint(i11);
                        yt5Var.setLayerGravity(2, 17);
                        yt5Var.setCallback(kwbVar);
                        return yt5Var;
                }
            }
        });
        this.z = rx8.P(3, new vvb(this, context));
        this.A = new c9b(4);
        this.I = 50;
        this.K = new dpe();
        this.n1 = new fwb(this);
        this.o1 = bj8.a(0, 0);
        eu5Var.i(q());
        du5 du5Var2 = eu5Var.d;
        du5Var2.getClass();
        ((wj7) du5Var2).m(this.c.a(getStoriesVisible()));
    }

    public static LayerDrawable a(kwb kwbVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kwbVar.getNewStoriesErrorBgDrawable(), kwbVar.getNewStoriesErrorIconDrawable()});
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(22.0f * yl5.d().getDisplayMetrics().density);
        int i = (iK - iK2) / 2;
        layerDrawable.setLayerSize(0, iK, iK);
        layerDrawable.setLayerSize(1, iK2, iK2);
        layerDrawable.setLayerInset(1, i, i, i, i);
        layerDrawable.setCallback(kwbVar);
        return layerDrawable;
    }

    public static LayerDrawable b(kwb kwbVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kwbVar.getCallBadgeBackgroundDrawable(), kwbVar.getCallIconDrawable()});
        int iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int i = (iK - iK2) / 2;
        layerDrawable.setLayerSize(0, iK, iK);
        layerDrawable.setLayerSize(1, iK2, iK2);
        layerDrawable.setLayerInset(1, i, i, i, i);
        layerDrawable.setCallback(kwbVar);
        return layerDrawable;
    }

    public static LayerDrawable d(kwb kwbVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kwbVar.getLiveStreamBackgroundDrawable(), kwbVar.getLiveStreamWavesDrawable()});
        int iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int i = (iK - iK2) / 2;
        layerDrawable.setLayerSize(0, iK, iK);
        layerDrawable.setLayerSize(1, iK2, iK2);
        layerDrawable.setLayerInset(1, i, i, i, i);
        layerDrawable.setCallback(kwbVar);
        return layerDrawable;
    }

    private final Drawable getActiveStoriesIconDrawable() {
        return this.n ? getNewStoriesErrorDrawable() : getNewStoriesDrawable();
    }

    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.o.getValue();
    }

    private final GradientDrawable getCallBadgeBackgroundDrawable() {
        return (GradientDrawable) this.w.getValue();
    }

    private final LayerDrawable getCallBadgeDrawable() {
        return (LayerDrawable) this.y.getValue();
    }

    private final Drawable getCallIconDrawable() {
        return (Drawable) this.x.getValue();
    }

    private final qk0 getCallPlaceholderLink() {
        return (qk0) this.z.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.q.getValue();
    }

    private final GradientDrawable getLiveStreamBackgroundDrawable() {
        return (GradientDrawable) this.s.getValue();
    }

    private final LayerDrawable getLiveStreamBadgeDrawable() {
        return (LayerDrawable) this.u.getValue();
    }

    private final p99 getLiveStreamWavesDrawable() {
        return (p99) this.t.getValue();
    }

    private final yt5 getNewStoriesDrawable() {
        return (yt5) this.j.getValue();
    }

    private final ShapeDrawable getNewStoriesErrorBgDrawable() {
        return (ShapeDrawable) this.k.getValue();
    }

    private final LayerDrawable getNewStoriesErrorDrawable() {
        return (LayerDrawable) this.m.getValue();
    }

    private final EnhancedVectorDrawable getNewStoriesErrorIconDrawable() {
        return (EnhancedVectorDrawable) this.l.getValue();
    }

    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.p.getValue();
    }

    private final ycf getStoriesStroke() {
        return (ycf) this.i.getValue();
    }

    private final boolean getStoriesVisible() {
        zv8 zv8Var = s1[0];
        return ((Boolean) this.h.b).booleanValue();
    }

    private final int getViewSize() {
        return Math.min(getMeasuredWidth(), getMeasuredHeight());
    }

    private final void setStoriesVisible(boolean z) {
        this.h.B(this, s1[0], Boolean.valueOf(z));
    }

    public static void u(kwb kwbVar, String str, tj0 tj0Var) {
        kwbVar.setAvatarUrl(str);
        kwbVar.t(tj0Var, true);
    }

    public static void v(kwb kwbVar, String str, Long l, CharSequence charSequence) {
        tj0 tj0VarA = gm0.a(charSequence, l);
        kwbVar.setAvatarUrl(str);
        kwbVar.t(tj0VarA, true);
    }

    public static void w(kwb kwbVar, int i) {
        kwbVar.getClass();
        kwbVar.o1 = (i <= 0 || i <= 0) ? bj8.a(0, 0) : bj8.a(i, i);
    }

    public static void y(kwb kwbVar, Drawable drawable, dwb dwbVar, cf7 cf7Var, cf7 cf7Var2, int i) {
        if ((i & 2) != 0) {
            dwbVar = kwbVar.c;
        }
        dwb dwbVar2 = dwbVar;
        kbc kbcVarH = pq3.j.h(kwbVar);
        if ((i & 8) != 0) {
            cf7Var = new z9(3, kbcVarH);
        }
        cf7 cf7Var3 = cf7Var;
        if ((i & 16) != 0) {
            cf7Var2 = new z9(4, kbcVarH);
        }
        cf7 cf7Var4 = cf7Var2;
        kwbVar.setAvatarShape(dwbVar2);
        kwbVar.setCustomPlaceholder(drawable != null ? new rk0(drawable, dwbVar2, kbcVarH, cf7Var3, cf7Var4) : null);
        kwbVar.invalidate();
    }

    public final void i() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        getAddBadgeDrawable().setBounds(zo5.D(28.0f, yl5.d().getDisplayMetrics().density, viewSize), zo5.D(28.0f, yl5.d().getDisplayMetrics().density, viewSize), viewSize, viewSize);
        this.A.a(getAddBadgeDrawable());
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new gwb(this, drawable, 0));
        } else {
            post(new hwb(this, drawable, 0));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.r && getLiveStreamWavesDrawable().isRunning();
    }

    public final void j() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        getCallBadgeDrawable().setBounds(zo5.D(24.0f, yl5.d().getDisplayMetrics().density, viewSize), zo5.D(24.0f, yl5.d().getDisplayMetrics().density, viewSize), viewSize, viewSize);
        this.A.a(getCallBadgeDrawable());
    }

    public final void k() {
        int iK;
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        if (viewSize >= gm0.K(72.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        } else if (viewSize >= gm0.K(54.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        } else {
            iK = viewSize >= gm0.K(40.0f * yl5.d().getDisplayMetrics().density) ? gm0.K(16.0f * yl5.d().getDisplayMetrics().density) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        }
        getCloseBadgeDrawable().setBounds(viewSize - iK, 0, viewSize, iK);
        this.A.a(getCloseBadgeDrawable());
    }

    public final void l(boolean z) {
        this.J = z;
        du5 du5Var = this.b.d;
        du5Var.getClass();
        wj7 wj7Var = (wj7) du5Var;
        int i = z ? 0 : this.I;
        wj6 wj6Var = wj7Var.e;
        wj6Var.l = i;
        if (wj6Var.k == 1) {
            wj6Var.k = 0;
        }
    }

    public final void m() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        int iD = zo5.D(24.0f, yl5.d().getDisplayMetrics().density, viewSize);
        getLiveStreamBadgeDrawable().setBounds(iD, iD, viewSize, viewSize);
        this.A.a(getLiveStreamBadgeDrawable());
    }

    public final void n() {
        int iK;
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        if (viewSize >= gm0.K(72.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        } else if (viewSize >= gm0.K(54.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        } else {
            iK = viewSize >= gm0.K(40.0f * yl5.d().getDisplayMetrics().density) ? gm0.K(20.0f * yl5.d().getDisplayMetrics().density) : gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        }
        int i = viewSize - iK;
        getActiveStoriesIconDrawable().setBounds(i, i, viewSize, viewSize);
        this.A.a(getActiveStoriesIconDrawable());
    }

    public final void o() {
        int iK;
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        if (viewSize >= gm0.K(72.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        } else if (viewSize >= gm0.K(54.0f * yl5.d().getDisplayMetrics().density)) {
            iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        } else {
            iK = viewSize >= gm0.K(40.0f * yl5.d().getDisplayMetrics().density) ? gm0.K(16.0f * yl5.d().getDisplayMetrics().density) : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        }
        int i = viewSize - iK;
        getOnlineBadgeDrawable().setBounds(zo5.b(3.0f, yl5.d().getDisplayMetrics().density, i), zo5.b(3.0f, yl5.d().getDisplayMetrics().density, i), zo5.b(3.0f, yl5.d().getDisplayMetrics().density, viewSize), zo5.b(3.0f, yl5.d().getDisplayMetrics().density, viewSize));
        this.A.a(getOnlineBadgeDrawable());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.f();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ny8 ny8Var = this.i;
        if (ny8Var.d()) {
            ycf ycfVar = (ycf) ny8Var.getValue();
            ValueAnimator valueAnimator = ycfVar.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ycfVar.p = null;
        }
        this.b.g();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (Looper.getMainLooper().isCurrentThread()) {
            ote oteVarD = this.b.d();
            if (oteVarD != null) {
                oteVarD.draw(canvas);
            }
        } else {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new ng7(this, 14, canvas));
            } else {
                post(new og7(this, 14, canvas));
            }
        }
        if (getStoriesVisible()) {
            getStoriesStroke().draw(canvas);
        }
        if (this.g) {
            getActiveStoriesIconDrawable().draw(canvas);
        }
        if (this.d) {
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.e) {
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.f) {
            getAddBadgeDrawable().draw(canvas);
        }
        if (this.v) {
            getCallBadgeDrawable().setBounds(zo5.D(24.0f, yl5.d().getDisplayMetrics().density, getViewSize()), zo5.D(24.0f, yl5.d().getDisplayMetrics().density, getViewSize()), getViewSize(), getViewSize());
            getCallBadgeDrawable().draw(canvas);
        }
        if (this.r) {
            int iD = zo5.D(24.0f, yl5.d().getDisplayMetrics().density, getViewSize());
            getLiveStreamBadgeDrawable().setBounds(iD, iD, getViewSize(), getViewSize());
            getLiveStreamBadgeDrawable().draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.f();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int viewSize = getViewSize();
        ote oteVarD = this.b.d();
        if (oteVarD != null) {
            oteVarD.setBounds(0, 0, viewSize, viewSize);
        }
        if (this.d) {
            k();
        }
        if (this.e) {
            o();
        }
        if (this.f) {
            i();
        }
        if (this.v) {
            j();
        }
        if (this.r) {
            m();
        }
        if (getStoriesVisible()) {
            p();
        }
        if (this.g) {
            n();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        ny8 ny8Var = this.i;
        if (ny8Var.d()) {
            ycf ycfVar = (ycf) ny8Var.getValue();
            ValueAnimator valueAnimator = ycfVar.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ycfVar.p = null;
        }
        this.b.g();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        sj0 sj0Var;
        Paint paint;
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) ny8Var.getValue();
            lvb.A0(enhancedVectorDrawable, "background", kbcVar.h().a);
            lvb.A0(enhancedVectorDrawable, "photo", -1);
        }
        ny8 ny8Var2 = this.p;
        if (ny8Var2.d()) {
            EnhancedVectorDrawable enhancedVectorDrawable2 = (EnhancedVectorDrawable) ny8Var2.getValue();
            lvb.A0(enhancedVectorDrawable2, "online", kbcVar.getIcon().i);
            lvb.B0(enhancedVectorDrawable2, "online", kbcVar.b().c);
        }
        ny8 ny8Var3 = this.q;
        if (ny8Var3.d()) {
            EnhancedVectorDrawable enhancedVectorDrawable3 = (EnhancedVectorDrawable) ny8Var3.getValue();
            lvb.A0(enhancedVectorDrawable3, "cross", -1);
            lvb.A0(enhancedVectorDrawable3, "circle_background", kbcVar.getIcon().d);
        }
        ny8 ny8Var4 = this.x;
        if (ny8Var4.d()) {
            ((Drawable) ny8Var4.getValue()).setTint(-1);
        }
        ny8 ny8Var5 = this.w;
        boolean zD = ny8Var5.d();
        a8g a8gVar = pq3.j;
        if (zD) {
            GradientDrawable gradientDrawable = (GradientDrawable) ny8Var5.getValue();
            gradientDrawable.setStroke(gm0.K(yl5.d().getDisplayMetrics().density * 2.0f), a8gVar.h(this).b().c);
            gradientDrawable.setColor(a8gVar.h(this).getIcon().h);
        }
        ny8 ny8Var6 = this.t;
        if (ny8Var6.d()) {
            ((p99) ny8Var6.getValue()).onThemeChanged(kbcVar);
        }
        ny8 ny8Var7 = this.s;
        if (ny8Var7.d()) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) ny8Var7.getValue();
            gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(this).b().c);
            a8gVar.h(this);
            gradientDrawable2.setColor(-2678426);
        }
        ny8 ny8Var8 = this.j;
        if (ny8Var8.d()) {
            yt5 yt5Var = (yt5) ny8Var8.getValue();
            int i = kbcVar.getIcon().g;
            int i2 = kbcVar.b().c;
            int numberOfLayers = yt5Var.getNumberOfLayers();
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                if (i3 == 0) {
                    Drawable drawable = yt5Var.getDrawable(0);
                    ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
                    if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
                        paint.setColor(i2);
                    }
                } else if (i3 == 2) {
                    sb8.m0(i, yt5Var.getDrawable(2));
                }
            }
        }
        ny8 ny8Var9 = this.m;
        if (ny8Var9.d()) {
            EnhancedVectorDrawable newStoriesErrorIconDrawable = getNewStoriesErrorIconDrawable();
            lvb.A0(newStoriesErrorIconDrawable, "background", a8gVar.e(getContext()).m().getIcon().j);
            lvb.B0(newStoriesErrorIconDrawable, "icon", a8gVar.h(this).getIcon().g);
            getNewStoriesErrorBgDrawable().getPaint().setColor(a8gVar.h(this).b().c);
        }
        getStoriesStroke().onThemeChanged(kbcVar);
        int iD = qt4.D(this.q1);
        if (iD == 1) {
            rk0 rk0Var = this.H;
            if (rk0Var != null) {
                rk0Var.onThemeChanged(kbcVar);
            }
        } else if (iD == 2 && (sj0Var = this.G) != null) {
            sj0Var.onThemeChanged(kbcVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        af7 af7Var;
        af7 af7Var2;
        boolean z = this.d && this.C != null;
        boolean z2 = this.g && this.E != null;
        if (!z && !z2) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (z && getCloseBadgeDrawable().getBounds().contains(x, y)) {
                this.D = true;
                return true;
            }
            if (!z2 || !getActiveStoriesIconDrawable().getBounds().contains(x, y)) {
                return super.onTouchEvent(motionEvent);
            }
            this.F = true;
            return true;
        }
        if (action == 1) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (this.D && getCloseBadgeDrawable().getBounds().contains(x2, y2) && (af7Var2 = this.C) != null) {
                af7Var2.invoke();
            }
            if (this.F && getActiveStoriesIconDrawable().getBounds().contains(x2, y2) && (af7Var = this.E) != null) {
                af7Var.invoke();
            }
            this.D = false;
            this.F = false;
        } else if (action == 3) {
            this.D = false;
            this.F = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        getStoriesStroke().setBounds(0, 0, viewSize, viewSize);
        this.A.a(getStoriesStroke());
    }

    public final s1d q() {
        t1d t1dVar = vd7.a.get();
        t1dVar.e = this.K;
        t1dVar.f = this.n1;
        t1dVar.j = this.b.e;
        t1dVar.i = true;
        return t1dVar.a();
    }

    public final v78 r(String str) {
        dwb dwbVar = this.c;
        if (cqk.d(dwbVar, awb.a)) {
            dwbVar = null;
        }
        if (dwbVar == null) {
            dwbVar = bwb.a;
        }
        long j = this.o1;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        Uri uriC = f55.c(str);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        w78 w78VarH = ghb.h(uriC, dwbVar, i, i2);
        w78VarH.j = whd.c;
        return w78VarH.a();
    }

    public final void s(Drawable drawable, af7 af7Var) {
        if (this.A.c(drawable)) {
            drawable.invalidateSelf();
            return;
        }
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            requestLayout();
            drawable.invalidateSelf();
        } else {
            af7Var.invoke();
            drawable.invalidateSelf();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new iwb(this, drawable, runnable, j, 0));
        } else {
            post(new iwb(this, drawable, runnable, j, 1));
        }
    }

    public final void setAddBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.f != z;
        this.f = z;
        if (z) {
            this.e = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            s(getAddBadgeDrawable(), new kj1(this, 22));
            ny8 ny8Var = this.o;
            if (ny8Var.d()) {
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) ny8Var.getValue();
                a8g a8gVar = pq3.j;
                lvb.A0(enhancedVectorDrawable, "background", a8gVar.h(this).h().a);
                a8gVar.h(this);
                lvb.A0(enhancedVectorDrawable, "photo", -1);
            }
        }
    }

    public final void setAvatarShape(dwb dwbVar) {
        if (cqk.d(this.c, dwbVar)) {
            return;
        }
        this.c = dwbVar;
        du5 du5Var = this.b.d;
        du5Var.getClass();
        ((wj7) du5Var).m(this.c.a(getStoriesVisible()));
        invalidate();
    }

    public final void setAvatarUrl(String str) {
        v78 v78VarR;
        oah dk0Var;
        List list = this.p1;
        if (list != null && list.size() == 1) {
            List list2 = this.p1;
            if (cqk.d(list2 != null ? (String) ww3.r1(list2) : null, str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.p1 = null;
            v78VarR = null;
        } else {
            this.p1 = Collections.singletonList(str);
            v78VarR = r(str);
        }
        eu5 eu5Var = this.b;
        if (v78VarR == null || str == null || str.length() == 0) {
            eu5Var.i(null);
            return;
        }
        b78 b78VarA = vd7.A();
        if (((Boolean) dk0.e.invoke()).booleanValue()) {
            au3 au3Var = b78VarA.f.get(b78VarA.h.m(v78VarR, null));
            try {
                boolean zW = au3.W(au3Var);
                au3.E(au3Var);
                l(zW);
                dk0Var = new dk0(str, v78VarR, true ^ cqk.d(this.c, cwb.a), new wvb(this, 0));
            } catch (Throwable th) {
                au3.E(au3Var);
                throw th;
            }
        } else {
            l(false);
            b78VarA.getClass();
            dk0Var = new z68(b78VarA, v78VarR, str, u78.FULL_FETCH);
        }
        this.K.a(dk0Var);
        if (eu5Var.e == null) {
            eu5Var.i(q());
        }
    }

    public final void setAvatarUrls(List<String> list) {
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty() || !cqk.d(this.p1, list)) {
            eu5 eu5Var = this.b;
            if (list2 == null || list2.isEmpty()) {
                eu5Var.i(null);
                this.p1 = null;
                return;
            }
            List<String> list3 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
            for (String str : list3) {
                v78 v78VarR = r(str);
                b78 b78VarA = vd7.A();
                b78VarA.getClass();
                arrayList.add(new z68(b78VarA, v78VarR, str, u78.FULL_FETCH));
            }
            wc8 wc8VarA = wc8.a(arrayList, true);
            this.p1 = list;
            l(false);
            this.K.a(wc8VarA);
            if (eu5Var.e == null) {
                eu5Var.i(q());
            }
        }
    }

    public final void setCallBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.v != z;
        this.v = z;
        if (z) {
            this.e = false;
            this.f = false;
            this.r = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            if (!z) {
                invalidate();
                return;
            }
            s(getCallBadgeDrawable(), new kj1(this, 23));
            ny8 ny8Var = this.x;
            boolean zD = ny8Var.d();
            a8g a8gVar = pq3.j;
            if (zD) {
                Drawable drawable = (Drawable) ny8Var.getValue();
                a8gVar.h(this);
                drawable.setTint(-1);
            }
            ny8 ny8Var2 = this.w;
            if (ny8Var2.d()) {
                GradientDrawable gradientDrawable = (GradientDrawable) ny8Var2.getValue();
                gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(this).b().c);
                gradientDrawable.setColor(a8gVar.h(this).getIcon().h);
            }
        }
    }

    public final void setCloseBadgeClickListener(af7 af7Var) {
        this.C = af7Var;
    }

    public final void setCloseBadgeVisibility(boolean z) {
        boolean z2 = this.d;
        this.d = z;
        if (z2 != z) {
            s(getCloseBadgeDrawable(), new kj1(this, 24));
            ny8 ny8Var = this.q;
            if (ny8Var.d()) {
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) ny8Var.getValue();
                a8g a8gVar = pq3.j;
                a8gVar.h(this);
                lvb.A0(enhancedVectorDrawable, "cross", -1);
                lvb.A0(enhancedVectorDrawable, "circle_background", a8gVar.h(this).getIcon().d);
            }
        }
    }

    public final void setCustomPlaceholder(rk0 rk0Var) {
        eu5 eu5Var = this.b;
        if (rk0Var != null) {
            this.H = rk0Var;
            du5 du5Var = eu5Var.d;
            du5Var.getClass();
            ((wj7) du5Var).i(1, rk0Var);
            this.q1 = 2;
            return;
        }
        if (this.q1 == 2) {
            du5 du5Var2 = eu5Var.d;
            du5Var2.getClass();
            ((wj7) du5Var2).i(1, null);
            this.H = null;
            this.q1 = 1;
        }
    }

    public final void setFadeDuration(int i) {
        this.I = i;
        l(this.J);
    }

    public final void setLiveStreamBadgeVisibility(boolean z) {
        boolean z2 = this.r != z;
        this.r = z;
        if (z) {
            this.e = false;
            this.f = false;
            this.v = false;
            z2 = true;
        }
        if (z2) {
            if (!z) {
                invalidate();
                return;
            }
            s(getLiveStreamBadgeDrawable(), new kj1(this, 25));
            ny8 ny8Var = this.t;
            boolean zD = ny8Var.d();
            a8g a8gVar = pq3.j;
            if (zD) {
                ((p99) ny8Var.getValue()).onThemeChanged(a8gVar.h(this));
            }
            ny8 ny8Var2 = this.s;
            if (ny8Var2.d()) {
                GradientDrawable gradientDrawable = (GradientDrawable) ny8Var2.getValue();
                gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), a8gVar.h(this).b().c);
                a8gVar.h(this);
                gradientDrawable.setColor(-2678426);
            }
            post(new wvb(this, 1));
        }
    }

    public final void setLoading(Float f) {
        eu5 eu5Var = this.b;
        if (f == null) {
            ycf storiesStroke = getStoriesStroke();
            if (storiesStroke.c != 1) {
                storiesStroke.c = 1;
                ValueAnimator valueAnimator = storiesStroke.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                storiesStroke.p = null;
                storiesStroke.o = 0.0f;
                storiesStroke.invalidateSelf();
            }
            if (getStoriesStroke().d > 0) {
                return;
            }
            setStoriesVisible(false);
            du5 du5Var = eu5Var.d;
            du5Var.getClass();
            ((wj7) du5Var).m(this.c.a(false));
            invalidate();
            return;
        }
        ycf storiesStroke2 = getStoriesStroke();
        float fFloatValue = f.floatValue();
        storiesStroke2.getClass();
        float fU = oc9.u(fFloatValue, 0.0f, 1.0f) * 360.0f;
        storiesStroke2.c = 2;
        ValueAnimator valueAnimator2 = storiesStroke2.p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float f2 = storiesStroke2.o;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fU >= f2 ? f2 : 0.0f, fU);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new xcf(0, storiesStroke2));
        valueAnimatorOfFloat.start();
        storiesStroke2.p = valueAnimatorOfFloat;
        if (getStoriesVisible()) {
            return;
        }
        setStoriesVisible(true);
        du5 du5Var2 = eu5Var.d;
        du5Var2.getClass();
        ((wj7) du5Var2).m(this.c.a(true));
        s(getStoriesStroke(), new kj1(this, 26));
    }

    public final void setNewStoriesClickListener(af7 af7Var) {
        this.E = af7Var;
    }

    public final void setOnImageLoadedListener(af7 af7Var) {
        this.B = af7Var;
    }

    public final void setOnlineBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.e != z;
        this.e = z;
        if (z) {
            this.f = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            if (!z) {
                invalidate();
                return;
            }
            s(getOnlineBadgeDrawable(), new kj1(this, 27));
            ny8 ny8Var = this.p;
            if (ny8Var.d()) {
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) ny8Var.getValue();
                a8g a8gVar = pq3.j;
                lvb.A0(enhancedVectorDrawable, "online", a8gVar.h(this).getIcon().i);
                lvb.B0(enhancedVectorDrawable, "online", a8gVar.h(this).b().c);
            }
        }
    }

    public final void setOverlay(zvb zvbVar) {
        boolean zD = cqk.d(zvbVar, xvb.a);
        eu5 eu5Var = this.b;
        if (zD) {
            du5 du5Var = eu5Var.d;
            du5Var.getClass();
            ((wj7) du5Var).k(getCallPlaceholderLink());
            return;
        }
        if (!(zvbVar instanceof yvb)) {
            if (zvbVar != null) {
                ore.o();
                return;
            }
            du5 du5Var2 = eu5Var.d;
            du5Var2.getClass();
            ((wj7) du5Var2).k(null);
            return;
        }
        yvb yvbVar = (yvb) zvbVar;
        if (yvbVar.a() instanceof qk0) {
            du5 du5Var3 = eu5Var.d;
            du5Var3.getClass();
            ((wj7) du5Var3).k(yvbVar.a());
        } else {
            qk0 qk0Var = new qk0(yvbVar.a(), this.c, getContext(), (cf7) null, (cf7) null, 56);
            du5 du5Var4 = eu5Var.d;
            du5Var4.getClass();
            ((wj7) du5Var4).k(qk0Var);
        }
    }

    public final void setStoriesBadgeAlpha(int i) {
        if (this.g) {
            getActiveStoriesIconDrawable().setAlpha(i);
        }
    }

    public final void setStoriesStrokeAlpha(int i) {
        if (getStoriesVisible()) {
            getStoriesStroke().setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.r) {
            getLiveStreamWavesDrawable().start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.r) {
            getLiveStreamWavesDrawable().stop();
        }
    }

    public final void t(tj0 tj0Var, boolean z) {
        eu5 eu5Var = this.b;
        if (tj0Var == null || tj0Var == tj0.c || (tj0Var.a == 0 && tj0Var.b.length() == 0)) {
            if (this.q1 == 3) {
                du5 du5Var = eu5Var.d;
                du5Var.getClass();
                ((wj7) du5Var).i(1, null);
                this.G = null;
                this.q1 = 1;
                return;
            }
            return;
        }
        sj0 sj0Var = new sj0(getContext(), this.c, tj0Var, pq3.j.e(getContext()).m());
        sj0Var.n.B(sj0Var, sj0.p[1], Boolean.valueOf(z));
        this.G = sj0Var;
        du5 du5Var2 = eu5Var.d;
        du5Var2.getClass();
        ((wj7) du5Var2).i(1, sj0Var);
        du5 du5Var3 = eu5Var.d;
        du5Var3.getClass();
        ((wj7) du5Var3).i(5, sj0Var);
        this.q1 = 3;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new jwb(this, drawable, runnable, 0));
        } else {
            post(new jwb(this, drawable, runnable, 1));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        boolean z = this.b.d() == drawable;
        if (!z) {
            if (this.d) {
                z = z || getCloseBadgeDrawable() == drawable;
            }
            if (this.e) {
                z = z || getOnlineBadgeDrawable() == drawable;
            }
            if (this.f) {
                z = z || getAddBadgeDrawable() == drawable;
            }
            if (this.v) {
                z = z || getCallBadgeDrawable() == drawable;
            }
            if (this.r) {
                z = z || getLiveStreamWavesDrawable() == drawable || getLiveStreamBackgroundDrawable() == drawable || getLiveStreamBadgeDrawable() == drawable;
            }
            if (getStoriesVisible()) {
                z = z || getStoriesStroke() == drawable;
            }
            if (this.g) {
                z = z || getNewStoriesDrawable() == drawable || getNewStoriesErrorDrawable() == drawable;
            }
            if (!z && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }

    public final void x(boolean z, boolean z2) {
        boolean z3 = this.g;
        boolean z4 = this.n != z2;
        if (z4) {
            this.A.g(getActiveStoriesIconDrawable());
        }
        this.n = z2;
        boolean z5 = z3 != z || z4;
        this.g = z;
        if (z ? true : z5) {
            s(getActiveStoriesIconDrawable(), new fl9(0, this, kwb.class, "applyNewStoriesDrawable", "applyNewStoriesDrawable()V", 0, 4));
        }
    }

    public final void z(int i, int i2) {
        ycf storiesStroke = getStoriesStroke();
        storiesStroke.d = i;
        storiesStroke.e = Math.min(i2, i);
        storiesStroke.h = i > 0 ? 360.0f / i : 0.0f;
        boolean storiesVisible = getStoriesVisible();
        setStoriesVisible(i > 0);
        du5 du5Var = this.b.d;
        du5Var.getClass();
        ((wj7) du5Var).m(this.c.a(getStoriesVisible()));
        sj0 sj0Var = this.G;
        if (sj0Var != null) {
            sj0Var.m.B(sj0Var, sj0.p[0], Float.valueOf(getStoriesVisible() ? yl5.d().getDisplayMetrics().density * 5.0f : 0.0f));
        }
        if (storiesVisible != getStoriesVisible()) {
            s(getStoriesStroke(), new kj1(this, 28));
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new gwb(this, drawable, 1));
        } else {
            post(new hwb(this, drawable, 1));
        }
    }
}
