package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class gl8 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public gl8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    public final et3 a() {
        return (et3) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0211  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0231 A[Catch: all -> 0x0263, CancellationException -> 0x0269, TryCatch #0 {all -> 0x0263, blocks: (B:103:0x0218, B:106:0x0231, B:108:0x0237), top: B:121:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a A[PHI: r1 r2
  0x011a: PHI (r1v28 int) = (r1v0 int), (r1v6 int), (r1v29 int) binds: [B:57:0x0116, B:36:0x009f, B:97:0x01f5] A[DONT_GENERATE, DONT_INLINE]
  0x011a: PHI (r2v27 int) = (r2v0 int), (r2v5 int), (r2v28 int) binds: [B:57:0x0116, B:36:0x009f, B:97:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x014a A[Catch: all -> 0x011e, CancellationException -> 0x0269, TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x016f A[Catch: all -> 0x011e, CancellationException -> 0x0269, PHI: r1 r2 r3 r9
  0x016f: PHI (r1v11 int) = (r1v7 int), (r1v14 int) binds: [B:69:0x0148, B:74:0x016a] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r2v10 int) = (r2v6 int), (r2v13 int) binds: [B:69:0x0148, B:74:0x016a] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r3v16 int) = (r3v13 int), (r3v18 int) binds: [B:69:0x0148, B:74:0x016a] A[DONT_GENERATE, DONT_INLINE]
  0x016f: PHI (r9v19 int) = (r9v15 int), (r9v22 int) binds: [B:69:0x0148, B:74:0x016a] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0175 A[Catch: all -> 0x011e, CancellationException -> 0x0269, TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199 A[Catch: all -> 0x011e, CancellationException -> 0x0269, PHI: r1 r2 r3 r9
  0x0199: PHI (r1v16 int) = (r1v11 int), (r1v19 int) binds: [B:76:0x0173, B:81:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0199: PHI (r2v15 int) = (r2v10 int), (r2v18 int) binds: [B:76:0x0173, B:81:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0199: PHI (r3v19 int) = (r3v16 int), (r3v21 int) binds: [B:76:0x0173, B:81:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x0199: PHI (r9v24 int) = (r9v19 int), (r9v27 int) binds: [B:76:0x0173, B:81:0x0194] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x019f A[Catch: all -> 0x011e, CancellationException -> 0x0269, TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4 A[Catch: all -> 0x011e, CancellationException -> 0x0269, PHI: r1 r2 r3 r9
  0x01c4: PHI (r1v21 int) = (r1v16 int), (r1v24 int) binds: [B:83:0x019d, B:88:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r2v20 int) = (r2v15 int), (r2v23 int) binds: [B:83:0x019d, B:88:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r3v22 int) = (r3v19 int), (r3v24 int) binds: [B:83:0x019d, B:88:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r9v29 int) = (r9v24 int), (r9v32 int) binds: [B:83:0x019d, B:88:0x01bf] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cc A[Catch: all -> 0x011e, CancellationException -> 0x0269, TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef A[Catch: all -> 0x011e, CancellationException -> 0x0269, PHI: r1 r2 r3 r9
  0x01ef: PHI (r1v29 int) = (r1v21 int), (r1v32 int) binds: [B:90:0x01ca, B:95:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r2v28 int) = (r2v20 int), (r2v31 int) binds: [B:90:0x01ca, B:95:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r3v25 int) = (r3v22 int), (r3v29 int) binds: [B:90:0x01ca, B:95:0x01ea] A[DONT_GENERATE, DONT_INLINE]
  0x01ef: PHI (r9v34 int) = (r9v29 int), (r9v36 int) binds: [B:90:0x01ca, B:95:0x01ea] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7 A[Catch: all -> 0x011e, CancellationException -> 0x0269, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0269, blocks: (B:13:0x0040, B:103:0x0218, B:106:0x0231, B:108:0x0237, B:18:0x0055, B:96:0x01ef, B:98:0x01f7, B:23:0x0067, B:89:0x01c4, B:91:0x01cc, B:26:0x0074, B:82:0x0199, B:84:0x019f, B:29:0x0081, B:75:0x016f, B:77:0x0175, B:32:0x008e, B:68:0x0144, B:70:0x014a, B:35:0x009c, B:44:0x00d7, B:46:0x00dd, B:48:0x00e3, B:50:0x00e9, B:52:0x00ef, B:54:0x00f7, B:56:0x00ff, B:62:0x0121, B:64:0x0127), top: B:123:0x0033 }] */
    public final Object b(int i, int i2, nq4 nq4Var) {
        el8 el8Var;
        Object poeVar;
        int i3;
        int i4;
        Throwable thA;
        int i5;
        int i6;
        ns3 ns3Var;
        int i7;
        int i8;
        int i9;
        int i10;
        ns3 ns3Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        ns3 ns3Var3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ns3 ns3Var4;
        int i23;
        int i24;
        cl8 cl8Var;
        a4c a4cVar;
        int i25 = i;
        int i26 = i2;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof el8) {
            el8Var = (el8) nq4Var;
            int i27 = el8Var.j;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                el8Var.j = i27 - Integer.MIN_VALUE;
            } else {
                el8Var = new el8(this, nq4Var);
            }
        } else {
            el8Var = new el8(this, nq4Var);
        }
        Object obj = el8Var.h;
        hu4 hu4Var = hu4.a;
        int i28 = el8Var.j;
        try {
            try {
                try {
                    switch (i28) {
                        case 0:
                            ch3.d0(obj);
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, "InvalidateDbTask", s5h.y0("WARNING! Invalidate db start, backend logic. \n                |curVer:" + i25 + ", \n                |mask:" + i26 + "\n                |"), null);
                            }
                            try {
                                if (gm0.w(1, i26) && gm0.w(2, i26) && gm0.w(4, i26) && gm0.w(8, i26) && gm0.w(16, i26) && gm0.w(32, i26)) {
                                    ns3 ns3Var5 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = 0;
                                    el8Var.g = 0;
                                    el8Var.j = 1;
                                    if (ns3Var5.a(el8Var) == hu4Var) {
                                    }
                                    i3 = i25;
                                    i4 = i26;
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                                if (gm0.w(1, i26)) {
                                    ns3 ns3Var6 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = 0;
                                    el8Var.g = 0;
                                    el8Var.j = 2;
                                    if (ns3Var6.b(el8Var) == hu4Var) {
                                    }
                                }
                                i5 = 0;
                                i6 = 0;
                                if (gm0.w(2, i26)) {
                                    ns3Var = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 3;
                                    if (ns3Var.d(el8Var) == hu4Var) {
                                        int i29 = i6;
                                        i7 = i26;
                                        i8 = i29;
                                        i9 = i25;
                                        i10 = i5;
                                        int i30 = i7;
                                        i6 = i8;
                                        i26 = i30;
                                        i5 = i10;
                                        i25 = i9;
                                        if (gm0.w(4, i26)) {
                                            ns3Var2 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 4;
                                            if (ns3Var2.c(el8Var) != hu4Var) {
                                                int i31 = i6;
                                                i11 = i26;
                                                i12 = i31;
                                                i13 = i25;
                                                i14 = i5;
                                                int i32 = i11;
                                                i6 = i12;
                                                i26 = i32;
                                                i5 = i14;
                                                i25 = i13;
                                                if (gm0.w(8, i26)) {
                                                    ns3Var3 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 5;
                                                    if (ns3Var3.f(el8Var) != hu4Var) {
                                                        int i33 = i6;
                                                        i15 = i26;
                                                        i16 = i33;
                                                        i17 = i25;
                                                        i18 = i5;
                                                        int i34 = i15;
                                                        i6 = i16;
                                                        i26 = i34;
                                                        i5 = i18;
                                                        i25 = i17;
                                                        if (!gm0.w(16, i26)) {
                                                            if (gm0.w(32, i26)) {
                                                                ns3Var4 = (ns3) this.c.getValue();
                                                                el8Var.d = i25;
                                                                el8Var.e = i26;
                                                                el8Var.f = i6;
                                                                el8Var.g = i5;
                                                                el8Var.j = 7;
                                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                                    int i35 = i26;
                                                                    i23 = i25;
                                                                    i24 = i35;
                                                                    i4 = i24;
                                                                    i3 = i23;
                                                                }
                                                            } else {
                                                                i3 = i25;
                                                                i4 = i26;
                                                            }
                                                            ((s7f) a()).z(0);
                                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                                            a4cVar = gm0.f;
                                                            if (a4cVar != null) {
                                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                                break;
                                                            }
                                                            poeVar = sbiVar;
                                                            thA = roe.a(poeVar);
                                                            if (thA != null) {
                                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                            }
                                                            return sbiVar;
                                                        }
                                                        ns3 ns3Var7 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 6;
                                                        ns3Var7.e();
                                                        if (sbiVar != hu4Var) {
                                                            int i36 = i6;
                                                            i19 = i26;
                                                            i20 = i36;
                                                            i21 = i25;
                                                            i22 = i5;
                                                            int i37 = i19;
                                                            i6 = i20;
                                                            i26 = i37;
                                                            i5 = i22;
                                                            i25 = i21;
                                                            if (gm0.w(32, i26)) {
                                                                ns3Var4 = (ns3) this.c.getValue();
                                                                el8Var.d = i25;
                                                                el8Var.e = i26;
                                                                el8Var.f = i6;
                                                                el8Var.g = i5;
                                                                el8Var.j = 7;
                                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                                    int i38 = i26;
                                                                    i23 = i25;
                                                                    i24 = i38;
                                                                    i4 = i24;
                                                                    i3 = i23;
                                                                }
                                                            } else {
                                                                i3 = i25;
                                                                i4 = i26;
                                                            }
                                                            try {
                                                                ((s7f) a()).z(0);
                                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                                a4cVar = gm0.f;
                                                                if (a4cVar != null && a4cVar.b(je9Var)) {
                                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                                }
                                                                poeVar = sbiVar;
                                                                break;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                i25 = i3;
                                                                i26 = i4;
                                                                poeVar = new poe(th);
                                                                i3 = i25;
                                                                i4 = i26;
                                                            }
                                                            thA = roe.a(poeVar);
                                                            if (thA != null) {
                                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                            }
                                                            return sbiVar;
                                                        }
                                                    }
                                                } else {
                                                    if (!gm0.w(16, i26)) {
                                                        if (gm0.w(32, i26)) {
                                                            ns3Var4 = (ns3) this.c.getValue();
                                                            el8Var.d = i25;
                                                            el8Var.e = i26;
                                                            el8Var.f = i6;
                                                            el8Var.g = i5;
                                                            el8Var.j = 7;
                                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                                int i39 = i26;
                                                                i23 = i25;
                                                                i24 = i39;
                                                                i4 = i24;
                                                                i3 = i23;
                                                            }
                                                        } else {
                                                            i3 = i25;
                                                            i4 = i26;
                                                        }
                                                        ((s7f) a()).z(0);
                                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                            break;
                                                        }
                                                        poeVar = sbiVar;
                                                        thA = roe.a(poeVar);
                                                        if (thA != null) {
                                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                        }
                                                        return sbiVar;
                                                    }
                                                    ns3 ns3Var8 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 6;
                                                    ns3Var8.e();
                                                    if (sbiVar != hu4Var) {
                                                        int i310 = i6;
                                                        i19 = i26;
                                                        i20 = i310;
                                                        i21 = i25;
                                                        i22 = i5;
                                                        int i311 = i19;
                                                        i6 = i20;
                                                        i26 = i311;
                                                        i5 = i22;
                                                        i25 = i21;
                                                        if (gm0.w(32, i26)) {
                                                            ns3Var4 = (ns3) this.c.getValue();
                                                            el8Var.d = i25;
                                                            el8Var.e = i26;
                                                            el8Var.f = i6;
                                                            el8Var.g = i5;
                                                            el8Var.j = 7;
                                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                                int i312 = i26;
                                                                i23 = i25;
                                                                i24 = i312;
                                                                i4 = i24;
                                                                i3 = i23;
                                                            }
                                                        } else {
                                                            i3 = i25;
                                                            i4 = i26;
                                                        }
                                                        ((s7f) a()).z(0);
                                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                            break;
                                                        }
                                                        poeVar = sbiVar;
                                                        thA = roe.a(poeVar);
                                                        if (thA != null) {
                                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                        }
                                                        return sbiVar;
                                                    }
                                                }
                                            }
                                        } else if (gm0.w(8, i26)) {
                                            ns3Var3 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 5;
                                            if (ns3Var3.f(el8Var) != hu4Var) {
                                                int i313 = i6;
                                                i15 = i26;
                                                i16 = i313;
                                                i17 = i25;
                                                i18 = i5;
                                                int i314 = i15;
                                                i6 = i16;
                                                i26 = i314;
                                                i5 = i18;
                                                i25 = i17;
                                                if (!gm0.w(16, i26)) {
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i315 = i26;
                                                            i23 = i25;
                                                            i24 = i315;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                                ns3 ns3Var9 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 6;
                                                ns3Var9.e();
                                                if (sbiVar != hu4Var) {
                                                    int i316 = i6;
                                                    i19 = i26;
                                                    i20 = i316;
                                                    i21 = i25;
                                                    i22 = i5;
                                                    int i317 = i19;
                                                    i6 = i20;
                                                    i26 = i317;
                                                    i5 = i22;
                                                    i25 = i21;
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i318 = i26;
                                                            i23 = i25;
                                                            i24 = i318;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                            }
                                        } else {
                                            if (!gm0.w(16, i26)) {
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i319 = i26;
                                                        i23 = i25;
                                                        i24 = i319;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                            ns3 ns3Var10 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 6;
                                            ns3Var10.e();
                                            if (sbiVar != hu4Var) {
                                                int i3110 = i6;
                                                i19 = i26;
                                                i20 = i3110;
                                                i21 = i25;
                                                i22 = i5;
                                                int i3111 = i19;
                                                i6 = i20;
                                                i26 = i3111;
                                                i5 = i22;
                                                i25 = i21;
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3112 = i26;
                                                        i23 = i25;
                                                        i24 = i3112;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                        }
                                    }
                                } else if (gm0.w(4, i26)) {
                                    ns3Var2 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 4;
                                    if (ns3Var2.c(el8Var) != hu4Var) {
                                        int i320 = i6;
                                        i11 = i26;
                                        i12 = i320;
                                        i13 = i25;
                                        i14 = i5;
                                        int i321 = i11;
                                        i6 = i12;
                                        i26 = i321;
                                        i5 = i14;
                                        i25 = i13;
                                        if (gm0.w(8, i26)) {
                                            ns3Var3 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 5;
                                            if (ns3Var3.f(el8Var) != hu4Var) {
                                                int i3113 = i6;
                                                i15 = i26;
                                                i16 = i3113;
                                                i17 = i25;
                                                i18 = i5;
                                                int i3114 = i15;
                                                i6 = i16;
                                                i26 = i3114;
                                                i5 = i18;
                                                i25 = i17;
                                                if (!gm0.w(16, i26)) {
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i3115 = i26;
                                                            i23 = i25;
                                                            i24 = i3115;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                                ns3 ns3Var11 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 6;
                                                ns3Var11.e();
                                                if (sbiVar != hu4Var) {
                                                    int i3116 = i6;
                                                    i19 = i26;
                                                    i20 = i3116;
                                                    i21 = i25;
                                                    i22 = i5;
                                                    int i3117 = i19;
                                                    i6 = i20;
                                                    i26 = i3117;
                                                    i5 = i22;
                                                    i25 = i21;
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i3118 = i26;
                                                            i23 = i25;
                                                            i24 = i3118;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                            }
                                        } else {
                                            if (!gm0.w(16, i26)) {
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3119 = i26;
                                                        i23 = i25;
                                                        i24 = i3119;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                            ns3 ns3Var12 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 6;
                                            ns3Var12.e();
                                            if (sbiVar != hu4Var) {
                                                int i31110 = i6;
                                                i19 = i26;
                                                i20 = i31110;
                                                i21 = i25;
                                                i22 = i5;
                                                int i31111 = i19;
                                                i6 = i20;
                                                i26 = i31111;
                                                i5 = i22;
                                                i25 = i21;
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i31112 = i26;
                                                        i23 = i25;
                                                        i24 = i31112;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                        }
                                    }
                                } else if (gm0.w(8, i26)) {
                                    ns3Var3 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 5;
                                    if (ns3Var3.f(el8Var) != hu4Var) {
                                        int i31113 = i6;
                                        i15 = i26;
                                        i16 = i31113;
                                        i17 = i25;
                                        i18 = i5;
                                        int i31114 = i15;
                                        i6 = i16;
                                        i26 = i31114;
                                        i5 = i18;
                                        i25 = i17;
                                        if (!gm0.w(16, i26)) {
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i31115 = i26;
                                                    i23 = i25;
                                                    i24 = i31115;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                        ns3 ns3Var13 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 6;
                                        ns3Var13.e();
                                        if (sbiVar != hu4Var) {
                                            int i31116 = i6;
                                            i19 = i26;
                                            i20 = i31116;
                                            i21 = i25;
                                            i22 = i5;
                                            int i31117 = i19;
                                            i6 = i20;
                                            i26 = i31117;
                                            i5 = i22;
                                            i25 = i21;
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i31118 = i26;
                                                    i23 = i25;
                                                    i24 = i31118;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                    }
                                } else {
                                    if (!gm0.w(16, i26)) {
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i31119 = i26;
                                                i23 = i25;
                                                i24 = i31119;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                    ns3 ns3Var14 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 6;
                                    ns3Var14.e();
                                    if (sbiVar != hu4Var) {
                                        int i311110 = i6;
                                        i19 = i26;
                                        i20 = i311110;
                                        i21 = i25;
                                        i22 = i5;
                                        int i311111 = i19;
                                        i6 = i20;
                                        i26 = i311111;
                                        i5 = i22;
                                        i25 = i21;
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i311112 = i26;
                                                i23 = i25;
                                                i24 = i311112;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                }
                                return hu4Var;
                            } catch (Throwable th2) {
                                th = th2;
                                poeVar = new poe(th);
                                i3 = i25;
                                i4 = i26;
                                thA = roe.a(poeVar);
                                if (thA != null) {
                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                }
                                return sbiVar;
                            }
                        case 1:
                            int i40 = el8Var.e;
                            int i41 = el8Var.d;
                            ch3.d0(obj);
                            i26 = i40;
                            i25 = i41;
                            i3 = i25;
                            i4 = i26;
                            ((s7f) a()).z(0);
                            cl8Var = new cl8(i3, i4, null, 4, null);
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                break;
                            }
                            poeVar = sbiVar;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                            }
                            return sbiVar;
                        case 2:
                            int i42 = el8Var.g;
                            int i43 = el8Var.f;
                            int i44 = el8Var.e;
                            int i45 = el8Var.d;
                            ch3.d0(obj);
                            i6 = i43;
                            i26 = i44;
                            i5 = i42;
                            i25 = i45;
                            if (gm0.w(2, i26)) {
                                ns3Var = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 3;
                                if (ns3Var.d(el8Var) == hu4Var) {
                                    int i210 = i6;
                                    i7 = i26;
                                    i8 = i210;
                                    i9 = i25;
                                    i10 = i5;
                                    int i322 = i7;
                                    i6 = i8;
                                    i26 = i322;
                                    i5 = i10;
                                    i25 = i9;
                                    if (gm0.w(4, i26)) {
                                        ns3Var2 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 4;
                                        if (ns3Var2.c(el8Var) != hu4Var) {
                                            int i323 = i6;
                                            i11 = i26;
                                            i12 = i323;
                                            i13 = i25;
                                            i14 = i5;
                                            int i324 = i11;
                                            i6 = i12;
                                            i26 = i324;
                                            i5 = i14;
                                            i25 = i13;
                                            if (gm0.w(8, i26)) {
                                                ns3Var3 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 5;
                                                if (ns3Var3.f(el8Var) != hu4Var) {
                                                    int i311113 = i6;
                                                    i15 = i26;
                                                    i16 = i311113;
                                                    i17 = i25;
                                                    i18 = i5;
                                                    int i311114 = i15;
                                                    i6 = i16;
                                                    i26 = i311114;
                                                    i5 = i18;
                                                    i25 = i17;
                                                    if (!gm0.w(16, i26)) {
                                                        if (gm0.w(32, i26)) {
                                                            ns3Var4 = (ns3) this.c.getValue();
                                                            el8Var.d = i25;
                                                            el8Var.e = i26;
                                                            el8Var.f = i6;
                                                            el8Var.g = i5;
                                                            el8Var.j = 7;
                                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                                int i311115 = i26;
                                                                i23 = i25;
                                                                i24 = i311115;
                                                                i4 = i24;
                                                                i3 = i23;
                                                            }
                                                        } else {
                                                            i3 = i25;
                                                            i4 = i26;
                                                        }
                                                        ((s7f) a()).z(0);
                                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                            break;
                                                        }
                                                        poeVar = sbiVar;
                                                        thA = roe.a(poeVar);
                                                        if (thA != null) {
                                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                        }
                                                        return sbiVar;
                                                    }
                                                    ns3 ns3Var15 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 6;
                                                    ns3Var15.e();
                                                    if (sbiVar != hu4Var) {
                                                        int i311116 = i6;
                                                        i19 = i26;
                                                        i20 = i311116;
                                                        i21 = i25;
                                                        i22 = i5;
                                                        int i311117 = i19;
                                                        i6 = i20;
                                                        i26 = i311117;
                                                        i5 = i22;
                                                        i25 = i21;
                                                        if (gm0.w(32, i26)) {
                                                            ns3Var4 = (ns3) this.c.getValue();
                                                            el8Var.d = i25;
                                                            el8Var.e = i26;
                                                            el8Var.f = i6;
                                                            el8Var.g = i5;
                                                            el8Var.j = 7;
                                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                                int i311118 = i26;
                                                                i23 = i25;
                                                                i24 = i311118;
                                                                i4 = i24;
                                                                i3 = i23;
                                                            }
                                                        } else {
                                                            i3 = i25;
                                                            i4 = i26;
                                                        }
                                                        ((s7f) a()).z(0);
                                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                                        a4cVar = gm0.f;
                                                        if (a4cVar != null) {
                                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                            break;
                                                        }
                                                        poeVar = sbiVar;
                                                        thA = roe.a(poeVar);
                                                        if (thA != null) {
                                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                        }
                                                        return sbiVar;
                                                    }
                                                }
                                            } else {
                                                if (!gm0.w(16, i26)) {
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i311119 = i26;
                                                            i23 = i25;
                                                            i24 = i311119;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                                ns3 ns3Var16 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 6;
                                                ns3Var16.e();
                                                if (sbiVar != hu4Var) {
                                                    int i3111110 = i6;
                                                    i19 = i26;
                                                    i20 = i3111110;
                                                    i21 = i25;
                                                    i22 = i5;
                                                    int i3111111 = i19;
                                                    i6 = i20;
                                                    i26 = i3111111;
                                                    i5 = i22;
                                                    i25 = i21;
                                                    if (gm0.w(32, i26)) {
                                                        ns3Var4 = (ns3) this.c.getValue();
                                                        el8Var.d = i25;
                                                        el8Var.e = i26;
                                                        el8Var.f = i6;
                                                        el8Var.g = i5;
                                                        el8Var.j = 7;
                                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                                            int i3111112 = i26;
                                                            i23 = i25;
                                                            i24 = i3111112;
                                                            i4 = i24;
                                                            i3 = i23;
                                                        }
                                                    } else {
                                                        i3 = i25;
                                                        i4 = i26;
                                                    }
                                                    ((s7f) a()).z(0);
                                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                        break;
                                                    }
                                                    poeVar = sbiVar;
                                                    thA = roe.a(poeVar);
                                                    if (thA != null) {
                                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                    }
                                                    return sbiVar;
                                                }
                                            }
                                        }
                                    } else if (gm0.w(8, i26)) {
                                        ns3Var3 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 5;
                                        if (ns3Var3.f(el8Var) != hu4Var) {
                                            int i3111113 = i6;
                                            i15 = i26;
                                            i16 = i3111113;
                                            i17 = i25;
                                            i18 = i5;
                                            int i3111114 = i15;
                                            i6 = i16;
                                            i26 = i3111114;
                                            i5 = i18;
                                            i25 = i17;
                                            if (!gm0.w(16, i26)) {
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3111115 = i26;
                                                        i23 = i25;
                                                        i24 = i3111115;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                            ns3 ns3Var17 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 6;
                                            ns3Var17.e();
                                            if (sbiVar != hu4Var) {
                                                int i3111116 = i6;
                                                i19 = i26;
                                                i20 = i3111116;
                                                i21 = i25;
                                                i22 = i5;
                                                int i3111117 = i19;
                                                i6 = i20;
                                                i26 = i3111117;
                                                i5 = i22;
                                                i25 = i21;
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3111118 = i26;
                                                        i23 = i25;
                                                        i24 = i3111118;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                        }
                                    } else {
                                        if (!gm0.w(16, i26)) {
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i3111119 = i26;
                                                    i23 = i25;
                                                    i24 = i3111119;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                        ns3 ns3Var18 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 6;
                                        ns3Var18.e();
                                        if (sbiVar != hu4Var) {
                                            int i31111110 = i6;
                                            i19 = i26;
                                            i20 = i31111110;
                                            i21 = i25;
                                            i22 = i5;
                                            int i31111111 = i19;
                                            i6 = i20;
                                            i26 = i31111111;
                                            i5 = i22;
                                            i25 = i21;
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i31111112 = i26;
                                                    i23 = i25;
                                                    i24 = i31111112;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                    }
                                }
                            } else if (gm0.w(4, i26)) {
                                ns3Var2 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 4;
                                if (ns3Var2.c(el8Var) != hu4Var) {
                                    int i325 = i6;
                                    i11 = i26;
                                    i12 = i325;
                                    i13 = i25;
                                    i14 = i5;
                                    int i326 = i11;
                                    i6 = i12;
                                    i26 = i326;
                                    i5 = i14;
                                    i25 = i13;
                                    if (gm0.w(8, i26)) {
                                        ns3Var3 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 5;
                                        if (ns3Var3.f(el8Var) != hu4Var) {
                                            int i31111113 = i6;
                                            i15 = i26;
                                            i16 = i31111113;
                                            i17 = i25;
                                            i18 = i5;
                                            int i31111114 = i15;
                                            i6 = i16;
                                            i26 = i31111114;
                                            i5 = i18;
                                            i25 = i17;
                                            if (!gm0.w(16, i26)) {
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i31111115 = i26;
                                                        i23 = i25;
                                                        i24 = i31111115;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                            ns3 ns3Var19 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 6;
                                            ns3Var19.e();
                                            if (sbiVar != hu4Var) {
                                                int i31111116 = i6;
                                                i19 = i26;
                                                i20 = i31111116;
                                                i21 = i25;
                                                i22 = i5;
                                                int i31111117 = i19;
                                                i6 = i20;
                                                i26 = i31111117;
                                                i5 = i22;
                                                i25 = i21;
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i31111118 = i26;
                                                        i23 = i25;
                                                        i24 = i31111118;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                        }
                                    } else {
                                        if (!gm0.w(16, i26)) {
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i31111119 = i26;
                                                    i23 = i25;
                                                    i24 = i31111119;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                        ns3 ns3Var110 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 6;
                                        ns3Var110.e();
                                        if (sbiVar != hu4Var) {
                                            int i311111110 = i6;
                                            i19 = i26;
                                            i20 = i311111110;
                                            i21 = i25;
                                            i22 = i5;
                                            int i311111111 = i19;
                                            i6 = i20;
                                            i26 = i311111111;
                                            i5 = i22;
                                            i25 = i21;
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i311111112 = i26;
                                                    i23 = i25;
                                                    i24 = i311111112;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                    }
                                }
                            } else if (gm0.w(8, i26)) {
                                ns3Var3 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 5;
                                if (ns3Var3.f(el8Var) != hu4Var) {
                                    int i311111113 = i6;
                                    i15 = i26;
                                    i16 = i311111113;
                                    i17 = i25;
                                    i18 = i5;
                                    int i311111114 = i15;
                                    i6 = i16;
                                    i26 = i311111114;
                                    i5 = i18;
                                    i25 = i17;
                                    if (!gm0.w(16, i26)) {
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i311111115 = i26;
                                                i23 = i25;
                                                i24 = i311111115;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                    ns3 ns3Var111 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 6;
                                    ns3Var111.e();
                                    if (sbiVar != hu4Var) {
                                        int i311111116 = i6;
                                        i19 = i26;
                                        i20 = i311111116;
                                        i21 = i25;
                                        i22 = i5;
                                        int i311111117 = i19;
                                        i6 = i20;
                                        i26 = i311111117;
                                        i5 = i22;
                                        i25 = i21;
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i311111118 = i26;
                                                i23 = i25;
                                                i24 = i311111118;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                }
                            } else {
                                if (!gm0.w(16, i26)) {
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i311111119 = i26;
                                            i23 = i25;
                                            i24 = i311111119;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                                ns3 ns3Var112 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 6;
                                ns3Var112.e();
                                if (sbiVar != hu4Var) {
                                    int i3111111110 = i6;
                                    i19 = i26;
                                    i20 = i3111111110;
                                    i21 = i25;
                                    i22 = i5;
                                    int i3111111111 = i19;
                                    i6 = i20;
                                    i26 = i3111111111;
                                    i5 = i22;
                                    i25 = i21;
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i3111111112 = i26;
                                            i23 = i25;
                                            i24 = i3111111112;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                            }
                            return hu4Var;
                        case 3:
                            i10 = el8Var.g;
                            i8 = el8Var.f;
                            i7 = el8Var.e;
                            i9 = el8Var.d;
                            ch3.d0(obj);
                            int i327 = i7;
                            i6 = i8;
                            i26 = i327;
                            i5 = i10;
                            i25 = i9;
                            if (gm0.w(4, i26)) {
                                ns3Var2 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 4;
                                if (ns3Var2.c(el8Var) != hu4Var) {
                                    int i328 = i6;
                                    i11 = i26;
                                    i12 = i328;
                                    i13 = i25;
                                    i14 = i5;
                                    int i329 = i11;
                                    i6 = i12;
                                    i26 = i329;
                                    i5 = i14;
                                    i25 = i13;
                                    if (gm0.w(8, i26)) {
                                        ns3Var3 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 5;
                                        if (ns3Var3.f(el8Var) != hu4Var) {
                                            int i3111111113 = i6;
                                            i15 = i26;
                                            i16 = i3111111113;
                                            i17 = i25;
                                            i18 = i5;
                                            int i3111111114 = i15;
                                            i6 = i16;
                                            i26 = i3111111114;
                                            i5 = i18;
                                            i25 = i17;
                                            if (!gm0.w(16, i26)) {
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3111111115 = i26;
                                                        i23 = i25;
                                                        i24 = i3111111115;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                            ns3 ns3Var113 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 6;
                                            ns3Var113.e();
                                            if (sbiVar != hu4Var) {
                                                int i3111111116 = i6;
                                                i19 = i26;
                                                i20 = i3111111116;
                                                i21 = i25;
                                                i22 = i5;
                                                int i3111111117 = i19;
                                                i6 = i20;
                                                i26 = i3111111117;
                                                i5 = i22;
                                                i25 = i21;
                                                if (gm0.w(32, i26)) {
                                                    ns3Var4 = (ns3) this.c.getValue();
                                                    el8Var.d = i25;
                                                    el8Var.e = i26;
                                                    el8Var.f = i6;
                                                    el8Var.g = i5;
                                                    el8Var.j = 7;
                                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                                        int i3111111118 = i26;
                                                        i23 = i25;
                                                        i24 = i3111111118;
                                                        i4 = i24;
                                                        i3 = i23;
                                                    }
                                                } else {
                                                    i3 = i25;
                                                    i4 = i26;
                                                }
                                                ((s7f) a()).z(0);
                                                cl8Var = new cl8(i3, i4, null, 4, null);
                                                a4cVar = gm0.f;
                                                if (a4cVar != null) {
                                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                    break;
                                                }
                                                poeVar = sbiVar;
                                                thA = roe.a(poeVar);
                                                if (thA != null) {
                                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                                }
                                                return sbiVar;
                                            }
                                        }
                                    } else {
                                        if (!gm0.w(16, i26)) {
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i3111111119 = i26;
                                                    i23 = i25;
                                                    i24 = i3111111119;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                        ns3 ns3Var114 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 6;
                                        ns3Var114.e();
                                        if (sbiVar != hu4Var) {
                                            int i31111111110 = i6;
                                            i19 = i26;
                                            i20 = i31111111110;
                                            i21 = i25;
                                            i22 = i5;
                                            int i31111111111 = i19;
                                            i6 = i20;
                                            i26 = i31111111111;
                                            i5 = i22;
                                            i25 = i21;
                                            if (gm0.w(32, i26)) {
                                                ns3Var4 = (ns3) this.c.getValue();
                                                el8Var.d = i25;
                                                el8Var.e = i26;
                                                el8Var.f = i6;
                                                el8Var.g = i5;
                                                el8Var.j = 7;
                                                if (ns3Var4.g(el8Var) != hu4Var) {
                                                    int i31111111112 = i26;
                                                    i23 = i25;
                                                    i24 = i31111111112;
                                                    i4 = i24;
                                                    i3 = i23;
                                                }
                                            } else {
                                                i3 = i25;
                                                i4 = i26;
                                            }
                                            ((s7f) a()).z(0);
                                            cl8Var = new cl8(i3, i4, null, 4, null);
                                            a4cVar = gm0.f;
                                            if (a4cVar != null) {
                                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                                break;
                                            }
                                            poeVar = sbiVar;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                            }
                                            return sbiVar;
                                        }
                                    }
                                }
                            } else if (gm0.w(8, i26)) {
                                ns3Var3 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 5;
                                if (ns3Var3.f(el8Var) != hu4Var) {
                                    int i31111111113 = i6;
                                    i15 = i26;
                                    i16 = i31111111113;
                                    i17 = i25;
                                    i18 = i5;
                                    int i31111111114 = i15;
                                    i6 = i16;
                                    i26 = i31111111114;
                                    i5 = i18;
                                    i25 = i17;
                                    if (!gm0.w(16, i26)) {
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i31111111115 = i26;
                                                i23 = i25;
                                                i24 = i31111111115;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                    ns3 ns3Var115 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 6;
                                    ns3Var115.e();
                                    if (sbiVar != hu4Var) {
                                        int i31111111116 = i6;
                                        i19 = i26;
                                        i20 = i31111111116;
                                        i21 = i25;
                                        i22 = i5;
                                        int i31111111117 = i19;
                                        i6 = i20;
                                        i26 = i31111111117;
                                        i5 = i22;
                                        i25 = i21;
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i31111111118 = i26;
                                                i23 = i25;
                                                i24 = i31111111118;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                }
                            } else {
                                if (!gm0.w(16, i26)) {
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i31111111119 = i26;
                                            i23 = i25;
                                            i24 = i31111111119;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                                ns3 ns3Var116 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 6;
                                ns3Var116.e();
                                if (sbiVar != hu4Var) {
                                    int i311111111110 = i6;
                                    i19 = i26;
                                    i20 = i311111111110;
                                    i21 = i25;
                                    i22 = i5;
                                    int i311111111111 = i19;
                                    i6 = i20;
                                    i26 = i311111111111;
                                    i5 = i22;
                                    i25 = i21;
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i311111111112 = i26;
                                            i23 = i25;
                                            i24 = i311111111112;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                            }
                            return hu4Var;
                        case 4:
                            i14 = el8Var.g;
                            i12 = el8Var.f;
                            i11 = el8Var.e;
                            i13 = el8Var.d;
                            ch3.d0(obj);
                            int i3210 = i11;
                            i6 = i12;
                            i26 = i3210;
                            i5 = i14;
                            i25 = i13;
                            if (gm0.w(8, i26)) {
                                ns3Var3 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 5;
                                if (ns3Var3.f(el8Var) != hu4Var) {
                                    int i311111111113 = i6;
                                    i15 = i26;
                                    i16 = i311111111113;
                                    i17 = i25;
                                    i18 = i5;
                                    int i311111111114 = i15;
                                    i6 = i16;
                                    i26 = i311111111114;
                                    i5 = i18;
                                    i25 = i17;
                                    if (!gm0.w(16, i26)) {
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i311111111115 = i26;
                                                i23 = i25;
                                                i24 = i311111111115;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                    ns3 ns3Var117 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 6;
                                    ns3Var117.e();
                                    if (sbiVar != hu4Var) {
                                        int i311111111116 = i6;
                                        i19 = i26;
                                        i20 = i311111111116;
                                        i21 = i25;
                                        i22 = i5;
                                        int i311111111117 = i19;
                                        i6 = i20;
                                        i26 = i311111111117;
                                        i5 = i22;
                                        i25 = i21;
                                        if (gm0.w(32, i26)) {
                                            ns3Var4 = (ns3) this.c.getValue();
                                            el8Var.d = i25;
                                            el8Var.e = i26;
                                            el8Var.f = i6;
                                            el8Var.g = i5;
                                            el8Var.j = 7;
                                            if (ns3Var4.g(el8Var) != hu4Var) {
                                                int i311111111118 = i26;
                                                i23 = i25;
                                                i24 = i311111111118;
                                                i4 = i24;
                                                i3 = i23;
                                            }
                                        } else {
                                            i3 = i25;
                                            i4 = i26;
                                        }
                                        ((s7f) a()).z(0);
                                        cl8Var = new cl8(i3, i4, null, 4, null);
                                        a4cVar = gm0.f;
                                        if (a4cVar != null) {
                                            a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                            break;
                                        }
                                        poeVar = sbiVar;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                        }
                                        return sbiVar;
                                    }
                                }
                            } else {
                                if (!gm0.w(16, i26)) {
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i311111111119 = i26;
                                            i23 = i25;
                                            i24 = i311111111119;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                                ns3 ns3Var118 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 6;
                                ns3Var118.e();
                                if (sbiVar != hu4Var) {
                                    int i3111111111110 = i6;
                                    i19 = i26;
                                    i20 = i3111111111110;
                                    i21 = i25;
                                    i22 = i5;
                                    int i3111111111111 = i19;
                                    i6 = i20;
                                    i26 = i3111111111111;
                                    i5 = i22;
                                    i25 = i21;
                                    if (gm0.w(32, i26)) {
                                        ns3Var4 = (ns3) this.c.getValue();
                                        el8Var.d = i25;
                                        el8Var.e = i26;
                                        el8Var.f = i6;
                                        el8Var.g = i5;
                                        el8Var.j = 7;
                                        if (ns3Var4.g(el8Var) != hu4Var) {
                                            int i3111111111112 = i26;
                                            i23 = i25;
                                            i24 = i3111111111112;
                                            i4 = i24;
                                            i3 = i23;
                                        }
                                    } else {
                                        i3 = i25;
                                        i4 = i26;
                                    }
                                    ((s7f) a()).z(0);
                                    cl8Var = new cl8(i3, i4, null, 4, null);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null) {
                                        a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                        break;
                                    }
                                    poeVar = sbiVar;
                                    thA = roe.a(poeVar);
                                    if (thA != null) {
                                        gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                    }
                                    return sbiVar;
                                }
                            }
                            return hu4Var;
                        case 5:
                            i18 = el8Var.g;
                            i16 = el8Var.f;
                            i15 = el8Var.e;
                            i17 = el8Var.d;
                            ch3.d0(obj);
                            int i3111111111113 = i15;
                            i6 = i16;
                            i26 = i3111111111113;
                            i5 = i18;
                            i25 = i17;
                            if (!gm0.w(16, i26)) {
                                if (gm0.w(32, i26)) {
                                    ns3Var4 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 7;
                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                        int i3111111111114 = i26;
                                        i23 = i25;
                                        i24 = i3111111111114;
                                        i4 = i24;
                                        i3 = i23;
                                    }
                                } else {
                                    i3 = i25;
                                    i4 = i26;
                                }
                                ((s7f) a()).z(0);
                                cl8Var = new cl8(i3, i4, null, 4, null);
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                    break;
                                }
                                poeVar = sbiVar;
                                thA = roe.a(poeVar);
                                if (thA != null) {
                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                }
                                return sbiVar;
                            }
                            ns3 ns3Var119 = (ns3) this.c.getValue();
                            el8Var.d = i25;
                            el8Var.e = i26;
                            el8Var.f = i6;
                            el8Var.g = i5;
                            el8Var.j = 6;
                            ns3Var119.e();
                            if (sbiVar != hu4Var) {
                                int i3111111111115 = i6;
                                i19 = i26;
                                i20 = i3111111111115;
                                i21 = i25;
                                i22 = i5;
                                int i3111111111116 = i19;
                                i6 = i20;
                                i26 = i3111111111116;
                                i5 = i22;
                                i25 = i21;
                                if (gm0.w(32, i26)) {
                                    ns3Var4 = (ns3) this.c.getValue();
                                    el8Var.d = i25;
                                    el8Var.e = i26;
                                    el8Var.f = i6;
                                    el8Var.g = i5;
                                    el8Var.j = 7;
                                    if (ns3Var4.g(el8Var) != hu4Var) {
                                        int i3111111111117 = i26;
                                        i23 = i25;
                                        i24 = i3111111111117;
                                        i4 = i24;
                                        i3 = i23;
                                    }
                                } else {
                                    i3 = i25;
                                    i4 = i26;
                                }
                                ((s7f) a()).z(0);
                                cl8Var = new cl8(i3, i4, null, 4, null);
                                a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                    break;
                                }
                                poeVar = sbiVar;
                                thA = roe.a(poeVar);
                                if (thA != null) {
                                    gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                                }
                                return sbiVar;
                            }
                            return hu4Var;
                        case 6:
                            i22 = el8Var.g;
                            i20 = el8Var.f;
                            i19 = el8Var.e;
                            i21 = el8Var.d;
                            ch3.d0(obj);
                            int i3111111111118 = i19;
                            i6 = i20;
                            i26 = i3111111111118;
                            i5 = i22;
                            i25 = i21;
                            if (gm0.w(32, i26)) {
                                ns3Var4 = (ns3) this.c.getValue();
                                el8Var.d = i25;
                                el8Var.e = i26;
                                el8Var.f = i6;
                                el8Var.g = i5;
                                el8Var.j = 7;
                                if (ns3Var4.g(el8Var) != hu4Var) {
                                    int i3111111111119 = i26;
                                    i23 = i25;
                                    i24 = i3111111111119;
                                    i4 = i24;
                                    i3 = i23;
                                }
                                return hu4Var;
                            }
                            i3 = i25;
                            i4 = i26;
                            ((s7f) a()).z(0);
                            cl8Var = new cl8(i3, i4, null, 4, null);
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                break;
                            }
                            poeVar = sbiVar;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                            }
                            return sbiVar;
                        case 7:
                            i24 = el8Var.e;
                            i23 = el8Var.d;
                            ch3.d0(obj);
                            i4 = i24;
                            i3 = i23;
                            ((s7f) a()).z(0);
                            cl8Var = new cl8(i3, i4, null, 4, null);
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), cl8Var);
                                break;
                            }
                            poeVar = sbiVar;
                            thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V("InvalidateDbTask", "FAIL invalidate DB", new cl8(i3, i4, thA));
                            }
                            return sbiVar;
                        default:
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th3) {
                th = th3;
                i26 = i28;
                i25 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            i26 = i25;
            i25 = i26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(nq4 nq4Var) {
        fl8 fl8Var;
        Object poeVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.f;
        if (nq4Var instanceof fl8) {
            fl8Var = (fl8) nq4Var;
            int i = fl8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl8Var.f = i - Integer.MIN_VALUE;
            } else {
                fl8Var = new fl8(this, nq4Var);
            }
        } else {
            fl8Var = new fl8(this, nq4Var);
        }
        Object obj = fl8Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = fl8Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "InvalidateDbTask", "WARNING! Invalidate db start, internal logic.", null);
                }
                ns3 ns3Var = (ns3) this.c.getValue();
                fl8Var.f = 1;
                if (ns3Var.b(fl8Var) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            dl8 dl8Var = new dl8(false, 0, 0, null, 8, null);
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "InvalidateDbTask", "Invalidate db with success. chatsLastSync=" + ((s7f) a()).x() + ", foldersSync=" + ((xb9) a()).R(), dl8Var);
            }
            poeVar = sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("InvalidateDbTask", "FAIL invalidate DB", new dl8(false, 0, 0, thA));
        }
        return sbiVar;
    }
}
