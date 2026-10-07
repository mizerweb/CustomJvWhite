package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class c47 extends mdh implements qf7 {
    public ArrayList e;
    public d47 f;
    public String g;
    public d47 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ d47 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c47(d47 d47Var, String str, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = d47Var;
        this.o = str;
        this.p = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new c47(this.n, this.o, this.p, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((c47) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0176 A[Catch: all -> 0x0022, CancellationException -> 0x0199, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001d, B:57:0x016f, B:60:0x0176, B:62:0x017c), top: B:83:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws TamErrorException {
        d47 d47Var;
        Throwable cause;
        TamErrorException tamErrorException;
        Object objN;
        ArrayList arrayList;
        d47 d47Var2;
        String str;
        Object objH;
        int i;
        int i2;
        d47 d47Var3;
        int i3;
        int i4;
        sy4 sy4Var;
        long j;
        d47 d47Var4;
        String str2;
        String str3;
        a4c a4cVar;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i5 = this.m;
        TamErrorException tamErrorException2 = null;
        try {
            try {
                if (i5 == 0) {
                    ch3.d0(obj);
                    String str4 = this.n.b;
                    String str5 = this.o;
                    int i6 = this.p;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str4, nbh.r(i6, "Moving folder(", str5, ") to pos="), null);
                    }
                    sy4 sy4Var2 = (sy4) this.n.d.getValue();
                    this.m = 1;
                    sy4Var2.getClass();
                    objN = e9i.N(new jz(sy4Var2.n, 14), this);
                    if (objN != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d47Var = this.h;
                        str2 = this.g;
                        d47Var4 = this.f;
                        try {
                            ch3.d0(obj);
                            str3 = d47Var4.b;
                            a4cVar = gm0.f;
                            if (a4cVar == null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str3, "Successfully moved folder(" + str2 + ") to new pos", null);
                            }
                            return sbiVar;
                        } catch (Throwable th) {
                            th = th;
                            gm0.V(d47Var.b, "Not moved folder due to error", th);
                            cause = th.getCause();
                            if (th instanceof TamErrorException) {
                                tamErrorException = th;
                            } else {
                                tamErrorException = null;
                            }
                            if (tamErrorException == null) {
                                tamErrorException2 = tamErrorException;
                            } else if (cause instanceof TamErrorException) {
                                tamErrorException2 = (TamErrorException) cause;
                            }
                            if (tamErrorException2 != null && z5h.K0(tamErrorException2.a.b, "folder.order.", false)) {
                                gm0.n(d47Var.b, "try to fetch all folders");
                                ((b47) d47Var.f.getValue()).a();
                            }
                            throw th;
                        }
                    }
                    int i7 = this.l;
                    int i8 = this.k;
                    int i9 = this.j;
                    int i10 = this.i;
                    d47 d47Var5 = this.h;
                    str = this.g;
                    d47 d47Var6 = this.f;
                    arrayList = this.e;
                    ch3.d0(obj);
                    d47Var3 = d47Var5;
                    d47Var2 = d47Var6;
                    i2 = i10;
                    i3 = i9;
                    i4 = i8;
                    i = i7;
                    objH = obj;
                    try {
                        sy4Var = (sy4) d47Var2.d.getValue();
                        j = ((i67) objH).c;
                        this.e = null;
                        this.f = d47Var2;
                        this.g = str;
                        this.h = d47Var3;
                        this.i = i2;
                        this.j = i3;
                        this.k = i4;
                        this.l = i;
                        this.m = 3;
                        if (sy4Var.o(j, this, arrayList) != hu4Var) {
                            d47Var = d47Var3;
                            d47Var4 = d47Var2;
                            str2 = str;
                            str3 = d47Var4.b;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                a4cVar.c(je9Var, str3, "Successfully moved folder(" + str2 + ") to new pos", null);
                            }
                            return sbiVar;
                        }
                        return hu4Var;
                    } catch (Throwable th2) {
                        th = th2;
                        d47Var = d47Var3;
                        gm0.V(d47Var.b, "Not moved folder due to error", th);
                        cause = th.getCause();
                        if (th instanceof TamErrorException) {
                            tamErrorException = th;
                        } else {
                            tamErrorException = null;
                        }
                        if (tamErrorException == null) {
                            tamErrorException2 = tamErrorException;
                        } else if (cause instanceof TamErrorException) {
                            tamErrorException2 = (TamErrorException) cause;
                        }
                        if (tamErrorException2 != null) {
                            gm0.n(d47Var.b, "try to fetch all folders");
                            ((b47) d47Var.f.getValue()).a();
                        }
                        throw th;
                    }
                }
                ch3.d0(obj);
                objN = obj;
                Iterable iterable = (Iterable) objN;
                ArrayList arrayList2 = new ArrayList(yw3.W0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((r17) it.next()).a);
                }
                arrayList = new ArrayList(ww3.l1(arrayList2, 1));
                if (!arrayList.isEmpty()) {
                    int iIndexOf = arrayList.indexOf(this.o);
                    if (iIndexOf == -1) {
                        String str6 = this.n.b;
                        String str7 = this.o;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            je9 je9Var2 = je9.f;
                            if (a4cVar3.b(je9Var2)) {
                                a4cVar3.c(je9Var2, str6, c0a.o("Folder(", str7, ") not found in order list"), null);
                                return sbiVar;
                            }
                        }
                    } else {
                        int iV = oc9.v(this.p, 0, arrayList.size() - 1);
                        if (iIndexOf != iV) {
                            arrayList.remove(iIndexOf);
                            arrayList.add(iV, this.o);
                            h67 h67Var = new h67(arrayList);
                            d47Var2 = this.n;
                            str = this.o;
                            pvb pvbVar = (pvb) d47Var2.c.getValue();
                            String str8 = d47Var2.b;
                            ed6 ed6Var = (ed6) d47Var2.e.getValue();
                            this.e = arrayList;
                            this.f = d47Var2;
                            this.g = str;
                            this.h = d47Var2;
                            this.i = iIndexOf;
                            this.j = iV;
                            this.k = 0;
                            this.l = 0;
                            this.m = 2;
                            objH = cqk.H(pvbVar, h67Var, str8, ed6Var, this);
                            if (objH != hu4Var) {
                                i = 0;
                                i2 = iIndexOf;
                                d47Var3 = d47Var2;
                                i3 = iV;
                                i4 = 0;
                                sy4Var = (sy4) d47Var2.d.getValue();
                                j = ((i67) objH).c;
                                this.e = null;
                                this.f = d47Var2;
                                this.g = str;
                                this.h = d47Var3;
                                this.i = i2;
                                this.j = i3;
                                this.k = i4;
                                this.l = i;
                                this.m = 3;
                                if (sy4Var.o(j, this, arrayList) != hu4Var) {
                                    d47Var = d47Var3;
                                    d47Var4 = d47Var2;
                                    str2 = str;
                                    str3 = d47Var4.b;
                                    a4cVar = gm0.f;
                                    if (a4cVar == null) {
                                        a4cVar.c(je9Var, str3, "Successfully moved folder(" + str2 + ") to new pos", null);
                                    }
                                }
                            }
                            return hu4Var;
                        }
                    }
                }
                return sbiVar;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th3) {
            th = th3;
            d47Var = d47Var2;
        }
    }
}
