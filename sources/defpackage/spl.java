package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class spl {
    public static final b9b a(ilf ilfVar) {
        int iB;
        glf glfVar = ilfVar instanceof glf ? (glf) ilfVar : null;
        List<t2> list = glfVar != null ? glfVar.n : null;
        if (list == null) {
            jlf jlfVar = ilfVar instanceof jlf ? (jlf) ilfVar : null;
            ilf ilfVar2 = jlfVar != null ? jlfVar.m : null;
            glf glfVar2 = ilfVar2 instanceof glf ? (glf) ilfVar2 : null;
            list = glfVar2 != null ? glfVar2.n : null;
        }
        if (list == null) {
            String name = ilfVar.getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "No info about medias in that service task", null);
                }
            }
            return q1f.b;
        }
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        for (t2 t2Var : list) {
            int iIntValue = 0;
            if (!(t2Var instanceof q50)) {
                switch (t2Var.a) {
                    case 1:
                        iB = 3;
                        break;
                    case 2:
                        iB = 5;
                        break;
                    case 3:
                        iB = 1;
                        break;
                    case 4:
                    default:
                        iB = 0;
                        break;
                    case 5:
                        iB = 9;
                        break;
                    case 6:
                        iB = 16;
                        break;
                    case 7:
                        iB = 4;
                        break;
                    case 8:
                        iB = 10;
                        break;
                    case 9:
                        iB = 13;
                        break;
                    case 10:
                        iB = 6;
                        break;
                    case 11:
                        iB = 2;
                        break;
                }
            } else {
                iB = yvk.b(((q50) t2Var).c);
            }
            String strValueOf = String.valueOf(iB);
            Integer num = (Integer) b9bVar.d(strValueOf);
            if (num != null) {
                iIntValue = num.intValue();
            }
            b9bVar.k(strValueOf, Integer.valueOf(iIntValue + 1));
        }
        return b9bVar;
    }

    public static final void b(vt4 vt4Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = au4.a.iterator();
        while (it.hasNext()) {
            try {
                ((yt4) it.next()).r0(vt4Var, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    gm0.b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            gm0.b(th, new DiagnosticCoroutineContextException(vt4Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
