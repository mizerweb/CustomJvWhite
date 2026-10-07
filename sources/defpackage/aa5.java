package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class aa5 extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa5(nv9 nv9Var, Looper looper) {
        super(looper);
        this.c = nv9Var;
        this.b = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object defaultDrmSession$UnexpectedDrmSessionException;
        Object objC;
        t99 t99Var;
        int repeatMode;
        boolean zIsCaptioningEnabled;
        switch (this.a) {
            case 0:
                ba5 ba5Var = (ba5) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        objC = ((ca5) this.c).k.c((ff6) ba5Var.d);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        ca5 ca5Var = (ca5) this.c;
                        vv9 vv9VarB = ca5Var.k.b(ca5Var.l, (ef6) ba5Var.d);
                        synchronized (((ca5) this.c).o) {
                            try {
                                ks9 ks9Var = ((ca5) this.c).y;
                                if (ks9Var != null && (t99Var = vv9VarB.b) != null) {
                                    ((z88) ks9Var.b).c(new t99(t99Var.a, t99Var.b, t99Var.c, t99Var.d, SystemClock.elapsedRealtime() - ba5Var.c, t99Var.f));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        objC = vv9VarB;
                    }
                } catch (MediaDrmCallbackException e) {
                    ba5 ba5Var2 = (ba5) message.obj;
                    objC = e;
                    if (ba5Var2.b) {
                        int i2 = ba5Var2.e + 1;
                        ba5Var2.e = i2;
                        if (i2 <= ((ca5) this.c).i.o(3)) {
                            t99 t99Var2 = new t99(e.a, e.b, e.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - ba5Var2.c, e.d);
                            if (e.getCause() instanceof IOException) {
                                objC = e;
                                defaultDrmSession$UnexpectedDrmSessionException = (IOException) e.getCause();
                            } else {
                                objC = e;
                                defaultDrmSession$UnexpectedDrmSessionException = new DefaultDrmSession$UnexpectedDrmSessionException(e.getCause());
                            }
                            long jQ = ((ca5) this.c).i.q(new mf(defaultDrmSession$UnexpectedDrmSessionException, ba5Var2.e, 7));
                            objC = e;
                            if (jQ != -9223372036854775807L) {
                                synchronized (((ca5) this.c).o) {
                                    ks9 ks9Var2 = ((ca5) this.c).y;
                                    if (ks9Var2 != null) {
                                        ((z88) ks9Var2.b).c(t99Var2);
                                    }
                                    synchronized (this) {
                                        try {
                                            if (!this.b) {
                                                sendMessageDelayed(Message.obtain(message), jQ);
                                                return;
                                            }
                                            objC = e;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    lvb.H0("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    objC = e2;
                }
                objC = e;
                l6m l6mVar = ((ca5) this.c).i;
                long j = ba5Var.a;
                l6mVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((ca5) this.c).n.obtainMessage(message.what, Pair.create(ba5Var.d, objC)).sendToTarget();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            default:
                nv9 nv9Var = (nv9) this.c;
                pv9 pv9Var = nv9Var.e;
                if (this.b) {
                    int i3 = message.what;
                    if (i3 == 2) {
                        nv9Var.b((x2d) message.obj);
                        return;
                    }
                    if (i3 == 8) {
                        pv9Var.b.Q();
                        return;
                    }
                    if (i3 == 9) {
                        int iIntValue = ((Integer) message.obj).intValue();
                        ov9 ov9Var = pv9Var.n;
                        pv9Var.n = new ov9(ov9Var.a, ov9Var.b, ov9Var.c, ov9Var.d, ov9Var.e, iIntValue, ov9Var.g, ov9Var.h);
                        nv9Var.e();
                        return;
                    }
                    switch (i3) {
                        case 11:
                            nv9Var.a(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            ov9 ov9Var2 = pv9Var.n;
                            pv9Var.n = new ov9(ov9Var2.a, ov9Var2.b, ov9Var2.c, ov9Var2.d, ov9Var2.e, ov9Var2.f, iIntValue2, ov9Var2.h);
                            nv9Var.e();
                            return;
                        case 13:
                            if (!pv9Var.l) {
                                pv9Var.e0();
                                return;
                            }
                            ov9 ov9Var3 = pv9Var.n;
                            x2d x2dVarZ = pv9.Z(pv9Var.i.j());
                            d38 d38VarA = ((mu9) pv9Var.i.b).e.a();
                            int shuffleMode = -1;
                            if (d38VarA != null) {
                                try {
                                    repeatMode = d38VarA.getRepeatMode();
                                } catch (RemoteException | SecurityException e3) {
                                    lvb.l0("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                    repeatMode = -1;
                                }
                            } else {
                                repeatMode = -1;
                            }
                            d38 d38VarA2 = ((mu9) pv9Var.i.b).e.a();
                            if (d38VarA2 != null) {
                                try {
                                    shuffleMode = d38VarA2.getShuffleMode();
                                } catch (RemoteException | SecurityException e4) {
                                    lvb.l0("MediaControllerCompat", "Dead object in getShuffleMode.", e4);
                                }
                                break;
                            }
                            pv9Var.n = new ov9(ov9Var3.a, x2dVarZ, ov9Var3.c, ov9Var3.d, ov9Var3.e, repeatMode, shuffleMode, ov9Var3.h);
                            d38 d38VarA3 = ((mu9) pv9Var.i.b).e.a();
                            if (d38VarA3 != null) {
                                try {
                                    zIsCaptioningEnabled = d38VarA3.isCaptioningEnabled();
                                } catch (RemoteException | SecurityException e5) {
                                    lvb.l0("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e5);
                                    zIsCaptioningEnabled = false;
                                }
                                break;
                            } else {
                                zIsCaptioningEnabled = false;
                            }
                            nv9Var.a(zIsCaptioningEnabled);
                            nv9Var.d.removeMessages(1);
                            pv9Var.b0(false, pv9Var.n);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa5(ca5 ca5Var, Looper looper) {
        super(looper);
        this.c = ca5Var;
    }
}
