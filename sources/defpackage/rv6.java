package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rv6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv6 b;

    public /* synthetic */ rv6(sv6 sv6Var, int i) {
        this.a = i;
        this.b = sv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ki0 ki0VarA;
        ki0 ki0VarH;
        int i = this.a;
        sv6 sv6Var = this.b;
        switch (i) {
            case 0:
                sv6Var.a();
                return;
            case 1:
                sv6Var.a();
                return;
            default:
                Object obj = sv6.m;
                synchronized (obj) {
                    try {
                        ov6 ov6Var = sv6Var.a;
                        ov6Var.a();
                        kzi kziVarL = kzi.l(ov6Var.a);
                        try {
                            ki0VarA = sv6Var.c.A();
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
                try {
                    int i2 = ki0VarA.b;
                    if (i2 == 5) {
                        ki0VarH = sv6Var.h(ki0VarA);
                    } else {
                        if (i2 == 3) {
                            ki0VarH = sv6Var.h(ki0VarA);
                        } else if (!sv6Var.d.a(ki0VarA)) {
                            return;
                        } else {
                            ki0VarH = sv6Var.b(ki0VarA);
                        }
                    }
                    synchronized (obj) {
                        try {
                            ov6 ov6Var2 = sv6Var.a;
                            ov6Var2.a();
                            kzi kziVarL2 = kzi.l(ov6Var2.a);
                            try {
                                sv6Var.c.s(ki0VarH);
                                if (kziVarL2 != null) {
                                    kziVarL2.A();
                                }
                            } catch (Throwable th3) {
                                if (kziVarL2 != null) {
                                    kziVarL2.A();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (sv6Var) {
                        try {
                            if (sv6Var.k.size() != 0 && !TextUtils.equals(ki0VarA.a, ki0VarH.a)) {
                                Iterator it = sv6Var.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (ki0VarH.b == 4) {
                        String str = ki0VarH.a;
                        synchronized (sv6Var) {
                            sv6Var.j = str;
                        }
                    }
                    int i3 = ki0VarH.b;
                    if (i3 == 5) {
                        sv6Var.i(new FirebaseInstallationsException());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        sv6Var.i(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        sv6Var.j(ki0VarH);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    sv6Var.i(e);
                    return;
                }
        }
    }
}
