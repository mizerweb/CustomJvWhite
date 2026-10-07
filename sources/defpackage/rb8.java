package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class rb8 implements gu4 {
    public static final String u = rb8.class.getSimpleName();
    public final /* synthetic */ dq4 a;
    public final Context b;
    public final yt4 c;
    public final xhh d;
    public final ContentResolver e;
    public final ny8 f;
    public final mjg g;
    public final tm6 h;
    public final mjg i;
    public final mjg j;
    public final tm6 k;
    public final mjg l;
    public final j3 m;
    public final AtomicInteger n;
    public sgg o;
    public final AtomicInteger p;
    public final ConcurrentHashMap q;
    public final ConcurrentHashMap r;
    public sgg s;
    public final Object t;

    public rb8(Context context, yt4 yt4Var, xhh xhhVar, ny8 ny8Var) {
        this.a = cqk.a(lvb.x0(wk8.a(), ((n0c) xhhVar).b()));
        this.b = context;
        this.c = yt4Var;
        this.d = xhhVar;
        this.e = context.getContentResolver();
        this.f = ny8Var;
        mjg mjgVarA = p90.a(new nh7(jh7.a, 0, false, true));
        this.g = mjgVarA;
        this.h = new tm6(new r8e(mjgVarA), 1);
        this.i = p90.a(new nh7(kh7.a, 0, false, false));
        mjg mjgVarA2 = p90.a(new nh7(ih7.a, 0, false, true));
        this.j = mjgVarA2;
        this.k = new tm6(new r8e(mjgVarA2), 2);
        mjg mjgVarA3 = p90.a(null);
        this.l = mjgVarA3;
        this.m = new j3(new jz(mjgVarA3, 13), 22, this);
        this.n = new AtomicInteger(0);
        this.p = new AtomicInteger(-1);
        this.q = new ConcurrentHashMap();
        this.r = new ConcurrentHashMap();
        bb8 bb8Var = new bb8(this);
        Iterator it = xw3.P0(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI).iterator();
        while (it.hasNext()) {
            try {
                this.e.registerContentObserver((Uri) it.next(), true, bb8Var);
            } catch (Throwable th) {
                this.c.r0(k66.a, th);
            }
        }
        new qu(this, this.c, new pgg(this), this.d, new d2(24, this));
        this.t = new Object();
    }

    public static final ylc a(rb8 rb8Var, String str, Integer num) {
        Object next;
        Iterator it = sya.m.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((sya) next).a.equalsIgnoreCase(str));
        sya syaVar = (sya) next;
        if (syaVar == null) {
            syaVar = sya.UNKNOWN;
        }
        if (va8.$EnumSwitchMapping$0[syaVar.ordinal()] != 1) {
            return new ylc(str, iyg.e(str));
        }
        if (num != null && num.intValue() == 1) {
            return new ylc("image/*", jb9.b);
        }
        return (num != null && num.intValue() == 3) ? new ylc("video/*", jb9.d) : new ylc(str, jb9.a);
    }

    public static final ylc b(rb8 rb8Var, mh7 mh7Var, gh7 gh7Var, uw uwVar, boolean z) {
        rb8Var.getClass();
        String strE = mh7Var.e(gh7Var);
        String[] strArrA = mh7Var.a(gh7Var);
        String strD = gh7Var.d();
        String strF = gh7Var.f();
        String strW = z ? zo5.w(qv1.q("(", strD, " > ? OR (", strD, " = ? AND "), strF, " > ?))") : zo5.w(qv1.q("(", strD, " < ? OR (", strD, " = ? AND "), strF, " < ?))");
        String[] strArr = {String.valueOf(uwVar.a()), String.valueOf(uwVar.a()), String.valueOf(uwVar.b())};
        if (strE == null || r5h.X0(strE)) {
            strE = strW;
        } else if (!r5h.X0(strW)) {
            strE = nbh.w("(", strE, ") AND (", strW, ")");
        }
        if (strArrA == null) {
            strArrA = new String[0];
        }
        return new ylc(strE, (String[]) a.j1(strArrA, strArr));
    }

    public static final Object c(rb8 rb8Var, mh7 mh7Var, mdh mdhVar) {
        return yab.K0(((n0c) rb8Var.d).b(), new el6(mh7Var, rb8Var, null, 11), mdhVar);
    }

    public final void d() {
        sgg sggVar;
        synchronized (this.t) {
            try {
                gm0.n(u, "onContentChanged()");
                sgg sggVar2 = this.s;
                if (sggVar2 != null && sggVar2.isActive() && (sggVar = this.s) != null) {
                    sggVar.b(null);
                }
                this.s = yab.i0(this, this.c, 0, new gb8(0, null, this), 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        sgg sggVar = this.o;
        AtomicInteger atomicInteger = this.n;
        String str = u;
        if (sggVar != null) {
            int i = atomicInteger.get();
            sgg sggVar2 = this.o;
            Boolean boolValueOf = sggVar2 != null ? Boolean.valueOf(sggVar2.isActive()) : null;
            sgg sggVar3 = this.o;
            gm0.n(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + boolValueOf + ", prefetchJob.isCompleted = " + (sggVar3 != null ? Boolean.valueOf(sggVar3.W()) : null));
            return;
        }
        if (!((wsc) this.f.getValue()).f()) {
            gm0.n(str, "permission is not granted");
            return;
        }
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        gm0.n(str, "prefetch " + iIncrementAndGet + " start");
        sgg sggVarI0 = yab.i0(this, this.c, 0, new ab8(iIncrementAndGet, null, this), 2);
        sggVarI0.Y(new ta8(jElapsedRealtime, iIncrementAndGet));
        this.o = sggVarI0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r8 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.net.Uri r7, defpackage.nq4 r8) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jb8
            if (r0 == 0) goto L13
            r0 = r8
            jb8 r0 = (defpackage.jb8) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            jb8 r0 = new jb8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.ch3.d0(r8)
            goto L55
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r2
        L31:
            android.net.Uri r7 = r0.d
            defpackage.ch3.d0(r8)
            goto L46
        L37:
            defpackage.ch3.d0(r8)
            r0.d = r7
            r0.g = r4
            r8 = 0
            java.lang.Object r8 = r6.g(r7, r8, r0)
            if (r8 != r5) goto L46
            goto L54
        L46:
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 != 0) goto L57
            r0.d = r2
            r0.g = r3
            java.lang.Object r8 = r6.g(r7, r4, r0)
            if (r8 != r5) goto L55
        L54:
            return r5
        L55:
            java.lang.Long r8 = (java.lang.Long) r8
        L57:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb8.f(android.net.Uri, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Uri uri, boolean z, nq4 nq4Var) throws IOException {
        kb8 kb8Var;
        if (nq4Var instanceof kb8) {
            kb8Var = (kb8) nq4Var;
            int i = kb8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kb8Var.f = i - Integer.MIN_VALUE;
            } else {
                kb8Var = new kb8(this, nq4Var);
            }
        } else {
            kb8Var = new kb8(this, nq4Var);
        }
        Object objH = kb8Var.d;
        int i2 = kb8Var.f;
        if (i2 == 0) {
            ch3.d0(objH);
            kb8Var.f = 1;
            objH = h(uri, z, kb8Var);
            Object obj = hu4.a;
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        return (Long) objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Uri uri, boolean z, nq4 nq4Var) throws IOException {
        lb8 lb8Var;
        String string;
        Object poeVar;
        if (nq4Var instanceof lb8) {
            lb8Var = (lb8) nq4Var;
            int i = lb8Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                lb8Var.h = i - Integer.MIN_VALUE;
            } else {
                lb8Var = new lb8(this, nq4Var);
            }
        } else {
            lb8Var = new lb8(this, nq4Var);
        }
        Object obj = lb8Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = lb8Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            String scheme = uri.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode != 3143036) {
                    if (iHashCode == 951530617 && scheme.equals("content")) {
                        try {
                            poeVar = Long.valueOf(ContentUris.parseId(uri));
                        } catch (Throwable th) {
                            poeVar = new poe(th);
                        }
                        Throwable thA = roe.a(poeVar);
                        if (thA != null) {
                            String str = u;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "parseContentUriId: uri parse id failed, fallback to hashcode", thA);
                                }
                            }
                        }
                        return (Long) (poeVar instanceof poe ? null : poeVar);
                    }
                } else if (scheme.equals("file")) {
                    String path = uri.getPath();
                    string = path != null ? r5h.y1(path).toString() : null;
                    if (string != null && string.length() != 0 && Build.VERSION.SDK_INT < 29) {
                        lb8Var.d = string;
                        lb8Var.e = z;
                        lb8Var.h = 1;
                        ek2 ek2Var = new ek2(1, p90.B(lb8Var));
                        ek2Var.u();
                        MediaScannerConnection.scanFile(this.b, new String[]{string}, null, new nb8(ek2Var));
                        Object objS = ek2Var.s();
                        if (objS != hu4Var) {
                            objS = sbi.a;
                        }
                        if (objS == hu4Var) {
                            return hu4Var;
                        }
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = lb8Var.e;
        string = lb8Var.d;
        ch3.d0(obj);
        Context context = this.b;
        if (z) {
            Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=?", new String[]{string}, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    if (columnIndex == -1 || !cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    Long lValueOf = Long.valueOf(cursorQuery.getLong(columnIndex));
                    cursorQuery.close();
                    return lValueOf;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rx8.n(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
        } else {
            Cursor cursorQuery2 = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=?", new String[]{string}, null);
            if (cursorQuery2 != null) {
                try {
                    int columnIndex2 = cursorQuery2.getColumnIndex("_id");
                    if (columnIndex2 == -1 || !cursorQuery2.moveToFirst()) {
                        cursorQuery2.close();
                        return null;
                    }
                    Long lValueOf2 = Long.valueOf(cursorQuery2.getLong(columnIndex2));
                    cursorQuery2.close();
                    return lValueOf2;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        rx8.n(cursorQuery2, th4);
                        throw th5;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.gu4
    public final vt4 k() {
        return this.a.a;
    }
}
