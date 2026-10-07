package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vmb implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vmb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private final Object b(lq4 lq4Var, Object obj) {
        dug dugVar;
        ftg ftgVar = ((iug) this.c).l;
        if (lq4Var instanceof dug) {
            dugVar = (dug) lq4Var;
            int i = dugVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dugVar.e = i - Integer.MIN_VALUE;
            } else {
                dugVar = new dug(this, lq4Var);
            }
        } else {
            dugVar = new dug(this, lq4Var);
        }
        Object obj2 = dugVar.d;
        int i2 = dugVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            if (((List) ftgVar.d.a.getValue()).size() <= 1 || ftgVar.e.getValue() == bsg.e) {
                dugVar.e = 1;
                Object objEmit = yx6Var.emit(obj, dugVar);
                hu4 hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private final Object d(lq4 lq4Var, Object obj) {
        ivg ivgVar;
        Object objSingletonList;
        ArrayList arrayList;
        jvg jvgVar = (jvg) this.c;
        r8e r8eVar = jvgVar.u;
        tug tugVar = jvgVar.f;
        if (lq4Var instanceof ivg) {
            ivgVar = (ivg) lq4Var;
            int i = ivgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivgVar.e = i - Integer.MIN_VALUE;
            } else {
                ivgVar = new ivg(this, lq4Var);
            }
        } else {
            ivgVar = new ivg(this, lq4Var);
        }
        Object obj2 = ivgVar.d;
        int i2 = ivgVar.e;
        if (i2 == 0) {
            ch3.d0(obj2);
            yx6 yx6Var = (yx6) this.b;
            Map map = (Map) obj;
            if (tugVar instanceof pug) {
                arrayList = new ArrayList(map.size());
                long j = ((pug) tugVar).a;
                Iterator it = map.entrySet().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    ozg ozgVar = (ozg) ((Map.Entry) it.next()).getValue();
                    azg azgVar = ozgVar.b;
                    if (azgVar.a() == j) {
                        z = true;
                    }
                    if (ozgVar.h) {
                        arrayList.add(new pkc(azgVar.a(), btl.b(azgVar), (Long) r8eVar.a.getValue()));
                    }
                }
                objSingletonList = arrayList;
                if (j != -1 && (!z || arrayList.isEmpty())) {
                    objSingletonList = arrayList;
                    arrayList.add(0, jvg.B(jvgVar));
                    objSingletonList = arrayList;
                }
            } else if (tugVar instanceof qug) {
                ozg ozgVar2 = (ozg) map.get(new Long(((qug) tugVar).x()));
                if (ozgVar2 != null) {
                    azg azgVar2 = ozgVar2.b;
                    objSingletonList = Collections.singletonList(new pkc(azgVar2.a(), btl.b(azgVar2), (Long) r8eVar.a.getValue()));
                } else {
                    objSingletonList = Collections.singletonList(jvg.B(jvgVar));
                }
            } else {
                if (!(tugVar instanceof rug)) {
                    ore.o();
                    return null;
                }
                objSingletonList = Collections.singletonList(jvg.B(jvgVar));
            }
            objSingletonList = arrayList;
            ivgVar.e = 1;
            Object objEmit = yx6Var.emit(objSingletonList, ivgVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj2);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r8.emit(r7, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(defpackage.lq4 r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.a0j
            if (r0 == 0) goto L13
            r0 = r7
            a0j r0 = (defpackage.a0j) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            a0j r0 = new a0j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r7)
            goto L64
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L31:
            int r6 = r0.h
            yx6 r8 = r0.g
            defpackage.ch3.d0(r7)
            goto L57
        L39:
            defpackage.ch3.d0(r7)
            java.lang.Object r7 = r6.b
            yx6 r7 = (defpackage.yx6) r7
            l1j r8 = (defpackage.l1j) r8
            java.lang.Object r6 = r6.c
            hbc r6 = (defpackage.hbc) r6
            r0.g = r7
            r1 = 0
            r0.h = r1
            r0.e = r3
            java.lang.Object r6 = defpackage.hbc.d(r6, r8, r0)
            if (r6 != r5) goto L54
            goto L63
        L54:
            r8 = r7
            r7 = r6
            r6 = r1
        L57:
            r0.g = r4
            r0.h = r6
            r0.e = r2
            java.lang.Object r6 = r8.emit(r7, r0)
            if (r6 != r5) goto L64
        L63:
            return r5
        L64:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmb.e(lq4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x021c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0224  */
    /* JADX WARN: Code duplicated, block: B:131:0x023a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0295  */
    /* JADX WARN: Code duplicated, block: B:204:0x0413  */
    /* JADX WARN: Code duplicated, block: B:206:0x041b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0431  */
    /* JADX WARN: Code duplicated, block: B:230:0x0479  */
    /* JADX WARN: Code duplicated, block: B:246:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:269:0x052c  */
    /* JADX WARN: Code duplicated, block: B:285:0x0586  */
    /* JADX WARN: Code duplicated, block: B:303:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:319:0x061f  */
    /* JADX WARN: Code duplicated, block: B:335:0x066c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0707  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:379:0x0760  */
    /* JADX WARN: Code duplicated, block: B:402:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:420:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:447:0x0896  */
    /* JADX WARN: Code duplicated, block: B:470:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:513:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:538:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0510, code lost:
    
        if (r0.emit(r2, r3) == r7) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x087c, code lost:
    
        if (r0.emit(r2, r3) == r7) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x08e0, code lost:
    
        if (r0.emit(r3, r9) == r7) goto L463;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v4, types: [int] */
    @Override // defpackage.yx6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r33, defpackage.lq4 r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmb.emit(java.lang.Object, lq4):java.lang.Object");
    }
}
