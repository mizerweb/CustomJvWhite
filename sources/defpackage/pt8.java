package defpackage;

import java.io.Serializable;
import java.io.StringReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pt8 implements Serializable {
    public static final int l;
    public static final int m;
    public static final int n;
    public static final oif o;
    public final transient ot2 a;
    public final transient v61 b;
    public final int c;
    public final int d;
    public final int e;
    public final xu8 f;
    public final sa6 g;
    public final sa6 h;
    public final sa6 i;
    public final oif j;
    public final char k;

    static {
        int iB = 0;
        for (int i : qt4.H(5)) {
            if (i == 0) {
                throw null;
            }
            iB |= mw7.b(i);
        }
        l = iB;
        int i2 = 0;
        for (gu8 gu8Var : gu8.values()) {
            if (gu8Var.a) {
                i2 |= gu8Var.b;
            }
        }
        m = i2;
        int i3 = 0;
        for (qt8 qt8Var : qt8.values()) {
            if (qt8Var.a) {
                i3 |= qt8Var.b;
            }
        }
        n = i3;
        o = new oif();
    }

    public pt8() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = new v61((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        int i = l;
        this.c = i;
        this.d = m;
        this.e = n;
        this.j = o;
        this.f = xu8.c;
        this.k = '\"';
        sa6 sa6Var = sa6.b;
        this.g = sa6Var;
        this.i = sa6.c;
        this.h = sa6.a;
        this.a = new ot2(sa6Var, i, System.identityHashCode(this));
    }

    public final l38 a(ep4 ep4Var, boolean z) {
        x31 x31Var;
        SoftReference softReference;
        switch ((!mw7.a(4, this.c) ? xu8.b : this.f).a) {
            case 0:
                x31Var = new x31();
                break;
            default:
                ThreadLocal threadLocal = y31.b;
                SoftReference softReference2 = (SoftReference) threadLocal.get();
                x31Var = softReference2 == null ? null : (x31) softReference2.get();
                if (x31Var == null) {
                    x31Var = new x31();
                    phf phfVar = y31.a;
                    if (phfVar != null) {
                        ReferenceQueue referenceQueue = (ReferenceQueue) phfVar.c;
                        softReference = new SoftReference(x31Var, referenceQueue);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) phfVar.b;
                        concurrentHashMap.put(softReference, Boolean.TRUE);
                        while (true) {
                            SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                            if (softReference3 != null) {
                                concurrentHashMap.remove(softReference3);
                            }
                        }
                    } else {
                        softReference = new SoftReference(x31Var);
                    }
                    threadLocal.set(softReference);
                }
                break;
        }
        return new l38(this.g, this.i, this.h, x31Var, ep4Var, z);
    }

    public final p8e b(String str) {
        int length = str.length();
        ot2 ot2Var = this.a;
        sa6 sa6Var = this.h;
        if (length > 32768) {
            StringReader stringReader = new StringReader(str);
            return new p8e(a(new ep4(true, stringReader, sa6Var), false), this.d, stringReader, ot2Var.c());
        }
        l38 l38VarA = a(new ep4(true, str, sa6Var), true);
        if (l38VarA.k != null) {
            ore.k("Trying to call same allocXxx() method second time");
            return null;
        }
        char[] cArrA = l38VarA.e.a(0, length);
        l38VarA.k = cArrA;
        str.getChars(0, length, cArrA, 0);
        return new p8e(l38VarA, this.d, ot2Var.c(), cArrA, length);
    }
}
