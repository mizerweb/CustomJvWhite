package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class q2j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ VideoMessageWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2j(lq4 lq4Var, VideoMessageWidget videoMessageWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = videoMessageWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        VideoMessageWidget videoMessageWidget = this.g;
        switch (i) {
            case 0:
                q2j q2jVar = new q2j(lq4Var, videoMessageWidget, 0);
                q2jVar.f = obj;
                return q2jVar;
            case 1:
                q2j q2jVar2 = new q2j(lq4Var, videoMessageWidget, 1);
                q2jVar2.f = obj;
                return q2jVar2;
            case 2:
                q2j q2jVar3 = new q2j(lq4Var, videoMessageWidget, 2);
                q2jVar3.f = obj;
                return q2jVar3;
            case 3:
                q2j q2jVar4 = new q2j(lq4Var, videoMessageWidget, 3);
                q2jVar4.f = obj;
                return q2jVar4;
            case 4:
                q2j q2jVar5 = new q2j(lq4Var, videoMessageWidget, 4);
                q2jVar5.f = obj;
                return q2jVar5;
            case 5:
                q2j q2jVar6 = new q2j(lq4Var, videoMessageWidget, 5);
                q2jVar6.f = obj;
                return q2jVar6;
            default:
                q2j q2jVar7 = new q2j(lq4Var, videoMessageWidget, 6);
                q2jVar7.f = obj;
                return q2jVar7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((q2j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        float f = 0.0f;
        byte b = 0;
        final int i = 1;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                fhd fhdVar = (fhd) obj2;
                VideoMessageWidget videoMessageWidget = this.g;
                zv8[] zv8VarArr = VideoMessageWidget.B;
                if (!((Boolean) videoMessageWidget.y1().c.H.a.getValue()).booleanValue()) {
                    int i2 = fhdVar == null ? -1 : j2j.$EnumSwitchMapping$0[fhdVar.ordinal()];
                    if (i2 == 1) {
                        videoMessageWidget.q1().setPlaceholder(((w0j) videoMessageWidget.y1().c.s.getValue()).c);
                    } else {
                        if (i2 != 2) {
                            ore.o();
                            return null;
                        }
                        final cyi cyiVarQ1 = videoMessageWidget.q1();
                        l1c l1cVar = cyiVarQ1.d;
                        if (l1cVar.getVisibility() == 0) {
                            ViewPropertyAnimator viewPropertyAnimator = cyiVarQ1.c;
                            if (viewPropertyAnimator != null) {
                                viewPropertyAnimator.cancel();
                            }
                            ViewPropertyAnimator duration = l1cVar.animate().alpha(0.0f).setDuration(200L);
                            final byte b2 = b == true ? 1 : 0;
                            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = duration.withStartAction(new Runnable() { // from class: ayi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i3 = b2;
                                    cyi cyiVar = cyiVarQ1;
                                    switch (i3) {
                                        case 0:
                                            cyiVar.e.setVisibility(0);
                                            break;
                                        default:
                                            cyi.a(cyiVar);
                                            break;
                                    }
                                }
                            }).withEndAction(new Runnable() { // from class: ayi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i3 = i;
                                    cyi cyiVar = cyiVarQ1;
                                    switch (i3) {
                                        case 0:
                                            cyiVar.e.setVisibility(0);
                                            break;
                                        default:
                                            cyi.a(cyiVar);
                                            break;
                                    }
                                }
                            });
                            cyiVarQ1.c = viewPropertyAnimatorWithEndAction;
                            if (viewPropertyAnimatorWithEndAction != null) {
                                viewPropertyAnimatorWithEndAction.start();
                            }
                        }
                    }
                    qt4.C(fhdVar == fhd.b, videoMessageWidget.y1().c.G, null);
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                a2j a2jVar = (a2j) obj3;
                VideoMessageWidget videoMessageWidget2 = this.g;
                zv8[] zv8VarArr2 = VideoMessageWidget.B;
                String name = VideoMessageWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Current video message state: " + a2jVar, null);
                    }
                }
                if (a2jVar instanceof w1j) {
                    videoMessageWidget2.B1();
                    videoMessageWidget2.z1();
                    w1j w1jVar = (w1j) a2jVar;
                    videoMessageWidget2.u1().setImageDrawable(w1jVar.a.b ? (Drawable) videoMessageWidget2.v.getValue() : (Drawable) videoMessageWidget2.w.getValue());
                    videoMessageWidget2.A1(w1jVar.a.a, w1jVar.b);
                } else if (a2jVar instanceof x1j) {
                    videoMessageWidget2.B1();
                    videoMessageWidget2.z1();
                    videoMessageWidget2.A1(false, ((x1j) a2jVar).a);
                } else if (a2jVar instanceof z1j) {
                    z1j z1jVar = (z1j) a2jVar;
                    rui ruiVar = z1jVar.b;
                    if (ruiVar == null) {
                        n7j.a(videoMessageWidget2.s1(), (View) videoMessageWidget2.p.getValue(), -1);
                        zp3 zp3VarV1 = videoMessageWidget2.v1();
                        hve hveVar = zp3VarV1.a;
                        if (!cqk.d(zp3VarV1.b(), "video_message_trim_slider_widget_tag")) {
                            hveVar.S(false);
                            lve lveVarE = oc9.e(new VideoTrimSliderWidget(videoMessageWidget2.getA().b(), new er3(), 0L, 4, null), null, null);
                            lveVarE.e("video_message_trim_slider_widget_tag");
                            hveVar.T(lveVarE);
                        }
                        VideoTrimSliderWidget videoTrimSliderWidgetW1 = videoMessageWidget2.w1();
                        if (videoTrimSliderWidgetW1 != null) {
                            videoTrimSliderWidgetW1.p1().x = videoMessageWidget2.A;
                        }
                        VideoTrimSliderWidget videoTrimSliderWidgetW2 = videoMessageWidget2.w1();
                        if (videoTrimSliderWidgetW2 != null) {
                            videoTrimSliderWidgetW2.s1(z1jVar.a);
                        }
                        if (videoMessageWidget2.u1().getVisibility() == 0 || videoMessageWidget2.r1().getVisibility() == 0 || videoMessageWidget2.t1().getVisibility() == 0) {
                            AnimatorSet animatorSet = videoMessageWidget2.x;
                            if (animatorSet != null && animatorSet.isRunning()) {
                                AnimatorSet animatorSet2 = videoMessageWidget2.x;
                                if (animatorSet2 != null) {
                                    animatorSet2.end();
                                }
                                AnimatorSet animatorSet3 = videoMessageWidget2.x;
                                if (animatorSet3 != null) {
                                    animatorSet3.cancel();
                                }
                            }
                            videoMessageWidget2.x = new AnimatorSet();
                            c79 c79VarW = yab.w();
                            if (videoMessageWidget2.u1().getVisibility() == 0) {
                                c79VarW.add(fsk.a(videoMessageWidget2.u1(), View.ALPHA, videoMessageWidget2.u1().getAlpha(), 0.0f, 200L, 0L, false, 240));
                            }
                            ImageView imageViewR1 = videoMessageWidget2.r1();
                            Property property = View.ALPHA;
                            c79VarW.add(fsk.a(imageViewR1, property, videoMessageWidget2.r1().getAlpha(), 0.0f, 200L, 0L, false, 240));
                            c79VarW.add(fsk.a(videoMessageWidget2.t1(), property, videoMessageWidget2.t1().getAlpha(), 0.0f, 200L, 0L, false, 240));
                            c79 c79VarJ = yab.j(c79VarW);
                            AnimatorSet animatorSet4 = videoMessageWidget2.x;
                            if (animatorSet4 != null) {
                                animatorSet4.playTogether(c79VarJ);
                            }
                            AnimatorSet animatorSet5 = videoMessageWidget2.x;
                            if (animatorSet5 != null) {
                                animatorSet5.addListener(new li(23, videoMessageWidget2));
                            }
                            AnimatorSet animatorSet6 = videoMessageWidget2.x;
                            if (animatorSet6 != null) {
                                animatorSet6.start();
                            }
                            vo8 vo8Var = (vo8) videoMessageWidget2.o.m(videoMessageWidget2, VideoMessageWidget.B[5]);
                            if (vo8Var != null) {
                                vo8Var.b(null);
                            }
                        }
                    } else if (!ruiVar.equals(videoMessageWidget2.q)) {
                        videoMessageWidget2.x1().q0(videoMessageWidget2.g);
                        n7j.a(videoMessageWidget2.s1(), (View) videoMessageWidget2.p.getValue(), -1);
                        ((View) videoMessageWidget2.p.getValue()).setVisibility(0);
                        if (((Boolean) ((e5d) videoMessageWidget2.d.getValue()).x().i()).booleanValue()) {
                            ((zzi) videoMessageWidget2.p.getValue()).setAlpha(0.0f);
                        }
                        zp3 zp3VarV2 = videoMessageWidget2.v1();
                        hve hveVar2 = zp3VarV2.a;
                        if (!cqk.d(zp3VarV2.b(), "video_message_trim_slider_widget_tag")) {
                            hveVar2.S(false);
                            lve lveVarE2 = oc9.e(new VideoTrimSliderWidget(videoMessageWidget2.getA().b(), new er3(), 0L, 4, null), null, null);
                            lveVarE2.e("video_message_trim_slider_widget_tag");
                            hveVar2.T(lveVarE2);
                        }
                        VideoTrimSliderWidget videoTrimSliderWidgetW3 = videoMessageWidget2.w1();
                        if (videoTrimSliderWidgetW3 != null) {
                            videoTrimSliderWidgetW3.p1().x = videoMessageWidget2.A;
                        }
                        VideoTrimSliderWidget videoTrimSliderWidgetW4 = videoMessageWidget2.w1();
                        if (videoTrimSliderWidgetW4 != null) {
                            videoTrimSliderWidgetW4.s1(z1jVar.a);
                        }
                        videoMessageWidget2.q = z1jVar.b;
                        e3j.w(videoMessageWidget2.x1(), z1jVar.b, true, d3j.VIDEO_MSG_VIEWER, 0.0f, 112);
                        ((zzi) videoMessageWidget2.p.getValue()).a.a(videoMessageWidget2.r);
                        if (z1jVar.c) {
                            videoMessageWidget2.q1().setVisibility(8);
                        }
                    }
                } else if (!(a2jVar instanceof y1j)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                String str = (String) obj4;
                VideoMessageWidget videoMessageWidget3 = this.g;
                zv8[] zv8VarArr3 = VideoMessageWidget.B;
                TextView textViewT1 = videoMessageWidget3.t1();
                if (str != null) {
                    textViewT1.setText(str);
                }
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                float fFloatValue = ((Number) obj5).floatValue();
                VideoMessageWidget videoMessageWidget4 = this.g;
                zv8[] zv8VarArr4 = VideoMessageWidget.B;
                pyi pyiVar = videoMessageWidget4.q1().f;
                zv8[] zv8VarArr5 = pyi.A;
                pyiVar.l(fFloatValue, true);
                return sbi.a;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((Boolean) obj6).getClass();
                VideoMessageWidget videoMessageWidget5 = this.g;
                zv8[] zv8VarArr6 = VideoMessageWidget.B;
                ic6 ic6Var = videoMessageWidget5.y1().i;
                sbi sbiVar = sbi.a;
                a8j.x(ic6Var, sbiVar);
                return sbiVar;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                lyi lyiVar = (lyi) obj7;
                VideoMessageWidget videoMessageWidget6 = this.g;
                ny8 ny8Var = videoMessageWidget6.i;
                if (cqk.d(lyiVar, iyi.a)) {
                    if (ny8Var.d()) {
                        e3j e3jVarX1 = videoMessageWidget6.x1();
                        float fA = videoMessageWidget6.x1().a();
                        xme xmeVar = videoMessageWidget6.p;
                        if (fA == 0.0f) {
                            if (xmeVar.d()) {
                                ((zzi) xmeVar.getValue()).c(false);
                            }
                            f = 1.0f;
                        } else if (xmeVar.d()) {
                            ((zzi) xmeVar.getValue()).c(true);
                        }
                        e3jVarX1.b(f);
                    }
                } else if (lyiVar instanceof kyi) {
                    if (ny8Var.d()) {
                        if (!videoMessageWidget6.x1().P()) {
                            videoMessageWidget6.x1().pause();
                        }
                        videoMessageWidget6.x1().seekTo((long) (((kyi) lyiVar).a * videoMessageWidget6.x1().getDuration()));
                    }
                } else if (lyiVar instanceof jyi) {
                    if (ny8Var.d()) {
                        if (!videoMessageWidget6.x1().P()) {
                            videoMessageWidget6.x1().pause();
                        }
                        videoMessageWidget6.x1().seekTo((long) (((jyi) lyiVar).a * videoMessageWidget6.x1().getDuration()));
                    }
                } else if (cqk.d(lyiVar, iyi.b)) {
                    if (ny8Var.d()) {
                        videoMessageWidget6.x1().play();
                    }
                } else if (cqk.d(lyiVar, iyi.d)) {
                    if (ny8Var.d() && !videoMessageWidget6.x1().P()) {
                        videoMessageWidget6.x1().pause();
                    }
                } else {
                    if (!cqk.d(lyiVar, iyi.c)) {
                        ore.o();
                        return null;
                    }
                    if (ny8Var.d()) {
                        videoMessageWidget6.x1().play();
                    }
                }
                return sbi.a;
            default:
                Object obj8 = this.f;
                ch3.d0(obj);
                long jLongValue = ((Number) obj8).longValue();
                VideoMessageWidget videoMessageWidget7 = this.g;
                zv8[] zv8VarArr7 = VideoMessageWidget.B;
                long duration2 = videoMessageWidget7.x1().getDuration();
                VideoTrimSliderWidget videoTrimSliderWidgetW5 = videoMessageWidget7.w1();
                if (videoTrimSliderWidgetW5 != null) {
                    videoTrimSliderWidgetW5.q1(duration2, jLongValue);
                }
                if (duration2 > 0) {
                    float f2 = duration2;
                    if (jLongValue + 50 >= ((long) (((Number) videoMessageWidget7.y1().o.a.getValue()).floatValue() * f2))) {
                        videoMessageWidget7.x1().seekTo((long) (((Number) videoMessageWidget7.y1().m.a.getValue()).floatValue() * f2));
                    }
                }
                return sbi.a;
        }
    }
}
