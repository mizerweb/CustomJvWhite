package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.transformer.ExportException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w84 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w84(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0216  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f94 f94Var = (f94) obj;
                ArrayList arrayList = f94Var.n;
                switch (message.what) {
                    case 1:
                        Object obj2 = message.obj;
                        String str = vqi.a;
                        b94 b94Var = (b94) obj2;
                        e4g e4gVar = f94Var.t;
                        int i2 = b94Var.a;
                        Collection collection = (Collection) b94Var.b;
                        f94Var.t = e4gVar.b(i2, collection.size());
                        f94Var.C(b94Var.a, collection);
                        f94Var.H(null);
                        return true;
                    case 2:
                        Object obj3 = message.obj;
                        String str2 = vqi.a;
                        b94 b94Var2 = (b94) obj3;
                        int i3 = b94Var2.a;
                        int iIntValue = ((Integer) b94Var2.b).intValue();
                        if (i3 == 0) {
                            e4g e4gVar2 = f94Var.t;
                            if (iIntValue == e4gVar2.b.length) {
                                f94Var.t = e4gVar2.a();
                            } else {
                                f94Var.t = f94Var.t.c(i3, iIntValue);
                            }
                        } else {
                            f94Var.t = f94Var.t.c(i3, iIntValue);
                        }
                        for (int i4 = iIntValue - 1; i4 >= i3; i4--) {
                            a94 a94Var = (a94) arrayList.remove(i4);
                            f94Var.p.remove(a94Var.b);
                            f94Var.E(i4, -1, -a94Var.a.o.e.o());
                            a94Var.f = true;
                            if (a94Var.c.isEmpty()) {
                                f94Var.q.remove(a94Var);
                                d84 d84Var = (d84) f94Var.h.remove(a94Var);
                                d84Var.getClass();
                                ur0 ur0Var = d84Var.a;
                                ur0Var.r(d84Var.b);
                                c84 c84Var = d84Var.c;
                                ur0Var.u(c84Var);
                                ur0Var.t(c84Var);
                            }
                        }
                        f94Var.H(null);
                        return true;
                    case 3:
                        Object obj4 = message.obj;
                        String str3 = vqi.a;
                        b94 b94Var3 = (b94) obj4;
                        e4g e4gVar3 = f94Var.t;
                        int i5 = b94Var3.a;
                        Serializable serializable = b94Var3.b;
                        e4g e4gVarC = e4gVar3.c(i5, i5 + 1);
                        f94Var.t = e4gVarC;
                        Integer num = (Integer) serializable;
                        f94Var.t = e4gVarC.b(num.intValue(), 1);
                        int i6 = b94Var3.a;
                        int iIntValue2 = num.intValue();
                        int iMin = Math.min(i6, iIntValue2);
                        int iMax = Math.max(i6, iIntValue2);
                        int iO = ((a94) arrayList.get(iMin)).e;
                        arrayList.add(iIntValue2, (a94) arrayList.remove(i6));
                        while (iMin <= iMax) {
                            a94 a94Var2 = (a94) arrayList.get(iMin);
                            a94Var2.d = iMin;
                            a94Var2.e = iO;
                            iO += a94Var2.a.o.e.o();
                            iMin++;
                        }
                        f94Var.H(null);
                        return true;
                    case 4:
                        Object obj5 = message.obj;
                        String str4 = vqi.a;
                        f94Var.t = (e4g) ((b94) obj5).b;
                        f94Var.H(null);
                        return true;
                    case 5:
                        f94Var.I();
                        return true;
                    case 6:
                        Object obj6 = message.obj;
                        String str5 = vqi.a;
                        f94Var.G((Set) obj6);
                        return true;
                    default:
                        c.t();
                        return false;
                }
            case 1:
                e94 e94Var = (e94) obj;
                if (message.what == 1) {
                    e94Var.n = false;
                    c94 c94VarD = e94Var.D();
                    if (c94VarD != null) {
                        e94Var.p(c94VarD);
                    }
                }
                return true;
            case 2:
                fs5 fs5Var = (fs5) obj;
                gs5 gs5Var = fs5Var.b;
                boolean z = fs5Var.k;
                if (!z) {
                    int i7 = message.what;
                    if (i7 == 1) {
                        try {
                            gs5.a(gs5Var);
                            return true;
                        } catch (ExoPlaybackException e) {
                            fs5Var.e.obtainMessage(2, new IOException(e)).sendToTarget();
                            return true;
                        }
                    }
                    if (i7 == 2) {
                        if (!z) {
                            fs5Var.k = true;
                            fs5Var.g.sendEmptyMessage(4);
                        }
                        Object obj7 = message.obj;
                        String str6 = vqi.a;
                        Handler handler = gs5Var.g;
                        handler.getClass();
                        handler.post(new gf5(gs5Var, 8, (IOException) obj7));
                        return true;
                    }
                }
                return false;
            case 3:
                ks5 ks5Var = (ks5) obj;
                CopyOnWriteArraySet copyOnWriteArraySet = ks5Var.b;
                int i8 = message.what;
                if (i8 == 1) {
                    ks5Var.g = Collections.unmodifiableList((List) message.obj);
                    boolean zB = ks5Var.b();
                    Iterator it = copyOnWriteArraySet.iterator();
                    if (it.hasNext()) {
                        throw qt4.h(it);
                    }
                    if (!zB) {
                        return true;
                    }
                    ks5Var.a();
                    return true;
                }
                if (i8 == 2) {
                    int i9 = message.arg1;
                    int i10 = message.arg2;
                    int i11 = ks5Var.c - i9;
                    ks5Var.c = i11;
                    if (i10 != 0 || i11 != 0) {
                        return true;
                    }
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    if (it2.hasNext()) {
                        throw qt4.h(it2);
                    }
                    return true;
                }
                if (i8 != 3) {
                    c.t();
                    return false;
                }
                hs5 hs5Var = (hs5) message.obj;
                ks5Var.g = Collections.unmodifiableList(hs5Var.b);
                boolean zB2 = ks5Var.b();
                if (hs5Var.a) {
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    if (it3.hasNext()) {
                        throw qt4.h(it3);
                    }
                } else {
                    Iterator it4 = copyOnWriteArraySet.iterator();
                    if (it4.hasNext()) {
                        throw qt4.h(it4);
                    }
                }
                if (!zB2) {
                    return true;
                }
                ks5Var.a();
                return true;
            case 4:
                nv9 nv9Var = (nv9) obj;
                if (message.what == 1) {
                    pv9 pv9Var = nv9Var.e;
                    pv9Var.b0(false, pv9Var.n);
                }
                return true;
            case 5:
                return ParticipantStatesListenerProxy.looperCallback$lambda$0((ParticipantStatesListenerProxy) obj, message);
            case 6:
                return y5g.a((y5g) obj, message);
            default:
                k2i k2iVar = (k2i) obj;
                if (k2iVar.D && message.what != 4) {
                    return true;
                }
                try {
                    int i12 = message.what;
                    if (i12 == 1) {
                        ArrayList arrayList2 = k2iVar.k;
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            ((shf) arrayList2.get(i13)).start();
                        }
                        return true;
                    }
                    if (i12 != 2) {
                        if (i12 == 3) {
                            k2iVar.b();
                            return true;
                        }
                        if (i12 != 4) {
                            return false;
                        }
                        k2iVar.c(message.arg1, (ExportException) message.obj);
                        return true;
                    }
                    k2iVar.n.add((tye) message.obj);
                    if (k2iVar.x) {
                        return true;
                    }
                    k2iVar.j.i(3);
                    k2iVar.x = true;
                    return true;
                } catch (ExportException e2) {
                    k2iVar.c(2, e2);
                    return true;
                } catch (RuntimeException e3) {
                    k2iVar.c(2, ExportException.d(e3));
                    return true;
                }
        }
    }
}
