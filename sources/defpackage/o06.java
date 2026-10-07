package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o06 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p26 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o06(p26 p26Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = p26Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        p26 p26Var = this.f;
        switch (i) {
            case 0:
                return new o06(p26Var, lq4Var, 0);
            case 1:
                return new o06(p26Var, lq4Var, 1);
            case 2:
                return new o06(p26Var, lq4Var, 2);
            default:
                return new o06(p26Var, lq4Var, 3);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((o06) create((s16) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((o06) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((o06) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((o06) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0191  */
    /* JADX WARN: Code duplicated, block: B:108:0x01af  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:120:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0200  */
    /* JADX WARN: Code duplicated, block: B:136:0x025f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0267  */
    /* JADX WARN: Code duplicated, block: B:140:0x028f  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:197:0x03df  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:201:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:211:0x0420 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0422  */
    /* JADX WARN: Code duplicated, block: B:218:0x0439  */
    /* JADX WARN: Code duplicated, block: B:220:0x0461  */
    /* JADX WARN: Code duplicated, block: B:226:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:229:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:233:0x04ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:237:0x0520  */
    /* JADX WARN: Code duplicated, block: B:238:0x0526  */
    /* JADX WARN: Code duplicated, block: B:240:0x053a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0540  */
    /* JADX WARN: Code duplicated, block: B:243:0x055e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0564  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long j;
        Object poeVar;
        p26 p26Var;
        Throwable thA;
        je9 je9Var;
        w2b w2bVar;
        p26 p26Var2;
        float fFloatValue;
        float f;
        float fK;
        mjg mjgVar;
        Object value;
        p26 p26Var3;
        String str;
        rui ruiVar;
        p26 p26Var4;
        String str2;
        a4c a4cVar;
        je9 je9Var2;
        String str3;
        a4c a4cVar2;
        String str4;
        a4c a4cVar3;
        String str5;
        a4c a4cVar4;
        String str6;
        a4c a4cVar5;
        int i;
        je9 je9Var3;
        long j2;
        boolean z;
        Long l;
        long jLongValue;
        long jS;
        long jL;
        p26 p26Var5;
        ic6 ic6Var;
        Object value2;
        e16 e16Var;
        fvi fviVar;
        float f2;
        float fK2;
        float f3;
        mjg mjgVar2;
        Object value3;
        mjg mjgVar3;
        Object value4;
        long j3;
        String str7;
        a4c a4cVar6;
        je9 je9Var4;
        String path;
        Object poeVar2;
        boolean zBooleanValue;
        Object poeVar3;
        boolean z2;
        Object value5;
        Object objA;
        Object value6;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                p26 p26Var6 = this.f;
                a8j.x(p26Var6.F1, new x06(((Number) p26Var6.w1.getValue()).floatValue(), ((Number) p26Var6.y1.getValue()).floatValue()));
                return sbi.a;
            case 1:
                je9 je9Var5 = je9.f;
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                kb9 kb9VarJ = this.f.J();
                if (kb9VarJ != null) {
                    y16 y16Var = new y16(kb9VarJ, 2);
                    mjg mjgVar4 = this.f.G1;
                    mjgVar4.getClass();
                    mjgVar4.j(null, y16Var);
                    p26 p26Var7 = this.f;
                    try {
                        try {
                            Uri uriM = l21.m(kb9VarJ.b.toString());
                            Context contextG = p26Var7.G();
                            if (uriM != null) {
                                mf5 mf5VarE = y3m.e(contextG, uriM, np0.o);
                                j = mf5VarE.a;
                                try {
                                    mjg mjgVar5 = p26Var7.K;
                                    while (true) {
                                        Object value7 = mjgVar5.getValue();
                                        Object objA2 = (f16) value7;
                                        if (objA2 instanceof e16) {
                                            e16 e16Var2 = (e16) objA2;
                                            kb9 kb9Var = ((e16) objA2).a;
                                            je9Var5 = je9Var5;
                                            try {
                                                Long l2 = new Long(mf5VarE.a);
                                                Point point = (Point) mf5VarE.d;
                                                objA2 = e16.a(e16Var2, kb9.a(kb9Var, null, l2, point.x, point.y, 1599), null, null, 6);
                                            } catch (Throwable th) {
                                                th = th;
                                                poeVar = new poe(th);
                                            }
                                        } else {
                                            je9Var5 = je9Var5;
                                        }
                                        if (mjgVar5.h(value7, objA2)) {
                                            String string = kb9VarJ.b.toString();
                                            Point point2 = (Point) mf5VarE.d;
                                            List listSingletonList = Collections.singletonList(new v2b(point2.x, string, point2.y, mf5VarE.b));
                                            long j4 = mf5VarE.a;
                                            fvi fviVarA = qrk.a(h1h.b(kb9VarJ));
                                            boolean z3 = fviVarA != null ? fviVarA.e : false;
                                            long j5 = kb9VarJ.a;
                                            Point point3 = (Point) mf5VarE.d;
                                            poeVar = new w2b(listSingletonList, null, j5, j4, z3, point3.x, point3.y, 1, null);
                                            p26Var = this.f;
                                            thA = roe.a(poeVar);
                                            if (thA != null) {
                                                str5 = p26Var.j;
                                                a4cVar4 = gm0.f;
                                                if (a4cVar4 == null) {
                                                    je9Var = je9Var5;
                                                } else {
                                                    je9Var = je9Var5;
                                                    if (a4cVar4.b(je9Var)) {
                                                        a4cVar4.c(je9Var, str5, "fetchVideo failed", thA);
                                                    }
                                                }
                                            } else {
                                                je9Var = je9Var5;
                                            }
                                            if (poeVar instanceof poe) {
                                                poeVar = null;
                                            }
                                            w2bVar = (w2b) poeVar;
                                            p26Var2 = this.f;
                                            if (j <= 0) {
                                                str4 = p26Var2.j;
                                                a4cVar3 = gm0.f;
                                                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                                    a4cVar3.c(je9Var, str4, zo5.j(j, "video duration is: "), null);
                                                }
                                                a8j.x(this.f.F1, new q06(new tnh(R.string.video_not_found_error)));
                                            } else {
                                                if (j <= 0) {
                                                    str3 = p26Var2.j;
                                                    a4cVar2 = gm0.f;
                                                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                                        a4cVar2.c(je9Var, str3, zo5.j(j, "capTrimToMaxDuration: "), null);
                                                    }
                                                } else {
                                                    fFloatValue = ((Number) p26Var2.w1.getValue()).floatValue();
                                                    f = j;
                                                    if (Math.abs(((Number) p26Var2.y1.getValue()).floatValue() - fFloatValue) * f > p26Var2.K()) {
                                                        fK = (p26Var2.K() / f) + fFloatValue;
                                                        mjgVar = p26Var2.y1;
                                                        do {
                                                            value = mjgVar.getValue();
                                                            ((Number) value).floatValue();
                                                        } while (!mjgVar.h(value, Float.valueOf(fK)));
                                                        a8j.x(p26Var2.F1, new x06(fFloatValue, fK));
                                                    }
                                                }
                                                ghb ghbVar = ew5.b;
                                                if (ew5.s(qe7.P(j, lw5.MILLISECONDS), lw5.MINUTES) > this.f.L()) {
                                                    p26Var4 = this.f;
                                                    str2 = p26Var4.j;
                                                    a4cVar = gm0.f;
                                                    if (a4cVar != null) {
                                                        je9Var2 = je9.d;
                                                        if (a4cVar.b(je9Var2)) {
                                                            a4cVar.c(je9Var2, str2, c0a.m(p26Var4.L(), ", closing", qt4.s(j, "video duration is ", ", maxVideoDuration: ")), null);
                                                        }
                                                    }
                                                    p26 p26Var8 = this.f;
                                                    a8j.x(p26Var8.F1, new q06(new vnh(R.string.stories_max_allowed_video_duration, a.n1(new Object[]{new Long(p26Var8.L())}))));
                                                } else {
                                                    if (w2bVar == null) {
                                                        a8j.x(this.f.F1, new r06(5, true));
                                                    }
                                                    mjg mjgVar6 = this.f.G1;
                                                    y16 y16Var2 = new y16(y16Var.a, w2bVar);
                                                    mjgVar6.getClass();
                                                    mjgVar6.j(null, y16Var2);
                                                    p26Var3 = this.f;
                                                    str = p26Var3.j;
                                                    ruiVar = ((y16) p26Var3.H1.a.getValue()).b;
                                                    if (ruiVar == null) {
                                                        gm0.n(str, "Can't prepare frame loading for preview because videoContent is null");
                                                    } else if (cqk.d(((lc7) p26Var3.l.getValue()).getData().a, ruiVar)) {
                                                        gm0.n(str, "Same video content, don't need to prepareFrames");
                                                    } else {
                                                        ((lc7) p26Var3.l.getValue()).c(new jc7(ruiVar, 6));
                                                        if (((lc7) p26Var3.l.getValue()).a()) {
                                                            ((lc7) p26Var3.l.getValue()).prepare();
                                                            p26Var3.Y.updateAndGet(new h53(1));
                                                        } else {
                                                            gm0.n(str, "Can't load frame for preview because can't extract frame");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            je9Var5 = je9Var5;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    je9Var5 = je9Var5;
                                }
                            } else {
                                try {
                                    throw new IllegalArgumentException("Required value was null.");
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    j = 0;
                    poeVar = new poe(th);
                    p26Var = this.f;
                    thA = roe.a(poeVar);
                    if (thA != null) {
                        str5 = p26Var.j;
                        a4cVar4 = gm0.f;
                        if (a4cVar4 == null) {
                            je9Var = je9Var5;
                        } else {
                            je9Var = je9Var5;
                            if (a4cVar4.b(je9Var)) {
                                a4cVar4.c(je9Var, str5, "fetchVideo failed", thA);
                            }
                        }
                    } else {
                        je9Var = je9Var5;
                    }
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    w2bVar = (w2b) poeVar;
                    p26Var2 = this.f;
                    if (j <= 0) {
                        str4 = p26Var2.j;
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            a4cVar3.c(je9Var, str4, zo5.j(j, "video duration is: "), null);
                        }
                        a8j.x(this.f.F1, new q06(new tnh(R.string.video_not_found_error)));
                    } else {
                        if (j <= 0) {
                            str3 = p26Var2.j;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str3, zo5.j(j, "capTrimToMaxDuration: "), null);
                            }
                        } else {
                            fFloatValue = ((Number) p26Var2.w1.getValue()).floatValue();
                            f = j;
                            if (Math.abs(((Number) p26Var2.y1.getValue()).floatValue() - fFloatValue) * f > p26Var2.K()) {
                                fK = (p26Var2.K() / f) + fFloatValue;
                                mjgVar = p26Var2.y1;
                                do {
                                    value = mjgVar.getValue();
                                    ((Number) value).floatValue();
                                } while (!mjgVar.h(value, Float.valueOf(fK)));
                                a8j.x(p26Var2.F1, new x06(fFloatValue, fK));
                            }
                        }
                        ghb ghbVar2 = ew5.b;
                        if (ew5.s(qe7.P(j, lw5.MILLISECONDS), lw5.MINUTES) > this.f.L()) {
                            p26Var4 = this.f;
                            str2 = p26Var4.j;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9Var2 = je9.d;
                                if (a4cVar.b(je9Var2)) {
                                    a4cVar.c(je9Var2, str2, c0a.m(p26Var4.L(), ", closing", qt4.s(j, "video duration is ", ", maxVideoDuration: ")), null);
                                }
                            }
                            p26 p26Var9 = this.f;
                            a8j.x(p26Var9.F1, new q06(new vnh(R.string.stories_max_allowed_video_duration, a.n1(new Object[]{new Long(p26Var9.L())}))));
                        } else {
                            if (w2bVar == null) {
                                a8j.x(this.f.F1, new r06(5, true));
                            }
                            mjg mjgVar7 = this.f.G1;
                            y16 y16Var3 = new y16(y16Var.a, w2bVar);
                            mjgVar7.getClass();
                            mjgVar7.j(null, y16Var3);
                            p26Var3 = this.f;
                            str = p26Var3.j;
                            ruiVar = ((y16) p26Var3.H1.a.getValue()).b;
                            if (ruiVar == null) {
                                gm0.n(str, "Can't prepare frame loading for preview because videoContent is null");
                            } else if (cqk.d(((lc7) p26Var3.l.getValue()).getData().a, ruiVar)) {
                                gm0.n(str, "Same video content, don't need to prepareFrames");
                            } else {
                                ((lc7) p26Var3.l.getValue()).c(new jc7(ruiVar, 6));
                                if (((lc7) p26Var3.l.getValue()).a()) {
                                    gm0.n(str, "Can't load frame for preview because can't extract frame");
                                } else {
                                    ((lc7) p26Var3.l.getValue()).prepare();
                                    p26Var3.Y.updateAndGet(new h53(1));
                                }
                            }
                        }
                    }
                }
                return sbiVar;
            case 2:
                jb9 jb9Var = jb9.d;
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                kb9 kb9VarJ2 = this.f.J();
                if (kb9VarJ2 != null) {
                    Context contextG2 = this.f.G();
                    Uri uri = kb9VarJ2.b;
                    String scheme = uri.getScheme();
                    if (scheme != null) {
                        int iHashCode = scheme.hashCode();
                        j2 = 0;
                        if (iHashCode != 3143036) {
                            if (iHashCode == 951530617 && scheme.equals("content")) {
                                try {
                                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contextG2.getContentResolver().openFileDescriptor(uri, "r");
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    poeVar3 = Boolean.valueOf(z2);
                                } catch (Throwable th5) {
                                    poeVar3 = new poe(th5);
                                }
                                Object obj2 = Boolean.FALSE;
                                if (poeVar3 instanceof poe) {
                                    poeVar3 = obj2;
                                }
                                zBooleanValue = ((Boolean) poeVar3).booleanValue();
                                z = zBooleanValue;
                            }
                        } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                            File file = new File(path);
                            try {
                                poeVar2 = Boolean.valueOf(file.exists() && file.canRead());
                            } catch (Throwable th6) {
                                poeVar2 = new poe(th6);
                            }
                            Object obj3 = Boolean.FALSE;
                            if (poeVar2 instanceof poe) {
                                poeVar2 = obj3;
                            }
                            zBooleanValue = ((Boolean) poeVar2).booleanValue();
                            z = zBooleanValue;
                        }
                        if (!z) {
                            str6 = this.f.j;
                            a4cVar5 = gm0.f;
                            if (a4cVar5 != null) {
                                je9Var3 = je9.f;
                                if (a4cVar5.b(je9Var3)) {
                                    a4cVar5.c(je9Var3, str6, "Story editor: local uri is not valid", null);
                                }
                            }
                            if ((kb9VarJ2 != null ? kb9VarJ2.l : null) == jb9Var) {
                                i = R.string.video_not_found_error;
                            } else {
                                i = R.string.file_deleted;
                            }
                            a8j.x(this.f.F1, new q06(new tnh(i)));
                        } else if (kb9VarJ2.l == jb9Var) {
                            l = kb9VarJ2.g;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = j2;
                            }
                            ghb ghbVar3 = ew5.b;
                            jS = ew5.s(qe7.P(jLongValue, lw5.MILLISECONDS), lw5.MINUTES);
                            jL = this.f.L();
                            p26Var5 = this.f;
                            ic6Var = p26Var5.F1;
                            if (jS > jL) {
                                a8j.x(ic6Var, new q06(new vnh(R.string.stories_max_allowed_video_duration, a.n1(new Object[]{new Long(p26Var5.L())}))));
                            } else {
                                a8j.x(ic6Var, new r06(4, true));
                                this.f.T(4);
                                value2 = this.f.X.a.getValue();
                                if (value2 instanceof e16) {
                                    e16Var = (e16) value2;
                                } else {
                                    e16Var = null;
                                }
                                if (e16Var != null) {
                                    fviVar = e16Var.b;
                                } else {
                                    fviVar = null;
                                }
                                if (fviVar != null) {
                                    f2 = fviVar.b;
                                } else {
                                    f2 = 0.0f;
                                }
                                if (fviVar != null) {
                                    fK2 = fviVar.c;
                                } else {
                                    fK2 = 1.0f;
                                }
                                f3 = jLongValue;
                                if (Math.abs(fK2 - f2) * f3 > this.f.K() && jLongValue > j2) {
                                    fK2 = (this.f.K() / f3) + f2;
                                }
                                mjgVar2 = this.f.w1;
                                do {
                                    value3 = mjgVar2.getValue();
                                    ((Number) value3).floatValue();
                                } while (!mjgVar2.h(value3, new Float(f2)));
                                mjgVar3 = this.f.y1;
                                do {
                                    value4 = mjgVar3.getValue();
                                    ((Number) value4).floatValue();
                                } while (!mjgVar3.h(value4, new Float(fK2)));
                                p26 p26Var10 = this.f;
                                j3 = kb9VarJ2.a;
                                str7 = p26Var10.j;
                                a4cVar6 = gm0.f;
                                if (a4cVar6 != null) {
                                    je9Var4 = je9.d;
                                    if (a4cVar6.b(je9Var4)) {
                                        a4cVar6.c(je9Var4, str7, zo5.j(j3, "fetchVideo: localId: "), null);
                                    }
                                }
                                p26Var10.w.B(p26Var10, p26.W1[1], yab.h0(p26Var10.b, ((n0c) p26Var10.H()).b(), 2, new o06(p26Var10, null, 1)));
                            }
                        } else {
                            mjg mjgVar8 = this.f.G1;
                            y16 y16Var4 = new y16((kb9) null, 3);
                            mjgVar8.getClass();
                            mjgVar8.j(null, y16Var4);
                        }
                    } else {
                        j2 = 0;
                    }
                    z = false;
                    if (!z) {
                        str6 = this.f.j;
                        a4cVar5 = gm0.f;
                        if (a4cVar5 != null) {
                            je9Var3 = je9.f;
                            if (a4cVar5.b(je9Var3)) {
                                a4cVar5.c(je9Var3, str6, "Story editor: local uri is not valid", null);
                            }
                        }
                        if ((kb9VarJ2 != null ? kb9VarJ2.l : null) == jb9Var) {
                            i = R.string.video_not_found_error;
                        } else {
                            i = R.string.file_deleted;
                        }
                        a8j.x(this.f.F1, new q06(new tnh(i)));
                    } else if (kb9VarJ2.l == jb9Var) {
                        l = kb9VarJ2.g;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = j2;
                        }
                        ghb ghbVar4 = ew5.b;
                        jS = ew5.s(qe7.P(jLongValue, lw5.MILLISECONDS), lw5.MINUTES);
                        jL = this.f.L();
                        p26Var5 = this.f;
                        ic6Var = p26Var5.F1;
                        if (jS > jL) {
                            a8j.x(ic6Var, new q06(new vnh(R.string.stories_max_allowed_video_duration, a.n1(new Object[]{new Long(p26Var5.L())}))));
                        } else {
                            a8j.x(ic6Var, new r06(4, true));
                            this.f.T(4);
                            value2 = this.f.X.a.getValue();
                            if (value2 instanceof e16) {
                                e16Var = (e16) value2;
                            } else {
                                e16Var = null;
                            }
                            if (e16Var != null) {
                                fviVar = e16Var.b;
                            } else {
                                fviVar = null;
                            }
                            if (fviVar != null) {
                                f2 = fviVar.b;
                            } else {
                                f2 = 0.0f;
                            }
                            if (fviVar != null) {
                                fK2 = fviVar.c;
                            } else {
                                fK2 = 1.0f;
                            }
                            f3 = jLongValue;
                            if (Math.abs(fK2 - f2) * f3 > this.f.K()) {
                                fK2 = (this.f.K() / f3) + f2;
                            }
                            mjgVar2 = this.f.w1;
                            do {
                                value3 = mjgVar2.getValue();
                                ((Number) value3).floatValue();
                            } while (!mjgVar2.h(value3, new Float(f2)));
                            mjgVar3 = this.f.y1;
                            do {
                                value4 = mjgVar3.getValue();
                                ((Number) value4).floatValue();
                            } while (!mjgVar3.h(value4, new Float(fK2)));
                            p26 p26Var11 = this.f;
                            j3 = kb9VarJ2.a;
                            str7 = p26Var11.j;
                            a4cVar6 = gm0.f;
                            if (a4cVar6 != null) {
                                je9Var4 = je9.d;
                                if (a4cVar6.b(je9Var4)) {
                                    a4cVar6.c(je9Var4, str7, zo5.j(j3, "fetchVideo: localId: "), null);
                                }
                            }
                            p26Var11.w.B(p26Var11, p26.W1[1], yab.h0(p26Var11.b, ((n0c) p26Var11.H()).b(), 2, new o06(p26Var11, null, 1)));
                        }
                    } else {
                        mjg mjgVar9 = this.f.G1;
                        y16 y16Var5 = new y16((kb9) null, 3);
                        mjgVar9.getClass();
                        mjgVar9.j(null, y16Var5);
                    }
                    break;
                } else {
                    str6 = this.f.j;
                    a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        je9Var3 = je9.f;
                        if (a4cVar5.b(je9Var3)) {
                            a4cVar5.c(je9Var3, str6, "Story editor: local uri is not valid", null);
                        }
                    }
                    if ((kb9VarJ2 != null ? kb9VarJ2.l : null) == jb9Var) {
                        i = R.string.video_not_found_error;
                    } else {
                        i = R.string.file_deleted;
                    }
                    a8j.x(this.f.F1, new q06(new tnh(i)));
                }
                return sbiVar2;
            default:
                sbi sbiVar3 = sbi.a;
                ch3.d0(obj);
                Object value8 = this.f.X.a.getValue();
                e16 e16Var3 = value8 instanceof e16 ? (e16) value8 : null;
                if (e16Var3 != null) {
                    fvi fviVar2 = e16Var3.b;
                    boolean z4 = fviVar2 != null ? fviVar2.e : false;
                    boolean z5 = !z4;
                    tnh tnhVar = !z4 ? new tnh(R.string.oneme_stories_sound_off) : new tnh(R.string.oneme_stories_sound_on);
                    int i2 = !z4 ? R.drawable.icon_sound_crossed_fill : R.drawable.icon_sound_fill;
                    a70 a70Var = new a70(1);
                    a70Var.e = z5;
                    fvi fviVar3 = new fvi(a70Var);
                    mjg mjgVar10 = this.f.K;
                    do {
                        value5 = mjgVar10.getValue();
                        objA = (f16) value5;
                        if (objA instanceof e16) {
                            objA = e16.a((e16) objA, null, fviVar3, null, 5);
                        }
                    } while (!mjgVar10.h(value5, objA));
                    a8j.x(this.f.F1, new z06(tnhVar, new Integer(i2), null, 12));
                    Object value9 = this.f.r1.getValue();
                    m16 m16Var = value9 instanceof m16 ? (m16) value9 : null;
                    p26 p26Var12 = this.f;
                    if (m16Var == null) {
                        String str8 = p26Var12.j;
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null) {
                            je9 je9Var6 = je9.d;
                            if (a4cVar7.b(je9Var6)) {
                                a4cVar7.c(je9Var6, str8, "onMuteClick: nothing to apply, mute button is not visible now", null);
                            }
                        }
                    } else {
                        int i3 = !z4 ? R.drawable.icon_sound_crossed : R.drawable.icon_sound;
                        mjg mjgVar11 = p26Var12.r1;
                        do {
                            value6 = mjgVar11.getValue();
                        } while (!mjgVar11.h(value6, new m16(m16Var.a, i3)));
                    }
                }
                return sbiVar3;
        }
    }
}
