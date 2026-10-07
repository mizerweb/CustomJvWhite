package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yvk {
    public static final int a(d70 d70Var) {
        int i = d70Var.b;
        int i2 = i == 0 ? -1 : g70.$EnumSwitchMapping$1[qt4.D(i)];
        if (i2 == -1) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        ore.o();
        return 0;
    }

    public static final int b(e70 e70Var) {
        y60 y60Var = e70Var.a;
        switch (y60Var == null ? -1 : g70.$EnumSwitchMapping$0[y60Var.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return a(e70Var.d);
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 13;
            case 12:
                return 15;
            case 13:
                return 17;
            case 14:
                return 18;
            default:
                return -y60Var.ordinal();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1.equals("not.found") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r1.equals("errors.send-message.too-many-total-messages-to-user") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1.equals("file.not.found") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r1.equals("error.message.send.rate.limit") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r1.equals("user.not.found") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r1.equals("error.user.restricted.send") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        return defpackage.f4b.MESSAGE_PERMISSION_ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r1.equals("proto.too.many.simultaneous.requests") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        return defpackage.f4b.MESSAGE_LIMIT_ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1.equals("too.many.requests") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r1.equals("error.user.blocked.send") == false) goto L33;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.f4b c(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -2112074456: goto L53;
                case -1616562882: goto L47;
                case -1475952060: goto L3e;
                case -1216610938: goto L35;
                case -1054334283: goto L2c;
                case 194752625: goto L23;
                case 212698279: goto L1a;
                case 849902887: goto L11;
                case 1562713945: goto L8;
                default: goto L7;
            }
        L7:
            goto L5b
        L8:
            java.lang.String r0 = "too.many.requests"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5e
            goto L5b
        L11:
            java.lang.String r0 = "error.user.blocked.send"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L5b
        L1a:
            java.lang.String r0 = "not.found"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L5b
        L23:
            java.lang.String r0 = "errors.send-message.too-many-total-messages-to-user"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5e
            goto L5b
        L2c:
            java.lang.String r0 = "file.not.found"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L5b
        L35:
            java.lang.String r0 = "error.message.send.rate.limit"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5e
            goto L5b
        L3e:
            java.lang.String r0 = "user.not.found"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L5b
        L47:
            java.lang.String r0 = "error.user.restricted.send"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L50
            goto L5b
        L50:
            f4b r1 = defpackage.f4b.MESSAGE_PERMISSION_ERROR
            return r1
        L53:
            java.lang.String r0 = "proto.too.many.simultaneous.requests"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5e
        L5b:
            f4b r1 = defpackage.f4b.BAD_REQUEST
            return r1
        L5e:
            f4b r1 = defpackage.f4b.MESSAGE_LIMIT_ERROR
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvk.c(java.lang.String):f4b");
    }
}
