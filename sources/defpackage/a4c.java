package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.a;
import one.me.android.vendor.FatalException;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class a4c {
    public final dq4 a;
    public final String b = a4c.class.getName();
    public final mjg c = p90.a(je9.c);
    public final mjg d = p90.a(Boolean.FALSE);
    public int e = 1;
    public ju6 f;
    public w6 g;
    public final m2c h;
    public final x3c i;
    public bu j;

    public a4c(v5 v5Var, v5 v5Var2, v5 v5Var3, dq4 dq4Var) {
        this.a = dq4Var;
        this.h = new m2c(v5Var, dq4Var, v5Var3, 1);
        this.i = new x3c(v5Var2, dq4Var);
    }

    public static /* synthetic */ void d(a4c a4cVar, je9 je9Var, String str, String str2) {
        a4cVar.c(je9Var, str, str2, null);
    }

    public static /* synthetic */ void f(a4c a4cVar, je9 je9Var, String str, String str2, Object[] objArr, Throwable th, int i) {
        if ((i & 8) != 0) {
            objArr = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        a4cVar.e(je9Var, str, str2, objArr, th);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af A[PHI: r8
  0x00af: PHI (r8v10 java.lang.Object) = (r8v7 java.lang.Object), (r8v13 java.lang.Object) binds: [B:44:0x00d4, B:32:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable a(nq4 nq4Var) {
        y3c y3cVar;
        Object objK0;
        if (nq4Var instanceof y3c) {
            y3cVar = (y3c) nq4Var;
            int i = y3cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y3cVar.g = i - Integer.MIN_VALUE;
            } else {
                y3cVar = new y3c(this, nq4Var);
            }
        } else {
            y3cVar = new y3c(this, nq4Var);
        }
        Object obj = y3cVar.e;
        int i2 = y3cVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.x("DUMP_LOG", "Dumping all logs", null);
            w6 w6Var = this.g;
            if (w6Var != null) {
                y3cVar.g = 1;
                if (w6Var.invoke(y3cVar) != hu4Var) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Path path = y3cVar.d;
            ch3.d0(obj);
            return path;
        }
        ch3.d0(obj);
        ju6 ju6Var = this.f;
        if (ju6Var == null) {
            ju6Var = null;
        }
        ju6Var.getClass();
        File fileJ = ju6.j(ju6Var.b(), "logsCache");
        m2c m2cVar = this.h;
        Path path2 = lu6.q0(fileJ, m2cVar.f.format(Date.from(Instant.now())) + ".zip").toPath();
        y3cVar.d = path2;
        y3cVar.g = 2;
        int iD = qt4.D(this.e);
        Object obj2 = sbi.a;
        if (iD == 0) {
            vt4 vt4Var = (xt4) m2cVar.b.a.x0(xt4.b);
            if (vt4Var == null) {
                vt4Var = k66.a;
            }
            objK0 = yab.K0(vt4Var, new g2c(m2cVar, path2, null, 0), y3cVar);
            if (objK0 != hu4Var) {
                objK0 = obj2;
            }
            if (objK0 == hu4Var) {
                obj2 = objK0;
            }
        } else {
            if (iD != 1) {
                ore.o();
                return null;
            }
            x3c x3cVar = this.i;
            x3cVar.getClass();
            objK0 = x3cVar.c(new ec2(path2, x3cVar, null, 5), y3cVar);
            if (objK0 != hu4Var) {
                objK0 = obj2;
            }
            if (objK0 == hu4Var) {
                obj2 = objK0;
            }
        }
        return obj2 == hu4Var ? hu4Var : path2;
    }

    public final boolean b(je9 je9Var) {
        return je9Var.compareTo((Enum) this.c.getValue()) >= 0;
    }

    public final void c(je9 je9Var, String str, String str2, Throwable th) {
        qwf qwfVar;
        String strR;
        if (((je9) this.c.getValue()).a <= je9Var.a) {
            if (this.e == 2) {
                String strConcat = str2 == null ? "" : str2;
                if (th != null) {
                    try {
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            printWriter.flush();
                            strR = "\n" + r5h.y1(stringWriter.toString()).toString();
                            printWriter.close();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                rx8.n(printWriter, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable unused) {
                        strR = zo5.r("\ncould not get stacktrace from error: ", th);
                    }
                    strConcat = strConcat.concat(strR);
                }
                Log.println(je9Var.a, str, strConcat);
            }
            if (this.e == 1) {
                m2c m2cVar = this.h;
                d2c d2cVarE = m2cVar.e();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                d2cVarE.a = jCurrentTimeMillis;
                d2cVarE.b = name;
                d2cVarE.c = je9Var;
                d2cVarE.d = str;
                d2cVarE.e = str2;
                d2cVarE.f = th;
                p41 p41Var = m2cVar.i;
                if (p41Var.c(d2cVarE) instanceof cs2) {
                    int iD = qt4.D(m2cVar.e);
                    if (iD == 0) {
                        m2cVar.n.incrementAndGet();
                        m2cVar.j.c(d2cVarE);
                    } else {
                        if (iD != 1) {
                            ore.o();
                            return;
                        }
                        all.b(p41Var, d2cVarE);
                    }
                }
            }
            if (this.j != null) {
                if (th != null && ((je9Var == je9.g || je9Var == je9.h) && ((Boolean) bu.f.invoke()).booleanValue() && !a.N0(bu.b, th.getClass()))) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new FatalException(th);
                    }
                    handler.postAtFrontOfQueue(new zn(2, th));
                    return;
                }
                if (je9Var.a > 2 && ((xwh) bu.h.getValue()) != null) {
                    if (str2 != null && str2.length() != 0) {
                        xwh.b(str + ":" + str2);
                    }
                    int i = je9Var.a;
                    if ((i < 6 || je9Var == je9.i || th == null) && (i < 5 || !(th instanceof IssueKeyException))) {
                        return;
                    }
                    IssueKeyException issueKeyException = th instanceof IssueKeyException ? (IssueKeyException) th : null;
                    if (issueKeyException == null) {
                        Throwable cause = th.getCause();
                        issueKeyException = cause instanceof IssueKeyException ? (IssueKeyException) cause : null;
                    }
                    String issueKey = issueKeyException != null ? issueKeyException.getIssueKey() : null;
                    if ((th instanceof Error) || ((issueKey != null && issueKey.length() != 0) || ((Boolean) bu.c.invoke()).booleanValue())) {
                        int i2 = je9Var.a;
                        if (i2 == 3) {
                            qwfVar = qwf.h;
                        } else if (i2 == 4) {
                            qwfVar = qwf.g;
                        } else if (i2 == 5) {
                            qwfVar = qwf.e;
                        } else if (i2 == 6) {
                            qwfVar = qwf.d;
                        } else {
                            qwfVar = i2 == 7 ? qwf.c : qwf.f;
                        }
                        xwh.c(qwfVar, th, issueKey);
                    }
                    bu.d.accept(bu.e.incrementAndGet());
                }
            }
        }
    }

    public void e(je9 je9Var, String str, String str2, Object[] objArr, Throwable th) {
        String strConcat;
        String str3 = str2 == null ? "" : str2;
        if (str2 != null && objArr != null) {
            try {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                strConcat = String.format(locale, str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            } catch (Throwable unused) {
                strConcat = str2.concat(a.h1(objArr, null, null, null, null, 63));
            }
            str3 = strConcat;
        }
        c(je9Var, str, str3, th);
    }
}
