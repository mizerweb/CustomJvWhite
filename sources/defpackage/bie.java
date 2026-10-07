package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class bie {
    public final String a;
    public final CharSequence b;
    public final boolean c;
    public final Bundle d;
    public final Set e;

    public bie(String str, String str2, boolean z, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bundle;
        this.e = hashSet;
    }

    public static RemoteInput[] a(bie[] bieVarArr) {
        if (bieVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bieVarArr.length];
        for (int i = 0; i < bieVarArr.length; i++) {
            bie bieVar = bieVarArr[i];
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(bieVar.a).setLabel(bieVar.b).setChoices(null).setAllowFreeFormInput(bieVar.c).addExtras(bieVar.d);
            Set set = bieVar.e;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    builderAddExtras.setAllowDataType((String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                io.i(builderAddExtras);
            }
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }

    public final boolean b() {
        Set set;
        return (this.c || (set = this.e) == null || set.isEmpty()) ? false : true;
    }
}
