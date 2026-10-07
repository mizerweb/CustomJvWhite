package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.di.component.DnsStoreInPrefs$Companion$BrokenInetAddressException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ksl {
    public static final ArrayList a(List list) {
        Iterator it;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vk2 vk2Var = (vk2) it2.next();
            wwg uwgVar = null;
            if (vk2Var instanceof uk2) {
                umh umhVar = ((uk2) vk2Var).a;
                long j = umhVar.a;
                int iV = v0h.v(umhVar.b.name());
                int i = umhVar.c;
                int i2 = umhVar.d;
                String string = umhVar.e.toString();
                int i3 = umhVar.f;
                if (i3 == 1) {
                    str = "THIN";
                } else if (i3 == 2) {
                    str = "SEMIBOLD";
                } else {
                    if (i3 != 3) {
                        throw null;
                    }
                    str = "BOLD";
                }
                it = it2;
                uwgVar = new vwg(new tmh(j, iV, i, i2, string, v0h.w(str), umhVar.g, umhVar.h, umhVar.i, umhVar.j, umhVar.k, new RectF(umhVar.n)));
            } else {
                it = it2;
                if (vk2Var instanceof sk2) {
                    lu5 lu5Var = ((sk2) vk2Var).a;
                    long j2 = lu5Var.a;
                    jy8 jy8Var = lu5Var.b;
                    int i4 = jy8Var.c;
                    float f = jy8Var.d;
                    List<mu5> list2 = jy8Var.e;
                    ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                    for (mu5 mu5Var : list2) {
                        arrayList2.add(new ou5(nu5.valueOf(x05.n(mu5Var.a)), mu5Var.b));
                    }
                    uwgVar = new uwg(new ku5(j2, i4, f, arrayList2, new Rect(lu5Var.c)));
                } else if (!(vk2Var instanceof tk2)) {
                    ore.o();
                    return null;
                }
            }
            if (uwgVar != null) {
                arrayList.add(uwgVar);
            }
            it2 = it;
        }
        return arrayList;
    }

    public static InetAddress b(String str) {
        int iV0 = r5h.V0(str, "/", 0, false, 6);
        Integer numValueOf = Integer.valueOf(iV0);
        if (iV0 == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            throw new DnsStoreInPrefs$Companion$BrokenInetAddressException();
        }
        int iIntValue = numValueOf.intValue();
        try {
            try {
                return InetAddress.getByAddress(iIntValue < str.length() + (-1) ? str.substring(iIntValue + 1) : "", av7.c(str.substring(0, iIntValue)));
            } catch (UnknownHostException unused) {
                throw new DnsStoreInPrefs$Companion$BrokenInetAddressException();
            }
        } catch (IllegalArgumentException unused2) {
            throw new DnsStoreInPrefs$Companion$BrokenInetAddressException();
        }
    }
}
