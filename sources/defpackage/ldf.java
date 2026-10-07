package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import one.me.sdk.arch.Widget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public class ldf implements vo, nsi, k74, df0, tv0, f2i, vj, s38, cs7 {
    public final /* synthetic */ int a;
    public static final ldf b = new ldf(1);
    public static final ldf c = new ldf(2);
    public static final ldf d = new ldf(3);
    public static final ldf e = new ldf(4);
    public static final ldf f = new ldf(6);
    public static final ldf g = new ldf(7);
    public static final ldf h = new ldf(8);
    public static final ldf i = new ldf(9);
    public static final ldf j = new ldf(10);
    public static final ldf k = new ldf(11);
    public static final ldf l = new ldf(12);
    public static final ldf m = new ldf(12);
    public static final ldf n = new ldf(12);
    public static final ldf o = new ldf(12);
    public static final ldf p = new ldf(12);
    public static final ldf q = new ldf(12);
    public static final ldf r = new ldf(13);
    public static final /* synthetic */ ldf s = new ldf(14);

    public ldf(xr8 xr8Var, yr8 yr8Var, ku8 ku8Var, l6m l6mVar) {
        this.a = 16;
    }

    public static SelectCountryBottomSheet a(ha9 ha9Var, x0c x0cVar) {
        return new SelectCountryBottomSheet(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("add_country", x0cVar)));
    }

    public static au3 i(au3 au3Var) {
        try {
            if (!au3.W(au3Var) || !(au3Var.K() instanceof CloseableStaticBitmap)) {
                au3.E(au3Var);
                return null;
            }
            au3 au3VarCloneUnderlyingBitmapReference = ((CloseableStaticBitmap) au3Var.K()).cloneUnderlyingBitmapReference();
            au3Var.close();
            return au3VarCloneUnderlyingBitmapReference;
        } catch (Throwable th) {
            au3.E(au3Var);
            throw th;
        }
    }

    public static byte[] j(c98 c98Var, long j2) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c98Var.size());
        Iterator<E> it = c98Var.iterator();
        while (it.hasNext()) {
            yy4 yy4Var = (yy4) it.next();
            Bundle bundleC = yy4Var.c();
            Bitmap bitmap = yy4Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                lvb.b0(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                bundleC.putByteArray(yy4.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(bundleC);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(DatabaseHelper.COMPRESSED_COLUMN_NAME, arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static ldf k(String str) {
        str.getClass();
        switch (str) {
            case "STICKERS":
                return m;
            case "REACTION":
                return p;
            case "STICKER_SETS":
                return n;
            case "RECENTS":
                return o;
            case "ANIMOJI_SETS":
                return q;
            default:
                return l;
        }
    }

    public static int m(long j2) {
        int i2 = (int) (j2 >> 32);
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static int n(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        switch (this.a) {
            case 6:
                return ch3.m((Executor) ((g85) h74Var).i(new x0e(yl0.class, Executor.class)));
            default:
                return ch3.m((Executor) ((g85) h74Var).i(new x0e(sai.class, Executor.class)));
        }
    }

    @Override // defpackage.tv0
    public Object apply(Object obj, Object obj2) {
        xgc xgcVar = (xgc) obj;
        return new ffd(xgcVar.b() ? (ConversationParams) xgcVar.a() : null, ww3.X1(ww3.o1((Set) obj2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object b(long j2, int i2, i51 i51Var, q87 q87Var, boolean z, nq4 nq4Var) {
        cc3 cc3Var;
        if (nq4Var instanceof cc3) {
            cc3Var = (cc3) nq4Var;
            int i3 = cc3Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cc3Var.h = i3 - Integer.MIN_VALUE;
            } else {
                cc3Var = new cc3(this, nq4Var);
            }
        } else {
            cc3Var = new cc3(this, nq4Var);
        }
        cc3 cc3Var2 = cc3Var;
        Object objA = cc3Var2.f;
        int i4 = cc3Var2.h;
        if (i4 == 0) {
            ch3.d0(objA);
            Set set = q87Var != null ? q87Var.a : null;
            Long l2 = q87Var != null ? q87Var.b : null;
            CharSequence charSequence = q87Var != null ? q87Var.d : null;
            m8b m8bVarA = ui9.a(j2);
            cc3Var2.e = z;
            cc3Var2.d = i2;
            cc3Var2.h = 1;
            objA = i51Var.a(set, l2, charSequence, m8bVarA, cc3Var2);
            Object obj = hu4.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = cc3Var2.d;
            z = cc3Var2.e;
            ch3.d0(objA);
        }
        return new ec3(i2, (n87) objA, z);
    }

    @Override // defpackage.cs7
    public String c(int i2) {
        if (i2 == 256) {
            return "SHA256withRSA/PSS";
        }
        if (i2 == 384) {
            return "SHA384withRSA/PSS";
        }
        if (i2 == 512) {
            return "SHA512withRSA/PSS";
        }
        ore.p(zo5.h(i2, "Unsupported hash length: "));
        return null;
    }

    @Override // defpackage.df0
    public int e() {
        return 2;
    }

    @Override // defpackage.s38
    public List f(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            arrayList.add(PeerConnection.IceServer.builder(iceServer.urls).setUsername(iceServer.username).setHostname(iceServer.hostname).setTlsAlpnProtocols(iceServer.tlsAlpnProtocols).setTlsCertPolicy(iceServer.tlsCertPolicy).setTlsEllipticCurves(iceServer.tlsEllipticCurves).setPassword("broken password").createIceServer());
        }
        return arrayList;
    }

    @Override // defpackage.vj
    public int g() {
        return 0;
    }

    public String h(Context context, int i2) {
        if (i2 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(Math.abs(i2));
        int length = strValueOf.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 > 0 && (strValueOf.length() - i3) % 3 == 0) {
                sb.append(' ');
            }
            sb.append(strValueOf.charAt(i3));
        }
        return zo5.p(sb.toString(), " ", context.getResources().getQuantityString(R.plurals.channel_subscribers_count, i2));
    }

    @Override // defpackage.vo
    public uo l(uo uoVar, Object obj) {
        un unVar = (un) obj;
        return uoVar.e(unVar.a, unVar.b);
    }

    public Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        switch (this.a) {
            case 3:
                break;
            case 4:
                break;
        }
        return rx8.q(-1, kbcVar.getIcon().h);
    }

    public /* synthetic */ ldf(int i2) {
        this.a = i2;
    }

    @Override // defpackage.f2i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }
}
