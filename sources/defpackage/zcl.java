package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zcl {
    public static Bundle a(klb klbVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatA = klbVar.a();
        Bundle bundle2 = klbVar.a;
        bundle.putInt("icon", iconCompatA != null ? iconCompatA.d() : 0);
        bundle.putCharSequence("title", klbVar.h);
        bundle.putParcelable("actionIntent", klbVar.i);
        Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
        bundle3.putBoolean("android.support.allowGeneratedReplies", klbVar.d);
        bundle.putBundle("extras", bundle3);
        bie[] bieVarArr = klbVar.c;
        Bundle[] bundleArr = null;
        if (bieVarArr != null) {
            Bundle[] bundleArr2 = new Bundle[bieVarArr.length];
            for (int i = 0; i < bieVarArr.length; i++) {
                bie bieVar = bieVarArr[i];
                Bundle bundle4 = new Bundle();
                bundle4.putString("resultKey", bieVar.a);
                bundle4.putCharSequence("label", bieVar.b);
                bundle4.putCharSequenceArray("choices", null);
                bundle4.putBoolean("allowFreeFormInput", bieVar.c);
                bundle4.putBundle("extras", bieVar.d);
                Set set = bieVar.e;
                if (set != null && !set.isEmpty()) {
                    ArrayList<String> arrayList = new ArrayList<>(set.size());
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                    bundle4.putStringArrayList("allowedDataTypes", arrayList);
                }
                bundleArr2[i] = bundle4;
            }
            bundleArr = bundleArr2;
        }
        bundle.putParcelableArray("remoteInputs", bundleArr);
        bundle.putBoolean("showsUserInterface", klbVar.e);
        bundle.putInt("semanticAction", klbVar.f);
        return bundle;
    }

    public static boolean b(int i) {
        return (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0;
    }
}
