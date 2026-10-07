package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;
import javax.inject.Provider;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import one.video.upload.exceptions.UploadUrlExpiredException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ljf implements w3f, u6e, qeh, vhi, d8h {
    public static ljf f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public ljf(int i) {
        this.a = i;
        switch (i) {
            case 5:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            case 9:
                break;
            case 15:
                this.b = HttpGet.METHOD_NAME;
                this.d = new ArrayList();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.b = new t2b(0);
                this.d = new HashSet();
                long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + 2082844800;
                this.e = new u2b(jCurrentTimeMillis, jCurrentTimeMillis);
                break;
            case 26:
                this.b = new nmc();
                this.c = new nmc();
                this.d = new jtc();
                break;
            case 27:
                this.b = new ifh(new vbd(4));
                this.c = new ifh(new vbd(5));
                this.d = new ifh(new vbd(6));
                this.e = new ifh(new vbd(7));
                break;
            case 28:
                this.b = new ih(27);
                this.c = new xp9(27);
                this.d = new kzi(27);
                this.e = new zo7(24);
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public static synchronized ljf D() {
        try {
            if (f == null) {
                f = new ljf(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public static int G(List list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(((ws0) list.get(i)).c));
        }
        return hashSet.size();
    }

    public static void V(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public au3 A() {
        au3 au3Var;
        v71 v71Var;
        qu4 qu4Var;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.e).iterator();
                au3Var = null;
                if (it.hasNext()) {
                    v71Var = (v71) it.next();
                    it.remove();
                } else {
                    v71Var = null;
                }
            }
            if (v71Var == null) {
                return null;
            }
            nj9 nj9Var = (nj9) ((ru4) this.c);
            nj9Var.getClass();
            synchronized (nj9Var) {
                try {
                    qu4Var = (qu4) nj9Var.a.m(v71Var);
                    z = false;
                    if (qu4Var != null) {
                        qu4 qu4Var2 = (qu4) nj9Var.b.m(v71Var);
                        qu4Var2.getClass();
                        oc9.r(qu4Var2.c == 0);
                        au3Var = qu4Var2.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                nj9.k(qu4Var);
            }
        } while (au3Var == null);
        return au3Var;
    }

    public s18 B() {
        return (s18) this.d;
    }

    @Override // defpackage.qeh
    public int C() {
        if ((((h9c) ((ll5) this.b).d).e.a & 1) != 0) {
            return 0;
        }
        return ((reh) this.e).getMeasuredHeight();
    }

    public String E() {
        return (String) this.b;
    }

    @Override // defpackage.d8h
    public int F() {
        return 2;
    }

    @Override // defpackage.u6e
    public void G0() {
        t6e t6eVar = (t6e) ((wfe) this.e).a;
        if (t6eVar != null) {
            v6e v6eVar = t6eVar.a;
            RecyclerView recyclerView = v6eVar.e;
            int height = recyclerView.getHeight();
            t6eVar.b();
            v6e.d(v6eVar, (List) t6eVar.e.invoke(), (Integer) t6eVar.f.invoke(), null, 4);
            int i = recyclerView.getLayoutParams().height;
            t6eVar.g.invoke();
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.height = height;
            recyclerView.setLayoutParams(layoutParams);
            t6eVar.a(height, i, null);
            p0m.a(recyclerView, lt7.KEYBOARD_TAP);
        }
    }

    public int H(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayListN = n(list);
        for (int i = 0; i < arrayListN.size(); i++) {
            hashSet.add(Integer.valueOf(((ws0) arrayListN.get(i)).c));
        }
        return hashSet.size();
    }

    public String I() {
        return (String) this.c;
    }

    public void J(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("feedback");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    ((l6m) this.c).getClass();
                    arrayList.add(l6m.s(jSONObject2));
                }
            }
            ((iw8) this.d).getClass();
            ((yo6) this.e).onFeedback(new ui1(iw8.k(jSONObject), arrayList));
        } catch (JSONException e) {
            ((CidLogger) this.b).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public boolean K(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean L(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void M(String str, String str2) {
        ((ArrayList) this.d).add(new r18(str, str2));
    }

    public boolean N(String str) {
        String str2 = (String) this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.d;
        if (str3 == null) {
            this.d = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.e) == null) {
            HashSet hashSet = new HashSet(16);
            this.e = hashSet;
            hashSet.add((String) this.b);
            ((HashSet) this.e).add((String) this.d);
        }
        return !((HashSet) this.e).add(str);
    }

    public void O(String str) {
    }

    public void P(String str) {
        this.b = str;
    }

    @Override // defpackage.u6e
    public void P0(g6e g6eVar) {
        ia8 ia8Var;
        kja kjaVar;
        z5e z5eVar;
        ljf ljfVar = (ljf) this.b;
        MessageModel messageModelR = ((jsa) ljfVar.b).R(((MessageModel) this.c).a);
        s5e s5eVar = null;
        ((a8e) ljfVar.c).T(new x7e(g6eVar.b, gnl.b(messageModelR), messageModelR != null ? messageModelR.b : 0L, messageModelR != null ? messageModelR.w : null));
        ((msa) this.d).invoke();
        if (messageModelR != null && (kjaVar = messageModelR.w) != null && (z5eVar = kjaVar.c) != null) {
            s5eVar = z5eVar.b;
        }
        if (cqk.d(s5eVar, g6eVar.b) || (ia8Var = (ia8) ((ny8) ljfVar.e).getValue()) == null) {
            return;
        }
        ia8Var.f(Collections.singleton(new ha8(fa8.ADD_2_REACTIONS, 1)), y3f.CHAT);
    }

    public void Q(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            ((s81) this.b).invoke(oh1.m, new ri1(d(jSONObject)));
        } catch (JSONException e) {
            ((CidLogger) this.c).logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public void R(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            ((s81) this.b).invoke(oh1.n, new si1(o(jSONObject)));
        } catch (JSONException e) {
            ((CidLogger) this.c).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    public void S() {
        if (!((nf5) this.e).v) {
            ((o02) this.d).q(new ff5((nf5) this.e, 3), true);
        } else {
            ((Executor) this.b).execute(new jj2(23, (swi) this.c));
            g55.a();
        }
    }

    public uvc T(JSONArray jSONArray, dnf dnfVar) throws JSONException {
        du1 du1Var = (du1) this.b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.getClass();
            String string = jSONObject.getString("state");
            yt1 yt1VarX = kql.x(jSONObject);
            if (yt1VarX.equals(du1Var.a)) {
                du1Var.r = ((tx) this.d).d(jSONObject, dnfVar);
                ArrayList arrayListU = kql.u(jSONObject);
                ArrayList arrayList3 = du1Var.d;
                arrayList3.clear();
                arrayList3.addAll(arrayListU);
                Integer numC = kql.C(jSONObject);
                if (numC != null) {
                    du1Var.s = numC.intValue();
                }
                zq1 zq1Var = (zq1) this.c;
                zq1Var.o(jSONObject, "handleConversationParticipants", zq1Var.g(dnfVar, 2), true, false, dnfVar, dnfVar);
            } else if ("ACCEPTED".equals(string)) {
                arrayList.add(w(yt1VarX, jSONObject, dnfVar));
            } else if ("CALLED".equals(string)) {
                arrayList.add(x(yt1VarX, jSONObject, dnfVar));
            } else {
                hashSet.add(yt1VarX);
            }
            au1 au1VarD = ((wmc) this.e).d(jSONObject);
            if (au1VarD != null) {
                arrayList2.add(au1VarD);
            }
        }
        return new uvc(arrayList, hashSet, arrayList2);
    }

    public void U(int i) {
    }

    public ws0 W(List list) {
        ws0 ws0Var;
        HashMap map = (HashMap) this.d;
        ArrayList arrayListN = n(list);
        if (arrayListN.size() < 2) {
            return (ws0) q4m.c(arrayListN.iterator(), null);
        }
        Collections.sort(arrayListN, new ps0(1));
        ArrayList arrayList = new ArrayList();
        int i = ((ws0) arrayListN.get(0)).c;
        for (int i2 = 0; i2 < arrayListN.size(); i2++) {
            ws0 ws0Var2 = (ws0) arrayListN.get(i2);
            if (i != ws0Var2.c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (ws0) arrayListN.get(0);
            }
            arrayList.add(new Pair(ws0Var2.b, Integer.valueOf(ws0Var2.d)));
        }
        ws0 ws0Var3 = (ws0) map.get(arrayList);
        if (ws0Var3 != null) {
            return ws0Var3;
        }
        List listSubList = arrayListN.subList(0, arrayList.size());
        int i3 = 0;
        for (int i4 = 0; i4 < listSubList.size(); i4++) {
            i3 += ((ws0) listSubList.get(i4)).d;
        }
        int iNextInt = ((Random) this.e).nextInt(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < listSubList.size(); i6++) {
            ws0Var = (ws0) listSubList.get(i6);
            i5 += ws0Var.d;
            if (iNextInt < i5) {
                map.put(arrayList, ws0Var);
                return ws0Var;
            }
        }
        ws0Var = (ws0) np4.n(listSubList);
        map.put(arrayList, ws0Var);
        return ws0Var;
    }

    public void X(String str) {
        this.c = str;
    }

    @Override // defpackage.w3f
    public sya a() {
        switch (this.a) {
            case 13:
                return (sya) ((ifh) this.d).getValue();
            default:
                return (sya) this.d;
        }
    }

    @Override // defpackage.w3f
    public void b(ContentResolver contentResolver, Uri uri) throws IOException {
        switch (this.a) {
            case 13:
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
                if (outputStreamOpenOutputStream != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream((File) this.c);
                        try {
                            byte[] bArr = new byte[1024];
                            for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            }
                            fileInputStream.close();
                            outputStreamOpenOutputStream.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                rx8.n(fileInputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            rx8.n(outputStreamOpenOutputStream, th3);
                            throw th4;
                        }
                    }
                }
                return;
            default:
                OutputStream outputStreamOpenOutputStream2 = contentResolver.openOutputStream(uri, "w");
                if (outputStreamOpenOutputStream2 != null) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.c);
                        try {
                            byte[] bArr2 = new byte[1024];
                            for (int i2 = fileInputStream2.read(bArr2); i2 > 0; i2 = fileInputStream2.read(bArr2)) {
                                outputStreamOpenOutputStream2.write(bArr2, 0, i2);
                            }
                            fileInputStream2.close();
                            outputStreamOpenOutputStream2.close();
                            return;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                rx8.n(fileInputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            rx8.n(outputStreamOpenOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                return;
        }
    }

    @Override // defpackage.qeh
    public void c() {
        Handler handler = m8c.a;
        m8c.b((k8c) ((ll5) this.b).h, j8c.b);
    }

    public LinkedHashSet d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("features");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            so2 so2Var = (so2) this.d;
            string.getClass();
            so2Var.getClass();
            oi1 oi1VarL = so2.L(string);
            if (oi1VarL != null) {
                linkedHashSet.add(oi1VarL);
            } else {
                ((CidLogger) this.c).log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.vhi
    public void e(long j) {
        ((wze) this.e).f(null);
    }

    @Override // defpackage.w3f
    public Uri f() {
        switch (this.a) {
            case 13:
                break;
        }
        return (Uri) this.e;
    }

    @Override // defpackage.vhi
    public void g(iji ijiVar) {
        njd njdVar = (njd) this.d;
        wec.b((wec) this.b, ijiVar, (uhi) this.c);
        if (ijiVar.equals(hji.a)) {
            return;
        }
        if (ijiVar instanceof gji) {
            gji gjiVar = (gji) ijiVar;
            long j = gjiVar.b;
            njdVar.f.c(new hii(j == 0 ? 0 : Math.min((int) ((gjiVar.a / j) * 100.0f), 100), j, null));
        } else if (ijiVar instanceof eji) {
            njdVar.c(new hii(100, ((eji) ijiVar).a, null));
            njdVar.i(null);
        } else {
            if (ijiVar instanceof fji) {
                Throwable httpUrlExpiredException = ((fji) ijiVar).a;
                if (httpUrlExpiredException instanceof UploadUrlExpiredException) {
                    httpUrlExpiredException = new HttpUrlExpiredException(null, null, 7);
                }
                njdVar.i(httpUrlExpiredException);
                return;
            }
            if (ijiVar.equals(dji.a)) {
                njdVar.i(null);
            } else {
                ore.o();
            }
        }
    }

    @Override // defpackage.w3f
    public Integer getHeight() {
        switch (this.a) {
        }
        return null;
    }

    @Override // defpackage.w3f
    public Integer getWidth() {
        switch (this.a) {
        }
        return null;
    }

    @Override // defpackage.w3f
    public String i() {
        switch (this.a) {
            case 13:
                break;
        }
        return (String) this.b;
    }

    @Override // defpackage.w3f
    public Integer j() {
        switch (this.a) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    @Override // defpackage.d8h
    public void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        int[] iArr;
        yy4 yy4Var;
        int i3;
        int i4;
        int iA;
        int i5;
        int i6;
        int iD;
        jtc jtcVar = (jtc) this.d;
        nmc nmcVar = (nmc) this.c;
        nmc nmcVar2 = (nmc) this.b;
        nmcVar2.L(i + i2, bArr);
        nmcVar2.N(i);
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (vqi.V(nmcVar2, nmcVar, (Inflater) this.e)) {
            nmcVar2.L(nmcVar.c, nmcVar.a);
        }
        int i7 = 0;
        jtcVar.a = 0;
        int[] iArr2 = (int[]) jtcVar.i;
        nmc nmcVar3 = (nmc) jtcVar.h;
        jtcVar.b = 0;
        jtcVar.c = 0;
        jtcVar.d = 0;
        jtcVar.e = 0;
        jtcVar.f = 0;
        nmcVar3.K(0);
        jtcVar.g = false;
        ArrayList arrayList = new ArrayList();
        while (nmcVar2.a() >= 3) {
            int i8 = nmcVar2.c;
            int iA2 = nmcVar2.A();
            int iH = nmcVar2.H();
            int i9 = nmcVar2.b + iH;
            if (i9 > i8) {
                nmcVar2.N(i8);
                i3 = i7;
                iArr = iArr2;
                yy4Var = null;
            } else {
                char c = 128;
                if (iA2 != 128) {
                    switch (iA2) {
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            if (iH % 5 == 2) {
                                nmcVar2.O(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iH / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iA3 = nmcVar2.A();
                                    char c2 = c;
                                    double dA = nmcVar2.A();
                                    double dA2 = nmcVar2.A() - 128;
                                    int[] iArr3 = iArr2;
                                    double dA3 = nmcVar2.A() - 128;
                                    iArr3[iA3] = vqi.j((int) ((dA3 * 1.772d) + dA), 0, 255) | (nmcVar2.A() << 24) | (vqi.j((int) ((1.402d * dA2) + dA), 0, 255) << 16) | (vqi.j((int) ((dA - (0.34414d * dA3)) - (dA2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                jtcVar.g = true;
                            } else {
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iH >= 4) {
                                nmcVar2.O(3);
                                int i12 = iH - 4;
                                if (((128 & nmcVar2.A()) != 0 ? 1 : i7) == 0) {
                                    i5 = nmcVar3.b;
                                    i6 = nmcVar3.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        nmcVar2.k(i5, nmcVar3.a, iMin);
                                        nmcVar3.N(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iD = nmcVar2.D()) >= 4) {
                                    jtcVar.e = nmcVar2.H();
                                    jtcVar.f = nmcVar2.H();
                                    nmcVar3.K(iD - 4);
                                    i12 = iH - 11;
                                    i5 = nmcVar3.b;
                                    i6 = nmcVar3.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        nmcVar2.k(i5, nmcVar3.a, iMin2);
                                        nmcVar3.N(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iH >= 19) {
                                jtcVar.a = nmcVar2.H();
                                jtcVar.b = nmcVar2.H();
                                nmcVar2.O(11);
                                jtcVar.c = nmcVar2.H();
                                jtcVar.d = nmcVar2.H();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    yy4Var = null;
                } else {
                    iArr = iArr2;
                    if (jtcVar.a == 0 || jtcVar.b == 0 || jtcVar.e == 0 || jtcVar.f == 0 || (i4 = nmcVar3.c) == 0 || nmcVar3.b != i4 || !jtcVar.g) {
                        yy4Var = null;
                    } else {
                        nmcVar3.N(0);
                        int i13 = jtcVar.e * jtcVar.f;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iA4 = nmcVar3.A();
                            if (iA4 != 0) {
                                iA = i14 + 1;
                                iArr4[i14] = iArr[iA4];
                            } else {
                                int iA5 = nmcVar3.A();
                                if (iA5 != 0) {
                                    iA = ((iA5 & 64) == 0 ? iA5 & 63 : ((iA5 & 63) << 8) | nmcVar3.A()) + i14;
                                    Arrays.fill(iArr4, i14, iA, (iA5 & np0.m) == 0 ? iArr[0] : iArr[nmcVar3.A()]);
                                }
                            }
                            i14 = iA;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, jtcVar.e, jtcVar.f, Bitmap.Config.ARGB_8888);
                        float f2 = jtcVar.c;
                        float f3 = jtcVar.a;
                        float f4 = f2 / f3;
                        float f5 = jtcVar.d;
                        float f6 = jtcVar.b;
                        yy4Var = new yy4(null, null, null, bitmapCreateBitmap, f5 / f6, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, jtcVar.e / f3, jtcVar.f / f6, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    jtcVar.a = 0;
                    jtcVar.b = 0;
                    jtcVar.c = 0;
                    jtcVar.d = 0;
                    jtcVar.e = 0;
                    jtcVar.f = 0;
                    nmcVar3.K(0);
                    jtcVar.g = false;
                }
                nmcVar2.N(i9);
            }
            if (yy4Var != null) {
                arrayList.add(yy4Var);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        qg4Var.accept(new bz4(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.w3f
    public void l(File file) {
        switch (this.a) {
            case 13:
                lu6.k0((File) this.c, file);
                break;
            default:
                lu6.k0((File) this.c, file);
                break;
        }
    }

    public void m(jwa jwaVar) {
        if (jwaVar instanceof t2b) {
            this.b = (t2b) jwaVar;
            return;
        }
        if (jwaVar instanceof r2b) {
            this.c = (r2b) jwaVar;
            return;
        }
        if (jwaVar instanceof u2b) {
            this.e = (u2b) jwaVar;
        } else if (jwaVar instanceof qp9) {
            ((HashSet) this.d).add((qp9) jwaVar);
        } else {
            ore.p("Unsupported metadata");
        }
    }

    public ArrayList n(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.b;
        V(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.c;
        V(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ws0 ws0Var = (ws0) list.get(i);
            if (!map.containsKey(ws0Var.b) && !map2.containsKey(Integer.valueOf(ws0Var.c))) {
                arrayList.add(ws0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    public Map o(JSONObject jSONObject) {
        Collection collection;
        bu1 bu1Var;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("featuresPerRole");
        if (jSONObjectOptJSONObject == null) {
            return s66.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            so2 so2Var = (so2) this.d;
            next.getClass();
            so2Var.getClass();
            oi1 oi1VarL = so2.L(next);
            if (oi1VarL == null) {
                ((CidLogger) this.c).log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(next));
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray == null) {
                    collection = c76.a;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            ((dul) this.e).getClass();
                            int iHashCode = strOptString.hashCode();
                            if (iHashCode != -1290540065) {
                                if (iHashCode != 62130991) {
                                    if (iHashCode == 1746537484 && strOptString.equals("CREATOR")) {
                                        bu1Var = bu1.a;
                                    } else {
                                        bu1Var = null;
                                    }
                                } else if (strOptString.equals("ADMIN")) {
                                    bu1Var = bu1.b;
                                } else {
                                    bu1Var = null;
                                }
                            } else if (strOptString.equals("SPEAKER")) {
                                bu1Var = bu1.c;
                            } else {
                                bu1Var = null;
                            }
                            if (bu1Var != null) {
                                linkedHashSet.add(bu1Var);
                            }
                        }
                    }
                    collection = linkedHashSet;
                }
                linkedHashMap.put(oi1VarL, collection);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.qeh
    public void onDismiss() {
        ll5 ll5Var = (ll5) this.b;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) ll5Var.c).get();
        if (viewGroup != null) {
            viewGroup.post(new i7b(ll5Var, 3, (wfe) this.c));
        }
        Handler handler = m8c.a;
        k8c k8cVar = (k8c) ll5Var.h;
        l8c l8cVar = m8c.b;
        if (l8cVar != null ? cqk.d(l8cVar.b.get(), k8cVar) : false) {
            m8c.b = null;
            if (m8c.c != null) {
                m8c.d();
            }
        }
    }

    public void p(t80 t80Var) {
        this.e = t80Var;
    }

    public ljf q() {
        String str = (String) this.b;
        String str2 = (String) this.c;
        if (str2 != null) {
            return new ljf(str, str2, new s18(0, (r18[]) ((ArrayList) this.d).toArray(new r18[0])), (t80) this.e, 16);
        }
        ore.k("Required value was null.");
        return null;
    }

    public k84 r(Long l, uzh uzhVar) {
        boolean z;
        ay9 ay9VarA = ((ry9) this.b).a();
        Range range = uzhVar.c;
        if (!range.equals(uzh.g) && l != null) {
            float fLongValue = l.longValue();
            long jFloatValue = (long) (((Number) range.getLower()).floatValue() * fLongValue);
            long jFloatValue2 = (long) (((Number) range.getUpper()).floatValue() * fLongValue);
            by9 by9Var = new by9();
            by9Var.b(jFloatValue);
            by9Var.a(jFloatValue2);
            ay9VarA.d = new cy9(by9Var).a();
        }
        ry9 ry9VarA = ay9VarA.a();
        szh szhVar = uzhVar.a;
        int i = szhVar.a;
        int i2 = szhVar.b;
        cgd cgdVarG = cgd.g(i - (i % 4), i2 - (i2 % 4));
        r26 r26Var = new r26(ry9VarA);
        r26Var.b = uzhVar.d;
        r26Var.f = new j36(r66.a, Collections.singletonList(cgdVarG));
        k84 k84Var = new k84(new t26(new kzi(new s26(r26Var))), new t26[0]);
        nu3 nu3Var = uzhVar.e;
        if (nu3Var.equals(ou7.f)) {
            z = false;
        } else {
            if (!(nu3Var instanceof ku3)) {
                ore.o();
                return null;
            }
            z = ((ku3) nu3Var).a;
        }
        if (z) {
            k84Var.g = 0;
        } else {
            k84Var.g = 2;
        }
        return k84Var.a();
    }

    @Override // defpackage.qeh
    public int s() {
        l9c l9cVar = (l9c) this.d;
        if ((((h9c) ((ll5) this.b).d).e.a & 1) != 0) {
            return l9cVar.getMeasuredHeight();
        }
        return zo5.D(12.0f, yl5.d().getDisplayMetrics().density, ((reh) this.e).getMeasuredHeight() - l9cVar.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0055  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0 A[ADDED_TO_REGION] */
    public g2i t(uzh uzhVar, c5f c5fVar, Long l, h0i h0iVar) {
        Pair pairB;
        Integer num;
        ex3 ex3Var;
        a0a a0aVar = (a0a) this.c;
        b87 b87Var = a0aVar.b;
        ze9 ze9Var = (ze9) this.e;
        boolean z = true;
        gwi gwiVar = new gwi(uzhVar.b, 1, -1, -1, 1.0f, -1, -1, -1L, -1, -1, -1);
        Context context = (Context) this.d;
        ka5 ka5Var = new ka5(context);
        ka5Var.c = gwiVar;
        nu3 nu3Var = uzhVar.e;
        ou7 ou7Var = ou7.f;
        String str = null;
        if (!nu3Var.equals(ou7Var) && !(nu3Var instanceof ku3)) {
            ore.o();
            return null;
        }
        ka5Var.e = false;
        ka5 ka5Var2 = new ka5(ka5Var);
        if (nu3Var.equals(ou7Var)) {
            str = "video/avc";
        } else {
            if (!(nu3Var instanceof ku3)) {
                ore.o();
                return null;
            }
            String str2 = b87Var.n;
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1851077871) {
                    if (iHashCode == 1331836730 && str2.equals("video/avc")) {
                        str = "video/avc";
                    }
                } else if (str2.equals("video/dolby-vision")) {
                    if (!((ku3) nu3Var).a || Build.VERSION.SDK_INT < 33) {
                        if (cqk.d(b87Var.n, "video/dolby-vision") && (pairB = qu3.b(b87Var)) != null) {
                            num = (Integer) pairB.first;
                            if ((num != null || num.intValue() != 16) && ((num == null || num.intValue() != 32) && (num == null || num.intValue() != 256))) {
                                if (num != null && num.intValue() == 512) {
                                    str = "video/avc";
                                } else if (num != null && num.intValue() == 1024) {
                                    str = "video/av01";
                                }
                            }
                        }
                        ze9Var.m("Media3Builder", new nz7(str, 1));
                    } else {
                        c98 c98VarE = y86.e("video/dolby-vision");
                        if (c98VarE.isEmpty()) {
                            if (cqk.d(b87Var.n, "video/dolby-vision")) {
                                num = (Integer) pairB.first;
                                str = num != null ? "video/hevc" : "video/hevc";
                            }
                            ze9Var.m("Media3Builder", new nz7(str, 1));
                        } else {
                            Iterator<E> it = c98VarE.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (cqk.d(b87Var.n, "video/dolby-vision")) {
                                        num = (Integer) pairB.first;
                                        if (num != null) {
                                        }
                                    }
                                    ze9Var.m("Media3Builder", new nz7(str, 1));
                                } else if (c98.n(k4m.a(((MediaCodecInfo) it.next()).getCapabilitiesForType("video/dolby-vision").colorFormats)).contains(2130750114)) {
                                    ze9Var.m("Media3Builder", new bh9(11));
                                }
                            }
                        }
                    }
                }
            }
        }
        ze9Var.j("Media3Builder", new nz7(str, 2));
        b87 b87Var2 = a0aVar.c;
        boolean z2 = b87Var2 != null && b87Var2.q.isEmpty();
        if (!cqk.d(str, "video/avc") || ((ex3Var = b87Var.D) != null && ex3Var.b == 2)) {
            z = false;
        }
        ze9Var.j("Media3Builder", new sp9(0, z, z2));
        jb1 jb1Var = new jb1(ka5Var2, z, z2);
        d2i d2iVar = new d2i(context);
        d2iVar.l = jb1Var;
        d2iVar.e = c98.r(0);
        String strN = uya.n("audio/mp4a-latm");
        lvb.S(uya.i(strN), "Not an audio MIME type: %s", strN);
        d2iVar.b = strN;
        if (str != null) {
            String strN2 = uya.n(str);
            lvb.S(uya.m(strN2), "Not a video MIME type: %s", strN2);
            d2iVar.c = strN2;
        }
        Integer num2 = uzhVar.f;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            lvb.R(iIntValue > 0 || iIntValue == -1);
            d2iVar.h = iIntValue;
        }
        d2iVar.m = new kr6(new ba8(), l, c5fVar);
        d2iVar.i.a(h0iVar);
        return d2iVar.a();
    }

    public String toString() {
        switch (this.a) {
            case 4:
                String str = (String) this.b;
                String str2 = (String) this.c;
                String strY = ch3.y((String) this.d);
                td0 td0Var = (td0) this.e;
                StringBuilder sbQ = qv1.q("PasswordChallenge(trackId='", str, "',hint='", str2, "',email='");
                sbQ.append(strY);
                sbQ.append("',config='");
                sbQ.append(td0Var);
                sbQ.append("')");
                return sbQ.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z) {
    }

    @Override // defpackage.qeh
    public int v() {
        boolean z = (((h9c) ((ll5) this.b).d).e.a & 1) != 0;
        l9c l9cVar = (l9c) this.d;
        return z ? l9cVar.getBottom() : l9cVar.getTop();
    }

    public smc w(yt1 yt1Var, JSONObject jSONObject, dnf dnfVar) {
        zq1 zq1Var = (zq1) this.c;
        n8b n8bVarF = zq1Var.f(jSONObject, yt1Var, "createAddOrUpdateParamsForAcceptedParticipant", zq1Var.h(dnfVar).a(), true);
        p8b p8bVarM = kql.m(jSONObject);
        ArrayList arrayListU = kql.u(jSONObject);
        bpc bpcVarO = kql.o(jSONObject);
        cu1 cu1VarJ = kql.J(jSONObject);
        if (bpcVarO == null) {
            bpcVarO = du1.u;
        }
        hi1 hi1VarI = kql.i(jSONObject);
        imc xr8Var = new xr8();
        imc xr8Var2 = new xr8();
        imc xr8Var3 = new xr8();
        imc xr8Var4 = new xr8();
        due dueVar = new due(bpcVarO);
        due dueVar2 = new due(n8bVarF);
        if (p8bVarM != null) {
            xr8Var = new due(p8bVarM);
        }
        due dueVar3 = new due(arrayListU);
        if (hi1VarI != null) {
            xr8Var2 = new due(hi1VarI);
        }
        imc imcVar = xr8Var;
        imc imcVar2 = xr8Var2;
        due dueVar4 = new due(((tx) this.d).d(jSONObject, dnfVar));
        Integer numC = kql.C(jSONObject);
        if (numC != null) {
            xr8Var3 = new due(numC);
        }
        if (cu1VarJ != null) {
            xr8Var4 = new due(cu1VarJ);
        }
        return new smc(yt1Var, dueVar, dueVar2, imcVar, dueVar3, imcVar2, dueVar4, xr8Var3, xr8Var4);
    }

    public smc x(yt1 yt1Var, JSONObject jSONObject, dnf dnfVar) {
        zq1 zq1Var = (zq1) this.c;
        n8b n8bVarF = zq1Var.f(jSONObject, yt1Var, "createAddOrUpdateParamsForCalledParticipant", zq1Var.h(dnfVar).a(), true);
        p8b p8bVarM = kql.m(jSONObject);
        ArrayList arrayListU = kql.u(jSONObject);
        hi1 hi1VarI = kql.i(jSONObject);
        Integer numC = kql.C(jSONObject);
        cu1 cu1VarJ = kql.J(jSONObject);
        xr8 xr8Var = new xr8();
        imc xr8Var2 = new xr8();
        imc xr8Var3 = new xr8();
        imc xr8Var4 = new xr8();
        imc xr8Var5 = new xr8();
        due dueVar = new due(n8bVarF);
        if (p8bVarM != null) {
            xr8Var2 = new due(p8bVarM);
        }
        due dueVar2 = new due(arrayListU);
        if (hi1VarI != null) {
            xr8Var3 = new due(hi1VarI);
        }
        imc imcVar = xr8Var2;
        due dueVar3 = new due(((tx) this.d).d(jSONObject, dnfVar));
        if (numC != null) {
            xr8Var4 = new due(numC);
        }
        if (cu1VarJ != null) {
            xr8Var5 = new due(cu1VarJ);
        }
        return new smc(yt1Var, xr8Var, dueVar, imcVar, dueVar2, xr8Var3, dueVar3, xr8Var4, xr8Var5);
    }

    public t80 y() {
        return (t80) this.e;
    }

    @Override // defpackage.qeh
    public View z() {
        return (l9c) this.d;
    }

    public ljf(s81 s81Var, CidLogger cidLogger, so2 so2Var, dul dulVar) {
        this.a = 6;
        so2Var.getClass();
        dulVar.getClass();
        this.b = s81Var;
        this.c = cidLogger;
        this.d = so2Var;
        this.e = dulVar;
    }

    public ljf(vn7 vn7Var) {
        this.a = 2;
        this.e = new CopyOnWriteArrayList();
        this.d = vn7Var;
    }

    public ljf(CidLogger cidLogger, du1 du1Var, zq1 zq1Var, tx txVar, wmc wmcVar) {
        this.a = 25;
        this.b = du1Var;
        this.c = zq1Var;
        this.d = txVar;
        this.e = wmcVar;
    }

    public ljf(CidLogger cidLogger, l6m l6mVar, iw8 iw8Var, yo6 yo6Var) {
        this.a = 12;
        l6mVar.getClass();
        iw8Var.getClass();
        yo6Var.getClass();
        this.b = cidLogger;
        this.c = l6mVar;
        this.d = iw8Var;
        this.e = yo6Var;
    }

    public ljf(File file, int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.c = file;
                this.b = Environment.DIRECTORY_MOVIES;
                this.d = sya.VIDEO_MP4;
                this.e = MediaStore.Video.Media.getContentUri("external_primary");
                break;
            default:
                this.c = file;
                this.b = Environment.DIRECTORY_PICTURES;
                this.d = new ifh(new mp5(8, this));
                this.e = MediaStore.Images.Media.getContentUri("external_primary");
                break;
        }
    }

    public ljf(Context context, e5d e5dVar, jsa jsaVar, a8e a8eVar, ExecutorService executorService, ny8 ny8Var) {
        this.a = 19;
        this.b = jsaVar;
        this.c = a8eVar;
        this.d = executorService;
        this.e = ny8Var;
    }

    public ljf(Closeable closeable) {
        this.a = 11;
        this.c = closeable;
    }

    public ljf(Typeface typeface, twa twaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.a = 21;
        this.e = typeface;
        this.b = twaVar;
        this.d = new ywa(1024);
        int iA = twaVar.a(6);
        if (iA != 0) {
            int i5 = iA + twaVar.a;
            i = twaVar.b.getInt(twaVar.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.c = new char[i * 2];
        int iA2 = twaVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + twaVar.a;
            i2 = twaVar.b.getInt(twaVar.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            l9i l9iVar = new l9i(this, i7);
            swa swaVarB = l9iVar.b();
            int iA3 = swaVarB.a(4);
            Character.toChars(iA3 != 0 ? swaVarB.b.getInt(iA3 + swaVarB.a) : 0, (char[]) this.c, i7 * 2);
            swa swaVarB2 = l9iVar.b();
            int iA4 = swaVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + swaVarB2.a;
                i3 = swaVarB2.b.getInt(swaVarB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            qyj.h("invalid metadata codepoint length", i3 > 0);
            ywa ywaVar = (ywa) this.d;
            swa swaVarB3 = l9iVar.b();
            int iA5 = swaVarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + swaVarB3.a;
                i4 = swaVarB3.b.getInt(swaVarB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ywaVar.a(l9iVar, 0, i4 - 1);
        }
    }

    public ljf(ek ekVar, ru4 ru4Var) {
        this.a = 1;
        this.b = ekVar;
        this.c = ru4Var;
        this.e = new LinkedHashSet();
        this.d = new c7k(1, this);
    }

    public /* synthetic */ ljf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public ljf(Provider provider, zqh zqhVar, vo8 vo8Var) {
        this.a = 7;
        this.b = provider;
        this.c = zqhVar;
        this.d = vo8Var;
        this.e = e9i.o(new qt1(this, null, 15));
    }

    public ljf(ghe gheVar, uvc uvcVar, kzi kziVar, fik fikVar) {
        Object objN;
        this.a = 22;
        if (gheVar != null) {
            objN = c98.n(gheVar);
        } else {
            a98 a98Var = c98.b;
            objN = ghe.e;
        }
        this.b = objN;
        this.c = uvcVar;
        this.d = kziVar;
        this.e = fikVar;
    }

    public ljf(nf5 nf5Var, Executor executor, swi swiVar, o02 o02Var, gke gkeVar) {
        this.a = 10;
        this.e = nf5Var;
        this.b = executor;
        this.c = swiVar;
        this.d = o02Var;
    }

    public ljf(AudioTrack audioTrack, w4 w4Var) {
        this.a = 3;
        this.b = audioTrack;
        this.c = w4Var;
        Handler handlerP = vqi.p(null);
        this.d = handlerP;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: fc0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                ljf ljfVar = this.a;
                if (((fc0) ljfVar.e) == null) {
                    return;
                }
                gm0.t().execute(new qe(ljfVar, 13, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerP);
    }

    public ljf(iyh iyhVar, boolean[] zArr) {
        this.a = 29;
        this.b = iyhVar;
        this.c = zArr;
        int i = iyhVar.a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
