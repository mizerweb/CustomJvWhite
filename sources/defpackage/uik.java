package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.browse.MediaBrowser;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.work.WorkRequest;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.video.calls.sdk.internal.join.FastJoinException;
import one.video.transloader.task.UploadTask;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* JADX INFO: loaded from: classes3.dex */
public final class uik implements vu0, a4f, fn1, ph6, p7c, b5j, sf7, kg7, qsf, wsf, aqg, qlg, p8, aki {
    public final /* synthetic */ int a;
    public Object b;

    public uik(int i) {
        this.a = i;
        switch (i) {
            case 15:
                break;
            case 22:
                this.b = (ExtraCroppingQuirk) uk5.a(ExtraCroppingQuirk.class);
                break;
            default:
                this.b = w8b.e();
                break;
        }
    }

    private final void v(Throwable th) {
    }

    public synchronized void A(long j, String str) {
        String strT = t(j);
        if (((SharedPreferences) this.b).getString("last-used-date", "").equals(strT)) {
            String strU = u(strT);
            if (strU == null) {
                return;
            }
            if (strU.equals(str)) {
                return;
            }
            B(str, strT);
            return;
        }
        long j2 = ((SharedPreferences) this.b).getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            d();
            j2 = ((SharedPreferences) this.b).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.b).getStringSet(str, new HashSet()));
        hashSet.add(strT);
        ((SharedPreferences) this.b).edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strT).commit();
    }

    public synchronized void B(String str, String str2) {
        w(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.b).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.b).edit().putStringSet(str, hashSet).commit();
    }

    @Override // defpackage.p7c
    public void E0(CharSequence charSequence) {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        vv vvVar = contactListWidget.Y;
        zv8[] zv8VarArr = ContactListWidget.o1;
        zv8 zv8Var = zv8VarArr[6];
        vvVar.b(contactListWidget, Boolean.TRUE);
        vv vvVar2 = contactListWidget.K;
        zv8 zv8Var2 = zv8VarArr[4];
        vvVar2.b(contactListWidget, charSequence);
        if (contactListWidget.u1()) {
            yk4 yk4VarT1 = contactListWidget.t1();
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            ((f9b) yk4VarT1.y.g.getValue()).setValue(string);
            y8 y8Var = (y8) contactListWidget.w.getValue();
            String string2 = charSequence != null ? charSequence.toString() : null;
            ((f9b) y8Var.i.getValue()).setValue(string2 != null ? string2 : "");
        }
    }

    @Override // defpackage.aqg
    public Object G(int i) {
        if (i >= 0) {
            return (CharSequence) ((eyc) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.qlg
    public void M(tlg tlgVar) {
    }

    @Override // defpackage.aqg
    public void R(vpg vpgVar, int i) {
        o7g o7gVar = (o7g) vpgVar;
        Object objG = G(i);
        o7gVar.d.setText(objG != null ? (CharSequence) objG : null);
    }

    @Override // defpackage.qlg
    public void T(tlg tlgVar) {
        StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) this.b;
        zv8[] zv8VarArr = StickerSetBottomSheet.v;
        ((amg) stickerSetBottomSheet.m.getValue()).G(tlgVar.a);
    }

    @Override // defpackage.p7c
    public void X() {
        ((fl4) ((ContactListWidget) this.b).y.getValue()).f(false);
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        switch (this.a) {
            case 16:
                break;
            default:
                ((ubh) this.b).run();
                break;
        }
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) throws FastJoinException {
        switch (this.a) {
            case 12:
                hq8 hq8Var = (hq8) obj;
                jl6 jl6Var = (jl6) this.b;
                if (hq8Var instanceof fq8) {
                    throw new FastJoinException(((fq8) hq8Var).a);
                }
                if (!(hq8Var instanceof gq8)) {
                    ore.o();
                    return null;
                }
                jl6Var.f.log("FastJoinPrepare", "fast join succeeded. result " + hq8Var);
                gq8 gq8Var = (gq8) hq8Var;
                String str = gq8Var.a;
                if (str == null) {
                    ore.k("conversationId must not be null");
                    return null;
                }
                String str2 = gq8Var.b;
                if (str2 != null) {
                    return new ffd(ConversationParams.fromInternalParams(str, new g2d(str2), jl6Var.h.j()), c76.a);
                }
                ore.k("internalParams must not be null");
                return null;
            default:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return ((tv0) this.b).apply(objArr[0], objArr[1]);
                }
                qr7.p(objArr.length, "Array of size 2 expected but got ");
                return null;
        }
    }

    @Override // defpackage.vu0
    public void b(uu0 uu0Var) {
        lu0 lu0Var = (lu0) this.b;
        lu0Var.getClass();
        lu0Var.b(new nu0(uu0Var.q(), uu0Var.o(), uu0Var.t(), uu0Var.n(), uu0Var.p(), uu0Var.s(), uu0Var.m(), lu0.c(uu0Var.r()), lu0.c(uu0Var.l())));
    }

    @Override // defpackage.qsf
    public void c(long j) {
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = (OtherNotificationsSettingsScreen) this.b;
        zv8[] zv8VarArr = OtherNotificationsSettingsScreen.g;
        ((wic) otherNotificationsSettingsScreen.c.getValue()).C(j);
    }

    public synchronized void d() {
        try {
            long j = ((SharedPreferences) this.b).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.b).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.b).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.aki
    public void e(long j) {
        ((UploadTask) this.b).i.e(j);
    }

    @Override // defpackage.p7c
    public void f() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        vv vvVar = contactListWidget.X;
        zv8 zv8Var = ContactListWidget.o1[5];
        Boolean bool = Boolean.TRUE;
        vvVar.b(contactListWidget, bool);
        mjg mjgVar = ((zo0) contactListWidget.A.getValue()).g;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        tbb.g((tbb) contactListWidget.d.getValue(), y3f.CONTACTS_SEARCH);
    }

    @Override // defpackage.ph6
    public w8b g() {
        throw null;
    }

    @Override // defpackage.b5j
    public void h(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 11:
                ic6 ic6Var = ((p26) obj).D1;
                int iD = qt4.D(i);
                if (iD != 0) {
                    if (iD == 1 || iD == 2) {
                        a8j.x(ic6Var, w16.b);
                    } else if (iD != 3) {
                        ore.o();
                    } else {
                        a8j.x(ic6Var, w16.a);
                    }
                }
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) obj;
                int iD2 = qt4.D(i);
                if (iD2 != 0) {
                    if (iD2 == 1 || iD2 == 2) {
                        zv8[] zv8VarArr = VideoMessageWidget.B;
                        f2j f2jVarY1 = videoMessageWidget.y1();
                        a8j.x(f2jVarY1.j, iyi.c);
                        f2jVarY1.c.A(((Number) f2jVarY1.l.getValue()).floatValue(), ((Number) f2jVarY1.n.getValue()).floatValue());
                    } else if (iD2 != 3) {
                        ore.o();
                    } else {
                        zv8[] zv8VarArr2 = VideoMessageWidget.B;
                        a8j.x(videoMessageWidget.y1().j, iyi.b);
                    }
                }
                break;
        }
    }

    public synchronized void i() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b).edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strT = t(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strT)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strT);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wsf
    public void j(long j, boolean z) {
        SettingsAutoSaveScreen settingsAutoSaveScreen = (SettingsAutoSaveScreen) ((i1m) this.b).a;
        zv8[] zv8VarArr = SettingsAutoSaveScreen.g;
        gqf gqfVarO1 = settingsAutoSaveScreen.o1();
        gqfVarO1.getClass();
        if (j == w7c.i) {
            gqfVarO1.E((mq9) gqfVarO1.C().a, pq9.PHOTO);
        } else if (j == w7c.k) {
            gqfVarO1.E((mq9) gqfVarO1.C().b, pq9.VIDEO);
        }
    }

    @Override // defpackage.b5j
    public void k(float f) {
        switch (this.a) {
            case 11:
                a8j.x(((p26) this.b).D1, new u16(f));
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                zv8[] zv8VarArr = VideoMessageWidget.B;
                a8j.x(videoMessageWidget.y1().j, new jyi(f));
                break;
        }
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = (OtherNotificationsSettingsScreen) this.b;
        zv8[] zv8VarArr = OtherNotificationsSettingsScreen.g;
        ((wic) otherNotificationsSettingsScreen.c.getValue()).C(j);
    }

    @Override // defpackage.b5j
    public void m(int i, float f) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 11:
                ic6 ic6Var = ((p26) obj).D1;
                int iD = qt4.D(i);
                if (iD != 0) {
                    if (iD == 1 || iD == 2) {
                        a8j.x(ic6Var, w16.c);
                    } else if (iD != 3) {
                        ore.o();
                    } else {
                        a8j.x(ic6Var, new v16(f));
                    }
                }
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) obj;
                int iD2 = qt4.D(i);
                if (iD2 != 0) {
                    if (iD2 == 1 || iD2 == 2) {
                        zv8[] zv8VarArr = VideoMessageWidget.B;
                        a8j.x(videoMessageWidget.y1().j, iyi.d);
                    } else if (iD2 != 3) {
                        ore.o();
                    } else {
                        zv8[] zv8VarArr2 = VideoMessageWidget.B;
                        a8j.x(videoMessageWidget.y1().j, new kyi(f));
                    }
                }
                break;
        }
    }

    @Override // defpackage.p7c
    public void n() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        zv8[] zv8VarArr = ContactListWidget.o1;
        cl4 cl4Var = contactListWidget.t1().c;
        cl4Var.getClass();
        ((fl4) contactListWidget.y.getValue()).f(cl4Var == cl4.a);
    }

    @Override // defpackage.p7c
    public void o() {
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        zv8[] zv8VarArr = ContactListWidget.o1;
        y8 y8Var = (y8) contactListWidget.w.getValue();
        ((f9b) y8Var.i.getValue()).setValue(null);
        mjg mjgVar = y8Var.f;
        mjgVar.getClass();
        mjgVar.j(null, r66.a);
        vv vvVar = contactListWidget.X;
        zv8[] zv8VarArr2 = ContactListWidget.o1;
        zv8 zv8Var = zv8VarArr2[5];
        vvVar.b(contactListWidget, Boolean.FALSE);
        zo0 zo0Var = (zo0) contactListWidget.A.getValue();
        Boolean bool = (Boolean) contactListWidget.z.getValue();
        bool.booleanValue();
        mjg mjgVar2 = zo0Var.g;
        mjgVar2.getClass();
        mjgVar2.j(null, bool);
        vv vvVar2 = contactListWidget.K;
        zv8 zv8Var2 = zv8VarArr2[4];
        vvVar2.b(contactListWidget, null);
        contactListWidget.t1().y.b();
        tbb.g((tbb) contactListWidget.d.getValue(), y3f.CONTACTS_TAB);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        Object obj;
        switch (this.a) {
            case 16:
                tw5 tw5Var = (tw5) this.b;
                k36 k36Var = new k36(18, tw5Var);
                if (wxl.c()) {
                    k36Var.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    qyj.l("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new ewg(k36Var, 10, countDownLatch)));
                    try {
                        if (!countDownLatch.await(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedRuntimeException(e);
                    }
                }
                ri2 ri2Var = (ri2) tw5Var.d;
                if (ri2Var != null) {
                    cx3.d1(ri2Var.n.n, new j22(2, tw5Var));
                    ri2 ri2Var2 = (ri2) tw5Var.d;
                    synchronized (ri2Var2.b) {
                        try {
                            ri2Var2.e.removeCallbacksAndMessages("retry_token");
                            int iD = qt4.D(ri2Var2.p);
                            if (iD == 0) {
                                ri2Var2.p = 5;
                                obj = g88.c;
                            } else {
                                if (iD == 1) {
                                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                                }
                                if (iD == 2 || iD == 3) {
                                    ri2Var2.p = 5;
                                    ri2.a(ri2Var2.r);
                                    ri2Var2.q = f55.m(new ot4(20, ri2Var2));
                                }
                                obj = ri2Var2.q;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    obj = g88.c;
                }
                synchronized (tw5Var.a) {
                    tw5Var.b = null;
                    tw5Var.c = obj;
                    ((HashMap) tw5Var.f).clear();
                    ((HashSet) tw5Var.g).clear();
                }
                tw5Var.s(null, null);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.aqg
    public vpg p(ViewGroup viewGroup) {
        return new o7g(new TextView(viewGroup.getContext()));
    }

    public synchronized ArrayList r() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(t(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new ph0(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.b).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @Override // defpackage.wsf
    public void s(long j) {
        SettingsAutoSaveScreen settingsAutoSaveScreen = (SettingsAutoSaveScreen) ((i1m) this.b).a;
        zv8[] zv8VarArr = SettingsAutoSaveScreen.g;
        settingsAutoSaveScreen.o1().D(j);
    }

    public synchronized String t(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized String u(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.b).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void w(String str) {
        try {
            String strU = u(str);
            if (strU == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.b).getStringSet(strU, new HashSet()));
            hashSet.remove(str);
            boolean zIsEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = (SharedPreferences) this.b;
            if (zIsEmpty) {
                sharedPreferences.edit().remove(strU).commit();
            } else {
                sharedPreferences.edit().putStringSet(strU, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void x(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    @Override // defpackage.b5j
    public void y(float f, float f2) {
        switch (this.a) {
            case 11:
                p26 p26Var = (p26) this.b;
                mjg mjgVar = p26Var.w1;
                Float fValueOf = Float.valueOf(f);
                mjgVar.getClass();
                mjgVar.j(null, fValueOf);
                mjg mjgVar2 = p26Var.y1;
                Float fValueOf2 = Float.valueOf(f2);
                mjgVar2.getClass();
                mjgVar2.j(null, fValueOf2);
                break;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                zv8[] zv8VarArr = VideoMessageWidget.B;
                f2j f2jVarY1 = videoMessageWidget.y1();
                mjg mjgVar3 = f2jVarY1.l;
                Float fValueOf3 = Float.valueOf(f);
                mjgVar3.getClass();
                mjgVar3.j(null, fValueOf3);
                mjg mjgVar4 = f2jVarY1.n;
                Float fValueOf4 = Float.valueOf(f2);
                mjgVar4.getClass();
                mjgVar4.j(null, fValueOf4);
                break;
        }
    }

    public synchronized boolean z(long j) {
        boolean zContains = ((SharedPreferences) this.b).contains("fire-global");
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (!zContains) {
            sharedPreferences.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = sharedPreferences.getLong("fire-global", -1L);
        synchronized (this) {
            if (t(j2).equals(t(j))) {
                return false;
            }
            ((SharedPreferences) this.b).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public uik(Application application, ac5 ac5Var) {
        this.a = 0;
        this.b = ac5Var;
    }

    public uik(Context context, String str) {
        this.a = 14;
        this.b = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    public /* synthetic */ uik(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
