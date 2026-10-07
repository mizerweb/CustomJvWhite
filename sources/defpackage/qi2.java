package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qi2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ri2 b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ r72 g;

    public /* synthetic */ qi2(ri2 ri2Var, Context context, Executor executor, int i, r72 r72Var, long j) {
        this.b = ri2Var;
        this.f = context;
        this.c = executor;
        this.e = i;
        this.g = r72Var;
        this.d = j;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x01be A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0206 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x020a A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x020e A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0075, B:15:0x0083, B:17:0x00a4, B:24:0x00b6, B:25:0x00e0, B:27:0x00e6, B:28:0x00f6, B:30:0x011c, B:31:0x011f, B:32:0x0121, B:36:0x0126, B:40:0x0130, B:41:0x0131, B:42:0x013d, B:53:0x0161, B:57:0x0178, B:59:0x01b0, B:85:0x0216, B:60:0x01b4, B:61:0x01be, B:62:0x01c1, B:66:0x01c6, B:68:0x01ca, B:69:0x01cc, B:73:0x01d1, B:77:0x01d8, B:78:0x01d9, B:80:0x01dd, B:81:0x0206, B:83:0x020a, B:84:0x020e, B:90:0x0220, B:49:0x0145, B:50:0x0152, B:51:0x0153, B:52:0x0160, B:71:0x01ce, B:72:0x01d0, B:64:0x01c3, B:65:0x01c5), top: B:94:0x0030, inners: #3, #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x01dd, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        fpe fpeVarB;
        switch (this.a) {
            case 0:
                ri2 ri2Var = this.b;
                Context context = this.f;
                Executor executor = this.c;
                int i = this.e;
                r72 r72Var = this.g;
                long j = this.d;
                cqk.f("CX:initAndRetryRecursively");
                try {
                    try {
                        qe2 qe2VarE = ri2Var.c.e();
                        try {
                            if (qe2VarE == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                            }
                            yg0 yg0Var = new yg0(ri2Var.d, ri2Var.e);
                            fh2 fh2VarA = ri2Var.c.a();
                            n11 n11Var = new n11(context, fh2VarA);
                            long jH = ri2Var.c.h();
                            if (ri2Var.c.m() == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                            }
                            ni2 ni2Var = new ni2(context);
                            ri2Var.i = ni2Var;
                            h6f h6fVar = new h6f(ni2Var);
                            ri2Var.j = h6fVar;
                            ri2Var.g = qe2VarE.a(context, yg0Var, fh2VarA, jH, ri2Var.c, h6fVar);
                            if (ri2Var.c.l() == null) {
                                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                            }
                            di2 di2Var = new di2(context, (r05) ((ifh) ri2Var.g.g).getValue(), ri2Var.g.d());
                            ri2Var.h = di2Var;
                            ri2Var.j.c = di2Var;
                            if (executor instanceof pe2) {
                                ((pe2) executor).b(ri2Var.g);
                            }
                            ri2Var.a.d(ri2Var.g);
                            je2 je2Var = (je2) ri2Var.g.e;
                            je2Var.b(ri2Var.a);
                            dh2 dh2Var = ri2Var.a;
                            ri2Var.k = new ljf(dh2Var, je2Var, ri2Var.i, ri2Var.j, 8);
                            Iterator it = dh2Var.c().iterator();
                            while (it.hasNext()) {
                                ((pf2) it.next()).j().i(ri2Var.k);
                            }
                            ri2Var.n.g(n11Var, ri2Var.g, ri2Var.a);
                            ri2Var.n.m.add(ri2Var.h);
                            ri2Var.n.m.add((je2) ri2Var.g.e);
                            n11Var.m(ri2Var.a);
                            if (i > 1) {
                                ri2.b(null);
                            }
                            synchronized (ri2Var.b) {
                                ri2Var.p = 4;
                                break;
                            }
                            r72Var.b(null);
                            Trace.endSection();
                            return;
                        } catch (InitializationException e) {
                            e = e;
                            zg2 zg2Var = new zg2(j, e);
                            fpeVarB = ri2Var.l.b(zg2Var);
                            ri2.b(zg2Var);
                            if (fpeVarB.b) {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str2, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str2)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            }
                        } catch (CameraValidator$CameraIdListIncorrectException e2) {
                            e = e2;
                            zg2 zg2Var2 = new zg2(j, e);
                            fpeVarB = ri2Var.l.b(zg2Var2);
                            ri2.b(zg2Var2);
                            if (fpeVarB.b) {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str3, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str3)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str4, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str4)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                            zg2 zg2Var3 = new zg2(j, e);
                            fpeVarB = ri2Var.l.b(zg2Var3);
                            ri2.b(zg2Var3);
                            if (fpeVarB.b) {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str5, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str5)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            } else {
                                synchronized (ri2Var.b) {
                                    ri2Var.p = 3;
                                    if (fpeVarB.c) {
                                        synchronized (ri2Var.b) {
                                            ri2Var.p = 4;
                                            r72Var.b(null);
                                        }
                                    } else {
                                        if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                            String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                                            tvj.d("CameraX", str6, e);
                                            r72Var.d(new InitializationException(new CameraUnavailableException(str6)));
                                        } else if (e instanceof InitializationException) {
                                            r72Var.d(e);
                                        } else {
                                            r72Var.d(new InitializationException(e));
                                        }
                                        ri2Var.n.f();
                                    }
                                }
                            }
                        }
                    } catch (InitializationException e4) {
                        e = e4;
                    } catch (CameraValidator$CameraIdListIncorrectException e5) {
                        e = e5;
                    } catch (RuntimeException e6) {
                        e = e6;
                    }
                    if (fpeVarB.b || i >= Integer.MAX_VALUE) {
                        synchronized (ri2Var.b) {
                            ri2Var.p = 3;
                            break;
                        }
                        if (fpeVarB.c) {
                            synchronized (ri2Var.b) {
                                ri2Var.p = 4;
                                break;
                            }
                            r72Var.b(null);
                        } else if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                            String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).a;
                            tvj.d("CameraX", str7, e);
                            r72Var.d(new InitializationException(new CameraUnavailableException(str7)));
                        } else if (e instanceof InitializationException) {
                            r72Var.d(e);
                        } else {
                            r72Var.d(new InitializationException(e));
                        }
                        Trace.endSection();
                        return;
                    }
                    tvj.i("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                    Handler handler = ri2Var.e;
                    qi2 qi2Var = new qi2(ri2Var, executor, j, i, context, r72Var);
                    long j2 = fpeVarB.a;
                    if (Build.VERSION.SDK_INT >= 28) {
                        go.g(handler, qi2Var, j2);
                    } else {
                        Message messageObtain = Message.obtain(handler, qi2Var);
                        messageObtain.obj = "retry_token";
                        handler.sendMessageDelayed(messageObtain, j2);
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                zg2 zg2Var4 = new zg2(j, e);
                fpeVarB = ri2Var.l.b(zg2Var4);
                ri2.b(zg2Var4);
                ri2Var.n.f();
            default:
                ri2 ri2Var2 = this.b;
                Executor executor2 = this.c;
                executor2.execute(new qi2(ri2Var2, this.f, executor2, this.e + 1, this.g, this.d));
                return;
        }
    }

    public /* synthetic */ qi2(ri2 ri2Var, Executor executor, long j, int i, Context context, r72 r72Var) {
        this.b = ri2Var;
        this.c = executor;
        this.d = j;
        this.e = i;
        this.f = context;
        this.g = r72Var;
    }
}
