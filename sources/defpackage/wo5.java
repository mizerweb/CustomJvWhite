package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class wo5 implements j18 {
    public final ks9 a;
    public volatile long b = Long.MIN_VALUE;
    public volatile Uri c;

    public wo5(ks9 ks9Var) {
        this.a = ks9Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x0054, B:26:0x0067, B:27:0x006b, B:29:0x0075, B:31:0x007b, B:32:0x0083, B:34:0x008b, B:35:0x0093, B:37:0x00a3, B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:48:0x00d0, B:49:0x00d5, B:50:0x00d6, B:51:0x00e0, B:56:0x00e6, B:64:0x00f8, B:61:0x00f1, B:62:0x00f6, B:70:0x0102), top: B:82:0x0054, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x0054, B:26:0x0067, B:27:0x006b, B:29:0x0075, B:31:0x007b, B:32:0x0083, B:34:0x008b, B:35:0x0093, B:37:0x00a3, B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:48:0x00d0, B:49:0x00d5, B:50:0x00d6, B:51:0x00e0, B:56:0x00e6, B:64:0x00f8, B:61:0x00f1, B:62:0x00f6, B:70:0x0102), top: B:82:0x0054, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x0054, B:26:0x0067, B:27:0x006b, B:29:0x0075, B:31:0x007b, B:32:0x0083, B:34:0x008b, B:35:0x0093, B:37:0x00a3, B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:48:0x00d0, B:49:0x00d5, B:50:0x00d6, B:51:0x00e0, B:56:0x00e6, B:64:0x00f8, B:61:0x00f1, B:62:0x00f6, B:70:0x0102), top: B:82:0x0054, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x0054, B:26:0x0067, B:27:0x006b, B:29:0x0075, B:31:0x007b, B:32:0x0083, B:34:0x008b, B:35:0x0093, B:37:0x00a3, B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:48:0x00d0, B:49:0x00d5, B:50:0x00d6, B:51:0x00e0, B:56:0x00e6, B:64:0x00f8, B:61:0x00f1, B:62:0x00f6, B:70:0x0102), top: B:82:0x0054, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:22:0x0054, B:26:0x0067, B:27:0x006b, B:29:0x0075, B:31:0x007b, B:32:0x0083, B:34:0x008b, B:35:0x0093, B:37:0x00a3, B:40:0x00b0, B:42:0x00b6, B:43:0x00be, B:48:0x00d0, B:49:0x00d5, B:50:0x00d6, B:51:0x00e0, B:56:0x00e6, B:64:0x00f8, B:61:0x00f1, B:62:0x00f6, B:70:0x0102), top: B:82:0x0054, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:78:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.j18
    public final Uri o(String str) {
        Uri uri;
        long jElapsedRealtime;
        lo7 lo7VarT;
        String strJ0;
        String string;
        int iD;
        Uri uriO = this.a.o(str);
        if (!str.equals("api")) {
            return uriO;
        }
        Uri uri2 = fq.a;
        String string2 = uriO.toString();
        String string3 = uri2.toString();
        if (string2.equals(string3)) {
            if (SystemClock.elapsedRealtime() > this.b) {
                synchronized (this) {
                    if (SystemClock.elapsedRealtime() > this.b) {
                        jElapsedRealtime = BuildConfig.MAX_TIME_TO_UPLOAD;
                        lo7VarT = l6m.t();
                        strJ0 = lo7VarT.b;
                        if (r5h.o1(strJ0, '\"')) {
                            strJ0 = strJ0.substring(1, r5h.Q0(strJ0));
                        }
                        if (r5h.L0(strJ0, "\"\"", false)) {
                            strJ0 = z5h.J0(strJ0, "\"\"", "");
                        }
                        string = r5h.y1(strJ0).toString();
                        if (r5h.M0(string, ' ')) {
                            string = string.substring(r5h.Y0(string, ' ', 0, 6) + 1);
                        }
                        if (r5h.N0(string, '/')) {
                            string = string.substring(0, r5h.Q0(string));
                        }
                        Uri uri3 = Uri.parse(string);
                        this.c = uri3;
                        iD = qt4.D(2);
                        if (iD != 0) {
                            if (iD != 1) {
                                jElapsedRealtime = SystemClock.elapsedRealtime() + ((long) (lo7VarT.a * 1000));
                            } else {
                                if (iD == 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                jElapsedRealtime = Long.MIN_VALUE;
                            }
                        }
                        this.b = jElapsedRealtime;
                        return uri3;
                    }
                }
            }
            uri = this.c;
            if (uri == null) {
                return uri;
            }
        } else {
            int iQ0 = r5h.N0(string2, '/') ? r5h.Q0(string2) : string2.length();
            if (iQ0 == (r5h.N0(string3, '/') ? r5h.Q0(string3) : string3.length()) && string2.regionMatches(0, string3, 0, iQ0)) {
                if (SystemClock.elapsedRealtime() > this.b) {
                    synchronized (this) {
                        try {
                            if (SystemClock.elapsedRealtime() > this.b) {
                                jElapsedRealtime = BuildConfig.MAX_TIME_TO_UPLOAD;
                                try {
                                    lo7VarT = l6m.t();
                                    strJ0 = lo7VarT.b;
                                    if (r5h.o1(strJ0, '\"') && r5h.N0(strJ0, '\"')) {
                                        strJ0 = strJ0.substring(1, r5h.Q0(strJ0));
                                    }
                                    if (r5h.L0(strJ0, "\"\"", false)) {
                                        strJ0 = z5h.J0(strJ0, "\"\"", "");
                                    }
                                    string = r5h.y1(strJ0).toString();
                                    if (r5h.M0(string, ' ')) {
                                        string = string.substring(r5h.Y0(string, ' ', 0, 6) + 1);
                                    }
                                    if (r5h.N0(string, '/')) {
                                        string = string.substring(0, r5h.Q0(string));
                                    }
                                    Uri uri4 = Uri.parse(string);
                                    this.c = uri4;
                                    iD = qt4.D(2);
                                    if (iD != 0) {
                                        if (iD != 1) {
                                            jElapsedRealtime = SystemClock.elapsedRealtime() + ((long) (lo7VarT.a * 1000));
                                        } else {
                                            if (iD == 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            jElapsedRealtime = Long.MIN_VALUE;
                                        }
                                    }
                                    this.b = jElapsedRealtime;
                                    return uri4;
                                } catch (Exception e) {
                                    int iD2 = qt4.D(3);
                                    if (iD2 == 0) {
                                        throw e;
                                    }
                                    if (iD2 == 1) {
                                        jElapsedRealtime = Long.MIN_VALUE;
                                    } else if (iD2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.b = jElapsedRealtime;
                                    Uri uri5 = this.c;
                                    return uri5 == null ? uriO : uri5;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                uri = this.c;
                if (uri == null) {
                    return uri;
                }
            }
        }
        return uriO;
    }
}
