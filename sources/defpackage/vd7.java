package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.work.a;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import one.me.sdk.arch.Widget;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.workmanager.BacklogWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class vd7 {
    public static u1d a;
    public static volatile boolean b;
    public static final c5b c = new c5b("RESUME_TOKEN", 1);
    public static final ste d = new ste("SAMPLED_TRACE", 2);
    public static final c5b e = new c5b("NULL", 1);
    public static final c5b f = new c5b("UNINITIALIZED", 1);
    public static final c5b g = new c5b("DONE", 1);
    public static final Object h = new Object();

    public static b78 A() {
        return f78.g().f();
    }

    public static final vo8 B(vt4 vt4Var) {
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null) {
            return vo8Var;
        }
        qr7.v(vt4Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static Object C(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static no5 D(vo8 vo8Var, gp8 gp8Var) {
        return vo8Var instanceof up8 ? ((up8) vo8Var).O(true, gp8Var) : vo8Var.K(gp8Var.o(), true, new fz7(gp8Var));
    }

    public static final boolean E(vt4 vt4Var) {
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null) {
            return vo8Var.isActive();
        }
        return true;
    }

    public static long F(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? bj8.a(i2, Integer.MAX_VALUE) : bj8.a(Math.max(i2, size), Math.max(i2, size));
        }
        return bj8.a(i2, Math.max(i2, size));
    }

    public static final void G(Context context) {
        Map mapSingletonMap;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            n1g.x().p(dyj.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            String[] strArr = dyj.b;
            int iP0 = wm9.P0(strArr.length);
            if (iP0 < 16) {
                iP0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath, noBackupFilesDir);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath, noBackupFilesDir);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        n1g.x().j0(dyj.a, "Over-writing contents of " + file2);
                    }
                    n1g.x().p(dyj.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(sdf sdfVar, long j, cf7 cf7Var) {
        eub eubVar = new eub(j);
        dub dubVar = dub.a;
        e9i.l(3, dubVar);
        qdf qdfVar = new qdf(sdfVar, eubVar, dubVar, udf.a, tre.g, (mdh) cf7Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sdf.f;
        sdfVar.k(qdfVar, false);
    }

    public static void I(ViewGroup viewGroup, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        View viewA = oc9.a(viewGroup.getContext());
        viewA.setId(R.id.chats_list_pinbars_view);
        if (z) {
            pq pqVar = new pq();
            pqVar.a = 4;
            layoutParams = pqVar;
        } else {
            uf4 uf4Var = new uf4(0, -2);
            uf4Var.j = R.id.chats_list_folders_tabs;
            uf4Var.k = R.id.chats_list_folders_pager;
            uf4Var.e = 0;
            uf4Var.h = 0;
            layoutParams = uf4Var;
        }
        viewGroup.addView(viewA, layoutParams);
    }

    public static void J(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (h) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                uncaughtExceptionHandler = new yo2(uncaughtExceptionHandler, defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    public static final String K(Long l) {
        if (l.longValue() > 0) {
            return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
        }
        return l + "ms";
    }

    public static cyj L(oyj oyjVar, Integer num, ha9 ha9Var, vzj vzjVar) {
        BacklogWorker backlogWorker;
        cdc cdcVar = (cdc) ((a) ((a) new a(BacklogWorker.class).setBackoffCriteria(rn0.b, num.longValue(), TimeUnit.SECONDS)).setInputData(f55.t(ha9Var, new ylc[0]))).build();
        if (vzjVar != null && (backlogWorker = BacklogWorker.m) != null) {
            synchronized (backlogWorker.j) {
                gm0.m("BACKLOG_WORKER", "stayAlive, isRunning = %b", Boolean.valueOf(backlogWorker.l));
                backlogWorker.k.add(vzjVar.a);
            }
        }
        ve6 ve6Var = ve6.b;
        List listSingletonList = Collections.singletonList(cdcVar);
        if (!listSingletonList.isEmpty()) {
            return new cyj(oyjVar, "BACKLOG_WORKER", ve6Var, listSingletonList, 0);
        }
        ore.p("beginUniqueWork needs at least one OneTimeWorkRequest.");
        return null;
    }

    public static void M(ViewGroup viewGroup, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        rcc rccVar = new rcc(viewGroup.getContext());
        rccVar.setId(R.id.chats_list_toolbar);
        rccVar.setTransitionName(rccVar.getContext().getString(R.string.chat_list_toolbar_transition_name));
        rccVar.setForm(gcc.Main);
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            uf4 uf4Var = new uf4(-1, -2);
            uf4Var.i = 0;
            uf4Var.k = R.id.chats_list_folders_tabs;
            uf4Var.e = 0;
            uf4Var.h = 0;
            layoutParams = uf4Var;
        }
        rccVar.setLayoutParams(layoutParams);
        rccVar.setTitle(R.string.chat_list_toolbar_title);
        rccVar.setContentDescription(R.string.chat_list_toolbar_title);
        rccVar.setRightActions(new acc(new kcc(new tnh(R.string.chat_list_accessibility_search_button), new pgg(rccVar)), new jcc(R.drawable.icon_plus, null, new tnh(R.string.chat_list_accessibility_start_messaging_button), null, 0.0f, new c6(24), 222), null));
        t7c searchView = rccVar.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
        t7c searchView2 = rccVar.getSearchView();
        if (searchView2 != null) {
            searchView2.setExpandWithAnimation(false);
        }
        rccVar.setElevation(10.0f);
        viewGroup.addView(rccVar);
    }

    public static final void N(gdi gdiVar) {
        gdiVar.b(3, new gj5(14));
        gdiVar.d(805, new gj5(15));
        gdiVar.d(1011, new l65(13));
        gdiVar.d(804, new l65(14));
        gdiVar.d(1012, new mu2(21));
    }

    public static final void O(gdi gdiVar) {
        gdiVar.b(3, new gj5(25));
        gdiVar.d(212, new mu2(29));
        gdiVar.d(809, new lf9(0));
        gdiVar.d(397, new lf9(1));
        gdiVar.d(810, new zc9(1));
        gdiVar.d(811, new zc9(2));
        gdiVar.d(812, new zc9(3));
        gdiVar.d(813, new zc9(4));
        gdiVar.d(814, new zc9(5));
        gdiVar.d(815, new zc9(6));
        gdiVar.d(816, new zc9(7));
        gdiVar.d(817, new zc9(8));
    }

    public static final void P(gdi gdiVar) {
        gdiVar.b(3, new pwb(10));
        gdiVar.d(1064, new rwb(13));
        gdiVar.b(4, new pwb(11));
        gdiVar.d(1065, new rwb(14));
        gdiVar.d(1066, new rwb(15));
        gdiVar.d(1067, new rwb(16));
        gdiVar.d(1068, new rwb(17));
        gdiVar.d(1069, new rwb(18));
        gdiVar.d(759, new rwb(19));
        gdiVar.d(1070, new m3d(28));
        gdiVar.d(1071, new m3d(29));
        gdiVar.d(1072, new jld(0));
        gdiVar.d(1073, new jld(1));
        gdiVar.d(1074, new pwb(12));
        gdiVar.d(1075, new jld(2));
        gdiVar.d(1076, new jld(3));
        gdiVar.d(1077, new jld(4));
        gdiVar.d(1078, new rwb(20));
        gdiVar.d(1079, new jld(5));
        gdiVar.d(1080, new jld(6));
        gdiVar.d(1081, new rwb(21));
        gdiVar.d(1082, new m3d(26));
        gdiVar.d(1083, new m3d(27));
        gdiVar.d(1084, new pwb(13));
        gdiVar.d(1085, new pwb(14));
    }

    public static final Object Q(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        iif iifVar = null;
        o05 o05Var = new o05(cf7Var, (lq4) null);
        mzh mzhVar = (mzh) lq4Var.getContext().x0(mzh.b);
        xt4 xt4Var = mzhVar != null ? mzhVar.a : null;
        if (xt4Var != null) {
            return yab.K0(xt4Var, o05Var, lq4Var);
        }
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        try {
            iif iifVar2 = rreVar.d;
            if (iifVar2 != null) {
                iifVar = iifVar2;
            }
            iifVar.execute(new xz8(ek2Var, rreVar, o05Var, 2));
        } catch (RejectedExecutionException e2) {
            ek2Var.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        return ek2Var.s();
    }

    public static wo8 a() {
        return new wo8(null);
    }

    public static final void b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static void c(ebh ebhVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                ebhVar.e(i);
            } else if (obj instanceof byte[]) {
                ebhVar.d(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                ebhVar.a(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ebhVar.a(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ebhVar.c(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ebhVar.c(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ebhVar.c(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ebhVar.c(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ebhVar.g0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ebhVar.c(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static void d(vt4 vt4Var) {
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    public static final Object e(vo8 vo8Var, nq4 nq4Var) {
        vo8Var.b(null);
        Object objG = vo8Var.g(nq4Var);
        return objG == hu4.a ? objG : sbi.a;
    }

    public static final void f(vt4 vt4Var, CancellationException cancellationException) {
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null) {
            Iterator it = vo8Var.y().iterator();
            while (it.hasNext()) {
                ((vo8) it.next()).b(cancellationException);
            }
        }
    }

    public static void g(wo8 wo8Var) {
        Iterator it = ((tw) wo8Var.y()).iterator();
        while (it.hasNext()) {
            ((vo8) it.next()).b(null);
        }
    }

    public static final void h(CharSequence charSequence, kbc kbcVar) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, spanned.length(), eph.class)) {
                ((eph) obj).onThemeChanged(kbcVar);
            }
        }
    }

    public static final Object i(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        if ((!rreVar.j() || !rreVar.m() || !rreVar.k()) && lq4Var.getContext().x0(ure.b) != null) {
            return Q(lq4Var, cf7Var, rreVar);
        }
        return cf7Var.invoke(lq4Var);
    }

    public static int j(hfe hfeVar, pic picVar, View view, View view2, vee veeVar, boolean z) {
        if (veeVar.w() == 0 || hfeVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(vee.M(view) - vee.M(view2)) + 1;
        }
        return Math.min(picVar.n(), picVar.d(view2) - picVar.g(view));
    }

    public static int k(hfe hfeVar, pic picVar, View view, View view2, vee veeVar, boolean z, boolean z2) {
        if (veeVar.w() == 0 || hfeVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (hfeVar.b() - Math.max(vee.M(view), vee.M(view2))) - 1) : Math.max(0, Math.min(vee.M(view), vee.M(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(picVar.d(view2) - picVar.g(view)) / (Math.abs(vee.M(view) - vee.M(view2)) + 1))) + (picVar.m() - picVar.g(view)));
        }
        return iMax;
    }

    public static int l(hfe hfeVar, pic picVar, View view, View view2, vee veeVar, boolean z) {
        if (veeVar.w() == 0 || hfeVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return hfeVar.b();
        }
        return (int) (((picVar.d(view2) - picVar.g(view)) / (Math.abs(vee.M(view) - vee.M(view2)) + 1)) * hfeVar.b());
    }

    public static ki4 m(byte[] bArr) throws ProtoException {
        ji4 ji4Var;
        int i;
        byte[] bArr2 = ru.ok.tamtam.nano.a.a;
        try {
            Protos.Contact contact = (Protos.Contact) sia.mergeFrom(new Protos.Contact(), bArr);
            di4 di4Var = new di4();
            di4Var.a = contact.serverId;
            di4Var.b = contact.baseUrl;
            di4Var.c = contact.baseRawUrl;
            di4Var.d = contact.deviceAvatarUrl;
            di4Var.e = contact.photoId;
            di4Var.g = contact.lastUpdateTime;
            di4Var.h = contact.serverPhone;
            di4Var.w = contact.country;
            di4Var.m = contact.settings;
            di4Var.n = contact.description;
            di4Var.o = contact.link;
            di4Var.p = contact.birthday;
            di4Var.q = contact.lastSearchClickTime;
            di4Var.r = contact.lastSyncTime;
            di4Var.s = contact.lastShowingUnknownContactBar;
            di4Var.u = contact.profileOptions;
            di4Var.y = contact.registrationTime;
            Protos.Contact.MenuButton menuButton = contact.menuButton;
            di4Var.t = menuButton == null ? null : new gi4(menuButton.text);
            Protos.Contact.StartMessage startMessage = contact.startMessage;
            if (startMessage != null) {
                String str = startMessage.text;
                Protos.MessageElement[] messageElementArr = startMessage.elements;
                ArrayList arrayListA = (messageElementArr == null || messageElementArr.length <= 0) ? null : dga.a(messageElementArr);
                Protos.Attaches.Attach attach = contact.startMessage.media;
                e70 e70VarC = attach != null ? ru.ok.tamtam.nano.a.c(attach) : null;
                if (str != null) {
                    di4Var.v = new hi4(e70VarC, str, arrayListA);
                }
            }
            ArrayList arrayList = new ArrayList();
            Protos.Contact.ContactName[] contactNameArr = contact.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                for (Protos.Contact.ContactName contactName : contactNameArr) {
                    String str2 = contactName.name;
                    String str3 = contactName.lastName;
                    int i2 = contactName.type;
                    ei4 ei4Var = ei4.d;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ei4Var = ei4.a;
                        } else if (i2 == 2) {
                            ei4Var = ei4.b;
                        } else if (i2 == 3) {
                            ei4Var = ei4.c;
                        }
                    }
                    arrayList.add(new fi4(str2, ei4Var, str3));
                }
            }
            di4Var.f = arrayList;
            int i3 = contact.status;
            di4Var.i = i3 != 1 ? i3 != 2 ? null : ii4.b : ii4.a;
            int i4 = contact.accountStatus;
            di4Var.j = i4 != 1 ? i4 != 2 ? 1 : 3 : 2;
            int i5 = contact.type;
            if (i5 == 0) {
                ji4Var = ji4.a;
            } else {
                if (i5 != 1) {
                    qr7.p(contact.type, "unknown proto.type ");
                    return null;
                }
                ji4Var = ji4.b;
            }
            di4Var.k = ji4Var;
            int i6 = contact.gender;
            if (i6 == 0) {
                i = 1;
            } else if (i6 == 1) {
                i = 2;
            } else {
                if (i6 != 2) {
                    qr7.p(contact.gender, "unknown proto.gender ");
                    return null;
                }
                i = 3;
            }
            di4Var.l = i;
            int i7 = contact.flags;
            int[] iArr = contact.options;
            if (iArr != null && iArr.length > 0) {
                for (int i8 : iArr) {
                    if (i8 == 0) {
                        i7 |= 1;
                    } else if (i8 == 1) {
                        i7 |= 2;
                    } else if (i8 == 2) {
                        i7 |= 8;
                    } else if (i8 == 3) {
                        i7 |= 16;
                    } else if (i8 == 4) {
                        i7 |= 64;
                    } else if (i8 == 5) {
                        i7 |= 32;
                    }
                }
            }
            di4Var.z = new ix2(i7, 1);
            long[] jArr = contact.organizationIds;
            if (jArr != null && jArr.length > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (long j : contact.organizationIds) {
                    arrayList2.add(Long.valueOf(j));
                }
                di4Var.x = arrayList2;
            }
            return di4Var.a();
        } catch (InvalidProtocolBufferNanoException e2) {
            qr7.t(e2);
            return null;
        }
    }

    public static byte[] n(ki4 ki4Var) {
        byte[] bArr;
        int i;
        Protos.MessageElement[] messageElementArr;
        int i2;
        byte[] bArr2 = ru.ok.tamtam.nano.a.a;
        Protos.Contact contact = new Protos.Contact();
        long j = ki4Var.a;
        List list = ki4Var.x;
        gi4 gi4Var = ki4Var.t;
        ii4 ii4Var = ki4Var.i;
        hi4 hi4Var = ki4Var.v;
        List list2 = ki4Var.f;
        contact.serverId = j;
        String str = ki4Var.c;
        if (str == null) {
            str = "";
        }
        contact.baseUrl = str;
        String str2 = ki4Var.d;
        if (str2 == null) {
            str2 = "";
        }
        contact.baseRawUrl = str2;
        String str3 = ki4Var.b;
        if (str3 == null) {
            str3 = "";
        }
        contact.deviceAvatarUrl = str3;
        contact.photoId = ki4Var.e;
        contact.lastUpdateTime = ki4Var.g;
        contact.serverPhone = ki4Var.h;
        contact.settings = ki4Var.m;
        String str4 = ki4Var.n;
        if (str4 == null) {
            str4 = "";
        }
        contact.description = str4;
        String str5 = ki4Var.o;
        if (str5 == null) {
            str5 = "";
        }
        contact.link = str5;
        String str6 = ki4Var.p;
        if (str6 == null) {
            str6 = "";
        }
        contact.birthday = str6;
        contact.lastSearchClickTime = ki4Var.q;
        contact.lastSyncTime = ki4Var.r;
        contact.lastShowingUnknownContactBar = ki4Var.s;
        contact.profileOptions = ki4Var.u;
        String str7 = ki4Var.w;
        if (str7 == null) {
            str7 = "";
        }
        contact.country = str7;
        contact.registrationTime = ki4Var.y;
        contact.flags = ki4Var.z.b;
        if (!list2.isEmpty()) {
            int size = list2.size();
            contact.names = new Protos.Contact.ContactName[size];
            for (int i3 = 0; i3 < size; i3++) {
                fi4 fi4Var = (fi4) list2.get(i3);
                Protos.Contact.ContactName contactName = new Protos.Contact.ContactName();
                String str8 = fi4Var.a;
                if (str8 == null) {
                    str8 = "";
                }
                contactName.name = str8;
                String str9 = fi4Var.b;
                if (str9 == null) {
                    str9 = "";
                }
                contactName.lastName = str9;
                int iOrdinal = fi4Var.c.ordinal();
                if (iOrdinal == 0) {
                    i2 = 1;
                } else if (iOrdinal == 1) {
                    i2 = 2;
                } else if (iOrdinal == 2) {
                    i2 = 3;
                } else {
                    if (iOrdinal != 3) {
                        throw new RuntimeException(null, null);
                    }
                    i2 = 0;
                }
                contactName.type = i2;
                contact.names[i3] = contactName;
            }
        }
        if (ii4Var == null) {
            contact.status = 0;
        } else if (ii4Var == ii4.a) {
            contact.status = 1;
        } else {
            if (ii4Var != ii4.b) {
                qr7.y(ii4Var, "unknown status ");
                return null;
            }
            contact.status = 2;
        }
        int i4 = ki4Var.j;
        if (i4 == 0) {
            i4 = 1;
        }
        if (i4 == 1) {
            contact.accountStatus = 0;
        } else if (i4 == 2) {
            contact.accountStatus = 1;
        } else {
            if (i4 != 3) {
                ore.p("unknown account status ".concat(qv1.y(i4)));
                return null;
            }
            contact.accountStatus = 2;
        }
        int iOrdinal2 = ki4Var.k.ordinal();
        if (iOrdinal2 == 0) {
            bArr = null;
            contact.type = 0;
        } else {
            if (iOrdinal2 != 1) {
                ore.p("unknown type");
                return null;
            }
            contact.type = 1;
            bArr = null;
        }
        int iD = qt4.D(ki4Var.l);
        if (iD != 0) {
            if (iD == 1) {
                contact.gender = 1;
            } else {
                if (iD != 2) {
                    ore.p("unknown type");
                    return bArr;
                }
                contact.gender = 2;
            }
            i = 0;
        } else {
            i = 0;
            contact.gender = 0;
        }
        if (gi4Var != null) {
            Protos.Contact.MenuButton menuButton = new Protos.Contact.MenuButton();
            String str10 = gi4Var.a;
            if (str10 == null) {
                str10 = "";
            }
            menuButton.text = str10;
            contact.menuButton = menuButton;
        }
        if (hi4Var != null) {
            Protos.Contact.StartMessage startMessage = new Protos.Contact.StartMessage();
            String str11 = hi4Var.b;
            startMessage.text = str11 != null ? str11 : "";
            e70 e70Var = hi4Var.a;
            if (e70Var != null) {
                startMessage.media = ru.ok.tamtam.nano.a.d(e70Var);
                messageElementArr = null;
            } else {
                messageElementArr = null;
                startMessage.media = null;
            }
            List list3 = hi4Var.c;
            if (list3 != null) {
                startMessage.elements = dga.c(list3).elements;
            } else {
                startMessage.elements = messageElementArr;
            }
            contact.startMessage = startMessage;
        }
        if (!p90.D(list)) {
            contact.organizationIds = new long[list.size()];
            int i5 = i;
            while (true) {
                long[] jArr = contact.organizationIds;
                if (i5 >= jArr.length) {
                    break;
                }
                jArr[i5] = ((Long) list.get(i5)).longValue();
                i5++;
            }
        }
        return sia.toByteArray(contact);
    }

    public static final xu1 o(ca2 ca2Var, ifh ifhVar, Widget widget) {
        svj svjVar = new svj(widget, 0);
        yu1 yu1Var = (yu1) ca2Var.getAccessor().c(349);
        return new xu1(svjVar, ifhVar, yu1Var.a, yu1Var.b, yu1Var.c, yu1Var.d);
    }

    public static final String p(String str) {
        int i;
        if (str.length() == 0) {
            return null;
        }
        if (r5h.n1(str, "+7", false)) {
            i = 2;
        } else {
            if (!r5h.n1(str, "7", false)) {
                return null;
            }
            i = 1;
        }
        Character chR0 = r5h.R0(i, str);
        if (chR0 == null) {
            return null;
        }
        char cCharValue = chR0.charValue();
        if (Character.isDigit(cCharValue)) {
            return (cCharValue == '0' || cCharValue == '6' || cCharValue == '7') ? "KZ" : "RU";
        }
        return null;
    }

    public static final void q(vt4 vt4Var) {
        vo8 vo8Var = (vo8) vt4Var.x0(nhb.h);
        if (vo8Var != null && !vo8Var.isActive()) {
            throw vo8Var.A();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object r(b78 b78Var, v78 v78Var, long j, Object obj, boolean z, boolean z2, nq4 nq4Var) {
        bp6 bp6Var;
        Bitmap bitmapE0;
        if (nq4Var instanceof bp6) {
            bp6Var = (bp6) nq4Var;
            int i = bp6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp6Var.h = i - Integer.MIN_VALUE;
            } else {
                bp6Var = new bp6(nq4Var);
            }
        } else {
            bp6Var = new bp6(nq4Var);
        }
        Object objK = bp6Var.g;
        int i2 = bp6Var.h;
        boolean z3 = true;
        if (i2 == 0) {
            ch3.d0(objK);
            bp6Var.d = v78Var;
            bp6Var.e = z;
            bp6Var.f = z2;
            bp6Var.h = 1;
            qn6 qn6Var = new qn6(b78Var.b(v78Var, obj), (lq4) null, 16);
            objK = j == BuildConfig.MAX_TIME_TO_UPLOAD ? cqk.k(new qob(qn6Var, (lq4) null, 24), bp6Var) : lvb.L0(j, qn6Var, bp6Var);
            hu4 hu4Var = hu4.a;
            if (objK == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = bp6Var.f;
            z = bp6Var.e;
            v78Var = bp6Var.d;
            ch3.d0(objK);
        }
        au3 au3Var = (au3) objK;
        if (au3Var == null) {
            gm0.Y("FetchBitmap", "Early return in fetchBitmap cuz of asyncFetchDecodedImage is null");
            return null;
        }
        xt3 xt3Var = (xt3) au3Var.K();
        if (xt3Var instanceof CloseableStaticBitmap) {
            bitmapE0 = ((CloseableStaticBitmap) xt3Var).getUnderlyingBitmap();
        } else {
            if (!(xt3Var instanceof e95)) {
                gm0.Y("FetchBitmap", "Early return in fetchBitmap cuz of ref not CloseableBitmap or CloseableXml");
                return null;
            }
            Drawable drawableL = ((e95) xt3Var).l();
            z3 = false;
            if (drawableL != null) {
                bne bneVar = v78Var.h;
                bitmapE0 = ch3.e0(drawableL, bneVar != null ? bneVar.a : 200, bneVar != null ? bneVar.b : 200);
            } else {
                bitmapE0 = null;
            }
        }
        Bitmap.Config config = bitmapE0 != null ? bitmapE0.getConfig() : null;
        return (z && z3 && config != null) ? bitmapE0.copy(config, z2) : bitmapE0;
    }

    public static /* synthetic */ Object s(b78 b78Var, v78 v78Var, long j, nq4 nq4Var, int i) {
        if ((i & 2) != 0) {
            j = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        return r(b78Var, v78Var, j, null, true, (i & 16) == 0, nq4Var);
    }

    public static Object t(b78 b78Var, Uri uri, us5 us5Var, mdh mdhVar, int i) {
        if ((i & 8) != 0) {
            us5Var = new us5(26);
        }
        w78 w78VarD = w78.d(uri);
        us5Var.invoke(w78VarD);
        return s(b78Var, w78VarD.a(), BuildConfig.MAX_TIME_TO_UPLOAD, mdhVar, 24);
    }

    public static void u(ViewGroup viewGroup, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        aac aacVar = new aac(viewGroup.getContext());
        aacVar.setId(R.id.chats_list_folders_tabs);
        aacVar.setTabMode(0);
        if (z) {
            pq pqVar = new pq();
            pqVar.a = 4;
            layoutParams = pqVar;
        } else {
            uf4 uf4Var = new uf4(0, -2);
            uf4Var.j = R.id.chats_list_toolbar;
            uf4Var.k = R.id.chats_list_pinbars_view;
            uf4Var.e = 0;
            uf4Var.h = 0;
            layoutParams = uf4Var;
        }
        aacVar.setLayoutParams(layoutParams);
        viewGroup.addView(aacVar);
    }

    public static final String v(vtc vtcVar, String str, String str2, String str3) {
        luc lucVarT;
        if (str2 == null || str2.length() == 0) {
            str2 = str3;
        }
        String str4 = "RU";
        if (str2 != null && str2.length() != 0) {
            String upperCase = str2.toUpperCase(Locale.getDefault());
            if (Collections.unmodifiableSet(vtcVar.f).contains(upperCase)) {
                str4 = upperCase;
            }
        }
        try {
            lucVarT = vtcVar.t(!r5h.o1(str, '+') ? "+".concat(str) : str, str4);
        } catch (NumberParseException unused) {
            gm0.Y(vtc.class.getName(), "Unable to parse phone number");
            lucVarT = null;
        }
        return lucVarT == null ? str : vtcVar.d(lucVarT);
    }

    public static final String w(vtc vtcVar, String str, String str2, String str3, int i, boolean z) {
        if (z) {
            try {
                luc lucVarT = vtcVar.t(str2, str3);
                if (vtcVar.m(lucVarT)) {
                    str2 = z5h.I0(vtcVar.d(lucVarT), '-', ' ', false);
                }
            } catch (NumberParseException unused) {
            }
        }
        if (r5h.u1(str.length(), str2).equals(str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(cCharAt);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                i2++;
            }
        }
        return r5h.y1(sb.toString()).toString();
    }

    public static ApiException x(Status status) {
        return status.c != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static qv5 y(String str) {
        if (str == null) {
            return null;
        }
        for (qv5 qv5Var : qv5.b) {
            if (qv5Var.a.equalsIgnoreCase(str)) {
                return qv5Var;
            }
        }
        return null;
    }

    public static i68 z(InputStream inputStream) {
        int iP0;
        k68 k68Var = (k68) k68.d.getValue();
        int i = k68Var.a;
        byte[] bArr = new byte[i];
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                iP0 = e9i.p0(inputStream, bArr, i);
                inputStream.reset();
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        } else {
            iP0 = e9i.p0(inputStream, bArr, i);
        }
        i68 i68VarA = k68Var.c.a(iP0, bArr);
        boolean zEquals = i68VarA.equals(kb5.m);
        i68 i68Var = i68.c;
        if (zEquals) {
            i68VarA = i68Var;
        }
        if (i68VarA != i68Var) {
            return i68VarA;
        }
        ArrayList arrayList = k68Var.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i68 i68VarA2 = ((h68) it.next()).a(iP0, bArr);
                if (i68VarA2 != i68Var) {
                    return i68VarA2;
                }
            }
        }
        return i68Var;
    }
}
