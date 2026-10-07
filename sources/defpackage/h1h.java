package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h1h {
    public static final aw8[] a = new aw8[0];
    public static Context b;
    public static i1l c;

    public static cmf a(fka fkaVar) {
        int iU;
        String strX;
        String strX2;
        int iR;
        Object next;
        l1h l1hVar = l1h.EMOJI;
        int i = 1;
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
        l1h l1hVar2 = l1hVar;
        String str = "";
        int i2 = 0;
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
                    if (strX.equals("reactionType")) {
                        try {
                            iR = ch3.R(fkaVar, 0);
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
                                if (iD3 != i) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                            iR = 0;
                        }
                        Iterator it4 = l1h.e.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (((l1h) next).a != iR);
                        l1h l1hVar3 = (l1h) next;
                        l1hVar2 = l1hVar3 == null ? l1hVar : l1hVar3;
                    } else if (strX.equals("id")) {
                        try {
                            strX2 = ch3.X(fkaVar, null);
                        } catch (Throwable th7) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it5 = fjf.a.iterator();
                            while (it5.hasNext()) {
                                AccountInitializer accountInitializer4 = ((n6) it5.next()).a;
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
                            strX2 = null;
                        }
                        str = strX2 == null ? "" : strX2;
                    } else {
                        try {
                            fkaVar.x();
                        } catch (Throwable th9) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                            Iterator it6 = fjf.a.iterator();
                            while (it6.hasNext()) {
                                AccountInitializer accountInitializer5 = ((n6) it6.next()).a;
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
                        }
                    }
                } catch (Throwable th11) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                        Iterator it7 = fjf.a.iterator();
                        while (it7.hasNext()) {
                            AccountInitializer accountInitializer6 = ((n6) it7.next()).a;
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
                        i2++;
                        i = 1;
                    } catch (Throwable th13) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th13);
                        Iterator it8 = fjf.a.iterator();
                        while (it8.hasNext()) {
                            AccountInitializer accountInitializer7 = ((n6) it8.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th13);
                                accountInitializer7.d().i().g().a(null, th13);
                            } catch (Throwable th14) {
                                gm0.V("Payload", "failed to collect exception", th14);
                            }
                        }
                        int iD7 = qt4.D(pye.a);
                        if (iD7 != 0) {
                            if (iD7 == 1) {
                                throw th13;
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
        if (str.length() != 0) {
            return new cmf(l1hVar2, str, false, 3);
        }
        String name = h1h.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "StoryReactionApi has to have id", null);
            }
        }
        return null;
    }

    public static hb9 b(kb9 kb9Var) {
        int i;
        int iOrdinal = kb9Var.l.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1 && iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    ore.o();
                    return null;
                }
            }
        } else {
            i = 0;
        }
        long j = kb9Var.a;
        String string = kb9Var.b.toString();
        String str = kb9Var.c;
        long j2 = kb9Var.e;
        Integer num = kb9Var.f;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l = kb9Var.g;
        return new hb9(i, j, string, kb9Var.k.toString(), iIntValue, l != null ? l.longValue() : 0L, str, j2, kb9Var.b);
    }

    public static final kb9 c(hb9 hb9Var) {
        int iZ0;
        sya syaVar;
        Object next;
        String str = hb9Var.c;
        String str2 = hb9Var.d;
        Uri uri = str2 != null ? Uri.parse(str2) : Uri.parse(str);
        long j = hb9Var.b;
        Uri uri2 = str != null ? Uri.parse(str) : uri;
        String str3 = hb9Var.g;
        if (str3 == null) {
            sya syaVar2 = sya.IMAGE_JPEG;
            if (str != null && (iZ0 = r5h.Z0(".", str, 6)) != -1) {
                try {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iZ0, str.length()).toLowerCase(Locale.getDefault()));
                    if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
                        y1 y1Var = new y1(0, sya.m);
                        do {
                            syaVar = null;
                            if (!y1Var.hasNext()) {
                                next = null;
                                break;
                            }
                            next = y1Var.next();
                        } while (!((sya) next).a.equalsIgnoreCase(mimeTypeFromExtension));
                        sya syaVar3 = (sya) next;
                        if (syaVar3 == null) {
                            syaVar3 = sya.UNKNOWN;
                        }
                        String str4 = syaVar3.a;
                        if ((str4.length() != 0 && z5h.K0(str4, "image/", true) && !r5h.L0(str4, "djvu", true)) || (str4.length() != 0 && z5h.K0(str4, "video/", true))) {
                            syaVar = syaVar3;
                        }
                        if (syaVar != null) {
                            syaVar2 = syaVar;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            str3 = syaVar2.a;
        }
        return new kb9(j, uri2, str3, -1, hb9Var.h, Integer.valueOf(hb9Var.e), Long.valueOf(hb9Var.f), 0, 0, 0L, uri);
    }

    public static i1l d(Context context) throws GooglePlayServicesNotAvailableException {
        yab.s(context);
        Log.d("h1h", "preferredRenderer: ".concat("null"));
        i1l i1lVar = c;
        if (i1lVar != null) {
            return i1lVar;
        }
        int i = wo7.e;
        int iA = xo7.a(context, 13400000);
        if (iA != 0) {
            throw new GooglePlayServicesNotAvailableException(iA);
        }
        i1l i1lVarF = f(context, 0);
        c = i1lVarF;
        try {
            Parcel parcelK0 = i1lVarF.k0(9, i1lVarF.l0());
            int i2 = parcelK0.readInt();
            parcelK0.recycle();
            String packageName = context.getPackageName();
            if (i2 != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d("h1h", "not early loading native code");
            } else {
                Log.d("h1h", "early loading native code");
                try {
                    i1l i1lVar2 = c;
                    dqb dqbVar = new dqb(e(context, 0));
                    Parcel parcelL0 = i1lVar2.l0();
                    duk.d(parcelL0, dqbVar);
                    i1lVar2.m0(11, parcelL0);
                } catch (RemoteException e) {
                    f4a.d(e);
                    return null;
                } catch (UnsatisfiedLinkError unused) {
                    Log.w("h1h", "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    b = null;
                    c = f(context, 1);
                }
            }
            try {
                i1l i1lVar3 = c;
                dqb dqbVar2 = new dqb(e(context, 0).getResources());
                Parcel parcelL1 = i1lVar3.l0();
                duk.d(parcelL1, dqbVar2);
                parcelL1.writeInt(19020000);
                i1lVar3.m0(6, parcelL1);
                return c;
            } catch (RemoteException e2) {
                f4a.d(e2);
                return null;
            }
        } catch (RemoteException e3) {
            f4a.d(e3);
            return null;
        }
    }

    public static Context e(Context context, int i) {
        Context contextCreatePackageContext;
        Context context2 = b;
        if (context2 == null) {
            String str = i == 1 ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
            context2 = null;
            try {
                contextCreatePackageContext = rx5.c(context, rx5.b, str).a;
            } catch (Exception e) {
                try {
                    if (str.equals("com.google.android.gms.maps_dynamite")) {
                        Log.e("h1h", "Failed to load maps module, use pre-Chimera", e);
                        int i2 = wo7.e;
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    } else {
                        try {
                            Log.d("h1h", "Attempting to load maps_dynamite again.");
                            contextCreatePackageContext = rx5.c(context, rx5.b, "com.google.android.gms.maps_dynamite").a;
                        } catch (Exception e2) {
                            Log.e("h1h", "Failed to load maps module, use pre-Chimera", e2);
                            int i3 = wo7.e;
                            contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
            }
            b = contextCreatePackageContext;
            if (contextCreatePackageContext != null) {
                return contextCreatePackageContext;
            }
            ore.q("Unable to load maps module, maps container context is null");
        }
        return context2;
    }

    public static i1l f(Context context, int i) {
        Log.i("h1h", "Making Creator dynamically");
        ClassLoader classLoader = e(context, i).getClassLoader();
        try {
            yab.s(classLoader);
            Class<?> clsLoadClass = classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl");
            try {
                IBinder iBinder = (IBinder) clsLoadClass.newInstance();
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    return iInterfaceQueryLocalInterface instanceof i1l ? (i1l) iInterfaceQueryLocalInterface : new i1l(iBinder, "com.google.android.gms.maps.internal.ICreator", 2);
                }
                ore.q("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
                return null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Unable to call the default constructor of ".concat(clsLoadClass.getName()), e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(clsLoadClass.getName()), e2);
            }
        } catch (ClassNotFoundException e3) {
            ore.l("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e3);
            return null;
        }
    }
}
