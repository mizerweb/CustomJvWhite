package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pcg extends qcg {
    public static pcg a(String str, Context context, rcg[] rcgVarArr) {
        StringBuilder sbV = qt4.v("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < rcgVarArr.length; i++) {
            sbV.append("\n\t\tSoSource ");
            sbV.append(i);
            sbV.append(": ");
            sbV.append(rcgVarArr[i].toString());
        }
        if (context != null) {
            sbV.append("\n\tNative lib dir: ");
            sbV.append(context.getApplicationInfo().nativeLibraryDir);
            sbV.append("\n");
        }
        return new pcg(str, sbV.toString());
    }
}
