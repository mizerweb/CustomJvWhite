package defpackage;

import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aoj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aoj(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ksj ksjVar = (ksj) obj2;
                return ((Vibrator) ((ioj) obj3).w.getValue()).hasAmplitudeControl() ? VibrationEffect.createWaveform(ksjVar.a, ksjVar.b, -1) : VibrationEffect.createWaveform(ksjVar.c, -1);
            case 1:
                ((fzj) obj3).b.d((qxe) obj, (dzj) obj2);
                return sbi.a;
            default:
                return Boolean.valueOf(WorkersQueueDao_Impl.contains$lambda$0((WorkersQueueDao_Impl) obj3, (List) obj2, (qxe) obj));
        }
    }
}
