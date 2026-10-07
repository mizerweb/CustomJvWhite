package defpackage;

import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.media.converter.VideoConverterException;

/* JADX INFO: loaded from: classes3.dex */
public final class mvi {
    public static final String f = hvi.class.getName();
    public final c2a a;
    public final ovi b;
    public final dq4 c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ny8 e;

    public mvi(c2a c2aVar, ovi oviVar, tv9 tv9Var, yt4 yt4Var, ny8 ny8Var) {
        this.a = c2aVar;
        this.b = oviVar;
        this.c = cqk.a(lvb.x0(wk8.a(), tv9Var.a).u0(yt4Var));
        this.e = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object a(mvi mviVar, wui wuiVar, d1e d1eVar, hvd hvdVar, nq4 nq4Var) {
        ivi iviVar;
        wui wuiVar2;
        xui xuiVar;
        d1e d1eVar2;
        hvd hvdVar2;
        Object poeVar;
        if (nq4Var instanceof ivi) {
            iviVar = (ivi) nq4Var;
            int i = iviVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                iviVar.j = i - Integer.MIN_VALUE;
            } else {
                iviVar = new ivi(mviVar, nq4Var);
            }
        } else {
            iviVar = new ivi(mviVar, nq4Var);
        }
        ivi iviVar2 = iviVar;
        Object objV = iviVar2.h;
        int i2 = iviVar2.j;
        if (i2 == 0) {
            ch3.d0(objV);
            xui xuiVar2 = wuiVar.a;
            ku6.B(wuiVar.e);
            lbh lbhVar = new lbh(mviVar, wuiVar, xuiVar2, d1eVar, new vfe(), hvdVar, 2);
            iviVar2.d = wuiVar;
            iviVar2.e = d1eVar;
            iviVar2.f = hvdVar;
            iviVar2.g = xuiVar2;
            iviVar2.j = 1;
            objV = qyj.V(k66.a, lbhVar, iviVar2);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
            wuiVar2 = wuiVar;
            xuiVar = xuiVar2;
            d1eVar2 = d1eVar;
            hvdVar2 = hvdVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xui xuiVar3 = iviVar2.g;
            hvdVar2 = iviVar2.f;
            d1e d1eVar3 = iviVar2.e;
            wui wuiVar3 = iviVar2.d;
            ch3.d0(objV);
            xuiVar = xuiVar3;
            d1eVar2 = d1eVar3;
            wuiVar2 = wuiVar3;
        }
        xzh xzhVar = (xzh) objV;
        if (hvdVar2 != null) {
            hvdVar2.a(100.0f);
        }
        if (xzhVar == null || !xzhVar.a) {
            throw new VideoConverterException("failed to convert video");
        }
        String str = wuiVar2.e;
        if (str == null) {
            ore.p("Required value was null.");
            return null;
        }
        try {
            poeVar = Long.valueOf(new File(str).length());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = 0L;
        }
        return m3m.b(wuiVar2, xzhVar, d1eVar2, xuiVar, ((Number) poeVar).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(mvi mviVar, wui wuiVar, d1e d1eVar, f4c f4cVar, nq4 nq4Var) throws Throwable {
        jvi jviVar;
        int i;
        CancellationException e;
        int i2;
        tt4 tt4Var;
        Object objE;
        wui wuiVar2;
        if (nq4Var instanceof jvi) {
            jviVar = (jvi) nq4Var;
            int i3 = jviVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jviVar.j = i3 - Integer.MIN_VALUE;
            } else {
                jviVar = new jvi(mviVar, nq4Var);
            }
        } else {
            jviVar = new jvi(mviVar, nq4Var);
        }
        Object objA = jviVar.h;
        int i4 = jviVar.j;
        Object obj = hu4.a;
        if (i4 != 0) {
            try {
                if (i4 == 1) {
                    int i5 = jviVar.g;
                    i = jviVar.f;
                    wui wuiVar3 = jviVar.d;
                    try {
                        ch3.d0(objA);
                        i2 = i5;
                        wuiVar = wuiVar3;
                        try {
                            wuiVar2 = (wui) objA;
                            jviVar.d = wuiVar;
                            jviVar.e = wuiVar2;
                            jviVar.f = i;
                            jviVar.g = i2;
                            jviVar.j = 2;
                            if (c(mviVar, wuiVar2, jviVar) == obj) {
                                return wuiVar2;
                            }
                        } catch (CancellationException e2) {
                            e = e2;
                            ku6.B(wuiVar.e);
                            xui xuiVar = wuiVar.a;
                            jviVar.d = null;
                            jviVar.e = e;
                            jviVar.f = i;
                            jviVar.g = 0;
                            jviVar.j = 3;
                            tt4Var = (xf5) mviVar.d.remove(xuiVar);
                            if (tt4Var != null) {
                                ((up8) tt4Var).r(new CancellationException("remove"));
                            }
                            objE = mviVar.e(xuiVar, jviVar);
                            if (objE != obj) {
                                objE = sbi.a;
                            }
                            if (objE != obj) {
                                throw e;
                            }
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        wuiVar = wuiVar3;
                    }
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        CancellationException cancellationException = (CancellationException) jviVar.e;
                        ch3.d0(objA);
                        throw cancellationException;
                    }
                    int i6 = jviVar.f;
                    wui wuiVar4 = (wui) jviVar.e;
                    wui wuiVar5 = jviVar.d;
                    try {
                        ch3.d0(objA);
                        return wuiVar4;
                    } catch (CancellationException e4) {
                        i = i6;
                        wuiVar = wuiVar5;
                        e = e4;
                    }
                }
            } catch (Throwable th) {
                th = th;
                wuiVar = f4cVar;
                ku6.B(wuiVar.e);
                throw th;
            }
            ku6.B(wuiVar.e);
            xui xuiVar2 = wuiVar.a;
            jviVar.d = null;
            jviVar.e = e;
            jviVar.f = i;
            jviVar.g = 0;
            jviVar.j = 3;
            tt4Var = (xf5) mviVar.d.remove(xuiVar2);
            if (tt4Var != null) {
                ((up8) tt4Var).r(new CancellationException("remove"));
            }
            objE = mviVar.e(xuiVar2, jviVar);
            if (objE != obj) {
                objE = sbi.a;
            }
            if (objE != obj) {
                throw e;
            }
        } else {
            ch3.d0(objA);
            try {
                try {
                    jviVar.d = wuiVar;
                    jviVar.f = 0;
                    jviVar.g = 0;
                    jviVar.j = 1;
                    objA = a(mviVar, wuiVar, d1eVar, f4cVar, jviVar);
                    if (objA != obj) {
                        i = 0;
                        i2 = 0;
                        wuiVar = wuiVar;
                        wuiVar2 = (wui) objA;
                        jviVar.d = wuiVar;
                        jviVar.e = wuiVar2;
                        jviVar.f = i;
                        jviVar.g = i2;
                        jviVar.j = 2;
                        if (c(mviVar, wuiVar2, jviVar) == obj) {
                            return wuiVar2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ku6.B(wuiVar.e);
                    throw th;
                }
            } catch (CancellationException e5) {
                e = e5;
                i = 0;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(mvi mviVar, wui wuiVar, nq4 nq4Var) {
        kvi kviVar;
        if (nq4Var instanceof kvi) {
            kviVar = (kvi) nq4Var;
            int i = kviVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                kviVar.g = i - Integer.MIN_VALUE;
            } else {
                kviVar = new kvi(mviVar, nq4Var);
            }
        } else {
            kviVar = new kvi(mviVar, nq4Var);
        }
        Object obj = kviVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = kviVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                ovi oviVar = mviVar.b;
                kviVar.d = wuiVar;
                kviVar.g = 1;
                if (oviVar.b(wuiVar, kviVar) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wuiVar = kviVar.d;
                ch3.d0(obj);
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str = f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "putConversionInRepository: failed, videoConversion=" + wuiVar, th);
                }
            }
            throw th;
        }
    }

    public final void d() throws Throwable {
        String str = f;
        gm0.n(str, "clear: started");
        vd7.f(this.c.a, new CancellationException("clear"));
        gm0.n(str, "clear: jobs cancelled");
        yab.A0(k66.a, new fpf(this, null, 17));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(xui xuiVar, nq4 nq4Var) {
        lvi lviVar;
        String str = f;
        if (nq4Var instanceof lvi) {
            lviVar = (lvi) nq4Var;
            int i = lviVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lviVar.g = i - Integer.MIN_VALUE;
            } else {
                lviVar = new lvi(this, nq4Var);
            }
        } else {
            lviVar = new lvi(this, nq4Var);
        }
        Object obj = lviVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = lviVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                ovi oviVar = this.b;
                lviVar.d = xuiVar;
                lviVar.g = 1;
                if (oviVar.c(xuiVar, lviVar) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xuiVar = lviVar.d;
                ch3.d0(obj);
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "removeFromRepository: success, conversionData = " + xuiVar, null);
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str, "removeFromRepository: failed conversionData = " + xuiVar, th);
                }
            }
        }
        return sbi.a;
    }
}
