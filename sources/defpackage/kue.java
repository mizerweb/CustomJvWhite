package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kue extends OrientationEventListener {
    public final /* synthetic */ oue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kue(Context context, oue oueVar) {
        super(context);
        this.a = oueVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0040  */
    /* JADX WARN: Code duplicated, block: B:41:0x004a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0054  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        List listT1;
        if (i == -1) {
            return;
        }
        oue oueVar = this.a;
        if (oueVar.d == -1) {
            if (i < 0 || i >= 45) {
                if (45 <= i && i < 135) {
                    i2 = 3;
                } else if (135 <= i && i < 225) {
                    i2 = 2;
                } else if (225 <= i && i < 315) {
                    i2 = 1;
                }
            }
            i2 = 0;
        } else if ((i >= 0 && i < 40) || (320 <= i && i < 360)) {
            i2 = 0;
        } else if (50 <= i && i < 130) {
            i2 = 3;
        } else if (140 <= i && i < 220) {
            i2 = 2;
        } else if (230 > i || i >= 310) {
            i2 = oueVar.d;
        } else {
            i2 = 1;
        }
        oue oueVar2 = this.a;
        if (oueVar2.d != i2) {
            oueVar2.d = i2;
            synchronized (oueVar2.a) {
                listT1 = ww3.T1(oueVar2.c.values());
            }
            Iterator it = listT1.iterator();
            while (it.hasNext()) {
                ((mue) it.next()).a(i2);
            }
        }
    }
}
