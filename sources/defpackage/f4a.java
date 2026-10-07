package defpackage;

import android.os.Bundle;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import one.me.android.initialization.AccountInitializer;
import one.me.messages.list.ui.MessagesListWidget;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.Predicate;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f4a implements r4a, qg4, q4a, mf7, tg4, rf7, ied, f2i, b48, c4b, Predicate, wuh {
    public final /* synthetic */ int a;

    public /* synthetic */ f4a(tz9 tz9Var) {
        this.a = 8;
    }

    public static /* synthetic */ void d(Throwable th) {
        throw new RuntimeRemoteException(th);
    }

    @Override // defpackage.ied
    public boolean a(lfe lfeVar) {
        zv8[] zv8VarArr = MessagesListWidget.T1;
        return lfeVar instanceof w8d;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((j4d) obj).O();
                break;
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            default:
                f70 f70Var = (f70) obj;
                for (int i = 0; i < f70Var.b(); i++) {
                    c60 c60VarJ = f70Var.d(i).j();
                    c60VarJ.i = u60.a;
                    c60VarJ.k = 0.0f;
                    f70Var.e(i, c60VarJ.a());
                }
                break;
            case 5:
                ((j4d) obj).stop();
                break;
            case 6:
                ((j4d) obj).o();
                break;
            case 7:
                ((j4d) obj).j();
                break;
            case 9:
                ((j4d) obj).prepare();
                break;
            case 11:
                j4d j4dVar = (j4d) obj;
                j4dVar.q0();
                j4dVar.b.O();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        StringBuilder sb;
        char cCharAt;
        boolean z = true;
        switch (this.a) {
            case 13:
                return ry9.b((Bundle) obj);
            case 14:
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 22:
            default:
                return (cyh) obj;
            case 15:
                String str = (String) obj;
                zs2 zs2Var = a7a.g;
                zs2Var.getClass();
                for (int length = str.length() - 1; length >= 0; length--) {
                    if (!zs2Var.c(str.charAt(length))) {
                        z = false;
                        if (!z && !str.isEmpty()) {
                            return str;
                        }
                        sb = new StringBuilder(str.length() + 16);
                        sb.append('\"');
                        for (int i = 0; i < str.length(); i++) {
                            cCharAt = str.charAt(i);
                            if (cCharAt != '\r' || cCharAt == '\\' || cCharAt == '\"') {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                        }
                        sb.append('\"');
                        return sb.toString();
                    }
                }
                if (!z) {
                }
                sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                while (i < str.length()) {
                    cCharAt = str.charAt(i);
                    if (cCharAt != '\r') {
                        sb.append('\\');
                    } else {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case 16:
                Collection collection = (Collection) obj;
                int i2 = q98.d;
                if (collection instanceof q98) {
                    return (q98) collection;
                }
                boolean z2 = collection instanceof q98;
                int size = z2 ? ((p98) ((mhe) ((q98) collection)).j()).size() : 11;
                o98 o98Var = new o98();
                o98Var.b = false;
                ypb ypbVar = new ypb();
                ypbVar.d(size);
                o98Var.a = ypbVar;
                if (z2) {
                    q98 q98Var = (q98) collection;
                    ypb ypbVar2 = q98Var instanceof mhe ? ((mhe) q98Var).e : null;
                    if (ypbVar2 != null) {
                        ypbVar.a(Math.max(ypbVar.c, ypbVar2.c));
                        i = ypbVar2.c == 0 ? -1 : 0;
                        while (i >= 0) {
                            lvb.U(i, ypbVar2.c);
                            Object obj2 = ypbVar2.a[i];
                            lvb.U(i, ypbVar2.c);
                            o98Var.c(ypbVar2.b[i], obj2);
                            i++;
                            if (i >= ypbVar2.c) {
                                i = -1;
                            }
                        }
                    } else {
                        u98 u98VarL = q98Var.l();
                        ypb ypbVar3 = o98Var.a;
                        ypbVar3.a(Math.max(ypbVar3.c, u98VarL.size()));
                        for (xpb xpbVar : q98Var.l()) {
                            o98Var.c(xpbVar.a(), xpbVar.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        o98Var.a(it.next());
                    }
                }
                Objects.requireNonNull(o98Var.a);
                if (o98Var.a.c == 0) {
                    return mhe.h;
                }
                o98Var.b = true;
                return new mhe(o98Var.a);
            case 17:
                return Long.valueOf(((bz4) obj).b);
            case 18:
                return Long.valueOf(((bz4) obj).c);
            case 19:
                return c98.n(j8f.f(new ahc(27), ((u0a) obj).t().b));
            case 21:
                return String.valueOf((Long) obj);
            case 23:
                iwa iwaVar = (iwa) obj;
                iwaVar.getClass();
                dc9 dc9Var = hwd.a;
                dc9Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dc9Var.G(iwaVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // defpackage.q4a
    public void b(j4d j4dVar, i2a i2aVar, List list) {
        switch (this.a) {
            case 2:
                j4dVar.L(list);
                break;
            default:
                j4dVar.L(list);
                break;
        }
    }

    @Override // defpackage.b48
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.wuh
    public String getToken() {
        return null;
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        int iU;
        String strX;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        if (iU == 0) {
            return null;
        }
        String strX2 = "";
        long jT = 0;
        boolean zL = false;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 == 1) {
                        throw th3;
                    }
                    ore.o();
                    return null;
                }
                strX = null;
            }
            if (strX != null) {
                int iHashCode = strX.hashCode();
                try {
                    if (iHashCode != 3355) {
                        if (iHashCode != 99333) {
                            if (iHashCode == 116079 && strX.equals(MLFeatureConfigProviderBase.URL_KEY)) {
                                try {
                                    strX2 = ch3.X(fkaVar, null);
                                } catch (Throwable th5) {
                                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                    Iterator it3 = fjf.a.iterator();
                                    while (it3.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th5);
                                            accountInitializer3.d().i().g().a(null, th5);
                                        } catch (Throwable th6) {
                                            gm0.V("Payload", "failed to collect exception", th6);
                                        }
                                    }
                                    int iD3 = qt4.D(pye.a);
                                    if (iD3 != 0) {
                                        if (iD3 == 1) {
                                            throw th5;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                    strX2 = null;
                                }
                                if (strX2 == null) {
                                    return null;
                                }
                            }
                        } else if (strX.equals("def")) {
                            try {
                                zL = ch3.L(fkaVar);
                            } catch (Throwable th7) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                                Iterator it4 = fjf.a.iterator();
                                while (it4.hasNext()) {
                                    AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th7);
                                        accountInitializer4.d().i().g().a(null, th7);
                                    } catch (Throwable th8) {
                                        gm0.V("Payload", "failed to collect exception", th8);
                                    }
                                }
                                int iD4 = qt4.D(pye.a);
                                if (iD4 != 0) {
                                    if (iD4 == 1) {
                                        throw th7;
                                    }
                                    ore.o();
                                    return null;
                                }
                                zL = false;
                            }
                        }
                    } else if (strX.equals("id")) {
                        try {
                            jT = ch3.T(fkaVar, 0L);
                        } catch (Throwable th9) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                            Iterator it5 = fjf.a.iterator();
                            while (it5.hasNext()) {
                                AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th9);
                                    accountInitializer5.d().i().g().a(null, th9);
                                } catch (Throwable th10) {
                                    gm0.V("Payload", "failed to collect exception", th10);
                                }
                            }
                            int iD5 = qt4.D(pye.a);
                            if (iD5 != 0) {
                                if (iD5 == 1) {
                                    throw th9;
                                }
                                ore.o();
                                return null;
                            }
                            jT = 0;
                        }
                    }
                    fkaVar.x();
                } catch (Throwable th11) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                    Iterator it6 = fjf.a.iterator();
                    while (it6.hasNext()) {
                        AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                        try {
                            gm0.V("Payload", "error while parse payload", th11);
                            accountInitializer6.d().i().g().a(null, th11);
                        } catch (Throwable th12) {
                            gm0.V("Payload", "failed to collect exception", th12);
                        }
                    }
                    int iD6 = qt4.D(pye.a);
                    if (iD6 != 0) {
                        if (iD6 == 1) {
                            throw th11;
                        }
                        ore.o();
                        return null;
                    }
                }
            }
        }
        return new tdb(jT, strX2, Boolean.valueOf(zL));
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        switch (this.a) {
            case 0:
                f2a f2aVar = d3aVar.e;
                d3aVar.t(i2aVar);
                f2aVar.getClass();
                return rx8.J(new wmf(-6));
            case 4:
                d3aVar.getClass();
                throw new ClassCastException();
            case 8:
                d3aVar.getClass();
                throw new ClassCastException();
            case 10:
                d3aVar.getClass();
                throw new ClassCastException();
            default:
                d3aVar.getClass();
                throw new ClassCastException();
        }
    }

    @Override // org.webrtc.Predicate
    public boolean test(Object obj) {
        int i = qpb.a;
        return true;
    }

    public /* synthetic */ f4a(int i, Object obj, String str) {
        this.a = i;
    }

    public /* synthetic */ f4a(int i) {
        this.a = i;
    }

    public /* synthetic */ f4a(String str, int i, int i2, tz9 tz9Var) {
        this.a = 4;
    }
}
