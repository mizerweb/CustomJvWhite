package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m6j extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ VideoWebViewScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6j(lq4 lq4Var, VideoWebViewScreen videoWebViewScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = videoWebViewScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        VideoWebViewScreen videoWebViewScreen = this.g;
        switch (i) {
            case 0:
                m6j m6jVar = new m6j(lq4Var, videoWebViewScreen, 0);
                m6jVar.f = obj;
                return m6jVar;
            case 1:
                m6j m6jVar2 = new m6j(lq4Var, videoWebViewScreen, 1);
                m6jVar2.f = obj;
                return m6jVar2;
            case 2:
                m6j m6jVar3 = new m6j(lq4Var, videoWebViewScreen, 2);
                m6jVar3.f = obj;
                return m6jVar3;
            case 3:
                m6j m6jVar4 = new m6j(lq4Var, videoWebViewScreen, 3);
                m6jVar4.f = obj;
                return m6jVar4;
            case 4:
                m6j m6jVar5 = new m6j(lq4Var, videoWebViewScreen, 4);
                m6jVar5.f = obj;
                return m6jVar5;
            default:
                m6j m6jVar6 = new m6j(lq4Var, videoWebViewScreen, 5);
                m6jVar6.f = obj;
                return m6jVar6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((m6j) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                VideoWebViewScreen videoWebViewScreen = this.g;
                zv8[] zv8VarArr = VideoWebViewScreen.A;
                videoWebViewScreen.K1().loadUrl((String) obj2);
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                VideoWebViewScreen videoWebViewScreen2 = this.g;
                zv8[] zv8VarArr2 = VideoWebViewScreen.A;
                videoWebViewScreen2.H1().b((k53) obj3);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj4;
                if (cqk.d(rbbVar, rt3.b)) {
                    z43.b.b().f();
                } else if (rbbVar instanceof i65) {
                    z43.b.e((i65) rbbVar);
                } else if (rbbVar instanceof f6j) {
                    String str = sj8.a;
                    sj8.j(this.g.getContext(), ((f6j) rbbVar).b, null);
                }
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                plc plcVar = (plc) obj5;
                VideoWebViewScreen videoWebViewScreen3 = this.g;
                j8e j8eVar = videoWebViewScreen3.m;
                j8e j8eVar2 = videoWebViewScreen3.n;
                zv8[] zv8VarArr3 = VideoWebViewScreen.A;
                if (plcVar == null || plcVar.equals(mlc.a)) {
                    zv8[] zv8VarArr4 = VideoWebViewScreen.A;
                    ((r6c) j8eVar.m(videoWebViewScreen3, zv8VarArr4[7])).setVisibility(0);
                    ((LinearLayout) j8eVar2.m(videoWebViewScreen3, zv8VarArr4[8])).setVisibility(8);
                    videoWebViewScreen3.K1().setVisibility(8);
                } else if (plcVar.equals(llc.a)) {
                    zv8[] zv8VarArr5 = VideoWebViewScreen.A;
                    ((LinearLayout) j8eVar2.m(videoWebViewScreen3, zv8VarArr5[8])).setVisibility(0);
                    videoWebViewScreen3.K1().setVisibility(8);
                    ((r6c) j8eVar.m(videoWebViewScreen3, zv8VarArr5[7])).setVisibility(8);
                } else {
                    if (!(plcVar instanceof nlc) && !plcVar.equals(olc.a)) {
                        ore.o();
                        return null;
                    }
                    videoWebViewScreen3.K1().setVisibility(0);
                    zv8[] zv8VarArr6 = VideoWebViewScreen.A;
                    ((LinearLayout) j8eVar2.m(videoWebViewScreen3, zv8VarArr6[8])).setVisibility(8);
                    ((r6c) j8eVar.m(videoWebViewScreen3, zv8VarArr6[7])).setVisibility(8);
                }
                return sbi.a;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                p6j p6jVar = (p6j) obj6;
                VideoWebViewScreen videoWebViewScreen4 = this.g;
                zv8[] zv8VarArr7 = VideoWebViewScreen.A;
                if ((p6jVar == null || !p6jVar.b) && (p6jVar == null || p6jVar.a != 2)) {
                    videoWebViewScreen4.F1(true);
                } else {
                    videoWebViewScreen4.F1(false);
                }
                Integer numValueOf = p6jVar != null ? Integer.valueOf(p6jVar.a) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    FrameLayout frameLayoutL1 = videoWebViewScreen4.L1();
                    ViewGroup.LayoutParams layoutParams = frameLayoutL1.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.bottomMargin = 0;
                    frameLayoutL1.setLayoutParams(marginLayoutParams);
                    videoWebViewScreen4.L1().requestLayout();
                    videoWebViewScreen4.L1().invalidate();
                    videoWebViewScreen4.I1().bringToFront();
                    videoWebViewScreen4.H1().setVisibility(8);
                } else {
                    FrameLayout frameLayoutL2 = videoWebViewScreen4.L1();
                    ViewGroup.LayoutParams layoutParams2 = frameLayoutL2.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int height = videoWebViewScreen4.I1().getHeight();
                    Integer numL = n7j.l(videoWebViewScreen4.I1());
                    marginLayoutParams2.topMargin = height + (numL != null ? numL.intValue() : 0);
                    int height2 = videoWebViewScreen4.H1().getHeight();
                    Integer numH = n7j.h(videoWebViewScreen4.H1());
                    marginLayoutParams2.bottomMargin = height2 + (numH != null ? numH.intValue() : 0);
                    frameLayoutL2.setLayoutParams(marginLayoutParams2);
                    videoWebViewScreen4.I1().bringToFront();
                    videoWebViewScreen4.H1().bringToFront();
                    videoWebViewScreen4.H1().setVisibility(0);
                }
                return sbi.a;
            default:
                Object obj7 = this.f;
                ch3.d0(obj);
                vr4 vr4Var = (vr4) obj7;
                VideoWebViewScreen videoWebViewScreen5 = this.g;
                zv8[] zv8VarArr8 = VideoWebViewScreen.A;
                if (cqk.d(vr4Var, pr4.a)) {
                    videoWebViewScreen5.J1().C(R.id.video_share);
                } else {
                    String name = VideoWebViewScreen.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "videoWebView: Info panel event handle " + vr4Var, null);
                        }
                    }
                }
                return sbi.a;
        }
    }
}
