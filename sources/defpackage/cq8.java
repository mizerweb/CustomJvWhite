package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class cq8 {
    public final ny8 a;
    public final ny8 b;
    public final String c = cq8.class.getName();

    public cq8(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa A[LOOP:1: B:58:0x00e4->B:62:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[LOOP:0: B:55:0x00ca->B:65:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, nq4 nq4Var) {
        bq8 bq8Var;
        st2 st2Var;
        String str2;
        m8b m8bVar;
        Long l;
        b93 b93Var;
        String str3;
        a4c a4cVar;
        je9 je9Var;
        long[] jArr;
        long[] jArr2;
        int length;
        int i;
        long j;
        int i2;
        int i3;
        String str4 = str;
        if (nq4Var instanceof bq8) {
            bq8Var = (bq8) nq4Var;
            int i4 = bq8Var.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bq8Var.h = i4 - Integer.MIN_VALUE;
            } else {
                bq8Var = new bq8(this, nq4Var);
            }
        } else {
            bq8Var = new bq8(this, nq4Var);
        }
        Object poeVar = bq8Var.f;
        hu4 hu4Var = hu4.a;
        int i5 = bq8Var.h;
        int i6 = 3;
        try {
            if (i5 == 0) {
                ch3.d0(poeVar);
                if (str4 == null || r5h.X0(str4)) {
                    gm0.Y(cq8.class.getName(), "link or chatAccessToken must not be null");
                    return null;
                }
                pvb pvbVar = (pvb) this.a.getValue();
                wy2 wy2Var = new wy2(kfc.F1, i6);
                if (str4 != null && str4.length() != 0) {
                    wy2Var.h("link", str4);
                }
                bq8Var.d = str4;
                bq8Var.h = 1;
                poeVar = pvbVar.D(wy2Var, bq8Var);
                if (poeVar != hu4Var) {
                }
                return hu4Var;
            }
            if (i5 == 1) {
                str4 = bq8Var.d;
                ch3.d0(poeVar);
            } else {
                if (i5 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                st2Var = bq8Var.e;
                str2 = bq8Var.d;
                ch3.d0(poeVar);
            }
            m8bVar = (m8b) poeVar;
            if (!m8bVar.j()) {
                m8bVar = null;
            }
            if (m8bVar != null) {
                jArr = m8bVar.b;
                jArr2 = m8bVar.a;
                length = jArr2.length - 2;
                if (length >= 0) {
                    i = 0;
                    loop0: while (true) {
                        j = jArr2[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            i2 = 8 - ((~(i - length)) >>> 31);
                            for (i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    l = new Long(jArr[(i << 3) + i3]);
                                    break loop0;
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                ore.f("The LongSet is empty");
                return null;
            }
            l = null;
            if (l == null) {
                return (st2Var.D > 0 || (b93Var = st2Var.r) == null || !b93Var.m) ? new zp8(l.longValue()) : new xp8(l.longValue());
            }
            str3 = this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.g;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, ewi.d(st2Var.a, "Failed to store chat after successful join. Chat serverId=", ", link=", str2), null);
                }
            }
            return new wp8("Failed to save chat locally");
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        sz2 sz2Var = (sz2) (poeVar instanceof poe ? null : poeVar);
        Throwable thA = roe.a(poeVar);
        if (sz2Var == null) {
            String str5 = this.c;
            if (thA == null) {
                gm0.Y(str5, "response is null, exception is null");
                return null;
            }
            gm0.V(str5, "join chat exception", thA);
            if (thA instanceof TamErrorException) {
                TamErrorException tamErrorException = (TamErrorException) thA;
                boolean zD = cqk.d(tamErrorException.a.b, "error.user.restricted.join");
                yhh yhhVar = tamErrorException.a;
                return zD ? new yp8(yhhVar.c) : new wp8(yhhVar.c);
            }
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            return new wp8(message);
        }
        st2 st2Var2 = sz2Var.c;
        xn3 xn3Var = (xn3) this.b.getValue();
        List listSingletonList = Collections.singletonList(st2Var2);
        bq8Var.d = str4;
        bq8Var.e = st2Var2;
        bq8Var.h = 2;
        Object objW = xn3Var.w(listSingletonList, bq8Var);
        if (objW != hu4Var) {
            String str6 = str4;
            st2Var = st2Var2;
            poeVar = objW;
            str2 = str6;
            m8bVar = (m8b) poeVar;
            if (!m8bVar.j()) {
                m8bVar = null;
            }
            if (m8bVar != null) {
                jArr = m8bVar.b;
                jArr2 = m8bVar.a;
                length = jArr2.length - 2;
                if (length >= 0) {
                    i = 0;
                    loop0: while (true) {
                        j = jArr2[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            i2 = 8 - ((~(i - length)) >>> 31);
                            while (i3 < i2) {
                                if ((255 & j) < 128) {
                                    l = new Long(jArr[(i << 3) + i3]);
                                    break loop0;
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                ore.f("The LongSet is empty");
                return null;
            }
            l = null;
            if (l == null) {
                if (st2Var.D > 0) {
                }
            }
            str3 = this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.g;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str3, ewi.d(st2Var.a, "Failed to store chat after successful join. Chat serverId=", ", link=", str2), null);
                }
            }
            return new wp8("Failed to save chat locally");
        }
        return hu4Var;
    }
}
