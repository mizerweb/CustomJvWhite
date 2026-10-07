package defpackage;

import java.net.Socket;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class tz7 implements af7 {
    public final a2c a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ifh k = new ifh(new d2(23, this));
    public final ifh l = new ifh(new i94(29));

    public tz7(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, a2c a2cVar) {
        this.a = a2cVar;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var5;
        this.e = ny8Var2;
        this.f = ny8Var6;
        this.g = ny8Var;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #10 {all -> 0x007f, blocks: (B:28:0x0057, B:30:0x005d), top: B:63:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #7 {all -> 0x007e, blocks: (B:42:0x0075, B:44:0x007b), top: B:59:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final Object a(tz7 tz7Var, String str, nq4 nq4Var) throws Throwable {
        sz7 sz7Var;
        wfe wfeVar;
        Socket socket;
        Socket socket2;
        if (nq4Var instanceof sz7) {
            sz7Var = (sz7) nq4Var;
            int i = sz7Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sz7Var.g = i - Integer.MIN_VALUE;
            } else {
                sz7Var = new sz7(tz7Var, nq4Var);
            }
        } else {
            sz7Var = new sz7(tz7Var, nq4Var);
        }
        Object obj = sz7Var.e;
        int i2 = sz7Var.g;
        boolean z = true;
        try {
            if (i2 == 0) {
                wfe wfeVarP = nbh.p(obj);
                try {
                    wfeVarP.a = new Socket();
                    iz7 iz7Var = new iz7(str, wfeVarP, 1);
                    sz7Var.d = wfeVarP;
                    sz7Var.g = 1;
                    Object objV = qyj.V(k66.a, iz7Var, sz7Var);
                    hu4 hu4Var = hu4.a;
                    if (objV == hu4Var) {
                        return hu4Var;
                    }
                    wfeVar = wfeVarP;
                    socket2 = (Socket) wfeVar.a;
                    if (socket2 != null) {
                        socket2.close();
                    }
                } catch (InterruptedException e) {
                    throw e;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused) {
                    wfeVar = wfeVarP;
                    socket = (Socket) wfeVar.a;
                    if (socket != null) {
                        socket.close();
                    }
                    z = false;
                } catch (Throwable th) {
                    str = wfeVarP;
                    th = th;
                    try {
                        Socket socket3 = (Socket) str.a;
                        if (socket3 != null) {
                            socket3.close();
                        }
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wfeVar = sz7Var.d;
                try {
                    ch3.d0(obj);
                    try {
                        socket2 = (Socket) wfeVar.a;
                        if (socket2 != null) {
                            socket2.close();
                        }
                    } catch (Throwable unused3) {
                    }
                } catch (InterruptedException e3) {
                    throw e3;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception unused4) {
                    try {
                        socket = (Socket) wfeVar.a;
                        if (socket != null) {
                            socket.close();
                        }
                    } catch (Throwable unused5) {
                    }
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c() {
        if (((Boolean) ((f5d) ((wo6) this.j.getValue())).a.g3.a(e5d.S6[216]).i()).booleanValue()) {
            ((gue) this.g.getValue()).c(new rz7(this));
        }
    }

    @Override // defpackage.af7
    public final /* bridge */ /* synthetic */ Object invoke() {
        c();
        return sbi.a;
    }
}
