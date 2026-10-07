package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* JADX INFO: loaded from: classes.dex */
public final class ag5 implements m72 {
    public static ag5 f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public ag5(int i) {
        switch (i) {
            case 3:
                this.e = new LinkedHashMap();
                this.b = HttpGet.METHOD_NAME;
                this.c = new p3c(10);
                break;
            default:
                this.a = new Object();
                this.e = new zn(5, this);
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public static synchronized ag5 c() {
        try {
            if (f == null) {
                f = new ag5(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r10 != null) goto L46;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:38:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:38:0x008f). Please report as a decompilation issue!!! */
    @Override // defpackage.m72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(defpackage.y8e r12, defpackage.pne r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.e
            r1 = r0
            t68 r1 = (defpackage.t68) r1
            java.lang.Object r0 = r11.c
            r7 = r0
            xcb r7 = (defpackage.xcb) r7
            java.lang.String r8 = "Exception when closing response body"
            java.lang.String r9 = "OkHttpNetworkFetchProducer"
            java.lang.String r0 = "Unexpected HTTP code "
            java.lang.Object r2 = r11.a
            usb r2 = (defpackage.usb) r2
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.e = r3
            rne r10 = r13.g
            boolean r2 = r13.E()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r2 != 0) goto L66
            java.lang.Object r2 = r11.b     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            dle r2 = (defpackage.dle) r2     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r3 = r13.d     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.Object r4 = r11.a     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            usb r4 = (defpackage.usb) r4     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.Object r5 = r11.c     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            xcb r5 = (defpackage.xcb) r5     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.Object r11 = r11.d     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r6 = r11
            s68 r6 = (defpackage.s68) r6     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            boolean r11 = defpackage.t68.x0(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r11 == 0) goto L47
            if (r10 == 0) goto L8f
        L3d:
            r10.close()     // Catch: java.lang.Exception -> L41
            return
        L41:
            r0 = move-exception
            r11 = r0
            defpackage.gm0.V(r9, r8, r11)
            return
        L47:
            one.me.sdk.fresco.FrescoHttpDownloadException r11 = new one.me.sdk.fresco.FrescoHttpDownloadException     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r2.append(r13)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r13 = r13.d     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r11.<init>(r0, r13)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            defpackage.t68.w0(r1, r12, r11, r7)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            if (r10 == 0) goto L8f
            goto L3d
        L60:
            r0 = move-exception
            r11 = r0
            goto L90
        L63:
            r0 = move-exception
            r11 = r0
            goto L87
        L66:
            long r2 = r10.y()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L71
            r2 = r4
        L71:
            y41 r11 = r10.E()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            java.io.InputStream r11 = r11.Q0()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            int r13 = (int) r2     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r7.c(r11, r13)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L63
            r10.close()     // Catch: java.lang.Exception -> L81
            return
        L81:
            r0 = move-exception
            r11 = r0
            defpackage.gm0.V(r9, r8, r11)
            goto L8f
        L87:
            defpackage.t68.w0(r1, r12, r11, r7)     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto L8f
            r10.close()     // Catch: java.lang.Exception -> L81
        L8f:
            return
        L90:
            if (r10 == 0) goto L9b
            r10.close()     // Catch: java.lang.Exception -> L96
            goto L9b
        L96:
            r0 = move-exception
            r12 = r0
            defpackage.gm0.V(r9, r8, r12)
        L9b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag5.A(y8e, pne):void");
    }

    public dle a() {
        k28 k28Var = (k28) this.a;
        if (k28Var == null) {
            ore.k("url == null");
            return null;
        }
        String str = (String) this.b;
        hu7 hu7VarH = ((p3c) this.c).h();
        hle hleVar = (hle) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        byte[] bArr = uqi.a;
        return new dle(k28Var, str, hu7VarH, hleVar, linkedHashMap.isEmpty() ? s66.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
    }

    public void b(zf5 zf5Var) {
        synchronized (this.a) {
            ((ArrayList) this.c).remove(zf5Var);
        }
    }

    public void d(String str, String str2) {
        ((p3c) this.c).s(str, str2);
    }

    public void e(String str, hle hleVar) {
        if (str.length() <= 0) {
            ore.p("method.isEmpty() == true");
            return;
        }
        if (hleVar == null) {
            if (str.equals(HttpPost.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                c.o(c0a.o("method ", str, " must have a request body."));
                return;
            }
        } else if (!f55.v(str)) {
            c.o(c0a.o("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = hleVar;
    }

    public void f(String str) {
        ((p3c) this.c).n(str);
    }

    public void g(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        if (str == null) {
            linkedHashMap.remove(Object.class);
            return;
        }
        if (linkedHashMap.isEmpty()) {
            this.e = new LinkedHashMap();
        }
        ((LinkedHashMap) this.e).put(Object.class, Object.class.cast(str));
    }

    public void h(String str) {
        if (z5h.K0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (z5h.K0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        t84 t84Var = new t84();
        t84Var.n(null, str);
        this.a = t84Var.c();
    }

    @Override // defpackage.m72
    public void r(y8e y8eVar, IOException iOException) {
        if (iOException.getMessage() == null || !iOException.getMessage().toLowerCase().contains("canceled")) {
            boolean z = iOException instanceof UnknownHostException;
            dle dleVar = (dle) this.b;
            if (z) {
                gm0.W("OkHttpNetworkFetchProducer", "onFailure with UnknownHostException for request %s", dleVar);
            } else {
                gm0.X("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", dleVar);
            }
        }
        t68.w0((t68) this.e, y8eVar, iOException, (xcb) this.c);
    }

    public ag5(mac macVar, nac nacVar, oac oacVar, pac pacVar, qac qacVar) {
        this.a = oacVar;
        this.b = nacVar;
        this.c = macVar;
        this.d = pacVar;
        this.e = qacVar;
    }
}
