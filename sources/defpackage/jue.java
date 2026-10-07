package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jue extends OrientationEventListener {
    public int a;
    public final /* synthetic */ xtj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jue(xtj xtjVar, Context context) {
        super(context);
        this.b = xtjVar;
        this.a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        ArrayList<lue> arrayList;
        if (i == -1) {
            return;
        }
        if (i >= 315 || i < 45) {
            i2 = 0;
        } else if (i >= 225) {
            i2 = 1;
        } else {
            i2 = i >= 135 ? 2 : 3;
        }
        if (this.a != i2) {
            this.a = i2;
            synchronized (this.b.b) {
                arrayList = new ArrayList(((HashMap) this.b.d).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (lue lueVar : arrayList) {
                lueVar.b.execute(new ai(lueVar, i2, 19));
            }
        }
    }
}
