package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class sv6 implements tv6 {
    public static final Object m = new Object();
    public final ov6 a;
    public final pv6 b;
    public final fik c;
    public final yqi d;
    public final oy8 e;
    public final j4e f;
    public final Object g;
    public final ExecutorService h;
    public final dif i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public sv6(ov6 ov6Var, xwd xwdVar, ExecutorService executorService, dif difVar) {
        ov6Var.a();
        pv6 pv6Var = new pv6(ov6Var.a, xwdVar);
        fik fikVar = new fik(ov6Var);
        if (lu8.a == null) {
            lu8.a = new lu8();
        }
        lu8 lu8Var = lu8.a;
        if (yqi.c == null) {
            yqi.c = new yqi(lu8Var);
        }
        yqi yqiVar = yqi.c;
        oy8 oy8Var = new oy8(new qv6(0, ov6Var));
        j4e j4eVar = new j4e();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = ov6Var;
        this.b = pv6Var;
        this.c = fikVar;
        this.d = yqiVar;
        this.e = oy8Var;
        this.f = j4eVar;
        this.h = executorService;
        this.i = difVar;
    }

    public static sv6 d(ov6 ov6Var) {
        ov6Var.a();
        return (sv6) ov6Var.d.a(tv6.class);
    }

    public final void a() {
        ki0 ki0VarA;
        synchronized (m) {
            try {
                ov6 ov6Var = this.a;
                ov6Var.a();
                kzi kziVarL = kzi.l(ov6Var.a);
                try {
                    ki0VarA = this.c.A();
                    int i = ki0VarA.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strG = g(ki0VarA);
                        fik fikVar = this.c;
                        ji0 ji0VarA = ki0VarA.a();
                        ji0VarA.b = strG;
                        ji0VarA.a = 3;
                        ki0VarA = ji0VarA.a();
                        fikVar.s(ki0VarA);
                    }
                    if (kziVarL != null) {
                        kziVarL.A();
                    }
                } catch (Throwable th) {
                    if (kziVarL != null) {
                        kziVarL.A();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j(ki0VarA);
        this.i.execute(new rv6(this, 2));
    }

    public final ki0 b(ki0 ki0Var) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionC;
        hj0 hj0VarF;
        pv6 pv6Var = this.b;
        ov6 ov6Var = this.a;
        ov6Var.a();
        String str = ov6Var.c.a;
        String str2 = ki0Var.a;
        ov6 ov6Var2 = this.a;
        ov6Var2.a();
        String str3 = ov6Var2.c.g;
        String str4 = ki0Var.d;
        zg2 zg2Var = pv6Var.c;
        if (!zg2Var.e()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = pv6.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = pv6Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.addRequestProperty(AUTH.WWW_AUTH_RESP, "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    pv6.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    zg2Var.f(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        hj0VarF = pv6.f(httpURLConnectionC);
                        break;
                    }
                    pv6.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        ed7 ed7VarA = hj0.a();
                        ed7VarA.b = 3;
                        hj0VarF = ed7VarA.A();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        ed7 ed7VarA2 = hj0.a();
                        ed7VarA2.b = 2;
                        hj0VarF = ed7VarA2.A();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iD = qt4.D(hj0VarF.c);
        if (iD == 0) {
            String str5 = hj0VarF.a;
            long j = hj0VarF.b;
            this.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            ji0 ji0VarA = ki0Var.a();
            ji0VarA.c = str5;
            ji0VarA.f = Long.valueOf(j);
            ji0VarA.g = Long.valueOf(jCurrentTimeMillis);
            return ji0VarA.a();
        }
        if (iD == 1) {
            ji0 ji0VarA2 = ki0Var.a();
            ji0VarA2.e = "BAD CONFIG";
            ji0VarA2.a = 5;
            return ji0VarA2.a();
        }
        if (iD != 2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.j = null;
        }
        ji0 ji0VarA3 = ki0Var.a();
        ji0VarA3.a = 2;
        return ji0VarA3.a();
    }

    public final kam c() {
        String str;
        f();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return gwl.e(str);
        }
        qjh qjhVar = new qjh();
        gl7 gl7Var = new gl7(qjhVar);
        synchronized (this.g) {
            this.l.add(gl7Var);
        }
        kam kamVar = qjhVar.a;
        this.h.execute(new rv6(this, 0));
        return kamVar;
    }

    public final kam e() {
        f();
        qjh qjhVar = new qjh();
        kk7 kk7Var = new kk7(this.d, qjhVar);
        synchronized (this.g) {
            this.l.add(kk7Var);
        }
        kam kamVar = qjhVar.a;
        this.h.execute(new rv6(this, 1));
        return kamVar;
    }

    public final void f() {
        ov6 ov6Var = this.a;
        ov6Var.a();
        yab.q(ov6Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ov6Var.a();
        yab.q(ov6Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ov6Var.a();
        yab.q(ov6Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        ov6Var.a();
        String str = ov6Var.c.b;
        Pattern pattern = yqi.b;
        yab.n("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        ov6Var.a();
        yab.n("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", yqi.b.matcher(ov6Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String g(ki0 ki0Var) {
        n48 n48Var;
        String string;
        ov6 ov6Var = this.a;
        ov6Var.a();
        if (!ov6Var.b.equals("CHIME_ANDROID_SDK")) {
            ov6 ov6Var2 = this.a;
            ov6Var2.a();
            if ("[DEFAULT]".equals(ov6Var2.b)) {
                if (ki0Var.b == 1) {
                    n48Var = (n48) this.e.get();
                    synchronized (n48Var.a) {
                        try {
                            synchronized (n48Var.a) {
                                string = n48Var.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = n48Var.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return j4e.a();
                }
            }
        } else if (ki0Var.b == 1) {
            n48Var = (n48) this.e.get();
            synchronized (n48Var.a) {
                synchronized (n48Var.a) {
                    string = n48Var.a.getString("|S|id", null);
                    if (string != null) {
                        string = n48Var.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return j4e.a();
                }
            }
        }
        this.f.getClass();
        return j4e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [pv6] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [uh0] */
    public final ki0 h(ki0 ki0Var) throws FirebaseInstallationsException {
        String str = ki0Var.a;
        String string = null;
        if (str != null && str.length() == 11) {
            n48 n48Var = (n48) this.e.get();
            synchronized (n48Var.a) {
                try {
                    String[] strArr = n48.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = n48Var.a.getString("|T|" + n48Var.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(ApiProtocol.KEY_TOKEN);
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pv6 pv6Var = this.b;
        ov6 ov6Var = this.a;
        ov6Var.a();
        String str3 = ov6Var.c.a;
        String str4 = ki0Var.a;
        ov6 ov6Var2 = this.a;
        ov6Var2.a();
        String str5 = ov6Var2.c.g;
        ov6 ov6Var3 = this.a;
        ov6Var3.a();
        String str6 = ov6Var3.c.b;
        zg2 zg2Var = pv6Var.c;
        if (!zg2Var.e()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = pv6.a("projects/" + str5 + "/installations");
        int i2 = 0;
        uh0 uh0Var = pv6Var;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = uh0Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    pv6.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    zg2Var.f(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        uh0 uh0VarE = pv6.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        uh0Var = uh0VarE;
                    } else {
                        try {
                            pv6.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                uh0 uh0Var2 = new uh0(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                uh0Var = uh0Var2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                uh0Var = uh0Var;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    int iD = qt4.D(uh0Var.e);
                    if (iD != 0) {
                        if (iD != 1) {
                            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        ji0 ji0VarA = ki0Var.a();
                        ji0VarA.e = "BAD CONFIG";
                        ji0VarA.a = 5;
                        return ji0VarA.a();
                    }
                    String str7 = uh0Var.b;
                    String str8 = uh0Var.c;
                    this.d.a.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    hj0 hj0Var = uh0Var.d;
                    String str9 = hj0Var.a;
                    long j = hj0Var.b;
                    ji0 ji0VarA2 = ki0Var.a();
                    ji0VarA2.b = str7;
                    ji0VarA2.a = 4;
                    ji0VarA2.c = str9;
                    ji0VarA2.d = str8;
                    ji0VarA2.f = Long.valueOf(j);
                    ji0VarA2.g = Long.valueOf(jCurrentTimeMillis);
                    return ji0VarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void i(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((rjg) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(ki0 ki0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((rjg) it.next()).b(ki0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
