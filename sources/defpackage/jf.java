package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes2.dex */
public final class jf extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(o91 o91Var) {
        super(Looper.getMainLooper());
        this.a = 6;
        this.b = o91Var;
    }

    public void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:251:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:259:0x05fe A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:283:0x05f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        w30 w30Var;
        ArrayDeque arrayDeque;
        iw8 iw8Var;
        Set set;
        final int i = 1;
        w30 w30Var2 = null;
        final int i2 = 0;
        switch (this.a) {
            case 0:
                int i3 = message.what;
                if (i3 == -3 || i3 == -2 || i3 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i3 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                x30 x30Var = (x30) this.b;
                int i4 = message.what;
                if (i4 != 1) {
                    if (i4 == 2) {
                        w30Var = (w30) message.obj;
                        int i5 = w30Var.a;
                        MediaCodec.CryptoInfo cryptoInfo = w30Var.c;
                        long j = w30Var.d;
                        int i6 = w30Var.e;
                        try {
                            synchronized (x30.h) {
                                try {
                                    x30Var.a.queueSecureInputBuffer(i5, 0, cryptoInfo, j, i6);
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = x30Var.d;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i4 == 3) {
                        x30Var.e.f();
                    } else if (i4 != 4) {
                        AtomicReference atomicReference2 = x30Var.d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i4));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            x30Var.a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = x30Var.d;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (w30Var2 != null) {
                        arrayDeque = x30.g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(w30Var2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                w30Var = (w30) message.obj;
                try {
                    x30Var.a.queueInputBuffer(w30Var.a, 0, w30Var.b, w30Var.d, w30Var.e);
                    break;
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference4 = x30Var.d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
                w30Var2 = w30Var;
                if (w30Var2 != null) {
                    arrayDeque = x30.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(w30Var2);
                        return;
                    }
                }
                return;
            case 2:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i7 = message.what;
                if (i7 == 1) {
                    ca5 ca5Var = (ca5) this.b;
                    uvc uvcVar = ca5Var.c;
                    if (obj == ca5Var.z) {
                        if (ca5Var.p == 2 || ca5Var.j()) {
                            ca5Var.z = null;
                            if (obj2 instanceof Exception) {
                                uvcVar.k((Exception) obj2, false);
                                return;
                            }
                            try {
                                ca5Var.b.l(((vv9) obj2).a);
                                uvcVar.c = null;
                                HashSet hashSet = (HashSet) uvcVar.b;
                                c98 c98VarN = c98.n(hashSet);
                                hashSet.clear();
                                a98 a98VarListIterator = c98VarN.listIterator(0);
                                while (a98VarListIterator.hasNext()) {
                                    ca5 ca5Var2 = (ca5) a98VarListIterator.next();
                                    if (ca5Var2.m()) {
                                        ca5Var2.i(true);
                                    }
                                }
                                return;
                            } catch (Exception e4) {
                                uvcVar.k(e4, true);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i7 != 2) {
                    return;
                }
                ca5 ca5Var3 = (ca5) this.b;
                if (obj == ca5Var3.x && ca5Var3.j()) {
                    ca5Var3.x = null;
                    synchronized (ca5Var3.o) {
                        ks9 ks9Var = ca5Var3.y;
                        ks9Var.getClass();
                        iw8Var = new iw8(0);
                        ((z88) ks9Var.b).h();
                        ca5Var3.y = null;
                        break;
                    }
                    if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                        ca5Var3.l(false, (Throwable) obj2);
                        return;
                    }
                    try {
                        byte[] bArrX = ca5Var3.b.x(ca5Var3.v, ((vv9) obj2).a);
                        if (ca5Var3.w != null && bArrX != null && bArrX.length != 0) {
                            ca5Var3.w = bArrX;
                        }
                        ca5Var3.p = 4;
                        kt4 kt4Var = ca5Var3.h;
                        synchronized (kt4Var.a) {
                            set = kt4Var.c;
                            break;
                        }
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((av5) it.next()).a(iw8Var);
                        }
                        return;
                    } catch (Exception e5) {
                        e = e5;
                        ca5Var3.l(true, e);
                        return;
                    } catch (NoSuchMethodError e6) {
                        e = e6;
                        ca5Var3.l(true, e);
                        return;
                    }
                }
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (ca5 ca5Var4 : ((ea5) this.b).m) {
                    ca5Var4.o();
                    if (Arrays.equals(ca5Var4.v, bArr)) {
                        if (message.what == 2 && ca5Var4.p == 4) {
                            String str = vqi.a;
                            ca5Var4.i(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                y3a y3aVar = (y3a) this.b;
                if (y3aVar == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                i1m i1mVar = y3aVar.b;
                Bundle data = message.getData();
                switch (message.what) {
                    case 3:
                        ((y3a) i1mVar.a).g.a(new ps9(i1mVar, new ss9(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), vqi.n(data.getBundle("data_options")), 0));
                        return;
                    case 4:
                        ((y3a) i1mVar.a).g.a(new wn2(i1mVar, new ss9(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 1));
                        return;
                    case 5:
                        String string = data.getString("data_media_item_id");
                        ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                        ss9 ss9Var = new ss9(message.replyTo);
                        i1mVar.getClass();
                        if (TextUtils.isEmpty(string) || resultReceiver == null) {
                            return;
                        }
                        ((y3a) i1mVar.a).g.a(new qs9(i1mVar, ss9Var, string, resultReceiver));
                        return;
                    case 6:
                        ((y3a) i1mVar.a).g.a(new f85(i1mVar, new ss9(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), vqi.n(data.getBundle("data_root_hints"))));
                        return;
                    case 7:
                        ((y3a) i1mVar.a).g.a(new og7((Object) i1mVar, (Object) new ss9(message.replyTo), false, 11));
                        return;
                    case 8:
                        Bundle bundleN = vqi.n(data.getBundle("data_search_extras"));
                        String string2 = data.getString("data_search_query");
                        ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                        ss9 ss9Var2 = new ss9(message.replyTo);
                        i1mVar.getClass();
                        if (TextUtils.isEmpty(string2) || resultReceiver2 == null) {
                            return;
                        }
                        ((y3a) i1mVar.a).g.a(new qs9(i1mVar, ss9Var2, string2, bundleN, resultReceiver2));
                        return;
                    case 9:
                        Bundle bundleN2 = vqi.n(data.getBundle("data_custom_action_extras"));
                        String string3 = data.getString("data_custom_action");
                        ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                        ss9 ss9Var3 = new ss9(message.replyTo);
                        i1mVar.getClass();
                        if (TextUtils.isEmpty(string3) || resultReceiver3 == null) {
                            return;
                        }
                        ((y3a) i1mVar.a).g.a(new ps9(i1mVar, ss9Var3, string3, bundleN2, resultReceiver3));
                        return;
                    default:
                        lvb.G0("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 5:
                String str2 = null;
                switch (((u7) u7.b.get(message.what)).ordinal()) {
                    case 0:
                        dfd dfdVar = (dfd) this.b;
                        kf8 kf8Var = (kf8) message.obj;
                        if (dfdVar.d) {
                            dfdVar.b.K(new a8d(6, kf8Var));
                            return;
                        }
                        try {
                            Context context = kf8Var.a;
                            q36 q36Var = kf8Var.b;
                            dfdVar.c.obtainMessage(1, new lf8(new tw5(q36Var, new r95(new lec(context.getApplicationContext(), "one_video_preload.db", null, 1, 0)), new ez8(q36Var.a)), kf8Var.c)).sendToTarget();
                            return;
                        } catch (Throwable th2) {
                            Log.e("PreloadDiskCacheManager", th2.getMessage(), th2);
                            Exception exc = th2 instanceof Exception ? th2 : null;
                            if (exc == null) {
                                exc = new Exception(th2);
                            }
                            dfdVar.c.obtainMessage(2, new mf8(exc, kf8Var.c)).sendToTarget();
                            return;
                        }
                    case 1:
                        dfd dfdVar2 = (dfd) this.b;
                        final lf8 lf8Var = (lf8) message.obj;
                        if (dfdVar2.d) {
                            dfdVar2.b.K(new af7() { // from class: bfd
                                @Override // defpackage.af7
                                public final Object invoke() {
                                    int i8 = i2;
                                    sbi sbiVar = sbi.a;
                                    lf8 lf8Var2 = lf8Var;
                                    switch (i8) {
                                        case 0:
                                            lf8Var2.b.invoke(Boolean.TRUE);
                                            break;
                                        default:
                                            lf8Var2.b.invoke(Boolean.TRUE);
                                            break;
                                    }
                                    return sbiVar;
                                }
                            });
                            return;
                        }
                        dfdVar2.h = lf8Var.a;
                        dfdVar2.d = true;
                        dfdVar2.b.K(new af7() { // from class: bfd
                            @Override // defpackage.af7
                            public final Object invoke() {
                                int i8 = i;
                                sbi sbiVar = sbi.a;
                                lf8 lf8Var2 = lf8Var;
                                switch (i8) {
                                    case 0:
                                        lf8Var2.b.invoke(Boolean.TRUE);
                                        break;
                                    default:
                                        lf8Var2.b.invoke(Boolean.TRUE);
                                        break;
                                }
                                return sbiVar;
                            }
                        });
                        return;
                    case 2:
                        dfd dfdVar3 = (dfd) this.b;
                        mf8 mf8Var = (mf8) message.obj;
                        dfdVar3.d = false;
                        dfdVar3.h = null;
                        Log.e("PreloadDiskCacheManager", "PreloadDiskCacheManager initialization failed", mf8Var.a);
                        dfdVar3.b.K(new a8d(7, mf8Var));
                        return;
                    case 3:
                        dfd dfdVar4 = (dfd) this.b;
                        sp5 sp5Var = (sp5) message.obj;
                        tw5 tw5Var = dfdVar4.h;
                        if (!dfdVar4.d || tw5Var == null) {
                            ore.k("PreloadDiskCacheManager must be initialized first, call init() method");
                            return;
                        }
                        x71 x71Var = sp5Var.c;
                        if (0 >= x71Var.a) {
                            ore.k("load params is not valid, mediaLoadStartPositionMs >= mediaLoadEndPositionMs");
                            return;
                        }
                        ym5 ym5Var = sp5Var.b;
                        tm5 tm5Var = new tm5(ym5Var, x71Var);
                        if (((ConcurrentHashMap) dfdVar4.e.a).containsKey(ym5Var.d)) {
                            return;
                        }
                        switch (rti.$EnumSwitchMapping$0[sp5Var.b.a.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                break;
                            case 5:
                                str2 = "application/mp4";
                                break;
                            case 6:
                                str2 = "application/x-mpegURL";
                                break;
                            case 7:
                                str2 = "application/dash+xml";
                                break;
                            default:
                                ore.o();
                                return;
                        }
                        String str3 = str2;
                        if (str3 == null) {
                            return;
                        }
                        Context context2 = sp5Var.a;
                        q36 q36Var2 = (q36) tw5Var.a;
                        dfdVar4.c(new ws5(str3, q36Var2, context2, tw5Var, tm5Var, tw5Var.r((s25) q36Var2.c, false, ym5Var), dfdVar4.a, dfdVar4.c, dfdVar4.i));
                        return;
                    case 4:
                        ((dfd) this.b).b((String) message.obj);
                        return;
                    case 5:
                        ((dfd) this.b).a();
                        return;
                    case 6:
                    default:
                        return;
                    case 7:
                        dfd dfdVar5 = (dfd) this.b;
                        tw5 tw5Var2 = dfdVar5.h;
                        if (!dfdVar5.d || tw5Var2 == null) {
                            ore.k("PreloadDiskCacheManager must be initialized first, call init() method");
                            return;
                        } else {
                            if (((ConcurrentHashMap) dfdVar5.e.a).containsKey("clear_task")) {
                                return;
                            }
                            dfdVar5.a();
                            dfdVar5.c(new ws3(tw5Var2, dfdVar5.i));
                            return;
                        }
                    case 8:
                        dfd dfdVar6 = (dfd) this.b;
                        AtomicBoolean atomicBoolean = dfdVar6.f;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            r6a r6aVar = dfdVar6.e;
                            ReentrantLock reentrantLock = (ReentrantLock) r6aVar.c;
                            reentrantLock.lock();
                            try {
                                String str4 = (String) ww3.s1((ConcurrentLinkedDeque) r6aVar.b);
                                wm5 wm5Var = str4 != null ? (wm5) ((ConcurrentHashMap) r6aVar.a).get(str4) : null;
                                reentrantLock.unlock();
                                if (wm5Var == null) {
                                    atomicBoolean.set(false);
                                    return;
                                } else {
                                    dfdVar6.a.execute(new i7b(wm5Var, 16, dfdVar6));
                                    return;
                                }
                            } catch (Throwable th3) {
                                reentrantLock.unlock();
                                throw th3;
                            }
                            break;
                        }
                        return;
                    case 9:
                        yjh yjhVar = (yjh) message.obj;
                        dfd dfdVar7 = (dfd) this.b;
                        String str5 = yjhVar.a;
                        Class cls = yjhVar.b;
                        r6a r6aVar2 = dfdVar7.e;
                        wm5 wm5Var2 = (wm5) ((ConcurrentHashMap) r6aVar2.a).get(str5);
                        if (wm5Var2 != null && wm5Var2.getClass().equals(cls)) {
                            r6aVar2.H(str5);
                        }
                        dfdVar7.f.set(false);
                        if (((ConcurrentHashMap) r6aVar2.a).isEmpty()) {
                            return;
                        }
                        dfdVar7.c.obtainMessage(8).sendToTarget();
                        return;
                }
            default:
                oh1 oh1Var = oh1.c;
                o91 o91Var = (o91) this.b;
                fik fikVar = o91Var.e1;
                CidLogger cidLogger = o91Var.N;
                int i8 = message.what;
                if (i8 != 131) {
                    if (i8 != 132) {
                        return;
                    }
                    it7 it7Var = it7.f;
                    gt7 gt7Var = new gt7(null, new CallTerminatingException.Builder(Domain.INTERNAL, "ringing timeout").setSubDomain(SubDomain.RINGING_TIMEOUT).build().asString(), Collections.singleton(ft7.RINGING_TIMEOUT));
                    cidLogger.log("OKRTCCall", "💀 ".concat("ringing.timeout"));
                    o91Var.J = it7Var;
                    fikVar.E(n0m.b(it7Var, gt7Var));
                    o91Var.n(oh1Var, null);
                    o91Var.t("ringing.timeout", it7Var);
                    return;
                }
                it7 it7Var2 = it7.a;
                CallTerminatingException callTerminatingExceptionBuild = new CallTerminatingException.Builder(Domain.NETWORK, "pc timeout").setSubDomain(SubDomain.RTC).build();
                cidLogger.log("OKRTCCall", "💀 ".concat("pc.timeout"));
                o91Var.J = it7Var2;
                fikVar.E(n0m.b(it7Var2, null));
                if (callTerminatingExceptionBuild != null) {
                    o91Var.h1 = callTerminatingExceptionBuild;
                }
                o91Var.n(oh1Var, null);
                o91Var.t("pc.timeout", it7Var2);
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 4:
                Bundle data = message.getData();
                ClassLoader classLoader = ks9.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf(int i, Looper looper, Object obj) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf(Looper looper) {
        super(looper);
        this.a = 4;
    }

    public /* synthetic */ jf() {
        this.a = 0;
    }
}
