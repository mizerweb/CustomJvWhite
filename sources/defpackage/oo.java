package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.transformer.ExportException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import org.apache.commons.logging.LogFactory;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo implements wo, t65, r89, hfh, se5, StatsObserver, v7, a5e, j8h, tg4, n3a, t00, qg4, oo7, btb, hch, sxe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oo(o3a o3aVar, emf emfVar, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 12;
        this.b = o3aVar;
        this.c = bundle;
        this.d = resultReceiver;
    }

    @Override // defpackage.hfh
    public Object a() {
        id5 id5Var = (id5) this.b;
        ij0 ij0Var = (ij0) this.c;
        kh0 kh0Var = (kh0) this.d;
        uxe uxeVar = id5Var.d;
        uxeVar.getClass();
        vhd vhdVar = ij0Var.c;
        String str = kh0Var.a;
        String str2 = ij0Var.a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + vhdVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) uxeVar.A(new oo(uxeVar, kh0Var, ij0Var, 24))).getClass();
        id5Var.a.N(ij0Var, 1, false);
        return null;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 10:
                vvk.g((ky3) obj4, (f70) obj, (c46) obj3, ((umi) ((ki8) obj2).c.getValue()).a().b);
                break;
            case 15:
                ((c5a) obj).b(((ed7) obj4).b, (x4a) obj3, (uz9) obj2);
                break;
            case 16:
                vvk.g((sfa) obj3, (f70) obj, (c46) obj2, ((qfa) obj4).h);
                break;
            case 17:
                vvk.g((sfa) obj4, (f70) obj, (c46) obj3, ((umi) ((sua) obj2).d.getValue()).a().b);
                break;
            default:
                vvk.g((sfa) obj4, (f70) obj, (c46) obj3, ((umi) ((ose) obj2).d.getValue()).a().b);
                break;
        }
    }

    @Override // defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        uxe uxeVar;
        he9 he9Var;
        int i = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        he9 he9Var2 = he9.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i8 = 0;
        switch (i) {
            case 24:
                uxe uxeVar2 = (uxe) obj4;
                kh0 kh0Var = (kh0) obj3;
                r76 r76Var = kh0Var.c;
                String str = kh0Var.a;
                ij0 ij0Var = (ij0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = uxeVar2.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * uxeVar2.l().compileStatement("PRAGMA page_count").simpleQueryForLong();
                lh0 lh0Var = uxeVar2.d;
                if (jSimpleQueryForLong >= lh0Var.a) {
                    uxeVar2.I(1L, he9Var2, str);
                    return -1L;
                }
                Long lY = uxe.y(sQLiteDatabase, ij0Var);
                if (lY != null) {
                    jInsert = lY.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ij0Var.a);
                    contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(yhd.a(ij0Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ij0Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = lh0Var.e;
                byte[] bArr2 = r76Var.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(kh0Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(kh0Var.e));
                contentValues2.put("payload_encoding", r76Var.a.a);
                contentValues2.put("code", kh0Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put(ApiProtocol.PARAM_PAYLOAD, z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(kh0Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(SdkMetricStatEvent.NAME_KEY, (String) entry.getKey());
                    contentValues4.put(SdkMetricStatEvent.VALUE_KEY, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 25:
                uxe uxeVar3 = (uxe) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ij0 ij0Var2 = (ij0) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    js8 js8Var = new js8();
                    js8Var.f = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        ore.n("Null transportName");
                        return null;
                    }
                    js8Var.a = string;
                    js8Var.d = Long.valueOf(cursor2.getLong(i6));
                    js8Var.e = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        js8Var.c = new r76(string2 == null ? uxe.f : new z86(string2), cursor2.getBlob(5));
                        uxeVar = uxeVar3;
                    } else {
                        String string3 = cursor2.getString(4);
                        z86 z86Var = string3 == null ? uxe.f : new z86(string3);
                        Cursor cursorQuery = uxeVar3.l().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                uxe uxeVar4 = uxeVar3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    uxeVar3 = uxeVar4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            uxeVar = uxeVar3;
                            cursorQuery.close();
                            js8Var.c = new r76(z86Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        js8Var.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new ii0(j, ij0Var2, js8Var.j()));
                    uxeVar3 = uxeVar;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                uxe uxeVar5 = (uxe) obj4;
                HashMap map = (HashMap) obj3;
                ljf ljfVar = (ljf) obj2;
                ArrayList arrayList3 = (ArrayList) ljfVar.d;
                Cursor cursor3 = (Cursor) obj;
                uxeVar5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i13 = cursor3.getInt(1);
                    he9 he9Var3 = he9.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            he9Var3 = he9.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            he9Var = he9Var2;
                        } else if (i13 == i5) {
                            he9Var3 = he9.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            he9Var3 = he9.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            he9Var3 = he9.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            he9Var3 = he9.SERVER_ERROR;
                        } else {
                            e2k.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        he9Var = he9Var3;
                    } else {
                        he9Var = he9Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new ie9(j2, he9Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = me9.c;
                    new ArrayList();
                    arrayList3.add(new me9((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jI = uxeVar5.b.i();
                SQLiteDatabase sQLiteDatabaseL = uxeVar5.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        lsh lshVar = new lsh(cursorRawQuery.getLong(0), jI);
                        cursorRawQuery.close();
                        sQLiteDatabaseL.setTransactionSuccessful();
                        sQLiteDatabaseL.endTransaction();
                        ljfVar.c = lshVar;
                        ljfVar.e = new wn7(new lqg(uxeVar5.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * uxeVar5.l().compileStatement("PRAGMA page_count").simpleQueryForLong(), lh0.f.a));
                        ljfVar.b = (String) uxeVar5.e.get();
                        return new dt3((lsh) ljfVar.c, Collections.unmodifiableList(arrayList3), (wn7) ljfVar.e, (String) ljfVar.b);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseL.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.n3a
    public void b(i2a i2aVar) {
        o3a o3aVar = (o3a) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        d3a d3aVar = o3aVar.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        h88 h88VarN = d3aVar.n(i2aVar);
        if (resultReceiver != null) {
            h88VarN.b(new su6(h88VarN, 21, resultReceiver), im5.a);
        }
    }

    public void c(Bitmap bitmap) {
        obm b9mVar;
        d4c d4cVar = (d4c) this.b;
        po7 po7Var = (po7) this.c;
        LatLngBounds latLngBounds = (LatLngBounds) this.d;
        if (bitmap != null) {
            xq7 xq7Var = new xq7();
            xq7Var.i = 0.0f;
            xq7Var.j = 0.5f;
            xq7Var.k = 0.5f;
            xq7Var.l = false;
            xq7Var.h = true;
            xq7Var.g = 1.0f;
            xq7Var.a = oel.b(bitmap);
            LatLng latLng = xq7Var.b;
            yab.u("Position has already been set using position: ".concat(String.valueOf(latLng)), latLng == null);
            xq7Var.e = latLngBounds;
            po7Var.getClass();
            try {
                y8l y8lVar = po7Var.a;
                Parcel parcelL0 = y8lVar.l0();
                duk.c(parcelL0, xq7Var);
                Parcel parcelK0 = y8lVar.k0(12, parcelL0);
                IBinder strongBinder = parcelK0.readStrongBinder();
                int i = ham.d;
                if (strongBinder == null) {
                    b9mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    b9mVar = iInterfaceQueryLocalInterface instanceof obm ? (obm) iInterfaceQueryLocalInterface : new b9m(strongBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 2);
                }
                parcelK0.recycle();
                d4cVar.e = b9mVar != null ? new wq7(b9mVar) : null;
            } catch (RemoteException e) {
                f4a.d(e);
            }
        }
    }

    @Override // defpackage.wo
    public uo d(uo uoVar) {
        return !cqk.d(uoVar.c, (String) this.b) ? uoVar : uoVar.e((String) this.c, (String) this.d);
    }

    @Override // defpackage.se5
    public ghe e(int i, hyh hyhVar, int[] iArr) {
        pe5 pe5Var = (pe5) this.d;
        String str = (String) this.b;
        String str2 = (String) this.c;
        z88 z88VarL = c98.l();
        for (int i2 = 0; i2 < hyhVar.a; i2++) {
            z88VarL.c(new re5(i, hyhVar, i2, pe5Var, iArr[i2], str, str2));
        }
        return z88VarL.h();
    }

    @Override // defpackage.hch
    public void f(dj0 dj0Var) {
        hhd hhdVar;
        c7k c7kVar = (c7k) this.b;
        pf2 pf2Var = (pf2) this.c;
        ich ichVar = (ich) this.d;
        ghd ghdVar = (ghd) c7kVar.b;
        tvj.a("PreviewView", "Preview transformation info updated. " + dj0Var);
        boolean z = pf2Var.j().j() == 0;
        bhd bhdVar = ghdVar.d;
        Size size = ichVar.b;
        bhdVar.getClass();
        tvj.a("PreviewTransform", "Transformation info set: " + dj0Var + " " + size + " " + z);
        bhdVar.b = dj0Var.a;
        bhdVar.c = dj0Var.b;
        int i = dj0Var.c;
        bhdVar.e = i;
        bhdVar.a = size;
        bhdVar.f = z;
        bhdVar.g = dj0Var.d;
        bhdVar.d = dj0Var.e;
        if (i == -1 || ((hhdVar = ghdVar.b) != null && (hhdVar instanceof och))) {
            ghdVar.e = true;
        } else {
            ghdVar.e = false;
        }
        ghdVar.b();
    }

    @Override // defpackage.oo7
    public void f0() {
        d4c d4cVar = (d4c) this.b;
        oo7 oo7Var = (oo7) this.c;
        po7 po7Var = (po7) this.d;
        wq7 wq7Var = d4cVar.e;
        if (wq7Var != null) {
            try {
                b9m b9mVar = (b9m) wq7Var.a;
                b9mVar.m0(1, b9mVar.l0());
            } catch (RemoteException e) {
                f4a.d(e);
                return;
            }
        }
        if (oo7Var != null) {
            oo7Var.f0();
        }
        po7Var.i(d4cVar);
    }

    public void g() {
        c7k c7kVar = (c7k) this.b;
        zgd zgdVar = (zgd) this.c;
        pf2 pf2Var = (pf2) this.d;
        AtomicReference atomicReference = ((ghd) c7kVar.b).g;
        do {
            if (atomicReference.compareAndSet(zgdVar, null)) {
                zgdVar.b(fhd.a);
                break;
            }
        } while (atomicReference.get() == zgdVar);
        lg7 lg7Var = zgdVar.e;
        if (lg7Var != null) {
            lg7Var.cancel(false);
            zgdVar.e = null;
        }
        pf2Var.b().j(zgdVar);
    }

    @Override // defpackage.j8h
    public Task i(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
        String str = (String) this.b;
        c01 c01Var = (c01) this.d;
        String str2 = (String) obj;
        zo7 zo7VarE = FirebaseMessaging.e(firebaseMessaging.b);
        String strF = firebaseMessaging.f();
        String strB = firebaseMessaging.h.b();
        synchronized (zo7VarE) {
            String strA = c01.a(System.currentTimeMillis(), str2, strB);
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) zo7VarE.b).edit();
                editorEdit.putString(zo7.h(strF, str), strA);
                editorEdit.commit();
            }
        }
        if (c01Var == null || !str2.equals(c01Var.a)) {
            ov6 ov6Var = firebaseMessaging.a;
            ov6Var.a();
            if ("[DEFAULT]".equals(ov6Var.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    ov6Var.a();
                    sb.append(ov6Var.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str2);
                new kzi(firebaseMessaging.b, 1).z(intent);
            }
        }
        return gwl.e(str2);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 2:
                ((xf) obj).P0((wf) obj4, (b87) obj3, (w55) obj2);
                break;
            case 11:
                ((j3d) obj).Z(((c4d) ((js8) obj4).a).c.a, ((c4d) ((js8) obj3).a).c.a, ((Integer) obj2).intValue());
                break;
            default:
                k84 k84Var = ((g2i) obj4).u;
                k84Var.getClass();
                ((e2i) obj).b(k84Var, (nh6) obj3, (ExportException) obj2);
                break;
        }
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        fm5 fm5Var = (fm5) this.b;
        yt1 yt1Var = (yt1) this.c;
        wig wigVar = (wig) this.d;
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        fm5Var.a.post(new h82(fm5Var, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), yt1Var, wigVar, 2));
    }

    @Override // defpackage.v7
    public void run() throws Throwable {
        ((ExternalIdsResolver) this.b).lambda$resolveIds$0((List) this.c, (MappingContext) this.d);
    }

    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        boolean z;
        ll5 ll5Var = (ll5) this.b;
        Context context = (Context) this.c;
        reh rehVar = (reh) this.d;
        exj exjVar = ixjVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = uw8.a;
        if (uw8.b(uw8.c)) {
            int iA = uw8.a(context);
            int i2 = marginLayoutParams.bottomMargin;
            if (i2 < iA) {
                marginLayoutParams.bottomMargin = i2 + iA;
            }
            z = true;
        } else {
            if (ll5Var.b && marginLayoutParams.bottomMargin >= uw8.a(context)) {
                marginLayoutParams.bottomMargin -= uw8.a(context);
            } else if (!((h9c) ll5Var.d).e.d) {
                marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, exjVar.f(519).d);
            }
            z = false;
        }
        ll5Var.b = z;
        mi8 mi8VarF = exjVar.f(519);
        do5 do5VarE = exjVar.e();
        int iMax = Math.max(Math.max(Math.max(mi8VarF.a, do5VarE != null ? do5VarE.b() : 0), Math.max(mi8VarF.c, do5VarE != null ? do5VarE.c() : 0)), Math.max((context.getResources().getDisplayMetrics().widthPixels - Math.min(gm0.K(480.0f * yl5.d().getDisplayMetrics().density), context.getResources().getDisplayMetrics().widthPixels)) / 2, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f)));
        rehVar.setPadding(iMax, gm0.K(0.0f * yl5.d().getDisplayMetrics().density), iMax, gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        view.setLayoutParams(marginLayoutParams);
        return ixjVar;
    }

    @Override // defpackage.t65
    public Object t() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 1:
                return new CallJoinLinkPreviewWidget((String) obj3, (Boolean) obj2, (ha9) obj);
            case 9:
                return new FoldersPickerScreen((long[]) obj2, (String) obj3, (ha9) obj);
            case 27:
                return new PublishStoryBottomSheet((t3f) obj2, (String) obj3, (ha9) obj);
            default:
                return new StoriesViewerScreen((t3f) obj3, (tug) obj2, (ha9) obj);
        }
    }

    public /* synthetic */ oo(pe5 pe5Var, String str, String str2) {
        this.a = 4;
        this.d = pe5Var;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ oo(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }

    public /* synthetic */ oo(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.t00
    public e89 apply(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 13:
                d3a d3aVar = (d3a) obj4;
                Handler handler = d3aVar.l;
                su6 su6Var = new su6(d3aVar, (i2a) obj3, new d86(d3aVar, (f4a) obj2, (j2a) obj, 14));
                wmf wmfVar = new wmf(0);
                String str = vqi.a;
                mof mofVarR = mof.r();
                vqi.d0(handler, new alg(mofVarR, su6Var, wmfVar, 6));
                return mofVarR;
            default:
                d3a d3aVar2 = (d3a) obj4;
                i2a i2aVar = (i2a) obj3;
                Handler handler2 = d3aVar2.l;
                su6 su6Var2 = new su6(d3aVar2, i2aVar, new sc2(d3aVar2, (q4a) obj2, i2aVar, (List) obj, 7));
                wmf wmfVar2 = new wmf(0);
                String str2 = vqi.a;
                mof mofVarR2 = mof.r();
                vqi.d0(handler2, new alg(mofVarR2, su6Var2, wmfVar2, 6));
                return mofVarR2;
        }
    }
}
