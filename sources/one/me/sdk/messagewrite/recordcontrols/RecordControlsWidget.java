package one.me.sdk.messagewrite.recordcontrols;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.br4;
import defpackage.c79;
import defpackage.d97;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fbe;
import defpackage.fsk;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.hj8;
import defpackage.i19;
import defpackage.ifg;
import defpackage.j8e;
import defpackage.jce;
import defpackage.jfg;
import defpackage.jz;
import defpackage.lce;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mce;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nce;
import defpackage.ny8;
import defpackage.o23;
import defpackage.ore;
import defpackage.p3c;
import defpackage.pce;
import defpackage.pq3;
import defpackage.qbe;
import defpackage.qha;
import defpackage.qyj;
import defpackage.r7d;
import defpackage.rce;
import defpackage.rx8;
import defpackage.sce;
import defpackage.sgg;
import defpackage.t3f;
import defpackage.tce;
import defpackage.tha;
import defpackage.tyd;
import defpackage.v0k;
import defpackage.vce;
import defpackage.vo8;
import defpackage.vp4;
import defpackage.vv;
import defpackage.x96;
import defpackage.xc3;
import defpackage.yab;
import defpackage.ycj;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ysc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lfbe;", "type", "(Lt3f;Lfbe;)V", "pce", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecordControlsWidget extends Widget implements mc4, vp4 {
    public static final /* synthetic */ zv8[] x1 = {new dwd(RecordControlsWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, RecordControlsWidget.class, "type", "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;", 0), new dwd(RecordControlsWidget.class, "rootView", "getRootView()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "recordingPanel", "getRecordingPanel()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "dotView", "getDotView()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "durationView", "getDurationView()Landroid/widget/TextView;", 0), new dwd(RecordControlsWidget.class, "trashView", "getTrashView()Landroid/widget/ImageView;", 0), new dwd(RecordControlsWidget.class, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new dwd(RecordControlsWidget.class, "audioHandFreeRecordView", "getAudioHandFreeRecordView()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0), new dwd(RecordControlsWidget.class, "pauseRecordingButton", "getPauseRecordingButton()Landroid/widget/ImageView;", 0), new dwd(RecordControlsWidget.class, "playRecordingButton", "getPlayRecordingButton()Landroid/widget/ImageView;", 0), new dwd(RecordControlsWidget.class, "actionViewContainer", "getActionViewContainer()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "actionViewBgContainer", "getActionViewBgContainer()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "actionViewBackground", "getActionViewBackground()Landroid/view/View;", 0), new dwd(RecordControlsWidget.class, "actionView", "getActionView()Landroid/widget/ImageView;", 0), new dwd(RecordControlsWidget.class, "lockView", "getLockView()Landroid/view/View;", 0), new z8b(RecordControlsWidget.class, "animateDotViewJob", "getAnimateDotViewJob()Lkotlinx/coroutines/Job;")};
    public static final hj8 y1 = new hj8(0, 135, 1);
    public static final hj8 z1 = new hj8(135, 275, 1);
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final ny8 F;
    public Float G;
    public ylc H;
    public ylc I;
    public float J;
    public float K;
    public int X;
    public float Y;
    public float Z;
    public final vv a;
    public final v0k b;
    public final vv c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public float n1;
    public final j8e o;
    public boolean o1;
    public final j8e p;
    public ifg p1;
    public final j8e q;
    public sgg q1;
    public final j8e r;
    public final p3c r1;
    public final j8e s;
    public AnimatorSet s1;
    public final j8e t;
    public AnimatorSet t1;
    public final j8e u;
    public AnimatorSet u1;
    public ycj v;
    public AnimatorSet v1;
    public final pce w;
    public float w1;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;

    public RecordControlsWidget(Bundle bundle) {
        pce pceVar;
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        this.a = vvVar;
        this.b = new v0k(m35getAccountScopeuqN4xOY());
        this.c = new vv("arg_key_type", fbe.class);
        zv8 zv8Var = x1[0];
        this.d = getSharedViewModel((t3f) vvVar.a(this), qbe.class, null);
        this.e = createViewModelLazy(jce.class, new ztd(4, new lce(this, 0)));
        this.f = ysc.a.a();
        this.g = viewBinding(R.id.audio_record__audio_record_root);
        this.h = viewBinding(R.id.audio_record__recording_panel);
        this.i = viewBinding(R.id.audio_record__dot_view);
        this.j = viewBinding(R.id.audio_record__duration_view);
        this.k = viewBinding(R.id.audio_record__swipe_remove_button);
        this.l = viewBinding(R.id.audio_record__cancel_view);
        this.m = viewBinding(R.id.audio_record__audio_hand_free_record_view);
        this.n = viewBinding(R.id.audio_record__remove_button);
        this.o = viewBinding(R.id.audio_record__pause_recording_button);
        this.p = viewBinding(R.id.audio_record__play_recording_button);
        this.q = viewBinding(R.id.audio_record__action_view_container);
        this.r = viewBinding(R.id.audio_record__action_view_bg_container);
        this.s = viewBinding(R.id.audio_record__action_view_background);
        this.t = viewBinding(R.id.audio_record__action_view);
        this.u = viewBinding(R.id.audio_record__lock_view);
        int iOrdinal = H1().ordinal();
        if (iOrdinal == 0) {
            pceVar = new pce(R.drawable.icon_video_message, R.drawable.icon_video_message_stop, R.drawable.icon_video_message);
        } else {
            if (iOrdinal != 1) {
                ore.o();
                throw null;
            }
            pceVar = new pce(R.drawable.icon_microphone, R.drawable.icon_pause_fill, R.drawable.icon_microphone);
        }
        this.w = pceVar;
        this.x = rx8.P(3, new lce(this, 4));
        this.y = rx8.P(3, new lce(this, 6));
        this.z = rx8.P(3, new lce(this, 7));
        this.A = rx8.P(3, new tyd(8));
        this.B = rx8.P(3, new tyd(9));
        this.C = rx8.P(3, new tyd(10));
        this.D = rx8.P(3, new lce(this, 8));
        this.E = rx8.P(3, new tyd(11));
        this.F = rx8.P(3, new tyd(12));
        this.Y = 1.0f;
        this.r1 = qyj.S();
    }

    public static final View o1(RecordControlsWidget recordControlsWidget) {
        return (View) recordControlsWidget.h.m(recordControlsWidget, x1[3]);
    }

    public static final void p1(RecordControlsWidget recordControlsWidget) {
        ylc ylcVar = recordControlsWidget.I;
        if (ylcVar != null) {
            recordControlsWidget.A1().setTranslationX(((Number) ylcVar.a).floatValue());
            recordControlsWidget.A1().setTranslationY(((Number) ylcVar.b).floatValue());
        }
        ylc ylcVar2 = recordControlsWidget.H;
        if (ylcVar2 != null) {
            recordControlsWidget.u1().setX(((Number) ylcVar2.a).floatValue());
            recordControlsWidget.u1().setY(((Number) ylcVar2.b).floatValue());
        }
        recordControlsWidget.o1 = false;
        recordControlsWidget.Z = 0.0f;
        recordControlsWidget.n1 = 0.0f;
        recordControlsWidget.H = null;
        recordControlsWidget.I = null;
    }

    public final View A1() {
        return (View) this.u.m(this, x1[16]);
    }

    public final Drawable B1() {
        return (Drawable) this.x.getValue();
    }

    public final ImageView C1() {
        return (ImageView) this.o.m(this, x1[10]);
    }

    public final ImageView D1() {
        return (ImageView) this.p.m(this, x1[11]);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        if (i == R.id.send_context_menu_action_scheduled_send) {
            jce.W(I1(), 1);
        }
    }

    public final ImageView E1() {
        return (ImageView) this.n.m(this, x1[9]);
    }

    public final View F1() {
        return (View) this.g.m(this, x1[2]);
    }

    public final ImageView G1() {
        return (ImageView) this.k.m(this, x1[6]);
    }

    public final fbe H1() {
        zv8 zv8Var = x1[1];
        return (fbe) this.c.a(this);
    }

    public final jce I1() {
        return (jce) this.e.getValue();
    }

    public final void J1(boolean z) {
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.t1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.t1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        N1();
        this.t1 = new AnimatorSet();
        c79 c79VarW = yab.w();
        if (H1() == fbe.b) {
            ValueAnimator duration = ValueAnimator.ofInt(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(96.0f * yl5.d().getDisplayMetrics().density)).setDuration(300L);
            duration.addUpdateListener(new nce(this, 1));
            c79VarW.add(duration);
        }
        View viewV1 = v1();
        Property property = View.ALPHA;
        c79VarW.add(fsk.a(viewV1, property, 0.0f, 1.0f, 300L, 0L, false, 240));
        ImageView imageViewE1 = E1();
        Property property2 = View.TRANSLATION_Y;
        c79VarW.add(fsk.a(imageViewE1, property2, yl5.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, false, 240));
        c79VarW.add(fsk.a(E1(), property, 0.0f, 1.0f, 150L, 150L, false, 224));
        if (z) {
            c79VarW.add(fsk.a(C1(), property2, yl5.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, false, 240));
            c79VarW.add(fsk.a(C1(), property, 0.0f, 1.0f, 150L, 150L, false, 224));
        }
        c79VarW.add(fsk.a(x1(), property, x1().getAlpha(), 0.0f, 150L, 0L, false, 240));
        c79VarW.add(fsk.a(x1(), property2, 0.0f, yl5.d().getDisplayMetrics().density * 48.0f, 300L, 0L, false, 240));
        c79VarW.add(fsk.a(y1(), property, 1.0f, 0.0f, 150L, 0L, false, 240));
        c79VarW.add(fsk.a(y1(), property2, 0.0f, yl5.d().getDisplayMetrics().density * 48.0f, 300L, 0L, false, 240));
        c79VarW.add(fsk.a(w1(), property, w1().getAlpha(), 0.0f, 150L, 0L, false, 240));
        c79VarW.add(fsk.a(w1(), property2, w1().getTranslationY(), yl5.d().getDisplayMetrics().density * 48.0f, 300L, 0L, false, 240));
        ylc ylcVar = this.I;
        c79VarW.add(fsk.a(A1(), property2, A1().getTranslationY(), ylcVar != null ? ((Number) ylcVar.b).floatValue() : 0.0f, 300L, 0L, false, 240));
        c79VarW.add(fsk.a(A1(), property, 1.0f, 0.0f, 300L, 0L, false, 240));
        c79VarW.add(fsk.a(u1(), property2, u1().getTranslationY(), 0.0f, 150L, 0L, false, 240));
        c79VarW.addAll(fsk.c(t1(), 1.0f, gm0.K(36.0f * yl5.d().getDisplayMetrics().density) / (yl5.d().getDisplayMetrics().density * 124.0f), 300L, 0L));
        c79 c79VarJ = yab.j(c79VarW);
        AnimatorSet animatorSet4 = this.t1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new sce(this, z, 1));
        }
        AnimatorSet animatorSet5 = this.t1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new sce(this, z, 0));
        }
        AnimatorSet animatorSet6 = this.t1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(z1());
        }
        AnimatorSet animatorSet7 = this.t1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(c79VarJ);
        }
        AnimatorSet animatorSet8 = this.t1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void K1() {
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.t1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.t1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.t1 = new AnimatorSet();
        c79 c79VarW = yab.w();
        c79VarW.addAll(fsk.c(C1(), 1.0f, 0.5f, 150L, 0L));
        ImageView imageViewC1 = C1();
        Property property = View.ALPHA;
        c79VarW.add(fsk.a(imageViewC1, property, 1.0f, 0.0f, 150L, 0L, false, 240));
        c79VarW.addAll(fsk.c(D1(), 0.5f, 1.0f, 150L, 50L));
        c79VarW.add(fsk.a(D1(), property, 0.0f, 1.0f, 150L, 50L, false, 224));
        ycj ycjVar = this.v;
        if (ycjVar != null) {
            c79VarW.addAll(ycjVar.getPauseAnimations());
        }
        c79 c79VarJ = yab.j(c79VarW);
        AnimatorSet animatorSet4 = this.t1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new rce(this, 7));
        }
        AnimatorSet animatorSet5 = this.t1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new rce(this, 6));
        }
        AnimatorSet animatorSet6 = this.t1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(z1());
        }
        AnimatorSet animatorSet7 = this.t1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(c79VarJ);
        }
        AnimatorSet animatorSet8 = this.t1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void L1(boolean z) {
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.t1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.t1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.t1 = new AnimatorSet();
        c79 c79VarW = yab.w();
        View viewX1 = x1();
        Property property = View.ALPHA;
        c79VarW.add(fsk.a(viewX1, property, 0.0f, 1.0f, 300L, 150L, false, 224));
        View viewX2 = x1();
        Property property2 = View.TRANSLATION_X;
        c79VarW.add(fsk.a(viewX2, property2, yl5.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, false, 224));
        c79VarW.add(fsk.a(y1(), property, 0.0f, 1.0f, 300L, 150L, false, 224));
        c79VarW.add(fsk.a(y1(), property2, yl5.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, false, 224));
        c79VarW.add(fsk.a(w1(), property, 0.0f, 1.0f, 250L, 250L, false, 224));
        c79VarW.add(fsk.a(w1(), property2, yl5.d().getDisplayMetrics().density * 70.0f, 0.0f, 300L, 200L, false, 224));
        c79VarW.add(fsk.a(A1(), property, 0.0f, 1.0f, 150L, 250L, false, 224));
        ylc ylcVar = this.I;
        c79VarW.add(fsk.a(A1(), View.TRANSLATION_Y, (-48.0f) - (yl5.d().getDisplayMetrics().density * 2.0f), ylcVar != null ? ((Number) ylcVar.b).floatValue() : 0.0f, 200L, 200L, false, 224));
        ImageView imageViewR1 = r1();
        a8g a8gVar = pq3.j;
        int i = a8gVar.h(imageViewR1).getIcon().e;
        a8gVar.h(r1());
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, -1);
        valueAnimatorOfArgb.setStartDelay(150L);
        valueAnimatorOfArgb.setDuration(300L);
        valueAnimatorOfArgb.addUpdateListener(new nce(this, 3));
        c79VarW.add(valueAnimatorOfArgb);
        c79VarW.addAll(fsk.c(t1(), 0.0f, 1.0f, 300L, 100L));
        c79VarW.add(fsk.a(t1(), property, 0.0f, 1.0f, 300L, 100L, false, 224));
        c79 c79VarJ = yab.j(c79VarW);
        AnimatorSet animatorSet4 = this.t1;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(z1());
        }
        AnimatorSet animatorSet5 = this.t1;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(c79VarJ);
        }
        AnimatorSet animatorSet6 = this.t1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new rce(this, 10));
        }
        AnimatorSet animatorSet7 = this.t1;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new sce(this, z, 2));
        }
        br4 parentController = getParentController();
        AnimatorSet animatorSet8 = null;
        MessageWriteWidget messageWriteWidget = parentController instanceof MessageWriteWidget ? (MessageWriteWidget) parentController : null;
        if (messageWriteWidget != null && messageWriteWidget.getView() != null) {
            tha thaVarT1 = messageWriteWidget.t1();
            thaVarT1.getClass();
            AnimatorSet animatorSet9 = new AnimatorSet();
            c79 c79VarW2 = yab.w();
            c79VarW2.add(fsk.a(thaVarT1.f, property2, 0.0f, yl5.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, false, 240));
            c79VarW2.add(fsk.a(thaVarT1.f, property, 1.0f, 0.0f, 300L, 0L, false, 240));
            ImageView imageView = thaVarT1.b;
            c79VarW2.add(fsk.a(imageView, property2, 0.0f, yl5.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, false, 240));
            c79 c79Var = c79VarW2;
            c79Var.add(fsk.a(imageView, property, 1.0f, 0.0f, 300L, 0L, false, 240));
            ny8 ny8Var = thaVarT1.i;
            if (ny8Var.d()) {
                c79Var.add(fsk.a((View) ny8Var.getValue(), property2, 0.0f, yl5.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, false, 240));
                c79Var = c79Var;
                c79Var.add(fsk.a((View) ny8Var.getValue(), property, 1.0f, 0.0f, 300L, 0L, false, 240));
            }
            ny8 ny8Var2 = thaVarT1.h;
            if (ny8Var2.d()) {
                c79Var.add(fsk.a((View) ny8Var2.getValue(), property, 1.0f, 0.0f, 200L, 0L, false, 240));
                c79Var.addAll(fsk.c((View) ny8Var2.getValue(), 1.0f, 0.0f, 300L, 0L));
            }
            ny8 ny8Var3 = thaVarT1.l;
            if (ny8Var3.d()) {
                c79Var.add(fsk.a((View) ny8Var3.getValue(), property, 1.0f, 0.0f, 200L, 0L, false, 240));
                c79Var.addAll(fsk.c((View) ny8Var3.getValue(), 1.0f, 0.0f, 300L, 0L));
            }
            ny8 ny8Var4 = thaVarT1.m;
            if (ny8Var4.d()) {
                c79Var.add(fsk.a((View) ny8Var4.getValue(), property, 1.0f, 0.0f, 200L, 0L, false, 240));
                c79Var.addAll(fsk.c((View) ny8Var4.getValue(), 1.0f, 0.0f, 300L, 0L));
            }
            c79 c79VarJ2 = yab.j(c79Var);
            animatorSet9.addListener(new qha(thaVarT1, 4));
            animatorSet9.playTogether(c79VarJ2);
            animatorSet8 = animatorSet9;
        }
        AnimatorSet animatorSet10 = this.t1;
        if (animatorSet10 != null) {
            animatorSet10.playTogether(animatorSet8);
        }
        AnimatorSet animatorSet11 = this.t1;
        if (animatorSet11 != null) {
            animatorSet11.start();
        }
    }

    public final void M1() throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.q1;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.q1 = null;
        AnimatorSet animatorSet = this.s1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        s1().setScaleX(1.0f);
        s1().setScaleY(1.0f);
    }

    public final void N1() {
        zv8[] zv8VarArr = x1;
        zv8 zv8Var = zv8VarArr[17];
        p3c p3cVar = this.r1;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8Var);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        p3cVar.B(this, zv8VarArr[17], null);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == 1) {
            I1().P();
        } else if (i == R.id.writebar_confirm_send_message_positive) {
            jce jceVarI1 = I1();
            jceVarI1.getClass();
            jce.W(jceVarI1, 3);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        I1().E();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.audio_record__audio_record_root);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(yl5.d().getDisplayMetrics().density * 48.0f)));
        frameLayout.setClipChildren(false);
        frameLayout.setVisibility(4);
        mce mceVar = new mce(this, 0);
        View frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(R.id.audio_record__recording_panel);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setVisibility(4);
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        frameLayout2.setMinimumHeight(48);
        frameLayout2.setBackgroundColor(0);
        mceVar.invoke(frameLayout2);
        frameLayout.addView(frameLayout2);
        mce mceVar2 = new mce(this, 1);
        View frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(R.id.audio_record__audio_hand_free_record_view);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, H1() == fbe.b ? gm0.K(96.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 48.0f));
        layoutParams2.gravity = 80;
        frameLayout3.setLayoutParams(layoutParams2);
        frameLayout3.setVisibility(4);
        frameLayout3.setClickable(true);
        frameLayout3.setFocusable(true);
        n1g.N(new r7d(3, null, 1), frameLayout3);
        mceVar2.invoke(frameLayout3);
        frameLayout.addView(frameLayout3);
        mce mceVar3 = new mce(this, 2);
        View frameLayout4 = new FrameLayout(frameLayout.getContext());
        frameLayout4.setId(R.id.audio_record__action_view_container);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (gm0.K(yl5.d().getDisplayMetrics().density * 124.0f) * 1.45f), (int) (gm0.K(124.0f * yl5.d().getDisplayMetrics().density) * 1.45f));
        layoutParams3.gravity = 85;
        layoutParams3.setMargins(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * (-66.0f)), gm0.K((-66.0f) * yl5.d().getDisplayMetrics().density));
        frameLayout4.setLayoutParams(layoutParams3);
        frameLayout4.setVisibility(4);
        mceVar3.invoke(frameLayout4);
        frameLayout.addView(frameLayout4);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(R.id.audio_record__lock_view);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        layoutParams4.gravity = 8388693;
        imageView.setLayoutParams(layoutParams4);
        imageView.setTranslationY((-gm0.K(48.0f * yl5.d().getDisplayMetrics().density)) - (yl5.d().getDisplayMetrics().density * 74.0f));
        imageView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        imageView.setImageDrawable((x96) this.D.getValue());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 100.0f);
        imageView.setBackground(gradientDrawable);
        imageView.setVisibility(8);
        n1g.N(new o23(3, null, 7), imageView);
        frameLayout.addView(imageView);
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.p1 = null;
        ycj ycjVar = this.v;
        if (ycjVar != null) {
            ycjVar.setCallback(null);
        }
        this.v = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) throws IllegalAccessException, InvocationTargetException {
        super.onDetach(view);
        AnimatorSet animatorSet = this.t1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        q1();
        I1().E();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jz jzVar = new jz(I1().s, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new tce(0, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new xc3(I1().I(), 29), getViewLifecycleOwner().f(), n09Var), new tce(1, null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(I1().v, getViewLifecycleOwner().f(), n09Var), new d97((lq4) null, this, view, 25), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(I1().w, getViewLifecycleOwner().f(), n09Var), new tce(2, null, this), 3), getViewLifecycleScope());
        ycj ycjVar = this.v;
        if (ycjVar != null) {
            e9i.j0(new fz6(n1g.v(I1().u, getViewLifecycleOwner().f(), n09Var), new vce(null, ycjVar, this, 0), 3), getViewLifecycleScope());
            e9i.j0(new fz6(n1g.v(I1().t, getViewLifecycleOwner().f(), n09Var), new vce(null, ycjVar, this, 1), 3), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(((qbe) this.d.getValue()).f, getViewLifecycleOwner().f(), n09Var), new tce(3, null, this), 3), getViewLifecycleScope());
        ifg ifgVar = new ifg(A1(), ifg.p);
        jfg jfgVar = new jfg();
        ifgVar.m = jfgVar;
        jfgVar.b(200.0f);
        ifgVar.m.a(0.75f);
        this.p1 = ifgVar;
    }

    public final void q1() throws IllegalAccessException, InvocationTargetException {
        AnimatorSet animatorSet = this.u1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.v1;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ycj ycjVar = this.v;
        if (ycjVar != null) {
            ycjVar.c();
        }
        AnimatorSet animatorSet3 = this.s1;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.t1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        M1();
        N1();
    }

    public final ImageView r1() {
        return (ImageView) this.t.m(this, x1[15]);
    }

    public final View s1() {
        return (View) this.s.m(this, x1[14]);
    }

    public final View t1() {
        return (View) this.r.m(this, x1[13]);
    }

    public final View u1() {
        return (View) this.q.m(this, x1[12]);
    }

    public final View v1() {
        return (View) this.m.m(this, x1[8]);
    }

    public final TextView w1() {
        return (TextView) this.l.m(this, x1[7]);
    }

    public final View x1() {
        return (View) this.i.m(this, x1[4]);
    }

    public final TextView y1() {
        return (TextView) this.j.m(this, x1[5]);
    }

    public final PathInterpolator z1() {
        return (PathInterpolator) this.F.getValue();
    }

    public RecordControlsWidget(t3f t3fVar, fbe fbeVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_key_type", fbeVar)));
    }
}
