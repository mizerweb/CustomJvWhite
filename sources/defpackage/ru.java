package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ru {
    public final boolean a;
    public final u8b b;

    public ru(u8b u8bVar, boolean z) {
        this.a = z;
        this.b = u8bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (((java.lang.Boolean) r1.a).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (((java.lang.Boolean) r2.a).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (((java.lang.Boolean) ((defpackage.e5i) r0.g(r0.b - 1)).a).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        return defpackage.maj.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        return defpackage.maj.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r7.a != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.maj a(long r8) {
        /*
            r7 = this;
            u8b r0 = r7.b
            boolean r1 = r0.i()
            if (r1 == 0) goto Ld
            boolean r7 = r7.a
            if (r7 == 0) goto L72
            goto L6f
        Ld:
            r7 = 0
            java.lang.Object r1 = r0.g(r7)
            e5i r1 = (defpackage.e5i) r1
            java.lang.Object r2 = r1.b
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L2b
            java.lang.Object r7 = r1.a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L72
            goto L6f
        L2b:
            int r1 = r0.b
        L2d:
            if (r7 >= r1) goto L5b
            java.lang.Object r2 = r0.g(r7)
            e5i r2 = (defpackage.e5i) r2
            java.lang.Object r3 = r2.b
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            java.lang.Object r5 = r2.c
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L58
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto L58
            java.lang.Object r7 = r2.a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L72
            goto L6f
        L58:
            int r7 = r7 + 1
            goto L2d
        L5b:
            int r7 = r0.b
            int r7 = r7 + (-1)
            java.lang.Object r7 = r0.g(r7)
            e5i r7 = (defpackage.e5i) r7
            java.lang.Object r7 = r7.a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L72
        L6f:
            maj r7 = defpackage.maj.a
            return r7
        L72:
            maj r7 = defpackage.maj.b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru.a(long):maj");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return this.a == ruVar.a && this.b.equals(ruVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AppVisibilityResolver(isStartedInForeground=" + this.a + ", intervals=" + this.b + ")";
    }
}
