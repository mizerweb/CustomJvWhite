package defpackage;

import android.content.Context;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes3.dex */
public final class vwf {
    public final String a = vwf.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public vuf e;
    public long f;

    public vwf(Context context) {
        final int i = 0;
        this.b = rx8.P(3, new twf(context, i));
        this.c = rx8.P(3, new af7(this) { // from class: uwf
            public final /* synthetic */ vwf b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                vwf vwfVar = this.b;
                switch (i2) {
                    case 0:
                        return ((SensorManager) vwfVar.b.getValue()).getDefaultSensor(1);
                    default:
                        return new zwd(i3, vwfVar);
                }
            }
        });
        final int i2 = 1;
        this.d = rx8.P(3, new af7(this) { // from class: uwf
            public final /* synthetic */ vwf b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                int i4 = 1;
                vwf vwfVar = this.b;
                switch (i3) {
                    case 0:
                        return ((SensorManager) vwfVar.b.getValue()).getDefaultSensor(1);
                    default:
                        return new zwd(i4, vwfVar);
                }
            }
        });
    }
}
