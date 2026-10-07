package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class a9m implements sah, hsb {
    public static a9m f;
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public a9m(String str, CharSequence charSequence, int i) {
        this.a = 7;
        if (TextUtils.isEmpty(str)) {
            ore.p("You must specify an action to build a CustomAction");
            throw null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            ore.p("You must specify a name to build a CustomAction");
            throw null;
        }
        if (i == 0) {
            ore.p("You must specify an icon resource id to build a CustomAction");
            throw null;
        }
        this.c = str;
        this.d = charSequence;
        this.b = i;
    }

    public static a9m h(fka fkaVar) throws IOException {
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        ArrayList arrayList = null;
        String strW = null;
        String strW2 = null;
        int i = 0;
        for (int i2 = 0; i2 < iU; i2++) {
            String strS0 = fkaVar.S0();
            strS0.getClass();
            switch (strS0) {
                case "credential":
                    strW2 = ch3.W(fkaVar);
                    break;
                case "username":
                    strW = ch3.W(fkaVar);
                    break;
                case "urls":
                    int iJ = ch3.J(fkaVar);
                    arrayList = new ArrayList(iJ);
                    for (int i3 = 0; i3 < iJ; i3++) {
                        arrayList.add(ch3.W(fkaVar));
                    }
                    if (arrayList.isEmpty()) {
                        i = 1;
                        break;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i = 1;
                                break;
                            } else {
                                String str = (String) it.next();
                                if (str.startsWith("stun:") || str.startsWith("stuns:")) {
                                    i = 3;
                                    break;
                                } else if (str.startsWith("turn:") || str.startsWith("turns:")) {
                                    i = 2;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                default:
                    fkaVar.x();
                    break;
            }
        }
        return new a9m(arrayList, strW, strW2, i, 5);
    }

    public static synchronized a9m l(Context context) {
        try {
            if (f == null) {
                f = new a9m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new aid("MessengerIpcClient", 2))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public HandlerThread a() {
        HandlerThread handlerThread;
        synchronized (this.e) {
            ((ze9) this.c).b("OrchestratorThread", new nhc(0, this));
            this.b++;
            synchronized (this.e) {
                handlerThread = (HandlerThread) this.d;
            }
            if (handlerThread == null) {
                handlerThread = new HandlerThread("one-video-transloader-" + hashCode());
                handlerThread.start();
                this.d = handlerThread;
            }
        }
        return handlerThread;
    }

    public w2d b() {
        return new w2d((String) this.c, (CharSequence) this.d, this.b, (Bundle) this.e);
    }

    public int c() {
        boolean zBooleanValue = ((Boolean) ((ca0) this.c).invoke()).booleanValue();
        gj1 gj1Var = (gj1) this.e;
        int iIntValue = 2;
        if (zBooleanValue) {
            if (((Number) gj1Var.invoke()).intValue() <= 2 && ((Boolean) ((gj1) this.d).invoke()).booleanValue()) {
                iIntValue = 1;
            }
        } else if (((Number) gj1Var.invoke()).intValue() <= 3) {
            iIntValue = ((Number) gj1Var.invoke()).intValue();
        } else if (((Number) gj1Var.invoke()).intValue() != 4) {
            iIntValue = this.b;
        }
        if (iIntValue < 1) {
            return 1;
        }
        return iIntValue;
    }

    public Object d() {
        Object objRemoveLast;
        synchronized (this.d) {
            objRemoveLast = ((ArrayDeque) this.c).removeLast();
        }
        return objRemoveLast;
    }

    public void e(Object obj) {
        Object objD;
        synchronized (this.d) {
            try {
                objD = ((ArrayDeque) this.c).size() >= this.b ? d() : null;
                ((ArrayDeque) this.c).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((dzh) this.e) == null || objD == null) {
            return;
        }
        ((l78) objD).close();
    }

    public int f() {
        int i = this.b;
        if (i == 2) {
            return np0.q;
        }
        if (i != 3) {
            return 0;
        }
        return np0.o;
    }

    public boolean g() {
        boolean zIsEmpty;
        synchronized (this.d) {
            zIsEmpty = ((ArrayDeque) this.c).isEmpty();
        }
        return zIsEmpty;
    }

    @Override // defpackage.sah
    public Object get() {
        rg0 rg0Var = (rg0) this.d;
        tvj.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        gh0 gh0Var = (gh0) this.e;
        int i = gh0Var.c;
        int i2 = rg0Var.d;
        int i3 = gh0Var.e;
        int i4 = rg0Var.c;
        int iE = nwk.e(i, i2, i3, i4, gh0Var.d);
        tw5 tw5Var = new tw5();
        tw5Var.b = -1;
        tw5Var.a = (String) this.c;
        tw5Var.b = Integer.valueOf(this.b);
        tw5Var.c = msh.a;
        tw5Var.g = Integer.valueOf(i2);
        tw5Var.e = Integer.valueOf(rg0Var.b);
        tw5Var.f = Integer.valueOf(i4);
        tw5Var.d = Integer.valueOf(iE);
        return tw5Var.i();
    }

    public lsb i(ksb ksbVar) throws InterruptedIOException {
        i18 i18Var = (i18) this.c;
        zo zoVar = ksbVar.a;
        int i = this.b;
        List list = (List) this.e;
        if (i < list.size()) {
            return ((isb) list.get(i)).intercept(new a9m(i18Var, ksbVar, list, i + 1, 9));
        }
        try {
            return new lsb(i18Var.a(zoVar, ksbVar.b));
        } catch (InterruptedIOException e) {
            if (zoVar instanceof jsb) {
                return new lsb(((jsb) zoVar).handleInterruptedIO());
            }
            throw e;
        }
    }

    public void j() {
        HandlerThread handlerThread;
        synchronized (this.e) {
            try {
                if (this.b <= 0) {
                    throw new IllegalStateException("release() called without matching acquire()");
                }
                ((ze9) this.c).b("OrchestratorThread", new nhc(1, this));
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    synchronized (this.e) {
                        handlerThread = (HandlerThread) this.d;
                    }
                    if (handlerThread == null) {
                        throw new IllegalStateException("Handler thread is missing upon release()");
                    }
                    handlerThread.quitSafely();
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(Bundle bundle) {
        this.e = bundle;
    }

    public synchronized kam m(g3m g3mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(g3mVar.toString()));
            }
            if (!((azl) this.e).d(g3mVar)) {
                azl azlVar = new azl(this);
                this.e = azlVar;
                azlVar.d(g3mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return g3mVar.b.a;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 5:
                String strValueOf = String.valueOf((List) this.c);
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                int i = this.b;
                if (i == 1) {
                    str = "UNKNOWN";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "STUN";
                } else {
                    str = "TURN";
                }
                return nbh.y(qv1.q("{urls=", strValueOf, ", username='", str2, "', credential='"), str3, "', type=", str, "}");
            default:
                return super.toString();
        }
    }

    public a9m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.e = new azl(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public a9m(ze9 ze9Var) {
        this.a = 6;
        this.c = ze9Var;
        this.e = new Object();
    }

    public a9m(String str, int i, xb0 xb0Var, rg0 rg0Var, gh0 gh0Var) {
        this.a = 2;
        this.c = str;
        this.b = i;
        this.d = rg0Var;
        this.e = gh0Var;
    }

    public a9m(int i, dzh dzhVar) {
        this.a = 1;
        this.d = new Object();
        this.b = i;
        this.c = new ArrayDeque(i);
        this.e = dzhVar;
    }

    public a9m(Context context) {
        this.a = 4;
        this.c = context.getApplicationContext();
        this.d = new o75(4);
        this.b = -2000;
        this.e = qt9.I0;
    }

    public a9m(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = 10;
        this.c = str;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.d = listUnmodifiableList;
        this.e = bArr;
    }

    public a9m(ca0 ca0Var, gj1 gj1Var, int i, gj1 gj1Var2) {
        this.a = 3;
        this.c = ca0Var;
        this.d = gj1Var;
        this.b = i;
        this.e = gj1Var2;
    }

    public a9m(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.a = 8;
        this.c = uuid;
        this.b = i;
        this.d = bArr;
        this.e = uuidArr;
    }

    public /* synthetic */ a9m(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
