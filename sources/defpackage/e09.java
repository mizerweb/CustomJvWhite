package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class e09 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final tz9 e;
    public final pmf f;

    static {
        String str = vqi.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public e09(int i2, long j2, tz9 tz9Var, pmf pmfVar, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = tz9Var;
        this.f = pmfVar;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[LOOP:0: B:28:0x0060->B:30:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    public static e09 a(Bundle bundle) {
        pmf pmfVar;
        pmf pmfVar2;
        int i2;
        String str;
        Bundle bundle2;
        IBinder binder;
        c98 c98VarA;
        z88 z88VarL;
        int i3 = bundle.getInt(g, 0);
        long j2 = bundle.getLong(h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(i);
        Object objB = null;
        tz9 tz9VarA = bundle3 == null ? null : tz9.a(bundle3);
        Bundle bundle4 = bundle.getBundle(l);
        if (bundle4 == null) {
            if (i3 != 0) {
                pmfVar2 = new pmf(i3);
            } else {
                pmfVar = null;
            }
            i2 = bundle.getInt(k);
            if (i2 != 1) {
                str = j;
                if (i2 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        objB = ry9.b(bundle2);
                    }
                } else if (i2 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        c98VarA = m51.a(binder);
                        z88VarL = c98.l();
                        for (int i4 = 0; i4 < c98VarA.size(); i4++) {
                            Bundle bundle5 = (Bundle) c98VarA.get(i4);
                            bundle5.getClass();
                            z88VarL.c(ry9.b(bundle5));
                        }
                        objB = z88VarL.h();
                    }
                } else if (i2 != 4) {
                    c.t();
                    return null;
                }
            }
            return new e09(i3, j2, tz9VarA, pmfVar, objB, i2);
        }
        pmfVar2 = pmf.a(bundle4);
        pmfVar = pmfVar2;
        i2 = bundle.getInt(k);
        if (i2 != 1) {
            str = j;
            if (i2 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    objB = ry9.b(bundle2);
                }
            } else if (i2 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    c98VarA = m51.a(binder);
                    z88VarL = c98.l();
                    while (i4 < c98VarA.size()) {
                        Bundle bundle6 = (Bundle) c98VarA.get(i4);
                        bundle6.getClass();
                        z88VarL.c(ry9.b(bundle6));
                    }
                    objB = z88VarL.h();
                }
            } else if (i2 != 4) {
                c.t();
                return null;
            }
        }
        return new e09(i3, j2, tz9VarA, pmfVar, objB, i2);
    }

    public static e09 b(int i2) {
        pmf pmfVar = new pmf("no error message provided", i2, Bundle.EMPTY);
        return new e09(pmfVar.a, SystemClock.elapsedRealtime(), null, pmfVar, null, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle c() {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = defpackage.e09.g
            int r2 = r7.a
            r0.putInt(r1, r2)
            java.lang.String r1 = defpackage.e09.h
            long r2 = r7.b
            r0.putLong(r1, r2)
            tz9 r1 = r7.e
            if (r1 == 0) goto L3d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = defpackage.tz9.e
            android.os.Bundle r4 = r1.a
            r2.putBundle(r3, r4)
            java.lang.String r3 = defpackage.tz9.f
            boolean r4 = r1.b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.tz9.g
            boolean r4 = r1.c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.tz9.h
            boolean r1 = r1.d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = defpackage.e09.i
            r0.putBundle(r1, r2)
        L3d:
            pmf r1 = r7.f
            if (r1 == 0) goto L4a
            java.lang.String r2 = defpackage.e09.l
            android.os.Bundle r1 = r1.b()
            r0.putBundle(r2, r1)
        L4a:
            java.lang.String r1 = defpackage.e09.k
            int r2 = r7.d
            r0.putInt(r1, r2)
            java.lang.Object r7 = r7.c
            if (r7 != 0) goto L56
            goto L65
        L56:
            r1 = 1
            if (r2 == r1) goto L9a
            r1 = 2
            java.lang.String r3 = defpackage.e09.j
            r4 = 0
            if (r2 == r1) goto L90
            r1 = 3
            if (r2 == r1) goto L66
            r7 = 4
            if (r2 == r7) goto L9a
        L65:
            return r0
        L66:
            m51 r1 = new m51
            c98 r7 = (defpackage.c98) r7
            z88 r2 = defpackage.c98.l()
            r5 = r4
        L6f:
            int r6 = r7.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r7.get(r5)
            ry9 r6 = (defpackage.ry9) r6
            android.os.Bundle r6 = r6.d(r4)
            r2.c(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            ghe r7 = r2.h()
            r1.<init>(r7)
            r0.putBinder(r3, r1)
            return r0
        L90:
            ry9 r7 = (defpackage.ry9) r7
            android.os.Bundle r7 = r7.d(r4)
            r0.putBundle(r3, r7)
            return r0
        L9a:
            defpackage.c.t()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e09.c():android.os.Bundle");
    }
}
