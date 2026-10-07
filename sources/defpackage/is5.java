package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.database.DatabaseIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class is5 extends Handler {
    public final HandlerThread a;
    public final y95 b;
    public final xtj c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public is5(HandlerThread handlerThread, y95 y95Var, xtj xtjVar, Handler handler) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = y95Var;
        this.c = xtjVar;
        this.d = handler;
        this.i = 3;
        this.j = 5;
        this.h = true;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static rp5 a(rp5 rp5Var, int i, int i2) {
        return new rp5(rp5Var.a, i, rp5Var.c, System.currentTimeMillis(), rp5Var.e, i2, 0, rp5Var.h);
    }

    public final rp5 b(String str, boolean z) {
        int iC = c(str);
        if (iC != -1) {
            return (rp5) this.e.get(iC);
        }
        if (!z) {
            return null;
        }
        try {
            return this.b.d(str);
        } catch (IOException e) {
            lvb.l0("DownloadManager", "Failed to load download: " + str, e);
            return null;
        }
    }

    public final int c(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((rp5) arrayList.get(i)).a.a.equals(str)) {
                return i;
            }
            i++;
        }
    }

    public final void d(rp5 rp5Var) {
        int i = rp5Var.b;
        lvb.b0((i == 3 || i == 4) ? false : true);
        int iC = c(rp5Var.a.a);
        ArrayList arrayList = this.e;
        if (iC == -1) {
            arrayList.add(rp5Var);
            Collections.sort(arrayList, new ps0(13));
        } else {
            boolean z = rp5Var.c != ((rp5) arrayList.get(iC)).c;
            arrayList.set(iC, rp5Var);
            if (z) {
                Collections.sort(arrayList, new ps0(13));
            }
        }
        try {
            this.b.i(rp5Var);
        } catch (IOException e) {
            lvb.l0("DownloadManager", "Failed to update index.", e);
        }
        this.d.obtainMessage(3, new hs5(rp5Var, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final rp5 e(rp5 rp5Var, int i, int i2) {
        lvb.b0((i == 3 || i == 4) ? false : true);
        rp5 rp5VarA = a(rp5Var, i, i2);
        d(rp5VarA);
        return rp5VarA;
    }

    public final void f(rp5 rp5Var, int i) {
        if (i == 0) {
            if (rp5Var.b == 1) {
                e(rp5Var, 0, 0);
            }
        } else if (i != rp5Var.f) {
            int i2 = rp5Var.b;
            if (i2 == 0 || i2 == 2) {
                i2 = 1;
            }
            d(new rp5(rp5Var.a, i2, rp5Var.c, System.currentTimeMillis(), rp5Var.e, i, 0, rp5Var.h));
        }
    }

    public final void g() {
        js5 js5Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            rp5 rp5Var = (rp5) arrayList.get(i);
            ss5 ss5Var = rp5Var.a;
            String str = ss5Var.a;
            HashMap map = this.f;
            js5 js5Var2 = (js5) map.get(str);
            int i3 = rp5Var.b;
            xtj xtjVar = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        js5Var2.getClass();
                        lvb.b0(!js5Var2.d);
                        if (this.h || this.g != 0 || i2 >= this.i) {
                            e(rp5Var, 0, 0);
                            js5Var2.a(false);
                        }
                    } else {
                        if (i3 != 5 && i3 != 7) {
                            c.t();
                            return;
                        }
                        if (js5Var2 != null) {
                            if (!js5Var2.d) {
                                js5Var2.a(false);
                            }
                        } else if (!this.l) {
                            js5 js5Var3 = new js5(rp5Var.a, xtjVar.r(ss5Var), rp5Var.h, true, this.j, this);
                            map.put(ss5Var.a, js5Var3);
                            this.l = true;
                            js5Var3.start();
                        }
                    }
                } else if (js5Var2 != null) {
                    lvb.b0(!js5Var2.d);
                    js5Var2.a(false);
                }
            } else if (js5Var2 != null) {
                lvb.b0(!js5Var2.d);
                js5Var2.a(false);
            } else {
                if (this.h || this.g != 0 || this.k >= this.i) {
                    js5Var = null;
                } else {
                    rp5 rp5VarE = e(rp5Var, 2, 0);
                    ss5 ss5Var2 = rp5VarE.a;
                    js5Var = new js5(rp5VarE.a, xtjVar.r(ss5Var2), rp5VarE.h, false, this.j, this);
                    map.put(ss5Var2.a, js5Var);
                    int i4 = this.k;
                    this.k = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    js5Var.start();
                }
                js5Var2 = js5Var;
            }
            if (js5Var2 != null && !js5Var2.d) {
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        boolean z;
        x95 x95Var = null;
         = 0;
        ?? r10 = 0;
        switch (message.what) {
            case 1:
                int i = message.arg1;
                y95 y95Var = this.b;
                ArrayList arrayList = this.e;
                this.g = i;
                try {
                    try {
                        y95Var.l();
                        y95Var.b();
                        x95 x95Var2 = new x95(y95Var.c(y95.g(0, 1, 2, 5, 7), null));
                        while (true) {
                            try {
                                Cursor cursor = x95Var2.a;
                                if (cursor.moveToPosition(cursor.getPosition() + 1)) {
                                    arrayList.add(y95.e(x95Var2.a));
                                } else {
                                    vqi.h(x95Var2);
                                }
                            } catch (IOException e) {
                                e = e;
                                x95Var = x95Var2;
                                lvb.l0("DownloadManager", "Failed to load index.", e);
                                arrayList.clear();
                                vqi.h(x95Var);
                            } catch (Throwable th) {
                                th = th;
                                x95Var = x95Var2;
                                vqi.h(x95Var);
                                throw th;
                            }
                            z = true;
                            this.d.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                            g();
                            r10 = z;
                            this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                break;
            case 2:
                this.h = message.arg1 != 0;
                g();
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 3:
                this.g = message.arg1;
                g();
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 4:
                String str = (String) message.obj;
                int i2 = message.arg1;
                y95 y95Var2 = this.b;
                ArrayList arrayList2 = this.e;
                if (str != null) {
                    rp5 rp5VarB = b(str, false);
                    if (rp5VarB != null) {
                        f(rp5VarB, i2);
                    } else {
                        try {
                            y95Var2.n(i2, str);
                        } catch (IOException e3) {
                            lvb.l0("DownloadManager", "Failed to set manual stop reason: ".concat(str), e3);
                        }
                    }
                    break;
                } else {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        f((rp5) arrayList2.get(i3), i2);
                    }
                    try {
                        y95Var2.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i2));
                            y95Var2.b.getWritableDatabase().update("ExoPlayerDownloads", contentValues, y95.e, null);
                        } catch (SQLException e4) {
                            throw new DatabaseIOException((Throwable) e4);
                        }
                    } catch (IOException e5) {
                        lvb.l0("DownloadManager", "Failed to set manual stop reason", e5);
                    }
                    break;
                }
                g();
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 5:
                this.i = message.arg1;
                g();
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 6:
                this.j = message.arg1;
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 7:
                ss5 ss5Var = (ss5) message.obj;
                int i4 = message.arg1;
                rp5 rp5VarB2 = b(ss5Var.a, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (rp5VarB2 != null) {
                    int i5 = rp5VarB2.b;
                    long j = (i5 == 5 || i5 == 3 || i5 == 4) ? jCurrentTimeMillis : rp5VarB2.c;
                    d(new rp5(rp5VarB2.a.a(ss5Var), (i5 == 5 || i5 == 7) ? 7 : i4 != 0 ? 1 : 0, j, jCurrentTimeMillis, i4));
                } else {
                    d(new rp5(ss5Var, i4 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i4));
                }
                g();
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 8:
                String str2 = (String) message.obj;
                rp5 rp5VarB3 = b(str2, true);
                if (rp5VarB3 == null) {
                    lvb.k0("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    e(rp5VarB3, 5, 0);
                    g();
                }
                z = true;
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 9:
                z = true;
                y95 y95Var3 = this.b;
                ArrayList arrayList3 = this.e;
                ArrayList arrayList4 = new ArrayList();
                try {
                    y95Var3.b();
                    Cursor cursorC = y95Var3.c(y95.g(3, 4), null);
                    while (cursorC.moveToPosition(cursorC.getPosition() + 1)) {
                        try {
                            arrayList4.add(y95.e(cursorC));
                        } catch (Throwable th3) {
                            try {
                                cursorC.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    cursorC.close();
                } catch (IOException unused) {
                    lvb.k0("DownloadManager", "Failed to load downloads.");
                }
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    arrayList3.set(i6, a((rp5) arrayList3.get(i6), 5, 0));
                }
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    arrayList3.add(a((rp5) arrayList4.get(i7), 5, 0));
                }
                Collections.sort(arrayList3, new ps0(13));
                try {
                    y95Var3.m();
                    break;
                } catch (IOException e6) {
                    lvb.l0("DownloadManager", "Failed to update index.", e6);
                }
                ArrayList arrayList5 = new ArrayList(arrayList3);
                for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                    this.d.obtainMessage(3, new hs5((rp5) arrayList3.get(i8), false, arrayList5, null)).sendToTarget();
                }
                g();
                r10 = z;
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 10:
                js5 js5Var = (js5) message.obj;
                String str3 = js5Var.a.a;
                this.f.remove(str3);
                boolean z2 = js5Var.d;
                if (z2) {
                    this.l = false;
                } else {
                    int i9 = this.k - 1;
                    this.k = i9;
                    if (i9 == 0) {
                        removeMessages(12);
                    }
                }
                if (!js5Var.g) {
                    Exception exc = js5Var.h;
                    if (exc != null) {
                        lvb.l0("DownloadManager", "Task failed: " + js5Var.a + ", " + z2, exc);
                    }
                    rp5 rp5VarB4 = b(str3, false);
                    rp5VarB4.getClass();
                    int i10 = rp5VarB4.b;
                    if (i10 == 2) {
                        lvb.b0(!z2);
                        ArrayList arrayList6 = this.e;
                        rp5 rp5Var = new rp5(rp5VarB4.a, exc == null ? 3 : 4, rp5VarB4.c, System.currentTimeMillis(), rp5VarB4.e, rp5VarB4.f, exc == null ? 0 : 1, rp5VarB4.h);
                        arrayList6.remove(c(rp5Var.a.a));
                        try {
                            this.b.i(rp5Var);
                        } catch (IOException e7) {
                            lvb.l0("DownloadManager", "Failed to update index.", e7);
                        }
                        this.d.obtainMessage(3, new hs5(rp5Var, false, new ArrayList(arrayList6), exc)).sendToTarget();
                    } else {
                        if (i10 != 5 && i10 != 7) {
                            c.t();
                            return;
                        }
                        lvb.b0(z2);
                        ArrayList arrayList7 = this.e;
                        int i11 = rp5VarB4.b;
                        ss5 ss5Var2 = rp5VarB4.a;
                        if (i11 == 7) {
                            int i12 = rp5VarB4.f;
                            e(rp5VarB4, i12 == 0 ? 0 : 1, i12);
                            g();
                        } else {
                            arrayList7.remove(c(ss5Var2.a));
                            try {
                                this.b.k(ss5Var2.a);
                            } catch (IOException unused2) {
                                lvb.k0("DownloadManager", "Failed to remove from database");
                            }
                            this.d.obtainMessage(3, new hs5(rp5VarB4, true, new ArrayList(arrayList7), null)).sendToTarget();
                        }
                    }
                    g();
                    break;
                } else {
                    g();
                }
                this.d.obtainMessage(2, r10, this.f.size()).sendToTarget();
                return;
            case 11:
                js5 js5Var2 = (js5) message.obj;
                int i13 = message.arg1;
                int i14 = message.arg2;
                String str4 = vqi.a;
                long j2 = ((((long) i13) & 4294967295L) << 32) | (4294967295L & ((long) i14));
                rp5 rp5VarB5 = b(js5Var2.a.a, false);
                rp5VarB5.getClass();
                if (j2 == rp5VarB5.e || j2 == -1) {
                    return;
                }
                d(new rp5(rp5VarB5.a, rp5VarB5.b, rp5VarB5.c, System.currentTimeMillis(), j2, rp5VarB5.f, rp5VarB5.g, rp5VarB5.h));
                return;
            case 12:
                ArrayList arrayList8 = this.e;
                for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                    rp5 rp5Var2 = (rp5) arrayList8.get(i15);
                    if (rp5Var2.b == 2) {
                        try {
                            this.b.i(rp5Var2);
                        } catch (IOException e8) {
                            lvb.l0("DownloadManager", "Failed to update index.", e8);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, 5000L);
                return;
            case 13:
                Iterator it = this.f.values().iterator();
                while (it.hasNext()) {
                    ((js5) it.next()).a(true);
                }
                try {
                    this.b.l();
                    break;
                } catch (IOException e9) {
                    lvb.l0("DownloadManager", "Failed to update index.", e9);
                }
                this.e.clear();
                this.a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                c.t();
                return;
        }
    }
}
