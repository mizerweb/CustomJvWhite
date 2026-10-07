package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.HttpStatus;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.tamtam.api.commands.base.presence.InvalidParsePresenceException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p90 {
    public static AudioManager a;
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ste c = new ste("CRASH_FREE", 2);
    public static final int[] d = {R.attr.theme, ru.oneme.app.R.attr.theme};
    public static final int[] e = {ru.oneme.app.R.attr.materialThemeOverlay};
    public static final c5b f = new c5b("NONE", 1);
    public static final c5b g = new c5b("PENDING", 1);
    public static volatile gof h;

    public static ylc A(InputStream inputStream) throws IOException {
        s(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i = inputStream.read() & 255;
        int i2 = inputStream.read();
        return new ylc(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }

    public static lq4 B(lq4 lq4Var) {
        lq4 lq4VarIntercepted;
        nq4 nq4Var = lq4Var instanceof nq4 ? (nq4) lq4Var : null;
        return (nq4Var == null || (lq4VarIntercepted = nq4Var.intercepted()) == null) ? lq4Var : lq4VarIntercepted;
    }

    public static boolean C(String str) {
        return "service.unavailable".equals(str) || "io.exception".equals(str) || "service.timeout".equals(str);
    }

    public static boolean D(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean E(View view) {
        return view.getContext().getResources().getConfiguration().orientation == 2;
    }

    public static final boolean F(View view) {
        return view.getContext().getResources().getConfiguration().orientation == 1;
    }

    public static final kw7 G(List list) {
        Object objPrevious;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (!(((kw7) objPrevious) instanceof jw7)) {
                return (kw7) objPrevious;
            }
        }
        objPrevious = null;
        return (kw7) objPrevious;
    }

    public static void H(int i, int i2, List list) {
        Object obj = list.get(i);
        list.remove(i);
        list.add(i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0257 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x000e, B:6:0x0016, B:160:0x0257, B:161:0x0262, B:163:0x0268, B:167:0x0284, B:168:0x0288, B:144:0x0214, B:145:0x021d, B:147:0x0223, B:151:0x023f, B:152:0x0243, B:156:0x024e, B:157:0x0253, B:158:0x0254, B:12:0x0021, B:13:0x002a, B:15:0x0030, B:19:0x004c, B:20:0x0050, B:23:0x005a, B:24:0x005f, B:27:0x0064, B:164:0x0270, B:16:0x0038, B:31:0x006b, B:128:0x01cd, B:129:0x01d6, B:131:0x01dc, B:135:0x01f8, B:136:0x01fc, B:140:0x0207, B:141:0x020c, B:142:0x020d, B:35:0x0072, B:36:0x007b, B:38:0x0081, B:42:0x009d, B:43:0x00a1, B:46:0x00ab, B:47:0x00b0, B:50:0x00b5, B:148:0x022b, B:8:0x0019), top: B:186:0x000e, inners: #1, #5, #7, #8, #14, #16 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0268 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x000e, B:6:0x0016, B:160:0x0257, B:161:0x0262, B:163:0x0268, B:167:0x0284, B:168:0x0288, B:144:0x0214, B:145:0x021d, B:147:0x0223, B:151:0x023f, B:152:0x0243, B:156:0x024e, B:157:0x0253, B:158:0x0254, B:12:0x0021, B:13:0x002a, B:15:0x0030, B:19:0x004c, B:20:0x0050, B:23:0x005a, B:24:0x005f, B:27:0x0064, B:164:0x0270, B:16:0x0038, B:31:0x006b, B:128:0x01cd, B:129:0x01d6, B:131:0x01dc, B:135:0x01f8, B:136:0x01fc, B:140:0x0207, B:141:0x020c, B:142:0x020d, B:35:0x0072, B:36:0x007b, B:38:0x0081, B:42:0x009d, B:43:0x00a1, B:46:0x00ab, B:47:0x00b0, B:50:0x00b5, B:148:0x022b, B:8:0x0019), top: B:186:0x000e, inners: #1, #5, #7, #8, #14, #16 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0288 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x000e, B:6:0x0016, B:160:0x0257, B:161:0x0262, B:163:0x0268, B:167:0x0284, B:168:0x0288, B:144:0x0214, B:145:0x021d, B:147:0x0223, B:151:0x023f, B:152:0x0243, B:156:0x024e, B:157:0x0253, B:158:0x0254, B:12:0x0021, B:13:0x002a, B:15:0x0030, B:19:0x004c, B:20:0x0050, B:23:0x005a, B:24:0x005f, B:27:0x0064, B:164:0x0270, B:16:0x0038, B:31:0x006b, B:128:0x01cd, B:129:0x01d6, B:131:0x01dc, B:135:0x01f8, B:136:0x01fc, B:140:0x0207, B:141:0x020c, B:142:0x020d, B:35:0x0072, B:36:0x007b, B:38:0x0081, B:42:0x009d, B:43:0x00a1, B:46:0x00ab, B:47:0x00b0, B:50:0x00b5, B:148:0x022b, B:8:0x0019), top: B:186:0x000e, inners: #1, #5, #7, #8, #14, #16 }] */
    public static rfd I(fka fkaVar) {
        int iU;
        InvalidParsePresenceException invalidParsePresenceException;
        Iterator it;
        String strX;
        byte bN;
        Object next;
        int i = 1;
        try {
            if (!fkaVar.l()) {
                return null;
            }
            agd agdVar = agd.OFFLINE;
            byte b2 = 0;
            try {
                iU = ch3.U(fkaVar);
            } catch (Throwable th) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th);
                        accountInitializer.d().i().g().a(null, th);
                    } catch (Throwable th2) {
                        gm0.V("Payload", "failed to collect exception", th2);
                    }
                }
                int iD = qt4.D(pye.a);
                if (iD != 0) {
                    if (iD != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th;
                }
                iU = 0;
            }
            int i2 = 0;
            int iR = -1;
            while (i2 < iU) {
                try {
                    strX = ch3.X(fkaVar, null);
                } catch (Throwable th3) {
                    gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it3 = fjf.a.iterator();
                    while (it3.hasNext()) {
                        AccountInitializer accountInitializer2 = ((n6) it3.next()).a;
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
                        if (strX.equals("status")) {
                            try {
                                bN = ch3.N(fkaVar);
                            } catch (Throwable th5) {
                                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it4 = fjf.a.iterator();
                                while (it4.hasNext()) {
                                    AccountInitializer accountInitializer3 = ((n6) it4.next()).a;
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
                                bN = b2;
                            }
                            y1 y1Var = new y1(b2, agd.g);
                            do {
                                if (!y1Var.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = y1Var.next();
                            } while (((agd) next).a != bN);
                            agd agdVar2 = (agd) next;
                            if (agdVar2 != null) {
                                agdVar = agdVar2;
                            }
                        } else if (strX.equals("seen")) {
                            try {
                                iR = ch3.R(fkaVar, -1);
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
                                iR = -1;
                            }
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
                                if (iD7 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th13;
                            }
                            if (iR == -1) {
                                return new rfd(iR, agdVar);
                            }
                            invalidParsePresenceException = new InvalidParsePresenceException();
                            it = fjf.a.iterator();
                            while (it.hasNext()) {
                                AccountInitializer accountInitializer8 = ((n6) it.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", invalidParsePresenceException);
                                    accountInitializer8.d().i().g().a(null, invalidParsePresenceException);
                                } catch (Throwable th15) {
                                    gm0.V("Payload", "failed to collect exception", th15);
                                }
                            }
                            return null;
                        }
                    }
                }
                i2++;
                i = 1;
                b2 = 0;
            }
            if (iR == -1) {
                return new rfd(iR, agdVar);
            }
            invalidParsePresenceException = new InvalidParsePresenceException();
            it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer9 = ((n6) it.next()).a;
                gm0.V("Payload", "error while parse payload", invalidParsePresenceException);
                accountInitializer9.d().i().g().a(null, invalidParsePresenceException);
            }
            return null;
        } catch (Throwable th16) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th16);
            Iterator it9 = fjf.a.iterator();
            while (it9.hasNext()) {
                AccountInitializer accountInitializer10 = ((n6) it9.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th16);
                    accountInitializer10.d().i().g().a(null, th16);
                } catch (Throwable th17) {
                    gm0.V("Payload", "failed to collect exception", th17);
                }
            }
            int iD8 = qt4.D(pye.a);
            if (iD8 == 0) {
                return null;
            }
            if (iD8 == 1) {
                throw th16;
            }
            ore.o();
            return null;
        }
    }

    public static void K(List list) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        list.clear();
        list.addAll(linkedHashSet);
    }

    public static final pxh L(String str) {
        Set setM = m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (gof) setM) {
            if (((pxh) obj).c().equals(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            ore.c(qv1.l("More then one manifest found for ", str, ": ", ww3.z1(arrayList, null, null, null, rl0.n, 31)));
            return null;
        }
        if (arrayList.size() == 1) {
            return (pxh) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            pxh pxhVar = (pxh) Class.forName(str2).newInstance();
            if (pxhVar.c().equals(str)) {
                return pxhVar;
            }
            throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }

    public static final xme M(af7 af7Var) {
        xme xmeVar = new xme();
        xmeVar.a = af7Var;
        xmeVar.b = khb.k;
        return xmeVar;
    }

    public static final b9b N(Object obj, Object obj2, Object obj3, Object obj4) {
        b9b b9bVar = new b9b(2);
        b9bVar.k(obj, obj2);
        b9bVar.k(obj3, obj4);
        return b9bVar;
    }

    public static final b9b O(Object obj, String str) {
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k(str, obj);
        return b9bVar;
    }

    public static void P(View view, jo9 jo9Var) {
        s36 s36Var = jo9Var.a.b;
        if (s36Var == null || !s36Var.a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = i7j.a;
            fE += y6j.e((View) parent);
        }
        io9 io9Var = jo9Var.a;
        if (io9Var.l != fE) {
            io9Var.l = fE;
            jo9Var.m();
        }
    }

    public static void Q(View view, TextPaint textPaint, noh nohVar) {
        nohVar.a(view.getContext(), textPaint, view.getResources().getDisplayMetrics(), bx5.b);
    }

    public static ArrayList R(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0 && arrayList.size() <= 1000) {
            arrayList2.add(arrayList);
            return arrayList2;
        }
        while (arrayList.size() != 0) {
            List listSubList = arrayList.subList(0, arrayList.size() <= 1000 ? arrayList.size() : 1000);
            ArrayList arrayList3 = new ArrayList(listSubList.size());
            arrayList3.addAll(listSubList);
            listSubList.clear();
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }

    public static final void S(gdi gdiVar) {
        gdiVar.d(967, new jld(9));
        gdiVar.d(957, new l65(3));
        gdiVar.d(968, new qqg(21));
        gdiVar.d(963, new qqg(23));
        gdiVar.d(965, new g(3));
        gdiVar.b(3, new bwf(14));
        gdiVar.d(962, new qqg(0));
        gdiVar.d(969, new bwf(15));
        gdiVar.d(958, new bwf(16));
        gdiVar.d(970, new bwf(17));
        gdiVar.d(971, new bwf(18));
        gdiVar.d(262, new bwf(19));
        gdiVar.d(959, new bwf(20));
        gdiVar.d(972, new bwf(21));
        gdiVar.d(960, new bwf(22));
        gdiVar.d(288, new bwf(23));
    }

    public static Context T(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof hq4) && ((hq4) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        hq4 hq4Var = new hq4(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            hq4Var.getTheme().applyStyle(resourceId2, true);
        }
        return hq4Var;
    }

    public static int U(Intent intent, int i) {
        String str;
        return (Build.VERSION.SDK_INT < 34 || !(((str = intent.getPackage()) == null || str.length() == 0 || intent.getComponent() == null) && ((33554432 & i) != 0))) ? i : 16777216 | i;
    }

    public static Object V(qf7 qf7Var, Object obj, lq4 lq4Var) {
        vt4 context = lq4Var.getContext();
        Object xk8Var = context == k66.a ? new xk8(lq4Var) : new yk8(lq4Var, context);
        e9i.l(2, qf7Var);
        return qf7Var.invoke(obj, xk8Var);
    }

    public static final mjg a(Object obj) {
        if (obj == null) {
            obj = vd7.e;
        }
        return new mjg(obj);
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void c(yx6 yx6Var, Object obj, Object obj2, nq4 nq4Var) {
        pz6 pz6Var;
        if (nq4Var instanceof pz6) {
            pz6Var = (pz6) nq4Var;
            int i = pz6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pz6Var.f = i - Integer.MIN_VALUE;
            } else {
                pz6Var = new pz6(nq4Var);
            }
        } else {
            pz6Var = new pz6(nq4Var);
        }
        Object obj3 = pz6Var.e;
        int i2 = pz6Var.f;
        if (i2 == 0) {
            ch3.d0(obj3);
            pz6Var.d = obj2;
            pz6Var.f = 1;
            if (yx6Var.emit(obj, pz6Var) == hu4.a) {
                return;
            }
        } else if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return;
        } else {
            obj2 = pz6Var.d;
            ch3.d0(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    public static hve d(ar arVar, tp2 tp2Var, Bundle bundle) {
        wk8.k();
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImplA = b19.a(arVar, true);
        if (androidXLifecycleHandlerImplA == null) {
            androidXLifecycleHandlerImplA = new AndroidXLifecycleHandlerImpl();
            hb7 hb7VarP = arVar.p();
            hb7VarP.getClass();
            tl0 tl0Var = new tl0(hb7VarP);
            tl0Var.e(0, androidXLifecycleHandlerImplA, "LifecycleHandler");
            tl0Var.d(false);
        }
        androidXLifecycleHandlerImplA.R(arVar);
        p9 p9VarM = yab.M(androidXLifecycleHandlerImplA, tp2Var, bundle, androidXLifecycleHandlerImplA);
        p9VarM.K();
        p9VarM.e = 1;
        return p9VarM;
    }

    public static gof e(gof gofVar) {
        ul9 ul9Var = gofVar.a;
        ul9Var.b();
        return ul9Var.i > 0 ? gofVar : gof.b;
    }

    public static final void f(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    nbh.F(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    gm0.b(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    ore.a();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean g(byte[] bArr, String str) {
        int iNextInt;
        if (bArr.length == str.length()) {
            Iterable hj8Var = new hj8(0, bArr.length - 1, 1);
            if (!(hj8Var instanceof Collection) || !((Collection) hj8Var).isEmpty()) {
                Iterator it = hj8Var.iterator();
                do {
                    gj8 gj8Var = (gj8) it;
                    if (gj8Var.c) {
                        iNextInt = gj8Var.nextInt();
                    }
                } while (((byte) str.charAt(iNextInt)) == bArr[iNextInt]);
            }
            return true;
        }
        return false;
    }

    public static ArrayList h(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static long[] i(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    public static yab j(int i) {
        if (i != 0 && i == 1) {
            return new zz4();
        }
        return new ave();
    }

    public static List l(Iterable iterable, fdd fddVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            try {
                if (fddVar.test(obj)) {
                    arrayList.add(obj);
                }
            } catch (Throwable th) {
                qr7.o(th);
                return null;
            }
        }
        return arrayList;
    }

    public static final Set m() {
        gof gofVar = h;
        if (gofVar != null) {
            return gofVar;
        }
        gof gofVar2 = new gof();
        try {
            Iterator it = Arrays.asList(new gxh(), new hxh(), new fxh(), new exh()).iterator();
            while (it.hasNext()) {
                gofVar2.add(it.next());
            }
            h = gofVar2;
            return e(gofVar2);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final kw7 n(List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!(((kw7) next) instanceof jw7)) {
                return (kw7) next;
            }
        }
        next = null;
        return (kw7) next;
    }

    public static long o(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        long j = z11 ? 1L : 0L;
        if (z) {
            j |= 2;
        }
        if (z2) {
            j |= 4;
        }
        if (z3) {
            j |= 8;
        }
        if (z4) {
            j |= 16;
        }
        if (z5) {
            j |= 32;
        }
        if (z6) {
            j |= 64;
        }
        if (z7) {
            j |= 128;
        }
        if (z8) {
            j |= 256;
        }
        if (z9) {
            j |= 512;
        }
        if (z10) {
            j |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        if (z12) {
            j |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        if (z13) {
            j |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        if (z14) {
            j |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        if (z15) {
            j |= PlaybackStateCompat.ACTION_PREPARE;
        }
        if (z16) {
            j |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        return z17 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH | j : j;
    }

    public static final PendingIntent p(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, U(intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728));
    }

    public static synchronized AudioManager q(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                r94 r94Var = new r94();
                gm0.t().execute(new o90(applicationContext, 0, r94Var));
                r94Var.b();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static HashMap r() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListR = qv1.r(36, map, qv1.r(34, map, qv1.r(33, map, qv1.r(32, map, qv1.r(31, map, qv1.r(30, map, qv1.r(27, map, qv1.r(20, map, qv1.r(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListR.add("VA");
        map.put(39, arrayListR);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListR2 = qv1.r(43, map, qv1.r(41, map, qv1.r(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListR2.add("GG");
        arrayListR2.add("IM");
        arrayListR2.add("JE");
        map.put(44, arrayListR2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListR3 = qv1.r(46, map, qv1.r(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListR3.add("SJ");
        map.put(47, arrayListR3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListR4 = qv1.r(60, map, qv1.r(58, map, qv1.r(57, map, qv1.r(56, map, qv1.r(55, map, qv1.r(54, map, qv1.r(53, map, qv1.r(52, map, qv1.r(51, map, qv1.r(49, map, qv1.r(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListR4.add("CC");
        arrayListR4.add("CX");
        map.put(61, arrayListR4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListR5 = qv1.r(211, map, qv1.r(98, map, qv1.r(95, map, qv1.r(94, map, qv1.r(93, map, qv1.r(92, map, qv1.r(91, map, qv1.r(90, map, qv1.r(86, map, qv1.r(84, map, qv1.r(82, map, qv1.r(81, map, qv1.r(66, map, qv1.r(65, map, qv1.r(64, map, qv1.r(63, map, qv1.r(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListR5.add("EH");
        map.put(212, arrayListR5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListR6 = qv1.r(261, map, qv1.r(260, map, qv1.r(258, map, qv1.r(257, map, qv1.r(np0.n, map, qv1.r(255, map, qv1.r(254, map, qv1.r(253, map, qv1.r(252, map, qv1.r(251, map, qv1.r(250, map, qv1.r(249, map, qv1.r(248, map, qv1.r(247, map, qv1.r(246, map, qv1.r(245, map, qv1.r(244, map, qv1.r(243, map, qv1.r(242, map, qv1.r(241, map, qv1.r(240, map, qv1.r(239, map, qv1.r(238, map, qv1.r(237, map, qv1.r(236, map, qv1.r(235, map, qv1.r(234, map, qv1.r(233, map, qv1.r(232, map, qv1.r(231, map, qv1.r(230, map, qv1.r(229, map, qv1.r(228, map, qv1.r(227, map, qv1.r(226, map, qv1.r(225, map, qv1.r(224, map, qv1.r(223, map, qv1.r(222, map, qv1.r(221, map, qv1.r(220, map, qv1.r(218, map, qv1.r(216, map, qv1.r(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListR6.add("YT");
        map.put(262, arrayListR6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListR7 = qv1.r(269, map, qv1.r(268, map, qv1.r(267, map, qv1.r(266, map, qv1.r(265, map, qv1.r(264, map, qv1.r(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListR7.add("TA");
        map.put(290, arrayListR7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListR8 = qv1.r(357, map, qv1.r(356, map, qv1.r(355, map, qv1.r(354, map, qv1.r(353, map, qv1.r(352, map, qv1.r(351, map, qv1.r(350, map, qv1.r(299, map, qv1.r(298, map, qv1.r(297, map, qv1.r(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListR8.add("AX");
        map.put(358, arrayListR8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListR9 = qv1.r(509, map, qv1.r(508, map, qv1.r(HttpStatus.SC_INSUFFICIENT_STORAGE, map, qv1.r(506, map, qv1.r(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, map, qv1.r(HttpStatus.SC_GATEWAY_TIMEOUT, map, qv1.r(HttpStatus.SC_SERVICE_UNAVAILABLE, map, qv1.r(HttpStatus.SC_BAD_GATEWAY, map, qv1.r(HttpStatus.SC_NOT_IMPLEMENTED, map, qv1.r(500, map, qv1.r(HttpStatus.SC_LOCKED, map, qv1.r(421, map, qv1.r(HttpStatus.SC_METHOD_FAILURE, map, qv1.r(389, map, qv1.r(387, map, qv1.r(386, map, qv1.r(385, map, qv1.r(383, map, qv1.r(382, map, qv1.r(381, map, qv1.r(380, map, qv1.r(378, map, qv1.r(377, map, qv1.r(376, map, qv1.r(375, map, qv1.r(374, map, qv1.r(373, map, qv1.r(372, map, qv1.r(371, map, qv1.r(370, map, qv1.r(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListR9.add("BL");
        arrayListR9.add("MF");
        map.put(590, arrayListR9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListR10 = qv1.r(598, map, qv1.r(597, map, qv1.r(596, map, qv1.r(595, map, qv1.r(594, map, qv1.r(593, map, qv1.r(592, map, qv1.r(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListR10.add("BQ");
        map.put(599, arrayListR10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, qv1.r(996, map, qv1.r(995, map, qv1.r(994, map, qv1.r(993, map, qv1.r(992, map, qv1.r(979, map, qv1.r(977, map, qv1.r(976, map, qv1.r(975, map, qv1.r(974, map, qv1.r(973, map, qv1.r(972, map, qv1.r(971, map, qv1.r(970, map, qv1.r(968, map, qv1.r(967, map, qv1.r(966, map, qv1.r(965, map, qv1.r(964, map, qv1.r(963, map, qv1.r(962, map, qv1.r(961, map, qv1.r(960, map, qv1.r(888, map, qv1.r(886, map, qv1.r(883, map, qv1.r(882, map, qv1.r(881, map, qv1.r(880, map, qv1.r(878, map, qv1.r(870, map, qv1.r(856, map, qv1.r(855, map, qv1.r(853, map, qv1.r(852, map, qv1.r(850, map, qv1.r(808, map, qv1.r(UploadConfig.DEFAULT_MAX_EVENT_COUNT, map, qv1.r(692, map, qv1.r(691, map, qv1.r(690, map, qv1.r(689, map, qv1.r(688, map, qv1.r(687, map, qv1.r(686, map, qv1.r(685, map, qv1.r(683, map, qv1.r(682, map, qv1.r(681, map, qv1.r(680, map, qv1.r(679, map, qv1.r(678, map, qv1.r(677, map, qv1.r(676, map, qv1.r(675, map, qv1.r(674, map, qv1.r(673, map, qv1.r(672, map, qv1.r(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static void s(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static Intent t(ar arVar) {
        Intent parentActivityIntent = arVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strV = v(arVar, arVar.getComponentName());
            if (strV == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(arVar, strV);
            try {
                return v(arVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strV + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent u(ar arVar, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strV = v(arVar, componentName);
        if (strV == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strV);
        return v(arVar, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String v(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final Size w(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        return i2 > i ? new Size(i, i2) : new Size(i2, i);
    }

    public static final ArrayList x(v71 v71Var) {
        String strEncodeToString;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (v71Var.c()) {
                strEncodeToString = v71Var.a();
            } else {
                byte[] bytes = v71Var.a().getBytes(Charset.forName("UTF-8"));
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bytes, 0, bytes.length);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException e2) {
                    throw new RuntimeException(e2);
                }
            }
            arrayList.add(strEncodeToString);
            return arrayList;
        } catch (UnsupportedEncodingException e3) {
            qr7.o(e3);
            return null;
        }
    }

    public static ylc z(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & 255;
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read() & 255;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new ylc(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public abstract Object J(Intent intent, int i);

    public abstract Intent k(Object obj);

    public uik y(b bVar, Object obj) {
        return null;
    }
}
