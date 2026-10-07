package defpackage;

import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jw8 {
    public ArrayList a;

    public jw8(azh azhVar) {
        String str = byj.a;
        fg4 fg4Var = azhVar.b;
        hdb hdbVar = azhVar.d;
        ArrayList arrayListR0 = xw3.R0(new hu0(fg4Var, 0), new hu0(azhVar.c, 1), new hu0(azhVar.e, 2));
        if (Build.VERSION.SDK_INT >= 28) {
            arrayListR0.add(new cdb((ConnectivityManager) azhVar.a.getSystemService("connectivity")));
        } else {
            arrayListR0.addAll(xw3.P0(new qcb(hdbVar, 0), new qcb(hdbVar, 1), new zcb(hdbVar), new ycb(hdbVar)));
        }
        this.a = arrayListR0;
    }
}
