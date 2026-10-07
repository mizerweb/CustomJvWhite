package defpackage;

import com.vk.push.core.filedatastore.FileDataStore;

/* JADX INFO: loaded from: classes3.dex */
public final class g7k {
    public final FileDataStore a;
    public final FileDataStore b;

    public g7k(FileDataStore fileDataStore, FileDataStore fileDataStore2) {
        this.a = fileDataStore;
        this.b = fileDataStore2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(nq4 nq4Var) {
        y6k y6kVar;
        if (nq4Var instanceof y6k) {
            y6kVar = (y6k) nq4Var;
            int i = y6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6kVar.f = i - Integer.MIN_VALUE;
            } else {
                y6kVar = new y6k(this, nq4Var);
            }
        } else {
            y6kVar = new y6k(this, nq4Var);
        }
        Object obj = y6kVar.d;
        int i2 = y6kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            y6kVar.f = 1;
            obj = this.a.read(y6kVar);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        i6k i6kVar = (i6k) obj;
        if (i6kVar != null) {
            return i6kVar.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(nq4 nq4Var) {
        b7k b7kVar;
        String str;
        if (nq4Var instanceof b7k) {
            b7kVar = (b7k) nq4Var;
            int i = b7kVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b7kVar.g = i - Integer.MIN_VALUE;
            } else {
                b7kVar = new b7k(this, nq4Var);
            }
        } else {
            b7kVar = new b7k(this, nq4Var);
        }
        Object obj = b7kVar.e;
        int i2 = b7kVar.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            b7kVar.d = this;
            b7kVar.g = 1;
            obj = this.b.read(b7kVar);
            if (obj != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = b7kVar.d;
        ch3.d0(obj);
        q6k q6kVar = (q6k) obj;
        if (q6kVar != null && (str = q6kVar.a) != null) {
            FileDataStore fileDataStore = this.b;
            q6k q6kVar2 = new q6k(str, true);
            b7kVar.d = null;
            b7kVar.g = 2;
            if (fileDataStore.write(q6kVar2, b7kVar) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r6.write(r1, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.nq4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.a7k
            if (r0 == 0) goto L13
            r0 = r8
            a7k r0 = (defpackage.a7k) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a7k r0 = new a7k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r8)
            goto L67
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L31:
            java.lang.String r7 = r0.e
            g7k r6 = r0.d
            defpackage.ch3.d0(r8)
            goto L4b
        L39:
            defpackage.ch3.d0(r8)
            r0.d = r6
            r0.e = r7
            r0.h = r4
            com.vk.push.core.filedatastore.FileDataStore r8 = r6.b
            java.lang.Object r8 = r8.read(r0)
            if (r8 != r5) goto L4b
            goto L66
        L4b:
            q6k r8 = (defpackage.q6k) r8
            if (r8 == 0) goto L52
            boolean r8 = r8.b
            goto L53
        L52:
            r8 = 0
        L53:
            com.vk.push.core.filedatastore.FileDataStore r6 = r6.b
            q6k r1 = new q6k
            r1.<init>(r7, r8)
            r0.d = r2
            r0.e = r2
            r0.h = r3
            java.lang.Object r6 = r6.write(r1, r0)
            if (r6 != r5) goto L67
        L66:
            return r5
        L67:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7k.c(java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) {
        u6k u6kVar;
        if (nq4Var instanceof u6k) {
            u6kVar = (u6k) nq4Var;
            int i = u6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6kVar.f = i - Integer.MIN_VALUE;
            } else {
                u6kVar = new u6k(this, nq4Var);
            }
        } else {
            u6kVar = new u6k(this, nq4Var);
        }
        Object obj = u6kVar.d;
        int i2 = u6kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            u6kVar.f = 1;
            obj = this.b.read(u6kVar);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        q6k q6kVar = (q6k) obj;
        if (q6kVar != null) {
            return q6kVar.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.clear(r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.nq4 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.s6k
            if (r0 == 0) goto L13
            r0 = r7
            s6k r0 = (defpackage.s6k) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            s6k r0 = new s6k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r7)
            goto L54
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L31:
            g7k r6 = r0.d
            defpackage.ch3.d0(r7)
            goto L47
        L37:
            defpackage.ch3.d0(r7)
            r0.d = r6
            r0.g = r4
            com.vk.push.core.filedatastore.FileDataStore r7 = r6.a
            java.lang.Object r7 = r7.clear(r0)
            if (r7 != r5) goto L47
            goto L53
        L47:
            com.vk.push.core.filedatastore.FileDataStore r6 = r6.b
            r0.d = r2
            r0.g = r3
            java.lang.Object r6 = r6.clear(r0)
            if (r6 != r5) goto L54
        L53:
            return r5
        L54:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7k.e(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        w6k w6kVar;
        if (nq4Var instanceof w6k) {
            w6kVar = (w6k) nq4Var;
            int i = w6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6kVar.f = i - Integer.MIN_VALUE;
            } else {
                w6kVar = new w6k(this, nq4Var);
            }
        } else {
            w6kVar = new w6k(this, nq4Var);
        }
        Object obj = w6kVar.d;
        int i2 = w6kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            w6kVar.f = 1;
            obj = this.a.read(w6kVar);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        i6k i6kVar = (i6k) obj;
        String str = i6kVar != null ? i6kVar.a : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(nq4 nq4Var) {
        z6k z6kVar;
        if (nq4Var instanceof z6k) {
            z6kVar = (z6k) nq4Var;
            int i = z6kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6kVar.f = i - Integer.MIN_VALUE;
            } else {
                z6kVar = new z6k(this, nq4Var);
            }
        } else {
            z6kVar = new z6k(this, nq4Var);
        }
        Object obj = z6kVar.d;
        int i2 = z6kVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            z6kVar.f = 1;
            obj = this.b.read(z6kVar);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        q6k q6kVar = (q6k) obj;
        return Boolean.valueOf(q6kVar != null && q6kVar.b);
    }
}
