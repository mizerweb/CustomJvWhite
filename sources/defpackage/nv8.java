package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import com.vk.push.core.filedatastore.JsonDeserializer;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class nv8 implements gt9, te9, c6f, fsh, bn7, pt3, JsonDeserializer, nue, whe {
    public static final /* synthetic */ nv8 b = new nv8(20);
    public final /* synthetic */ int a;

    public nv8(lu8 lu8Var) {
        this.a = 18;
    }

    public static final String c(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i10][i11];
                    byte[] bArr4 = uqi.a;
                    int i13 = b2 & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b3 = bArr[i7 + i12];
                byte[] bArr5 = uqi.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static xjc d(int i, int i2, yjc yjcVar, zjc zjcVar, akc akcVar, bkc bkcVar, Size size, String str, l6m l6mVar) {
        l6m l6mVar2 = l6m.k;
        l6m l6mVar3 = (i2 & 8) != 0 ? l6mVar2 : l6mVar;
        yjc yjcVar2 = (i2 & 64) != 0 ? null : yjcVar;
        akc akcVar2 = (i2 & np0.m) != 0 ? null : akcVar;
        bkc bkcVar2 = (i2 & np0.n) != 0 ? null : bkcVar;
        l6m l6mVar4 = l6m.m;
        r66 r66Var = r66.a;
        if (l6mVar3 == l6mVar4 || l6mVar3 == l6m.l || ((l6mVar3 == l6m.o || l6mVar3 == l6m.p) && Build.VERSION.SDK_INT >= 35)) {
            return new vjc(size, i, str, l6mVar3, zjcVar, yjcVar2, akcVar2, bkcVar2, r66Var);
        }
        if (l6mVar3 == l6mVar2) {
            return new wjc(size, i, str, zjcVar, yjcVar2, akcVar2, bkcVar2, r66Var);
        }
        ore.k("Check failed.");
        return null;
    }

    public static q36 f(Context context, File file, long j, xvi xviVar) {
        fz4 fz4Var = new fz4(new qq0(null, np4.s(context), ku6.m.r(context).c), null, null);
        new nv8(5);
        q36 q36Var = new q36();
        q36Var.b = file;
        q36Var.a = j;
        q36Var.c = fz4Var;
        q36Var.d = xviVar;
        return q36Var;
    }

    public static w0h g(int i) {
        Object next;
        y1 y1Var = new y1(0, w0h.l);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((w0h) next).a() != i);
        w0h w0hVar = (w0h) next;
        return w0hVar == null ? w0h.PENDING : w0hVar;
    }

    @Override // defpackage.gt9
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.whe
    public void accept(Object obj, Object obj2) {
        do6 do6Var;
        do6 do6Var2;
        qjh qjhVar = (qjh) obj2;
        h1l h1lVar = (h1l) obj;
        xx8 xx8Var = new xx8(BuildConfig.MAX_TIME_TO_UPLOAD, 0, false, null);
        do6[] do6VarArrJ = h1lVar.j();
        if (do6VarArrJ != null) {
            int i = 0;
            while (true) {
                if (i >= do6VarArrJ.length) {
                    do6Var2 = null;
                    break;
                }
                do6Var2 = do6VarArrJ[i];
                if ("location_updates_with_callback".equals(do6Var2.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (do6Var2 != null && do6Var2.b() >= 1) {
                w7m w7mVar = (w7m) h1lVar.p();
                ik7 ik7Var = new ik7(qjhVar);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i2 = cuk.a;
                parcelObtain.writeInt(1);
                xx8Var.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                int iT = jol.t(20293, parcelObtain);
                jol.s(parcelObtain, 1, 4);
                parcelObtain.writeInt(4);
                jol.j(parcelObtain, 3, ik7Var);
                jol.u(iT, parcelObtain);
                w7mVar.G(90, parcelObtain);
                return;
            }
        }
        do6[] do6VarArrJ2 = h1lVar.j();
        if (do6VarArrJ2 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= do6VarArrJ2.length) {
                    do6Var = null;
                    break;
                }
                do6Var = do6VarArrJ2[i3];
                if ("get_last_location_with_request".equals(do6Var.a)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (do6Var != null && do6Var.b() >= 1) {
                w7m w7mVar2 = (w7m) h1lVar.p();
                ik7 ik7Var2 = new ik7(qjhVar);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i4 = cuk.a;
                parcelObtain2.writeInt(1);
                xx8Var.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeStrongBinder(ik7Var2);
                w7mVar2.G(82, parcelObtain2);
                return;
            }
        }
        w7m w7mVar3 = (w7m) h1lVar.p();
        Parcel parcelObtain3 = Parcel.obtain();
        parcelObtain3.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Parcel parcelObtain4 = Parcel.obtain();
        try {
            try {
                w7mVar3.c.transact(7, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                parcelObtain3.recycle();
                Parcelable.Creator creator = Location.CREATOR;
                int i5 = cuk.a;
                Parcelable parcelable = parcelObtain4.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcelObtain4) : null;
                parcelObtain4.recycle();
                qjhVar.b((Location) parcelable);
            } catch (RuntimeException e) {
                parcelObtain4.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain3.recycle();
            throw th;
        }
    }

    @Override // defpackage.gt9
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.te9
    public Object e(Object obj, String str) {
        return (cqk.d(str, SdkMetricStatEvent.VALUE_KEY) && tre.b.A()) ? "*****" : cy5.l.e(obj, str);
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        switch (this.a) {
            case 16:
                return new i6k(jSONObject.getString("push_token"));
            default:
                return new a9k(jSONObject.getString("master_host_package_name_key"), jSONObject.getString("master_host_public_key"));
        }
    }

    @Override // defpackage.pt3
    public long i() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.fsh
    public long m() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // defpackage.gt9
    public boolean next() {
        return false;
    }

    @Override // defpackage.c6f
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.c6f
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.fsh
    public long x() {
        return System.nanoTime() / 1000;
    }

    public /* synthetic */ nv8(int i) {
        this.a = i;
    }

    public nv8(iw8 iw8Var, px8 px8Var) {
        this.a = 0;
    }
}
