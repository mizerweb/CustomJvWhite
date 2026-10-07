package defpackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l0j extends mdh implements qf7 {
    public File e;
    public String f;
    public y0e g;
    public ArrayList h;
    public m6a i;
    public float j;
    public float k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gka n;
    public final /* synthetic */ n0j o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0j(gka gkaVar, n0j n0jVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = gkaVar;
        this.o = n0jVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        l0j l0jVar = new l0j(this.n, this.o, lq4Var);
        l0jVar.m = obj;
        return l0jVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((l0j) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x0407  */
    /* JADX WARN: Code duplicated, block: B:134:0x0444  */
    /* JADX WARN: Code duplicated, block: B:136:0x0460  */
    /* JADX WARN: Code duplicated, block: B:138:0x046d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0471  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:147:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0525  */
    /* JADX WARN: Code duplicated, block: B:158:0x0532  */
    /* JADX WARN: Code duplicated, block: B:161:0x053c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0548 A[Catch: all -> 0x054d, TryCatch #3 {all -> 0x054d, blocks: (B:162:0x0542, B:164:0x0548, B:168:0x0550), top: B:191:0x0542 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x054f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0561  */
    /* JADX WARN: Code duplicated, block: B:178:0x058a  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:197:0x0562 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0202  */
    /* JADX WARN: Code duplicated, block: B:68:0x0222 A[LOOP:1: B:66:0x021c->B:68:0x0222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0238  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x031b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.io.File, java.lang.Object, java.lang.String, java.util.ArrayList, y0e] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.File, java.lang.Object, java.lang.String, java.util.ArrayList, m6a, y0e] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [j95, java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws k0j {
        Object objA;
        File file;
        float f;
        float f2;
        y0e y0eVar;
        String str;
        e0j e0jVar;
        String str2;
        ArrayList arrayList;
        Iterator it;
        y0e y0eVar2;
        String str3;
        a4c a4cVar;
        ?? r8;
        float f3;
        m6a m6aVarB;
        boolean zP;
        n0j n0jVar;
        Object objK0;
        String str4;
        float f4;
        y0e y0eVar3;
        ArrayList<File> arrayList2;
        m6a m6aVar;
        boolean z;
        Object poeVar;
        Object obj2;
        boolean zBooleanValue;
        ny8 ny8Var;
        j0j j0jVar;
        float f5;
        ArrayList arrayList3;
        float f6;
        y0e y0eVar4;
        ArrayList arrayList4;
        float f7;
        float f8;
        File file2;
        String str5;
        Object poeVar2;
        float f9;
        float f10;
        File file3;
        String str6;
        gka gkaVar;
        gka gkaVar2;
        j0j j0jVar2;
        float f11;
        File file4;
        ?? r5;
        Object poeVar3;
        gka gkaVar3;
        ?? r9;
        j0j j0jVar3;
        y0e y0eVar5;
        float f12;
        File file5;
        Object poeVar4;
        Object obj3;
        boolean zDelete;
        ?? r10;
        gka gkaVar4;
        Long l = 0L;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        lii liiVar = lii.ERROR_DURING_CONVERT;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) this.m;
        hu4 hu4Var = hu4.a;
        switch (this.l) {
            case 0:
                ch3.d0(obj);
                File file6 = new File(this.n.b);
                gka gkaVar5 = this.n;
                String str7 = gkaVar5.a.c;
                fvi fviVar = gkaVar5.e;
                y0e y0eVar6 = fviVar.a;
                if (y0eVar6 == null) {
                    y0eVar6 = y0e.P_480;
                }
                y0e y0eVar7 = y0eVar6;
                float f13 = fviVar.b;
                float f14 = fviVar.c;
                n0j n0jVar2 = this.o;
                this.m = yx6Var;
                this.e = file6;
                this.f = str7;
                this.g = y0eVar7;
                this.j = f13;
                this.k = f14;
                this.l = 1;
                objA = n0j.a(n0jVar2, str7, this);
                if (objA != hu4Var) {
                    file = file6;
                    f = f14;
                    f2 = f13;
                    y0eVar = y0eVar7;
                    str = str7;
                    e0jVar = (e0j) objA;
                    if (e0jVar == null && (str6 = e0jVar.c) != null) {
                        String strConcat = "Video message can't be uploaded due to error on prev convert attempt: ".concat(str6);
                        k0j k0jVar = new k0j(strConcat, null, 2, null);
                        String str8 = this.o.f;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            a4cVar2.c(je9Var, str8, strConcat, k0jVar);
                        }
                        qrc.m((mii) this.o.b.getValue(), liiVar, str, qv1.k("error_previous_attempt:", e0jVar.c), 20);
                        throw k0jVar;
                    }
                    if (e0jVar == null && ku6.p(e0jVar.a)) {
                        String str9 = this.o.f;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str9, qv1.k("video message is already prepared, reusing ", file.getName()), null);
                        }
                        mii miiVar = (mii) this.o.b.getValue();
                        try {
                            poeVar2 = Long.valueOf(new File(e0jVar.a).length());
                        } catch (Throwable th) {
                            poeVar2 = new poe(th);
                        }
                        if (poeVar2 instanceof poe) {
                            poeVar2 = l;
                        }
                        String str10 = str;
                        miiVar.B(str10, ((Number) poeVar2).longValue(), true, y0eVar.b, 0, 0, 0, false);
                        j0j j0jVar4 = (j0j) this.o.e.getValue();
                        this.m = yx6Var;
                        this.e = file;
                        this.f = null;
                        this.g = null;
                        this.j = f2;
                        this.k = f;
                        this.l = 2;
                        if (j0jVar4.a(str10, this) != hu4Var) {
                            f9 = f;
                            f10 = f2;
                            file3 = file;
                            uj6 uj6VarA = this.n.a();
                            uj6VarA.b = file3.lastModified();
                            gkaVar = new gka(uj6VarA);
                            this.m = null;
                            this.e = null;
                            this.f = null;
                            this.g = null;
                            this.j = f10;
                            this.k = f9;
                            this.l = 3;
                            if (yx6Var.emit(gkaVar, this) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    } else {
                        str2 = str;
                        List list = this.n.e.d;
                        arrayList = new ArrayList(yw3.W0(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new File((String) it.next()));
                        }
                        if (arrayList.size() != 1 && yab.A(f2, 0.0f) && yab.A(f, 1.0f)) {
                            String str11 = this.o.f;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                                a4cVar4.c(je9Var2, str11, qv1.l("move ", ((File) arrayList.get(0)).getName(), " → ", file.getName()), null);
                            }
                            try {
                                Files.move(((File) arrayList.get(0)).toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                n0j n0jVar3 = this.o;
                                gka gkaVar6 = this.n;
                                this.m = yx6Var;
                                this.e = file;
                                this.f = str2;
                                this.g = y0eVar;
                                this.h = null;
                                this.j = f2;
                                this.k = f;
                                this.l = 6;
                                y0eVar4 = y0eVar;
                                arrayList4 = null;
                                if (yab.K0(zhb.b, new p7g(n0jVar3, gkaVar6, file, null, 21), this) != hu4Var) {
                                    f7 = f;
                                    f8 = f2;
                                    file2 = file;
                                    str5 = str2;
                                    j0jVar2 = (j0j) this.o.e.getValue();
                                    this.m = yx6Var;
                                    this.e = file2;
                                    this.f = str5;
                                    this.g = y0eVar4;
                                    this.h = arrayList4;
                                    this.j = f8;
                                    this.k = f7;
                                    this.l = 7;
                                    if (j0jVar2.a(str5, this) != hu4Var) {
                                        f11 = f7;
                                        file4 = file2;
                                        r5 = arrayList4;
                                        String str12 = str5;
                                        mii miiVar2 = (mii) this.o.b.getValue();
                                        try {
                                            poeVar3 = Long.valueOf(new File(file4.getPath()).length());
                                        } catch (Throwable th2) {
                                            poeVar3 = new poe(th2);
                                        }
                                        if (poeVar3 instanceof poe) {
                                            poeVar3 = l;
                                        }
                                        miiVar2.B(str12, ((Number) poeVar3).longValue(), false, y0eVar4.b, 0, 0, 0, true);
                                        uj6 uj6VarA2 = this.n.a();
                                        uj6VarA2.b = file4.lastModified();
                                        gkaVar3 = new gka(uj6VarA2);
                                        this.m = r5;
                                        this.e = r5;
                                        this.f = r5;
                                        this.g = r5;
                                        this.h = r5;
                                        this.j = f8;
                                        this.k = f11;
                                        this.l = 8;
                                        if (yx6Var.emit(gkaVar3, this) == hu4Var) {
                                            return sbiVar;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                String str13 = this.o.f;
                                a4c a4cVar5 = gm0.f;
                                if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                                    StringBuilder sbQ = qv1.q("move failed: ", ((File) arrayList.get(0)).getName(), " → ", file.getName(), ", error: ");
                                    sbQ.append(th3);
                                    a4cVar5.c(je9Var, str13, sbQ.toString(), th3);
                                }
                                File file7 = (File) arrayList.get(0);
                                if (file7 != null) {
                                    try {
                                        if (file7.exists() && file7.canRead()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        poeVar = Boolean.valueOf(z);
                                    } catch (Throwable th4) {
                                        poeVar = new poe(th4);
                                        obj2 = Boolean.FALSE;
                                        if (poeVar instanceof poe) {
                                            poeVar = obj2;
                                        }
                                        zBooleanValue = ((Boolean) poeVar).booleanValue();
                                        ny8Var = this.o.b;
                                        if (!zBooleanValue) {
                                            qrc.m((mii) ny8Var.getValue(), liiVar, str2, "error_moving_file:".concat(th3.getClass().getName()), 20);
                                            throw th3;
                                        }
                                        mii miiVar3 = (mii) ny8Var.getValue();
                                        miiVar3.getClass();
                                        miiVar3.i(str2, new ylc("fail_convert", 1));
                                        j0jVar = (j0j) this.o.e.getValue();
                                        this.m = yx6Var;
                                        this.e = null;
                                        this.f = null;
                                        this.g = null;
                                        this.h = arrayList;
                                        this.i = null;
                                        this.j = f2;
                                        this.k = f;
                                        this.l = 4;
                                        if (j0jVar.a(str2, this) != hu4Var) {
                                            f5 = f;
                                            arrayList3 = arrayList;
                                            f6 = f2;
                                            gka gkaVar7 = this.n;
                                            File file8 = (File) arrayList3.get(0);
                                            uj6 uj6VarA3 = gkaVar7.a();
                                            uj6VarA3.a = file8.getPath();
                                            uj6VarA3.b = file8.lastModified();
                                            gkaVar2 = new gka(uj6VarA3);
                                            this.m = null;
                                            this.e = null;
                                            this.f = null;
                                            this.g = null;
                                            this.h = null;
                                            this.i = null;
                                            this.j = f6;
                                            this.k = f5;
                                            this.l = 5;
                                            if (yx6Var.emit(gkaVar2, this) != hu4Var) {
                                                return sbiVar;
                                            }
                                        }
                                        return hu4Var;
                                    }
                                    obj2 = Boolean.FALSE;
                                    if (poeVar instanceof poe) {
                                        poeVar = obj2;
                                    }
                                    zBooleanValue = ((Boolean) poeVar).booleanValue();
                                    ny8Var = this.o.b;
                                    if (!zBooleanValue) {
                                        qrc.m((mii) ny8Var.getValue(), liiVar, str2, "error_moving_file:".concat(th3.getClass().getName()), 20);
                                        throw th3;
                                    }
                                    mii miiVar4 = (mii) ny8Var.getValue();
                                    miiVar4.getClass();
                                    miiVar4.i(str2, new ylc("fail_convert", 1));
                                    j0jVar = (j0j) this.o.e.getValue();
                                    this.m = yx6Var;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = arrayList;
                                    this.i = null;
                                    this.j = f2;
                                    this.k = f;
                                    this.l = 4;
                                    if (j0jVar.a(str2, this) != hu4Var) {
                                        f5 = f;
                                        arrayList3 = arrayList;
                                        f6 = f2;
                                        gka gkaVar8 = this.n;
                                        File file9 = (File) arrayList3.get(0);
                                        uj6 uj6VarA4 = gkaVar8.a();
                                        uj6VarA4.a = file9.getPath();
                                        uj6VarA4.b = file9.lastModified();
                                        gkaVar2 = new gka(uj6VarA4);
                                        this.m = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = null;
                                        this.h = null;
                                        this.i = null;
                                        this.j = f6;
                                        this.k = f5;
                                        this.l = 5;
                                        if (yx6Var.emit(gkaVar2, this) != hu4Var) {
                                            return sbiVar;
                                        }
                                    }
                                } else {
                                    z = false;
                                    poeVar = Boolean.valueOf(z);
                                    obj2 = Boolean.FALSE;
                                    if (poeVar instanceof poe) {
                                        poeVar = obj2;
                                    }
                                    zBooleanValue = ((Boolean) poeVar).booleanValue();
                                    ny8Var = this.o.b;
                                    if (!zBooleanValue) {
                                        qrc.m((mii) ny8Var.getValue(), liiVar, str2, "error_moving_file:".concat(th3.getClass().getName()), 20);
                                        throw th3;
                                    }
                                    mii miiVar5 = (mii) ny8Var.getValue();
                                    miiVar5.getClass();
                                    miiVar5.i(str2, new ylc("fail_convert", 1));
                                    j0jVar = (j0j) this.o.e.getValue();
                                    this.m = yx6Var;
                                    this.e = null;
                                    this.f = null;
                                    this.g = null;
                                    this.h = arrayList;
                                    this.i = null;
                                    this.j = f2;
                                    this.k = f;
                                    this.l = 4;
                                    if (j0jVar.a(str2, this) != hu4Var) {
                                        f5 = f;
                                        arrayList3 = arrayList;
                                        f6 = f2;
                                        gka gkaVar9 = this.n;
                                        File file10 = (File) arrayList3.get(0);
                                        uj6 uj6VarA5 = gkaVar9.a();
                                        uj6VarA5.a = file10.getPath();
                                        uj6VarA5.b = file10.lastModified();
                                        gkaVar2 = new gka(uj6VarA5);
                                        this.m = null;
                                        this.e = null;
                                        this.f = null;
                                        this.g = null;
                                        this.h = null;
                                        this.i = null;
                                        this.j = f6;
                                        this.k = f5;
                                        this.l = 5;
                                        if (yx6Var.emit(gkaVar2, this) != hu4Var) {
                                            return sbiVar;
                                        }
                                    }
                                }
                            }
                        } else {
                            y0eVar2 = y0eVar;
                            str3 = this.o.f;
                            a4cVar = gm0.f;
                            if (a4cVar == null && a4cVar.b(je9Var2)) {
                                r8 = 0;
                                a4cVar.c(je9Var2, str3, zo5.i(arrayList.size(), "merging ", " fragment(s) → ", file.getName()), null);
                            } else {
                                r8 = 0;
                            }
                            vd7.q(getContext());
                            f3 = f2;
                            m6aVarB = n0j.b(this.o, arrayList, file, f3, f, true);
                            if (m6aVarB instanceof k6a) {
                                vd7.q(getContext());
                                m6aVarB = n0j.b(this.o, arrayList, file, f3, f, false);
                                if (m6aVarB instanceof k6a) {
                                    k6a k6aVar = (k6a) m6aVarB;
                                    qrc.m((mii) this.o.b.getValue(), liiVar, str2, k6aVar.f.getMessage(), 20);
                                    throw new k0j("transform failed", k6aVar.f);
                                }
                            }
                            zP = ku6.p(file.getPath());
                            n0jVar = this.o;
                            if (!zP) {
                                qrc.m((mii) n0jVar.b.getValue(), lii.CONVERTED_FILE_DISAPPEARED, str2, r8, 28);
                                throw new k0j("file disappeared", r8, 2, r8);
                            }
                            gka gkaVar10 = this.n;
                            this.m = yx6Var;
                            this.e = file;
                            this.f = str2;
                            this.g = y0eVar2;
                            this.h = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0506: IPUT (r20v0 ?? I:??[OBJECT, ARRAY]), (r30v0 'this' l0j A[IMMUTABLE_TYPE, THIS]) l0j.h java.util.ArrayList in method: l0j.invokeSuspend(java.lang.Object):java.lang.Object, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:311)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1550
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.l0j.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }
