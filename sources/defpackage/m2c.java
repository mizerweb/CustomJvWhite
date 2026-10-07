package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m2c {
    public final v5 a;
    public final dq4 b;
    public final v5 c;
    public final tf7 d;
    public final int e;
    public final SimpleDateFormat f;
    public final ifh g;
    public final l9b h;
    public final p41 i;
    public final p41 j;
    public final p35 k;
    public volatile sgg l;
    public final l9b m;
    public final AtomicInteger n;

    public m2c(v5 v5Var, dq4 dq4Var, v5 v5Var2, int i) {
        jl9 jl9Var = new jl9(3);
        this.a = v5Var;
        this.b = dq4Var;
        this.c = v5Var2;
        this.d = jl9Var;
        this.e = i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f = simpleDateFormat;
        this.g = new ifh(new ap9(11, this));
        this.h = new l9b();
        this.i = yab.b(16384, 1, null, 4);
        this.j = yab.b(16384, 3, null, 4);
        this.k = new p35();
        this.m = new l9b();
        this.n = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(m2c m2cVar, nq4 nq4Var) {
        e2c e2cVar;
        l9b l9bVar;
        m2cVar.getClass();
        if (nq4Var instanceof e2c) {
            e2cVar = (e2c) nq4Var;
            int i = e2cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2cVar.g = i - Integer.MIN_VALUE;
            } else {
                e2cVar = new e2c(m2cVar, nq4Var);
            }
        } else {
            e2cVar = new e2c(m2cVar, nq4Var);
        }
        Object obj = e2cVar.e;
        int i2 = e2cVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = m2cVar.h;
            e2cVar.d = l9bVar2;
            e2cVar.g = 1;
            Object objB = l9bVar2.b(e2cVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = e2cVar.d;
            ch3.d0(obj);
        }
        try {
            File[] fileArrListFiles = m2cVar.f().toFile().listFiles(new ic9(1));
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            long length = 0;
            for (File file : fileArrListFiles) {
                length += file.length();
            }
            if (length / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID > PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                File[] fileArr = fileArrListFiles;
                if (fileArr.length > 1) {
                    Arrays.sort(fileArr);
                }
                for (File file2 : fileArrListFiles) {
                    if (length / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        break;
                    }
                    length -= file2.length();
                    file2.delete();
                }
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0037, B:25:0x00b8, B:27:0x00c0, B:29:0x00d1, B:31:0x011a, B:33:0x0123, B:37:0x0134, B:20:0x009c, B:19:0x0060), top: B:48:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0037, B:25:0x00b8, B:27:0x00c0, B:29:0x00d1, B:31:0x011a, B:33:0x0123, B:37:0x0134, B:20:0x009c, B:19:0x0060), top: B:48:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0116  */
    /* JADX WARN: Code duplicated, block: B:33:0x0123 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0037, B:25:0x00b8, B:27:0x00c0, B:29:0x00d1, B:31:0x011a, B:33:0x0123, B:37:0x0134, B:20:0x009c, B:19:0x0060), top: B:48:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0130  */
    /* JADX WARN: Code duplicated, block: B:36:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b3 -> B:25:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.m2c r19, java.nio.file.Path r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2c.b(m2c, java.nio.file.Path, nq4):java.lang.Object");
    }

    public static final void c(m2c m2cVar, Path path) {
        int i;
        DecimalFormat decimalFormat;
        String strConcat;
        Object obj;
        m2cVar.getClass();
        long size = Files.size(path);
        Path pathResolve = path.getParent().resolve(roc.S(path).concat(".zip"));
        long jC = g1b.c();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(pathResolve.toFile(), false));
            try {
                zipOutputStream.putNextEntry(new ZipEntry(roc.S(path).concat(".log")));
                do {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        zipOutputStream.write(bArr, 0, i);
                    }
                } while (i >= 0);
                zipOutputStream.closeEntry();
                zipOutputStream.finish();
                zipOutputStream.close();
                Files.deleteIfExists(path);
                fileInputStream.close();
                long jA = ish.a(jC);
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    return;
                }
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    String strS = roc.S(path);
                    long j = size / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    long size2 = Files.size(pathResolve) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    lw5 lw5Var = lw5.MILLISECONDS;
                    double dR = ew5.r(jA, lw5Var);
                    if (Double.isInfinite(dR)) {
                        strConcat = String.valueOf(dR);
                    } else {
                        ThreadLocal[] threadLocalArr = gw5.a;
                        if (threadLocalArr.length > 0) {
                            ThreadLocal threadLocal = threadLocalArr[0];
                            Object obj2 = threadLocal.get();
                            if (obj2 == null) {
                                obj = obj2;
                                DecimalFormat decimalFormat2 = new DecimalFormat("0");
                                decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                                threadLocal.set(decimalFormat2);
                                obj = decimalFormat2;
                            }
                            obj = obj2;
                            decimalFormat = (DecimalFormat) obj;
                        } else {
                            decimalFormat = new DecimalFormat("0");
                            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                        }
                        strConcat = decimalFormat.format(dR).concat(sb8.n0(lw5Var));
                    }
                    StringBuilder sbB = nbh.B(j, "Log ", strS, ", size=");
                    qt4.z(size2, "kb, deflatedSize=", "kb, saved at ", sbB);
                    sbB.append(strConcat);
                    a4cVar.c(je9Var, "OneMeFileLogger", sbB.toString(), null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(zipOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rx8.n(fileInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r4.g(r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.nq4 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.f2c
            if (r0 == 0) goto L13
            r0 = r8
            f2c r0 = (defpackage.f2c) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            f2c r0 = new f2c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f
            hu4 r1 = defpackage.hu4.a
            int r2 = r0.h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            j9b r0 = r0.d
            defpackage.ch3.d0(r8)     // Catch: java.lang.Throwable -> L2d
            goto L82
        L2d:
            r7 = move-exception
            goto L8d
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r5
        L35:
            int r2 = r0.e
            j9b r6 = r0.d
            defpackage.ch3.d0(r8)
            r8 = r6
            goto L51
        L3e:
            defpackage.ch3.d0(r8)
            l9b r8 = r7.m
            r0.d = r8
            r2 = 0
            r0.e = r2
            r0.h = r4
            java.lang.Object r6 = r8.b(r0)
            if (r6 != r1) goto L51
            goto L80
        L51:
            p41 r6 = r7.i     // Catch: java.lang.Throwable -> L6d
            r6.i(r5)     // Catch: java.lang.Throwable -> L6d
            sgg r6 = r7.l     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L70
            boolean r6 = r6.isCancelled()     // Catch: java.lang.Throwable -> L6d
            if (r6 != r4) goto L70
            tf7 r7 = r7.d     // Catch: java.lang.Throwable -> L6d
            je9 r0 = defpackage.je9.g     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "OneMeFileLogger"
            java.lang.String r2 = "Maybe Logger are crash internally we give up!"
            r7.i(r0, r1, r2)     // Catch: java.lang.Throwable -> L6d
            r0 = r8
            goto L87
        L6d:
            r7 = move-exception
            r0 = r8
            goto L8d
        L70:
            sgg r4 = r7.l     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L81
            r0.d = r8     // Catch: java.lang.Throwable -> L6d
            r0.e = r2     // Catch: java.lang.Throwable -> L6d
            r0.h = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r1) goto L81
        L80:
            return r1
        L81:
            r0 = r8
        L82:
            p41 r7 = r7.j     // Catch: java.lang.Throwable -> L2d
            r7.i(r5)     // Catch: java.lang.Throwable -> L2d
        L87:
            sbi r7 = defpackage.sbi.a     // Catch: java.lang.Throwable -> L2d
            r0.g(r5)
            return r7
        L8d:
            r0.g(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m2c.d(nq4):java.lang.Object");
    }

    public final d2c e() {
        Object objH = this.j.h();
        boolean z = objH instanceof cs2;
        Object obj = objH;
        if (z) {
            d2c d2cVar = new d2c();
            d2cVar.b = "";
            d2cVar.c = je9.c;
            obj = d2cVar;
        }
        return (d2c) obj;
    }

    public final Path f() {
        return (Path) this.g.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [j9b] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4, types: [j9b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [j9b] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [j9b] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    public final Object g(cf7 cf7Var, nq4 nq4Var) throws Throwable {
        i2c i2cVar;
        ?? r5;
        int i;
        j9b j9bVar;
        int i2;
        int i3;
        cf7 cf7Var2;
        ?? r6;
        int i4;
        ?? r11;
        Throwable th;
        ?? r10;
        if (nq4Var instanceof i2c) {
            i2cVar = (i2c) nq4Var;
            int i5 = i2cVar.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i2cVar.j = i5 - Integer.MIN_VALUE;
            } else {
                i2cVar = new i2c(this, nq4Var);
            }
        } else {
            i2cVar = new i2c(this, nq4Var);
        }
        Object obj = i2cVar.h;
        hu4 hu4Var = hu4.a;
        int i6 = i2cVar.j;
        int i7 = 0;
        lq4 lq4Var = null;
        try {
            try {
                if (i6 == 0) {
                    ch3.d0(obj);
                    l9b l9bVar = this.m;
                    i2cVar.d = cf7Var;
                    i2cVar.e = l9bVar;
                    i2cVar.f = 0;
                    i2cVar.j = 1;
                    if (l9bVar.b(i2cVar) != hu4Var) {
                        i = 0;
                        j9bVar = l9bVar;
                    }
                    return hu4Var;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j9b j9bVar2 = i2cVar.e;
                        try {
                            ch3.d0(obj);
                            r10 = j9bVar2;
                            this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                            sbi sbiVar = sbi.a;
                            r10.g(null);
                            return sbiVar;
                        } catch (Throwable th2) {
                            th = th2;
                            this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                            throw th;
                        }
                    }
                    i4 = i2cVar.g;
                    i = i2cVar.f;
                    r5 = i2cVar.e;
                    cf7Var2 = i2cVar.d;
                    try {
                        ch3.d0(obj);
                        r6 = r5;
                        r11 = r6;
                        i2 = i;
                        i3 = i4;
                        cf7Var = cf7Var2;
                        try {
                            i2cVar.d = null;
                            i2cVar.e = r11;
                            i2cVar.f = i2;
                            i2cVar.g = i3;
                            i2cVar.j = 3;
                            if (cf7Var.invoke(i2cVar) != hu4Var) {
                                r10 = r11;
                                this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                                sbi sbiVar2 = sbi.a;
                                r10.g(null);
                                return sbiVar2;
                            }
                            return hu4Var;
                        } catch (Throwable th3) {
                            th = th3;
                            this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r5.g(null);
                        throw th;
                    }
                }
                int i8 = i2cVar.f;
                j9b j9bVar3 = i2cVar.e;
                cf7 cf7Var3 = i2cVar.d;
                ch3.d0(obj);
                j9bVar = j9bVar3;
                i = i8;
                cf7Var = cf7Var3;
                sgg sggVar = this.l;
                if (sggVar != null) {
                    i2cVar.d = cf7Var;
                    i2cVar.e = j9bVar;
                    i2cVar.f = i;
                    i2cVar.g = 0;
                    i2cVar.j = 2;
                    if (vd7.e(sggVar, i2cVar) != hu4Var) {
                        cf7Var2 = cf7Var;
                        r6 = j9bVar;
                        i4 = 0;
                        r11 = r6;
                        i2 = i;
                        i3 = i4;
                        cf7Var = cf7Var2;
                        i2cVar.d = null;
                        i2cVar.e = r11;
                        i2cVar.f = i2;
                        i2cVar.g = i3;
                        i2cVar.j = 3;
                        if (cf7Var.invoke(i2cVar) != hu4Var) {
                            r10 = r11;
                            this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                            sbi sbiVar3 = sbi.a;
                            r10.g(null);
                            return sbiVar3;
                        }
                    }
                } else {
                    i2 = i;
                    i3 = 0;
                    r11 = j9bVar;
                    i2cVar.d = null;
                    i2cVar.e = r11;
                    i2cVar.f = i2;
                    i2cVar.g = i3;
                    i2cVar.j = 3;
                    if (cf7Var.invoke(i2cVar) != hu4Var) {
                        r10 = r11;
                        this.l = yab.i0(this.b, null, 0, new k2c(this, lq4Var, i7), 3);
                        sbi sbiVar4 = sbi.a;
                        r10.g(null);
                        return sbiVar4;
                    }
                }
                return hu4Var;
            } catch (Throwable th5) {
                th = th5;
                r5 = j9bVar;
                r5.g(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r5 = cf7Var;
        }
    }

    public final void h(BufferedWriter bufferedWriter, d2c d2cVar) throws IOException {
        long j = d2cVar.a;
        p35 p35Var = this.k;
        long j2 = j - p35Var.a;
        if (j2 < 0 || j2 >= 60000) {
            Instant instantTruncatedTo = Instant.ofEpochMilli(j).truncatedTo(ChronoUnit.MINUTES);
            p35Var.a = instantTruncatedTo.toEpochMilli();
            p35Var.c = ((SimpleDateFormat) p35Var.b).format(Date.from(instantTruncatedTo));
        }
        bufferedWriter.write((String) p35Var.c);
        int i = (int) (j % 60000);
        bufferedWriter.write((i / 10000) + 48);
        bufferedWriter.write(((i % 10000) / 1000) + 48);
        bufferedWriter.write(46);
        bufferedWriter.write(((i % 1000) / 100) + 48);
        bufferedWriter.write(((i % 100) / 10) + 48);
        bufferedWriter.write((i % 10) + 48);
        bufferedWriter.write(32);
        boolean zL0 = r5h.L0(d2cVar.b, " ", false);
        String str = d2cVar.b;
        if (zL0) {
            bufferedWriter.write(z5h.J0(str, " ", "_"));
        } else {
            bufferedWriter.write(str);
        }
        bufferedWriter.write(32);
        bufferedWriter.write(String.valueOf(d2cVar.c.b));
        bufferedWriter.write(32);
        String str2 = d2cVar.d;
        if (str2 == null) {
            str2 = "";
        }
        bufferedWriter.write(str2);
        bufferedWriter.write(32);
        String str3 = d2cVar.e;
        bufferedWriter.write(str3 != null ? str3 : "");
        bufferedWriter.write(10);
        Throwable th = d2cVar.f;
        if (th != null) {
            bufferedWriter.write(gm0.N(th));
            bufferedWriter.write(10);
        }
    }
}
