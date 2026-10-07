package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.OverScroller;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class b1j implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ b1j(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream, java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r6v14, types: [qg7] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OverScroller overScroller;
        HttpURLConnection httpURLConnectionW0;
        int i;
        kam kamVarM;
        ?? inputStream = 0;
        Object objCall = null;
        ?? r1 = 0;
        inputStream = 0;
        switch (this.a) {
            case 0:
                ek2 ek2Var = (ek2) this.b;
                try {
                    if (ek2Var.t() instanceof hib) {
                        ek2Var.resumeWith(((bp2) this.c).get());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    x0j x0jVar = new x0j(qv1.k("VideoMessage Recording. initProcessCameraProvider error - ", th.getLocalizedMessage()), th);
                    gm0.V(((g1j) this.d).h, x0jVar.getMessage(), x0jVar);
                    ek2Var.resumeWith(new poe(th));
                    return;
                }
            case 1:
                oo5.d((j66) this.b, ((ud6) this.d).a((Runnable) this.c));
                return;
            case 2:
                et4 et4Var = (et4) this.b;
                AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = (AppBarLayout$BaseBehavior) this.d;
                View view = (View) this.c;
                if (view == null || (overScroller = appBarLayout$BaseBehavior.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    appBarLayout$BaseBehavior.F(et4Var, view, appBarLayout$BaseBehavior.d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                rq rqVar = (rq) view;
                appBarLayout$BaseBehavior.G(et4Var, rqVar);
                if (rqVar.l) {
                    rqVar.h(rqVar.i(AppBarLayout$BaseBehavior.w(et4Var)));
                    return;
                }
                return;
            case 3:
                o28 o28Var = (o28) this.d;
                n28 n28Var = (n28) this.b;
                ?? r6 = (qg7) this.c;
                try {
                    try {
                        httpURLConnectionW0 = o28Var.w0(n28Var.b.a.b, 5);
                        try {
                            n28Var.e = o28Var.n.now();
                            if (httpURLConnectionW0 != null) {
                                inputStream = httpURLConnectionW0.getInputStream();
                                r6.c(inputStream, -1);
                            }
                            if (r1 != 0) {
                                try {
                                    r1 = inputStream;
                                    r1.close();
                                    break;
                                } catch (IOException unused) {
                                }
                            }
                            if (httpURLConnectionW0 == null) {
                                return;
                            }
                        } catch (IOException e) {
                            e = e;
                            r6.onFailure(e);
                            if (inputStream != 0) {
                                try {
                                    inputStream.close();
                                    break;
                                } catch (IOException unused2) {
                                }
                            }
                            if (httpURLConnectionW0 == null) {
                                return;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        httpURLConnectionW0 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                inputStream.close();
                                break;
                            } catch (IOException unused3) {
                            }
                        }
                        if (0 != 0) {
                            throw th;
                        }
                        inputStream.disconnect();
                        throw th;
                    }
                    httpURLConnectionW0.disconnect();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        inputStream.close();
                        break;
                    }
                    if (0 != 0) {
                        throw th;
                    }
                    inputStream.disconnect();
                    throw th;
                }
            case 4:
                try {
                    objCall = ((f77) this.b).call();
                    break;
                } catch (Exception unused4) {
                }
                ((Handler) this.d).post(new og7((ux5) this.c, 22, objCall));
                return;
            default:
                eu3 eu3Var = (eu3) this.c;
                Intent intent = eu3Var.a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    kamVarM = gwl.e(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = eu3Var.a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = eu3Var.a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.b;
                    bundle.putBoolean("supports_message_handled", true);
                    a9m a9mVarL = a9m.l(context);
                    synchronized (a9mVarL) {
                        i = a9mVarL.b;
                        a9mVarL.b = i + 1;
                    }
                    kamVarM = a9mVarL.m(new g3m(i, 2, bundle, 0));
                }
                kamVarM.c(jm5.c, new zfh((CountDownLatch) this.d));
                return;
        }
    }

    public /* synthetic */ b1j() {
        this.a = 4;
    }

    public /* synthetic */ b1j(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
