package defpackage;

import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p4k {
    public final ConcurrentHashMap a;
    public volatile byte[] b;
    public final SecureRandom c;
    public final int d;

    public p4k(Integer num, ku8 ku8Var) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        int iIntValue = num != null ? num.intValue() : 8;
        this.d = iIntValue;
        SecureRandom secureRandom = new SecureRandom();
        this.c = secureRandom;
        byte[] bArr = new byte[iIntValue];
        secureRandom.nextBytes(bArr);
        this.b = bArr;
        concurrentHashMap.put(0, new z5k(0, this.b, 2));
    }

    public final byte[] a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(numValueOf)) {
            return null;
        }
        z5k z5kVar = (z5k) concurrentHashMap.get(Integer.valueOf(i));
        if (qt4.e(z5kVar.c, 4)) {
            return null;
        }
        z5kVar.c = 4;
        return z5kVar.b;
    }

    public final List b() {
        int i = 14;
        return (List) this.a.values().stream().filter(new e05(i)).map(new f05(i)).collect(Collectors.toList());
    }
}
