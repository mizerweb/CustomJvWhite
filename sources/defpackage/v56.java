package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import one.me.android.media.service.OneMeMediaSessionService;
import one.me.sdk.emoji.parser.EmojiTreeParseException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.FilePrefsException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class v56 implements ds6, a10, t7b, zt3, u9, l8e, f2a, gu9, x7h, g5, lnk {
    public final /* synthetic */ int a;
    public Object b;

    public v56(Resources resources) throws IOException {
        int i = 0;
        this.a = 0;
        gm0.n(v56.class.getName(), "Create emoji tree from bin. Start");
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(R.raw.emoji);
            char c = '\b';
            try {
                byte[] bArr = new byte[8];
                inputStreamOpenRawResource.read(bArr);
                int i2 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                if (i2 != -559038737) {
                    throw new x56(i2);
                }
                this.b = new long[(bArr[7] & 255) | (bArr[4] << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8)];
                byte[] bArr2 = new byte[inputStreamOpenRawResource.available() & (-8)];
                int i3 = 0;
                while (true) {
                    int i4 = inputStreamOpenRawResource.read(bArr2);
                    if (i4 == -1) {
                        gm0.n(v56.class.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length);
                        inputStreamOpenRawResource.close();
                        return;
                    }
                    int i5 = i4 / 8;
                    int i6 = i;
                    while (i6 < i5) {
                        int i7 = i6 * 8;
                        char c2 = c;
                        byte[] bArr3 = bArr2;
                        ((long[]) this.b)[i3 + i6] = ((((long) bArr2[i7 + 1]) & 255) << 48) | (((long) bArr2[i7]) << 56) | ((((long) bArr3[i7 + 2]) & 255) << 40) | ((((long) bArr3[i7 + 3]) & 255) << 32) | ((((long) bArr3[i7 + 4]) & 255) << 24) | ((((long) bArr3[i7 + 5]) & 255) << 16) | ((((long) bArr3[i7 + 6]) & 255) << c2) | (((long) bArr3[i7 + 7]) & 255);
                        i6++;
                        c = c2;
                        bArr2 = bArr3;
                    }
                    i3 += i5;
                    i = 0;
                }
            } catch (Throwable th) {
                if (inputStreamOpenRawResource == null) {
                    throw th;
                }
                try {
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            gm0.V(v56.class.getName(), "Can't create emoji tree from bin", new EmojiTreeParseException(e));
            throw e;
        }
    }

    public void A(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getBottom() + iArr[7], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        this.b = obj2;
    }

    public void C(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
    }

    public Pattern D(String str) {
        Object obj;
        qf4 qf4Var = (qf4) this.b;
        synchronized (qf4Var) {
            obj = ((mge) qf4Var.c).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        qf4 qf4Var2 = (qf4) this.b;
        synchronized (qf4Var2) {
            ((mge) qf4Var2.c).put(str, patternCompile);
        }
        return patternCompile;
    }

    public void E(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
    }

    public void F(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iZ = recyclerView.f.z();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iZ; i6++) {
            View viewY = recyclerView.f.y(i6);
            lfe lfeVarT = RecyclerView.T(viewY);
            if (lfeVarT != null && !lfeVarT.z() && (i4 = lfeVarT.c) >= i && i4 < i5) {
                lfeVarT.j(2);
                if (obj == null) {
                    lfeVarT.j(1024);
                } else if ((1024 & lfeVarT.j) == 0) {
                    if (lfeVarT.k == null) {
                        ArrayList arrayList = new ArrayList();
                        lfeVarT.k = arrayList;
                        lfeVarT.l = Collections.unmodifiableList(arrayList);
                    }
                    lfeVarT.k.add(obj);
                }
                ((wee) viewY.getLayoutParams()).c = true;
            }
        }
        cfe cfeVar = recyclerView.c;
        for (int size = cfeVar.c.size() - 1; size >= 0; size--) {
            lfe lfeVar = (lfe) cfeVar.c.get(size);
            if (lfeVar != null && (i3 = lfeVar.c) >= i && i3 < i5) {
                lfeVar.j(2);
                cfeVar.g(size);
            }
        }
        recyclerView.K1 = true;
    }

    public void G(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iZ = recyclerView.f.z();
        for (int i3 = 0; i3 < iZ; i3++) {
            lfe lfeVarT = RecyclerView.T(recyclerView.f.y(i3));
            if (lfeVarT != null && !lfeVarT.z() && lfeVarT.c >= i) {
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + lfeVarT + " now at position " + (lfeVarT.c + i2));
                }
                lfeVarT.w(i2, false);
                recyclerView.G1.g = true;
            }
        }
        cfe cfeVar = recyclerView.c;
        int size = cfeVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            lfe lfeVar = (lfe) cfeVar.c.get(i4);
            if (lfeVar != null && lfeVar.c >= i) {
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + lfeVar + " now at position " + (lfeVar.c + i2));
                }
                lfeVar.w(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.J1 = true;
    }

    public void H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iZ = recyclerView.f.z();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iZ; i11++) {
            lfe lfeVarT = RecyclerView.T(recyclerView.f.y(i11));
            if (lfeVarT != null && (i9 = lfeVarT.c) >= i4 && i9 <= i3) {
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + lfeVarT);
                }
                if (lfeVarT.c == i) {
                    lfeVarT.w(i2 - i, false);
                } else {
                    lfeVarT.w(i5, false);
                }
                recyclerView.G1.g = true;
            }
        }
        cfe cfeVar = recyclerView.c;
        cfeVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = cfeVar.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            lfe lfeVar = (lfe) cfeVar.c.get(i12);
            if (lfeVar != null && (i8 = lfeVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    lfeVar.w(i2 - i, false);
                } else {
                    lfeVar.w(i10, false);
                }
                if (RecyclerView.a2) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + lfeVar);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.J1 = true;
    }

    public void I(Exception exc) {
        lvb.l0("MediaCodecAudioRenderer", "Audio sink error", exc);
        v2a v2aVar = ((lt9) this.b).h2;
        Handler handler = (Handler) v2aVar.b;
        if (handler != null) {
            handler.post(new hb0(v2aVar, exc, 1));
        }
    }

    public void J(Rect rect, View view, RecyclerView recyclerView) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int iP = RecyclerView.P(view);
        if (iP == -1) {
            sparseArray.remove(iP);
            return;
        }
        int[] iArr = (int[]) sparseArray.get(iP);
        if (iArr == null) {
            iArr = new int[8];
            sparseArray.put(iP, iArr);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + ((wee) view.getLayoutParams()).b.left;
        iArr[1] = i;
        iArr[0] = i + rect.left;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + ((wee) view.getLayoutParams()).b.top;
        iArr[3] = i2;
        iArr[2] = i2 + rect.top;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0) + ((wee) view.getLayoutParams()).b.right;
        iArr[5] = i3;
        iArr[4] = i3 + rect.right;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0) + ((wee) view.getLayoutParams()).b.bottom;
        iArr[7] = i4;
        iArr[6] = i4 + rect.bottom;
    }

    public void K(af7 af7Var) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = (Handler) this.b;
        if (cqk.d(looperMyLooper, handler.getLooper())) {
            af7Var.invoke();
        } else {
            handler.post(new eq0(14, af7Var));
        }
    }

    @Override // defpackage.x7h
    public boolean a(b87 b87Var) {
        String str = b87Var.n;
        return ((lhb) this.b).a(b87Var) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
    }

    @Override // defpackage.t7b
    public void b() {
        ((za0) this.b).d();
    }

    @Override // defpackage.u9
    public void c(Object obj) {
        t9 t9Var = (t9) obj;
        c cVar = (c) this.b;
        db7 db7Var = (db7) cVar.E.pollLast();
        if (db7Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = db7Var.a;
        int i = db7Var.b;
        a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.t(i, t9Var.a, t9Var.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.t7b
    public void d(long j) {
        za0 za0Var = (za0) this.b;
        w7b w7bVar = za0Var.c;
        ny8 ny8Var = za0Var.f;
        if (j != ((l4d) ((b2a) ny8Var.getValue()).f().a.getValue()).a()) {
            return;
        }
        boolean zG = ((b2a) ny8Var.getValue()).g(j);
        xte xteVar = w7bVar.a;
        if (xteVar.k() || xteVar.l() || ((xteVar.p == 1 || xteVar.m()) && !zG)) {
            gm0.n(za0Var.e, "Close player on ending");
            za0Var.h.a(jza.a);
        }
    }

    @Override // defpackage.x7h
    public w7h e(b87 b87Var) {
        lhb lhbVar = (lhb) this.b;
        String str = b87Var.n;
        int i = b87Var.K;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new jo2(str, i);
                case "application/cea-708":
                    return new no2(i, b87Var.q);
            }
        }
        if (!lhbVar.a(b87Var)) {
            ore.p(qv1.k("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }
        d8h d8hVarM = lhbVar.m(b87Var);
        d8hVarM.getClass().getSimpleName().concat("Decoder");
        return new eh5(d8hVarM);
    }

    @Override // defpackage.ds6
    public void error(String str, Throwable th) {
        String str2 = ((o3) this.b).c;
        if (th != null) {
            gm0.V(str2, str, new FilePrefsException(str, th));
        } else {
            gm0.Y(str2, str);
        }
    }

    @Override // defpackage.t7b
    public void f() {
        ((za0) this.b).d();
    }

    @Override // defpackage.t7b
    public void g() {
        ((za0) this.b).d();
    }

    @Override // defpackage.f2a
    public e88 h(k2a k2aVar, i2a i2aVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "OneMeMediaSessionService", "onPlaybackResumption", null);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 30) {
            OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) this.b;
            int i2 = OneMeMediaSessionService.k;
            NotificationManager notificationManager = (NotificationManager) oneMeMediaSessionService.getSystemService("notification");
            if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", "default_channel_name", 2);
                if (i <= 27) {
                    notificationChannel.setShowBadge(false);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            qlb qlbVar = new qlb(oneMeMediaSessionService, "default_channel_id");
            qlbVar.e = qlb.c("Media Service");
            qlbVar.f = qlb.c("Shutting down media service...");
            qlbVar.G.icon = R.drawable.icon_media_fill;
            ((OneMeMediaSessionService) this.b).startForeground(134, qlbVar.a());
            ((OneMeMediaSessionService) this.b).stopForeground(1);
            ((OneMeMediaSessionService) this.b).stopSelf();
        }
        return super.h(k2aVar, i2aVar);
    }

    @Override // defpackage.t7b
    public void i() {
        ((za0) this.b).d();
    }

    @Override // defpackage.t7b
    public void j() {
        ((za0) this.b).d();
    }

    @Override // defpackage.t7b
    public void k() {
        ((za0) this.b).d();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    @Override // defpackage.f2a
    public e89 l(k2a k2aVar, i2a i2aVar, List list) {
        Long lValueOf;
        b0a b0aVar;
        OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) this.b;
        List<ry9> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (ry9 ry9VarA : list2) {
            jy9 jy9Var = ry9VarA.b;
            if (jy9Var != null) {
                ay9 ay9VarA = ry9VarA.a();
                ay9VarA.g = vrk.b(jy9Var.a, ry9VarA).toString();
                ry9VarA = ay9VarA.a();
            }
            arrayList.add(ry9VarA);
        }
        ry9 ry9Var = (ry9) ww3.t1(list);
        Long l = null;
        Bundle bundle = (ry9Var == null || (b0aVar = ry9Var.d) == null) ? null : b0aVar.I;
        if (bundle != null) {
            long j = bundle.getLong("MediaMetadata.Extra.CHAT_ID");
            lValueOf = Long.valueOf(j);
            if (j == 0) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (bundle != null) {
            long j2 = bundle.getLong("MediaMetadata.Extra.MESSAGE_ID");
            Long lValueOf2 = Long.valueOf(j2);
            if (j2 != 0) {
                l = lValueOf2;
            }
        }
        int i = OneMeMediaSessionService.k;
        PendingIntent pendingIntentA = ((i4c) oneMeMediaSessionService.i().getAccessor().c(158)).a(oneMeMediaSessionService, lValueOf, l);
        if (Build.VERSION.SDK_INT >= 31 && pendingIntentA != null) {
            lvb.R(yrk.c(pendingIntentA));
        }
        d3a d3aVar = k2aVar.a;
        d3aVar.u = pendingIntentA;
        t4a t4aVar = d3aVar.g;
        c98 c98VarX = t4aVar.d.x();
        for (int i2 = 0; i2 < c98VarX.size(); i2++) {
            i2a i2aVar2 = (i2a) c98VarX.get(i2);
            if (i2aVar2.b >= 3 && t4aVar.d.M(i2aVar2)) {
                d3aVar.c(i2aVar2, new qv9(pendingIntentA));
                if (d3aVar.i(i2aVar2)) {
                    try {
                        d3aVar.h.i.a(0, pendingIntentA);
                    } catch (RemoteException e) {
                        lvb.l0("MediaSessionImpl", "Exception in using media1 API", e);
                    }
                }
            }
        }
        return super.l(k2aVar, i2aVar, arrayList);
    }

    @Override // defpackage.ds6
    public void log(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        qr7.q(((l72) zv8Var).getName(), " should be initialized before get.", "Property ");
        return null;
    }

    @Override // defpackage.t7b
    public void n() {
        ((za0) this.b).d();
    }

    @Override // defpackage.a10
    public void q(long j, List list) {
        y10 y10Var = (y10) this.b;
        y10Var.H();
        y10Var.j(list, j, false, true, false);
    }

    @Override // defpackage.gu9
    public void r(pmf pmfVar) {
        String str = ((xte) this.b).c;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qv1.k("onError: ", pmfVar.b), null);
        }
    }

    @Override // defpackage.gu9
    public void t(iu9 iu9Var) {
        xte xteVar = (xte) this.b;
        ute uteVar = xteVar.h;
        if (uteVar != null) {
            iu9Var.U();
            lvb.W(uteVar, "listener must not be null");
            iu9Var.d.V(uteVar);
        }
        xteVar.h = null;
        gm0.n(xteVar.c, "onDisconnected");
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.b != null) {
                    str = "value=" + this.b;
                } else {
                    str = "value not initialized yet";
                }
                return x05.i(sb, str, ')');
            case 19:
                return "ServerSettings(" + new JSONObject((Map) this.b) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zt3
    public void v() {
        ((cy5) this.b).getClass();
    }

    @Override // defpackage.zt3
    public void w(f0g f0gVar, Throwable th) {
        ((cy5) this.b).getClass();
        Object objC = f0gVar.c();
        pj6.l("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(f0gVar)), objC != null ? objC.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    public void x(la laVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = laVar.a;
        if (i == 1) {
            recyclerView.n.e0(laVar.b, laVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.n.h0(laVar.b, laVar.d);
        } else if (i == 4) {
            recyclerView.n.j0(recyclerView, laVar.b, laVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.n.g0(laVar.b, laVar.d);
        }
    }

    public lfe y(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iZ = recyclerView.f.z();
        lfe lfeVar = null;
        for (int i2 = 0; i2 < iZ; i2++) {
            lfe lfeVarT = RecyclerView.T(recyclerView.f.y(i2));
            if (lfeVarT != null && !lfeVarT.s() && lfeVarT.c == i) {
                if (!((ArrayList) recyclerView.f.e).contains(lfeVarT.a)) {
                    lfeVar = lfeVarT;
                    break;
                }
                lfeVar = lfeVarT;
            }
        }
        if (lfeVar != null) {
            if (!((ArrayList) recyclerView.f.e).contains(lfeVar.a)) {
                return lfeVar;
            }
            if (RecyclerView.a2) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    @Override // defpackage.g5
    public boolean z(View view) {
        gvb gvbVar = (gvb) this.b;
        int currentItem = ((y8j) view).getCurrentItem() - 1;
        y8j y8jVar = (y8j) gvbVar.a;
        if (y8jVar.r) {
            y8jVar.i(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.lnk
    public Object zza() {
        return ((c1k) this.b).a;
    }

    public v56(Map map) {
        this.a = 19;
        this.b = map;
        map.get("chats-list-promo-link-enabled");
    }

    public v56(Looper looper) {
        this.a = 22;
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.b = new Handler(looper);
    }

    public v56(int i, byte b) {
        this.a = i;
        switch (i) {
            case 11:
                break;
            case 21:
                this.b = new lhb(16);
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    public v56(ny8 ny8Var, ny8 ny8Var2) {
        this.a = 15;
        this.b = ny8Var2;
    }

    public /* synthetic */ v56(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public v56(int i) {
        this.a = 17;
        qf4 qf4Var = new qf4(7);
        qf4Var.b = i;
        qf4Var.c = new mge(qf4Var, ((i * 4) / 3) + 1);
        this.b = qf4Var;
    }

    public v56(View view) {
        this.a = 20;
        if (Build.VERSION.SDK_INT >= 30) {
            zcg zcgVar = new zcg(21, view);
            zcgVar.d = view;
            this.b = zcgVar;
            return;
        }
        this.b = new p3c(21, view);
    }
}
