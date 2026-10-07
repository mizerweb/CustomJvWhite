package defpackage;

import java.net.Socket;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes.dex */
public final class mz7 {
    public static final long e;
    public final vo5 a;
    public final w69 b;
    public final oqg c;
    public final xhh d;

    static {
        ghb ghbVar = ew5.b;
        e = qe7.P(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, lw5.MILLISECONDS);
    }

    public mz7(vo5 vo5Var, w69 w69Var, oqg oqgVar, xhh xhhVar) {
        this.a = vo5Var;
        this.b = w69Var;
        this.c = oqgVar;
        this.d = xhhVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #5 {all -> 0x005a, blocks: (B:24:0x0051, B:26:0x0057), top: B:47:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #6 {all -> 0x006d, blocks: (B:32:0x0064, B:34:0x006a), top: B:49:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #3 {all -> 0x0077, blocks: (B:36:0x006e, B:38:0x0074), top: B:45:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(mz7 mz7Var, String str, nq4 nq4Var) {
        lz7 lz7Var;
        wfe wfeVar;
        Throwable th;
        Socket socket;
        Socket socket2;
        Socket socket3;
        if (nq4Var instanceof lz7) {
            lz7Var = (lz7) nq4Var;
            int i = lz7Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lz7Var.g = i - Integer.MIN_VALUE;
            } else {
                lz7Var = new lz7(mz7Var, nq4Var);
            }
        } else {
            lz7Var = new lz7(mz7Var, nq4Var);
        }
        Object obj = lz7Var.e;
        int i2 = lz7Var.g;
        boolean z = false;
        if (i2 == 0) {
            wfe wfeVarP = nbh.p(obj);
            try {
                wfeVarP.a = new Socket();
                iz7 iz7Var = new iz7(str, wfeVarP, 0);
                lz7Var.d = wfeVarP;
                lz7Var.g = 1;
                Object objV = qyj.V(k66.a, iz7Var, lz7Var);
                hu4 hu4Var = hu4.a;
                if (objV == hu4Var) {
                    return hu4Var;
                }
                wfeVar = wfeVarP;
                socket3 = (Socket) wfeVar.a;
                if (socket3 != null) {
                    socket3.close();
                }
                z = true;
            } catch (Exception unused) {
                wfeVar = wfeVarP;
                socket2 = (Socket) wfeVar.a;
                if (socket2 != null) {
                    socket2.close();
                }
            } catch (Throwable th2) {
                wfeVar = wfeVarP;
                th = th2;
                socket = (Socket) wfeVar.a;
                if (socket != null) {
                    socket.close();
                }
                throw th;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar = lz7Var.d;
            try {
                ch3.d0(obj);
                try {
                    socket3 = (Socket) wfeVar.a;
                    if (socket3 != null) {
                        socket3.close();
                    }
                } catch (Throwable unused2) {
                }
                z = true;
            } catch (Exception unused3) {
                try {
                    socket2 = (Socket) wfeVar.a;
                    if (socket2 != null) {
                        socket2.close();
                    }
                } catch (Throwable unused4) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    socket = (Socket) wfeVar.a;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Throwable unused5) {
                }
                throw th;
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object b(mdh mdhVar) {
        return yab.K0(((n0c) this.d).d(), new he1(this, null), mdhVar);
    }
}
