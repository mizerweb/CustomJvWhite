package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vm9 {
    public static boolean a = false;
    public static int b = 1;
    public static final qn5 c = new qn5(2);
    public static final l6m d = new l6m(26);
    public static final zpe e = new zpe(27);
    public static final so2 f = new so2(27);

    public static int a(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        if (i < 0 || i > bArr.length) {
            ore.i();
            return 0;
        }
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }

    public static synchronized int b(Context context) {
        String str;
        try {
            yab.t(context, "Context is null");
            Log.d("vm9", "preferredRenderer: ".concat("null"));
            if (!a) {
                try {
                    i1l i1lVarD = h1h.d(context);
                    try {
                        aqk aqkVarN0 = i1lVarD.n0();
                        yab.s(aqkVarN0);
                        wjl.a = aqkVarN0;
                        yll yllVarP0 = i1lVarD.p0();
                        if (oel.a == null) {
                            yab.t(yllVarP0, "delegate must not be null");
                            oel.a = yllVarP0;
                        }
                        a = true;
                        try {
                            Parcel parcelK0 = i1lVarD.k0(9, i1lVarD.l0());
                            int i = parcelK0.readInt();
                            parcelK0.recycle();
                            if (i == 2) {
                                b = 2;
                            }
                            dqb dqbVar = new dqb(context);
                            Parcel parcelL0 = i1lVarD.l0();
                            duk.d(parcelL0, dqbVar);
                            parcelL0.writeInt(0);
                            i1lVarD.m0(10, parcelL0);
                        } catch (RemoteException e2) {
                            Log.e("vm9", "Failed to retrieve renderer type or log initialization.", e2);
                        }
                        int i2 = b;
                        if (i2 != 1) {
                            str = i2 != 2 ? "null" : "LATEST";
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("vm9", "loadedRenderer: ".concat(str));
                    } catch (RemoteException e3) {
                        throw new RuntimeRemoteException(e3);
                    }
                } catch (GooglePlayServicesNotAvailableException e4) {
                    return e4.a;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:233:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static cy8 c(fka fkaVar) {
        int iU;
        String strX;
        int i = 1;
        int i2 = 0;
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
        float fQ = 0.0f;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        float fQ5 = 0.0f;
        while (i2 < iU) {
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
                    if (iD2 != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -40300674) {
                        if (iHashCode != 104) {
                            switch (iHashCode) {
                                case 119:
                                    if (!strX.equals("w")) {
                                        try {
                                            fkaVar.x();
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
                                                if (iD3 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th5;
                                            }
                                        }
                                    } else {
                                        try {
                                            fQ3 = ch3.Q(fkaVar);
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
                                                if (iD4 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th7;
                                            }
                                            fQ3 = 0.0f;
                                        }
                                    }
                                    break;
                                case 120:
                                    if (!strX.equals("x")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            fQ = ch3.Q(fkaVar);
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
                                                if (iD5 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th9;
                                            }
                                            fQ = 0.0f;
                                        }
                                    }
                                    break;
                                case 121:
                                    if (!strX.equals("y")) {
                                        fkaVar.x();
                                    } else {
                                        try {
                                            fQ2 = ch3.Q(fkaVar);
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
                                                if (iD6 != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw th11;
                                            }
                                            fQ2 = 0.0f;
                                        }
                                    }
                                    break;
                                default:
                                    fkaVar.x();
                                    break;
                            }
                        } else if (strX.equals("h")) {
                            try {
                                fQ4 = ch3.Q(fkaVar);
                            } catch (Throwable th13) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                                Iterator it7 = fjf.a.iterator();
                                while (it7.hasNext()) {
                                    AccountInitializer accountInitializer7 = ((n6) it7.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th13);
                                        accountInitializer7.d().i().g().a(null, th13);
                                    } catch (Throwable th14) {
                                        gm0.V("Payload", "failed to collect exception", th14);
                                    }
                                }
                                int iD7 = qt4.D(pye.a);
                                if (iD7 != 0) {
                                    if (iD7 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th13;
                                }
                                fQ4 = 0.0f;
                            }
                        } else {
                            fkaVar.x();
                        }
                    } else if (strX.equals("rotation")) {
                        try {
                            fQ5 = ch3.Q(fkaVar);
                        } catch (Throwable th15) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th15);
                            Iterator it8 = fjf.a.iterator();
                            while (it8.hasNext()) {
                                AccountInitializer accountInitializer8 = ((n6) it8.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th15);
                                    accountInitializer8.d().i().g().a(null, th15);
                                } catch (Throwable th16) {
                                    gm0.V("Payload", "failed to collect exception", th16);
                                }
                            }
                            int iD8 = qt4.D(pye.a);
                            if (iD8 != 0) {
                                if (iD8 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th15;
                            }
                            fQ5 = 0.0f;
                        }
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th17) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th17);
                        Iterator it9 = fjf.a.iterator();
                        while (it9.hasNext()) {
                            AccountInitializer accountInitializer9 = ((n6) it9.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th17);
                                accountInitializer9.d().i().g().a(null, th17);
                            } catch (Throwable th18) {
                                gm0.V("Payload", "failed to collect exception", th18);
                            }
                        }
                        int iD9 = qt4.D(pye.a);
                        if (iD9 != 0) {
                            if (iD9 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th17;
                        }
                        i2++;
                        i = 1;
                    } catch (Throwable th19) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th19);
                        Iterator it10 = fjf.a.iterator();
                        while (it10.hasNext()) {
                            AccountInitializer accountInitializer10 = ((n6) it10.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th19);
                                accountInitializer10.d().i().g().a(null, th19);
                            } catch (Throwable th20) {
                                gm0.V("Payload", "failed to collect exception", th20);
                            }
                        }
                        int iD10 = qt4.D(pye.a);
                        if (iD10 != 0) {
                            if (iD10 == 1) {
                                throw th19;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
            i2++;
            i = 1;
        }
        return new cy8(fQ, fQ2, fQ3, fQ4, fQ5);
    }
}
