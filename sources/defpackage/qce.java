package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class qce extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ FrameLayout f;
    public final /* synthetic */ RecordControlsWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qce(int i, lq4 lq4Var, RecordControlsWidget recordControlsWidget) {
        super(3, lq4Var);
        this.e = i;
        this.g = recordControlsWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        RecordControlsWidget recordControlsWidget = this.g;
        FrameLayout frameLayout = (FrameLayout) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                qce qceVar = new qce(0, lq4Var, recordControlsWidget);
                qceVar.f = frameLayout;
                qceVar.invokeSuspend(sbiVar);
                break;
            default:
                qce qceVar2 = new qce(1, lq4Var, recordControlsWidget);
                qceVar2.f = frameLayout;
                qceVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        RecordControlsWidget recordControlsWidget = this.g;
        FrameLayout frameLayout = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = RecordControlsWidget.x1;
                ((GradientDrawable) recordControlsWidget.B.getValue()).setColor(a8gVar.h(frameLayout).h().a);
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = RecordControlsWidget.x1;
                ((GradientDrawable) recordControlsWidget.A.getValue()).setColor(tre.I0(a8gVar.h(frameLayout).h().a, 0.2f));
                break;
        }
        return sbiVar;
    }
}
