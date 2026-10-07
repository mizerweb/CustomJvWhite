package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.google.firebase.components.DependencyException;
import java.util.ArrayList;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.cookie.MalformedCookieException;
import org.webrtc.RTCStats;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahc implements qbf, c4b, ine, bg7, j8e, ujc, sf7, sxe, qg4, i8c, tg4, u8j, v7, rf7, mf7 {
    public final /* synthetic */ int a;

    public /* synthetic */ ahc(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b(int i, Object obj, String str) {
        throw new IllegalStateException((str + i + obj).toString());
    }

    public static /* synthetic */ void c(Object obj, Object obj2, String str) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void g(String str) throws MalformedCookieException {
        throw new MalformedCookieException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    @Override // defpackage.ujc
    public i1m a(xr6 xr6Var) {
        return new i1m(xr6Var);
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        switch (this.a) {
            case 14:
                ((uye) obj).b.release();
                break;
            default:
                c60 c60Var = (c60) obj;
                c60Var.i = u60.e;
                c60Var.k = -1.0f;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:102:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x0375  */
    /* JADX WARN: Code duplicated, block: B:88:0x037a  */
    /* JADX WARN: Code duplicated, block: B:90:0x037e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0383  */
    /* JADX WARN: Code duplicated, block: B:94:0x038e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0393  */
    /* JADX WARN: Code duplicated, block: B:99:0x03a0  */
    @Override // defpackage.bg7, defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        fa faVar;
        da[] daVarArr;
        int i;
        ry9[] ry9VarArr;
        ry9[] ry9VarArr2;
        long[] jArr;
        String[] strArr;
        ea[] eaVarArr;
        int i2;
        Bundle bundle;
        ea eaVar;
        ghe gheVarH;
        int i3 = 0;
        switch (this.a) {
            case 4:
                return iid.b;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(nyh.c);
                bundle3.getClass();
                hyh hyhVarA = hyh.a(bundle3);
                int[] intArray = bundle2.getIntArray(nyh.d);
                intArray.getClass();
                return new nyh(hyhVarA, k4m.a(intArray));
            case 10:
                return RemoteSettingsImplV2.settingsSource_delegate$lambda$0$0((Throwable) obj);
            case 11:
                return RemoteSettingsShared.createSettingsSource$lambda$0((Throwable) obj);
            case 13:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        xtj xtjVarA = ij0.a();
                        xtjVarA.D(cursorRawQuery.getString(1));
                        xtjVarA.d = yhd.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        xtjVarA.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(xtjVarA.n());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return Long.valueOf(((vg4) obj).w());
            case 21:
                return (String) ((zlc) obj).a;
            case 22:
                return (Long) ((zlc) obj).b;
            case 23:
                return Long.valueOf(((vg4) obj).v());
            case 24:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = bundle4.getBundle(tsh.s);
                ry9 ry9VarB = bundle5 != null ? ry9.b(bundle5) : ry9.g;
                long j = bundle4.getLong(tsh.t, -9223372036854775807L);
                long j2 = bundle4.getLong(tsh.u, -9223372036854775807L);
                long j3 = bundle4.getLong(tsh.v, -9223372036854775807L);
                boolean z = bundle4.getBoolean(tsh.w, false);
                boolean z2 = bundle4.getBoolean(tsh.x, false);
                Bundle bundle6 = bundle4.getBundle(tsh.y);
                iy9 iy9VarB = bundle6 != null ? iy9.b(bundle6) : null;
                boolean z3 = bundle4.getBoolean(tsh.z, false);
                long j4 = bundle4.getLong(tsh.A, 0L);
                long j5 = bundle4.getLong(tsh.B, -9223372036854775807L);
                int i4 = bundle4.getInt(tsh.C, 0);
                int i5 = bundle4.getInt(tsh.D, 0);
                long j6 = bundle4.getLong(tsh.E, 0L);
                tsh tshVar = new tsh();
                tshVar.b(tsh.q, ry9VarB, null, j, j2, j3, z, z2, iy9VarB, j4, j5, i4, i5, j6);
                tshVar.j = z3;
                return tshVar;
            case 25:
                Bundle bundle7 = (Bundle) obj;
                int i6 = bundle7.getInt(rsh.h, 0);
                long j7 = bundle7.getLong(rsh.i, -9223372036854775807L);
                long j8 = bundle7.getLong(rsh.j, 0L);
                boolean z4 = bundle7.getBoolean(rsh.k, false);
                Bundle bundle8 = bundle7.getBundle(rsh.l);
                if (bundle8 != null) {
                    ArrayList parcelableArrayList = bundle8.getParcelableArrayList(fa.h);
                    if (parcelableArrayList == null) {
                        daVarArr = new da[0];
                    } else {
                        da[] daVarArr2 = new da[parcelableArrayList.size()];
                        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                            Bundle bundle9 = (Bundle) parcelableArrayList.get(i7);
                            long j9 = bundle9.getLong(da.m);
                            int i8 = bundle9.getInt(da.n);
                            int i9 = bundle9.getInt(da.t);
                            ArrayList parcelableArrayList2 = bundle9.getParcelableArrayList(da.o);
                            ArrayList parcelableArrayList3 = bundle9.getParcelableArrayList(da.u);
                            int[] intArray2 = bundle9.getIntArray(da.p);
                            long[] longArray = bundle9.getLongArray(da.q);
                            long j10 = bundle9.getLong(da.r);
                            boolean z5 = bundle9.getBoolean(da.s);
                            ArrayList<String> stringArrayList = bundle9.getStringArrayList(da.v);
                            ArrayList parcelableArrayList4 = bundle9.getParcelableArrayList(da.x);
                            boolean z6 = bundle9.getBoolean(da.w);
                            if (intArray2 == null) {
                                intArray2 = new int[0];
                            }
                            int[] iArr = intArray2;
                            if (parcelableArrayList3 != null) {
                                ry9VarArr2 = new ry9[parcelableArrayList3.size()];
                                for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                                    Bundle bundle10 = (Bundle) parcelableArrayList3.get(i10);
                                    ry9VarArr2[i10] = bundle10 == null ? null : ry9.b(bundle10);
                                }
                            } else {
                                if (parcelableArrayList2 != null) {
                                    ry9VarArr2 = new ry9[parcelableArrayList2.size()];
                                    for (int i11 = 0; i11 < parcelableArrayList2.size(); i11++) {
                                        Uri uri = (Uri) parcelableArrayList2.get(i11);
                                        ry9VarArr2[i11] = uri == null ? null : ry9.c(uri);
                                    }
                                } else {
                                    i = 0;
                                    ry9VarArr = new ry9[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i];
                                } else {
                                    jArr = longArray;
                                }
                                if (stringArrayList == null) {
                                    strArr = new String[i];
                                } else {
                                    strArr = (String[]) stringArrayList.toArray(new String[i]);
                                }
                                String[] strArr2 = strArr;
                                if (parcelableArrayList4 == null) {
                                    eaVarArr = new ea[i];
                                } else {
                                    eaVarArr = new ea[parcelableArrayList4.size()];
                                    for (i2 = 0; i2 < parcelableArrayList4.size(); i2++) {
                                        bundle = (Bundle) parcelableArrayList4.get(i2);
                                        if (bundle == null) {
                                            eaVar = null;
                                        } else {
                                            eaVar = new ea(bundle.getLong(ea.d), bundle.getLong(ea.e), bundle.getString(ea.f));
                                        }
                                        eaVarArr[i2] = eaVar;
                                    }
                                }
                                daVarArr2[i7] = new da(j9, i8, i9, iArr, ry9VarArr, jArr, j10, z5, strArr2, eaVarArr, z6);
                            }
                            ry9VarArr = ry9VarArr2;
                            i = 0;
                            if (longArray == null) {
                                jArr = new long[i];
                            } else {
                                jArr = longArray;
                            }
                            if (stringArrayList == null) {
                                strArr = new String[i];
                            } else {
                                strArr = (String[]) stringArrayList.toArray(new String[i]);
                            }
                            String[] strArr3 = strArr;
                            if (parcelableArrayList4 == null) {
                                eaVarArr = new ea[i];
                            } else {
                                eaVarArr = new ea[parcelableArrayList4.size()];
                                while (i2 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i2);
                                    if (bundle == null) {
                                        eaVar = null;
                                    } else {
                                        eaVar = new ea(bundle.getLong(ea.d), bundle.getLong(ea.e), bundle.getString(ea.f));
                                    }
                                    eaVarArr[i2] = eaVar;
                                }
                            }
                            daVarArr2[i7] = new da(j9, i8, i9, iArr, ry9VarArr, jArr, j10, z5, strArr3, eaVarArr, z6);
                        }
                        daVarArr = daVarArr2;
                    }
                    faVar = new fa(daVarArr, bundle8.getLong(fa.i, 0L), bundle8.getLong(fa.j, -9223372036854775807L), bundle8.getInt(fa.k, 0));
                } else {
                    faVar = fa.f;
                }
                fa faVar2 = faVar;
                rsh rshVar = new rsh();
                rshVar.i(null, null, i6, j7, j8, faVar2, z4);
                return rshVar;
            case 26:
                Bundle bundle11 = (Bundle) obj;
                b87 b87Var = b87.Q;
                a87 a87Var = new a87();
                if (bundle11 != null) {
                    ClassLoader classLoader = l51.class.getClassLoader();
                    String str = vqi.a;
                    bundle11.setClassLoader(classLoader);
                }
                String string2 = bundle11.getString(b87.R);
                String str2 = b87Var.a;
                if (string2 == null) {
                    string2 = str2;
                }
                a87Var.a = string2;
                String string3 = bundle11.getString(b87.S);
                String str3 = b87Var.b;
                if (string3 == null) {
                    string3 = str3;
                }
                a87Var.b = string3;
                ArrayList parcelableArrayList5 = bundle11.getParcelableArrayList(b87.w0);
                if (parcelableArrayList5 == null) {
                    gheVarH = ghe.e;
                } else {
                    z88 z88VarL = c98.l();
                    for (int i12 = 0; i12 < parcelableArrayList5.size(); i12++) {
                        Bundle bundle12 = (Bundle) parcelableArrayList5.get(i12);
                        bundle12.getClass();
                        String string4 = bundle12.getString(sx8.c);
                        String string5 = bundle12.getString(sx8.d);
                        string5.getClass();
                        z88VarL.c(new sx8(string4, string5));
                    }
                    gheVarH = z88VarL.h();
                }
                a87Var.c = c98.n(gheVarH);
                String string6 = bundle11.getString(b87.T);
                String str4 = b87Var.d;
                if (string6 == null) {
                    string6 = str4;
                }
                a87Var.d = string6;
                a87Var.e = bundle11.getInt(b87.U, b87Var.e);
                a87Var.f = bundle11.getInt(b87.V, b87Var.f);
                a87Var.g = bundle11.getInt(b87.x0, b87Var.g);
                a87Var.h = bundle11.getInt(b87.W, b87Var.h);
                a87Var.i = bundle11.getInt(b87.X, b87Var.i);
                String string7 = bundle11.getString(b87.Y);
                String str5 = b87Var.k;
                if (string7 == null) {
                    string7 = str5;
                }
                a87Var.j = string7;
                String string8 = bundle11.getString(b87.Z);
                String str6 = b87Var.m;
                if (string8 == null) {
                    string8 = str6;
                }
                a87Var.l = uya.n(string8);
                String string9 = bundle11.getString(b87.a0);
                String str7 = b87Var.n;
                if (string9 == null) {
                    string9 = str7;
                }
                a87Var.m = uya.n(string9);
                a87Var.n = bundle11.getInt(b87.b0, b87Var.o);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle11.getByteArray(b87.c0 + "_" + Integer.toString(i3, 36));
                    if (byteArray == null) {
                        a87Var.p = arrayList2;
                        a87Var.q = (wu5) bundle11.getParcelable(b87.d0);
                        a87Var.r = bundle11.getLong(b87.e0, b87Var.s);
                        a87Var.t = bundle11.getInt(b87.f0, b87Var.u);
                        a87Var.u = bundle11.getInt(b87.g0, b87Var.v);
                        a87Var.v = bundle11.getInt(b87.z0, b87Var.w);
                        a87Var.w = bundle11.getInt(b87.A0, b87Var.x);
                        a87Var.x = bundle11.getFloat(b87.h0, b87Var.y);
                        a87Var.y = bundle11.getInt(b87.i0, b87Var.z);
                        a87Var.z = bundle11.getFloat(b87.j0, b87Var.A);
                        a87Var.A = bundle11.getByteArray(b87.k0);
                        a87Var.B = bundle11.getInt(b87.l0, b87Var.C);
                        a87Var.D = bundle11.getInt(b87.y0, b87Var.E);
                        Bundle bundle13 = bundle11.getBundle(b87.m0);
                        if (bundle13 != null) {
                            a87Var.C = new ex3(bundle13.getInt(ex3.j, -1), bundle13.getInt(ex3.k, -1), bundle13.getInt(ex3.l, -1), bundle13.getByteArray(ex3.m), bundle13.getInt(ex3.n, -1), bundle13.getInt(ex3.o, -1));
                        }
                        a87Var.E = bundle11.getInt(b87.n0, b87Var.F);
                        a87Var.F = bundle11.getInt(b87.o0, b87Var.G);
                        a87Var.G = bundle11.getInt(b87.p0, b87Var.H);
                        a87Var.H = bundle11.getInt(b87.q0, b87Var.I);
                        a87Var.I = bundle11.getInt(b87.r0, b87Var.J);
                        a87Var.J = bundle11.getInt(b87.s0, b87Var.K);
                        a87Var.L = bundle11.getInt(b87.u0, b87Var.M);
                        a87Var.M = bundle11.getInt(b87.v0, b87Var.N);
                        a87Var.N = bundle11.getInt(b87.t0, b87Var.O);
                        return new b87(a87Var);
                    }
                    arrayList2.add(byteArray);
                    i3++;
                }
                break;
            case 27:
                return Integer.valueOf(((hyh) obj).c);
            case 28:
                nyh nyhVar = (nyh) obj;
                nyhVar.getClass();
                Bundle bundle14 = new Bundle();
                bundle14.putBundle(nyh.c, nyhVar.a.d());
                bundle14.putIntArray(nyh.d, k4m.h(nyhVar.b));
                return bundle14;
        }
    }

    @Override // defpackage.ine
    public void d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.qbf
    public int e(int i) {
        zv8[] zv8VarArr = OtherNotificationsSettingsScreen.g;
        return 4;
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        return zfa.a(fkaVar);
    }

    @Override // defpackage.u8j
    public void i(float f, View view) {
        zv8[] zv8VarArr = StoriesViewerScreen.t;
        float width = f < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f * 15.0f);
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        RTCStats rTCStats = (RTCStats) obj;
        rTCStats.getClass();
        zv8Var.getClass();
        Object obj2 = rTCStats.getMembers().get("payloadType");
        if (obj2 != null) {
            return b4e.c(obj2);
        }
        return null;
    }

    @Override // defpackage.v7
    public void run() {
        SupportedCodecsStatistics.tryToReport$lambda$1();
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        zv8[] zv8VarArr = SettingsAutoSaveScreen.g;
        if (j8cVar == j8c.e) {
            wtf wtfVar = wtf.b;
            wtfVar.getClass();
            o65.c(wtfVar.b(), ":settings/media/autoload/video", null, null, 6);
        }
    }

    public /* synthetic */ ahc(int i, Object obj) {
        this.a = i;
    }
}
