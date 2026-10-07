package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class txd {
    public final ipe a;
    public final gc2 b;
    public final ic2 c;
    public final gu4 d;
    public final js8 e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public txd(ipe ipeVar, gc2 gc2Var, ic2 ic2Var, zqh zqhVar) {
        this.a = ipeVar;
        this.b = gc2Var;
        this.c = ic2Var;
        gu4 gu4Var = zqhVar.a;
        this.d = gu4Var;
        fz7 fz7Var = new fz7(1, this, txd.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, 20);
        l0d l0dVar = new l0d(this, (lq4) null, 24);
        skd skdVar = new skd(10);
        js8 js8Var = new js8();
        js8Var.a = fz7Var;
        js8Var.b = skdVar;
        js8Var.c = l0dVar;
        js8Var.d = gvk.a(false);
        js8Var.f = yab.b(Integer.MAX_VALUE, 0, new p7d(14, js8Var), 2);
        js8Var.e = new zv();
        if (!((b40) js8Var.d).a()) {
            ore.k("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (yab.i0(gu4Var, null, 0, new ur8(js8Var, null, 23), 3).isCancelled()) {
            js8.h(js8Var, null);
        }
        this.e = js8Var;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
    }

    public final void a(String str) {
        lle lleVar = new lle(str);
        if (((p41) this.e.f).c(lleVar) instanceof cs2) {
            Log.e("CXCP", "Camera close by ID request failed for " + ((Object) ef2.b(str)) + '!');
            lleVar.b.Q(sbi.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e0 -> B:44:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x009e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.Set r11, defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.b(java.util.Set, nq4):java.lang.Object");
    }

    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ixd ixdVar = (ixd) it.next();
            ixdVar.c.b();
            this.g.remove(ixdVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, List list, gb2 gb2Var, gu4 gu4Var, nq4 nq4Var) {
        nxd nxdVar;
        if (nq4Var instanceof nxd) {
            nxdVar = (nxd) nq4Var;
            int i = nxdVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxdVar.i = i - Integer.MIN_VALUE;
            } else {
                nxdVar = new nxd(this, nq4Var);
            }
        } else {
            nxdVar = new nxd(this, nq4Var);
        }
        Object objB = nxdVar.g;
        int i2 = nxdVar.i;
        if (i2 == 0) {
            ch3.d0(objB);
            Log.d("CXCP", "Opening " + ((Object) ef2.b(str)) + " with retries...");
            nxdVar.d = str;
            nxdVar.e = list;
            nxdVar.f = gu4Var;
            nxdVar.i = 1;
            objB = this.a.b(str, this.b, gb2Var, nxdVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gu4Var = nxdVar.f;
            list = nxdVar.e;
            str = nxdVar.d;
            ch3.d0(objB);
        }
        nfc nfcVar = (nfc) objB;
        lg lgVar = nfcVar.a;
        if (lgVar == null) {
            return new fxd(nfcVar.b);
        }
        return new gxd(new d9(lgVar, ww3.X1(ww3.H1(new ef2(str), list)), gu4Var, new p7d(13, this)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(jle jleVar, nq4 nq4Var) {
        oxd oxdVar;
        if (nq4Var instanceof oxd) {
            oxdVar = (oxd) nq4Var;
            int i = oxdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxdVar.g = i - Integer.MIN_VALUE;
            } else {
                oxdVar = new oxd(this, nq4Var);
            }
        } else {
            oxdVar = new oxd(this, nq4Var);
        }
        Object obj = oxdVar.e;
        int i2 = oxdVar.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            d9 d9Var = jleVar.a;
            Log.i("CXCP", "PruningCamera2DeviceManager#processRequestClose(" + ((Object) ef2.b(d9Var.a.a)) + ')');
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet.contains(d9Var)) {
                linkedHashSet.remove(d9Var);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.g) {
                if (((ixd) obj2).b == d9Var) {
                    arrayList.add(obj2);
                }
            }
            oxdVar.d = jleVar;
            oxdVar.g = 1;
            c(arrayList);
            if (sbiVar != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jleVar = oxdVar.d;
        ch3.d0(obj);
        jleVar.a.c();
        d9 d9Var2 = jleVar.a;
        oxdVar.d = null;
        oxdVar.g = 2;
        return d9Var2.b(oxdVar) == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x006d->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.kle r8, defpackage.nq4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pxd
            if (r0 == 0) goto L13
            r0 = r9
            pxd r0 = (defpackage.pxd) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            pxd r0 = new pxd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            sbi r2 = defpackage.sbi.a
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r7.f
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L32
            java.util.Iterator r7 = r0.e
            kle r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L6d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r7 = 0
            return r7
        L39:
            kle r8 = r0.d
            defpackage.ch3.d0(r9)
            goto L55
        L3f:
            defpackage.ch3.d0(r9)
            java.lang.String r9 = "CXCP"
            java.lang.String r1 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r9, r1)
            r0.d = r8
            r0.h = r4
            java.util.ArrayList r9 = r7.g
            r7.c(r9)
            if (r2 != r6) goto L55
            goto L85
        L55:
            java.util.Iterator r7 = r5.iterator()
        L59:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L69
            java.lang.Object r9 = r7.next()
            d9 r9 = (defpackage.d9) r9
            r9.c()
            goto L59
        L69:
            java.util.Iterator r7 = r5.iterator()
        L6d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r7.next()
            d9 r9 = (defpackage.d9) r9
            r0.d = r8
            r0.e = r7
            r0.h = r3
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r6) goto L6d
        L85:
            return r6
        L86:
            r5.clear()
            i64 r7 = r8.a
            r7.Q(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.f(kle, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(lle lleVar, nq4 nq4Var) {
        qxd qxdVar;
        lle lleVar2;
        String str;
        Object next;
        lle lleVar3;
        if (nq4Var instanceof qxd) {
            qxdVar = (qxd) nq4Var;
            int i = qxdVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qxdVar.h = i - Integer.MIN_VALUE;
            } else {
                qxdVar = new qxd(this, nq4Var);
            }
        } else {
            qxdVar = new qxd(this, nq4Var);
        }
        Object obj = qxdVar.f;
        int i2 = qxdVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = qxdVar.e;
                lleVar2 = qxdVar.d;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lleVar3 = qxdVar.d;
                ch3.d0(obj);
            }
            lleVar2 = lleVar3;
            lleVar2.b.Q(sbiVar);
            return sbiVar;
        }
        ch3.d0(obj);
        String str2 = lleVar.a;
        Log.i("CXCP", "PruningCamera2DeviceManager#processRequestCloseById(" + ((Object) ef2.b(lleVar.a)) + ')');
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.g) {
            if (cqk.d(((ixd) obj2).a.a.a, str2)) {
                arrayList.add(obj2);
            }
        }
        qxdVar.d = lleVar;
        qxdVar.e = str2;
        qxdVar.h = 1;
        c(arrayList);
        if (sbiVar != hu4Var) {
            lleVar2 = lleVar;
            str = str2;
        }
        return hu4Var;
        LinkedHashSet linkedHashSet = this.f;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!cqk.d(((d9) next).a.a, str));
        d9 d9Var = (d9) next;
        if (d9Var != null) {
            linkedHashSet.remove(d9Var);
            d9Var.c();
            qxdVar.d = lleVar2;
            qxdVar.e = null;
            qxdVar.h = 2;
            if (d9Var.b(qxdVar) != hu4Var) {
                lleVar3 = lleVar2;
                lleVar2 = lleVar3;
            }
            return hu4Var;
        }
        lleVar2.b.Q(sbiVar);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:107:0x0279  */
    /* JADX WARN: Code duplicated, block: B:112:0x028d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:50:0x0148->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x013a A[LOOP:3: B:46:0x0134->B:48:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0196  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0226  */
    /* JADX WARN: Code duplicated, block: B:93:0x0230  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0273, code lost:
    
        if (b(r10, r0) == r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0287, code lost:
    
        if (defpackage.sbi.a == r1) goto L109;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x019c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c4, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.lme r10, defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.h(lme, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x004f->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.lang.String r13, defpackage.lme r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txd.i(java.lang.String, lme, nq4):java.lang.Object");
    }
}
