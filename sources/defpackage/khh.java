package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class khh {
    public final Context a;
    public final Object b;
    public volatile int c;
    public List d;
    public final ArrayList e;

    public khh(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.a = applicationContext;
        this.b = new Object();
        this.c = 1;
        this.e = new ArrayList();
    }

    public final void a(int i) {
        String str;
        List listO0;
        if (qt4.d(this.c, i) >= 0) {
            return;
        }
        synchronized (this.b) {
            try {
                int i2 = this.c;
                if (qt4.d(i2, i) >= 0) {
                    return;
                }
                Context context = this.a;
                String strP = ch3.p();
                if (strP.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)));
                }
                File fileQ0 = lu6.q0(new File(context.getCacheDir(), str), "tags");
                int iD = qt4.D(i2);
                if (iD == 0) {
                    int iD2 = qt4.D(i);
                    if (iD2 == 1) {
                        if (fileQ0.exists()) {
                            try {
                                listO0 = lu6.o0(fileQ0);
                            } catch (IOException unused) {
                                fileQ0.toString();
                                listO0 = r66.a;
                            }
                        } else {
                            listO0 = r66.a;
                        }
                        this.d = listO0;
                    } else {
                        if (iD2 != 2) {
                            throw new AssertionError("Unreachable code");
                        }
                        if (fileQ0.exists()) {
                            try {
                                sb8.o(fileQ0);
                            } catch (IOException unused2) {
                                fileQ0.toString();
                            }
                        }
                    }
                } else {
                    if (iD != 1) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (jhh.$EnumSwitchMapping$0[qt4.D(i)] != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (fileQ0.exists()) {
                        try {
                            sb8.o(fileQ0);
                        } catch (IOException unused3) {
                            fileQ0.toString();
                        }
                    }
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Map map) {
        boolean zW;
        synchronized (this.e) {
            zW = false;
            for (Map.Entry entry : map.entrySet()) {
                zW |= ku6.w((String) entry.getKey(), (String) entry.getValue(), this.e);
            }
        }
        if (zW) {
            yxh.a(new hed(8, this));
        }
    }
}
