package defpackage;

import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ld1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallBottomPanelWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld1(lq4 lq4Var, CallBottomPanelWidget callBottomPanelWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callBottomPanelWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallBottomPanelWidget callBottomPanelWidget = this.g;
        switch (i) {
            case 0:
                ld1 ld1Var = new ld1(lq4Var, callBottomPanelWidget, 0);
                ld1Var.f = obj;
                return ld1Var;
            case 1:
                ld1 ld1Var2 = new ld1(lq4Var, callBottomPanelWidget, 1);
                ld1Var2.f = obj;
                return ld1Var2;
            case 2:
                ld1 ld1Var3 = new ld1(lq4Var, callBottomPanelWidget, 2);
                ld1Var3.f = obj;
                return ld1Var3;
            default:
                ld1 ld1Var4 = new ld1(lq4Var, callBottomPanelWidget, 3);
                ld1Var4.f = obj;
                return ld1Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ld1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ld1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ld1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((ld1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        yc1 yc1Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallBottomPanelWidget callBottomPanelWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (!((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr = CallBottomPanelWidget.l;
                    mvh mvhVar = callBottomPanelWidget.o1().H;
                    if (mvhVar != null) {
                        mvhVar.a();
                    }
                } else {
                    zv8[] zv8VarArr2 = CallBottomPanelWidget.l;
                    qc1 qc1VarO1 = callBottomPanelWidget.o1();
                    qc1VarO1.H = qc1VarO1.y(qc1VarO1.H, qc1VarO1.x, new tnh(R.string.call_tooltip_mic_disabled), new z2(qc1VarO1, 8, new r(13, callBottomPanelWidget)), Integer.valueOf(R.drawable.ic_mic_disabled_24));
                }
                break;
            case 1:
                ch3.d0(obj);
                if (!((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr3 = CallBottomPanelWidget.l;
                    mvh mvhVar2 = callBottomPanelWidget.o1().I;
                    if (mvhVar2 != null) {
                        mvhVar2.a();
                    }
                } else {
                    zv8[] zv8VarArr4 = CallBottomPanelWidget.l;
                    qc1 qc1VarO2 = callBottomPanelWidget.o1();
                    qc1VarO2.I = qc1VarO2.y(qc1VarO2.I, qc1VarO2.z, new tnh(R.string.call_tooltip_raise_hand), new mc1(qc1VarO2, 2), null);
                }
                break;
            case 2:
                ch3.d0(obj);
                l11 l11Var = (l11) obj2;
                zv8[] zv8VarArr5 = CallBottomPanelWidget.l;
                qc1 qc1VarO3 = callBottomPanelWidget.o1();
                Boolean bool = callBottomPanelWidget.i;
                boolean z = l11Var.f;
                yp9 yp9Var = l11Var.a;
                if (!cqk.d(bool, Boolean.valueOf(z))) {
                    callBottomPanelWidget.i = Boolean.valueOf(z);
                    float fA = yl5.a(qc1VarO3.getContext());
                    if (z) {
                        yc1Var = fA >= 390.0f ? uc1.a : fA >= 360.0f ? tc1.a : sc1.a;
                    } else if (fA >= 390.0f) {
                        yc1Var = xc1.a;
                    } else {
                        yc1Var = fA >= 360.0f ? wc1.a : vc1.a;
                    }
                    qc1VarO3.setControlsSize(yc1Var);
                }
                qc1 qc1VarO4 = callBottomPanelWidget.o1();
                if (qc1VarO4 == null) {
                    qc1VarO4 = null;
                }
                if (qc1VarO4 != null && qc1VarO4.getVisibility() == 0) {
                    qc1VarO3.setVideoEnabled(l11Var.b);
                    qc1VarO3.setMicrophoneEnabled(yp9Var);
                    qc1VarO3.setRaiseHand(l11Var.c);
                    qc1VarO3.setHoldEnabled(l11Var.d);
                    callBottomPanelWidget.o1().setAudioInfo(l11Var.e);
                    callBottomPanelWidget.g.B(callBottomPanelWidget, CallBottomPanelWidget.l[1], yp9Var == yp9.b ? yab.i0(callBottomPanelWidget.getViewLifecycleScope(), null, 0, new fze(callBottomPanelWidget, callBottomPanelWidget.o1(), (lq4) null, 6), 3) : null);
                }
                break;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr6 = CallBottomPanelWidget.l;
                    qp4 qp4Var = callBottomPanelWidget.h;
                    if (qp4Var != null) {
                        qp4Var.dismiss();
                    }
                    callBottomPanelWidget.h = null;
                }
                break;
        }
        return sbiVar;
    }
}
