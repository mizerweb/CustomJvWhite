package defpackage;

import java.io.File;
import one.me.sdk.upload.messages.UploadConversionException;

/* JADX INFO: loaded from: classes3.dex */
public final class ncd implements yx6 {
    public final /* synthetic */ yx6 a;
    public final /* synthetic */ wui b;
    public final /* synthetic */ gka c;
    public final /* synthetic */ pcd d;
    public final /* synthetic */ xui e;

    public ncd(yx6 yx6Var, wui wuiVar, gka gkaVar, pcd pcdVar, xui xuiVar) {
        this.a = yx6Var;
        this.b = wuiVar;
        this.c = gkaVar;
        this.d = pcdVar;
        this.e = xuiVar;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x021d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:86:0x025b A[RETURN] */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws UploadConversionException {
        mcd mcdVar;
        Object poeVar;
        Object obj2;
        Object poeVar2;
        gka gkaVar;
        int i;
        Object poeVar3;
        float fFloatValue;
        Object objEmit;
        hu4 hu4Var;
        pcd pcdVar = this.d;
        String str = pcdVar.a;
        if (lq4Var instanceof mcd) {
            mcdVar = (mcd) lq4Var;
            int i2 = mcdVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mcdVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mcdVar = new mcd(this, lq4Var);
            }
        } else {
            mcdVar = new mcd(this, lq4Var);
        }
        Object obj3 = mcdVar.d;
        int i3 = mcdVar.e;
        if (i3 == 0) {
            ch3.d0(obj3);
            wui wuiVar = this.b;
            String str2 = wuiVar.e;
            long j = wuiVar.h;
            xui xuiVar = wuiVar.a;
            String str3 = wuiVar.e;
            boolean zP = ku6.p(str2);
            xui xuiVar2 = this.e;
            gka gkaVar2 = this.c;
            if (zP) {
                if (wuiVar.b) {
                    mii miiVarA = pcdVar.a();
                    String str4 = gkaVar2.a.c;
                    try {
                        poeVar = Long.valueOf(new File(str3).length());
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    if (poeVar instanceof poe) {
                        poeVar = 0L;
                    }
                    miiVarA.B(str4, ((Number) poeVar).longValue(), wuiVar.f, xuiVar.b.a.b, (int) (j >> 32), (int) (j & 4294967295L), wuiVar.j, wuiVar.g);
                    bk5 bk5VarC = ((f5d) ((wo6) pcdVar.d.getValue())).c();
                    bk5VarC.getClass();
                    zv8 zv8Var = bk5.c[8];
                    if (bk5VarC.b("transcode")) {
                        boolean z = wuiVar.f;
                        Float f = wuiVar.t;
                        if (z) {
                            obj2 = 0L;
                        } else {
                            yj5 yj5Var = (yj5) pcdVar.c.getValue();
                            float f2 = (int) (j >> 32);
                            float f3 = (int) (j & 4294967295L);
                            long j2 = wuiVar.i;
                            float f4 = (int) (j2 >> 32);
                            float f5 = (int) (j2 & 4294967295L);
                            float f6 = wuiVar.j;
                            float f7 = wuiVar.k;
                            float f8 = wuiVar.l;
                            obj2 = 0L;
                            float f9 = wuiVar.m;
                            float f10 = wuiVar.n;
                            float f11 = wuiVar.o;
                            try {
                                poeVar3 = Long.valueOf(new File(str3).length());
                            } catch (Throwable th2) {
                                poeVar3 = new poe(th2);
                            }
                            if (poeVar3 instanceof poe) {
                                poeVar3 = null;
                            }
                            float fLongValue = ((Number) poeVar3).longValue();
                            float f12 = xuiVar.b.a.b;
                            float f13 = wuiVar.q;
                            float f14 = wuiVar.r;
                            if (f == null) {
                                fFloatValue = -1.0f;
                            } else {
                                fFloatValue = cqk.c(f, Float.MAX_VALUE) ? 0.0f : f.floatValue();
                            }
                            float f15 = fFloatValue;
                            String str5 = wuiVar.s;
                            String strValueOf = String.valueOf(wuiVar.g);
                            Integer num = wuiVar.u;
                            String strValueOf2 = num != null ? String.valueOf(num.intValue()) : null;
                            Integer num2 = wuiVar.v;
                            String strValueOf3 = num2 != null ? String.valueOf(num2.intValue()) : null;
                            Integer num3 = wuiVar.w;
                            String strValueOf4 = num3 != null ? String.valueOf(num3.intValue()) : null;
                            Integer num4 = wuiVar.x;
                            yj5.a(yj5Var, xj5.TRANSCODE, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, fLongValue, f12, f13, f14, f15, 0.0f, str5, strValueOf, strValueOf2, strValueOf3, strValueOf4, num4 != null ? String.valueOf(num4.intValue()) : null, null, -8323072);
                        }
                    } else {
                        obj2 = 0L;
                    }
                    uj6 uj6VarA = gkaVar2.a();
                    try {
                        poeVar2 = Long.valueOf(new File(str3).lastModified());
                    } catch (Throwable th3) {
                        poeVar2 = new poe(th3);
                    }
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj2;
                    }
                    uj6VarA.b = ((Number) poeVar2).longValue();
                    uj6VarA.a = str3;
                    gkaVar = new gka(uj6VarA);
                    i = 1;
                } else {
                    if (!o1m.a(gkaVar2)) {
                        qrc.m(pcdVar.a(), lii.ERROR_DURING_CONVERT, gkaVar2.a.c, "not_finished", 20);
                        throw new UploadConversionException("conversion not finished", null, 2, null);
                    }
                    gkaVar = o1m.c(gkaVar2, str, pcdVar.a(), new UploadConversionException("conversion not finished", null, 2, null), xuiVar2);
                }
                mcdVar.e = i;
                objEmit = this.a.emit(gkaVar, mcdVar);
                hu4Var = hu4.a;
                if (objEmit == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (!o1m.a(gkaVar2)) {
                    qrc.m(pcdVar.a(), lii.CONVERTED_FILE_DISAPPEARED, gkaVar2.a.c, null, 28);
                    throw new UploadConversionException("file_disappeared", null, 2, null);
                }
                gkaVar = o1m.c(gkaVar2, str, pcdVar.a(), new UploadConversionException("file_disappeared", null, 2, null), xuiVar2);
            }
            i = 1;
            mcdVar.e = i;
            objEmit = this.a.emit(gkaVar, mcdVar);
            hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj3);
        }
        return sbi.a;
    }
}
