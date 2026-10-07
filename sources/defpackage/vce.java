package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import java.util.ArrayList;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class vce extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ycj g;
    public final /* synthetic */ RecordControlsWidget h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vce(lq4 lq4Var, ycj ycjVar, RecordControlsWidget recordControlsWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ycjVar;
        this.h = recordControlsWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        RecordControlsWidget recordControlsWidget = this.h;
        ycj ycjVar = this.g;
        switch (i) {
            case 0:
                vce vceVar = new vce(lq4Var, ycjVar, recordControlsWidget, 0);
                vceVar.f = obj;
                return vceVar;
            default:
                vce vceVar2 = new vce(lq4Var, ycjVar, recordControlsWidget, 1);
                vceVar2.f = obj;
                return vceVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((vce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((vce) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ycj ycjVar = this.g;
        RecordControlsWidget recordControlsWidget = this.h;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                ycjVar.d((Long) ((mjg) recordControlsWidget.I1().I()).getValue(), (c89) obj2);
                return sbiVar;
            default:
                ch3.d0(obj);
                rc0 rc0Var = (rc0) obj2;
                int i2 = 0;
                if (rc0Var instanceof qc0) {
                    yc0 waveView = ycjVar.getWaveView();
                    ArrayList arrayList = ((qc0) rc0Var).a;
                    zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                    long jLongValue = ((Number) ((mjg) recordControlsWidget.I1().I()).getValue()).longValue();
                    waveView.f = arrayList;
                    waveView.e = 0.0f;
                    waveView.o = jLongValue;
                    waveView.g = false;
                    waveView.h.setColor(tre.I0(pq3.j.h(waveView).getIcon().h, 0.5f));
                    ValueAnimator valueAnimator = waveView.m;
                    valueAnimator.cancel();
                    Path path = waveView.l;
                    if (!path.isEmpty()) {
                        path.reset();
                    }
                    waveView.a();
                    valueAnimator.start();
                    return sbiVar;
                }
                if (!(rc0Var instanceof pc0)) {
                    if (!(rc0Var instanceof oc0)) {
                        ore.o();
                        return null;
                    }
                    yc0 waveView2 = ycjVar.getWaveView();
                    waveView2.l.reset();
                    waveView2.o = 0L;
                    waveView2.e = 0.0f;
                    waveView2.invalidate();
                    return sbiVar;
                }
                yc0 waveView3 = ycjVar.getWaveView();
                ArrayList arrayList2 = ((pc0) rc0Var).a;
                zv8[] zv8VarArr3 = RecordControlsWidget.x1;
                long jLongValue2 = ((Number) ((mjg) recordControlsWidget.I1().I()).getValue()).longValue();
                waveView3.f = arrayList2;
                waveView3.g = true;
                waveView3.o = jLongValue2;
                waveView3.m.cancel();
                waveView3.n = 0.0f;
                if (!waveView3.isLaidOut() || waveView3.isLayoutRequested()) {
                    waveView3.addOnLayoutChangeListener(new xc0(i2, waveView3));
                    return sbiVar;
                }
                Path path2 = waveView3.l;
                if (!path2.isEmpty()) {
                    path2.reset();
                }
                waveView3.a();
                waveView3.postInvalidate();
                return sbiVar;
        }
    }
}
