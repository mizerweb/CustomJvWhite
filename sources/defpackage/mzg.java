package defpackage;

import java.util.Collections;
import java.util.UUID;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class mzg implements yx6 {
    public final /* synthetic */ yx6 a;
    public final /* synthetic */ nzg b;
    public final /* synthetic */ azg c;
    public final /* synthetic */ long d;
    public final /* synthetic */ bxg e;

    public mzg(yx6 yx6Var, nzg nzgVar, azg azgVar, long j, bxg bxgVar) {
        this.a = yx6Var;
        this.b = nzgVar;
        this.c = azgVar;
        this.d = j;
        this.e = bxgVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x01db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // defpackage.yx6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object emit(vxg vxgVar, lq4 lq4Var) {
        lzg lzgVar;
        String str;
        long j;
        a4c a4cVar;
        yx6 yx6Var;
        izg izgVar;
        je9 je9Var;
        yx6 yx6Var2;
        hzg hzgVar;
        vxg vxgVar2 = vxgVar;
        je9 je9Var2 = je9.f;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof lzg) {
            lzgVar = (lzg) lq4Var;
            int i = lzgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzgVar.g = i - Integer.MIN_VALUE;
            } else {
                lzgVar = new lzg(this, lq4Var);
            }
        } else {
            lzgVar = new lzg(this, lq4Var);
        }
        lzg lzgVar2 = lzgVar;
        Object obj = lzgVar2.e;
        hu4 hu4Var = hu4.a;
        switch (lzgVar2.g) {
            case 0:
                ch3.d0(obj);
                if (vxgVar2 instanceof uxg) {
                    yx6 yx6Var3 = this.a;
                    izg izgVar2 = new izg(((uxg) vxgVar2).a);
                    lzgVar2.d = null;
                    lzgVar2.g = 1;
                    if (yx6Var3.emit(izgVar2, lzgVar2) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (vxgVar2 instanceof txg) {
                    String str2 = this.b.e;
                    long j2 = this.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, nbh.s(j2, "Draft #", ": preview is ready. Add local story"), null);
                    }
                    erg ergVar = (erg) this.b.c.getValue();
                    azg azgVar = this.c;
                    long j3 = this.d;
                    bxg bxgVar = this.e;
                    String absolutePath = ((txg) vxgVar2).a.getAbsolutePath();
                    lzgVar2.d = null;
                    lzgVar2.g = 2;
                    ergVar.getClass();
                    k40 k40Var = new k40();
                    k40Var.a = w50.PHOTO;
                    k40Var.f = new Integer(bxgVar.g());
                    k40Var.g = new Integer(bxgVar.f());
                    k40Var.c = absolutePath;
                    Long l = new Long(j3);
                    l40 l40VarA = k40Var.a();
                    long jC = bxgVar.c();
                    int iB = bxgVar.b();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & BuildConfig.MAX_TIME_TO_UPLOAD;
                    ergVar.f().a(Collections.singletonList(new hyg(leastSignificantBits, azgVar, iB, jCurrentTimeMillis, (int) jC, l40VarA, leastSignificantBits, null, null, l, 1, 0, 2304)));
                    Object objI = ch3.I(lzgVar2, ergVar.e().a, false, true, new u14(absolutePath, j3, 5));
                    if (objI != hu4Var) {
                        objI = sbiVar;
                    }
                    if (objI != hu4Var) {
                        objI = sbiVar;
                    }
                    if (objI == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (vxgVar2 instanceof sxg) {
                    String str3 = this.b.e;
                    long j4 = this.d;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str3, nbh.s(j4, "Draft #", ": rendering was failed"), null);
                    }
                    yx6 yx6Var4 = this.a;
                    gzg gzgVar = new gzg(null);
                    lzgVar2.d = null;
                    lzgVar2.g = 3;
                    if (yx6Var4.emit(gzgVar, lzgVar2) != hu4Var) {
                        return sbiVar;
                    }
                } else {
                    if (!(vxgVar2 instanceof rxg)) {
                        ore.o();
                        return null;
                    }
                    ltg ltgVar = (ltg) this.b.d.getValue();
                    long j5 = this.d;
                    rxg rxgVar = (rxg) vxgVar2;
                    u8b u8bVar = rxgVar.a;
                    boolean z = this.e instanceof axg;
                    lzgVar2.d = rxgVar;
                    lzgVar2.g = 4;
                    if (ltgVar.b(j5, u8bVar, z, lzgVar2) != hu4Var) {
                        str = this.b.e;
                        j = this.d;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                StringBuilder sbQ = c0a.q(((rxg) vxgVar2).a.b, j, "Draft #", ": prepared ");
                                sbQ.append(" publish entities");
                                a4cVar.c(je9Var, str, sbQ.toString(), null);
                            }
                        }
                        yx6Var = this.a;
                        izgVar = new izg(1.0f);
                        lzgVar2.d = null;
                        lzgVar2.g = 5;
                        if (yx6Var.emit(izgVar, lzgVar2) != hu4Var) {
                            yx6Var2 = this.a;
                            hzgVar = hzg.a;
                            lzgVar2.d = null;
                            lzgVar2.g = 6;
                            if (yx6Var2.emit(hzgVar, lzgVar2) == hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                }
                return hu4Var;
            case 1:
                ch3.d0(obj);
                return sbiVar;
            case 2:
                ch3.d0(obj);
                return sbiVar;
            case 3:
                ch3.d0(obj);
                return sbiVar;
            case 4:
                vxgVar2 = lzgVar2.d;
                ch3.d0(obj);
                str = this.b.e;
                j = this.d;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbQ2 = c0a.q(((rxg) vxgVar2).a.b, j, "Draft #", ": prepared ");
                        sbQ2.append(" publish entities");
                        a4cVar.c(je9Var, str, sbQ2.toString(), null);
                    }
                }
                yx6Var = this.a;
                izgVar = new izg(1.0f);
                lzgVar2.d = null;
                lzgVar2.g = 5;
                if (yx6Var.emit(izgVar, lzgVar2) != hu4Var) {
                    yx6Var2 = this.a;
                    hzgVar = hzg.a;
                    lzgVar2.d = null;
                    lzgVar2.g = 6;
                    if (yx6Var2.emit(hzgVar, lzgVar2) == hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            case 5:
                ch3.d0(obj);
                yx6Var2 = this.a;
                hzgVar = hzg.a;
                lzgVar2.d = null;
                lzgVar2.g = 6;
                if (yx6Var2.emit(hzgVar, lzgVar2) == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 6:
                ch3.d0(obj);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
