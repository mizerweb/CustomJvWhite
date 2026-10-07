package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qc1 extends wf4 {
    public static final /* synthetic */ zv8[] K;
    public final wue A;
    public final wue B;
    public final int[] C;
    public pc1 D;
    public yp9 E;
    public yp9 F;
    public yp9 G;
    public mvh H;
    public mvh I;
    public sg1 J;
    public final ny8 s;
    public final zb t;
    public final ny8 u;
    public final ny8 v;
    public final wue w;
    public final wue x;
    public final wue y;
    public final wue z;

    static {
        z8b z8bVar = new z8b(qc1.class, "controlsSize", "getControlsSize()Lone/me/calls/ui/view/controls/CallBottomControlsSizeConfig;");
        zfe.a.getClass();
        K = new zv8[]{z8bVar};
    }

    public qc1(Context context) {
        super(context, null);
        final int i = 3;
        this.s = rx8.P(3, new va(20));
        rc1 rc1Var = rc1.a;
        this.t = new zb(this);
        final int i2 = 1;
        this.u = rx8.P(3, new mc1(this, 1));
        this.v = rx8.P(3, new z2(context, 9, this));
        wue wueVar = new wue(context);
        wueVar.setId(R.id.call_dinamic);
        wueVar.setLayoutParams(new uf4(-2, -2));
        final int i3 = 0;
        wueVar.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i4 = i3;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i4) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.w = wueVar;
        wue wueVar2 = new wue(context);
        wueVar2.setId(R.id.call_microphone);
        wueVar2.setLayoutParams(new uf4(-2, -2));
        wueVar2.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i4 = i2;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i4) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar2.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar2.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.x = wueVar2;
        wue wueVar3 = new wue(context);
        wueVar3.setId(R.id.call_video);
        wueVar3.setLayoutParams(new uf4(-2, -2));
        wue.z(wueVar3, R.drawable.icon_video_call_crossed_fill);
        final int i4 = 2;
        wueVar3.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i5 = i4;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i5) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar3.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar3.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.y = wueVar3;
        wue wueVar4 = new wue(context);
        wueVar4.setId(R.id.call_raise_hand);
        wueVar4.setLayoutParams(new uf4(-2, -2));
        wue.z(wueVar4, R.drawable.icon_hand_fill);
        wueVar4.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i5 = i;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i5) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar4.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar4.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.z = wueVar4;
        wue wueVar5 = new wue(context);
        wueVar5.setId(View.generateViewId());
        wueVar5.setLayoutParams(new uf4(-2, -2));
        wue.z(wueVar5, R.drawable.icon_call_hold_fill);
        final int i5 = 4;
        wueVar5.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i6 = i5;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i6) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar5.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar5.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.A = wueVar5;
        wue wueVar6 = new wue(context);
        wueVar6.setId(R.id.call_cancel);
        wueVar6.setLayoutParams(new uf4(-2, -2));
        wue.z(wueVar6, R.drawable.icon_phone_off_fill);
        wueVar6.setAccessibility(Integer.valueOf(R.string.call_cancel_accessibility));
        final int i6 = 5;
        wueVar6.setListener(new tue(this) { // from class: oc1
            public final /* synthetic */ qc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.tue
            public final void a() {
                pc1 pc1Var;
                pc1 pc1Var2;
                pc1 pc1Var3;
                int i7 = i6;
                yp9 yp9Var = yp9.a;
                yp9 yp9Var2 = yp9.c;
                yp9 yp9Var3 = yp9.d;
                yp9 yp9Var4 = yp9.e;
                yp9 yp9Var5 = yp9.b;
                qc1 qc1Var = this.b;
                switch (i7) {
                    case 0:
                        qc1.u(qc1Var);
                        break;
                    case 1:
                        yp9 yp9Var6 = qc1Var.E;
                        if (yp9Var6 != null && (pc1Var = qc1Var.D) != null) {
                            int iOrdinal = yp9Var6.ordinal();
                            if (iOrdinal == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
                            zv8[] zv8VarArr = CallBottomPanelWidget.l;
                            callBottomPanelWidget.p1().F(yp9Var);
                            break;
                        }
                        break;
                    case 2:
                        yp9 yp9Var7 = qc1Var.G;
                        if (yp9Var7 != null && (pc1Var2 = qc1Var.D) != null) {
                            int iOrdinal2 = yp9Var7.ordinal();
                            if (iOrdinal2 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal2 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal2 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget2 = (CallBottomPanelWidget) ((rj5) pc1Var2).b;
                            zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                            callBottomPanelWidget2.p1().G(yp9Var);
                            break;
                        }
                        break;
                    case 3:
                        yp9 yp9Var8 = qc1Var.F;
                        if (yp9Var8 != null && (pc1Var3 = qc1Var.D) != null) {
                            int iOrdinal3 = yp9Var8.ordinal();
                            if (iOrdinal3 == 0) {
                                yp9Var = yp9Var5;
                            } else if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    yp9Var = yp9Var2;
                                } else if (iOrdinal3 == 3) {
                                    yp9Var = yp9Var3;
                                } else if (iOrdinal3 != 4) {
                                    ore.o();
                                } else {
                                    yp9Var = yp9Var4;
                                }
                            }
                            CallBottomPanelWidget callBottomPanelWidget3 = (CallBottomPanelWidget) ((rj5) pc1Var3).b;
                            zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                            jd1 jd1VarP1 = callBottomPanelWidget3.p1();
                            jd1VarP1.getClass();
                            boolean z = yp9Var == yp9Var5;
                            sa2 sa2Var = (sa2) jd1VarP1.h.getValue();
                            String strA = ns4.a(jd1VarP1.d.J());
                            sa2Var.getClass();
                            sa2.c(sa2Var, "HAND_RAISED", strA, null, Long.valueOf(z ? 1L : 0L), null, null, false, null, 500);
                            ((ya1) jd1VarP1.E().h).p(z);
                            break;
                        }
                        break;
                    case 4:
                        pc1 pc1Var4 = qc1Var.D;
                        if (pc1Var4 != null) {
                            CallBottomPanelWidget callBottomPanelWidget4 = (CallBottomPanelWidget) ((rj5) pc1Var4).b;
                            zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                            w82 w82VarE = callBottomPanelWidget4.p1().E();
                            x02 x02Var = (x02) w82VarE.m.getValue();
                            boolean zBooleanValue = ((Boolean) x02Var.isHeldByMe().getValue()).booleanValue();
                            b95 b95Var = w82VarE.a;
                            if (!zBooleanValue) {
                                b95Var.k(x02Var.s());
                            } else {
                                b95Var.q(x02Var.s());
                            }
                        }
                        break;
                    default:
                        pc1 pc1Var5 = qc1Var.D;
                        if (pc1Var5 != null) {
                            CallBottomPanelWidget callBottomPanelWidget5 = (CallBottomPanelWidget) ((rj5) pc1Var5).b;
                            zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                            jd1 jd1VarP2 = callBottomPanelWidget5.p1();
                            h02 h02Var = jd1VarP2.d;
                            int iD = qt4.D(((f62) ((n42) jd1VarP2.D()).f.a.getValue()).f);
                            if (iD == 0) {
                                a8j.x(h02Var.G, ux1.F);
                            } else if (iD != 1) {
                                ore.o();
                            } else {
                                a8j.x(h02Var.G, zx1.F);
                            }
                        }
                        break;
                }
            }
        });
        wueVar6.setMode(rue.d);
        wueVar6.setImageSize(new sue(getButtonSize(), getButtonSize()));
        wueVar6.setButtonPadding(gm0.J(((double) yl5.c()) * 3.5d));
        this.B = wueVar6;
        this.C = new int[2];
        uf4 uf4Var = new uf4(0, -2);
        uf4Var.setMarginStart(gm0.K(yl5.c() * 8.0f));
        uf4Var.setMarginEnd(gm0.K(yl5.c() * 8.0f));
        setLayoutParams(uf4Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        int iK = gm0.K(yl5.c() * 8.0f);
        setPadding(iK, iK, iK, iK);
        addView(wueVar);
        addView(wueVar2);
        addView(wueVar3);
        addView(wueVar4);
        addView(wueVar5);
        addView(wueVar6);
        eg4 eg4VarH = ch3.h(this);
        int id = wueVar.getId();
        eg4VarH.d(id, 4, wueVar3.getId(), 4);
        eg4VarH.d(id, 7, wueVar2.getId(), 6);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 3, wueVar3.getId(), 3);
        eg4VarH.g(id).d.V = 2;
        int id2 = wueVar2.getId();
        eg4VarH.d(id2, 4, wueVar3.getId(), 4);
        eg4VarH.d(id2, 7, wueVar3.getId(), 6);
        eg4VarH.d(id2, 6, wueVar.getId(), 7);
        eg4VarH.d(id2, 3, wueVar3.getId(), 3);
        int id3 = wueVar3.getId();
        eg4VarH.d(id3, 4, 0, 4);
        eg4VarH.d(id3, 3, 0, 3);
        eg4VarH.d(id3, 7, wueVar4.getId(), 6);
        eg4VarH.d(id3, 6, wueVar2.getId(), 7);
        int id4 = wueVar4.getId();
        eg4VarH.d(id4, 4, wueVar3.getId(), 4);
        eg4VarH.d(id4, 6, wueVar3.getId(), 7);
        eg4VarH.d(id4, 7, wueVar5.getId(), 6);
        eg4VarH.d(id4, 3, wueVar3.getId(), 3);
        int id5 = wueVar5.getId();
        eg4VarH.d(id5, 4, wueVar3.getId(), 4);
        eg4VarH.d(id5, 6, wueVar4.getId(), 7);
        eg4VarH.d(id5, 7, wueVar6.getId(), 6);
        eg4VarH.d(id5, 3, wueVar3.getId(), 3);
        int id6 = wueVar6.getId();
        eg4VarH.d(id6, 4, wueVar3.getId(), 4);
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 6, wueVar5.getId(), 7);
        eg4VarH.d(id6, 3, wueVar3.getId(), 3);
        eg4VarH.a(this);
    }

    public static void B(wue wueVar, Drawable drawable, Drawable drawable2, yp9 yp9Var, tnh tnhVar, tnh tnhVar2) {
        wueVar.setVisibility(yp9Var != yp9.d ? 0 : 8);
        int iOrdinal = yp9Var.ordinal();
        rue rueVar = rue.i;
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            a8gVar.l(wueVar);
            wueVar.y(-1, drawable2);
            wueVar.setMode(rueVar);
            wueVar.setAccessibility(tnhVar2);
            return;
        }
        if (iOrdinal == 1) {
            a8gVar.l(wueVar);
            wueVar.y(-1, drawable);
            wueVar.setMode(rue.h);
            wueVar.setAccessibility(tnhVar);
            return;
        }
        if (iOrdinal == 2) {
            wueVar.y(a8gVar.l(wueVar).b.getIcon().f, drawable2);
            wueVar.setMode(rue.g);
            wueVar.setAccessibility(tnhVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                ore.o();
                return;
            }
            wueVar.y(a8gVar.l(wueVar).b.getIcon().j, drawable2);
            wueVar.setMode(rueVar);
            wueVar.setAccessibility(tnhVar2);
        }
    }

    public static void C(wue wueVar, Drawable drawable, Drawable drawable2, yp9 yp9Var, ynh ynhVar, ynh ynhVar2) {
        wueVar.setVisibility(yp9Var != yp9.d ? 0 : 8);
        int iOrdinal = yp9Var.ordinal();
        a8g a8gVar = pq3.j;
        if (iOrdinal == 0) {
            wueVar.y(a8gVar.l(wueVar).b.getIcon().f, drawable2);
            wueVar.setMode(rue.e);
            wueVar.setAccessibility(ynhVar2);
            return;
        }
        rue rueVar = rue.i;
        if (iOrdinal == 1) {
            a8gVar.l(wueVar);
            wueVar.y(-1, drawable);
            wueVar.setMode(rueVar);
            wueVar.setAccessibility(ynhVar);
            return;
        }
        if (iOrdinal == 2) {
            wueVar.y(a8gVar.l(wueVar).b.getIcon().f, drawable2);
            wueVar.setMode(rue.g);
            wueVar.setAccessibility(ynhVar);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                ore.o();
                return;
            }
            wueVar.y(a8gVar.l(wueVar).b.getIcon().j, drawable2);
            wueVar.setMode(rueVar);
            wueVar.setAccessibility(ynhVar2);
        }
    }

    private final int getActualButtonsMargin() {
        return getControlsSize().c();
    }

    private final float[] getBgRadius() {
        return (float[]) this.s.getValue();
    }

    private final int getButtonSize() {
        return getControlsSize().d();
    }

    private final View getContainer() {
        return (View) this.u.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return gm0.K(yl5.c() * 6.0f) + measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    public final yxa getMicrophoneOnDrawable() {
        return (yxa) this.v.getValue();
    }

    public static void u(qc1 qc1Var) {
        pc1 pc1Var;
        Set availableAudioDevices;
        int i;
        if (qc1Var.J == null || (pc1Var = qc1Var.D) == null) {
            return;
        }
        View container = qc1Var.getContainer();
        CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) ((rj5) pc1Var).b;
        zv8[] zv8VarArr = CallBottomPanelWidget.l;
        n42 n42Var = (n42) ((k42) callBottomPanelWidget.c.getValue());
        dz4 dz4Var = (dz4) n42Var.c().z().getValue();
        sa2 sa2Var = n42Var.d;
        String strA = ns4.a(dz4Var.c);
        boolean z = dz4Var.i;
        sa2Var.getClass();
        sa2.c(sa2Var, "AUDIO_OUTPUT_CLICKED", strA, null, null, null, null, z, null, 380);
        w82 w82VarE = callBottomPanelWidget.p1().E();
        ac1 ac1Var = (ac1) w82VarE.b;
        rb0 rb0Var = (rb0) ac1Var.h.get();
        if (rb0Var == null || (availableAudioDevices = rb0Var.getAvailableAudioDevices()) == null) {
            availableAudioDevices = c76.a;
        }
        Object obj = null;
        if (availableAudioDevices.isEmpty()) {
            i = 0;
        } else {
            Iterator it = availableAudioDevices.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((a80) it.next()).a == 3 && (i = i + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
        }
        boolean z2 = i > 1;
        if (availableAudioDevices.isEmpty()) {
            return;
        }
        if (availableAudioDevices.size() < 3 && !z2) {
            a80 a80VarA = ac1Var.a();
            for (Object obj2 : availableAudioDevices) {
                if (!cqk.d((a80) obj2, a80VarA)) {
                    obj = obj2;
                    break;
                }
            }
            a80 a80Var = (a80) obj;
            if (a80Var != null) {
                a80VarA = a80Var;
            }
            w82VarE.j(a80VarA);
            return;
        }
        pp4 pp4VarB = opl.b(callBottomPanelWidget, 1).c().f(container).b();
        jd1 jd1VarP1 = callBottomPanelWidget.p1();
        a80 a80Var2 = (a80) ((gjg) jd1VarP1.E().w.getValue()).getValue();
        ArrayList<sg1> arrayListC = jd1VarP1.C();
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListC, 10));
        for (sg1 sg1Var : arrayListC) {
            boolean zD = cqk.d(sg1Var.n(), a80Var2);
            arrayList.add(new rp4(sg1Var.getId(), sg1Var.getTitle(), Integer.valueOf(zD ? R.attr.text_primary : R.attr.text_secondary), Integer.valueOf(sg1Var.getIcon()), Integer.valueOf(zD ? R.attr.icon_primary : R.attr.icon_secondary)));
        }
        qp4 qp4VarBuild = pp4VarB.l(arrayList).build();
        callBottomPanelWidget.h = qp4VarBuild;
        qp4VarBuild.u(callBottomPanelWidget);
    }

    public static final void w(qc1 qc1Var, wue wueVar, int i, int i2) {
        wueVar.setImageSize(new sue(i, i));
        wueVar.setButtonPadding(i2);
    }

    public static void z(qc1 qc1Var, wue wueVar, int i, int i2) {
        boolean z = (i2 & 2) != 0;
        boolean z2 = (i2 & 4) != 0;
        ViewGroup.LayoutParams layoutParams = wueVar.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) == i) {
            ViewGroup.LayoutParams layoutParams2 = wueVar.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) == i) {
                return;
            }
        }
        if (wueVar.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams3 = wueVar.getLayoutParams();
            if (layoutParams3 == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            if (z) {
                marginLayoutParams.setMarginStart(i);
            }
            if (z2) {
                marginLayoutParams.setMarginEnd(i);
            }
            wueVar.setLayoutParams(marginLayoutParams);
        }
    }

    public final yc1 getControlsSize() {
        zv8 zv8Var = K[0];
        return (yc1) this.t.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v.d() && this.E == yp9.b) {
            getMicrophoneOnDrawable().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (this.v.d()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(sg1 sg1Var) {
        if (cqk.d(this.J, sg1Var)) {
            gm0.Y(qc1.class.getName(), "Early return in setAudioInfo cuz of dynamicInfoType == type");
            return;
        }
        this.J = sg1Var;
        int iO = sg1Var.o();
        ynh contentDescription = sg1Var.getContentDescription();
        Drawable drawable = getContext().getDrawable(iO);
        C(this.w, drawable, drawable, sg1Var instanceof pg1 ? yp9.a : yp9.b, contentDescription, contentDescription);
    }

    public final void setClickListener(pc1 pc1Var) {
        this.D = pc1Var;
    }

    public final void setControlsSize(yc1 yc1Var) {
        this.t.B(this, K[0], yc1Var);
    }

    public final void setHoldEnabled(yp9 yp9Var) {
        B(this.A, getContext().getDrawable(R.drawable.icon_call_hold_fill).mutate(), getContext().getDrawable(R.drawable.icon_call_hold_fill).mutate(), yp9Var, null, null);
    }

    public final void setMicrophoneEnabled(yp9 yp9Var) {
        if (this.E == yp9Var) {
            gm0.Y(qc1.class.getName(), "Early return in setMicrophoneEnabled cuz of microphoneStateEnabled == state");
            return;
        }
        this.E = yp9Var;
        C(this.x, getMicrophoneOnDrawable(), getContext().getDrawable(R.drawable.icon_microphone_crossed_fill).mutate(), yp9Var, new tnh(R.string.call_microphone_enabled_accessibility), new tnh(R.string.call_microphone_disabled_accessibility));
        if (yp9Var == yp9.b) {
            getMicrophoneOnDrawable().start();
        } else {
            getMicrophoneOnDrawable().stop();
        }
    }

    public final void setRaiseHand(yp9 yp9Var) {
        yp9 yp9Var2;
        mvh mvhVar;
        yp9 yp9Var3 = this.F;
        if (yp9Var3 == yp9Var) {
            gm0.Y(qc1.class.getName(), "Early return in setRaiseHand cuz of raiseHandStateEnabled == state");
            return;
        }
        if (yp9Var3 != null && yp9Var3 == (yp9Var2 = yp9.b) && yp9Var != yp9Var2 && (mvhVar = this.I) != null) {
            mvhVar.a();
        }
        this.F = yp9Var;
        B(this.z, getContext().getDrawable(R.drawable.icon_hand_fill).mutate(), getContext().getDrawable(R.drawable.icon_hand_fill).mutate(), yp9Var, new tnh(R.string.call_raise_hand_enabled_accessibility), new tnh(R.string.call_raise_hand_disabled_accessibility));
        x();
    }

    public final void setVideoEnabled(yp9 yp9Var) {
        if (this.G == yp9Var) {
            gm0.Y(qc1.class.getName(), "Early return in setVideoEnabled cuz of videoStateEnabled == state");
            return;
        }
        this.G = yp9Var;
        C(this.y, getContext().getDrawable(R.drawable.icon_video_call_fill).mutate(), getContext().getDrawable(R.drawable.icon_video_call_crossed_fill).mutate(), yp9Var, new tnh(R.string.call_video_enabled_accessibility), new tnh(R.string.call_video_disabled_accessibility));
    }

    public final void setVolumeMicrophone(float f) {
        yxa microphoneOnDrawable = getMicrophoneOnDrawable();
        ObjectAnimator objectAnimator = microphoneOnDrawable.g;
        float fU = oc9.u(f, 0.0f, 1.0f);
        if (microphoneOnDrawable.i == fU) {
            return;
        }
        microphoneOnDrawable.i = fU;
        dk dkVar = microphoneOnDrawable.f;
        objectAnimator.setValues(PropertyValuesHolder.ofFloat(dkVar, dkVar.a, fU));
        objectAnimator.start();
        microphoneOnDrawable.invalidateSelf();
    }

    public final void x() {
        int actualButtonsMargin = getActualButtonsMargin();
        z(this, this.B, actualButtonsMargin, 2);
        z(this, this.A, actualButtonsMargin, 6);
        z(this, this.z, actualButtonsMargin, 6);
        z(this, this.y, actualButtonsMargin, 6);
        z(this, this.x, actualButtonsMargin, 6);
        z(this, this.w, actualButtonsMargin, 4);
    }

    public final mvh y(mvh mvhVar, wue wueVar, tnh tnhVar, af7 af7Var, Integer num) {
        int[] iArr = this.C;
        wueVar.getLocationOnScreen(iArr);
        Point point = new Point((wueVar.getWidth() / 2) + iArr[0], getContextHeight());
        if (mvhVar != null && mvhVar.isShowing()) {
            mvhVar.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            return mvhVar;
        }
        if (mvhVar != null) {
            mvhVar.dismiss();
        }
        mvh mvhVar2 = new mvh(getContext(), wueVar, new mc1(this, 0), new va(21), 0, 2, false, 160);
        mvhVar2.c(tnhVar);
        int i = num != null ? 0 : 8;
        ImageView imageView = mvhVar2.g;
        imageView.setVisibility(i);
        af7 af7Var2 = mvhVar2.d;
        imageView.setImageTintList(af7Var2 != null ? ColorStateList.valueOf(((Number) af7Var2.invoke()).intValue()) : null);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        TextView textView = mvhVar2.h;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = num != null ? gm0.K(8.0f * yl5.d().getDisplayMetrics().density) : 0;
        textView.setLayoutParams(marginLayoutParams);
        mvhVar2.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        mvhVar2.setOnDismissListener(new nc1(0, af7Var));
        return mvhVar2;
    }
}
