package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b6k {
    public final int a;
    public final hak b;
    public final ma4 c;
    public final u4k d;
    public final s4k e;
    public final byte[] f;
    public final byte[] g;
    public volatile int h = 2;
    public volatile byte[] i;

    public b6k(hak hakVar, ma4 ma4Var, ku8 ku8Var) {
        this.b = hakVar;
        u4k u4kVar = new u4k(null, ku8Var);
        this.d = u4kVar;
        this.a = u4kVar.d;
        this.f = u4kVar.b;
        this.c = ma4Var;
        byte[] bArr = new byte[8];
        this.g = bArr;
        new SecureRandom().nextBytes(bArr);
        s4k s4kVar = new s4k(8, ku8Var);
        s4kVar.b = bArr;
        s4kVar.a.put(0, new z5k(0, bArr, 2));
        this.e = s4kVar;
    }

    public final void a() {
        u4k u4kVar = this.d;
        ConcurrentHashMap concurrentHashMap = u4kVar.a;
        int iIntValue = ((Integer) concurrentHashMap.keySet().stream().max(new ps0(28)).get()).intValue() + 1;
        byte[] bArr = new byte[u4kVar.d];
        u4kVar.c.nextBytes(bArr);
        concurrentHashMap.put(Integer.valueOf(iIntValue), new z5k(iIntValue, bArr, 1));
        i8k i8kVar = new i8k();
        i8kVar.a = iIntValue;
        i8kVar.b = 0;
        i8kVar.c = bArr;
        byte[] bArr2 = new byte[16];
        i8kVar.d = bArr2;
        i8k.e.nextBytes(bArr2);
        this.b.d(i8kVar, w4k.d, new a6k(this, 0));
    }
}
