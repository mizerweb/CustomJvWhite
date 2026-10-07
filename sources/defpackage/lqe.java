package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class lqe {
    public static final /* synthetic */ zv8[] l;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public sgg h;
    public final mjg j;
    public final r8e k;
    public final String a = lqe.class.getName();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final p3c i = qyj.S();

    static {
        z8b z8bVar = new z8b(lqe.class, "updateRingtones", "getUpdateRingtones()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public lqe(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        mjg mjgVarA = p90.a(cqb.b);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:19:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.lqe r8, defpackage.u8b r9, defpackage.nq4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.hqe
            if (r0 == 0) goto L13
            r0 = r10
            hqe r0 = (defpackage.hqe) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            hqe r0 = new hqe
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.h
            int r1 = r0.j
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            int r9 = r0.g
            int r1 = r0.f
            int r3 = r0.e
            java.lang.Object[] r4 = r0.d
            defpackage.ch3.d0(r10)
            goto L82
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L34:
            defpackage.ch3.d0(r10)
            java.lang.Object[] r10 = r9.a
            int r9 = r9.b
            r1 = 0
            r4 = r10
            r3 = r1
        L3e:
            if (r1 >= r9) goto L84
            r10 = r4[r1]
            java.io.File r10 = (java.io.File) r10
            ny8 r5 = r8.e
            java.lang.Object r5 = r5.getValue()
            ju6 r5 = (defpackage.ju6) r5
            java.lang.String r6 = r10.getName()
            r5.getClass()
            java.lang.String r5 = r5.c()
            java.lang.String r7 = "ringtones"
            java.io.File r5 = defpackage.ju6.j(r5, r7)
            java.io.File r7 = new java.io.File
            java.lang.String r6 = defpackage.l21.a(r6)
            r7.<init>(r5, r6)
            k9d r5 = new k9d
            r6 = 27
            r5.<init>(r10, r6, r7)
            r0.d = r4
            r0.e = r3
            r0.f = r1
            r0.g = r9
            r0.j = r2
            k66 r10 = defpackage.k66.a
            java.lang.Object r10 = defpackage.qyj.V(r10, r5, r0)
            hu4 r5 = defpackage.hu4.a
            if (r10 != r5) goto L82
            return r5
        L82:
            int r1 = r1 + r2
            goto L3e
        L84:
            sbi r8 = defpackage.sbi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqe.a(lqe, u8b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x018c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0193  */
    /* JADX WARN: Code duplicated, block: B:60:0x019d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0248  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0242 -> B:79:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0248 -> B:81:0x0251). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:64:0x01cd
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.lqe r22, defpackage.u8b r23, defpackage.nq4 r24) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqe.b(lqe, u8b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[LOOP:0: B:33:0x007e->B:34:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(lqe lqeVar, nq4 nq4Var) {
        jqe jqeVar;
        File[] fileArr;
        File[] fileArr2;
        int iP0;
        LinkedHashMap linkedHashMap;
        int i;
        LinkedHashMap linkedHashMap2;
        u8b u8bVar;
        File file;
        lqeVar.getClass();
        if (nq4Var instanceof jqe) {
            jqeVar = (jqe) nq4Var;
            int i2 = jqeVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jqeVar.g = i2 - Integer.MIN_VALUE;
            } else {
                jqeVar = new jqe(lqeVar, nq4Var);
            }
        } else {
            jqeVar = new jqe(lqeVar, nq4Var);
        }
        Object objV = jqeVar.e;
        int i3 = jqeVar.g;
        k66 k66Var = k66.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objV);
            fqe fqeVar = new fqe(lqeVar, 0);
            jqeVar.g = 1;
            objV = qyj.V(k66Var, fqeVar, jqeVar);
            if (objV != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 == 1) {
            ch3.d0(objV);
        } else {
            if (i3 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileArr = jqeVar.d;
            ch3.d0(objV);
        }
        fileArr2 = (File[]) objV;
        if (fileArr2 == null) {
            fileArr2 = new File[0];
        }
        iP0 = wm9.P0(fileArr.length);
        if (iP0 < 16) {
            iP0 = 16;
        }
        linkedHashMap = new LinkedHashMap(iP0);
        for (File file2 : fileArr) {
            linkedHashMap.put(file2.getName(), file2);
        }
        linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        u8b u8bVar2 = new u8b();
        u8bVar = new u8b();
        for (File file3 : fileArr2) {
            file = (File) linkedHashMap2.get(file3.getName());
            if (file == null && file.length() == file3.length()) {
                u8bVar2.b(file3);
            } else {
                u8bVar.b(file3);
            }
            if (file3.exists()) {
                linkedHashMap2.put(file3.getName(), file3);
            }
        }
        return new uca(np4.G(linkedHashMap2.values()), u8bVar2, u8bVar);
        File[] fileArr3 = (File[]) objV;
        if (fileArr3 == null) {
            fileArr3 = new File[0];
        }
        fqe fqeVar2 = new fqe(lqeVar, 1);
        jqeVar.d = fileArr3;
        jqeVar.g = 2;
        Object objV2 = qyj.V(k66Var, fqeVar2, jqeVar);
        if (objV2 != hu4Var) {
            File[] fileArr4 = fileArr3;
            objV = objV2;
            fileArr = fileArr4;
            fileArr2 = (File[]) objV;
            if (fileArr2 == null) {
                fileArr2 = new File[0];
            }
            iP0 = wm9.P0(fileArr.length);
            if (iP0 < 16) {
                iP0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iP0);
            while (i < r0) {
                linkedHashMap.put(file2.getName(), file2);
            }
            linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            u8b u8bVar3 = new u8b();
            u8bVar = new u8b();
            while (i < r2) {
                file = (File) linkedHashMap2.get(file3.getName());
                if (file == null) {
                    u8bVar.b(file3);
                } else {
                    u8bVar.b(file3);
                }
                if (file3.exists()) {
                    linkedHashMap2.put(file3.getName(), file3);
                }
            }
            return new uca(np4.G(linkedHashMap2.values()), u8bVar3, u8bVar);
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(lqe lqeVar, nq4 nq4Var) {
        kqe kqeVar;
        if (nq4Var instanceof kqe) {
            kqeVar = (kqe) nq4Var;
            int i = kqeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqeVar.f = i - Integer.MIN_VALUE;
            } else {
                kqeVar = new kqe(lqeVar, nq4Var);
            }
        } else {
            kqeVar = new kqe(lqeVar, nq4Var);
        }
        Object objV = kqeVar.d;
        int i2 = kqeVar.f;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(objV);
            fqe fqeVar = new fqe(lqeVar, 2);
            kqeVar.f = 1;
            objV = qyj.V(k66.a, fqeVar, kqeVar);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        File[] fileArr = (File[]) objV;
        if (fileArr != null && fileArr.length != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final xb9 e() {
        return (xb9) this.c.getValue();
    }
}
