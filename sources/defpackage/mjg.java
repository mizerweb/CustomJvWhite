package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class mjg extends a4 implements f9b, fk2, ig7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(mjg.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long g = bl0.a.objectFieldOffset(mjg.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public mjg(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.d9b
    public final boolean a(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // defpackage.ig7
    public final xx6 b(vt4 vt4Var, int i, int i2) {
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? e9i.Y(this, vt4Var, i, i2) : this;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x0095, B:37:0x009d, B:40:0x00a4, B:41:0x00a8, B:43:0x00ab, B:54:0x00d0, B:57:0x00dd, B:58:0x00f9, B:64:0x0109, B:61:0x0100, B:63:0x0106, B:45:0x00b1, B:49:0x00b8, B:24:0x005f, B:34:0x0087, B:29:0x0070, B:31:0x0074), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[LOOP:0: B:58:0x00f9->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0041: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:17:0x0041 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [a4, mjg] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a4] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [mjg] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [ojg] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [b4] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ojg] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ojg] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00dc -> B:35:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.xx6
    public final java.lang.Object collect(defpackage.yx6 r17, defpackage.lq4 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjg.collect(yx6, lq4):java.lang.Object");
    }

    @Override // defpackage.lzf
    public final List d() {
        return Collections.singletonList(getValue());
    }

    @Override // defpackage.d9b, defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        setValue(obj);
        return sbi.a;
    }

    @Override // defpackage.a4
    public final b4 f() {
        return new ojg();
    }

    @Override // defpackage.a4
    public final b4[] g() {
        return new ojg[2];
    }

    @Override // defpackage.f9b, defpackage.gjg
    public final Object getValue() {
        c5b c5bVar = vd7.e;
        f.getClass();
        Object objectVolatile = bl0.a.getObjectVolatile(this, g);
        if (objectVolatile == c5bVar) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.f9b
    public final boolean h(Object obj, Object obj2) {
        c5b c5bVar = vd7.e;
        if (obj == null) {
            obj = c5bVar;
        }
        if (obj2 == null) {
            obj2 = c5bVar;
        }
        return j(obj, obj2);
    }

    public final boolean j(Object obj, Object obj2) {
        int i;
        b4[] b4VarArr;
        c5b c5bVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !cqk.d(obj3, obj)) {
                return false;
            }
            if (cqk.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            b4[] b4VarArr2 = this.a;
            while (true) {
                ojg[] ojgVarArr = (ojg[]) b4VarArr2;
                if (ojgVarArr != null) {
                    for (ojg ojgVar : ojgVarArr) {
                        if (ojgVar != null) {
                            AtomicReference atomicReference = ojgVar.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c5bVar = p90.g)) {
                                    break;
                                }
                                c5b c5bVar2 = p90.f;
                                if (obj4 != c5bVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c5bVar2)) {
                                            ((ek2) obj4).resumeWith(sbi.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c5bVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    b4VarArr = this.a;
                }
                b4VarArr2 = b4VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.d9b
    public final void k() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.f9b
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = vd7.e;
        }
        j(null, obj);
    }
}
