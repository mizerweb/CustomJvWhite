package defpackage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class x3c {
    public final dq4 a;
    public final ifh c;
    public volatile sgg d;
    public final r3c b = r3c.a;
    public final l9b e = new l9b();

    public x3c(v5 v5Var, dq4 dq4Var) {
        this.a = dq4Var;
        this.c = new ifh(new ap9(12, v5Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final void a(x3c x3cVar, nq4 nq4Var) {
        s3c s3cVar;
        Object poeVar;
        Object poeVar2;
        boolean zIsAlive;
        ifh ifhVar = x3cVar.c;
        r3c r3cVar = x3cVar.b;
        if (nq4Var instanceof s3c) {
            s3cVar = (s3c) nq4Var;
            int i = s3cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3cVar.g = i - Integer.MIN_VALUE;
            } else {
                s3cVar = new s3c(x3cVar, nq4Var);
            }
        } else {
            s3cVar = new s3c(x3cVar, nq4Var);
        }
        Object obj = s3cVar.e;
        int i2 = s3cVar.g;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    Path path = s3cVar.d;
                    ch3.d0(obj);
                    throw new KotlinNothingValueException();
                }
            }
            ch3.d0(obj);
            Files.createDirectories((Path) ifhVar.getValue(), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
            Path pathResolve = ((Path) ifhVar.getValue()).resolve("all.log");
            s3cVar.d = pathResolve;
            s3cVar.g = 1;
            x3cVar.b(r3cVar, pathResolve, s3cVar);
        } catch (Throwable th) {
            Object poeVar3 = sbi.a;
            Process processStart = new ProcessBuilder(new String[0]).command(xw3.P0("logcat", "-f", ifhVar.toString(), "-b", "all", "-v", "long", "-t", "4096")).redirectErrorStream(true).start();
            try {
                processStart.waitFor();
                if (!zIsAlive) {
                    throw th;
                }
                throw th;
            } finally {
                try {
                    processStart.getInputStream().close();
                    poeVar = poeVar3;
                } catch (Throwable th2) {
                    poeVar = new poe(th2);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V("OneMeLogcatLogger", "Failed to close process stream", thA);
                }
                try {
                    processStart.getOutputStream().close();
                    poeVar2 = poeVar3;
                } catch (Throwable th3) {
                    poeVar2 = new poe(th3);
                }
                Throwable thA2 = roe.a(poeVar2);
                if (thA2 != null) {
                    gm0.V("OneMeLogcatLogger", "Failed to close process stream", thA2);
                }
                try {
                    processStart.getErrorStream().close();
                } catch (Throwable th4) {
                    poeVar3 = new poe(th4);
                }
                Throwable thA3 = roe.a(poeVar3);
                if (thA3 != null) {
                    gm0.V("OneMeLogcatLogger", "Failed to close process stream", thA3);
                }
                if (processStart.isAlive()) {
                    processStart.destroy();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void b(r3c r3cVar, Path path, nq4 nq4Var) {
        t3c t3cVar;
        if (nq4Var instanceof t3c) {
            t3cVar = (t3c) nq4Var;
            int i = t3cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3cVar.f = i - Integer.MIN_VALUE;
            } else {
                t3cVar = new t3c(this, nq4Var);
            }
        } else {
            t3cVar = new t3c(this, nq4Var);
        }
        Object obj = t3cVar.d;
        int i2 = t3cVar.f;
        if (i2 == 0) {
            ch3.d0(obj);
            String string = path.toString();
            r3cVar.getClass();
            Process processStart = new ProcessBuilder(new String[0]).command(xw3.P0("logcat", "-f", string, "-r", "8196", "-n", "4", "-b", "all", "-v", "long")).redirectErrorStream(true).start();
            t3cVar.f = 1;
            ek2 ek2Var = new ek2(1, p90.B(t3cVar));
            ek2Var.u();
            ek2Var.w(new ol0(20, processStart));
            if (ek2Var.s() == hu4.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
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
    public final Object c(cf7 cf7Var, nq4 nq4Var) {
        u3c u3cVar;
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
        if (nq4Var instanceof u3c) {
            u3cVar = (u3c) nq4Var;
            int i5 = u3cVar.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                u3cVar.j = i5 - Integer.MIN_VALUE;
            } else {
                u3cVar = new u3c(this, nq4Var);
            }
        } else {
            u3cVar = new u3c(this, nq4Var);
        }
        Object obj = u3cVar.h;
        hu4 hu4Var = hu4.a;
        int i6 = u3cVar.j;
        int i7 = 0;
        lq4 lq4Var = null;
        try {
            try {
                if (i6 == 0) {
                    ch3.d0(obj);
                    l9b l9bVar = this.e;
                    u3cVar.d = cf7Var;
                    u3cVar.e = l9bVar;
                    u3cVar.f = 0;
                    u3cVar.j = 1;
                    if (l9bVar.b(u3cVar) != hu4Var) {
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
                        j9b j9bVar2 = u3cVar.e;
                        try {
                            ch3.d0(obj);
                            r10 = j9bVar2;
                            this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
                            sbi sbiVar = sbi.a;
                            r10.g(null);
                            return sbiVar;
                        } catch (Throwable th2) {
                            th = th2;
                            this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
                            throw th;
                        }
                    }
                    i4 = u3cVar.g;
                    i = u3cVar.f;
                    r5 = u3cVar.e;
                    cf7Var2 = u3cVar.d;
                    try {
                        ch3.d0(obj);
                        r6 = r5;
                        r11 = r6;
                        i2 = i;
                        i3 = i4;
                        cf7Var = cf7Var2;
                        try {
                            u3cVar.d = null;
                            u3cVar.e = r11;
                            u3cVar.f = i2;
                            u3cVar.g = i3;
                            u3cVar.j = 3;
                            if (cf7Var.invoke(u3cVar) != hu4Var) {
                                r10 = r11;
                                this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
                                sbi sbiVar2 = sbi.a;
                                r10.g(null);
                                return sbiVar2;
                            }
                            return hu4Var;
                        } catch (Throwable th3) {
                            th = th3;
                            this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r5.g(null);
                        throw th;
                    }
                }
                int i8 = u3cVar.f;
                j9b j9bVar3 = u3cVar.e;
                cf7 cf7Var3 = u3cVar.d;
                ch3.d0(obj);
                j9bVar = j9bVar3;
                i = i8;
                cf7Var = cf7Var3;
                sgg sggVar = this.d;
                if (sggVar != null) {
                    u3cVar.d = cf7Var;
                    u3cVar.e = j9bVar;
                    u3cVar.f = i;
                    u3cVar.g = 0;
                    u3cVar.j = 2;
                    if (vd7.e(sggVar, u3cVar) != hu4Var) {
                        cf7Var2 = cf7Var;
                        r6 = j9bVar;
                        i4 = 0;
                        r11 = r6;
                        i2 = i;
                        i3 = i4;
                        cf7Var = cf7Var2;
                        u3cVar.d = null;
                        u3cVar.e = r11;
                        u3cVar.f = i2;
                        u3cVar.g = i3;
                        u3cVar.j = 3;
                        if (cf7Var.invoke(u3cVar) != hu4Var) {
                            r10 = r11;
                            this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
                            sbi sbiVar3 = sbi.a;
                            r10.g(null);
                            return sbiVar3;
                        }
                    }
                } else {
                    i2 = i;
                    i3 = 0;
                    r11 = j9bVar;
                    u3cVar.d = null;
                    u3cVar.e = r11;
                    u3cVar.f = i2;
                    u3cVar.g = i3;
                    u3cVar.j = 3;
                    if (cf7Var.invoke(u3cVar) != hu4Var) {
                        r10 = r11;
                        this.d = yab.i0(this.a, null, 0, new w3c(this, lq4Var, i7), 3);
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
}
