package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class zch extends mdh implements qf7 {
    public ldh e;
    public ldh f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public final /* synthetic */ ldh l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zch(ldh ldhVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = ldhVar;
        this.m = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new zch(this.l, this.m, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zch) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3 A[Catch: all -> 0x0023, CancellationException -> 0x0118, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:51:0x00dc, B:54:0x00e3, B:56:0x00eb), top: B:69:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb A[Catch: all -> 0x0023, CancellationException -> 0x0118, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x001e, B:51:0x00dc, B:54:0x00e3, B:56:0x00eb), top: B:69:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x00eb, please report this as an issue */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j;
        ldh ldhVar;
        long j2;
        Object objH;
        ldh ldhVar2;
        ldh ldhVar3;
        int i;
        long j3;
        long j4;
        ldh ldhVar4;
        String str;
        a4c a4cVar;
        je9 je9Var;
        String str2;
        a4c a4cVar2;
        je9 je9Var2;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i2 = this.k;
        int i3 = 0;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                ldh ldhVar5 = this.l;
                j = this.m;
                try {
                    this.e = ldhVar5;
                    this.f = ldhVar5;
                    this.g = j;
                    this.h = j;
                    this.i = 0;
                    this.j = 0;
                    this.k = 1;
                    objH = ldh.h(ldhVar5, j, this);
                    if (objH != hu4Var) {
                        ldhVar2 = ldhVar5;
                        ldhVar3 = ldhVar2;
                        i = 0;
                        j3 = j;
                    }
                    return hu4Var;
                } catch (Throwable th) {
                    th = th;
                    ldhVar = ldhVar5;
                    j2 = j;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), th);
                        }
                    }
                    return sbiVar;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = this.h;
                j4 = this.g;
                ldhVar = this.f;
                ldhVar4 = this.e;
                try {
                    ch3.d0(obj);
                    ldhVar3 = ldhVar4;
                    j3 = j4;
                    str2 = ldhVar3.j;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        je9Var2 = je9.e;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "loadFromMarker: success marker=" + j3, null);
                            return sbiVar;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), th);
                        }
                    }
                }
                return sbiVar;
            }
            i = this.j;
            int i4 = this.i;
            j = this.h;
            j3 = this.g;
            ldhVar2 = this.f;
            ldhVar3 = this.e;
            try {
                ch3.d0(obj);
                i3 = i4;
                objH = obj;
            } catch (Throwable th3) {
                th = th3;
                j2 = j;
                ldhVar = ldhVar2;
                str = ldhVar.j;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), th);
                    }
                }
                return sbiVar;
            }
            uch uchVar = (uch) objH;
            if (uchVar != null) {
                long j5 = j;
                try {
                    if (uchVar.b != 0) {
                        try {
                            String str3 = ldhVar3.j;
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var3 = je9.d;
                                if (a4cVar3.b(je9Var3)) {
                                    a4cVar3.c(je9Var3, str3, "loadFromMarker: new marker in response=" + uchVar + ".marker", null);
                                }
                            }
                            ldhVar3.o(uchVar.b);
                        } catch (Throwable th4) {
                            th = th4;
                            ldhVar = ldhVar2;
                            j2 = j5;
                            str = ldhVar.j;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), th);
                                }
                            }
                        }
                    }
                    dm6 dm6VarM = ldhVar3.m();
                    List list = uchVar.a;
                    this.e = ldhVar3;
                    this.f = ldhVar2;
                    this.g = j3;
                    j = j5;
                    this.h = j;
                    this.i = i3;
                    this.j = i;
                    this.k = 2;
                    Object objH2 = ch3.H(this, new zl6(dm6VarM, list, null, 0), dm6VarM.a);
                    if (objH2 != hu4Var) {
                        objH2 = sbiVar;
                    }
                    if (objH2 != hu4Var) {
                        j2 = j;
                        j4 = j3;
                        ldhVar = ldhVar2;
                        ldhVar4 = ldhVar3;
                        ldhVar3 = ldhVar4;
                        j3 = j4;
                    }
                    return hu4Var;
                } catch (Throwable th5) {
                    th = th5;
                    j = j5;
                    j2 = j;
                    ldhVar = ldhVar2;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(j2, "loadFromMarker: failed to load from marker="), th);
                        }
                    }
                    return sbiVar;
                }
            }
            j2 = j;
            ldhVar = ldhVar2;
            str2 = ldhVar3.j;
            a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "loadFromMarker: success marker=" + j3, null);
                    return sbiVar;
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
