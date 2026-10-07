package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class oe9 {
    public final int a;
    public final Context b;
    public final Object c;
    public volatile int d;
    public zv e;
    public final AtomicBoolean f;
    public int g;
    public File h;
    public final qd9 i;

    public oe9(Context context, int i) {
        this.a = i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.b = applicationContext;
        this.c = new Object();
        this.d = 1;
        this.f = new AtomicBoolean(true);
        this.g = 1;
        this.i = new qd9(i);
    }

    public final void a(int i) {
        if (qt4.d(this.d, i) >= 0) {
            return;
        }
        synchronized (this.c) {
            try {
                int i2 = this.d;
                if (qt4.d(i2, i) >= 0) {
                    return;
                }
                Context context = this.b;
                String strP = ch3.p();
                File fileQ0 = lu6.q0(new File(context.getCacheDir(), strP.equals(context.getPackageName()) ? "tracer" : "tracer-" + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)))), "logs");
                File fileQ1 = lu6.q0(fileQ0, "a.log");
                File fileQ2 = lu6.q0(fileQ0, "b.log");
                File fileQ3 = lu6.q0(fileQ0, "stash-a.log");
                File fileQ4 = lu6.q0(fileQ0, "stash-b.log");
                int iD = qt4.D(i2);
                if (iD == 0) {
                    int iD2 = qt4.D(i);
                    if (iD2 == 1) {
                        ku6.e(fileQ3, fileQ4);
                        ylc[] ylcVarArr = {new ylc(fileQ1, fileQ3), new ylc(fileQ2, fileQ4)};
                        for (int i3 = 0; i3 < 2; i3++) {
                            ylc ylcVar = ylcVarArr[i3];
                            File file = (File) ylcVar.a;
                            File file2 = (File) ylcVar.b;
                            if (file.exists()) {
                                try {
                                    file.renameTo(file2);
                                } catch (IOException unused) {
                                    file.toString();
                                    Objects.toString(file2);
                                }
                            }
                        }
                    } else if (iD2 == 2) {
                        this.e = ku6.l(new File[]{fileQ1, fileQ2}, this.a);
                        ku6.e(fileQ1, fileQ2);
                    } else {
                        if (iD2 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        ku6.e(fileQ3, fileQ4);
                        ku6.e(fileQ1, fileQ2);
                    }
                } else if (iD == 1) {
                    int iD3 = qt4.D(i);
                    if (iD3 == 2) {
                        this.e = ku6.l(new File[]{fileQ3, fileQ4}, this.a);
                        ku6.e(fileQ3, fileQ4);
                    } else {
                        if (iD3 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        ku6.e(fileQ3, fileQ4);
                    }
                } else {
                    if (iD != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (ne9.$EnumSwitchMapping$1[qt4.D(i)] != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    this.e = null;
                }
                this.d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zv b() {
        a(3);
        zv zvVar = this.e;
        if (zvVar != null) {
            return zvVar;
        }
        ore.k("Cannot get prev logs after clear");
        return null;
    }

    public final void c(Iterable iterable, boolean z) {
        try {
            File file = this.h;
            if (file == null) {
                file = null;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file, z));
            try {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    be9 be9Var = (be9) it.next();
                    dataOutputStream.writeLong(be9Var.a);
                    byte[] bArr = be9Var.b;
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                }
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void d() {
        if (this.f.getAndSet(true)) {
            return;
        }
        synchronized (this.c) {
            try {
                a(3);
                ArrayList arrayList = new ArrayList(b());
                if (arrayList.isEmpty()) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bytes = "Preserved logs from previous session".getBytes(pt2.a);
                SimpleDateFormat simpleDateFormat = de9.a;
                int i = Integer.MAX_VALUE;
                if (bytes.length > Integer.MAX_VALUE) {
                    if ((bytes[2147483647] & 192) == 128) {
                        do {
                            i--;
                            if (i < 0) {
                                break;
                            }
                        } while ((bytes[i] & 192) == 128);
                    }
                    bytes = a.T0(0, bytes, i);
                }
                arrayList.add(new be9(jCurrentTimeMillis, bytes));
                while (!arrayList.isEmpty()) {
                    be9 be9Var = (be9) (arrayList.isEmpty() ? null : arrayList.remove(xw3.O0(arrayList)));
                    if (be9Var != null) {
                        qd9 qd9Var = this.i;
                        synchronized (qd9Var.b) {
                            int i2 = be9Var.c;
                            if (qd9Var.c + i2 <= qd9Var.a) {
                                qd9Var.b.addFirst(be9Var);
                                qd9Var.c += i2;
                            }
                        }
                        break;
                    }
                    break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
